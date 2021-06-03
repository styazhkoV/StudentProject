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
                //continue;
                break;
            }
            AnswerChildren childrenAnswer = checkChildren(so);
            AnswerStudent studentAnswer = checkStudent(so);
            AnswerWedding wedAnswer = checkWedding(so);
            //Отправка письма
            sendMail(so);
            }
        }
    //Чтение студенческой заявки передача данных
    static StudentOrder readStudentOrder(){
        StudentOrder so = new StudentOrder();
        return so;
    }
    static AnwerSityRegister checkCityRegister (StudentOrder so){
        CityRegisterValidator crv1 = new CityRegisterValidator();
        crv1.hostName = "Host1";
        crv1.login = "Login1";
        crv1.password = "Password1";
        AnwerSityRegister ans1 = crv1.checkCityRegister(so);
        return ans1;
    }

    static AnswerWedding checkWedding(StudentOrder so){
        return CheckWeddingValidator.checkWedding(so);
    }
    static AnswerChildren checkChildren(StudentOrder so){
        return CheckChildrenValidator.checkChildren(so);
    }
    static AnswerStudent checkStudent(StudentOrder so){
        return CheckStudentValidator.checkStudent(so);
    }
    static void  sendMail(StudentOrder so){
        System.out.println("mail send");

    }
}
