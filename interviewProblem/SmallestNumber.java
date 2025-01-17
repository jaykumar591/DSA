public class SmallestNumber {
    
    public int smallestNumber(int n){
       String result = "";

       for(int i=9; i>=2; i--){

        while(n%i==0){
            n  = n%i;
            result +=i;
        }

       }

       if(n!=1){
          return -1;
       }else{
        return Integer.parseInt(result);
       }
    }
}
