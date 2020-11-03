package ChainOfResponsibilityCA;

public class AssignEmployeeTask implements Chain {

    private User user = new User();
    private Chain nextInChain;


    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public String assignTask(User user) {

        if(user.getPosition() == "Employee" && user.getPassword() == "employeepassword"){
            System.out.println("Employee must complete testing of assignment");
            return "Employee must complete testing of assignment";
        }
        else {
            System.out.println("The details entered are Incorrect");
            return "The details entered are Incorrect";
        }
    }

    public AssignEmployeeTask() {
        this.user = user;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
