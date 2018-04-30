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
                Crimebtn = (Button) findViewById(R.id.Crimebtn);

                Crimebtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String crime = "https://www.news24.com/Tags/Topics/crime";
                        Uri CrimeNews = Uri.parse(crime);

                        Intent crimenews = new Intent(Intent.ACTION_VIEW, CrimeNews);
                        if (crimenews.resolveActivity(getPackageManager()) != null) {
                            startActivity(crimenews);
                        }

                        Politicsbtn = (Button) findViewById(R.id.Politicbtn);

                        Politicsbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                String politics = "https://www.news24.com/Tags/Topics/crime";
                                Uri PoliticsNews = Uri.parse(politics);

                                Intent politicsnews = new Intent(Intent.ACTION_VIEW, PoliticsNews);
                                if (politicsnews.resolveActivity(getPackageManager()) != null ) {
                                    startActivity(politicsnews);
                                }
                                Gamingbtn = (Button) findViewById(R.id.Gamebtn);

                                Gamingbtn.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        String game = "https://www.gamespot.com/news/";
                                        Uri GamingNews = Uri.parse(game);

                                        Intent gamingnews = new Intent(Intent.ACTION_VIEW, GamingNews);
                                        if (gamingnews.resolveActivity(getPackageManager()) != null) {
                                            startActivity(gamingnews);

                                        }

                                        Celebbtn = (Button) findViewById(R.id.Celebbtn);

                                        Celebbtn.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                String celeb = "https://www.channel24.co.za/Gossip";
                                                Uri CelebNews = Uri.parse(celeb);

                                                Intent celebnews = new Intent(Intent.ACTION_VIEW, CelebNews);
                                                if (celebnews.resolveActivity(getPackageManager()) !=null) {
                                                    startActivity(celebnews);
                                                }
                                            }
                                        });
                                    }
                                });
                            }
                        });
                    }
                });


            }
        });
    }
}
