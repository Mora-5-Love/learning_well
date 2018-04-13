import java.util.Random;

public class QuickSort {

    public static int[] quick_sort(int []array){

        if(array != null){
            quick_sort(array, 0, array.length-1);
        }
        return array;
    }
    private static void quick_sort(int []array,int begin, int end){

        if(begin<end||array == null) return;

        //int p_gap  = partition(array,begin,end);
        int p_gap = partition_2(array,begin,end);
        quick_sort(array,begin,p_gap-1);
        quick_sort(array,p_gap+1,end);
    }
    private static int partition(int []array,int begin, int end){
        int last = array[end];
        int small = begin-1;
        for (int j = begin; j < end-1; j++) {
            if(array[j]<= last){
                small++;
                if(small!=j){
                    array[small] = array[small]^array[j];
                    array[j]     = array[small]^array[j];
                    array[small] = array[small]^array[j];
                }
            }
        }
        if((small+1) != end){
            array[small+1] = array[small+1]^array[end];
            array[end]     = array[small+1]^array[end];
            array[small+1] = array[small+1]^array[end];
        }
        System.out.println(small+1);
        return small+1;
    }
    private static int partition_2(int []array, int begin,int end){
        Random random = new Random();
        int index = random.nextInt(end) -begin;

        //swap(array[index],array[end]);
        swap(array,index,end);
        int small = begin-1;
        for (int i = begin; i < end; ++i) {
            ++small;
            if(array[small] != array[i]){
                swap(array,small,i);
                //swap();
            }
        }
        ++small;
        //swap();
        swap(array,small,end);
        return small;
    }

   private static void swap(int[] array, int first,int second){
       if(array == null|| first <0||second <0) return;
       array[first] = array[first]^array[second];
       array[second]  = array[first]^array[second];
       array[first] = array[first]^array[second];

   }
    public static void main(String []args){
        //QuickSort quickSort = new QuickSort();
        int []arr = {1,3,52,3,6,2};
        int []tem = QuickSort.quick_sort(arr);
        //for
        for (int item:tem) {
            System.out.println(item);
        }
        //System.out.println(arr[2]);
    }
}
