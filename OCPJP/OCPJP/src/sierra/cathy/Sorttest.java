package sierra.cathy;

public class Sorttest {

	public static void main(String[] args) {
		int[] a=mergeArrays(new int[]{-3,1,3,9}, new int[]{-9,0,2,5,7});
		for(int s: a){
			System.out.print(s+ ",");
		}
		System.out.println();
		
			
		}
	
	
	public static int[] mergeArrays(int[]arr1,int[]arr2){
	    
	    int arrayLength1= arr1.length;
	    int arrayLength2= arr2.length;
	    int totalLength=arrayLength1+arrayLength2;
	    System.out.println(totalLength);
	    int[] myArray=new int[totalLength];

	    for(int m=0,n=0,k=0; k<totalLength; ){
	    	

	    	
	        if(arr1[m]<arr2[n]){
	            myArray[k++]=arr1[m++];
	        }
	        else if(arr1[m]>arr2[n]){
	            myArray[k++]=arr2[n++];
	        }
	        else if(arr1[m]>arr2[n]){
	            myArray[k++]=arr1[m++];
	            myArray[k++]=arr2[n++];
	        }
	        
	    	if(m==arrayLength1 || n==arrayLength2){
		        if(m==arrayLength1){
		        	if(n<arrayLength2){
		        		for(;n<arrayLength2;){
		        			myArray[k++]=arr2[n++];
		        		}
		        	}
		        }
		        else if(n==arrayLength2){
		        	if(m<arrayLength1){
		        		for(;m<arrayLength1;){
		        			myArray[k++]=arr1[m++];
		        		}
		        	}
		        }
	    	}
	        
	        
	        
	    }
	    
	    return myArray;
		
	}

}
