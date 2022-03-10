import java.util.Scanner;

public class bolaMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Masukkan banyak bola : ");
        int bl = sc.nextInt();
        int r2;
        bola[] blArray = new bola[bl];
        for (int i = 0; i < blArray.length; i++){
            System.out.println("Masukkan jari-jari " + (i+1) + ": ");
            r2 = sc.nextInt();
            blArray[i] = new bola(r2);
        }
        for(int i = 0; i < blArray.length; i++){
            System.out.println();
            System.out.println("Bola ke - " + (i+1));
            System.out.println("Jari-jari : " + blArray[i].jari);
            System.out.println("Volume ke-" + (i+1) + ": " + blArray[i].volume());
            System.out.println("Luas permukaan ke-" + (i+1) + ": " + blArray[i].luasPermukaan());
        }
    }
    
}
