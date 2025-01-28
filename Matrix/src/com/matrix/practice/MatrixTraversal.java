package com.matrix.practice;

import java.util.ArrayList;
import java.util.List;

public class MatrixTraversal {
	
	public static final int N=3;
	public static final int M=3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		List<String> cmd = new ArrayList<String>();
		cmd.add("left");
		cmd.add("down");
		cmd.add("right");
		cmd.add("down");
		
		System.out.print("matrix traversal using recursion : ");
		traverse(arr, 0, 0);
		System.out.print("\tmatrix traversal command game using loop : "+loopTraversal(arr,cmd));
		

	}

	private static int loopTraversal(int[][] arr, List<String> cmd) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = 0;
		int tmp = arr[i][j];
		
		for(String str : cmd) {
			
			if(str.equalsIgnoreCase("right")) {
				if(j!=N&&j!=N-1) {
					j++;
					tmp=arr[i][j];
				}
				else {
					break;
				}
			}
			else if(str.equalsIgnoreCase("down")) {
				if(i!=M&&i!=M-1) {
					i++;
					tmp=arr[i][j];
				}
				else {
					break;
				}
			}
			else if(str.equalsIgnoreCase("left")) {
				if(j!=0&&j<0) {
					j--;
					tmp=arr[i][j];
				}
				else {
					break;
				}
			}
			else if(str.equalsIgnoreCase("up")){
				if(i!=0&&i<0) {
					i--;
					tmp=arr[i][j];
				}
				else {
					break;
				}
			}
			else {
				break;
			}
		}
		return tmp;
		
		
	}

	private static void traverse(int[][] arr, int i, int j) {
		// TODO Auto-generated method stub
		
		if(i==N-1&&j==M-1) {
			System.out.print(arr[i][j]);
			return;
		}
		
		System.out.print(arr[i][j]+", ");
		
		if(j< M-1) {
			traverse(arr, i, j+1);
		}
		else if(i<N-1) {
			traverse(arr, i+1, 0);
		}
		
	}

}
