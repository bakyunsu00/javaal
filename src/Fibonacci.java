

// 1 2 3 4 5 6 7   8 9
// 1 1 2 3 5 8 13 21 34



public class Fibonacci {
    public static void main(String[] args) {
        //fibo(50)
    }
    //재귀를 사용하면 시간 초과!
    static long fibo_rc(int n){
        if(n == 1 || n == 2){return 1;}
        else return fibo_rc(n-1) + fibo_rc(n-2);


    }
    static long[] memoi_dp = new long[51];
    //memoization
    static long fibo_mem(int n){

        if(n == 1 || n == 2){return 1;}
        else if(memoi_dp[n] > 0) return memoi_dp[n];
        return memoi_dp[n] = fibo_mem(n-1) + fibo_mem(n-2);

    }

    //dp
    static long[] fibodp = new long[51];
    static long fibo_dp(int n ){
        fibodp[1] = 1;
        fibodp[2] = 1;
        for(int i = 3; i <= n; i++){
            fibodp[i] = fibodp[i-1] + fibodp[i-2];
        }
        return fibodp[n];
    }


}

