package Com.FawwazMuhammadZulfikar.Modul1;

//class main / Demo class
public class Objek {
    public Objek() {
    }

    @Override
    public String toString() {
        return "Objek{}";
    }

    public static void main(String[] args) {
        // Deklarasi object tanpa parameter
        Mahasiswa mahasiswaTanpa = new Mahasiswa();

        mahasiswaTanpa.setNama("Fawwaz");
        mahasiswaTanpa.setNim(19104058);

        System.out.println("Mahasiswa 1");
        System.out.println("Nama\t :" +mahasiswaTanpa.getNama());
        System.out.println("NIM\t : "+mahasiswaTanpa.getNim());


        Mahasiswa mahasiswa = new Mahasiswa("paimon",180101010);
        System.out.println("Mahasiswa 2");
        System.out.println("Nama\t :" +mahasiswa.getNama());
        System.out.println("NIM\t : "+mahasiswa.getNim());
    }


}