public class KSPX {

	public static void main(String[] args) {
		int sum[]={2,6,8,9,15,4,7,9,5};
		SSR(sum,0,sum.length-1);
		for(int i=0;i<sum.length;i++){
			System.out.print(sum[i]+" ");
		}

	}
      public static void SSR(int[] sum,int strart,int end){
    	if(strart<end){
    		int p=core(sum,strart,end);
    		SSR(sum,strart,p-1);
    		SSR(sum,p+1,end);
    	}      
    }
      public static int core(int[] sum, int strart,int end){
    	  int x=sum[end];
    	  int i=strart;//记录下标
    	  for(int j=strart;j<end;j++){
    		  if(sum[j]>x){
    			  wap(sum,i,j);
    			  i++;
    		  }
    	  }
    	  wap(sum,i,end);
    	  return i;
      }
      
      public static void wap(int[] sum,int i,int j){
    	  int a=sum[i];
    	  sum[i]=sum[j];
    	  sum[j]=a;
    		
      }
 
}
