package com.example.gridview.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.GridView;

import com.example.gridview.R;
import com.example.gridview.adapters.GalleryAdapter;
import com.example.gridview.models.Users;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Users> users;
    private GridView gallery;
    private GalleryAdapter galleryAdapter;
    private String[] names={
            "PSF","KSF","ASF","GS","MKS",
            "PSF","KSF","ASF","GS","MKS",
            "PSF","KSF","ASF","GS","MKS",
            "PSF","KSF","ASF","GS","MKS",
            "PSF","KSF","ASF","GS","MKS"
    };
    private String[] professions={
            "ME","BRO","UNCLE","BFF","BFF",
            "ME","BRO","UNCLE","BFF","BFF",
            "ME","BRO","UNCLE","BFF","BFF",
            "ME","BRO","UNCLE","BFF","BFF",
            "ME","BRO","UNCLE","BFF","BFF"
    };
    private int[] photos={
            R.drawable.sample_5,R.drawable.sample_1,R.drawable.sample_6,R.drawable.sample_5,R.drawable.sample_5,
            R.drawable.sample_0,R.drawable.sample_2,R.drawable.sample_3,R.drawable.sample_5,R.drawable.sample_2,
            R.drawable.sample_6,R.drawable.sample_1,R.drawable.sample_4,R.drawable.sample_6,R.drawable.sample_4,
            R.drawable.sample_0,R.drawable.sample_3,R.drawable.sample_3,R.drawable.sample_5,R.drawable.sample_4,
            R.drawable.sample_7,R.drawable.sample_1,R.drawable.sample_5,R.drawable.sample_5,R.drawable.sample_0
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSupportActionBar((Toolbar)findViewById(R.id.toolbar));
        users=new ArrayList<>();
        gallery=(GridView)findViewById(R.id.gallery);
        galleryAdapter=new GalleryAdapter(users,this);
        gallery.setAdapter(galleryAdapter);
        getDatas();
    }

    // getting all the datas
    private void getDatas(){
        for(int count=0;count<names.length;count++){
            users.add(new Users(names[count],professions[count],photos[count]));
        }
    }
}
