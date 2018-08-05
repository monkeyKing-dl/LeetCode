/**
 * Created by daili on 2018/8/5.
 */
public class ReverseInteger_7 {

    public static void main(String[] args) {
        ReverseInteger_7 reverseInteger7 = new ReverseInteger_7();
        System.out.println(reverseInteger7.reverse(123));
    }

    public int reverse(int x) {
//        if(x == 0l){
//            return 0l;
//        }
//        String s = String.valueOf(x);
//        boolean minus = false;
//        if(s.charAt(0) == '-'){
//            s = s.substring(1,s.length());
//            minus = true;
//        }
//        StringBuilder sb = new StringBuilder(s);
//        s = sb.reverse().toString();
//        while (s.charAt(0) == '0'){
//            s = s.substring(1,s.length());
//        }
//
//        if(minus){
//            s = "-"+s;
//        }
//        return Long.valueOf(s);

        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            //原来溢出要返回0
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
