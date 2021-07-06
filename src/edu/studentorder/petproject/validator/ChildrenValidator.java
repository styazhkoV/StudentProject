package edu.studentorder.petproject.validator;

import edu.studentorder.petproject.domain.AnswerChildren;
import edu.studentorder.petproject.domain.StudentOrder;

public class ChildrenValidator {
    public AnswerChildren checkChildren(StudentOrder so){
        CityRegisterValidator crv1 = new CityRegisterValidator();
        return new AnswerChildren();
    }
}
