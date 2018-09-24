/*Name: Anthony Edwards
 * Date: 09/23/2018
 * Description: This project utilizes a binary search algorithm to search for a users 
 * input. the main method calls bin() to do so.
 */
package searching_and_Sorting_Algorithms;

import java.util.Scanner;

public class Binary_Search {
	public static int Bin(int [] nums, int key) {
		int low = 0;
		int middle = 0;
		int high = nums.length-1;//sets the upper bound of our search 
		while(high>=low) {//ensures that program will only
			//run wile the upper bound is greater than the lower bound
			middle= (high+low)/2;//sets the starting point
			if(nums[middle]<key) {
				low=middle+1;//resets lower bound above middle number
			}
			else if (nums[middle]>key) {
				high = middle - 1;//resets higher bound below middle number
			}
			else {
				return middle;//returns index of found number
			}
		}
		return -1;//returns if not found
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,2,3,4,56,88,99,201,343,535};
		int index = 0;
		for(int i = 0;i < nums.length;i++ ) {
			System.out.println(nums[i]);
		}
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int key = input.nextInt();
		input.close();
		index = Bin(nums, key);
		if(index == -1) {
			System.out.printf("%s was not found.",key);
		}else {
			System.out.printf("%s was found at index %s.",key,index);

		}
	}

}
