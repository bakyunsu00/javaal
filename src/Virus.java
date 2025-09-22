import java.util.*;
import java.io.*;

public class Virus {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int resultCount = 0;
        int computers = Integer.parseInt(br.readLine());
        int edges = Integer.parseInt(br.readLine());
        boolean [] visited = new boolean[computers+1];
        Deque<Integer> deque = new ArrayDeque<>();

        List<List<Integer>> graph = new ArrayList<>();




        // 그래프 초기화
        for(int i=0; i<computers+1; i++){
            graph.add(new ArrayList<>());
        }

        // 그래프 생성
        for(int i = 0; i < edges; i++ ){
            int[] temp = new int[2];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int c = 0; c<2; c++) {
                temp[c] = Integer.parseInt(st.nextToken());
            }
            graph.get(temp[0]).add(temp[1]);
            graph.get(temp[1]).add(temp[0]);
        }
        //방문 배열 초기화
        Arrays.fill(visited,false);
        visited[1] = true;

        //큐에 담기
        for(int num: graph.get(1)){
            deque.add(num);
        }

        while(!deque.isEmpty()){
            int num =  deque.pollFirst();
            if(!visited[num]){
                visited[num] = true;
                resultCount += 1;
                for(int node:graph.get(num)){
                    if(!visited[node]){
                    deque.add(node);
                    }
                }
            }

        }

        System.out.println(resultCount);



    }





}
