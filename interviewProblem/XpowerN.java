public class XpowerN {
    
    public static int power(int x,int n){
        if(n==1)return x;
        return x * power(x,n-1);
    }
    public static int OpmizePower(int x,int n){
        if(n==1)return x;

        int halfPower = OpmizePower(x,n/2);
        int result = halfPower*halfPower;
        if(x%2!=0)result = x*result;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(OpmizePower(2,2));
    }
}
