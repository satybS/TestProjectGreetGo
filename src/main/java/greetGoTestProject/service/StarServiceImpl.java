package greetGoTestProject.service;

import greetGoTestProject.model.Star;
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
    public Star getStar(int id) throws NotFoundException {
        return starMapper.getStar(id);
    }

//    @Override
//    public void delete(int id) throws NotFoundException {
//
//    }
//
//    @Override
//    public Collection<Star> getAll() {
//        return null;
//    }
//
//    @Override
//    public Star update(Star star) throws NotFoundException {
//        return null;
//    }
//
//    @Override
//    public Star save(Star star) {
//        return null;
//    }
}
