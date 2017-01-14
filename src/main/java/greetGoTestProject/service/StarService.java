package greetGoTestProject.service;

import greetGoTestProject.model.Star;
import greetGoTestProject.model.StarType;
import greetGoTestProject.util.exception.NotFoundException;

import java.util.Collection;

/**
 * Created by sanzhar on 1/9/17.
 */
public interface StarService {


    void saveStar(Star star);

    void updateStar(Star star) throws NotFoundException;

    void deleteStar (int id) throws NotFoundException;

    Star getStar(int id) throws NotFoundException;

    Collection<Star> getAllStars();

    Collection<StarType> getAllStarTypes();

    Collection<String>getAllDiscoverers();







}
