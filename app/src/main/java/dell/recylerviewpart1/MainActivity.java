package dell.recylerviewpart1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Contact> mArrayList = new ArrayList<>();
    private RecyclerView mRecyclerView1;
    private RecyclerView mRecyclerView2;
    private CustomContactAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView1 = findViewById(R.id.recyclerView);
        mRecyclerView2 = findViewById(R.id.recyclerView2);

        mAdapter = new CustomContactAdapter(mArrayList, new OnRecyclerClickListener() {
            @Override
            public void onRecyclerViewItemClicked(int position, int id) {
                Toast.makeText(getApplicationContext(),""+position,Toast.LENGTH_SHORT).show();
            }
        });
        mRecyclerView1.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        mRecyclerView1.setItemAnimator( new DefaultItemAnimator());
        mRecyclerView1.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        mRecyclerView1.setAdapter(mAdapter);

        mRecyclerView2.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false));
        mRecyclerView2.setItemAnimator( new DefaultItemAnimator());
        mRecyclerView2.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        mRecyclerView2.setAdapter(mAdapter);



        prepareData();
    }

    private void prepareData() {
        Contact contact = null;
        contact = new Contact("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);

        contact = new Contact("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new Contact("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new Contact("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new Contact("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new Contact("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new Contact("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new Contact("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new Contact("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new Contact("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new Contact("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new Contact("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new Contact("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new Contact("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new Contact("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);

        mAdapter.notifyDataSetChanged();
    }


    public void onRecyclerViewItemClicked(int position, int id)
    {
        if(id==-1){
            Toast.makeText(getApplicationContext(), "complete item clicked", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getApplicationContext(), "setting button clicked", Toast.LENGTH_LONG).show();
        }
    }
}
