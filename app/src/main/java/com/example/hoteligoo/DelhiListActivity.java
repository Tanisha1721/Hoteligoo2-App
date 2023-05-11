package com.example.hoteligoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class DelhiListActivity extends AppCompatActivity {

    ListView list;
    String hotels[] = {
           "Radisson Blu Hotel",
           "Vivanta by taj",
            "Dynasty",
            "Royal Blue",
            "Hotel Mayflower",
            "Hotel Millenium",
            "Hayat Residency",
            "The lily hotel",
            "Greenwood Resort",
            "Hotel Contour",
            "Hotel Marriott",
            "Hotel Four Seasons"
    };

    Integer[] imageId = {
          R.drawable.food1,
          R.drawable.food2,
          R.drawable.food3,
          R.drawable.food4,
          R.drawable.food5,
          R.drawable.food6,
          R.drawable.food7,
          R.drawable.food8,
          R.drawable.food9,
          R.drawable.food10,
          R.drawable.food11,
          R.drawable.food12
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delhi_list);

        CustomList adapter = new CustomList(DelhiListActivity.this, hotels, imageId);

        list = findViewById(R.id.delhi_listview);
        list.setAdapter(adapter);
    }
}