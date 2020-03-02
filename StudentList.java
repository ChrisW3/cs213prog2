public class StudentList {

	private final int NOT_FOUND = -1;
	private final int GROW_SIZE = 4; //initial and grow size
	private Student [] studentList;
	private int numStudents;
	
	/** 
	 * StudentList constructor that initializes the Student array to the GROW_SIZE of 4
	 * as well as numStudents to 0 since it was just created.
	 */
	public StudentList() {
		
		//this is the default constructor
		studentList = new Student[GROW_SIZE];
		numStudents = 0;
	}
	
	/**
	 * Increases the size of the array by the GROW_SIZE of 4, and is called 
	 * in the add method only when the array runs out of space to add students.
	 * Uses a temporary array equal to the size of the stedentList array plus the GROW_SIZE, and copies the content
	 * into the temporary array, then studentList is set to the new array.
	 */
	private void grow() {
		
		Student[] tempStudentList = new Student[numStudents + GROW_SIZE];
		for(int i = 0; i < numStudents; i++) {
			tempStudentList[i] = studentList[i];
		}
		studentList = tempStudentList;
	}
	
	/**
	 * Checks if the StudentList is empty by checking the value of numStudents
	 * @return true is empty, false if otherwise.
	 */
	public boolean isEmpty() {
		
		if(numStudents == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * Searches the Student array StudentList for a Student s, and return the index
	 * of the Student if found.
	 * @param s the student being compared to
	 * @return  index of the found student, -1 if it was not found.
	 */
	private int find(Student s) {
		
		if(numStudents == 0) {
			return NOT_FOUND;
		}else {
			for(int i = 0; i < numStudents; i++) {
				if(s.compareTo(studentList[i]) == 0) {
					return i;
				}
			}
		}
		return NOT_FOUND;
	}
	
	/**
	 * Adds a given Student s to the end of the StudentList.
	 * First it checks to see if the array is full, if it is it calls grow to increase
	 * the size of the array, then loops to the end of the array and adds Student s
	 * @param s  the student to be added to StudentList.
	 */
	public void add(Student s) {
		
		if(numStudents == studentList.length) {
			grow();
		}
		int i = 0;
		while(i < numStudents) {
			i++;
		}
		studentList[i] = s;
		numStudents++;
	}
	
	/**
	 * Removes a Student s from the student list if they exist. 
	 * First it uses the find function to get the index of the student in the student list,
	 * if it returns -1 then it is not in the array, otherwise it will replace the last element in the array
	 * with the found index, and set the last array element to null.
	 * @param s  student to be removed
	 * @return  true if the student was successfully removed, false if otherwise.
	 */
	public boolean remove(Student s) {
		
		int index = find(s);
		if(index != NOT_FOUND) { //Student was found and will be removed
			int i = 0;
			while(i < numStudents) {
				i++;
			}
			i--;
			Student temp = studentList[i];
			if(i != index) {
				studentList[index] = temp;
			}
			studentList[i] = null;
			numStudents--;
			return true;
		}else {
			return false;
		}
	}
	
	
	/**
	    * Checks to see if the team contains a particular TeamMember m, goes through the
	    * whole list and returns true if found, false otherwise
	    * @param m TeamMember that we are checking for in the team array
	    * @return true if the TeamMember is found, false otherwise
	    */
	public boolean contains(Student s)
	   {
		  for(int i = 0; i < numStudents; i++) {
			  if(studentList[i].compareTo(s) == 0)
				  return true;
		  }
	      return false;
	   } 
	
	/**
	 * Prints each student and their tuition due on their own line, 
	 * if there are no students, then it will say so.
	 */
	public void print() {
		
		if(numStudents == 0) {
			System.out.println("There are no students in the student list");
		}else {
			for(int i = 0; i < numStudents; i++) {
				System.out.println(studentList[i].toString() + "  tuition dude: $" + studentList[i].tuitionDue());
			}
			System.out.println("-- end of list --");
		}
	}
	
	
	
	
	
	
}
