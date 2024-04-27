/*Problem Description
You are given a constant array A.

You are required to return another array which is the reversed form of the input array.



Problem Constraints
1 <= A.size() <= 10000

1 <= A[i] <= 10000



Input Format
First argument is a constant array A.



Output Format
Return an integer array.



Example Input
Input 1:

A = [1,2,3,2,1]
Input 2:

A = [1,1,10]


Example Output
Output 1:

 [1,2,3,2,1] 
Output 2:

 [10,1,1] 

*/

package com.scaler.module_2.assignments.intro.arrays;

import java.util.ArrayList;
import java.util.List;

public class ReverseTheArray {

	public ArrayList<Integer> solve(final List<Integer> A) {
        ArrayList<Integer> AL= new ArrayList<>(A);
        int i; int j=AL.size()-1;
        for(i=0;i<j; i++){
            int temp= AL.get(i);
            AL.set(i,AL.get(j));
            AL.set(j,temp);
            j--;
        }
        return AL;
    }
}
