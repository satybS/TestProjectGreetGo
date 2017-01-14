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
    private String discoverer;

    public Star(String name, String coordinate1, String coordinate2, StarType starType, String discoverer) {
        this.name = name;
        this.coordinate1 = coordinate1;
        this.coordinate2 = coordinate2;
        this.starType = starType;
        this.discoverer = discoverer;
    }

    public Star(Integer id, String name, String coordinate1, String coordinate2, StarType starType, String discoverer) {
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

    public void setId(Integer id) {
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

    public String getDiscoverer() {
        return discoverer;
    }

    public void setDiscoverer(String discoverer) {
        this.discoverer = discoverer;
    }

    public boolean isNew() {
        return getId() == null;
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
