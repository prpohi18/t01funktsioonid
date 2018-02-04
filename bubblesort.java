public class bubblesort {
    //sorting
    static void sort(int[] arr) {
        
        //create temporary variable
        int temp = 0;
        
        //for array's length
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<(arr.length-i); j++) {
                
                //check value
                if(arr[j-1] > arr[j]) {
                    
                    //swap
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
    //main
    public static void main(String[] args) {
        
        //create an array with the length of arguments passed
        int[] arr = new int[args.length];
        
        //convert arguments to int and read into array
        for (int i=0; i<Math.min(5, args.length); i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        
        //call function to sort array
        sort(arr);
        
        //print out sored array
        System.out.println("Sorted array:");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}