/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cb_act;



/**
 *
 * @author Student.Admin
 */
public class Polymorphism {

    public static void main(String[] args) {
       OperationPolynomial ap = new OperationPolynomial();
       
      
        int A[] = {8, 0, 7, 4};


        int B[] = {2, 4, 3};
        int m = A.length;
        int n = B.length;
        
        System.out.println("First polynomial is");
        ap.print(A, m);
	System.out.println("\nSecond polynomial is");
	ap.print(B, n);
	int sum[] = ap.add(A, B, m, n);
	int size = ap.max(m, n);
	System.out.println("\nSum polynomial is");
	ap.print(sum, size);
        
        System.out.println("\n\nFirst polynomial is");
        ap.print(A, m);
	System.out.println("\nSecond polynomial is");
	ap.print(B, n);
	int difference[] = ap.subtract(A, B, m, n);
	int s = ap.max(m, n);
	System.out.println("\nDifference polynomial is");
	ap.print(difference, s);
        
//        int insertterm[] = ap.insertTerm(4, 5);
        
        
    }
}
