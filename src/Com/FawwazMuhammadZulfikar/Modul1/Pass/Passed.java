package Com.FawwazMuhammadZulfikar.Modul1.Pass;

public class Passed {
    public static void main(String[] args) {
        int nomer1, nomer2;
        TestPass pass = new TestPass(50,100); //
        nomer1 = 10;
        nomer2 = 20;
        //passed by value
        System.out.println("Nilai Sebelum passed by value\t: ");
        System.out.println("Nomer1 = " +nomer1);
        System.out.println("Nomer2 = " +nomer2);

        pass.calculate(nomer1, nomer2);
        System.out.println("Nilai Sesudah passed by value\t: ");
        System.out.println("Nomer1 = " +nomer1);
        System.out.println("Nomer2 = " +nomer2);

        //
        System.out.println("Nilai sebelum passed by reference\t: ");
        System.out.println("Nomer1 = " +pass.nomer1);
        System.out.println("Nomer2 = " +pass.nomer2);

        pass.calculate(pass);
        System.out.println("Nilai Sesudah passed by reference \t: ");
        System.out.println("Nomer1 = " +pass.nomer1);
        System.out.println("Nomer2 = " +pass.nomer2);

    }
}
