package jtobs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController {

    @GetMapping("/index")
    public ModelAndView  index(){
        ModelAndView mav=new ModelAndView("socket");
        mav.addObject("uid", "223344");
        return mav;
    }

}
