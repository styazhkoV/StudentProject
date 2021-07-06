package edu.studentorder.petproject;

import edu.studentorder.petproject.domain.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {
        //Получаю данные на вход
       StudentOrder so; so = new StudentOrder();
       so = new StudentOrder();
       so.sethFirstName("Alexey");
       so.sethLastName("Petrov");
       so.setwFirstName("Galina");
       so.setwLastName("Petrova");

       long ans = saveStudentOrder(so);
        System.out.println(ans);
    }
    //Принимаю данные и обрабатываю их
    static long saveStudentOrder(StudentOrder studentOrder){
        long answer = 199;
        System.out.println("saveStudentOrder" + studentOrder.gethLastName());

        return answer;
    }
}
