package clarkAuto;

public class MainParser {
//	private static FirstClark clarkInstance;
	private static String[] caseNumbers;
 
	public MainParser() {
//		clarkInstance = new FirstClark();
	}

	public static void main(String[] args) throws Exception {
//		clarkInstance.setUp();
//		clarkInstance.testFirstClark();
		caseNumbers = new String[100];
		CaseInput testInput = new CaseInput();
		testInput.open();
		testInput.read();
		testInput.initializeArray(caseNumbers);
		testInput.close();
	}

}
