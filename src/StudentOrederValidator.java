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
    static AnwerSityRegister checkCityRegister(StudentOrder so){
        System.out.println("SityRegister is runing");
        return new AnwerSityRegister();
    }
    static AnswerWedding checkWedding(StudentOrder so){
        System.out.println("Wedding is runing");
        return new AnswerWedding();
    }
    static AnswerChildren checkChildren(StudentOrder so){
        System.out.println("Children is running");
        return new AnswerChildren();

    }
    static AnswerStudent checkStudent(StudentOrder so){
        System.out.println("Student is validating");
        return new AnswerStudent();
    }
    static void  sendMail(StudentOrder so){

    }
}
