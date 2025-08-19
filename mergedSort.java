public class mergedSort {

    public static void conquer(int si , int mid , int ei , int arr[]){
        int marge [] = new int [ei - si +1];

        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;

        while (idx1 <= mid && idx2 <= ei){
            if(arr[idx1] <= arr[idx2]){
                marge[x] = arr[idx1];
                x++ ; idx1++;
            }else{
                marge[x] = arr[idx2];
                x++ ; idx2++;
            }
        }

        while (idx1 <= mid ){
            marge[x] = arr[idx1];
            x++; idx1++;
        }

        while (idx2 <= ei){
            marge[x] = arr[idx2];
            x++;idx2++;
        }

        for(int i=0,j=si; i<marge.length;i++,j++){
            arr[j] = marge[i];
        }
    }
     public static void divide(int si , int ei, int arr []){

         if(si >=ei){
             return;
         }

         int mid = si + (ei - si) / 2 ;

         divide(si, mid, arr);
         divide(mid+1,ei,arr);

         conquer(si,mid, ei,arr);
     }


    public static void main (String [] args){
        int arr [] = {3,6,9,2,5,8};
        int n = arr.length;
        divide(0,n-1,arr);

        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();





    }
}
