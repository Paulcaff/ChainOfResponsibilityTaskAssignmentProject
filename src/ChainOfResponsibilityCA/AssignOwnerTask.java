package ChainOfResponsibilityCA;


public class AssignOwnerTask implements Chain {

    private User user = new User();
    private Chain nextInChain;


    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public String assignTask(User user) {

        if(user.getPosition() == "Owner" && user.getPassword() == "ownerpassword"){
            System.out.println("Owner must attend AGM @2PM");
            return "Owner must attend AGM @2PM";
        }
        else {
             return nextInChain.assignTask(user);
        }
    }

    public AssignOwnerTask() {
        this.user = user;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
