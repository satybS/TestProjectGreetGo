import greetGoTestProject.model.Star;
import greetGoTestProject.model.StarType;
import greetGoTestProject.repository.StarMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.Collection;

/**
 * Created by sanzhar on 1/11/17.
 */
public class Main {
    public static void main(String[] args) {
        SqlSessionFactory sessionFactory = null;
        String resource = "db/mybatis.xml";
        try {
            sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(resource));
        } catch (IOException e) {
            e.printStackTrace();
        }

        SqlSession session = sessionFactory.openSession();
        StarMapper mapper = session.getMapper(StarMapper.class);
//        Star star = mapper.getStar(100001);
//        System.out.println(star);
        Collection<String> collection = mapper.getDiscoverers();
        collection.forEach(System.out::println);
//        Star star = new Star(100002, "Venera", "1234","4444",StarType.Yellow,"Санжар");
//        mapper.updateStar(star);
//        System.out.println(mapper.getStar(100002));
        session.close();


    }
}
