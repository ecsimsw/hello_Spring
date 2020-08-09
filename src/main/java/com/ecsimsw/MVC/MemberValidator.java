package com.ecsimsw.MVC;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.HashSet;
import java.util.Set;

@Component
public class MemberValidator {
    public void validate(Object object, Errors error){
        Member member = (Member)object;
        if(member.name.equals("Master")){
            error.rejectValue("name", "unValidName", "You can't use Master in Name");
        }
    }
}
