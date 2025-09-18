public class Paint {


    static long[] painted = new long[7];

    static void paint(int t){

        painted[1] = 2;
        painted[2] = 5;
        for(int i = 3; i <= t; i++){
            //이거는 마지막이  1cm으로 끝나는 경우만 세는 건데 2cm로 끝나는 건 세지 못하는 한계가 있음
//            painted[i] = painted[i-1] * painted[1];
            //1cm로 끝나는 경우와 2cm으로 끝나는 경우랑 같이 세어야 함
              painted[i] = (painted[i-1] * painted[1]) + (painted[i-2] * 1);

        }
        System.out.println(painted[t]);
    }

    public static void main(String[] args) {
        paint(6);
    }

}
