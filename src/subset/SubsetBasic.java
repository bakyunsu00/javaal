//package subset;
//
//// 부분집합
//// tgt 가 고정 X, tgt 필요 X
//// src 의 맨 앞부터 마지막까지 각 항목에 대해 선택, 비선택을 고려
//public class Subset_Basic {
//
//    static int[] src = { 1, 2, 3, 4, 5 };
//    static boolean[] select = new boolean[src.length];
//
//    public static void main(String[] args) {
//        subset(0);
//    }
//
//    static void subset(int srcIdx) {
//        // 기저 조건
//        if( srcIdx == src.length ) {
//            // complete code
//            // select 배열을 이요해서 선택된 src 항목만 출력
//            printSubset();
//            return;
//        }
//
//        // 선택
//        select[srcIdx] = true;
//        subset(srcIdx + 1);
//
//        // 비선택
//        select[srcIdx] = false;
//        subset(srcIdx + 1);
//    }
//
//    static void printSubset() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("{");
//
//        for (int i = 0; i < select.length; i++) {
//            if( select[i] ) sb.append(src[i]).append(" ");
//        }
//
//        sb.append("}");
//        System.out.println(sb);
//    }
//}
