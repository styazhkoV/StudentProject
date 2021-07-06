package edu.studentorder.petproject;

import edu.studentorder.petproject.domain.*;
import edu.studentorder.petproject.mail.MailSender;
import edu.studentorder.petproject.validator.ChildrenValidator;
import edu.studentorder.petproject.validator.CityRegisterValidator;
import edu.studentorder.petproject.validator.StudentValidator;
import edu.studentorder.petproject.validator.WeddingValidator;

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
        /*crv1.hostName = "Host1";
        crv1.login = "Login1";*/
        AnwerSityRegister ans = crv1.checkCityRegister(so);
        return ans;
    }

    static AnswerWedding checkWedding(StudentOrder so){
        WeddingValidator wd = new WeddingValidator();
        return wd.checkWedding(so);
    }
    static AnswerChildren checkChildren(StudentOrder so){
        ChildrenValidator cv = new ChildrenValidator();
        return cv.checkChildren(so);
    }
    static AnswerStudent checkStudent(StudentOrder so){
        StudentValidator sv = new StudentValidator();
        return sv.checkStudent(so);
    }
    static void  sendMail(StudentOrder so){
        new MailSender().sendMail(so);
    }
}
