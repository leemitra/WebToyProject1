package WebToyProject1.webService.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Slf4j
@Controller
@RequestMapping("/domain")
public class MainController {

    @GetMapping("items")
    public String items() {
        return "";
    }

    @GetMapping("item")
    public String item() {
        return "";
    }
}