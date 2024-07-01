import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bulan, tahun,hari;
        System.out.print("Masukkan bulan: ");
        bulan = input.nextInt();
        System.out.print("Masukkan tahun: ");
        tahun = input.nextInt();
        switch (bulan) {
            case 2:
                if ((tahun % 4 == 0) && !(tahun % 100 == 0 ))
                    System.out.println("Jumlah hari pada bulan " + bulan + " dan tahun " + tahun + " adalah 29");
                else
                    System.out.println("Jumlah hari pada bulan " + bulan + " dan tahun " + tahun + " adalah 28");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Jumlah hari pada bulan " + bulan + " dan tahun " + tahun + " adalah 31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Jumlah hari pada bulan " + bulan + " dan tahun " + tahun + " adalah 30");
                break;
            default:
                System.out.println("Salah masukkan bulan");
        }
    }
}