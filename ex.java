package challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//saber qual nome com maior numero de caracteres
public class ex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        List<String> names = new ArrayList<>();

        for(int i = 0; i <= number;i++){
            String name = sc.nextLine();
            names.add(name);
        }

        int count = 1;
        
        
        String element = names.get(1);
        int HighestNumberOfCharacters = 0;

       

        for(String name: names){

            HighestNumberOfCharacters = element.length();
            

           
            if(HighestNumberOfCharacters < name.length()){
                HighestNumberOfCharacters = name.length();
            }
                
            
        
        count++;
        }

        System.out.println(HighestNumberOfCharacters);

        sc.close();

        
    }
    
}
