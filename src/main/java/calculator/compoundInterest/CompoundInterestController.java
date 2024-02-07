package calculator.compoundInterest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CompoundInterestController {

    private List<Person> personList;
    private CompoundInterestCalculator calculator;

    @Autowired
    public CompoundInterestController(CompoundInterestCalculator calculator){
        this.calculator = calculator;
        this.personList = new ArrayList<>();
    }

    @GetMapping("/")
    public String displayPersonData(Model model) {
        if(personList.isEmpty()){
            model.addAttribute("message", "No person in the list");
        }
        else{
            personList.forEach(person -> {
                double amount = calculator.calcCompoundInterest(
                        person.getPrincipal(),
                        person.getInterest(),
                        person.getYears()
                );
                person.setAmount(amount);
            });
            model.addAttribute("persons", personList);

        }
        return "personList";
    }
    @PostMapping("/addperson")
    public String addPerson(@RequestParam String name,
                            @RequestParam double principal,
                            @RequestParam double interest,
                            @RequestParam int years,
                            Model model){
        Person person = new Person(name, principal, interest, years);
        double amount = calculator.calcCompoundInterest(person.getPrincipal(),
                person.getInterest(),
                person.getYears());
        person.setAmount(amount);
        personList.add(person);

        model.addAttribute("person", personList);

        return "redirect:/";
    }
}
