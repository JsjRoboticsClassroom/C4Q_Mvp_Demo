package nyc.jsjrobotics.c4q_firstday.people;
import android.support.annotation.DrawableRes;

class Peeps {
    String name;
    String description;
    String color;
    @DrawableRes int picture;

    public Peeps(String name,
            String description,
            String color,
            @DrawableRes int picture) {
        this.name = name;
        this.description = description;
        this.color = color;
        this.picture = picture;
    }
}
