package org.najot.controller;

import org.najot.service.MaxsulotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MaxsulotController {
    @Autowired
    private MaxsulotService maxsulotService;

    @RequestMapping(value ="/maxsulotlar", method = RequestMethod.GET)
    public ModelAndView maxsulotList(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("maxsulotlar");
        mv.addObject("maxsulotlar", maxsulotService.getMaxsulotList());
        return mv;
    }
}
