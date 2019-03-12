package mx.com.profuturo.mongodataservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	private CustomerRepository repository;
	
    @Value("${user.role}")
    private String role;
	
    @Value("${nombre}")
    private String nombre;
	
	@RequestMapping(value = "/")
    public List<Customer> index(){
        System.out.println("Home Page");
        System.out.println(nombre);
        repository.save(new Customer("hola", "spencer"));
        List<Customer> customers = repository.findAll();
        return customers;
    }
	
}
