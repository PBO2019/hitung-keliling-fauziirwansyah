public class Main {

    public static void main(String[] args) {
        Lingkaran bulat = new Lingkaran();
        bujursangkar persegi = new bujursangkar();

        bulat.setrad(100);
        bulat.kelilinglingkaran();
        System.out.println("keliling lingkaran adalah = " +bulat.getKeliling());

        persegi.setsisi(200);
        persegi.kelilingbujursangkar();
        System.out.println("keliling persegi adalah = " +persegi.getKeliling());

    }


}
