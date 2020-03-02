
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
			//tempStudentList[i] = new Student(studentList[i].getName(), studentList[i].getStartDate());
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
	
	
}
