package greetGoTestProject.model;

import java.io.Serializable;

/**
 * Created by sanzhar on 1/10/17.
 */
public class Discoverer implements Serializable {

    private int id;
    private String name;

    public Discoverer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Discoverer(String name) {
        this.name = name;
    }

    public Discoverer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Discoverer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
