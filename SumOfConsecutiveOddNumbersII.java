package challenge;

import java.util.Scanner;

public class SumOfConsecutiveOddNumbersII {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer many = sc.nextInt();
        int[] vect = new int[many];

        int count = 0;
        for(int i = 0; i < many ; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

       


            int menor = Math.min(x,y);
            int maior = Math.max(x, y);
            

            int sum = 0;

            for(int j = menor +1; j < maior; j++){
                if(j % 2 != 0){
                    sum += j;
                }

            }
            vect[count] = sum;

            sum = 0;
            
            count++;
        }

        for (int i : vect) {
            System.out.println(i);
        }
        
        sc.close();
    }
    
}
