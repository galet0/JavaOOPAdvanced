package _02_generics._09_customListIterator;

import _02_generics._09_customListIterator.interfaces.CustomList;
import _02_generics._09_customListIterator.interfaces.Sorter;
import _02_generics._09_customListIterator.models.CustomListImpl;
import _02_generics._09_customListIterator.models.SorterImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 21.07.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CustomList<String> customList = new CustomListImpl<>();

        while (true){
            String input = reader.readLine();
            if(input.equals("END")){
                break;
            }
            String[] params = input.split("\\s+");
            switch (params[0]){
                case "Add":
                    customList.add(params[1]);
                    break;
                case "Remove":
                    customList.remove(Integer.parseInt(params[1]));
                    break;
                case "Contains":
                    System.out.println(customList.contains(params[1]));
                    break;
                case "Swap":
                    int firstIndex = Integer.parseInt(params[1]);
                    int secondIndex = Integer.parseInt(params[2]);
                    customList.swap(firstIndex, secondIndex);
                    break;
                case "Greater":
                    System.out.println(customList.countGreaterThat(params[1]));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Print":
                    for (String s : customList) {
                        System.out.println(s);
                    }
                    break;
                case "Sort":
                    Sorter<String> sorter = new SorterImpl<>();
                    sorter.sort(customList);
                    break;
                default:
                    break;
            }
        }
    }
}
