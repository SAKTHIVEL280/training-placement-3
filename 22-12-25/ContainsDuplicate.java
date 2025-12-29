import java.util.*;
class contains_dup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashSet<Integer> s=new HashSet<>();
        for(int x:arr){
            if(s.contains(x)){
                System.out.println("Contains duplicate");
                return;
            }
            s.add(x);
        }
        System.out.println("No duplicate");
    }
}
