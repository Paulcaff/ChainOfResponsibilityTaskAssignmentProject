package ChainOfResponsibilityCA;

public class AssignCEOTask implements Chain {

    private String task;
    private User user = new User();
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void assignTask(User user) {

        if(user.getPosition() == "CEO" && user.getPassword() == "ceopassword"){
            System.out.println("CEO must prepare presentation for AGM @ 2PM");
        }
        else {
            nextInChain.assignTask(user);
        }
    }

    public AssignCEOTask() {
        this.user = user;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
