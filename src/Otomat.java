public class Otomat {
    public static void main(String[] args) {
        OtomatContext otomatSiparis = new OtomatContext();

        // calisma adimlari: para atilir, siparis verilir, calis tusuna basilir, islem biter

        otomatSiparis.paraAt();
        otomatSiparis.icecekVer();
        otomatSiparis.calis();
        otomatSiparis.icecekVer();

        otomatSiparis.paraAt();
        otomatSiparis.paraAt();
        otomatSiparis.paraAt();
        otomatSiparis.paraAt();
        otomatSiparis.icecekVer();
        otomatSiparis.icecekVer();
        otomatSiparis.icecekVer();
        otomatSiparis.icecekVer();
        otomatSiparis.paraAt();
        otomatSiparis.paraIadeEt();
        otomatSiparis.calis();


    }
}
