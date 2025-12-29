import java.util.*;
class two_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter target: ");
        int t=sc.nextInt();
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++){
            int c=t-arr[i];
            if(m.containsKey(c)){
                System.out.println("Indices: "+m.get(c)+", "+i);
                return;
            }
            m.put(arr[i],i);
        }
    }
}
