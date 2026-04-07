// ************selection sort********************
public class SelectionSort{
    public static void Selection(int arr[]) {

    for(int i=0;i<arr.length-1;i++){
        int minPos=i;
        // find minimum element in the unsorted array
        for(int j=i+1;j<arr.length;j++){
            if(arr[minPos]>arr[j]){
                minPos=j;
            }
        }
        // swap the minimum element with the first element of the unsorted array
        int temp=arr[minPos];
        arr[minPos]=arr[i];
        arr[i]=temp;
    }
    }

    public static void main(String[] args) {
        int arr[]={5,2,3,4,1};
        Selection(arr); 
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
