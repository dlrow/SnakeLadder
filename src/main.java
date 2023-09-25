import jdk.nashorn.internal.objects.annotations.Getter;

import java.util.ArrayList;
import java.util.List;
interface ISort
{
    void Sort(List<String> list);
}

// QuickSort implementation
class CQuickSorter implements ISort{

    @Override
    public void Sort(List<String> list) {

    }
}

// BubbleSort implementation
class CBubbleSort implements ISort{
    @Override
    public void Sort(List<String> list) {
        // The actual implementation of the sort
        }
}

class Context
{
    private ISort sorter;

    public Context(ISort sorter)
    {// We pass to the context the strategy to use
        this.sorter = sorter;
    }

    public ISort getSorter(){
        return this.sorter;
    }

}

public class main
    {
        public static void main(String[] args) {

            System.out.println(isPalindrome("aabccbaa"));
        }



        public  static boolean isPalindrome(String str)
        {
            int i = 0;
            int j = str.length()-1;

            while(i<j){
                if(str.charAt(i)!=str.charAt(j))
                    break;
                i++;
                j--;
            }

            return i>j;
        }
    }