
package project8;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Project8 {

    public static void main(String[] args) {
        
        //user define the length of the array
        int size;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        size = in.nextInt();
        
        //creation of the array of size defined
        Random rand = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length;i++)
            array[i] = rand.nextInt(1001);
        
        
        //time calculation BubbleSort
        long start = System.currentTimeMillis();
        SortingAlgorithms.BubbleSort(array.clone());
        long elabsed = System.currentTimeMillis() - start;
        System.out.println("Bubble Sort: "+elabsed+" (ms.)");
        
        //time calculation BubbleSortCS
        start = System.currentTimeMillis();
        SortingAlgorithms.BubbleSortCS(array.clone());
        elabsed = System.currentTimeMillis() - start;
        System.out.println("Bubble Sort (SC): "+elabsed+" (ms.)");
        
        //time GnomeSort
        start = System.currentTimeMillis();
        SortingAlgorithms.GnomeSort(array.clone());
        elabsed = System.currentTimeMillis() - start;
        System.out.println("Gnome Sort: "+elabsed+" (ms.)");
        
        //time calculation SelectionSort
        start = System.currentTimeMillis();
        SortingAlgorithms.SelectionSort(array.clone());
        elabsed = System.currentTimeMillis() - start;
        System.out.println("Selection Sort: "+elabsed+" (ms.)");
        
        //time calculation InsertionSort
        start = System.currentTimeMillis();
        SortingAlgorithms.InsertionSort(array.clone());
        elabsed = System.currentTimeMillis() - start;
        System.out.println("Insertion Sort: "+elabsed+" (ms.)");
        
        //time MergeSort
        start = System.currentTimeMillis();
        SortingAlgorithms.MergeSort(array.clone());
        elabsed = System.currentTimeMillis() - start;
        System.out.println("Merge Sort: "+elabsed+" (ms.)");
        
        //time Java Sort
        start = System.currentTimeMillis();
        Arrays.sort(array.clone());
        elabsed = System.currentTimeMillis() - start;
        System.out.println("Java Sort: "+elabsed+" (ms.)");
        
        //time QuickSort
        start = System.currentTimeMillis();
        SortingAlgorithms.QuickSort(array.clone(),0,array.length-1);
        elabsed = System.currentTimeMillis() - start;
        System.out.println("Quick Sort: "+elabsed+" (ms.)");
    }
    
}
