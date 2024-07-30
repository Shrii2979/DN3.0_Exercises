package example.mvcpattern;

public class MVCPatterntest {

	public static void main(String[] args) {
		Student model = new Student("1", "Jaishree", "A");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        
        controller.updateView();

        
        controller.setStudentName("Allan Richard");
        controller.setStudentGrade("B");

        
        controller.updateView();
    }

	}

