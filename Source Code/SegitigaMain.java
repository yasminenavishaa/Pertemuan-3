public class SegitigaMain {
    public static void main(String[] args) {
        Segitiga[] sgArray = new Segitiga[4];

        sgArray[0] = new Segitiga(10, 4);
        sgArray[1] = new Segitiga(20, 10);
        sgArray[2] = new Segitiga(15, 6);
        sgArray[3] = new Segitiga(25, 10);

        for(int i = 0;i < 4; i++){
            sgArray[i].cariSisi();
            System.out.println("Luas segitiga ke-"+(i+1)+" mempunyai luas : "+sgArray[i].hitungLuas()+", keliling : "+sgArray[i].hitungKeliling());
            System.out.println(" ");
        }
    }
}
