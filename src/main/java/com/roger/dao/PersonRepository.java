package com.roger.dao;

import com.roger.domain.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by Roger on 2016/12/7.
 */
public interface PersonRepository extends MongoRepository<Person, String> {

    // 支持方法名查询
    Person findByName(String name);

    // 支持@Query查询, 查询参数构造JSON字符串即可
    @Query("{'age': ?0}")
    List<Person> withQueryFindByAge(Integer age);
}
