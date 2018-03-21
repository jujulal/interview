package DataStructure;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bibek on 3/21/2018.
 *
 * Write a program which takes as input an array of digits encoding a nonnegetive single decimal iteger D and
 * updates the array to represent the integer D+1. For example, if the input array is [1, 2, 9] then you should
 * update the array to [1, 3, 0], and if input array is [9, 9, 9] then should be the array to [1, 0, 0, 0].
 */
public class IncrementArbitraryPrecision {

    public static List<Integer> plusOne(List<Integer> integerList){
        int size = integerList.size()-1;
        integerList.set(size,integerList.get(size)+1);
        for(int i= size; i> 0 && integerList.get(i)== 10; --i){
            integerList.set(i,0);
            integerList.set(i-1,integerList.get(i-1)+1);
        }
        if(integerList.get(0)==10){
            integerList.set(0,1);
            integerList.add(0);
        }
        return integerList;
    }
    public static void main(String args[]){
        List<Integer> A = new ArrayList<>();
        A.add(9); A.add(9); A.add(9);

        System.out.println("Original Array: "+ A.toString());
        System.out.println("Incremented Arbitary Precision at Array: " + plusOne(A).toString());
    }
}
