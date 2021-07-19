package Array;
import java.util.Scanner;
	
class Luas{
    int luas ;
    public int getLuas(){
        return luas;
    }
    public void getLuas(int luas){
        this.luas = luas; 
    }
}
	
public class Array {  
    public static void main(String[] args) {
        System.out.println("PROGRAM MENAMPILKAN LUAS TANAH");
        System.out.println("----------------------------------------------- ");
                
        int lebar = 0, panjang = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah Tanah: ");
        int tanah = input.nextInt();
        System.out.println("");
                
        Luas [] luas = new Luas[tanah];
        
        for (int i = 0; i < tanah; i++) {
            int n = i+1 ;
            System.out.println("Tanah " + n);
            System.out.print("Lebar Tanah :");
            lebar = input.nextInt();
            System.out.print("Panjang Tanah :");
            panjang = input.nextInt();
            System.out.println("");
            
            luas[i] = new Luas() ;
            luas[i].getLuas(panjang*lebar);
        }
        
        for (int i = 0; i < tanah; i++) {
            int n = i+1 ;
            System.out.println("Luas Tanah " + n + " : " + luas[i].getLuas());
        }
    }
	    
	    
	    
}

