package com.example.prepopulatedb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.prepopulatedb.database.AppDatabase;
import com.example.prepopulatedb.database.DataEntity;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private static final int NUM_LIST_ITEMS = 100;

    private AppDatabase mDb;

    private GreenAdapter mAdapter;
    private RecyclerView mNumbersList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDb = AppDatabase.getInstance(this);
        Log.d(TAG,"Got DB-handle! =====");

//        mNumbersList = (RecyclerView) findViewById(R.id.rv_numbers);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        mNumbersList.setLayoutManager(layoutManager);
//        mNumbersList.setHasFixedSize(true);
//        mAdapter = new GreenAdapter(NUM_LIST_ITEMS);
//
//        mNumbersList.setAdapter(mAdapter);




    }

    @Override
    protected void onResume() {
        super.onResume();
        int length = mDb.dataDao().getAll().size();
        Log.d(TAG, "Count of records in: " + length);

        int id;
        String imageUrl;
        String title;
        String text;

        List<DataEntity> list = mDb.dataDao().getAll();
        for (DataEntity item:list) {
            id = item.getId();
            title = item.getTitle();
            text = item.getText();
            imageUrl = item.getImageUrl();
            Log.d(TAG,""+id+", "+imageUrl+", "+title+", "+text);

        }
    }
}
