package com.ecsimsw.MVC;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
@SessionAttributes("memberId")
public class SampleController {
    @GetMapping(value="/login")
    public String login(Model model, @RequestParam String memberId, HttpSession session){
        model.addAttribute("memberId", memberId);
        session.setAttribute("test", "test");
        return memberId;
    }

    @GetMapping(value="/complete")
    public String complete(SessionStatus sessionStatus){
        sessionStatus.setComplete();
        return "hello";
    }
}

