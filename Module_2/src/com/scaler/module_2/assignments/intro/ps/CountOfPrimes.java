/*Problem Description
You will be given an integer n. You need to return the count of prime numbers less than or equal to n.
Problem Constraints
0 <= n <= 10^3
Input Format
Single input parameter n in function.
Output Format
Return the count of prime numbers less than or equal to n.
Example Input
Input 1:
19
Input 2:
1
Example Output
Output 1:
8
Output 2:
0
*/
package com.scaler.module_2.assignments;
public class CountOfPrimes {
    public int solve(int A) {
        //if(A<=1){return 0;}
        int count = 0;
        for(int i=0;i<=A;i++){
            if(IsPrime(i)){ count=count+1;}
        }
        return count;
    }
    public boolean IsPrime(int B){
        if(B<=1){return false;}
        for(int i=2;i<B;i++){
            if(B%i==0){return false;}
        }
        return true;

    }
}




