package jpabook;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){

        model.addAttribute("data","hello!!!");
        return "hello";
        //Json 같은 형태로 data 에 해당하는 key 값은 hello다라고 보낼수 수 있는거
    }
}
