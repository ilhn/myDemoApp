public class App{
	public static boolean ifThereAnyPalindromeString(String[] arr, int... ind) throws Exception{
	//Check if combaning arr arrays elements has been given as an index parameter, could create any palindrome String.
	  	if(arr == null)
	  		throw new Exception("Null array");
	  		
	  	if(ind == null)
	  		throw new Exception("Null parameters");
	  		
	  	if(ind.length < 3)
	  		throw new Exception("Unsuitable array");
	  			
	  	if((index1<0) || (index2<0) || (index3<0))
	  		throw new Exception("Invalid index value");
	  	
	  	int index1 = ind[0];
	  	int index2 = ind[1];
	  	int index3 = ind[2];
	  	boolean result = false;
	  	
	  	String key = "" + arr[index1] + arr[index2] + arr[index3];
	  	result = isPalindrome(key);
	  	if(result)
	  		return result;
	  	
	  	key = "" + arr[index1] + arr[index3] + arr[index2];
	  	result = isPalindrome(key);
	  	if(result)
	  		return result;
	  	//
	  	key = "" + arr[index2] + arr[index1] + arr[index3];
	  	result = isPalindrome(key);
	  	if(result)
	  		return result;
	  	
	  	key = "" + arr[index2] + arr[index3] + arr[index1];
	  	result = isPalindrome(key);
	  	if(result)
	  		return result;
	  	//
	  	key = "" + arr[index3] + arr[index1] + arr[index2];
	  	result = isPalindrome(key);
	  	if(result)
	  		return result;
	  	
	  	key = "" + arr[index3] + arr[index2] + arr[index1];
	  	result = isPalindrome(key);
	  	if(result)
	  		return result;
	  	return false;
	  	//	
	}
	public static boolean isPalindrome(String key){
		int i = 0, j = key.length() - 1;
 
		while (i < j) {
		    // If there is a mismatch
		    if (key.charAt(i) != key.charAt(j))
		        return false;
		    i++;
		    j--;
		}
		return true;
	}
}
