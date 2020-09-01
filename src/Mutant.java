
public interface Mutant {
	// -------- PROBLEM: Third shortest
	//  input: strands, an array of Strings
	// output: a String giving the third shortest String from the array
	// method: return the String in the array that is the third shortest. 
	//			If there IS NO THIRD SHORTEST in the array or if the array is null the code should 
	//			throw an IllegalArgumentException.
	//			If there is a tie for the third shortest, any of the tied strings is valid.
	//			If there is a tie for shortest or second shortest, the duplicates do not 
	//						affect the calculation of the third shortest.
	//			The original array should not be altered.
	// Examples:	
	//		thirdShortest(["a", "ab", "and"]) = "and"
	//		thirdShortest(["a", "b", "bc", "ab", "bye", "and"]) = "bye" or "and"
	//		thirdShortest(["a"]) should throw an IllegalArgumentException
	public String thirdShortest(String[] words);
}
