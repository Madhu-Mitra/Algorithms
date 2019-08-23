public class palinNum {
    public static boolean  isPalindrome(int x) {
        int revInt=0;
        int copyX=x;
        if(x<0) return false;
        while(x!=0){

            revInt=revInt*10+x%10;
            x/=10;
        }
        if(revInt==copyX){
            return true;
        }
        else return false;

    }
    public static void main(String[] args){
        System.out.println(isPalindrome(-121));

    }
}
