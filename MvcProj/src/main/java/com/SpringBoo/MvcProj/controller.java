package com.SpringBoo.MvcProj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class controller {
    @RequestMapping("home")
    public String home()
    {
        return ("home");
    }
}
