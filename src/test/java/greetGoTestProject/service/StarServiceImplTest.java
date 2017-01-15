package greetGoTestProject.service;

import greetGoTestProject.model.Star;


import greetGoTestProject.model.StarType;
import greetGoTestProject.util.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.Collection;

import static greetGoTestProject.StarTestData.*;
import static org.springframework.test.context.jdbc.Sql.ExecutionPhase.*;


/**
 * Created by sanzhar on 1/11/17.
 */

@Test
@ContextConfiguration({ "classpath:spring/spring-app.xml","classpath:spring/spring-db.xml" })
public class StarServiceImplTest extends AbstractTestNGSpringContextTests {


    @Autowired
    StarService starService;



    @Test(priority = 1)
    public void testGet() throws Exception {
        Star star = starService.getStar(STAR_ID1);
        Assert.assertEquals(star, STAR1);
    }

    @Test(expectedExceptions = NotFoundException.class, priority = 2)
    public void testGetNotFound() throws Exception {
        starService.getStar(1);
    }

    @Test(priority = 3)
    public void testGetAllStarTypes() throws Exception {
        Collection<StarType> starTypes = starService.getAllStarTypes();
        Assert.assertEquals(starTypes, STARTYPES);
    }


    @Test(priority = 4)
    public void testGetAll() throws Exception {
        Collection<Star> all = starService.getAllStars();
        Assert.assertEquals(all, STARS);
    }

    @Test(priority = 5)
    public void testUpdate() throws Exception {
        Star updated = new Star(100000, "Updated", "Updated", "Updated", StarType.Blue, "Вова");
        starService.updateStar(updated);
        Assert.assertEquals(updated, starService.getStar(100000));
    }

    @Test(priority = 6)
    @Sql(scripts = "classpath:db/populateDB.sql", config = @SqlConfig(encoding = "UTF-8"))
    public void testSave() {
        Star newStar = new Star("Venera", "1245", "1244", StarType.Blue, "Вова");
        starService.saveStar(newStar);
        newStar.setId(100003);
        Assert.assertEquals(starService.getStar(100003), newStar);
    }

    @Test(expectedExceptions = NotFoundException.class, priority = 7)
    public void testDelete() throws Exception {
        starService.deleteStar(STAR_ID1);
        Assert.assertNull(starService.getStar(STAR_ID1));
    }

}