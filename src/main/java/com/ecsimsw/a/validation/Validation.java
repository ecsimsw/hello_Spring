package com.ecsimsw.a.validation;

import lombok.var;
import org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;

import java.util.List;

public class Validation {

    public Validation(Validator validator){
        System.out.println(validator.getClass());

        Event_example e1 = new Event_example("park", 24);
        Event_example e2 = new Event_example(24);
        Event_example e3 = new Event_example("kim",123 );

        Errors errors1 = new BeanPropertyBindingResult(e1, "Error in e1");
        Errors errors2 = new BeanPropertyBindingResult(e2, "");
        Errors errors3 = new BeanPropertyBindingResult(e3, "");

        validator.validate(e2,errors2);

        System.out.println(errors2.hasErrors());

        List<ObjectError> objectErrors = errors2.getAllErrors();

        for(ObjectError ob : objectErrors){
            System.out.println(ob.getDefaultMessage());
        }
    }
}
