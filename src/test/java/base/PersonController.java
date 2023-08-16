package base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	public static Person person;
	private static final Logger logger = LoggerFactory.getLogger(PersonController.class);

    @GetMapping("/person")
    public Person getPerson() {
        person = new Person();
        person.setName("Virat Kohli");
        person.setAge(30);
        person.setJob("Cricket Player");
        logger.info("Person Details - Name: {}, Age: {}", person.getName(), person.getAge(), person.getJob());
        return person;
    }
    
   // private Person person = new Person();
    
    @PutMapping("/person")
    public Person updatePerson(@RequestBody Person updatedPerson) {
        person.setName(updatedPerson.getName());
        person.setAge(updatedPerson.getAge());
        person.setJob(updatedPerson.getJob());
        logger.info("Person updated - Name: {}, Age: {}", person.getName(), person.getAge(), person.getJob());
       // return "Person details updated successfully";
        return person;
    }
}

