import java.util.Scanner;
public class Main{


    /**
     * @param args
     */
    public static void main(String[] args){

        

        Scanner input_user = new Scanner(System.in);
      
        int nilai_siswa;
        



        System.out.println("Masukan Nilai Siswa");
        nilai_siswa = input_user.nextInt();
        if (nilai_siswa >= 90 && nilai_siswa <= 100){
            System.out.println("A");
            
        
        } 
          
        nilai_siswa = input_user.nextInt();
        if(nilai_siswa >= 80 && nilai_siswa <=90){
        System.out.println("B");
        
       
        
        }
        nilai_siswa = input_user.nextInt();
        if(nilai_siswa >= 75 && nilai_siswa <= 80){
        System.out.println("C");
        
        }
        
        nilai_siswa = input_user.nextInt();
        if(nilai_siswa < 75){
            System.out.println("D");
           
        }
        else{
            System.out.println("Nilai Tidak Valid");
        }
        

            
         
           
        
        
        

    
  
            


        } 
    }





       

        
        
        






    

   
    





