/*Problem Description
Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.


Problem Constraints
1 <= N <= 105
-109 <= A[i] <= 109


Input Format
First argument A is an integer array.


Output Format
Return the sum of maximum and minimum element of the array


Example Input
Input 1:

A = [-2, 1, -4, 5, 3]
Input 2:

A = [1, 3, 4, 1]
*/

package com.scaler.module_2.assignments.intro.arrays;

import java.util.ArrayList;

public class MaxMinOfArray {

	public int solve(ArrayList<Integer> A) {
        //int max=(int)Math.pow(-10,9);
        //int min=(int)Math.pow(10,5);
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<A.size();i++){
            //max=A.get(i);
            if(A.get(i)>max){
                max=A.get(i);
            }
        }
        for(int j=0;j<A.size();j++){
            //min =A.get(j);
            if(A.get(j)<min){
                min=A.get(j);
            }
        }
        return max+min;
    }
}

