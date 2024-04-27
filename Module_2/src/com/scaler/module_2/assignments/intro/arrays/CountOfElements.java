/*Problem Description
Given an array A of N integers. 
Count the number of elements that have at least 1 elements greater than itself.


Problem Constraints
1 <= N <= 105
1 <= A[i] <= 109


Input Format
First and only argument is an array of integers A.


Output Format
Return the count of elements.


Example Input
Input 1:
A = [3, 1, 2]
Input 2:
A = [5, 5, 3]


Example Output
Output 1:
2
Output 2:
1

*/

package com.scaler.module_2.assignments.intro.arrays;

import java.util.ArrayList;

public class CountOfElements {
    public int solve(ArrayList<Integer> A) {
        int max =0;
        for(int i=0; i<A.size(); i++) {
            if(A.get(i)>max){
                max=A.get(i);
            }
        }
        int count =0;
        for(int i=0; i<A.size(); i++) {
            if (A.get(i)==max){
                count++;
            }
        }
        return A.size()-count;
    }
}

