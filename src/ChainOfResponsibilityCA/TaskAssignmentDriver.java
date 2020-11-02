package ChainOfResponsibilityCA;

public class TaskAssignmentDriver {

    public static void main(String[] args) {
        Chain ownerChain = new AssignOwnerTask();
        Chain ceoChain = new AssignCEOTask();
        Chain managerChain = new AssignManagerTask();
        Chain employeeChain = new AssignEmployeeTask();

        ownerChain.setNextChain(ceoChain);
        ceoChain.setNextChain(managerChain);
        managerChain.setNextChain(employeeChain);

//        User user = new User("Owner","ownerpassword");
//        User user = new User("CEO","ceopassword");
//        User user = new User("Manager","managerpassword");
//        User user = new User("Employee","employeepassword");
          User user = new User("Incorrect Details","Incorrect Details");




        ownerChain.assignTask(user);
    }
}
