package studio3;

import java.util.Scanner;

public class sieve {
/*Pseudo code
 * algorithm Sieve of Eratosthenes is
    input: an integer n > 1.
    output: all prime numbers from 2 through n.

    let A be an array of Boolean values, indexed by integers 2 to n,
    initially all set to true.
    
    for i = 2, 3, 4, ..., not exceeding √n do
        if A[i] is true
            for j = i^2, i^2+i, i^2+2i, i^2+3i, ..., not exceeding n do
                set A[j] := false

    return all i such that A[i] is true.
 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value for n:");
		int n = scan.nextInt();
		boolean [] name = new boolean[n+1];
		/* Creating an array of booleans, initializing them by setting all index values as true
		 * as per the pseudo code above.
		 */
		for (int i = 2; i < name.length; i++) { 
			name[i] = true;
		}
		for (int i = 2; i < Math.sqrt(name.length); i++) { 
			if (name[i]) {
				for (int j = (int) Math.pow(i, 2); j <= n; j = j + i) {
					name[j] = false;
				}
			}
		}
		for (int i = 2; i < name.length; i++) {
			if (name[i] == true) {
				System.out.println(i + " is a prime number");
			}
		}
	}

}
