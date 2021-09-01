package com.shadab.quizapi;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@CrossOrigin
@RequestMapping("/quiz")
public class controller {
    @GetMapping("/quizlist")
    public quiz[] quizzes() {
        quiz[] arr = new quiz[5];
        arr[0] = new quiz("1", "What is Java?", "Java is a Programming Language");
        arr[1] = new quiz("2", "What is Python?", "Python is a Programming Language");
        arr[2] = new quiz("3", "What is SpringBoot?", "SpringBoot...");
        arr[3] = new quiz("4", "What is API?", "API...");
        arr[4] = new quiz("5", "What is Angular?", "Angular Framework...");

        return arr;
    }
}
