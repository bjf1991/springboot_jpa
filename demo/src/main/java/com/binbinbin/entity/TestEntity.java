package com.binbinbin.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Administrator on 2018/1/18.
 */
/*@Data
@NoArgsConstructor
@AllArgsConstructor*/
@Entity
@Table(name="test")
public class TestEntity {
    @Id
    @GeneratedValue
    private  Long id;
    private String test;

    public TestEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
