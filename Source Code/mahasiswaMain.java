import java.util.Scanner;

public class mahasiswaMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jm = sc.nextInt();
        mahasiswa[] msArray = new mahasiswa[jm];
        System.out.println();
        for(int i = 0; i < jm; i++){
            msArray[i] = new mahasiswa();
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("Masukkan nama : ");
            msArray[i].nama = sc.next();
            System.out.print("Masukkan nim : ");
            msArray[i].nim = sc.next();
            System.out.print("Masukkan jenis kelamin : ");
            msArray[i].jKelamin = sc.next();
            System.out.print("Masukkan IPK : ");
            msArray[i].ipk = sc.nextDouble();
            System.out.println();
        }
        System.out.println();
        for(int i = 0; i < jm; i++){
            System.out.println("Data Mahasiswa ke-" + (i+1));
            System.out.println("Nama : "+msArray[i].nama);
            System.out.println("NIM : "+msArray[i].nim);
            System.out.println("Jenis Kelamin : "+msArray[i].jKelamin);
            System.out.println("Nilai IPK : "+msArray[i].ipk);
        }
    }
}
