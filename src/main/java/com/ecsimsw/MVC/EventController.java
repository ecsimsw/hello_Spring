package com.ecsimsw.MVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServlet;

@Controller
public class EventController {

    @Autowired EventService eventService;

    @RequestMapping(value = "/", method= RequestMethod.GET)
    public String helloMVC(){
        return "hi";
    }

    @GetMapping("/main")
    public String events(Model model){
        model.addAttribute("events", eventService.getEvents());
        return "event";
    }

}
