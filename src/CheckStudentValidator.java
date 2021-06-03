public class CheckStudentValidator {

    String hostName;
    String login;
    String password;

     AnswerStudent checkStudent(StudentOrder so){
         System.out.println("Student is validating" + "," + hostName +"," + login + "," +password);
         AnswerStudent ans = new AnswerStudent();
         ans.succses = false;
         return ans;
    }
}
