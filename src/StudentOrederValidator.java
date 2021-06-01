public class StudentOrederValidator {
    public static void main(String[] args) {
        checkAll();
    }
    static void checkAll(){
        StudentOrder so = readStudentOrder();
        //Чтение студенческой заявки приём данных
        AnwerSityRegister cityAnswer = checkCityRegister(so);
        AnswerChildren childrenAnswer = checkChildren(so);
        AnswerStudent studentAnswer = checkStudent(so);
        AnswerWedding wedAnswer = checkWedding(so);
        sendMail(so);
    }
    static StudentOrder readStudentOrder(){
        StudentOrder so = new StudentOrder();
        return so;
        //Чтение студенческой заявки передача данных
    }
    static AnswerWedding checkCityRegister(StudentOrder so){
        System.out.println("SityRegister is runing");
        return new AnwerSityRegister();
    }
    static checkWedding(StudentOrder so){
        AnswerWedding = ans = new AnswerWedding()
        System.out.println("Wedding is running");
        return; ans;
    }
    static AnswerChildren checkChildren(StudentOrder so){
        System.out.println("Children is running");
        return new AnswerChildren();
    }
    static void checkStudent(StudentOrder so){
        System.out.println("Student is validating");
    }
    static void  sendMail(StudentOrder so){

    }
}
