package greetGoTestProject;

import greetGoTestProject.model.Star;
import greetGoTestProject.model.StarType;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sanzhar on 1/15/17.
 */
public class StarTestData {

    public static final Star STAR1 = new Star(100000, "Moon", "1245", "1244", StarType.Blue, "Вова");
    public static final Star STAR2 = new Star(100001, "Mars", "1675", "1688", StarType.White, "Петя");
    public static final Star STAR3 = new Star(100002, "Pluton", "1245", "1244", StarType.Yellow, "Саня");

    public static final int STAR_ID1 = 100000;
    public static final int STAR_ID2 = 100001;
    public static final int STAR_ID3 = 100002;

    public static final List<Star> STARS = Arrays.asList(STAR1, STAR2, STAR3);

    public static final List<StarType> STARTYPES = Arrays.asList(StarType.Blue, StarType.WhiteBlue,
            StarType.White, StarType.YellowWhite, StarType.Yellow, StarType.Orange, StarType.Red);

}