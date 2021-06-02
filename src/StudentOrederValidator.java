public class StudentOrederValidator {
    public static void main(String[] args) {
       checkAll();
    }
    static void checkAll(){
        //Чтение студенческой заявки приём данных
        StudentOrder so = readStudentOrder();
        //Проверка наличия студенческой заявки
        while (true){
            System.out.println("start");
        if (so == null) {
        //Если нет заявки - останавливаем выполнение
            break;
        }
                System.out.println("finish");
            AnwerSityRegister cityAnswer = checkCityRegister(so);
            if (!cityAnswer.succses){
                //Прекратить обработку и вернуться к следующей заявке
                continue;
            }
            AnswerChildren childrenAnswer = checkChildren(so);
            AnswerStudent studentAnswer = checkStudent(so);
            AnswerWedding wedAnswer = checkWedding(so);
            //Отправка письма
            sendMail(so);
            }
        System.out.println("finish 2");
        }
    //Чтение студенческой заявки передача данных
    static StudentOrder readStudentOrder(){
        StudentOrder so = new StudentOrder();
        return so;

    }
    static AnwerSityRegister checkCityRegister(StudentOrder so){
        System.out.println("SityRegister is runing");
        AnwerSityRegister anwerSityRegister = new AnwerSityRegister();
        anwerSityRegister.succses = false;
        return anwerSityRegister;
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
        System.out.println("mail send");

    }
}
