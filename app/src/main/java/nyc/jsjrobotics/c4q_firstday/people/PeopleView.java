package nyc.jsjrobotics.c4q_firstday.people;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;
import java.util.function.Consumer;

import nyc.jsjrobotics.c4q_firstday.R;

public class PeopleView {
    private View root;
    private List<Peeps> data;
    private RecyclerView recyclerView;
    private PeepsAdapter adapter = new PeepsAdapter();

    public void init(final LayoutInflater inflater, final ViewGroup container) {
        root = inflater.inflate(R.layout.fragment_people, container, false );
        recyclerView = root.findViewById(R.id.peeps_list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(container.getContext()));
    }

    public View getRoot() {
        return root;
    }

    public void setData(final List<Peeps> data) {
        this.data = data;
        adapter.setData(data);

    }

    public Context getContext() {
        return root.getContext();
    }

    public void setOnPeepClicked(final Consumer<Peeps> consumer) {
        adapter.setOnPeepClicked(consumer);
    }
}
