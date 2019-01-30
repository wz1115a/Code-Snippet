/*将一句话的单词进行倒置，标点不倒置。比如 I like beijing. 经过函数后变为：beijing. like I*/
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int x=0;
        LinkedList<Character> list = new LinkedList<Character>();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                char c=s.charAt(i);
                list.add(c);
                continue;
            }
            String str = "";
    		while(list.size() > 0) {
    			str += list.removeLast();
    		}
    		System.out.print(str+" ");
        }
        String str = "";
		while(list.size() > 0) {
			str += list.removeLast();
		}
		System.out.print(str);
    }
}
