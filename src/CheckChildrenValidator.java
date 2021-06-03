public class CheckChildrenValidator {

    String hostName;
    String login;
    String password;

     AnswerChildren checkChildren(StudentOrder so){
        System.out.println("Children is running" + hostName + "," +login + "," + password);
        AnswerChildren ans = new AnswerChildren();
        ans.succses = false;
        return ans;
    }
}
