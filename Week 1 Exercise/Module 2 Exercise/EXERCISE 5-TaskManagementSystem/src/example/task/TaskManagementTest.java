package example.task;

public class TaskManagementTest {

	public static void main(String[] args) {
		SinglyLinkedList taskList = new SinglyLinkedList();

        // Adding tasks
        taskList.addTask(new Task(1, "Task 1", "Pending"));
        taskList.addTask(new Task(2, "Task 2", "In Progress"));
        taskList.addTask(new Task(3, "Task 3", "Completed"));

        // Traversing tasks
        System.out.println("All Tasks:");
        taskList.traverseTasks();

        // Searching for a task
        System.out.println("Search Task with ID 2:");
        Task task = taskList.searchTask(2);
        System.out.println(task != null ? task : "Task not found");

        // Deleting a task
        System.out.println("Deleting Task with ID 2:");
        boolean isDeleted = taskList.deleteTask(2);
        System.out.println(isDeleted ? "Task deleted" : "Task not found");

        // Traversing tasks after deletion
        System.out.println("All Tasks after deletion:");
        taskList.traverseTasks();
		
	}

}
