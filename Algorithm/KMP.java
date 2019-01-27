import java.util.*;

public class Main{
    public static void main(String[] args){
        String str1="wz1115a";
        String str2="115";
        int[] next=GetNext(str2);

        System.out.println(Arrays.toString(next));
        int x=KMP(str1,str2,next);
        System.out.println(x);
        
    }
    public static int[] GetNext(String str2){
        if(str2.length()==1)
            return new int[]{-1};
        int[] next=new int[str2.length()];
        next[0]=-1;
        next[1]=0;
        int i=2;
        int j=0;
        while(i<next.length){
            if(str2.charAt(i-1)==str2.charAt(j)){
                next[i++]=++j;
            }
            else if(j>0){
                j=next[j];
            }
            else
                next[i++]=0;
        }
        return next;
    }

    public static int KMP(String str1,String str2,int[]next) {
        if(str1==null||str2==null||str2.length()<1||str1.length()<str2.length())
            return -1;
        int x=0,y=0;//定义下标
        while(x<str1.length()&&y<str2.length()){
            if(str1.charAt(x)==str2.charAt(y)){
                x++;y++;
            }
            else if(next[y]==-1){//下标y跳到str2的0位置，即不存在重复利用
                x++;
            }
            else//y不在0位置上，即存在重复利用
                y=next[y];
        }
        return y==str2.length()?x-y:-1;
    }
}
