import java.util.PriorityQueue;

public class Problem {
    static class Point implements Comparable<Point>{
        int x;
        int y;
        int discSq;
        int idx;

        public Point(int x,int y,int discSq,int idx){
            this.x=x;
            this.y= y;
            this.discSq = discSq;
            this.idx = idx;
        }

        @Override
        public int compareTo(Point p2){
            return this.discSq - p2.discSq;
        }
    }

    public void nearestCar(int[][] arr,int k){

        PriorityQueue<Point> pq = new PriorityQueue<>();

        for(int i=0; i<arr.length; i++){
            int discSq = arr[i][0]* arr[i][0] + arr[i][1]*arr[i][1];
            pq.add(new Point(arr[i][0],arr[i][1],discSq,i));

        }
        for(int i=0; i<k; i++){
            System.out.println("C"+pq.remove().idx);
        }
    }

    public int minCostToJionRopes(int arr[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : arr){
            pq.add(i);
        }

        int cost  = 0;

        while(pq.size()>1){
            int min = pq.remove();
            int min2 = pq.remove();

            cost += min+min2;
            pq.add(min+min2);
        }
        return cost;
    }

    static class Row implements Comparable<Row>{
        int soldiers;
        int idx;
        public Row(int soldiers,int idx){
            this.soldiers = soldiers;
            this.idx = idx;
        }

        @Override
        public int compareTo(Row r2){
            if(this.soldiers==r2.soldiers){
                return this.idx - r2.idx;
            }
            else{
                return this.soldiers - r2.soldiers; 
            }
        }
    }

    public static void weakedSoldier(int army[][],int k){
         PriorityQueue<Row> pq = new PriorityQueue<>();
         
         for(int i=0; i<army.length; i++){
            int count = 0;
            for(int j=0; j<army.length; j++){
                if(army[i][j]==1){
                    count++;
                }
            }
            pq.add(new Row(count,i));
         }

         for(int i=0; i<k; i++){
            System.out.println("R"+pq.remove().idx);
         }
    }

    public static class Pair implements Comparable<Pair>{
        int val;
        int idx;
       public Pair(int val,int idx){
            this.val =val;
            this.idx = idx;
        }

        public int compareTo(Pair p2){
            return p2.val - this.val;
        }
    }

    public void slidingWindows(int arr[],int k){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i=0; i<k; i++){
            pq.add(new Pair(arr[i],i));
        }

        int res[] = new int[arr.length-k+1];
        res[0] = pq.peek().val;
        for(int i=k; i<arr.length; i++){

            while(pq.size()>0 && pq.peek().idx<=(i-k)){
                pq.remove();
            }
            pq.add(new Pair(arr[i],i));
            res[i-k+1] = pq.peek().val;
        }

        // print result
        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Proble p = new Proble();

        int arr[] = {1,2,3,4,5,6,7,8,0};
        p.slidingWindows(arr,3);
        
    }
}
