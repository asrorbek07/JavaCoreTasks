package uz.mohirdev.task1;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    /**
     * KO'PAYTIRISH JADVALI
     *
     * Foydalanuvchi sizga bitta musbat butun son kiritadi. Siz ushbu son asosida 1 dan 10 gacha bo'lgan 
     * ko'paytma natijalarini chiqaruvchi dastur yozishingiz kerak.
     * Har bir natija alohida qatorda quyidagicha ko'rsatilishi kerak:
     * [n] x 1 = ...
     * [n] x 2 = ...
     * ...
     * [n] x 10 = ...
     * 
     * Shartlar:
     * - Son manfiy yoki nol bo'lsa, foydalanuvchiga ogohlantirish xabari chiqishi lozim.
     * - Dastur faqat while, do-while, yoki for orqali yozilishi kerak.
     * - Har bir amal ketma-ket ekranga chiqarilishi kerak.
     * 
     * @param n Ko'paytirish uchun asos bo'lgan son
     * @return Ko'paytirish jadvali qatorlari ro'yxati
     */
    public static List<String> multiplicationTable(int n) {
        return new ArrayList<>();
    }

    /**
     * RAQAMNI TESKARI CHIQARISH
     *
     * Foydalanuvchi sizga bir butun son kiritadi. Siz bu sonni teskari tartibda chiqaring, 
     * ya'ni oxirgi raqamdan boshlab birinchi raqamgacha.
     * Masalan:
     * Kiritilgan son: 123 → Chiqarilishi kerak: 321
     * Kiritilgan son: 5600 → Chiqarilishi kerak: 65 (boshidagi 0 lar chiqarilmasin)
     * 
     * Shartlar:
     * - Kod while yoki do-while orqali yozilishi kerak.
     * - Son manfiy bo'lishi mumkin emas.
     * - Natija raqam sifatida chiqishi kerak, satr emas.
     * 
     * @param number Teskari qilinadigan son
     * @return Teskari tartibdagi son yoki xato xabari
     */
    public static int reverseNumber(int number) {
        return 0;
    }

    /**
     * JUFT YOKI TOQ SONNI ANIQLASH
     *
     * Foydalanuvchi bir butun son kiritadi. Siz bu sonning juft yoki toqligini aniqlashingiz kerak.
     * 
     * Shartlar:
     * - Dastur faqat if-else orqali yozilishi kerak.
     * - Juft son deb chiqarish uchun son 2 ga bo'linganda qoldiq 0 bo'lishi kerak.
     * - Natija "Juft son" yoki "Toq son" tarzida ekranga chiqishi lozim.
     * 
     * @param number Tekshiriladigan son
     * @return "Juft son" yoki "Toq son" matni
     */
    public static String evenOrOdd(int number) {
        return "";
    }

    /**
     * FIBONACCI KETMA-KETLIGINI CHIQARISH
     *
     * Foydalanuvchi sizga bir musbat butun son kiritadi. Siz undan oshmaydigan barcha 
     * Fibonacci sonlarini chiqarishingiz kerak.
     * Masalan, foydalanuvchi 13 kiritsa: 1 1 2 3 5 8 13
     * 
     * Shartlar:
     * - Faqat while yoki do-while ishlatilishi kerak.
     * - Natija bir qatorga chiqarilishi mumkin, yoki har biri alohida qatorda bo'lishi mumkin.
     * - Son 0 yoki manfiy bo'lsa, chiqarmasligi kerak.
     * 
     * @param limit Fibonacci ketma-ketligining yuqori chegarasi
     * @return Fibonacci sonlari ketma-ketligi
     */
    public static String fibonacci(int limit) {
        return "";
    }

    /**
     * BAHONI MATNGA O'GIRUVCHI DASTUR
     *
     * Foydalanuvchi 1 dan 5 gacha bo'lgan butun son kiritadi. Siz bu sonni quyidagicha matnga o'girish kerak:
     * 1 – Juda yomon
     * 2 – Yomon
     * 3 – Qoniqarli
     * 4 – Yaxshi
     * 5 – A'lo
     * 
     * Shartlar:
     * - Dastur switch operatori yordamida yozilishi kerak.
     * - 1 dan 5 gacha bo'lmagan qiymat kiritilsa, "Noto'g'ri baho" degan xabar chiqishi kerak.
     * 
     * @param grade Baho raqami (1-5)
     * @return Bahoning matnli ifodalanishi
     */
    public static String gradeToText(int grade) {
        return "";
    }

    /**
     * OYGA QARAB FASLNI ANIQLASH
     *
     * Foydalanuvchi sizga 1 dan 12 gacha bo'lgan oy raqamini kiritadi. Siz bu raqamga mos faslni aniqlashingiz kerak.
     * 1, 2, 12 – Qish
     * 3, 4, 5 – Bahor
     * 6, 7, 8 – Yoz
     * 9, 10, 11 – Kuz
     * 
     * Shartlar:
     * - Faqat switch-case orqali yozilishi kerak.
     * - 1 dan 12 tashqarisidagi son kiritsa, "Noto'g'ri oy raqami" degan xabar chiqishi kerak.
     * 
     * @param month Oy raqami (1-12)
     * @return Fasl nomi
     */
    public static String monthToSeason(int month) {
        return "";
    }

    /**
     * FOIZGA QARAB BAHOLASH
     *
     * Foydalanuvchi 0 dan 100 gacha bo'lgan son kiritadi. Siz ushbu natijaga ko'ra quyidagi bahoni aniqlang:
     * 0–49 – Imtihondan o'tmadi
     * 50–69 – Qoniqarli
     * 70–89 – Yaxshi
     * 90–100 – A'lo
     * 
     * Shartlar:
     * - if, else if, va else dan foydalanilishi kerak.
     * - 0 dan kichik yoki 100 dan katta sonlar uchun "Noto'g'ri foiz" chiqishi kerak.
     * 
     * @param percent Foiz qiymati (0-100)
     * @return Baho natijasi
     */
    public static String evaluateGrade(int percent) {
        return "";
    }

    /**
     * SONNING MUSBAT, MANFIY YOKI NOL EKANLIGINI ANIQLASH
     *
     * Foydalanuvchi sizga biror butun son kiritadi. Siz bu sonning musbatmi, manfiymi yoki nolga tengligini aniqlang.
     * 
     * Shartlar:
     * - if-else bloklaridan foydalaning.
     * - Ekranga quyidagilardan biri chiqishi kerak:
     *   "Musbat son"
     *   "Manfiy son"
     *   "Son nolga teng"
     * 
     * @param number Tekshiriladigan son
     * @return Sonning turi haqida xabar
     */
    public static String checkSign(int number) {
        return "";
    }
}
