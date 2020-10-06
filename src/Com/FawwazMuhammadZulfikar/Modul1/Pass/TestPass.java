package Com.FawwazMuhammadZulfikar.Modul1.Pass;

public class TestPass {
    int nomer1;
    int nomer2;

    //Contructor
    public TestPass(int nomer1, int nomer2){
        this.nomer1 = nomer1;
        this.nomer2 = nomer2;
    }

    public void calculate(int m, int n){
        n = m *10;
        n = n/2;
    }
    public void calculate(TestPass pass){
        pass.nomer1 = pass.nomer1*10;
        pass.nomer2 = pass.nomer2/2;
    }
}
