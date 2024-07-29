package LinearSearch;
public class FirstOccurance {
    public static int occurance(int []a , int key){
        for(int i=0; i<a.length;i++){
            if(a[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] array={1,3,4,5,7,3,2};
        int target=2;
        int index= occurance(array,3);

        if(index!=0){
            System.out.println("The occurance of number:" + target+ " is "+ index);
        }
        else{
            System.out.println("target" + target + "not found");
        }

    }
}

