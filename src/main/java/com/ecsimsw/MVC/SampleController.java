package com.ecsimsw.MVC;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
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

@GetMapping(value="/hello")
public String hello(RedirectAttributes redirectAttributes, Model model){
    //redirectAttributes.addAttribute("name", "jinhwan");
    redirectAttributes.addFlashAttribute("name","jinhwan");
    return "redirect:/redirected";
}

    @GetMapping(value="/redirected")
    @ResponseBody
    public String hi(Model model, @SessionAttribute("name") String name){
        //String name = (String)model.asMap().get("name");
        return name;
    }
}

