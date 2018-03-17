package nyc.jsjrobotics.c4q_firstday.people;

import android.support.v7.app.AlertDialog;

import java.util.function.Consumer;

public class PeoplePresenter {
    private final PeopleModel model = new PeopleModel();
    private PeopleView view;

    public void setView(final PeopleView view) {
        this.view = view;
        model.setData();
        view.setOnPeepClicked(new Consumer<Peeps>() {

            @Override
            public void accept(final Peeps peeps) {
                onPeepClicked(peeps);
            }
        });
        view.setData(model.downloadData());


    }

    public void onPeepClicked(Peeps clicked) {
        new AlertDialog.Builder(view.getContext())
                .setTitle(clicked.name)
                .setMessage(clicked.description)
                .create()
                .show();
    }
}
