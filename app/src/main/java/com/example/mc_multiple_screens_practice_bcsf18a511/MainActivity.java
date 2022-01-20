package com.example.mc_multiple_screens_practice_bcsf18a511;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;
import java.net.URISyntaxException;

public class MainActivity extends AppCompatActivity {
    Button newActivityBtn;
    Button dialBtn;
    Button openGitHubBtn;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newActivityBtn = findViewById(R.id.newActivity);
        dialBtn = findViewById(R.id.dialBtn);
        openGitHubBtn = findViewById(R.id.openGitHub);
        newActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
        dialBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+923160494606"));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
        openGitHubBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("https://github.com/Junaid-JnZ/screens-android.git");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }
}