package sg.edu.rp.c346.id19045083.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tvTitle;
    ListView lvVersions;
    ArrayList<AndroidVersion> ArrayListAndroidVersion;
//    ArrayAdapter<AndroidVersion> aaAndroidVersion;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTitle = findViewById(R.id.textViewTitle);
        lvVersions = findViewById(R.id.ListView);

        ArrayListAndroidVersion = new ArrayList<AndroidVersion>();
        ArrayListAndroidVersion.add(new AndroidVersion("Pie", "9.0"));
        ArrayListAndroidVersion.add(new AndroidVersion("Oreo", "8.0 - 8.1"));
        ArrayListAndroidVersion.add(new AndroidVersion("Nougat", "7.0 - 7.1.2"));
        ArrayListAndroidVersion.add(new AndroidVersion("Marshmallow", "6.0 - 6.0.1"));
        ArrayListAndroidVersion.add(new AndroidVersion("Lollipop", "5.0 - 5.1.1"));
        ArrayListAndroidVersion.add(new AndroidVersion("KitKat", "4.4 - 4.4.4"));
        ArrayListAndroidVersion.add(new AndroidVersion("Jelly Bean", "4.1 - 4.3.1"));

//        aaAndroidVersion = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, ArrayListAndroidVersion);
//        lvVersions.setAdapter(aaAndroidVersion);

        adapter = new CustomAdapter(this, R.layout.row, ArrayListAndroidVersion);
        lvVersions.setAdapter(adapter);
    }
}