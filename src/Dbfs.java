import java.util.*;
import java.io.*;



public class Dbfs {



    public static void main(String[] args) throws IOException{
        List<List<Integer>> graph = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int nodes = Integer.parseInt(st.nextToken());
        int edges = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        boolean[] visited = new boolean[nodes+1];
        Deque<Integer> deque = new ArrayDeque<>();
        List<Integer> bfsResult = new ArrayList<>();
        List<Integer> dfsResult = new ArrayList<>();


        Arrays.fill(visited,false);


        for(int i =0; i<nodes+1; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i<edges; i++){
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int sec = Integer.parseInt(st.nextToken());
            graph.get(first).add(sec);
            graph.get(sec).add(first);
        }

        //bfs

        for(int num: graph.get(start).stream().sorted().toList()){
            deque.add(num);

        }
        visited[start] = true;
        bfsResult.add(start);

        while(!deque.isEmpty()){
            int num  = deque.pollFirst();
            if(!visited[num]){
                visited[num] = true;
                bfsResult.add(num);
                for(int node: graph.get(num).stream().sorted().toList()){
                    if(!visited[node]){
                        deque.add(node);
                    }
                }
            }
        }


        //dfs
        Arrays.fill(visited,false);
        deque.clear();


        for(int num: graph.get(start).stream().sorted(Comparator.reverseOrder()).toList()){
            deque.add(num);
        }

        visited[start] = true;
        dfsResult.add(start);


        while(!deque.isEmpty()){
            int num  = deque.pollLast();
            if(!visited[num]){
                visited[num] = true;
                dfsResult.add(num);
                for(int node: graph.get(num).stream().sorted(Comparator.reverseOrder()).toList()){
                    if(!visited[node]){
                        deque.add(node);
                    }
                }
            }
        }
        // 백준 제출시에는 toList()가 안 돼서 collect(Collector.toList())로 변환 후 출력시 sb로 출력
        System.out.println(dfsResult);
        System.out.println(bfsResult);
        /*
        * for(int a: dfsResult){
        *   sb.append(a).append(' ');
        * }
        * sout(sb.toString().trim())
        * sb.setLength(0) -> 초기화
        *
        *
        *
        * */


    }






}
