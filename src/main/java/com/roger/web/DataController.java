package com.roger.web;

import com.roger.dao.PersonRepository;
import com.roger.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Roger on 2016/12/7.
 */
@RestController
public class DataController {

    @Autowired
    private PersonRepository personRepository;

    @RequestMapping("/q1")
    public Person queryByName(String name){
        return personRepository.findByName(name);
    }

    @RequestMapping("/q2")
    public List<Person> queryBYAge(Integer age){
        return personRepository.withQueryFindByAge(age);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Person save(@RequestBody Person person){
        return personRepository.save(person);
    }
}
