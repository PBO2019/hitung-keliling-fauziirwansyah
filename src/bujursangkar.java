public class bujursangkar {
        int sisi = 5;
        int keliling;

    public void keliling(){
        int keliling = 4* sisi;
        System.out.println ("keliling bujur sangkar adalah = "+keliling);
    }

    public static void main (String []args){
        bujursangkar bujurSangkar =  new bujursangkar();
        bujurSangkar.keliling();
    }
}
