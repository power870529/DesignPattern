package com.design.pattern.creational.prototype.clone;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * @description:
 * @author: liuzh01
 * @create: 2019-04-02 09:00:42
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pig implements Cloneable{

    private String name;

    private Date birthday;


    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                '}' + super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        Pig pig = (Pig) super.clone();
        // 深克隆
        pig.birthday = (Date) pig.birthday.clone();
        return pig;
    }
}
