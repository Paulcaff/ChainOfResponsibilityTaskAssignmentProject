package ChainOfResponsibilityCA;


public class AssignTask {

    private String task;
    private User user = new User();

    public AssignTask() {
        this.user = user;
    }

    public String getTask(User user) {
        if(user.getPosition() == "Owner" && user.getPassword() == "ownerpassword"){
            System.out.println("The Owner needs to attend AGM @2PM");
            return task = "The Owner needs to attend AGM @2PM";
        }
        else if(user.getPosition() == "Manager" && user.getPassword() == "managerpassword"){
            System.out.println("The manager needs to attend daily stand-up meeting @9.30 AM");
            return task = "The manager needs to attend daily stand-up meeting @9.30 AM";
        }
        else if(user.getPosition() == "CEO" && user.getPassword() == "ceopassword"){
            System.out.println("The CEO needs toprepare presentation for AGM");
            return task = "The CEO needs to prepare presentation for AGM";
        }
        else{
             System.out.println("The details entered are incorrect");
             return task =  "The details entered are incorrect";
        }

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
//public class AssignTask  {
//    private User user = new User("Owner","ownerpassword");
//
//    public AssignTask(User user) {
//        this.user = user;
//    }
//
//    public String getTask(User user) {
//        if(user.getPosition() == "Owner" && user.getPassword() == "ownerpassword"){
//            System.out.println("The Owner needs to attend AGM @2PM");
//            return "The Owner needs to attend AGM @2PM";
//        }
//        else if(user.getPosition() == "Manager" && user.getPassword() == "managerpassword"){
//            System.out.println("The manager needs to attend daily stand-up meeting @9.30 AM");
//            return "The manager needs to attend daily stand-up meeting @9.30 AM";
//        }
//        else if(user.getPosition() == "CEO" && user.getPassword() == "ceopassword"){
//            System.out.println("The CEO needs toprepare presentation for AGM");
//            return "The CEO needs toprepare presentation for AGM";
//        }
//        else{
//             System.out.println("The details entered are incorrect");
//             return "The details entered are incorrect";
//        }
//    }
//
//}
