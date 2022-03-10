public class kubusMain {
        public static void main(String[] args) {
            kubus[] kArray = new kubus[2];
    
            kArray[0] = new kubus(10);
            kArray[1] = new kubus(15);
    
            for(int i = 0;i < 2;i++){
                System.out.println("Kubus ke-"+(i+1)+" mempunyai volume : "+kArray[i].hitungVolume()+", dan luas permukaan : "+kArray[i].luasPermukaan());
                System.out.println(" ");
            }
        }
    }
    
