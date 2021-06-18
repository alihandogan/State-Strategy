public class ParaAtildi implements OtomatSiparisDurum {
    OtomatContext oc;

    @Override
    public void paraAt() {
        System.out.println("Zaten para atıldı.");
    }

    @Override
    public void icecekVer() {

        System.out.println("İçeceğiniz getiriliyor.");
        oc.durumDegistir(new IcecekSatildi());

    }

    @Override
    public void calis() {
        System.out.println("Lütfen içecek seçiniz.");
    }

    @Override
    public void paraIadeEt() {
        System.out.println("Paranız iade edildi.");
        oc.durumDegistir(new ParaYok());
    }
}
