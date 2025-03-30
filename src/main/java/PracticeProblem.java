import java.util.Arrays;
public class PracticeProblem {
    //q1
    public static int compareSearch(int [] array, int number){
        int loop1 = 0;
        int loop2 = 0; //loops for counting
        Arrays.sort(array);

        //sequential searching
        for (int i = 0; i < array.length; i++){
            loop1++; //counting loops
            if (array[i] == number){
            return i; //break
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
            int loops = loop1 + loop2;
            return loops;
        }   
 }

//q2
    public static int compareStringSearch(String [] array, String word){
        int loop1 = 0;
        int loop2 = 0;
        Arrays.sort(array);

        //casing
        for (int i = 0; i < array.length; i++){
            array[i].toLowerCase();
        }
        
        //sequential
        for (int i = 0; i < array.length; i++){
            loop1++;
            if (array[i] == word){
                return i;
            }
        }

        //binary
        int start = 0;
        int end = 0;
        int middle = (start + end)/2;

        while (start <= end){
            loop2++;
            int comparison = array[middle].compareTo(word);
            if (comparison < 0){
                start = middle + 1;
                middle = (start + end)/2;
            }
            else if (comparison > 0){
                end = middle - 1;
                middle = (start + end)/2;
            }
            else {
                start = end + 1;
            }
        }
    
        int stringloops = loop1 + loop2;
        return stringloops;
    }
