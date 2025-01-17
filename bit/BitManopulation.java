package bit;

public class BitManopulation {
    public static int getBit(int n , int pos){
        int bitmask = 1<<pos;
        int bit = n&bitmask;
        return bit!=0?1:0;
    }

    public static int setbit(int n, int pos){
        int bitmask = 1<<pos;
        return n|bitmask;
    }

    public static int clearBit(int n , int pos){
        int bitmask = ~(1<<pos);
        return n & bitmask;
    }

    public static int updateBit(int n , int pos , int newBit){

        n = clearBit(n,pos);
        int bitMask = newBit<<pos;
        return n|bitMask;
    }
}
