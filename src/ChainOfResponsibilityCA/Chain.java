package ChainOfResponsibilityCA;

public interface Chain {

    public void setNextChain(Chain nextChain);

    public String assignTask(User user);
}
