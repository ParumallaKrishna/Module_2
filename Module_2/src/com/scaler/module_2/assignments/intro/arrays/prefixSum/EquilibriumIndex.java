/*Problem Description
You are given an array A of integers of size N.

Your task is to find the equilibrium index of the given array

The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.

If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is considered as 0.

Note:

Array indexing starts from 0.
If there is no equilibrium index then return -1.
If there are more than one equilibrium indexes then return the minimum index.


Problem Constraints
1 <= N <= 105
-105 <= A[i] <= 105


Input Format
First arugment is an array A .


Output Format
Return the equilibrium index of the given array. If no such index is found then return -1.


Example Input
Input 1:
A = [-7, 1, 5, 2, -4, 3, 0]
Input 2:

A = [1, 2, 3]


Example Output
Output 1:
3
Output 2:

-1

*/

package com.scaler.module_2.assignments.intro.arrays.prefixSum;

import java.util.ArrayList;

public class EquilibriumIndex {

	public int solve(ArrayList<Integer> A) {
        ArrayList<Integer> AL = new ArrayList<>();
        AL.add(A.get(0));
     for(int i=1;i<A.size();i++){
         AL.add(A.get(i)+AL.get(i-1));
        }
        for(int i =0;i<A.size();i++){
         int leftSum= 0;
         if(i>0){
             leftSum = AL.get(i-1); 
         }
         int rightSum =0;
         rightSum =AL.get(A.size()-1)-AL.get(i);
         if(leftSum==rightSum){
             return i;
         }
        }
        return -1;
    }
}
