public class Lingkaran {
    public double pi = 3.14;
    public int rad = 14;
    double keliling;

    public void keliling(){
        keliling = 2*pi *rad ;

        System.out.println ("keliling lingkaran adalah " + keliling);
    }

    public static void main (String [] args){
        Lingkaran  lingkaran = new Lingkaran();
        lingkaran.keliling();
    }
}
