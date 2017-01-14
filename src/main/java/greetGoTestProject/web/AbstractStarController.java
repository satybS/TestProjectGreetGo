package greetGoTestProject.web;

import greetGoTestProject.model.Star;
import greetGoTestProject.model.StarType;
import greetGoTestProject.service.StarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.List;

/**
 * Created by sanzhar on 1/14/17.
 */
public class AbstractStarController {

    private static final Logger LOG = LoggerFactory.getLogger(AbstractStarController.class);

    @Autowired
    private StarService service;

    public Star getStar(int id) {
        LOG.info("get star {}", id);
        return service.getStar(id);
    }

    public void deleteStar(int id) {
        LOG.info("delete meal {}", id);
        service.deleteStar(id);
    }

    public Collection<Star> getAllStars() {
        LOG.info("getAll Stars");
        return service.getAllStars();
    }

    public void updateStar(Star star, int id) {
        star.setId(id);
        LOG.info("update {}", star);
        service.updateStar(star);
    }

    public void createStar(Star star) {
        star.setId(null);
        LOG.info("create {}", star);
        service.saveStar(star);
    }

    public Collection<String>getAllDiscoverers() {
        LOG.info("Get all discoverers");
        return service.getAllDiscoverers();
    }

    public Collection<StarType>getAllStarTypes() {
        LOG.info("get all StarTypes");
        return service.getAllStarTypes();
    }
}
