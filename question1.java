public class question1{
    public boolean isMonotonic(ArrayList<Integer> A){
        boolean inc = true;
        boolean dec = true;
        for(int i=0; i<A.size()-1; i++){
            if(A.get(i) > A.get(i+1)){
                inc = false;
                if(A.get(i) < A.get(i+1)){
                    dec = false;
                }
                return inc || dec;
            }
        }
       

        }
        public static void main(String args[]){
            ArrayList<Integer> size = new ArrayList<>();
            size.add(1);
            size.add(2);
            size.add(2);
            size.add(3);
            System.out.println(size);
    }
}