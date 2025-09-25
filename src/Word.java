import java.io.InputStreamReader;
import java.util.*;



public class Word {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = (sc.nextLine()).toUpperCase();

        int [] count = new int[26];
        int maxInt = 0;
        int maxIdx = -1;
        boolean tie = false;

        for(Character c : inputStr.toCharArray()){
            count[c - 'A']++;
        }

        for(int i = 0; i < count.length; i++){
            if(count[i] > maxInt){
                maxInt = count[i];
                maxIdx = i;
                tie = false;
            }else if(count[i] == maxInt){
                tie = true;
            }

        }

        if(!tie){
            System.out.println((char)('A'+maxIdx));
        }else{
            System.out.println('?');
        }







    }







}
