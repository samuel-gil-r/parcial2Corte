package org.example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController

public class FibonacciController<numero> {
    @GetMapping("/fibonacci")
    public List<Long> fibonacci(RequestParam int numero){
        List<Long> serie = new ArrayList<>();
        long a = 0 , b = 1;
        int numero = 0;
        for (int i = 0; i < numero; i++) {
            serie.add(a);
            long temp = a + b;
            a = b;
            b = temp;
        }
        return serie;
    }
}
