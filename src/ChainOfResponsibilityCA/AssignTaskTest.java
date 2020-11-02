package ChainOfResponsibilityCA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssignTaskTest {
    AssignOwnerTask assignTask = new AssignOwnerTask();
    User owner = new User();
    User manager = new User("Manager", "managerpassword");
    User ceo = new User("CEO", "ceopassword");

//    @Test
//    void getTaskOwner() {
//        System.out.println("Owner");
//        assertEquals("The Owner needs to attend AGM @2PM", assignTask.assignTask(owner));
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