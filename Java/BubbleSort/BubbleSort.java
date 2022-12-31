public class SortFinder {
	public static int[] arrayGenerate() {
		
	}
	public static int[] bSort(int[] array){
		int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){ 
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
								 arr[j] = temp;
								}
							} 
						}
					}
				
				}
		    }
        } 
		
	}
	public static int bSearch(int[] bArray, int f, int l, int key){
		 int mid = (f + l)/2;  
		 while( f <= l ){
			 if ( arr[mid] < key ){
				 f = mid + 1;
				}
				else if ( arr[mid] == key ){
					
					System.out.println("Element is found  after sorting at index: " + mid);
					break;
				}
				else{
					l = mid - 1;
				}
				mid = (f + l)/2; 
			}
			if ( f > l ){
				System.out.println("Element is not found!");
			}
		}			
	}				
	public static void main(String[] args){ 
    SortFinder.bSearch(SortFinder.bSort(SortFinder.arrayGenerate())) 
	}
}