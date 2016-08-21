package appewtc.masterung.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    //Explicit การประกาศตัวแปร
    private ListView trafficListView;
    private Button aboutMeButton;
    private static final String urlYouTube = "https://youtu.be/AFmWqLIqDZA";
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // This's statement
        setContentView(R.layout.activity_main);

        //Bind Widget คือการผูกความสัมพันธ์ ตัวแปร และ Widget
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);

        //Get Event from Click Button
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Sound Effect
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.effect_btn_long);
                mediaPlayer.start();

                //Intent to WebView
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(urlYouTube));
                startActivity(intent);


            }   // onClick
        });

        //Create ListView
        //I Setup Basic Array
        int[] iconInts = new int[20];
        iconInts[0] = R.drawable.traffic_01;
        iconInts[1] = R.drawable.traffic_02;
        iconInts[2] = R.drawable.traffic_03;
        iconInts[3] = R.drawable.traffic_04;
        iconInts[4] = R.drawable.traffic_05;
        iconInts[5] = R.drawable.traffic_06;
        iconInts[6] = R.drawable.traffic_07;
        iconInts[7] = R.drawable.traffic_08;
        iconInts[8] = R.drawable.traffic_09;
        iconInts[9] = R.drawable.traffic_10;
        iconInts[10] = R.drawable.traffic_11;
        iconInts[11] = R.drawable.traffic_12;
        iconInts[12] = R.drawable.traffic_13;
        iconInts[13] = R.drawable.traffic_14;
        iconInts[14] = R.drawable.traffic_15;
        iconInts[15] = R.drawable.traffic_16;
        iconInts[16] = R.drawable.traffic_17;
        iconInts[17] = R.drawable.traffic_18;
        iconInts[18] = R.drawable.traffic_19;
        iconInts[19] = R.drawable.traffic_20;

        //2. SEtup Array from other Class

        MyDatadata myDatadata = new MyDatadata();
        String[] titleStrings = myDatadata.getTitleStrings();

        int[] ints = myDatadata.getInts();
        String[] stockStrings = new String[ints.length];
        String[] priceStrings = new String[ints.length];

        for (int i=0; i<ints.length;i+=1) {

            stockStrings[i] = "Stock = " + Integer.toString(ints[i]);
            priceStrings[i] = Integer.toString(ints[i]) + " บาท";

        }
        //3.setup array form other xml
        String[] detailStrings = getResources().getStringArray(R.array.detail);

        //SubString คือการตัดคำ
        String[] detailShortStrings = new String[detailStrings.length];
        for (int i=0; i<detailShortStrings.length; i+=1) {

            detailShortStrings[i] = detailShortStrings[i].substring(0, 30) + "...";



    }   // for

        Traf traf = new Traf(this, iconInts, titleStrings, detailStrings, stockStrings, priceStrings);




        // Main Method

    

    }
}   // Main Class นี่คือ คลาสหลัก เว้ยเห้ย
