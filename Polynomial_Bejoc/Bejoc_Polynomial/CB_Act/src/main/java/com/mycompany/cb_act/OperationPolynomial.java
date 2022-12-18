/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cb_act;

/**
 *
 * @author Student.Admin
 */
// Java program to add two polynomials

public class OperationPolynomial {
    public static final int MAX_NUMBER_OF_COEFFICIENTS = 30;
    private int[] coe = new int[MAX_NUMBER_OF_COEFFICIENTS];

// A utility function to return maximum of two integers
	public static int max(int m, int n) {
		return (m > n) ? m : n;
	}

// A[] represents coefficients of first polynomial
// B[] represents coefficients of second polynomial
// m and n are sizes of A[] and B[] respectively
	public static int[] add(int coe[], int expo[], int m, int n) {
		int size = max(m, n);
		int sum[] = new int[size];

// Initialize the product polynomial
		for (int i = 0; i < m; i++) {
			sum[i] = coe[i];
		}

// Take ever term of first polynomial
		for (int i = 0; i < n; i++) {
			sum[i] += expo[i];
		}

		return sum;
	}
        public static int[] subtract(int coe[], int expo[], int m, int n) {
		int size = max(m, n);
		int difference[] = new int[size];

// Initialize the product polynomial
		for (int i = 0; i < m; i++) {
			difference[i] = coe[i];
		}

// Take ever term of first polynomial
		for (int i = 0; i < n; i++) {
			difference[i] -= expo[i];
		}

		return difference;
	}

// A utility function to print a polynomial
	public static void print(int poly[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(poly[i]);
			if (i != 0) {
				System.out.print("x^" + i);
			}
			if (i != n - 1) {
				System.out.print(" + ");
			}
		}
	}
        public void  insertTerm(int coef, int expo, int m, int n) {
             int size = max(m,n);
             int insertterm[] = new int[size];
                coe[expo] += coef;
                
        }

        public void  removeTerm(int coef, int expo, int m, int n) {
             int size = max(m,n);
             int removeterm[] = new int[size];
                coe[expo] -= coef;
                
        }

}


