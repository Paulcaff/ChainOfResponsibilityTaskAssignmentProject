package ChainOfResponsibilityCA;

public class AssignCEOTask implements Chain {

    private User user = new User();
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public String assignTask(User user) {

        if(user.getPosition() == "CEO" && user.getPassword() == "ceopassword"){
            System.out.println("CEO must prepare presentation for AGM @ 2PM");
            return "CEO must prepare presentation for AGM @ 2PM";
        }
        else {
            return nextInChain.assignTask(user);

        }
    }

    public AssignCEOTask() {
        this.user = user;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
