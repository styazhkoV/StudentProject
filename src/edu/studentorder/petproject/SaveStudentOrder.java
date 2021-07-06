package edu.studentorder.petproject;

import edu.studentorder.petproject.domain.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {
        //Получаю данные на вход
       StudentOrder so; so = new StudentOrder();
       so = new StudentOrder();
       so.hFirstName = "Alexey";
       so.hLastName = "Petrov";
       so.wFirstName = "Galina";
       so.wLastName = "Petrova";

       long ans = saveStudentOrder(so);
        System.out.println(ans);
    }
    //Принимаю данные и обрабатываю их
    static long saveStudentOrder(StudentOrder studentOrder){
        long answer = 199;
        System.out.println("saveStudentOrder" + studentOrder.hFirstName);

        return answer;
    }
}
