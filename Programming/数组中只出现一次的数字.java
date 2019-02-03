/*一个整型数组里除了两个数字之外，其他的数字都出现了偶数次
请写程序找出这两个只出现一次的数字。*/

//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
import java.util.*;
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int length = array.length;
         
        int x = 0;
        for(int i = 0; i < length; ++i){
            x ^= array[i];
        }
        int index = findFirst1(x);
        for(int i = 0; i < length; ++i){
            if(isBit1(array[i], index)){
                num1[0] ^= array[i];
            }else{
                num2[0] ^= array[i];
            }
        }
    
    }
 
    private int findFirst1(int x){
        int index = 0;
        while(((x & 1) == 0) && index < 32){
            x >>= 1;
            index++;
        }
        return index;
    }
      
    private boolean isBit1(int target, int index){
        return ((target >> index) & 1) == 1;
    }
}
