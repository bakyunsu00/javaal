import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Gugan {




    public static void main(String[] args) throws IOException {

        List<String> strs = new ArrayList<>();
        Deque<String> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        int count = 0;


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num =  Integer.parseInt(br.readLine());

        for(int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                strs.add(st.nextToken());
            }
        }

        //[push,3,push,4,pop,back]
        for(String str : strs){
            switch(str){
                case "push":
                    count = 1;
                    break;
                case "pop":
                    if(deque.isEmpty()){
                        sb.append(-1).append("\n");
                        break;
                    }
                    else{
                        sb.append(deque.pollFirst()).append("\n");
                        break;
                    }
                case "size":
                    if(!deque.isEmpty()) {
                        sb.append(deque.size()).append("\n");
                        break;
                    }else{
                        sb.append(0).append("\n");
                        break;

                    }
                case "empty":
                    if(deque.isEmpty()){
                        sb.append(1).append("\n");
                        break;
                    }else{
                        sb.append(0).append("\n");
                        break;
                    }
                case "front":
                    if(deque.isEmpty()){
                        sb.append("-1").append("\n");
                        break;
                    }else{
                        sb.append(deque.getFirst()).append("\n");
                        break;
                    }

                case "back":
                    if(deque.isEmpty()){
                        sb.append("-1").append("\n");
                        break;
                    }else{
                        sb.append(deque.getLast()).append("\n");
                        break;
                    }
                default:
                    if (count == 1) {
                        deque.addLast(str);
                        count = 0;
                        break;
                    }





            }
        }


        System.out.println(sb);
    }




}
