public static int erSearch(int[] A,int k){
		int x=0,y=A.length-1;
		int middle=0;
		if(k < A[x]||k > A[y]||x > y)
			return -1;	
		while(x<=y){
			middle=(x+y)/2;
			if(A[middle]>k){
				y=middle-1;
			}
			else if(A[middle]<k){
				x=middle+1;
			}
			else
				return middle;
		}
		return -1;
	}
