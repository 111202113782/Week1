public class VolumeTabung {
    public static void main(String[] args) {
        //Volume tabung dengan diketahui diameter = 5, tinggi = 10.

        System.out.println("Nama = Calvin Revianto");
        System.out.println("NIM = A11.2021.13782");
        System.out.println();

        System.out.println("Program Volume Tabung");
        System.out.println("=====================");
        System.out.println("Volume tabung dengan diketahui diameter = 5, tinggi = 10.");
             int d = 5;
             int t = 10;
             float phi = 3.14f;
             float VTabung;
       
        d = d / 2;
        VTabung = (phi * d * d * t);
       
        System.out.println("Volume Tabung adalah : " + VTabung);
    }
}
