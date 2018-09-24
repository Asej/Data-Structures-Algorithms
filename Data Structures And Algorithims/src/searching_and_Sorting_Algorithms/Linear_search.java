/*Name: Anthony Edwards
 * Date: 09/23/2018
 * Description: This project utilizes a linear search algorithm to search for a users 
 * input. the main method calls linesearch() to do so.
 */

package searching_and_Sorting_Algorithms;
import java.util.*;


public class Linear_search {
	public static int linesearch (int [] numbrs, int key) {
		for(int i = 0;i<numbrs.length;i++) {
			if(key == numbrs[i]) {
				key=i;
				break;//stops if key is found
			}else {
				key = -1;//returns if key not found
			}
		}
		return key;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("yyy");
		int []numbers= {2,4,5,43,3,553,1};//initializes array to search
		System.out.println("Enter a number:");
		int k = scan.nextInt();//sets number to look for
		scan.close();//closes scanner 
		int index = linesearch(numbers,k);//calls search function
		if(index!=-1) {
			System.out.printf(k+" was found at index %s", index);
		}else {
			System.out.printf("%s was not found",k);
		}

	}

}
