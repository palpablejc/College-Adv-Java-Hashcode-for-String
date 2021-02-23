
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

/*
*CIS 315 HashCodeForString
*@version 1.0 7/21/18
*@author John Carter jcarter6@una.edu
*/

public class HashCodeForString {

	public static void main(String[] args) {

		// Create a hash set

		Set<String> set = new HashSet<>();

		// Add strings to the set

		set.add("CIS 315");

		set.add("Java");

		set.add("John Carter"); // Replaced "John Doe" with my name

		set.add("Programming");



		ArrayList<String> myArrayList =

				setToList

				(set);

		// Display the hash code for each element in the array list

		for (String str : myArrayList) {

			System.out.println("The hash code for \"" + str + "\" = " + hashCodeForString(str));

		}

	}

	// Return a hash code for a string

	//h(s)=s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]

	public static int hashCodeForString(String s) {

		int h=0;

		for (int i = 0; i < s.length(); i++) {

			h = 31 * h + s.charAt(i);

		}

		return h;

	}

	// Return an ArrayList from a set

	public static <E> ArrayList<E> setToList(Set<E> s) {

		ArrayList<E> list = new ArrayList<E>(s);

		return list;

	}

}