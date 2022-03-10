public class ArrayBalokMain {
    public static void main(String[] args){
        ArrayBalok[] blArray = new ArrayBalok[3];

        blArray[0] = new ArrayBalok(100, 30, 12);
        blArray[1] = new ArrayBalok(120, 40, 15);
        blArray[2] = new ArrayBalok(210, 50, 25);
    
    for(int i = 0; i < 3; i++)
    {
        System.out.println("Volume balok ke " + (i+1) +": " + blArray[i].hitungVolume());
    }
}
}
