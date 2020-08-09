package com.ecsimsw.MVC;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@Slf4j
public class SampleController {

    @Autowired MemberValidator memberValidator;

    @ExceptionHandler(RuntimeException.class)
    public String memberException(Model model, RuntimeException exception){
        model.addAttribute("message","Runtime Error");
        return "error";
    }

    @GetMapping(value="/signUp")
    public String preSignUp(){
        return "signUp";
    }

    @PostMapping(value="/signUp")
    public String postSignUp(Model model, @Valid Member member, BindingResult bindingResult){

        memberValidator.validate(member, bindingResult);

        if(bindingResult.hasErrors()){
            throw new RuntimeException();
            //return "signUp";
        }

        model.addAttribute("member", member);
        return "home";
    }
}

