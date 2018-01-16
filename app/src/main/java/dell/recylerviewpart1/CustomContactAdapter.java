package dell.recylerviewpart1;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by dell on 16-01-2018.
 */

public class CustomContactAdapter extends RecyclerView.Adapter<CustomContactAdapter.MyViewHolder> {

    private ArrayList<Contact> arrayList = new ArrayList<>();
    private OnRecyclerClickListener listener;

    public CustomContactAdapter(ArrayList<Contact> arrayList, OnRecyclerClickListener listener) {
        this.listener = listener;
        this.arrayList = arrayList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.v("CreateViewHolder", "in onCreateViewHolder");
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_list_layout,parent,false);

        return new MyViewHolder(itemView);
    }



    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        Log.v("BindViewHolder", "in onBindViewHolder");
        Contact contact = arrayList.get(position);
        holder.name.setText(contact.getmName());
        holder.number.setText(contact.getmNumber());
        holder.addedOn.setText(contact.getmAddedOn());

        holder.name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onRecyclerViewItemClicked(position,view.getId());
            }
        });
    }



    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name, number, addedOn;
        public MyViewHolder(View itemView) {
            super(itemView);
            Log.v("ViewHolder","in View Holder");
            name = itemView.findViewById(R.id.textView);
            number = itemView.findViewById(R.id.textView2);
            addedOn = itemView.findViewById(R.id.textView3);

        }


    }
}
