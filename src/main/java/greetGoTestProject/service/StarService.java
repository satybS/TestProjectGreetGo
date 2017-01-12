package greetGoTestProject.service;

import greetGoTestProject.model.Star;
import greetGoTestProject.util.exception.NotFoundException;

import java.util.Collection;

/**
 * Created by sanzhar on 1/9/17.
 */
public interface StarService {

    Star getStar(int id) throws NotFoundException;
//    void delete(int id) throws NotFoundException;
//    Collection<Star> getAll();
//    Star update(Star star) throws NotFoundException;
//    Star save(Star star);

}
