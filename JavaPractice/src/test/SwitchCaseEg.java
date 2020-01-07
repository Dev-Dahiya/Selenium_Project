package test;

public class SwitchCaseEg {
	public static void main(String[] args){
		int i = 5, j = 6;
		String name = "Dev";
				
		switch(name){
			case "9":
				System.out.println("Case 1");
				break;
			case "Dev":
				System.out.println("Case 2");
				switch(j){
				case 5:
					System.out.println("j = 5");
					break;
				case 6:
					System.out.println("j = 6");
					break;
				}
				
			case "dev":
				System.out.println("Case 3");
//				break;
			case "10":
				System.out.println("Case 4");
//				break;
			default:
				System.out.println("Default");
		}
	}

}
