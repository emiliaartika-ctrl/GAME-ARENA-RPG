public class Naga extends Musuh {

    public Naga() {
        super("Naga Hitam",500);
    }

    @Override
    public void serangPemain() {
        System.out.println(this.namaMusuh + " menyemburkan nafas api dari udara! Player -50 HP");
    }

        @Override
    public void suaraKhas() {
        System.out.println(this.namaMusuh + " ROAAAAAAARRRRRRRRR ");
    }
}
