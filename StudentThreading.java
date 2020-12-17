
public class StudentThreading {

	public static void main(String[] args) {
		
		StudentThreading string= new StudentThreading();
		string.new PrintStudentThreading("Student Name is:\n Amr"," Student Email is:\n Amr@gmail.com", "Student Age is:\n 19"
				, "Student Faculty is:\n Computer", "Student Phone is:\n 010","Student Grade is:\n Good");
		string.new PrintStudentThreading("Student Name is:\n Ahmed"," Student Email is:\n Ahmed@gmail.com", "Student Age is:\n 20"
				, "Student Faculty is:\n Engineering", "Student Phone is:\n 011","Student Grade is:\n Very Good");
		string.new PrintStudentThreading("Student Name is:\n Mohamed"," Student Email is:\n Mohamed@gmail.com", "Student Age is:\n 21"
				, "Student Faculty is:\n Pharmacy", "Student Phone is:\n 012","Student Grade is:\n Excelent");
	}
	public synchronized	 static void print(String s1, String s2, String s3, String s4, String s5, String s6) {

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);

	}	
		class PrintStudentThreading implements Runnable {
			
			Thread thread;
			String s1, s2, s3 ,s4 ,s5 ,s6;
			
		public PrintStudentThreading (String studentName, String studentEmail, String studentAge, String studentFaculty, String studentPhone,
				String studentGrade){
			
			s1 = studentName;
			s2 = studentEmail;
			s3 = studentAge;
			s4 = studentFaculty;
			s5 = studentPhone;
			s6 = studentGrade;
			thread=new Thread(this);
			thread.start();
			
	}
			@Override
			public void run() {
				
			StudentThreading.print(s1, s2, s3, s4 ,s5 ,s6);
			
			}
			
		}
	}

