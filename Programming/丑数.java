/*把只包含质因子2、3和5的数称作丑数（Ugly Number）
例如6、8都是丑数，但14不是，因为它包含质因子7。
习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数*/
import java.util.*;
public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if(index<=0)return 0;
        int i2=0,i3=0,i5=0;
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        while(list.size()<index){
            int s2=list.get(i2)*2;
            int s3=list.get(i3)*3;
            int s5=list.get(i5)*5;
            int min=Math.min(s2,Math.min(s3,s5));
            list.add(min);
            if(min==s2)i2++;
            if(min==s3)i3++;
            if(min==s5)i5++;
        }
        return list.get(index-1);
    }
     
}
