import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        for(int index = 0; index <= arr_size - 1; index++)
        {
            arr[index] = in.nextInt();
        }
        int elem_1 = in.nextInt();
        int elem_2 = in.nextInt();
        int elem_1_index = -1;
        int elem_2_index = -1;
       for(int index = 0; index <= arr_size - 1; index++)
        {
            if(elem_1 == arr[index])
            {
                elem_1_index = index;
            }
            if(elem_2 == arr[index]){
                elem_2_index = index;
            }
        }
        System.out.println(elem_1_index);
        System.out.println(elem_2_index);
    }
}