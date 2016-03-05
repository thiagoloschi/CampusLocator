package campuslocator.android.thiagoloschi.com.campuslocator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class ListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i = getIntent();
        // Receiving the Data
        int id = i.getIntExtra("id",0);
        //i.removeExtra("id");
        switch (id){
            case 1:
                setContentView(R.layout.building_activity_list);
            break;
            case 2:
                setContentView(R.layout.dining_activity_list);
                break;
            case 3:
                setContentView(R.layout.parking_activity_list);
                break;
            case 4:
                setContentView(R.layout.shuttle_activity_list);
            break;
        }
    }
}
