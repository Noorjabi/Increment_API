package com.assignment.increment.model;
import javax.persistence.*;

@Entity
@Table(name = "Number")
public class Number {

    private Integer id;
    private Integer increment;


    public Number() {
    }

    public Number(Integer id, Integer increment) {
        this.id = id;
        this.increment = increment;
    }

    public Number (Integer increment){
        this.increment = increment;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIncrement() {
        return increment;
    }

    public void setIncrement(Integer increment) {
        this.increment = increment;
    }
}
