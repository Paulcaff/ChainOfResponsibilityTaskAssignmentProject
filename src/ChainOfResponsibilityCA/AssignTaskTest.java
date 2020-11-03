package ChainOfResponsibilityCA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssignTaskTest  {

    User user = new User();
    Chain ownerChain = new AssignOwnerTask();
    Chain ceoChain = new AssignCEOTask();
    Chain managerChain = new AssignManagerTask();
    Chain employeeChain = new AssignEmployeeTask();

//    ownerChain.setNextChain(ceoChain);
//    ceoChain.setNextChain(managerChain);
//    managerChain.setNextChain(employeeChain);
//
//
//    @Test
//    void getTaskOwner() {
//        System.out.println("Owner");
//        assertEquals("The Owner needs to attend AGM @2PM", ownerChain.assignTask(user));
//    }
//
//    @Test
//    void getTaskCEO() {
//        System.out.println("CEO");
//        assertEquals("The CEO needs to prepare presentation for AGM",assignTask.getTask(ceo));
//    }
//
//    @Test
//    void getTaskManager() {
//        System.out.println("Manager");
//        assertEquals("The manager needs to attend daily stand-up meeting @9.30 AM",assignTask.getTask(manager));
//    }

}