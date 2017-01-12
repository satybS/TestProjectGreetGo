package greetGoTestProject.model;

import java.io.Serializable;

/**
 * Created by sanzhar on 1/9/17.
 */
public enum StarType implements Serializable {
    Blue("Голубая"), WhiteBlue("Бело-голубая"), White("Белая"), YellowWhite("Желто-белая"),
    Yellow("Желтая"), Orange("Оранжевая"), Red("Красная");

    private String type;

    public String getType() {
        return type;
    }

    StarType(String type) {
        this.type = type;
    }

}
