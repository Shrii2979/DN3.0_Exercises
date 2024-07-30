package example.task;

public class SinglyLinkedList {
	private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    // Method to add a task
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Method to search for a task by taskId
    public Task searchTask(int taskId) {
        Node temp = head;
        while (temp != null) {
            if (temp.task.getTaskId() == taskId) {
                return temp.task;
            }
            temp = temp.next;
        }
        return null; // Task not found
    }

    // Method to traverse and display all tasks
    public void traverseTasks() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.task);
            temp = temp.next;
        }
    }

    // Method to delete a task by taskId
    public boolean deleteTask(int taskId) {
        if (head == null) {
            return false; // List is empty
        }

        if (head.task.getTaskId() == taskId) {
            head = head.next;
            return true;
        }

        Node temp = head;
        while (temp.next != null && temp.next.task.getTaskId() != taskId) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
            return true;
        }

        return false; // Task not found

}
}
