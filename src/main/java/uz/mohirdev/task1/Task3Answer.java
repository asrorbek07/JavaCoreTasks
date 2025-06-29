package uz.mohirdev.task1;

public class Task3Answer {

    /**
     * MASSIVNI TESKARI TARTIBDA CHIQARISH
     *
     * Butun sonlardan iborat massiv berilgan. Siz ushbu massivni teskari tartibda qaytarishingiz kerak.
     * Masalan: [1, 2, 3, 4, 5] -> [5, 4, 3, 2, 1]
     * 
     * Shartlar:
     * - Yangi massiv yaratib, unga teskari tartibda elementlarni joylashtiring.
     * - Agar massiv bo'sh bo'lsa, bo'sh massiv qaytarilsin.
     * 
     * @param array Teskari qilinadigan massiv
     * @return Teskari tartibdagi yangi massiv
     */
    public static int[] reverseArray(int[] array) {
        if (array == null || array.length == 0) {
            return new int[0];
        }
        
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        
        return reversed;
    }

    /**
     * MASSIVDAGI ENG KATTA ELEMENTNI TOPISH
     *
     * Butun sonlardan iborat massiv berilgan. Siz ushbu massivdagi eng katta elementni topishingiz kerak.
     * 
     * Shartlar:
     * - Massiv bo'sh bo'lmasligi kafolatlanadi.
     * - Massivda kamida bitta element bor.
     * 
     * @param array Tekshiriladigan massiv
     * @return Massivdagi eng katta element
     */
    public static int findMax(int[] array) {
        int max = array[0];
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        
        return max;
    }

    /**
     * MASSIVDAGI JUFT SONLAR SONI
     *
     * Butun sonlardan iborat massiv berilgan. Siz ushbu massivdagi juft sonlar sonini qaytarishingiz kerak.
     * 
     * Shartlar:
     * - Massiv bo'sh bo'lishi mumkin.
     * - Juft son deb 2 ga qoldiqsiz bo'linadigan sonlarga aytiladi.
     * 
     * @param array Tekshiriladigan massiv
     * @return Juft sonlar soni
     */
    public static int countEvenNumbers(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }
        
        return count;
    }

    /**
     * MASSIVLARNI BIRLASHTIRISH
     *
     * Ikkita butun sonlardan iborat massiv berilgan. Siz ushbu massivlarni birlashtirib, 
     * yangi massiv qaytarishingiz kerak.
     * Masalan: [1, 2, 3] va [4, 5] -> [1, 2, 3, 4, 5]
     * 
     * Shartlar:
     * - Massivlar bo'sh bo'lishi mumkin.
     * - Natija massivida avval birinchi massiv elementlari, keyin ikkinchi massiv elementlari bo'lishi kerak.
     * 
     * @param array1 Birinchi massiv
     * @param array2 Ikkinchi massiv
     * @return Birlashtirilgan massiv
     */
    public static int[] mergeArrays(int[] array1, int[] array2) {
        if (array1 == null && array2 == null) {
            return new int[0];
        }
        
        if (array1 == null) {
            return array2.clone();
        }
        
        if (array2 == null) {
            return array1.clone();
        }
        
        int[] merged = new int[array1.length + array2.length];
        
        for (int i = 0; i < array1.length; i++) {
            merged[i] = array1[i];
        }
        
        for (int i = 0; i < array2.length; i++) {
            merged[array1.length + i] = array2[i];
        }
        
        return merged;
    }

    /**
     * MASSIVNI SARALASH
     *
     * Butun sonlardan iborat massiv berilgan. Siz ushbu massivni o'sish tartibida saralashingiz kerak.
     * Masalan: [5, 2, 8, 1, 3] -> [1, 2, 3, 5, 8]
     * 
     * Shartlar:
     * - Bubble sort algoritmidan foydalaning.
     * - Massiv bo'sh bo'lishi mumkin.
     * 
     * @param array Saralanishi kerak bo'lgan massiv
     * @return Saralangan massiv
     */
    public static int[] bubbleSort(int[] array) {
        if (array == null || array.length <= 1) {
            return array == null ? null : array.clone();
        }
        
        int[] sorted = array.clone();
        
        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = 0; j < sorted.length - i - 1; j++) {
                if (sorted[j] > sorted[j + 1]) {
                    // Swap elements
                    int temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
            }
        }
        
        return sorted;
    }

    /**
     * MASSIVDAGI ELEMENTLARNI YIGINDISI
     *
     * Butun sonlardan iborat massiv berilgan. Siz ushbu massivdagi barcha elementlar yig'indisini qaytarishingiz kerak.
     * 
     * Shartlar:
     * - Massiv bo'sh bo'lishi mumkin.
     * 
     * @param array Tekshiriladigan massiv
     * @return Elementlar yig'indisi
     */
    public static int sumArray(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        
        return sum;
    }

    /**
     * MASSIVDAGI ELEMENTLARNI O'RTACHA QIYMATI
     *
     * Butun sonlardan iborat massiv berilgan. Siz ushbu massivdagi elementlarning o'rtacha qiymatini qaytarishingiz kerak.
     * 
     * Shartlar:
     * - Massiv bo'sh bo'lmasligi kafolatlanadi.
     * - O'rtacha qiymat haqiqiy son (double) ko'rinishida qaytarilishi kerak.
     * 
     * @param array Tekshiriladigan massiv
     * @return Elementlarning o'rtacha qiymati
     */
    public static double averageArray(int[] array) {
        int sum = sumArray(array);
        return (double) sum / array.length;
    }
}