package com.example.mdt;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Button4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button4);

        // Get the TextView where we will display the RAM details
        TextView ramInfoTextView = findViewById(R.id.ram_info_text_view);

        // Get and display RAM details
        String ramInfo = getRAMInfo(this);
        ramInfoTextView.setText(ramInfo);
    }

    // Method to retrieve RAM details
    public static String getRAMInfo(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager != null) {
            activityManager.getMemoryInfo(memoryInfo);
            long totalMemory = memoryInfo.totalMem; // Total RAM in bytes
            long availableMemory = memoryInfo.availMem; // Available RAM in bytes

            // Convert bytes to megabytes for better readability
            long totalMemoryMB = totalMemory / (1024 * 1024);
            long availableMemoryMB = availableMemory / (1024 * 1024);

            return "Total RAM: " + totalMemoryMB + " MB\n"
                    + "Available RAM: " + availableMemoryMB + " MB";
        } else {
            return "RAM information not available";
        }
    }
}
