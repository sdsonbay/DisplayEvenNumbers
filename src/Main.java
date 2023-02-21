import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = {0, 2, 3, 4, 1, 2, 4, 3, 10, 9};
        int[] duplicates = new int[array.length];
        int index = 0;

        List<Integer> evenList = new ArrayList();
        List<Integer> doubledElements = new ArrayList();

        for(var element: array){
            if(element % 2 == 0){
                evenList.add(element);
            }
        }

        //System.out.println(evenList);

        for(int i = 0; i < evenList.size(); i++){
            int handled = evenList.get(i);
            for(int j = 0; j < evenList.size(); j++){
                if(handled == evenList.get(j) && i != j && !doubledElements.contains(handled)){
                    doubledElements.add(handled);
                }
            }
        }

        System.out.println("Doubled elements: " + doubledElements);
    }
}
