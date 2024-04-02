package com.example.mdt;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Button6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button6);

        // Get the TextView where we will display the IP address
        TextView ipAddressTextView = findViewById(R.id.ip_address_text_view);

        // Get the IP address of the device
        String ipAddress = getDeviceIpAddress(this);

        // Display the IP address on the TextView
        ipAddressTextView.setText("IP Address: " + ipAddress);
    }

    // Method to retrieve the IP address of the device
    public static String getDeviceIpAddress(Context context) {
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        if (wifiManager != null) {
            WifiInfo wifiInfo = wifiManager.getConnectionInfo();
            int ipAddress = wifiInfo.getIpAddress();
            // Convert IP address from integer format to string
            return String.format("%d.%d.%d.%d",
                    (ipAddress & 0xff),
                    (ipAddress >> 8 & 0xff),
                    (ipAddress >> 16 & 0xff),
                    (ipAddress >> 24 & 0xff));
        } else {
            return "Unknown";
        }
    }
}
