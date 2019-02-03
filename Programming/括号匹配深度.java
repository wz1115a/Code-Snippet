/*一个合法的括号匹配序列有以下定义:
1、空串""是一个合法的括号匹配序列
2、如果"X"和"Y"都是合法的括号匹配序列,"XY"也是一个合法的括号匹配序列
3、如果"X"是一个合法的括号匹配序列,那么"(X)"也是一个合法的括号匹配序列
4、每个合法的括号序列都可以由以上规则生成。
例如: "","()","()()","((()))"都是合法的括号序列*/

import java.util.*;
public class Main {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int a=sus(s);
        System.out.println(a);
    }
     
    public static int sus(String s){
        if(s=="")return 0;
        int x=0,y=0,count=0,sum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                x++;
                count=count>x?count:x;
            }
            if(s.charAt(i)==')')x--;              
        }      
        return count;
    }
}
