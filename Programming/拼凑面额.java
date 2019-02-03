/*给你六种面额1、5、10、20、50、100元的纸币，假设每种币值的数量都足够多
编写程序求组成N元（N为0-10000的非负整数）的不同组合的个数。*/
import java.util.*;
 
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long [] date=new long[n+1];
        int m[]={1,5,10,20,50,100};
        for(int i=0;i<=n;i++){
            date[i]=1;
        }
         
        for(int i=1;i<6;i++){
            for(int j=1;j<=n;j++){
                if(j>=m[i]){
                    date[j]+=date[j-m[i]];
                }
            }
        }
        System.out.println(date[n]);
         
    }
}
