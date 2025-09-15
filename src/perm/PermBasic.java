package perm;



// 순열
// tgt 각 자리를 채우려 할 때
//  1 src 의 모든 항목을 다 고려
// 2 tgt 현재 자리 이전 자리에 사용된 src의 항목은 제외

public class PermBasic {

    static int[] src = {1,2,3,4,5};
    static int[] tgt = new int[3];
    static boolean[] selected = new boolean[src.length];


    public static void main(String[] args) {
        perm(0);

    }




    static void perm(int tgtIdx){ //tgtIdx: 채우고자 하는 tgt 배열의 index
        // 기저 조건
        if (tgtIdx == tgt.length){
            return;
        }
//        else{
//            tgt[tgtIdx] = src.length - tgtIdx;
//            perm(tgtIdx+1);
//        }
        for (int i = 0; i< src.length; i++){
            if (selected[i]) continue;
            tgt[tgtIdx] = src[i];
            selected[i] = true;
            perm(tgtIdx+1);
            selected[i] = false;
        }


    }

}
