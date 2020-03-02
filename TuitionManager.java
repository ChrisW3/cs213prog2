import java.util.Scanner;



public interface TuitionManager {
	
	StudentList cs213 = new StudentList();
	
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
	
	//	
//	   
//	   /**
//	   * method that first checks the validity of the date inputted, then calls the remove method in the Team class on the member.
//	   * If remove returns true, then the member was removed successfully. If not, then the member was not in the team.
//	   * @param name  The name of the team member
//	   * @param date  The string start date associated with the team member
//	   */
//	   private void remove(String name, String date)
//	   {
//	      Date newDate = new Date(date);
//	        if (newDate.isValid() == true)
//	        {
//	            TeamMember newMember = new TeamMember(name, newDate);
//	            boolean result = cs213.remove(newMember);
//	            if (result)
//	            {
//	                System.out.println(newMember + " has left the team.");
//	            }else{
//	                System.out.println(newMember + " is not a team member.");
//	            }
//	        }else{
//	            System.out.println(newDate + " is not a valid date!");
//	        }
//		   
//	   } 
	   
	   /**
		   * Calls the print method in the StudentList Class.
		   */
		   private static void print()
		   {
		       cs213.print();
		   } 
	
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

/*abstract class Manager implements TuitionManager{
	
	public static void main(String[] args) {
		
	}
}*/
