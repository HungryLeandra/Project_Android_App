package com.parrot.sdksample.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



import com.parrot.arsdk.ardiscovery.ARDiscoveryDeviceService;
import com.parrot.sdksample.R;
import com.parrot.sdksample.drone.BebopDrone;


public class MainActivity extends AppCompatActivity {

    private BebopDrone mBebopDrone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
     * Function called when the "connect" button is clicked
     */
    public void clickedConnectButtonCallback(View view) {

        // Change the text of the button to confirm the function was called
        //TextView textView = findViewById(R.id.connect2drone_button);
        //textView.setText("Button works!");

        // Put intent
        Intent intent = new Intent(MainActivity.this, DeviceListActivity.class);
        if (intent != null) {
            startActivity(intent);
        }
    }
}
