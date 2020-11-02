package ChainOfResponsibilityCA;

public interface Chain {

    public void setNextChain(Chain nextChain);

    public void assignTask(User user);
}
