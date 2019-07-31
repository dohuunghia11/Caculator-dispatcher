package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/caculator")
public class Caculator {
    @GetMapping
    public String caculator(){
        return "index";
    }
    @PostMapping
    public String calculate(@RequestParam String numberOne, @RequestParam String numberTwo, @RequestParam String caculate, Model model){
        Float result = 0f;
        if(caculate.equals("Addtion(+)")){
            result = Float.parseFloat(numberOne) + Float.parseFloat(numberTwo);
        } else if(caculate.equals("Subtraction(-)")){
            result = Float.parseFloat(numberOne) - Float.parseFloat(numberTwo);
        } else if(caculate.equals("Multiplication(X)")){
            result = Float.parseFloat(numberOne) * Float.parseFloat(numberTwo);
        } else if(caculate.equals("Division(/)")){
            result = Float.parseFloat(numberOne) / Float.parseFloat(numberTwo);
        }
        model.addAttribute("add", result);
        return "index";
    }
}
