package greetGoTestProject.web;

import greetGoTestProject.model.Star;
import greetGoTestProject.model.StarType;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;

/**
 * Created by sanzhar on 1/14/17.
 */
@RestController
@RequestMapping("ajax/stars")
public class StarController extends AbstractStarController {

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Star getStar(@PathVariable("id") int id) {
        return super.getStar(id);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteStar(@PathVariable("id") int id) {
        super.deleteStar(id);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Star> getAllStars() {
        return super.getAllStars();
    }

    @PostMapping
    public ResponseEntity<String> updateOrCreateStar(@Valid Star star, BindingResult result) {
        if (result.hasErrors()) {
            StringBuilder sb = new StringBuilder();
            result.getFieldErrors().forEach(fe -> sb.append(fe.getField()).append(" ").append(fe.getDefaultMessage()).append("<br>"));
            return new ResponseEntity<>(sb.toString(), HttpStatus.UNPROCESSABLE_ENTITY);
        }
        if (star.isNew()) {
            super.createStar(star);
        } else {
            super.updateStar(star, star.getId());
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @GetMapping(value = "/discoverers", produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<String> getAllDiscoverers() {
        return super.getAllDiscoverers();
    }

    @GetMapping(value = "/startypes", produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<StarType> getAllStarTypes() {
        return super.getAllStarTypes();
    }
}
