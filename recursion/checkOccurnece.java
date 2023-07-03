public class checkOccurnece {
    public  static int firstOccurence(int arr[],int key,int i) {
        if(i==arr.length)
        {
            return -1;      
        }
        if(arr[i]==key)
        {      
            return i;
        }
        return firstOccurence(arr,key,i+1);
    }
    public  static int lastOccurence(int arr[],int key,int i) {
        if(i==arr.length)
        {
            return -1;      
        }
        int isFound =lastOccurence(arr,key,i+1);
        if(isFound==-1 && arr[i]==key)
        {      
            return i;
        }
        return isFound;
        
        }
    public static void main(String[] args) {
        int arr[]={1,34,667,46,7,5,7,9,4,7,2,36,1,3};
        int key=7;
        System.out.println(firstOccurence(arr,key,0));
        System.out.println(lastOccurence(arr,key,0));
    }
    
}
