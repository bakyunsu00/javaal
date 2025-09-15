package hash;

import java.util.HashMap;


//Map: Collections X, Key 와 Value 로 구성된 사전형태의 자료구조
//HashMao: 위의 자료구조를 hash 알고리즘으로 구현한 구현체
//Key를 통해서 값을 찾아가는 거는 O(1)  거꾸로 값으로 키를 찾는 형태는 O(N)
public class HashTest {


    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("AAA", 3);
        hashMap.put("BBB", 4);
        hashMap.put("CCC", 5);
        hashMap.put("DDD", 6);
        hashMap.put("AAA", 6);
        //키가 같은 건 충돌이 아님 이런 경우는
        // 그냥 덮어씀
        // 충돌은 서로 디른 것들이 충돌하는 거

        for(String key : hashMap.keySet()){
            System.out.print(key + " : " + hashMap.get(key)+ "\n");
        }

        //contains
        System.out.println(hashMap.containsKey("DDD"));
        System.out.println(hashMap.containsKey("ddd"));
        System.out.println(hashMap.containsValue(3));
        System.out.println(hashMap.containsValue(5));
        System.out.println(hashMap.containsValue("22"));

        // remove

        hashMap.remove("AAA");
        System.out.println(hashMap.containsKey("AAA"));
    }
}
