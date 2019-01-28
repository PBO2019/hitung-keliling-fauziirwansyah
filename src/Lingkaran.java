public class Lingkaran {
    private double pi = 3.14;
    private int rad = 14;
    public double keliling;


    public void kelilinglingkaran(){
        this.keliling = 2*pi*rad;
    }

    public void setrad(int rad){
        this.rad = rad;
    }

    public double getKeliling(){
        return keliling;
    }



}
