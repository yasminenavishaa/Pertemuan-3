import java.util.Scanner;

public class tanahMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah tanah : ");
        int n = sc.nextInt();
        tanah[] tnArray = new tanah[n];
        System.out.println();
        for(int i = 0; i < n; i++){
            tnArray[i] = new tanah();
            System.out.println("Tanah : " + (i+1));
            System.out.print("Panjang : ");
            tnArray[i].panjang = sc.nextInt();
            System.out.print("Lebar : ");
            tnArray[i].lebar = sc.nextInt();
        }
        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.println("Luas Tanah " + (i+1) + ": " + tnArray[i].luasTanah());
        }
    }
}