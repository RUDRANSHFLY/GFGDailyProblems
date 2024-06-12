public class CountNumberswith4 {
    public static int countNumberswith4(int n) {
        if(4 > n){
            return 0;
        }

        int r = 0 ;
        for(int i = 1 ; i <= n ; i++){
            int t = i ;
            while(t > 0){
                if(t % 10 == 4){
                    r++;
                    // added break to get a single occurance of 4 like examole 444 to one 4 occurance as 1 not 3
                    break;
                }
                t = t / 10 ;
            }
        }

        return r ;
    }
}
