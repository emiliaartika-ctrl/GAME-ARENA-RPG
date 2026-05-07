public class Slime extends Musuh {

    public Slime(){
        super("Slime Asam",50); //memanggil constructor kelas induk abstrak
    }

    @Override // wajib ada untuk memaksa java untuk override
    public void serangPemain(){
        System.out.println(this.namaMusuh + " melompat dan menyiram cairan asam! Player -15 HP ");
    }

    @Override
    public void suaraKhas() {
        System.out.println(this.namaMusuh + " blub...blubb..blubb");
    }
}
