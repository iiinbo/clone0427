package com.kbstar.controller;

import com.kbstar.dto.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class MainController {

    // 127.0.0.1
    @RequestMapping("/")
    public String main() {
        return "index";
    }

    // charts
    @RequestMapping("/charts")
    public String charts(Model model) {
        model.addAttribute("center", "charts"); // center에는 charts 페이지 뿌려져라.
        return "index";
    }

}
