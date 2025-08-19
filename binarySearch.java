public class binarySearch {
    
    public static int search (int arr [], int target ){
        
        int low = 0 , high = arr.length - 1;
        
        while (low <= high){
            
            int mid = low + (high - low) / 2 ;
            
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                low = mid+1;
            }else {
                high = mid - 1;
            }
        }

        return -1;
        
    }
    

    public static void main (String [] args){
        int [] arr = {3,6,8,12,14,17,25,29,31,36,42,47,53,55,62};
        int target = 47;
        int res = search(arr,target);

        if(res == -1){
            System.out.println("The given element not present in array");
        }else {
            System.out.println("Element is present at "
                    + "index " + res);
        }

        
    }
}
