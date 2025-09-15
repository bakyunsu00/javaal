package comb;

import java.util.Arrays;

//조합
public class CombBasic {

    static int[] src = {1,2,3,4,5};
    static int[] tgt = new int[3]; // __ __ __



    public static void main(String[] args) {

    }

    public void comb(int srcIdx, int tgtIdx){
        //기저 조건
        if(tgtIdx == tgt.length){
            System.out.println(Arrays.toString(tgt));
            return ;
        }
        if(srcIdx == src.length) return;

        // tgtIdX 자리에 srcIdx 항목을 선택? 비선택?
        tgt[tgtIdx] = src[srcIdx];
        comb(srcIdx +1, tgtIdx +1) ;
//        tgt[tgtIdx] = 0; // 배열은 필요 x
        comb(srcIdx +1, tgtIdx);

    }





}
