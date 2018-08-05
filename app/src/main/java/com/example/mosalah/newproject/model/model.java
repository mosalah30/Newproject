package com.example.mosalah.newproject.model;

public class model {
  private   String id,name,job,pass,age;

    public model(String id, String name, String job, String pass, String age) {
        setId(id) ;
        setAge(age);
        setJob(job);
        setName(name);
        setPass(pass);
    }

    public String getId() {
        return id;
    }

     void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

     void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

     void setJob(String job) {
        this.job = job;
    }

    public String getPass() {
        return pass;
    }

     void setPass(String pass) {
        this.pass = pass;
    }

    public String getAge() {
        return age;
    }

     void setAge(String age) {
        this.age = age;
    }
}
