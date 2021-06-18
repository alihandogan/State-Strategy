public class IcecekSatildi implements OtomatSiparisDurum {
    OtomatContext oc;

    @Override
    public void paraAt() {

        System.out.println("Zaten para atıldı.");
    }

    @Override
    public void icecekVer() {

        System.out.println("Zaten içecek siparişi verildi.");
    }

    @Override
    public void calis() {
        oc.icecekSat();
        System.out.println("İçecek verildi.");

    }

    @Override
    public void paraIadeEt() {

        System.out.println("Paranız iade edildi.");
        oc.durumDegistir(new ParaYok());
    }
}
