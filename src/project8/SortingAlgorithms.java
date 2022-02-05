
package project8;

public class SortingAlgorithms {
    
    public static void BubbleSort(int[] array){
         
        for(int i=0; i < array.length - 1; i++)
            for(int j = 0; j < array.length-i-1;j++)
                if(array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
    }
    
    public static void BubbleSortCS(int[] array){
        
        for(int i = 0; i < array.length - 1; i++)
        {
            boolean swap = false;
            for(int j = 0; j < array.length - i - 1; j++)
            {
                if(array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap)
                break;
        }
    }
    
    public static void SelectionSort(int[] array){
        
        for (int i = 0; i < array.length - 1; i++)
        {
            int index = i;
            for (int j = i+1; j < array.length; j++)
                if(array[j] < array[index])
                    index = j;
            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }
        
    }
    
    public static void InsertionSort(int[] array){
        
        int i;
        int key;
        int j;
        for (i = 1; i < array.length; i++)
        {
            key = array[i];
            j = i - 1;
            
            while(j >= 0 && array[j] > key)
            {
                array[j+1]=array[j];
                j = j - 1;
            }
            
            array[j+1] = key;
        }
    }
    
    public static void MergeSort(int[] array){
        
        if (array.length < 2)
            return;
        
        int mid = array.length / 2;
        int[] l = new int[mid];
        int[] r = new int[array.length - mid];
        
        for (int i = 0; i < mid; i++)
            l[i] = array[i];
        
        for (int i = mid; i < array.length; i++)
            r[i - mid] = array[i];
        
        MergeSort(l);
        MergeSort(r);
        
        Merge(array, l, r, mid, array.length - mid);
    }
    
    public static void Merge(int[] array, int[] l, int[] r, int left, int right){
        
        int i = 0, j = 0, k = 0;
        while (i < left && j < right)
        {
            if (l[i] <= r[j])
            {
                array[k] = l[i];
                i++;
            }
            else
            {
                array[k] = r[j]; j++;
            }
            k++;
        }
        while (i < left)
            array[k++] = l[i++];
        while (j < right)
            array[k++] = r[j++];
    }
    
    public static void GnomeSort(int array[])
    {
        int index = 0;
 
        while (index < array.length) {
            if (index == 0)
                index++;
            if (array[index] >= array[index - 1])
                index++;
            else {
                int temp;
                temp = array[index];
                array[index] = array[index - 1];
                array[index - 1] = temp;
                index--;
            }
        }
    }
    
    public static void QuickSort(int[] array, int low, int high) 
    {
        if (low >= high){
            return;
        }
 
        
        int middle = low + (high - low) / 2;
        int pivot = array[middle];

        int i = low, j = high;
        while (i <= j) 
        {
            while (array[i] < pivot) 
            {
                i++;
            }
            while (array[j] > pivot) 
            {
                j--;
            }
            if (i <= j) 
            {
                swap (array, i, j);
                i++;
                j--;
            }
        }
        if (low < j){
            QuickSort(array, low, j);
        }
        if (high > i){
            QuickSort(array, i, high);
        }
    }
     
    public static void swap (int[] array, int x, int y)
    {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}

