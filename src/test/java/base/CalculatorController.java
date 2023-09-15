package base;
import org.springframework.web.bind.annotation.*;

//Below is added by Krishna 
// code for some calucation method
// -------------------------------

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @PostMapping("/add")
    public double add(@RequestParam double num1, @RequestParam double num2) {
        return num1 + num2;
    }

    @PostMapping("/subtract")
    public double subtract(@RequestParam double num1, @RequestParam double num2) {
        return num1 - num2;
    }

    @PostMapping("/multiply")
    public double multiply(@RequestParam double num1, @RequestParam double num2) {
        return num1 * num2;
    }

    @PostMapping("/divide")
    public double divide(@RequestParam double num1, @RequestParam double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        return num1 / num2;
    }
}
