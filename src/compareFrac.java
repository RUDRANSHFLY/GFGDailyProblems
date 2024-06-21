public class compareFrac {
    public static String compareFrac(String str){
        int firstNumber = 0 , firstNumberDeno = 0 , secondNumber = 0 , secondNumberDeno = 0 ;
        String temp = "" ;
        boolean b = true ;
        for (int i = 0 ; i < str.length() ; i++){
            char c = str.charAt(i);
            if(c == ' '){
                continue;
            }
            if(c == '/'){
                if(b == false){
                    secondNumber = Integer.parseInt(temp);
                    temp = "";
                    continue;
                }else{
                    firstNumber = Integer.parseInt(temp);
                    temp = "";
                    continue;
                }

            }
            if(c == ','){
                firstNumberDeno = Integer.parseInt(temp);
                b = false;
                temp = "";
                continue;
            }

            temp += c;
        }
        secondNumberDeno = Integer.parseInt(temp);


        double d1 = (double) firstNumber / firstNumberDeno ;
        double d2 = (double) secondNumber / secondNumberDeno ;


        if(d1 == d2){
            return "equal";
        }

        String r = "" ;

        if(d1 >d2){
            r = firstNumber + "/" + firstNumberDeno ;
        }else{
            r = secondNumber +"/" + secondNumberDeno ;
        }


        return r ;
    }
}
