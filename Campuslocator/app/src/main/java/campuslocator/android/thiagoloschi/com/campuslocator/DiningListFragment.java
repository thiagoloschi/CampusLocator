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

public class DiningListFragment extends ListFragment implements OnItemClickListener {
    Context context;
    LocationLab ll = new LocationLab();
    Location[] local = ll.getLocations(2);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        setHasOptionsMenu(true);
        View view = inflater.inflate(R.layout.list_fragment, container, false);
        context = view.getContext();
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(), R.array.Dining, android.R.layout.simple_list_item_1);
        setListAdapter(adapter);

        getListView().setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,long id) {
        Intent i = new Intent(context, MapsActivity.class);
        switch (position){
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
            case 5:
                i.putExtra("local", (Serializable) local[position]);
                startActivity(i);
                break;
            case 6:
                i.putExtra("local", (Serializable) local[position]);
                startActivity(i);
                break;
            case 7:
                i.putExtra("local", (Serializable) local[position]);
                startActivity(i);
                break;
            case 8:
                i.putExtra("local", (Serializable) local[position]);
                startActivity(i);
                break;
            case 9:
                i.putExtra("local", (Serializable) local[position]);
                startActivity(i);
                break;
        }
    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu, Inflater inflater) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.
            inflater.inflate(R.menu.main, menu);
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIiatement
        if (id == R.id.action_settings) {
            return true;
        }

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/

}