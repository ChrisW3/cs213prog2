import java.util.Scanner;

/**
The TuitionManager interface class is used to handle console input and output.
This class calls methods from StudentList which in turn calls methods from Student and the subclasses
of Student. It supports adding, removing, and printing different kinds of students, and also calculates their tuition cost.  
@author Chris Woolley and Kevin Nehrbauer
*/

public interface TuitionManager {
	
	StudentList cs213 = new StudentList();
	   /**
	    * Adds a student to the student list. A student can be in state, out of state, or international.
	    * Based on the type of student, add will call upon methods to calculate the tuition due for that student.
	    * @param type the type of student, can be 'I', 'O', or 'N'
	    * @param fname the first name of the student
	    * @param lname the last name of the student
	    * @param credit the credits this student is taking
	    * @param typeData a boolean for out of state and international students, or an int funds for in state students.
	    */
	   private static void add(String type, String fname, String lname, int credit, String typeData){
		   if(type.equals("I")) {
			   Instate s = new Instate(fname, lname, credit, Integer.parseInt(typeData));
			   if(!cs213.contains(s)) {
				   cs213.add(s);
				   System.out.println("$" + s.tuitionDue());
			   }
		   }
		   else if(type.equals("O")) {
			   boolean check;
			   if(typeData.equals("T")) {
				   check = true;
				   Outstate s = new Outstate(fname, lname, credit, check);
				   if(!cs213.contains(s)) {
					   cs213.add(s);
					   System.out.println("$" + s.tuitionDue());
				   }
			   }
			   else if(typeData.equals("F")) {
				   check = false;
				   Outstate s = new Outstate(fname, lname, credit, check);
				   if(!cs213.contains(s)) {
					   cs213.add(s);
					   System.out.println("$" + s.tuitionDue());
				   }
			   }
			   else {
				   System.out.println("Failed to add: invalid typeData");
			   }
		   }
		   else {
			   boolean check;
			   if(typeData.equals("T")) {
				   check = true;
				   International s = new International(fname, lname, credit, check);
				   if(!cs213.contains(s)) {
					   cs213.add(s);
					   System.out.println("$" + s.tuitionDue());
				   }
			   }
			   else if(typeData.equals("F")) {
				   check = false;
				   International s = new International(fname, lname, credit, check);
				   if(!cs213.contains(s)) {
					   cs213.add(s);
					   System.out.println("$" + s.tuitionDue());
				   }
			   }
			   else {
				   System.out.println("Failed to add: invalid typeData");
			   }
		   }
	   }
	
	   /**
	    * Takes two strings, first name and last name and searches the Student List for a match
	    * If one is found, it is removed from the list.
	    * @param fname first name of student to be removed.
	    * @param lname last name
	    */
	   private static void remove(String fname, String lname) {
		   
		   Instate tempStudent = new Instate(fname, lname, -1, -1);
		   
		   if(cs213.contains(tempStudent)) {
			   System.out.println("found it in there, removing...");
			   cs213.remove(tempStudent);
		   }else {
			   System.out.println("oh no i cant find it");
		   }
	   }
	   
	   
	   /**
		* Calls the print method in the StudentList Class.
		*/
	   private static void print() {
		   
		   cs213.print();
	   }

		   
	/**
	 * The main method of the interface. It will continue to loop and take user input until 
	 * the 'Q' command is given. Acceptable commands are 'I', 'O', 'N' to add a in state, out of state, or international
	 * student. 'R' removes a student based on inputed first name and last name. 'P' prints the list of students entered and their respective tuition costs.
	 * @param args  the arguments taken in by the console.
	 */
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);	
		
		boolean done = false;
		while(!done) {
			
			System.out.println("enter a command:");
			String command = stdin.nextLine();
			//System.out.println("command is "+command.charAt(0));
			String[] info;
			
			switch (command.charAt(0)) {
			
				case 'I':
					info = command.split("\\s+");
					if (info.length == 5){   
						add(info[0], info[1], info[2], Integer.parseInt(info[3]), info[4]);
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
					info = command.split("\\s+");
					if (info.length == 5){   
						add(info[0], info[1], info[2], Integer.parseInt(info[3]), info[4]);
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
				case 'N':
					info = command.split("\\s+");
					if (info.length == 5){   
						add(info[0], info[1], info[2], Integer.parseInt(info[3]), info[4]);
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
				case 'R':
					info = command.split("\\s+");
					if (info.length == 3){   
						remove(info[1], info[2]);
	                }else{
	                    if (info.length < 3)
	                    {
	                         System.out.println("Failed to remove: not enough arguements.");
	                    }else
	                    {
	                         System.out.println("Failed to remove: too many arguements.");
	                    }
	                }
					
					System.out.println("remove");
					break;
				case 'P':
					print();
					break;
				case 'Q':
					done = true;
					break;
				default: //deal with bad command here
	                System.out.println("Command '"+command.charAt(0)+"' is not supported!");
			}
		}
		System.out.println("Program terminated");
	}
	
	

}

