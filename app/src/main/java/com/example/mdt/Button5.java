package com.example.mdt;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Button5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button5);

        // Get the TextView where we will display the network connection status
        TextView networkStatusTextView = findViewById(R.id.network_status_text_view);

        // Check and display the network connection status
        String networkStatus = getNetworkConnectionStatus(this);
        networkStatusTextView.setText(networkStatus);
    }

    // Method to check the network connection status
    public static String getNetworkConnectionStatus(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager != null) {
            NetworkInfo activeNetwork = connectivityManager.getActiveNetworkInfo();
            if (activeNetwork != null && activeNetwork.isConnectedOrConnecting()) {
                return "Network Status: Connected";
            } else {
                return "Network Status: Not Connected";
            }
        } else {
            return "Network Status: Unknown";
        }
    }
}
