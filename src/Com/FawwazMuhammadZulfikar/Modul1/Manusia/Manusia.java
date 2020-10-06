package Com.FawwazMuhammadZulfikar.Modul1.Manusia;

public class Manusia {
    private String nama;
    private int umur;

    //contructor Pertama
    public Manusia (){}

    //Constuctor kedua
    public Manusia(String nama) {
        this.nama = nama;
    }

    //Constructor Ketiga
    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    //Getter & Setter

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
