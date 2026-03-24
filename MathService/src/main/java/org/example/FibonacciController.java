package org.example.MathService;
import java.util.ArrayList;
import java.util.List
@RestController

public class FibonacciController {
    @GetMapping("/fibonacci")
    public List<long> fibonacci(RequestParam int numero){
        List<long> serie = new ArrayList<>();
        long a = 0 , b = 1;
        for (int i = 0; i < numero; i++) {
            serie.add(a);
            long temp = a + b;
            a = b;
            b = temp;
        }
        return serie;
    }

}
