package com.roger.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Collection;
import java.util.LinkedHashSet;

/**
 * Created by Roger on 2016/12/7.
 */
// @Document注解映射领域模型和MongoDB的文档
@Document
public class Person {

    // @Id注解表明文档的id
    @Id
    private String id;
    private String name;
    private Integer age;
    // @Field注解, 属性locations将以数组形式存在当前数据记录中
    @Field("locs")
    private Collection<Location> locations = new LinkedHashSet<Location>();

    public Person() {
    }

    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Collection<Location> getLocations() {
        return locations;
    }

    public void setLocations(Collection<Location> locations) {
        this.locations = locations;
    }
}
