package ntu.aoharkov.pr26demo.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ntu.aoharkov.pr26demo.service.HomePageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Getter
@Setter
@AllArgsConstructor
@Controller
public class HomePageController {

    private HomePageService homePageService;

    @GetMapping(path = "/")
    public @ResponseBody String returnHelloWorld() {
       return homePageService.getHelloString();
    }

}
