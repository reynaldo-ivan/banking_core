package mx.com.anzen.corebank.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
 

@Controller
public class LoginDinamicController {
 
 @RequestMapping("/LoginDinamic")
 @ResponseBody
 String home() {
 return "HolaMundo";
 }
 
}