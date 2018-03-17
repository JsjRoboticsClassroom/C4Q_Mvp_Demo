package nyc.jsjrobotics.c4q_firstday.people;

import java.util.ArrayList;
import java.util.List;

import nyc.jsjrobotics.c4q_firstday.R;

public class PeopleModel {
    private final static List<Peeps> firebaseData = new ArrayList<Peeps>();


    public List<Peeps> downloadData() {
        return firebaseData;
    }

    public void setData() {
        firebaseData.add(new Peeps(
                "Jonathan",
                "I'm an android programmer",
                "Green",
                R.drawable.ic_android_black_24dp
        ));
    }
}
