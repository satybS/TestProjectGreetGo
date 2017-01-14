package greetGoTestProject.repository;

import greetGoTestProject.model.Star;
import greetGoTestProject.model.StarType;
import org.apache.ibatis.annotations.*;

import java.util.Collection;

/**
 * Created by sanzhar on 1/10/17.
 */
public interface StarMapper {


    void saveStar(Star star);

    void updateStar(Star star);

    boolean deleteStar(int id);

    Star getStar(int id);

    Collection<Star> getAllStars();

    Collection<StarType> getStarTypes();

    Collection<String> getDiscoverers();
}