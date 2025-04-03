import java.util.Arrays;
public class PracticeProblem {
    //q1
    public static int[] compareSearch(int [] array, int number){
        int loop1 = 0;
        int loop2 = 0; //loops for counting
        Arrays.sort(array);

        //sequential searching
        for (int i = 0; i < array.length; i++){
            loop1++; //counting loops
            if (array[i] == number){
                break;
            }
        }
        //binary searching
        int start = 0;
        int end = array.length - 1;
        int middle = (start + end)/2;
        
        while (start <= end){  
            if (array[middle] < number){
                start = middle + 1;
                middle = (start + end)/2;
                loop2++;
            }
            
            else if (array[middle] > number){
                end = middle - 1;
                middle = (start + end)/2;
                loop2++;
            }
            else {
                start = end + 1;
                loop2++;
            }
        }
            int [] numarr = {loop1, loop2};
            return numarr;
        }   

//q2
public static int[]compareStringSearch(String[] array, String text){
    int loop1 = 0;
    int loop2 = 0;
    Arrays.sort(array);


    for (int i = 0;i < array.length;i++){
        array[i].toLowerCase();
    }


    for (int i = 0;i < array.length;i++){
        loop1++;
    if (array[i].equals(text)){
        break;
    }
}


    int start = 0;
    int end = array.length - 1;
    int mid = (start + end)/2;


    while (start <= end) {
    loop2++;
        int comparison = array[mid].compareTo(text);
        if (comparison < 0) {
            start = mid + 1;
            mid = (end + start) / 2;
        }
        else if (comparison > 0) {
            end = mid - 1;
            mid = (end + start) / 2;
        }
        else {
            start = end + 1;
        }
    }


int [] stringArr = {loop1, loop2};
return stringArr;
}
}

