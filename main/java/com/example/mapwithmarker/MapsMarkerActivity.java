package com.example.mapwithmarker;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.GoogleMap.OnMapClickListener;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Random;
import android.util.Log;
import android.widget.Toast;
import android.content.Context;
import com.google.android.gms.maps.GoogleMap.InfoWindowAdapter;
import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener;
import com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.support.annotation.ColorInt;
import android.graphics.Color;
import com.google.android.gms.maps.model.BitmapDescriptor;



/*CODE USED WITH PERMISSION:
https://github.com/googlemaps/android-samples/blob/master/ApiDemos/java/app/src/main/java/com/example/mapdemo/MarkerDemoActivity.java
https://github.com/googlemaps/android-samples/tree/master/tutorials/MapWithMarker
https://github.com/googlemaps/android-samples/blob/master/ApiDemos/java/app/src/main/java/com/example/mapdemo/OnMapAndViewReadyListener.java
https://github.com/googlemaps/android-samples/blob/master/ApiDemos/java/app/src/main/java/com/example/mapdemo/MarkerDemoActivity.java
https://gist.github.com/ccjeng/ff8ca25e0e92302639dadbe4a8533279

/**
 * An activity that displays a Google map with a marker (pin) to indicate a particular location.
 */
public class MapsMarkerActivity extends AppCompatActivity
        implements OnMapReadyCallback,
        OnMarkerClickListener {

    private GoogleMap mmap;
    Context mcontext = this;

    private Marker mBaskin;
    private Marker mBaskin2;
    private Marker mPBsci;
    private final Random mRandom = new Random();




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


    //MAIN INFO ----------------------------------------------------
    @Override
    public void onMapReady(GoogleMap map) {

        mmap = map;


        mmap.setOnMarkerClickListener((OnMarkerClickListener) this);

        //baskin

        BitmapDescriptor icon = BitmapDescriptorFactory.fromResource(R.mipmap.baskin);
        LatLng BASKIN = new LatLng(37.000151, -122.063089);
        mBaskin = mmap.addMarker(new MarkerOptions()
                .position(BASKIN)
                .title("Bathroom in Baskin")
                .icon(icon));
        mmap.moveCamera(CameraUpdateFactory.newLatLng(BASKIN));

        //e2
        BitmapDescriptor icon2 = BitmapDescriptorFactory.fromResource(R.mipmap.e2);
        LatLng BASKIN2 = new LatLng(37.000883, -122.063114);
        mBaskin2 = mmap.addMarker(new MarkerOptions()
                .position(BASKIN2)
                .title("Bathroom in E2")
                .icon(icon2));


        //pb sci
        BitmapDescriptor icon3 = BitmapDescriptorFactory.fromResource(R.mipmap.pbsci);
        LatLng PBSCI = new LatLng(36.999606, -122.062027);
        mPBsci = mmap.addMarker(new MarkerOptions()
                .position(PBSCI)
                .title("Bathroom in PB Sci")
                .icon(icon3));




    }

    //ONCLICK -----------------------------------------------------
    @Override
    public boolean onMarkerClick(final Marker marker){
       if(marker.equals(mBaskin)) {
           //do something
       } else if(marker.equals(mBaskin2)){
            //do something
       } else if(marker.equals(mPBsci)){
            //do something
       }

       return false;
    }


}