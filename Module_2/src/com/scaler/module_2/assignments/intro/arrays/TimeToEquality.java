/*Problem Description
Given an integer array A of size N. In one second, you can increase the value of one element by 1.

Find the minimum time in seconds to make all elements of the array equal.


Problem Constraints
1 <= N <= 1000000
1 <= A[i] <= 1000


Input Format
First argument is an integer array A.


Output Format
Return an integer denoting the minimum time to make all elements equal.


Example Input
A = [2, 4, 1, 3, 2]


Example Output
8


Example Explanation
We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8 seconds.
*/


package com.scaler.module_2.assignments.intro.arrays;

import java.util.ArrayList;

public class TimeToEquality {

	public int solve(ArrayList<Integer> A) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<A.size();i++){
            if(A.get(i)>max){
                max=A.get(i);
            }
        }
        int count=0;
        int i;
        for(i=0;i<A.size();i++){
            for(int j=0;j<max;j++){
            if(A.get(i)<max){
                A.set(i,A.get(i)+1);
                count++;
            }
            }
        }
        return count;
    }
}

