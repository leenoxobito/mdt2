package com.example.mdt;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Button3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button3);

        // Get the TextView where we will display the CPU information
        TextView cpuInfoTextView = findViewById(R.id.cpu_info_text_view);

        // Get and display CPU information
        String cpuInfo = getCPUInfo();
        cpuInfoTextView.setText(cpuInfo);
    }

    // Method to retrieve CPU information
    public static String getCPUInfo() {
        StringBuilder cpuInfoBuilder = new StringBuilder();

        cpuInfoBuilder.append("CPU Architecture: ").append(Build.CPU_ABI).append("\n");
        cpuInfoBuilder.append("CPU Model: ").append(Build.HARDWARE).append("\n");
        cpuInfoBuilder.append("CPU Manufacturer: ").append(Build.MANUFACTURER).append("\n");
        cpuInfoBuilder.append("CPU Brand: ").append(Build.BRAND).append("\n");
        cpuInfoBuilder.append("CPU Device: ").append(Build.DEVICE).append("\n");
        cpuInfoBuilder.append("CPU Model (Readable): ").append(Build.MODEL).append("\n");
        cpuInfoBuilder.append("CPU Board: ").append(Build.BOARD).append("\n");
        cpuInfoBuilder.append("CPU ID: ").append(Build.ID).append("\n");
        cpuInfoBuilder.append("CPU Serial: ").append(Build.SERIAL).append("\n");

        return cpuInfoBuilder.toString();
    }
}
