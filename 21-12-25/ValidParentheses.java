import java.util.*;
class d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String s=sc.nextLine();
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                st.push(c);
            }else{
                if(st.isEmpty()){
                    System.out.println("Not valid");
                    return;
                }
                char t=st.pop();
                if(c==')'&&t!='('){
                    System.out.println("Not valid");
                    return;
                }
                if(c=='}'&&t!='{'){
                    System.out.println("Not valid");
                    return;
                }
                if(c==']'&&t!='['){
                    System.out.println("Not valid");
                    return;
                }
            }
        }
        if(st.isEmpty())
            System.out.println("Valid");
        else
            System.out.println("Not valid");
    }
}
