import java.io.InputStreamReader;
import java.util.*;



public class Word {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();

        int [] count = new int[26];

        Arrays.fill(count,0);


        List<Character> resultStr = new ArrayList<>(Arrays.asList('A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'));




        for(char i: inputStr.toCharArray()){
            if (i == 'A'|| i == 'a'){count[0] += 1;}
            else if (i == 'B'|| i == 'b'){count[1] += 1;}
            else if (i == 'C'|| i == 'c'){count[2] += 1;}
            else if (i == 'D'|| i == 'd'){count[3] += 1;}
            else if (i == 'E'|| i == 'e'){count[4] += 1;}
            else if (i == 'F'|| i == 'f'){count[5] += 1;}
            else if (i == 'G'|| i == 'g'){count[6] += 1;}
            else if (i == 'H'|| i == 'h'){count[7] += 1;}
            else if (i == 'I'|| i == 'i'){count[8] += 1;}
            else if (i == 'J'|| i == 'j'){count[9] += 1;}
            else if (i == 'K'|| i == 'k'){count[10] += 1;}
            else if (i == 'L'|| i == 'l'){count[11] += 1;}
            else if (i == 'M'|| i == 'm'){count[12] += 1;}
            else if (i == 'N'|| i == 'n'){count[13] += 1;}
            else if (i == 'O'|| i == 'o'){count[14] += 1;}
            else if  (i == 'P'|| i == 'p'){count[15] += 1;}
            else if  (i == 'Q'|| i == 'q'){count[16] += 1;}
            else if  (i == 'R'|| i == 'r'){count[17] += 1;}
            else if  (i == 'S'|| i == 's'){count[18] += 1;}
            else if (i == 'T'|| i == 't'){count[19] += 1;}
            else if (i == 'U'|| i == 'u'){count[20] += 1;}
            else if (i == 'V'|| i == 'v'){count[21] += 1;}
            else if (i == 'W'|| i == 'w'){count[22] += 1;}
            else if (i == 'X'|| i == 'x'){count[23] += 1;}
            else if (i == 'Y'|| i == 'y'){count[24] += 1;}
            else if (i == 'Z'|| i == 'z'){count[25] += 1;}

        }


        Integer[] boxed  = Arrays.stream(count).boxed().toArray(Integer[]::new);
        Arrays.sort(boxed,Collections.reverseOrder());
        int[] tempCount = Arrays.stream(boxed).mapToInt(Integer::intValue).toArray();

        if((tempCount[0] == tempCount[1]) || tempCount[0] == 0){
            System.out.println("?");
        }
        else{
            int temp = 0;
            int i = 0;
            int tempI = 0;
            for(int num: count){

                if(num > temp){
                    temp = num;
                    tempI =  i;
                }
                i += 1;

            }
            System.out.println(resultStr.get(tempI));
        }



    }







}
