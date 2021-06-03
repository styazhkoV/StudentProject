public class CityRegisterValidator {

    String hostName;
    String login;
    String password;

    AnwerSityRegister checkCityRegister (StudentOrder so){
        System.out.println("Sity register is runing" + hostName + "," + login + "," + password);
        AnwerSityRegister ans = new AnwerSityRegister();
        ans.succses = false;
        return ans;
    }
}
