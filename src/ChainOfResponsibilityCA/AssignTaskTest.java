package ChainOfResponsibilityCA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssignTaskTest {

    User owner = new User("Owner","ownerpassword");
    User ceo = new User("CEO","ceopassword");
    User manager = new User("Manager","managerpassword");
    User employee = new User("Employee","employeepassword");
    User incorrectdetails = new User("Incorrect Details","Incorrect Details");

    Chain ownerChain = new AssignOwnerTask();
    Chain ceoChain = new AssignCEOTask();
    Chain managerChain = new AssignManagerTask();
    Chain employeeChain = new AssignEmployeeTask();



    @Test
    void getTaskOwner() {
        ownerChain.setNextChain(ceoChain);
        ceoChain.setNextChain(managerChain);
        managerChain.setNextChain(employeeChain);

        System.out.println("Owner");
        assertEquals("Owner must attend AGM @2PM", ownerChain.assignTask(owner));
    }

    @Test
    void getTaskCEO() {
        ownerChain.setNextChain(ceoChain);
        ceoChain.setNextChain(managerChain);
        managerChain.setNextChain(employeeChain);

        System.out.println(ceo.getPosition());
        assertEquals("CEO must prepare presentation for AGM @ 2PM",ownerChain.assignTask(ceo));
    }

    @Test
    void getTaskManager() {
        ownerChain.setNextChain(ceoChain);
        ceoChain.setNextChain(managerChain);
        managerChain.setNextChain(employeeChain);

        System.out.println(manager.getPosition());
        assertEquals("Manager must attend daily stand-up @ 9-30 AM",ownerChain.assignTask(manager));
    }

    @Test
    void getTaskEmployee() {
        ownerChain.setNextChain(ceoChain);
        ceoChain.setNextChain(managerChain);
        managerChain.setNextChain(employeeChain);

        System.out.println(employee.getPosition());
        assertEquals("Employee must complete testing of assignment",ownerChain.assignTask(employee));
    }

    @Test
    void getTaskFailure() {
        ownerChain.setNextChain(ceoChain);
        ceoChain.setNextChain(managerChain);
        managerChain.setNextChain(employeeChain);

        System.out.println(incorrectdetails.getPosition());
        assertEquals("The details entered are Incorrect",ownerChain.assignTask(incorrectdetails));
    }

}