package nyc.jsjrobotics.c4q_firstday.people;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import nyc.jsjrobotics.c4q_firstday.R;

class PeepViewHolder extends RecyclerView.ViewHolder {
    private final View root;
    private final TextView name;
    private final ImageView picture;
    private final TextView color;

    private Peeps data;

    public PeepViewHolder(final ViewGroup parent) {
        super(inflateView(parent));
        root = itemView;
        name = root.findViewById(R.id.name);
        picture = root.findViewById(R.id.picture);
        color = root.findViewById(R.id.color);
    }

    private static View inflateView(final ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.viewholder_peep, parent, false);
    }

    public void setData(final Peeps data, final Runnable onClick ) {
        this.data = data;
        name.setText(data.name);
        color.setText(data.color);
        picture.setImageResource(data.picture);
        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                onClick.run();
            }
        });
    }
}
