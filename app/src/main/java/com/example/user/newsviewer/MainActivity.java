package com.example.user.newsviewer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button Sportsbtn;
    private Button Crimebtn;
    private Button Politicsbtn;
    private Button Gamingbtn;
    private Button Celebbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Sportsbtn = (Button) findViewById(R.id.Sportbtn);

        Sportsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sports = "https://www.supersport.com/live.aspx";
                Uri SportNews = Uri.parse(sports);

                Intent sportsnews = new  Intent(Intent.ACTION_VIEW, SportNews);
                if (sportsnews.resolveActivity(getPackageManager()) != null) {
                        startActivity(sportsnews);

                }


            }
        });
    }
}
