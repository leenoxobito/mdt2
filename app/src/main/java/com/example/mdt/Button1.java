package com.example.mdt;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Button1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button1);

        // Get the TextView where we will display the device details
        TextView deviceDetailsTextView = findViewById(R.id.device_details_text_view);

        // Get and display device details
        String deviceDetails = getDeviceDetails();
        deviceDetailsTextView.setText(deviceDetails);
    }

    // Method to retrieve device details
    public static String getDeviceDetails() {
        StringBuilder deviceDetailsBuilder = new StringBuilder();

        deviceDetailsBuilder.append("Manufacturer: ").append(Build.MANUFACTURER).append("\n");
        deviceDetailsBuilder.append("Model: ").append(Build.MODEL).append("\n");
        deviceDetailsBuilder.append("Product: ").append(Build.PRODUCT).append("\n");
        deviceDetailsBuilder.append("Brand: ").append(Build.BRAND).append("\n");
        deviceDetailsBuilder.append("Device: ").append(Build.DEVICE).append("\n");
        deviceDetailsBuilder.append("Board: ").append(Build.BOARD).append("\n");
        deviceDetailsBuilder.append("Hardware: ").append(Build.HARDWARE).append("\n");
        deviceDetailsBuilder.append("Serial: ").append(Build.SERIAL).append("\n");
        deviceDetailsBuilder.append("Android Version: ").append(Build.VERSION.RELEASE).append("\n");
        deviceDetailsBuilder.append("SDK Version: ").append(Build.VERSION.SDK_INT).append("\n");

        return deviceDetailsBuilder.toString();
    }
}
