package ChainOfResponsibilityCA;

public class AssignManagerTask implements Chain {

    private User user = new User();
    private Chain nextInChain;


    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public String assignTask(User user) {

        if(user.getPosition() == "Manager" && user.getPassword() == "managerpassword"){
            System.out.println("Manager must attend daily stand-up @ 9-30 AM");
            return "Manager must attend daily stand-up @ 9-30 AM";
        }
        else {
            return nextInChain.assignTask(user);

        }

    }

    public AssignManagerTask() {
        this.user = user;
    }



    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
