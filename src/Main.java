//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int r = getOccurnaceof4(61);
        System.out.println(r);
    }

    public static int getOccurnaceof4(int n){
        if(4 > n){
            return 0;
        }
        int r = 0 ;
        for(int i = 1 ; i <= n ; i++){
            int t = i ;
            while(t > 0){
                if(t % 10 == 4){
                    r++;
                    break;
                }
                t = t / 10 ;
            }
        }

        return r ;
    }
}