package Com.FawwazMuhammadZulfikar.Modul1.Manusia;

public class DemoManusia {
    public static void main(String[] args) {
        //Array of object
        Manusia arrayMahasiswa[]= new Manusia[3];

        Manusia manusia1 = new Manusia();
        manusia1.setNama("riyatno");
        manusia1.setUmur(40);

        Manusia manusia2 = new Manusia("Paiman");

        Manusia manusia3 = new Manusia("yani",30);

        arrayMahasiswa[0] = manusia1;
        arrayMahasiswa[1] = manusia2;
        arrayMahasiswa[2] = manusia3;

        for(Manusia x : arrayMahasiswa){
            System.out.println("character");
            System.out.println("Nama\t: "+x.getNama());
            System.out.println("Umur\t: "+x.getUmur());
            System.out.println();
        }

    }
}
