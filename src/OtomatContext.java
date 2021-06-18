public class OtomatContext {
    private static int icecekSayisi = 2;
    private static OtomatSiparisDurum suAnkiDurum;

    public OtomatContext() {
        if (icecekSayisi <= 0) {
            suAnkiDurum = new IcecekYok();
            System.out.println("İçecek yok. Lütfen arayınız 55555555555");
        } else {
            suAnkiDurum = new ParaYok();
            System.out.println("Toplam içecek sayısı = " + icecekSayisi);
        }
    }

    public void paraAt() {
        suAnkiDurum.paraAt();
    }

    public void paraIadeEt() {
        suAnkiDurum.paraIadeEt();
    }

    public void calis() {
        suAnkiDurum.calis();
    }

    public void icecekVer() {
        suAnkiDurum.icecekVer();
    }

    public static void durumDegistir(OtomatSiparisDurum durum) {
        suAnkiDurum = durum;
    }

    public static void icecekSat() {
        icecekSayisi--;
        if (icecekSayisi <= 0) {
            durumDegistir(new IcecekYok());
        } else {
            durumDegistir(new ParaYok());
        }
    }
}
