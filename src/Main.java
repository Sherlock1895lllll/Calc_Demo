
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("The number entered by the user from the console is:"+args[0]);
		String path = "result.txt";
		WriteToFile wtf = new WriteToFile(path);
		System.out.println("Success!");
	}

}
