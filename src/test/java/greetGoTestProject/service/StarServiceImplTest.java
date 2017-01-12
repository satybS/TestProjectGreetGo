package greetGoTestProject.service;

import greetGoTestProject.model.Star;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;


/**
 * Created by sanzhar on 1/11/17.
 */

@ContextConfiguration({
        "classpath:spring/spring-app.xml",
        "classpath:spring/spring-db.xml"
})
@RunWith(SpringJUnit4ClassRunner.class)
public class StarServiceImplTest {


    @Autowired
    StarService starService;

    @Test
    public void testGetStar() throws Exception {
//        Star star = starService.getStar(100001);
        System.out.println(starService);
        assertNotNull(starService);
    }

}