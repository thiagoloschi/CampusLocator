package campuslocator.android.thiagoloschi.com.campuslocator;


import android.app.ListFragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;

import java.io.Serializable;

public class ShuttleListFragment extends ListFragment implements OnItemClickListener {
    Context context;
    LocationLab ll = new LocationLab();
    Location[] local = ll.getLocations(4);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_fragment, container, false);
        context = view.getContext();
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(), R.array.Shuttle, android.R.layout.simple_list_item_1);
        setListAdapter(adapter);

        getListView().setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,long id) {
        Intent i = new Intent(context, MapsActivity.class);
        switch (position) {
            case 0:
                i.putExtra("local", (Serializable) local[position]);
                startActivity(i);
                break;
            case 1:
                i.putExtra("local", (Serializable) local[position]);
                startActivity(i);
                break;
            case 2:
                i.putExtra("local", (Serializable) local[position]);
                startActivity(i);
                break;
            case 3:
                i.putExtra("local", (Serializable) local[position]);
                startActivity(i);
                break;
            case 4:
                i.putExtra("local", (Serializable) local[position]);
                startActivity(i);
                break;
        }
    }
}