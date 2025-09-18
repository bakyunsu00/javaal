public class Apartment {

    static long[] apartment = new long[9];



    static long apartmentDp(int n){
        apartment[1] = 2;
        apartment[2] = 3;


        for(int i = 3; i<=n; i++){
            if(apartment[n] > 0) return apartment[n];
            else{
                return apartment[n] = apartmentDp(n-1) + apartmentDp(n-2);
            }

        }
        return apartment[n];
    }


    public static void main(String[] args) {
        System.out.println(apartmentDp(8));
    }
}
