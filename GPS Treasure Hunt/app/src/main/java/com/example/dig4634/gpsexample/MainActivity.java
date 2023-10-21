package com.example.dig4634.gpsexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements LocationListener {

    final int PERMISSION_REQUEST_CODE = 0;

    Location Marston;
    Location LibWest;
    Location Newell;
    Location Architecture;
    Location Education;
    Location Home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Marston = new Location(LocationManager.GPS_PROVIDER);
        Marston.setLongitude(-82.3437);
        Marston.setLatitude(29.6481);

        LibWest = new Location(LocationManager.GPS_PROVIDER);
        LibWest.setLongitude(-82.3425);
        LibWest.setLatitude(29.6514);

        Newell = new Location(LocationManager.GPS_PROVIDER);
        Newell.setLongitude(-82.3451);
        Newell.setLatitude(29.6491);

        Architecture = new Location(LocationManager.GPS_PROVIDER);
        Architecture.setLongitude(-82.3406);
        Architecture.setLatitude(29.6481);

        Education = new Location(LocationManager.GPS_PROVIDER);
        Education.setLongitude(-82.3377);
        Education.setLatitude(29.6466);

        Home = new Location(LocationManager.GPS_PROVIDER);
        Home.setLongitude(-82.3651);
        Home.setLatitude(29.6081);


        boolean permissionGranted =
                ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                        == PackageManager.PERMISSION_GRANTED;

        if (permissionGranted) {
            //start Location Services
            Log.d("Example", "User granted permissions before. Start GPS now");
            startGPS();
        } else {
            //We need to request permissions
            Log.d("Example", "User never granted permissions before. Request now");
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, PERMISSION_REQUEST_CODE);
        }
    }

    public void onStart(View view) {

        Log.d("Example", "clicked start!");

        Intent my_intent = new Intent(getBaseContext(), DigitalWorldsActivity.class);
        my_intent.putExtra("pictureID", R.drawable.findroboprompt);
        startActivity(my_intent);

    }

    public void startGPS() {

        boolean permissionGranted =
                ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                        == PackageManager.PERMISSION_GRANTED;

        if (permissionGranted) {
            LocationManager manager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
            manager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 500, 1, this);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {

        if (requestCode == PERMISSION_REQUEST_CODE) {

            if (grantResults[0] == PackageManager.PERMISSION_DENIED) {
                //The user clicked on the DENY button
                Log.d("Example", "User denied permissions just now. Exit");
                finish();
            } else {
                //The user clicked on the ALLOW button
                Log.d("Example", "User granted permissions right now. Start GPS now");
                startGPS();
            }

        }

    }

    @Override
    public void onLocationChanged(Location location) {
        if (location.distanceTo(Marston) < 50) {
            Intent my_intent = new Intent(getBaseContext(), DigitalWorldsActivity.class);
            my_intent.putExtra("pictureID", R.drawable.robolegs);
            startActivity(my_intent);
        } else if (location.distanceTo(LibWest) < 50) {
            Intent my_intent = new Intent(getBaseContext(), DigitalWorldsActivity.class);
            my_intent.putExtra("pictureID", R.drawable.roboarms);
            startActivity(my_intent);
        } else if (location.distanceTo(Architecture) < 50) {
            Intent my_intent = new Intent(getBaseContext(), DigitalWorldsActivity.class);
            my_intent.putExtra("pictureID", R.drawable.robohead);
            startActivity(my_intent);
        }else if (location.distanceTo(Education) < 50) {
            Intent my_intent = new Intent(getBaseContext(), DigitalWorldsActivity.class);
            my_intent.putExtra("pictureID", R.drawable.robonothing);
            startActivity(my_intent);
        } else if (location.distanceTo(Newell) < 50) {
            Intent my_intent = new Intent(getBaseContext(), DigitalWorldsActivity.class);
            my_intent.putExtra("pictureID", R.drawable.robotorso);
            startActivity(my_intent);
        } else if (location.distanceTo(Home) < 50) {
            Intent my_intent = new Intent(getBaseContext(), DigitalWorldsActivity.class);
            my_intent.putExtra("pictureID", R.drawable.robofound);
            startActivity(my_intent);
        } else {
            Log.d("Example", "Not a saved location");
        }
    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String s) {

    }


}
