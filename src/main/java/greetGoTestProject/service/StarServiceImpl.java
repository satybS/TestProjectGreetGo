package greetGoTestProject.service;

import greetGoTestProject.model.Star;
import greetGoTestProject.model.StarType;
import greetGoTestProject.repository.StarMapper;
import greetGoTestProject.util.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by sanzhar on 1/10/17.
 */
@Service
public class StarServiceImpl implements StarService {

    @Autowired
    private StarMapper starMapper;


    @Override
    public void saveStar(Star star) {
        starMapper.saveStar(star);
    }

    @Override
    public void updateStar(Star star) throws NotFoundException {
        starMapper.updateStar(star);
    }

    @Override
    public void deleteStar(int id) throws NotFoundException {
        starMapper.deleteStar(id);
    }

    @Override
    public Star getStar(int id) throws NotFoundException {
        return starMapper.getStar(id);
    }

    @Override
    public Collection<Star> getAllStars() {
        return starMapper.getAllStars();
    }

    @Override
    public Collection<StarType> getAllStarTypes() {
        return starMapper.getStarTypes();
    }

    @Override
    public Collection<String> getAllDiscoverers() {
        return starMapper.getDiscoverers();
    }
}
