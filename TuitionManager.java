import java.util.Scanner;



public interface TuitionManager {

	void add();
	void remove();
	void print();
	
	public static void main(String[] args) {
		System.out.println("yabbo");
		Scanner stdin = new Scanner(System.in);
		StudentList cs213 = new StudentList();
		
		boolean done = false;
		System.out.println("starting:");
		while(!done) {
			System.out.println("enter a command:");
			String command = stdin.nextLine();
			//System.out.println("command is "+command.charAt(0));
			String[] info;
			
			switch (command.charAt(0)) {
			
				case 'I':
					System.out.println("In state");
					info = command.split("\\s+");
					if (info.length == 5){   
						int credit = Integer.parseInt(info[3]);
	                    //add(info[1], info[2], credit, info[4]); 
	                }else{
	                    if (info.length < 5)
	                    {
	                         System.out.println("Failed to add: not enough arguements.");
	                    }else
	                    {
	                         System.out.println("Failed to add: too many arguements.");
	                    }
	                }
					break;
	                
				case 'O':
					System.out.println("Out of state");
					break;
				case 'N':
					System.out.println("International");
					break;
				case 'R':
					System.out.println("remove");
					break;
				case 'P':
					System.out.println("print");
					break;
				case 'Q':
					System.out.println("quit");
					done = true;
					break;
				default: //deal with bad command here
	                System.out.println("Command '"+command.charAt(0)+"' is not supported!");
			}
		}
		System.out.println("Program terminated");
	}
	
	
	
}

/*abstract class Manager implements TuitionManager{
	
	public static void main(String[] args) {
		
	}
}*/