package com.example.haniftaqiuddin.almatshurat;

import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DzikirPagi extends AppCompatActivity {

    private ImageView btnBack, backLatin, backTerjemah, backKeutamaan, backAudio;
    private TextView btnLatin, btnTerjemah, btnKeutamaan, tampilLatin, tampilTerjemah, tampilKeutamaan, playAudio;
    private TextView tampilLatin1, tampilTerjemah1, tampilKeutamaan1;
    private TextView tampilLatin2, tampilTerjemah2, tampilKeutamaan2;
    private TextView tampilLatin3, tampilTerjemah3, tampilKeutamaan3;
    private TextView tampilLatin4, tampilTerjemah4, tampilKeutamaan4;
    private TextView tampilLatin5, tampilTerjemah5, tampilKeutamaan5;
    private TextView tampilLatin6, tampilTerjemah6, tampilKeutamaan6;
    private TextView tampilLatin7, tampilTerjemah7, tampilKeutamaan7;
    private TextView tampilLatin8, tampilTerjemah8, tampilKeutamaan8;
    private TextView tampilLatin9, tampilTerjemah9, tampilKeutamaan9;
    private TextView tampilLatin10, tampilTerjemah10, tampilKeutamaan10;
    private TextView tampilLatin11, tampilTerjemah11, tampilKeutamaan11;
    private TextView tampilLatin12, tampilTerjemah12, tampilKeutamaan12;
    private TextView tampilLatin13, tampilTerjemah13, tampilKeutamaan13;
    private TextView tampilLatin14, tampilTerjemah14, tampilKeutamaan14;
    private TextView tampilLatin15, tampilTerjemah15, tampilKeutamaan15;
    private TextView tampilLatin16, tampilTerjemah16, tampilKeutamaan16;
    private TextView tampilLatin17, tampilTerjemah17, tampilKeutamaan17;
    private TextView tampilLatin18, tampilTerjemah18, tampilKeutamaan18;
    private TextView tampilLatin19, tampilTerjemah19, tampilKeutamaan19;
    private TextView tampilLatin20, tampilTerjemah20, tampilKeutamaan20;
    private TextView tampilLatin21, tampilTerjemah21, tampilKeutamaan21;
    private TextView tampilLatin22, tampilTerjemah22, tampilKeutamaan22;
    private TextView tampilLatin23, tampilTerjemah23, tampilKeutamaan23;
    private TextView tampilLatin24, tampilTerjemah24, tampilKeutamaan24;
    private TextView tampilLatin25, tampilTerjemah25, tampilKeutamaan25;
    private TextView tampilLatin26, tampilTerjemah26, tampilKeutamaan26;
    private TextView tampilLatin27, tampilTerjemah27, tampilKeutamaan27;
    private TextView tampilLatin28, tampilTerjemah28, tampilKeutamaan28;
    private TextView tampilLatin29, tampilTerjemah29, tampilKeutamaan29;
    private TextView tampilLatin30, tampilTerjemah30, tampilKeutamaan30;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dzikir_pagi);

        final MediaPlayer[] mediaPlayer = {MediaPlayer.create(this, R.raw.almatsuratsore)};
        mediaPlayer[0].setLooping(true);

        btnBack = (ImageView) findViewById(R.id.btn_back);
        backLatin = (ImageView) findViewById(R.id.back_latin);
        backTerjemah = (ImageView) findViewById(R.id.back_terjemah);
        backKeutamaan = (ImageView) findViewById(R.id.back_keutamaan);
        backAudio = (ImageView) findViewById(R.id.back_audio);
        btnLatin = (TextView) findViewById(R.id.btn_latin);
        btnTerjemah = (TextView) findViewById(R.id.btn_terjemah);
        btnKeutamaan = (TextView) findViewById(R.id.btn_keutamaan);

        tampilLatin = (TextView) findViewById(R.id.tampil_latin);
        tampilTerjemah = (TextView) findViewById(R.id.tampil_terjemah);
        tampilKeutamaan = (TextView) findViewById(R.id.tampil_keutamaan);

        tampilLatin1 = (TextView) findViewById(R.id.tampil_latin1);
        tampilTerjemah1 = (TextView) findViewById(R.id.tampil_terjemah1);
        tampilKeutamaan1 = (TextView) findViewById(R.id.tampil_keutamaan1);

        tampilLatin2 = (TextView) findViewById(R.id.tampil_latin2);
        tampilTerjemah2 = (TextView) findViewById(R.id.tampil_terjemah2);
        tampilKeutamaan2 = (TextView) findViewById(R.id.tampil_keutamaan2);

        tampilLatin3 = (TextView) findViewById(R.id.tampil_latin3);
        tampilTerjemah3 = (TextView) findViewById(R.id.tampil_terjemah3);
        tampilKeutamaan3 = (TextView) findViewById(R.id.tampil_keutamaan3);

        tampilLatin4 = (TextView) findViewById(R.id.tampil_latin4);
        tampilTerjemah4 = (TextView) findViewById(R.id.tampil_terjemah4);
        tampilKeutamaan4 = (TextView) findViewById(R.id.tampil_keutamaan4);

        tampilLatin5 = (TextView) findViewById(R.id.tampil_latin5);
        tampilTerjemah5 = (TextView) findViewById(R.id.tampil_terjemah5);
        tampilKeutamaan5 = (TextView) findViewById(R.id.tampil_keutamaan5);

        tampilLatin6 = (TextView) findViewById(R.id.tampil_latin6);
        tampilTerjemah6 = (TextView) findViewById(R.id.tampil_terjemah6);
        tampilKeutamaan6 = (TextView) findViewById(R.id.tampil_keutamaan6);

        tampilLatin7 = (TextView) findViewById(R.id.tampil_latin7);
        tampilTerjemah7 = (TextView) findViewById(R.id.tampil_terjemah7);
        tampilKeutamaan7 = (TextView) findViewById(R.id.tampil_keutamaan7);

        tampilLatin8 = (TextView) findViewById(R.id.tampil_latin8);
        tampilTerjemah8 = (TextView) findViewById(R.id.tampil_terjemah8);
        tampilKeutamaan8 = (TextView) findViewById(R.id.tampil_keutamaan8);

        tampilLatin9 = (TextView) findViewById(R.id.tampil_latin9);
        tampilTerjemah9 = (TextView) findViewById(R.id.tampil_terjemah9);
        tampilKeutamaan9 = (TextView) findViewById(R.id.tampil_keutamaan9);

        tampilLatin10 = (TextView) findViewById(R.id.tampil_latin10);
        tampilTerjemah10 = (TextView) findViewById(R.id.tampil_terjemah10);
        tampilKeutamaan10 = (TextView) findViewById(R.id.tampil_keutamaan10);

        tampilLatin11 = (TextView) findViewById(R.id.tampil_latin11);
        tampilTerjemah11 = (TextView) findViewById(R.id.tampil_terjemah11);
        //tampilKeutamaan11 = (TextView) findViewById(R.id.tampil_keutamaan11);

        tampilLatin12 = (TextView) findViewById(R.id.tampil_latin12);
        tampilTerjemah12 = (TextView) findViewById(R.id.tampil_terjemah12);
        //tampilKeutamaan12 = (TextView) findViewById(R.id.tampil_keutamaan12);

        tampilLatin13 = (TextView) findViewById(R.id.tampil_latin13);
        tampilTerjemah13 = (TextView) findViewById(R.id.tampil_terjemah13);
        //tampilKeutamaan13 = (TextView) findViewById(R.id.tampil_keutamaan13);

        tampilLatin14 = (TextView) findViewById(R.id.tampil_latin14);
        tampilTerjemah14 = (TextView) findViewById(R.id.tampil_terjemah14);
        //tampilKeutamaan14 = (TextView) findViewById(R.id.tampil_keutamaan14);

        tampilLatin15 = (TextView) findViewById(R.id.tampil_latin15);
        tampilTerjemah15 = (TextView) findViewById(R.id.tampil_terjemah15);
        //tampilKeutamaan15 = (TextView) findViewById(R.id.tampil_keutamaan15);

        tampilLatin16 = (TextView) findViewById(R.id.tampil_latin16);
        tampilTerjemah16 = (TextView) findViewById(R.id.tampil_terjemah16);
        //tampilKeutamaan6 = (TextView) findViewById(R.id.tampil_keutamaan16);

        tampilLatin17 = (TextView) findViewById(R.id.tampil_latin17);
        tampilTerjemah17 = (TextView) findViewById(R.id.tampil_terjemah17);
        //tampilKeutamaan17 = (TextView) findViewById(R.id.tampil_keutamaan17);

        tampilLatin18 = (TextView) findViewById(R.id.tampil_latin18);
        tampilTerjemah18 = (TextView) findViewById(R.id.tampil_terjemah18);
        //tampilKeutamaan18 = (TextView) findViewById(R.id.tampil_keutamaan18);

        tampilLatin19 = (TextView) findViewById(R.id.tampil_latin19);
        tampilTerjemah19 = (TextView) findViewById(R.id.tampil_terjemah19);
        //tampilKeutamaan19 = (TextView) findViewById(R.id.tampil_keutamaan19);

        tampilLatin20 = (TextView) findViewById(R.id.tampil_latin20);
        tampilTerjemah20 = (TextView) findViewById(R.id.tampil_terjemah20);
        //tampilKeutamaan20 = (TextView) findViewById(R.id.tampil_keutamaan20);

        tampilLatin21 = (TextView) findViewById(R.id.tampil_latin21);
        tampilTerjemah21 = (TextView) findViewById(R.id.tampil_terjemah21);
        //tampilKeutamaan21 = (TextView) findViewById(R.id.tampil_keutamaan21);

        tampilLatin22 = (TextView) findViewById(R.id.tampil_latin22);
        tampilTerjemah22 = (TextView) findViewById(R.id.tampil_terjemah22);
        //tampilKeutamaan22 = (TextView) findViewById(R.id.tampil_keutamaan22);

        tampilLatin23 = (TextView) findViewById(R.id.tampil_latin23);
        tampilTerjemah23 = (TextView) findViewById(R.id.tampil_terjemah23);
        //tampilKeutamaan23 = (TextView) findViewById(R.id.tampil_keutamaan23);

        tampilLatin24 = (TextView) findViewById(R.id.tampil_latin24);
        tampilTerjemah24 = (TextView) findViewById(R.id.tampil_terjemah24);
        //tampilKeutamaan24 = (TextView) findViewById(R.id.tampil_keutamaan24);

        tampilLatin25 = (TextView) findViewById(R.id.tampil_latin25);
        tampilTerjemah25 = (TextView) findViewById(R.id.tampil_terjemah25);
        //tampilKeutamaan25 = (TextView) findViewById(R.id.tampil_keutamaan25);

        tampilLatin26 = (TextView) findViewById(R.id.tampil_latin26);
        tampilTerjemah26 = (TextView) findViewById(R.id.tampil_terjemah26);
        //tampilKeutamaan26 = (TextView) findViewById(R.id.tampil_keutamaan26);

        tampilLatin27 = (TextView) findViewById(R.id.tampil_latin27);
        tampilTerjemah27 = (TextView) findViewById(R.id.tampil_terjemah27);
        //tampilKeutamaan27 = (TextView) findViewById(R.id.tampil_keutamaan27);

        tampilLatin28 = (TextView) findViewById(R.id.tampil_latin28);
        tampilTerjemah28 = (TextView) findViewById(R.id.tampil_terjemah28);
        //tampilKeutamaan28 = (TextView) findViewById(R.id.tampil_keutamaan28);

        tampilLatin29 = (TextView) findViewById(R.id.tampil_latin29);
        tampilTerjemah29 = (TextView) findViewById(R.id.tampil_terjemah29);
        //tampilKeutamaan29 = (TextView) findViewById(R.id.tampil_keutamaan29);

        tampilLatin30 = (TextView) findViewById(R.id.tampil_latin30);
        tampilTerjemah30 = (TextView) findViewById(R.id.tampil_terjemah30);
        //tampilKeutamaan30 = (TextView) findViewById(R.id.tampil_keutamaan30);


        playAudio = (TextView) findViewById(R.id.play_audio);
        backAudio = (ImageView) findViewById(R.id.back_audio);

        btnBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btnLatin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tampilLatin.setVisibility(View.VISIBLE);
                tampilLatin1.setVisibility(View.VISIBLE);
                tampilLatin2.setVisibility(View.VISIBLE);
                tampilLatin3.setVisibility(View.VISIBLE);
                tampilLatin4.setVisibility(View.VISIBLE);
                tampilLatin5.setVisibility(View.VISIBLE);
                tampilLatin6.setVisibility(View.VISIBLE);
                tampilLatin7.setVisibility(View.VISIBLE);
                tampilLatin8.setVisibility(View.VISIBLE);
                tampilLatin9.setVisibility(View.VISIBLE);
                tampilLatin10.setVisibility(View.VISIBLE);
                tampilLatin11.setVisibility(View.VISIBLE);
                tampilLatin12.setVisibility(View.VISIBLE);
                tampilLatin13.setVisibility(View.VISIBLE);
                tampilLatin14.setVisibility(View.VISIBLE);
                tampilLatin15.setVisibility(View.VISIBLE);
                tampilLatin16.setVisibility(View.VISIBLE);
                tampilLatin17.setVisibility(View.VISIBLE);
                tampilLatin18.setVisibility(View.VISIBLE);
                tampilLatin19.setVisibility(View.VISIBLE);
                tampilLatin20.setVisibility(View.VISIBLE);
                tampilLatin21.setVisibility(View.VISIBLE);
                tampilLatin22.setVisibility(View.VISIBLE);
                tampilLatin23.setVisibility(View.VISIBLE);
                tampilLatin24.setVisibility(View.VISIBLE);
                tampilLatin25.setVisibility(View.VISIBLE);
                tampilLatin26.setVisibility(View.VISIBLE);
                tampilLatin27.setVisibility(View.VISIBLE);
                tampilLatin28.setVisibility(View.VISIBLE);
                tampilLatin29.setVisibility(View.VISIBLE);
                tampilLatin30.setVisibility(View.VISIBLE);
                backLatin.setVisibility(View.VISIBLE);
                btnLatin.setVisibility(View.VISIBLE);
            }
        });

        backLatin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tampilLatin.setVisibility(View.GONE);
                tampilLatin1.setVisibility(View.GONE);
                tampilLatin2.setVisibility(View.GONE);
                tampilLatin3.setVisibility(View.GONE);
                tampilLatin4.setVisibility(View.GONE);
                tampilLatin5.setVisibility(View.GONE);
                tampilLatin6.setVisibility(View.GONE);
                tampilLatin7.setVisibility(View.GONE);
                tampilLatin8.setVisibility(View.GONE);
                tampilLatin9.setVisibility(View.GONE);
                tampilLatin10.setVisibility(View.GONE);
                tampilLatin11.setVisibility(View.GONE);
                tampilLatin12.setVisibility(View.GONE);
                tampilLatin13.setVisibility(View.GONE);
                tampilLatin14.setVisibility(View.GONE);
                tampilLatin15.setVisibility(View.GONE);
                tampilLatin16.setVisibility(View.GONE);
                tampilLatin17.setVisibility(View.GONE);
                tampilLatin18.setVisibility(View.GONE);
                tampilLatin19.setVisibility(View.GONE);
                tampilLatin20.setVisibility(View.GONE);
                tampilLatin21.setVisibility(View.GONE);
                tampilLatin12.setVisibility(View.GONE);
                tampilLatin13.setVisibility(View.GONE);
                tampilLatin14.setVisibility(View.GONE);
                tampilLatin15.setVisibility(View.GONE);
                tampilLatin16.setVisibility(View.GONE);
                tampilLatin17.setVisibility(View.GONE);
                tampilLatin18.setVisibility(View.GONE);
                tampilLatin19.setVisibility(View.GONE);
                tampilLatin30.setVisibility(View.GONE);
                backLatin.setVisibility(View.GONE);
                btnLatin.setVisibility(View.VISIBLE);
            }
        });

        btnTerjemah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tampilTerjemah.setVisibility(View.VISIBLE);
                tampilTerjemah1.setVisibility(View.VISIBLE);
                tampilTerjemah2.setVisibility(View.VISIBLE);
                tampilTerjemah3.setVisibility(View.VISIBLE);
                tampilTerjemah4.setVisibility(View.VISIBLE);
                tampilTerjemah5.setVisibility(View.VISIBLE);
                tampilTerjemah6.setVisibility(View.VISIBLE);
                tampilTerjemah7.setVisibility(View.VISIBLE);
                tampilTerjemah8.setVisibility(View.VISIBLE);
                tampilTerjemah9.setVisibility(View.VISIBLE);
                tampilTerjemah10.setVisibility(View.VISIBLE);
                tampilTerjemah11.setVisibility(View.VISIBLE);
                tampilTerjemah12.setVisibility(View.VISIBLE);
                tampilTerjemah13.setVisibility(View.VISIBLE);
                tampilTerjemah14.setVisibility(View.VISIBLE);
                tampilTerjemah15.setVisibility(View.VISIBLE);
                tampilTerjemah16.setVisibility(View.VISIBLE);
                tampilTerjemah17.setVisibility(View.VISIBLE);
                tampilTerjemah18.setVisibility(View.VISIBLE);
                tampilTerjemah19.setVisibility(View.VISIBLE);
                tampilTerjemah20.setVisibility(View.VISIBLE);
                tampilTerjemah21.setVisibility(View.VISIBLE);
                tampilTerjemah22.setVisibility(View.VISIBLE);
                tampilTerjemah23.setVisibility(View.VISIBLE);
                tampilTerjemah24.setVisibility(View.VISIBLE);
                tampilTerjemah25.setVisibility(View.VISIBLE);
                tampilTerjemah26.setVisibility(View.VISIBLE);
                tampilTerjemah27.setVisibility(View.VISIBLE);
                tampilTerjemah28.setVisibility(View.VISIBLE);
                tampilTerjemah29.setVisibility(View.VISIBLE);
                tampilTerjemah30.setVisibility(View.VISIBLE);
                backTerjemah.setVisibility(View.VISIBLE);
                btnTerjemah.setVisibility(View.VISIBLE);
            }
        });

        backTerjemah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tampilTerjemah.setVisibility(View.GONE);
                tampilTerjemah1.setVisibility(View.GONE);
                tampilTerjemah2.setVisibility(View.GONE);
                tampilTerjemah3.setVisibility(View.GONE);
                tampilTerjemah4.setVisibility(View.GONE);
                tampilTerjemah5.setVisibility(View.GONE);
                tampilTerjemah6.setVisibility(View.GONE);
                tampilTerjemah7.setVisibility(View.GONE);
                tampilTerjemah8.setVisibility(View.GONE);
                tampilTerjemah9.setVisibility(View.GONE);
                tampilTerjemah10.setVisibility(View.GONE);
                tampilTerjemah11.setVisibility(View.GONE);
                tampilTerjemah12.setVisibility(View.GONE);
                tampilTerjemah13.setVisibility(View.GONE);
                tampilTerjemah14.setVisibility(View.GONE);
                tampilTerjemah15.setVisibility(View.GONE);
                tampilTerjemah16.setVisibility(View.GONE);
                tampilTerjemah17.setVisibility(View.GONE);
                tampilTerjemah18.setVisibility(View.GONE);
                tampilTerjemah19.setVisibility(View.GONE);
                tampilTerjemah20.setVisibility(View.GONE);
                tampilTerjemah21.setVisibility(View.GONE);
                tampilTerjemah22.setVisibility(View.GONE);
                tampilTerjemah23.setVisibility(View.GONE);
                tampilTerjemah24.setVisibility(View.GONE);
                tampilTerjemah25.setVisibility(View.GONE);
                tampilTerjemah26.setVisibility(View.GONE);
                tampilTerjemah27.setVisibility(View.GONE);
                tampilTerjemah28.setVisibility(View.GONE);
                tampilTerjemah29.setVisibility(View.GONE);
                tampilTerjemah30.setVisibility(View.GONE);
                backTerjemah.setVisibility(View.GONE);
                btnTerjemah.setVisibility(View.VISIBLE);
            }
        });

        btnKeutamaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tampilKeutamaan.setVisibility(View.VISIBLE);
                tampilKeutamaan1.setVisibility(View.VISIBLE);
                tampilKeutamaan2.setVisibility(View.VISIBLE);
                tampilKeutamaan3.setVisibility(View.VISIBLE);
                tampilKeutamaan4.setVisibility(View.VISIBLE);
                tampilKeutamaan5.setVisibility(View.VISIBLE);
                tampilKeutamaan6.setVisibility(View.VISIBLE);
                tampilKeutamaan7.setVisibility(View.VISIBLE);
                tampilKeutamaan8.setVisibility(View.VISIBLE);
                tampilKeutamaan9.setVisibility(View.VISIBLE);
                tampilKeutamaan10.setVisibility(View.VISIBLE);
                backKeutamaan.setVisibility(View.VISIBLE);
                btnKeutamaan.setVisibility(View.VISIBLE);
            }
        });

        backKeutamaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tampilKeutamaan.setVisibility(View.GONE);
                tampilKeutamaan1.setVisibility(View.GONE);
                tampilKeutamaan2.setVisibility(View.GONE);
                tampilKeutamaan3.setVisibility(View.GONE);
                tampilKeutamaan4.setVisibility(View.GONE);
                tampilKeutamaan5.setVisibility(View.GONE);
                tampilKeutamaan6.setVisibility(View.GONE);
                tampilKeutamaan7.setVisibility(View.GONE);
                tampilKeutamaan8.setVisibility(View.GONE);
                tampilKeutamaan9.setVisibility(View.GONE);
                tampilKeutamaan10.setVisibility(View.GONE);
                backKeutamaan.setVisibility(View.GONE);
                btnKeutamaan.setVisibility(View.VISIBLE);
            }
        });

        playAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer[0].reset();
                mediaPlayer[0] = MediaPlayer.create(getApplicationContext(), R.raw.almatsuratsore);
                mediaPlayer[0].start(); //nyalain

                backAudio.setVisibility(View.VISIBLE);
                playAudio.setVisibility(View.VISIBLE);
            }
        });

        backAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer[0].stop();

                playAudio.setVisibility(View.VISIBLE);
                backAudio.setVisibility(View.GONE);
            }
        });


    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dzikir_pagi, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
