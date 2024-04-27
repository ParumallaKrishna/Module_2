/*Given an integer array A of size N and an integer B, you have to return the same array after rotating it B times towards the right.


Problem Constraints
1 <= N <= 105
1 <= A[i] <=109
1 <= B <= 109


Input Format
The first argument given is the integer array A.
The second argument given is the integer B.


Output Format
Return the array A after rotating it B times to the right


Example Input
Input 1:

A = [1, 2, 3, 4]
B = 2
Input 2:

A = [2, 5, 6]
B = 1


Example Output
Output 1:

[3, 4, 1, 2]
Output 2:

[6, 2, 5]

*/
package com.scaler.module_2.assignments.intro.arrays;

import java.util.ArrayList;

public class ArrayRotate {

	public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        int j=A.size();
        int k=B%j;
          //ArrayList<Integer> ans= new ArrayList<>(j);
             reverse(A,0,j-1);
             reverse(A,0,k-1);
             reverse(A,k,j-1);
        
        return A;
    }

        public ArrayList<Integer> reverse(ArrayList<Integer> A, int c, int D){
            //ArrayList<Integer> E = new ArrayList(A);
            int i; int j=D;
            for(i=c; i<j;i++){
                int temp= A.get(i);
                A.set(i,A.get(j));
                A.set(j,temp);
                j--;
            }
            return A;
        }
}

