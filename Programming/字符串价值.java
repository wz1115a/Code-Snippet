/*有一种有趣的字符串价值计算方式:统计字符串中每种字符出现的次数,然后求所有字符次数的平方和作为字符串的价值 
例如: 字符串"abacaba",里面包括4个'a',2个'b',1个'c',于是这个字符串的价值为4 * 4 + 2 * 2 + 1 * 1 = 21 
牛牛有一个字符串s,并且允许你从s中移除最多k个字符,你的目标是让得到的字符串的价值最小。*/


import java.util.*;
public class kuohao {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
        int n=sc.nextInt();
        int a=sus(s,n);
        System.out.println(a);
	}

	public static int sus(String s,int n){
        int sum=0,x=0;//sum保存结果，x记录数组a下标
        int[] a=new int[s.length()];//存放不同字符出现次数
        Map map=new HashMap();//用哈希表判断字符是否重复
        for(int i=0;i<s.length();i++){
           if(map.containsKey(s.charAt(i))){//当插入哈希表中的key值重复时，累加重复位置
        	   a[(int) map.get(s.charAt(i))+1]++;//获取存储的value值
               continue;
           }
           map.put(s.charAt(i),x);//将字符作为key,字符在数组a中的位置作为value
           x++;
           a[x]++;//不重复时计1
        }
        
        for(int i=0;i<n;i++){//每次循环减去出现次数最多的字符中的一个
             a=lete(a);
        }
        
        for(int i=0;i<a.length;i++){//计算平方和
        	if(a[i]!=0){
        		sum+=a[i]*a[i];
        	}
        }
        return sum;
    }
	
	public static int[] lete(int[] a){//每一次找出最大重复数减一
		int x=0,h=0;
		for(int i=0;i<a.length;i++){
             if(a[i]>=x){
            	 x=a[i];
            	 h=i;//记录下标
             }
        }
		a[h]--;
		return a;
	}

}
