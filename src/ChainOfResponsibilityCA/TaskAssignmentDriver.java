package ChainOfResponsibilityCA;

public class TaskAssignmentDriver {

    public static void main(String[] args) {
        User owner = new User("Owner", "ownerpassword");
        User ceo = new User("CEO", "ceopassword");
        User manager = new User("Manager", "managerpassword");
        User employee = new User("Employee", "employeepassword");

        AssignOwnerTask assignTask = new AssignOwnerTask();

        assignTask.getTask(owner);
        assignTask.getTask(ceo);
        assignTask.getTask(manager);
        assignTask.getTask(employee);
    }
}
