import java.util.Scanner;

public class tabungMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Masukkan banyak tabung : ");
        int tb = sc.nextInt();
        int r, t;
        tabung[] tbArray = new tabung[tb];
        for (int i = 0; i < tbArray.length; i++){
            System.out.println("Masukkan jari-jari " + (i+1) + ": ");
            r = sc.nextInt();
            System.out.println("Masukkan tinggi " + (i+1) + ": ");
            t = sc.nextInt();
            tbArray[i] = new tabung(r, t);
        }
        for(int i = 0; i < tbArray.length; i++){
            System.out.println();
            System.out.println("Tabung ke - " + (i+1));
            System.out.println("Jari-jari : " + tbArray[i].jari);
            System.out.println("Tinggi : " + tbArray[i].tinggi);
            System.out.println("Volume ke-" + (i+1) + ": " + tbArray[i].volume());
            System.out.println("Luas permukaan ke-" + (i+1) + ": " + tbArray[i].luasPermukaan());
        }
    }
    
}
