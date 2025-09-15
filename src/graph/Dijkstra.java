package graph;
import java.util.*;

// 우선순위큐에 들어갈 노드(정점 번호 v, 그때까지 알려진 비용 w)
class Node {
    int v;
    long w;
    Node(int v, long w) { this.v = v; this.w = w; }
}

public class Dijkstra {
    static final long INF = (long)1e18; // 사실상 무한대

    // n: 정점 수(1..n), edges: {u, v, w} (방향 그래프), start: 시작 정점
    static long[] dijkstra(int n, List<int[]> edges, int start) {
        // 1) 인접 리스트 만들기
        List<List<int[]>> g = new ArrayList<>();
        for (int i = 0; i <= n; i++) g.add(new ArrayList<>());
        for (int[] e : edges) {
            int u = e[0], v = e[1], w = e[2];
            g.get(u).add(new int[]{v, w});
        }

        // 2) 거리/방문 초기화
        long[] dist = new long[n + 1];
        boolean[] visited = new boolean[n + 1];
        Arrays.fill(dist, INF);
        dist[start] = 0;

        // 3) (거리 오름차순) 우선순위큐
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a.w));
        pq.offer(new Node(start, 0));

        // 4) 메인 루프
        while (!pq.isEmpty()) {
            Node cur = pq.poll();      // 현재까지 가장 짧은 "스냅샷"
            int u = cur.v;
            if (visited[u]) continue;  // 이미 확정된 정점이면 패스(낡은 스냅샷)
            visited[u] = true;         // u의 최단거리 확정!

            for (int[] edge : g.get(u)) {
                int v = edge[0];
                int w = edge[1];
                long cand = dist[u] + w;     // u를 거쳐 v로 가는 새 후보 거리
                if (dist[v] > cand) {        // 더 짧으면 갱신
                    dist[v] = cand;
                    pq.offer(new Node(v, dist[v])); // decrease-key 대신 새 스냅샷 푸시
                }
            }
        }
        return dist; // dist[1..n]에 최단거리
    }

    public static void main(String[] args) {
        // 아주 쉬운 예제 그래프(방향). 시작=1
        // 1->2(2), 1->3(5), 2->3(1), 2->4(2), 3->5(1), 4->5(3)
        List<int[]> edges = Arrays.asList(
                new int[]{1,2,2},
                new int[]{1,3,5},
                new int[]{2,3,1},
                new int[]{2,4,2},
                new int[]{3,5,1},
                new int[]{4,5,3}
        );

        long[] dist = dijkstra(5, edges, 1);
        System.out.println(Arrays.toString(dist));
        // 기대: [INF, 0, 2, 3, 4, 4]  (인덱스 0은 무시)
        // 실제 출력 예: [1000000000000000000, 0, 2, 3, 4, 4]
    }
}
