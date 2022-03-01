import java.util.Scanner;
public class ArrMethod {

    
    public static void main(String[] args) {
        
        int [] a = new int[3];
        aRead(a);
        
        System.out.println("The average is :" + average(a));
        System.out.println("The maximum is :" + max(a));
    }
    public static void aRead(int []arr){
        Scanner input = new Scanner(System.in);
        System.out.println("input 10 integres in the array :");
        for(int i=0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }
            
    }
    public static double average(int []arr){
        int sum =0;
        for(int i=0; i<arr.length; i++){
            sum +=arr[i];  
       }
        return sum/(double)arr.length;
        }
    
    public static int max(int [] arr){
        int max = 0;
        for(int i=0;i<arr.length;i++){
         
            if(arr[i]> max)
                max =arr[i];
        }
        return max;
    }
    
    }
    

   



