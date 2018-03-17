package nyc.jsjrobotics.c4q_firstday.people;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PeopleFragment extends Fragment {

    public static final String TAG = "TAG_PEOPLE_FRAGMENT";
    private final PeopleView view = new PeopleView();
    private final PeoplePresenter presenter = new PeoplePresenter();

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater,
                             @Nullable final ViewGroup container,
                             @Nullable final Bundle savedInstanceState) {
        view.init(inflater, container);
        presenter.setView(view);
        return view.getRoot();

    }
}
