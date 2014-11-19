package mymodels;


import play.db.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class User extends Model {

    @Column
    public String name;

    @Column
    public String test;

    //public static Finder<Long, User> find = new Finder<>(Long.class, User.class);

}