public class BubbleSort {
    public static void bubblesort(int array[]){
        int n=array.length-1;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                     array[j]=array[j+1];
                     array[j+1]=temp;

                }
            }
        }
    }
    public static void main(String args[]){
        int [] array={23,45,34,67,87,23};
        System.out.println("The array before sort");
        for(int num:array){
            System.out.print(num + " ");
        }
        System.out.println();
        bubblesort(array);
        System.out.print("The array after sort");
        for(int num : array){
            System.out.print(num + " ");
        }
    }

}
