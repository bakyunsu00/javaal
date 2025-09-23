import java.util.*;
import java.io.*;


public class Organic {

    public static void main(String[] args) throws IOException {

        //표준 라이브러리 가져오기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        Deque<List<Integer>> deque = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i<testCase; i++){
            //입력값 저장
            StringTokenizer st = new StringTokenizer(br.readLine());
            int graphM = Integer.parseInt(st.nextToken());
            int graphN = Integer.parseInt(st.nextToken());
            int cabbage = Integer.parseInt(st.nextToken());
            int count = 0;


            //그래프 초기화
            Integer[][] graph = new Integer[graphN][graphM];

            for(int f = 0; f<graphN; f++){
                Arrays.fill(graph[f],0);
            }

            for(int c = 0; c<cabbage; c++){
                st = new StringTokenizer(br.readLine());
                int Y = Integer.parseInt(st.nextToken());
                int X = Integer.parseInt(st.nextToken());
                graph[X][Y] = 1;
            }





            //방문 초기화
            boolean[][] visited = new boolean[graphN][graphM];
            for(int f = 0; f<graphN; f++){
                Arrays.fill(visited[f],false);
            }

            //상하좌우 이동 상 하 좌 우
            int[] dx = {-1,1,0,0};
            int[] dy = {0,0,-1,1};
            int nx = 0;
            int ny = 0;




            for(int x = 0; x<graphN; x++){
                for(int y = 0; y<graphM; y++){
                    if(graph[x][y] == 1 && !visited[x][y]){
                        nx = x;
                        ny = y;
                        deque.add(Arrays.asList(nx,ny));
                        //bfs
                        while(!deque.isEmpty()){
                            List<Integer> temp = deque.pollFirst();
                            nx = temp.get(0);
                            ny = temp.get(1);
                            if(!visited[nx][ny]) {
                                visited[nx][ny] = true;

                                for (int move = 0; move < 4; move++) {
                                    nx = temp.get(0) + dx[move];
                                    ny = temp.get(1) + dy[move];
                                    if ((nx >= 0 && nx < graphN) && (ny >= 0 && ny < graphM) && (graph[nx][ny] == 1))
                                        if (!visited[nx][ny]) {
                                            deque.add(Arrays.asList(nx, ny));
                                        }


                                }
                            }

                        }

                        count += 1;




                    }
                    else{
                        visited[x][y] = true;
                    }
                }
            }



            //카운팅


            result.add(count);
        }

    for(int answer: result){
        System.out.println(answer);
    }



    }


}
