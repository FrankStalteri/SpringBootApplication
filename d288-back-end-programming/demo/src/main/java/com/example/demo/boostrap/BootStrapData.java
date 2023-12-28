package com.example.demo.boostrap;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.DivisionRepository;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Division;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    private final DivisionRepository divisionRepository;

    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository){
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Division nj = new Division();
        nj.setId(29L);
        nj.setCountry_id(1L);
        Customer justin = new Customer("Justin", "Hughs", "123 Brickhouse Road", "12039", "2149834923");
        justin.setDivision(nj);
        divisionRepository.save(nj);

        Customer james = new Customer("James", "Smith", "304 North Lane", "43768", "2144737923");
        james.setDivision(nj);
        divisionRepository.save(nj);

        Customer randall = new Customer("Randall", "Williams", "34 Edgebrook Drive", "51517", "2149834923");
        randall.setDivision(nj);
        divisionRepository.save(nj);

        Customer joe = new Customer("Joe", "Shmoe", "12345 Cindy Ave", "29481", "268456162");
        joe.setDivision(nj);
        divisionRepository.save(nj);

        Customer nick = new Customer("Nick", "Ferry", "West Elm Street", "23853", "151616516");
        nick.setDivision(nj);
        divisionRepository.save(nj);


        customerRepository.save(justin);
        customerRepository.save(randall);
        customerRepository.save(james);
        customerRepository.save(joe);
        customerRepository.save(nick);

        customerRepository.findAll();
    }
}
