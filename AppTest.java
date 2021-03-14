public class AppTest{
	App app = new App();
	
	@Test
	public void checkArrayIsNull{
		String[] arr = new String[10];
		app.ifThereAnyPalindromeString(arr, 1, 2, 3);
	}
	@Test
	public void checkArrayIsNull{
		String[] arr = new String[]{"12","21","334","2224"};
		app.ifThereAnyPalindromeString(arr, 1, 2, 3);
	}
	@Test
	public void checkArrayIsNull{
		String[] arr = new String[]{"12","21","334","2224"};
		app.ifThereAnyPalindromeString(arr, -1, 2, 3);
	}
	@Test
	public void checkArrayIsNull{
		String[] arr = new String[]{"12","21","334","2224"};
		app.ifThereAnyPalindromeString(arr, -1, 2);
	}
	@Test
	public void checkArrayIsNull{
		String[] arr = new String[]{"12","21","334","2224"};
		app.ifThereAnyPalindromeString(arr);
	}
	
}
