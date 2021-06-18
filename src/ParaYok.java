public class ParaYok implements OtomatSiparisDurum {
    OtomatContext oc;

    public void paraAt() {
        System.out.println("Para atıldı.");
        oc.durumDegistir(new ParaAtildi());
    }

    @Override
    public void icecekVer() {
        System.out.println("Lütfen önce para atınız.");
    }

    @Override
    public void calis() {
        System.out.println("Lütfen önce para atınız.");
    }

    @Override
    public void paraIadeEt() {
        System.out.println("Henüz para atmadınız.");
    }
}
