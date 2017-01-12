package greetGoTestProject.model;

import java.io.Serializable;

/**
 * Created by sanzhar on 1/9/17.
 */
public class Star implements Serializable {

    private Integer id;
    private String name;
    private String coordinate1;
    private String coordinate2;
    private StarType starType;
    private Discoverer discoverer;

    public Star(String name, String coordinate1, String coordinate2, StarType starType, Discoverer discoverer) {
        this.name = name;
        this.coordinate1 = coordinate1;
        this.coordinate2 = coordinate2;
        this.starType = starType;
        this.discoverer = discoverer;
    }

    public Star(Integer id, String name, String coordinate1, String coordinate2, StarType starType, Discoverer discoverer) {
        this.id = id;
        this.name = name;
        this.coordinate1 = coordinate1;
        this.coordinate2 = coordinate2;
        this.starType = starType;
        this.discoverer = discoverer;
    }

    public Star(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoordinate1() {
        return coordinate1;
    }

    public void setCoordinate1(String coordinate1) {
        this.coordinate1 = coordinate1;
    }

    public String getCoordinate2() {
        return coordinate2;
    }

    public void setCoordinate2(String coordinate2) {
        this.coordinate2 = coordinate2;
    }

    public StarType getStarType() {
        return starType;
    }

    public void setStarType(StarType starType) {
        this.starType = starType;
    }

    public Discoverer getDiscoverer() {
        return discoverer;
    }

    public void setDiscoverer(Discoverer discoverer) {
        this.discoverer = discoverer;
    }

    @Override
    public String toString() {
        return "Star{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coordinate1='" + coordinate1 + '\'' +
                ", coordinate2='" + coordinate2 + '\'' +
                ", starType=" + starType +
                ", discoverer=" + discoverer +
                '}';
    }
}
