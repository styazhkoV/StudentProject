public class CheckWeddingValidator {

    String hostName;
    String login;
    String password;

     AnswerWedding checkWedding(StudentOrder so){
        System.out.println("Wedding is runing" + hostName + "," +login + "," + password);
        AnswerWedding ans = new AnswerWedding();
        ans.succses = false;
        return ans;
    }
}
