package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")   //  /hello 경로일 때 호출하는 메서드
    public String hello(Model model){
        model.addAttribute("data","hello!");
        return "hello";
    }
}
