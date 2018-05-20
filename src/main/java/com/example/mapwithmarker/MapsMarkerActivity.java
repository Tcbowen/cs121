package com.example.mapwithmarker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * An activity that displays a Google map with a marker (pin) to indicate a particular location.
 */
public class MapsMarkerActivity extends AppCompatActivity
        implements OnMapReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Retrieve the content view that renders the map.
        setContentView(R.layout.activity_maps);
        // Get the SupportMapFragment and request notification
        // when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map when it's available.
     * The API invokes this callback when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user receives a prompt to install
     * Play services inside the SupportMapFragment. The API invokes this method after the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng baskin = new LatLng(37.000151, -122.063089);
        googleMap.addMarker(new MarkerOptions()
                .position(baskin)
                .title("Bathroom in Baskin"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(baskin));

        LatLng baskin2 = new LatLng(37.000883, -122.063114);
        googleMap.addMarker(new MarkerOptions()
                .position(baskin2)
                .title("Bathroom in Engineering 2"));

        LatLng pbsci = new LatLng(36.999606, -122.062027);
        googleMap.addMarker(new MarkerOptions()
                .position(pbsci)
                .title("Bathroom in PB Sci"));

        LatLng film = new LatLng(37.000848, -122.061421);
        googleMap.addMarker(new MarkerOptions()
                .position(film)
                .title("Bathroom in Communications"));

        LatLng reclounge = new LatLng(37.000587, -122.057673);
        googleMap.addMarker(new MarkerOptions()
                .position(reclounge)
                .title("Bathroom in 9/10 Rec Lounge"));

        LatLng ss2 = new LatLng(37.001529, -122.058749);
        googleMap.addMarker(new MarkerOptions()
                .position(ss2)
                .title("Bathroom in Social Sciences 2"));

        LatLng ss1 = new LatLng(37.001884, -122.057891);
        googleMap.addMarker(new MarkerOptions()
                .position(ss1)
                .title("Bathroom in Social Sciences 1"));


        LatLng dh910 = new LatLng(37.000732, -122.057773);
        googleMap.addMarker(new MarkerOptions()
                .position(dh910)
                .title("Bathroom in 9/10 Dining Hall"));

        LatLng crown = new LatLng(37.000036, -122.054805);
        googleMap.addMarker(new MarkerOptions()
                .position(crown)
                .title("Bathroom in Crown Classrooms"));

        LatLng crown2 = new LatLng(36.999834, -122.054459);
        googleMap.addMarker(new MarkerOptions()
                .position(crown2)
                .title("Bathroom in Crown Offices"));

        LatLng crowndh = new LatLng(367.000124, -122.054409);
        googleMap.addMarker(new MarkerOptions()
                .position(crowndh)
                .title("Bathroom in Crown/Merrill Dining Hall"));


        LatLng merrill = new LatLng(36.999687, -122.053587);
        googleMap.addMarker(new MarkerOptions()
                .position(merrill)
                .title("Bathroom in Merrill Classrooms"));

        LatLng cc = new LatLng(37.000228, -122.053809);
        googleMap.addMarker(new MarkerOptions()
                .position(cc)
                .title("Bathroom near Merrill Cultural Center"));

        LatLng stevenson = new LatLng(36.997141, -122.051843);
        googleMap.addMarker(new MarkerOptions()
                .position(stevenson)
                .title("Bathroom in Stevenson Classrooms"));


        LatLng cowell = new LatLng(36.997229, -122.053017);
        googleMap.addMarker(new MarkerOptions()
                .position(cowell)
                .title("Bathroom near Cowell Programs Office"));

        LatLng cowell2 = new LatLng(36.997084, -122.052886);
        googleMap.addMarker(new MarkerOptions()
                .position(cowell2)
                .title("Bathroom near Cowell/Stevenson Dining Hall"));

        LatLng cowell3 = new LatLng(36.99726, -122.053486);
        googleMap.addMarker(new MarkerOptions()
                .position(cowell3)
                .title("Bathroom in Cowell Administrative Building"));

        LatLng humanities = new LatLng(36.999606, -122.062027);
        googleMap.addMarker(new MarkerOptions()
                .position(humanities)
                .title("Bathroom near Humanities Lecture Hall"));

        LatLng quarry = new LatLng(36.998251, -122.055531);
        googleMap.addMarker(new MarkerOptions()
                .position(quarry)
                .title("Bathroom in Quarry Plaza"));

        LatLng careercenter = new LatLng(36.99775, -122.05552);
        googleMap.addMarker(new MarkerOptions()
                .position(careercenter)
                .title("Bathroom near Career Center"));

        LatLng opers = new LatLng(36.995047, -122.054012);
        googleMap.addMarker(new MarkerOptions()
                .position(opers)
                .title("Bathroom/Locker Room in OPERS"));

        LatLng opers2 = new LatLng(36.994575, -122.05486);
        googleMap.addMarker(new MarkerOptions()
                .position(opers2)
                .title("Bathroom/Locker Room in OPERS"));

        LatLng mchenry = new LatLng(36.995561, -122.058883);
        googleMap.addMarker(new MarkerOptions()
                .position(mchenry)
                .title("Bathroom on each floor of McHenry Library"));

        LatLng arc = new LatLng(36.994349, -122.059296);
        googleMap.addMarker(new MarkerOptions()
                .position(arc)
                .title("Bathroom in ARCenter"));

        LatLng oakes = new LatLng(36.989618, -122.062799);
        googleMap.addMarker(new MarkerOptions()
                .position(oakes)
                .title("Bathroom in Oakes Academic Building"));

        LatLng porter = new LatLng(36.993911, -122.065407);
        googleMap.addMarker(new MarkerOptions()
                .position(porter)
                .title("Bathroom in Porter Academic Building"));

        LatLng thimann = new LatLng(36.998153, -122.061689);
        googleMap.addMarker(new MarkerOptions()
                .position(thimann)
                .title("Bathroom in Thimann Labs"));

        LatLng thimann2 = new LatLng(36.998037, -122.061319);
        googleMap.addMarker(new MarkerOptions()
                .position(thimann2)
                .title("Bathroom next to Thimann Lecture Halls"));

        LatLng cookhouse = new LatLng(36.978906, -122.0545);
        googleMap.addMarker(new MarkerOptions()
                .position(cookhouse)
                .title("Bathroom in Cookhouse"));








    }
}


















