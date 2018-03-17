package nyc.jsjrobotics.c4q_firstday.people;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;
import java.util.function.Consumer;

class PeepsAdapter extends RecyclerView.Adapter<PeepViewHolder> {
    private List<Peeps> data;
    private Consumer<Peeps> onClickListener;

    @Override
    public PeepViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        return new PeepViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(final PeepViewHolder holder, final int position) {
        final Peeps peep = data.get(position);
        final Runnable onClicked = new Runnable() {
            @Override
            public void run() {
                onClickListener.accept(peep);
            }
        };
        holder.setData(peep, onClicked );
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void setData(final List<Peeps> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    public void setOnPeepClicked(final Consumer<Peeps> consumer) {
        onClickListener = consumer;
    }
}
