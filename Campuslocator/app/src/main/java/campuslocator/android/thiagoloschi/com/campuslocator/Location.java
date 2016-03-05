package campuslocator.android.thiagoloschi.com.campuslocator;

import com.google.android.gms.maps.model.LatLng;

import java.io.Serializable;

/**
 * Created by thiagoloschi on 11/20/15.
 */
public class Location implements Serializable {

    private String name;
    private String tel;
    private String coordinates;

    public Location() {

    }

    public Location(String name, String tel, String coordinates) {
        this();
        this.name = name;
        this.tel = tel;
        this.coordinates = coordinates;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public String getName() {
        return name;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public LatLng getLatlong() {
        String coordinates[] = this.coordinates.split(",");
        Double longi = Double.valueOf(coordinates[0]);
        Double lat = Double.valueOf(coordinates[1]);
        return new LatLng(longi, lat);
    }

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", coordinates='" + coordinates + '\'' +
                '}';
    }
}

