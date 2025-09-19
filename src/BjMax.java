import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//백준_2587
public class BjMax {

    static int[] nums = new int[5];
    static int sum = 0;

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        for(int i = 0; i<nums.length; i++){
            nums[i] = Integer.parseInt(br.readLine());
            sum += nums[i];
        }

        System.out.println(sum/5);
        Arrays.sort(nums);
        System.out.println(nums[2]);


    }




}
