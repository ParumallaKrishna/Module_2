/*Problem Description
Given an array A of N integers and also given two integers B and C. Reverse the elements of the array A within the given inclusive range [B, C].


Problem Constraints
1 <= N <= 105
1 <= A[i] <= 109
0 <= B <= C <= N - 1


Input Format
The first argument A is an array of integer.
The second and third arguments are integers B and C


Output Format
Return the array A after reversing in the given range.


Example Input
Input 1:

A = [1, 2, 3, 4]
B = 2
C = 3
Input 2:

A = [2, 5, 6]
B = 0
C = 2


Example Output
Output 1:

[1, 2, 4, 3]
Output 2:

[6, 5, 2]
*/


package com.scaler.module_2.assignments.intro.arrays;

import java.util.ArrayList;

public class ReverseInRange {

	public ArrayList<Integer> solve(ArrayList<Integer> A, int B, int C) {
        int i; int j=C;
        for(i=B;i<j;i++){
            int temp = A.get(i);
            A.set(i, A.get(j));
            A.set(j, temp);
            j--;
        }
        return A;
    }
}
