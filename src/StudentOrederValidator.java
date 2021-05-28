public class StudentOrederValidator {
    public static void main(String[] args) {
        checkAll();
    }
    static void checkAll(){
        checcCityRegister();
        checkChildren();
        checkStudent();
        checkWedding();

    }
    static void checcCityRegister(){
        System.out.println("SityRegister is runing");
    }
    static void checkWedding(){
        System.out.println("Wedding is running");
    }
    static void checkChildren(){
        System.out.println("Children is running");
    }
    static void checkStudent(){
        System.out.println("Student is validating");
    }
}
