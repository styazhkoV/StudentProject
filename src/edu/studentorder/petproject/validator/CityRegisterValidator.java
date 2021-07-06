package edu.studentorder.petproject.validator;

import edu.studentorder.petproject.domain.AnwerSityRegister;
import edu.studentorder.petproject.domain.StudentOrder;

public class CityRegisterValidator {

    String hostName;
    String login;
    String password;

    public AnwerSityRegister checkCityRegister (StudentOrder so){
        System.out.println("Sity register is runing" + hostName + "," + login + "," + password);
        AnwerSityRegister ans = new AnwerSityRegister();
        ans.succses = false;
        return ans;
    }
}
