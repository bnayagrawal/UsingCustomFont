package xyz.bnayagrawal.android.usingcustomfont;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface typeface = Typeface.createFromAsset(getAssets(),"fonts/iron_man.ttf");
        ((TextView)findViewById(R.id.txtTitle)).setTypeface(typeface);
        typeface = Typeface.createFromAsset(getAssets(),"fonts/opensans_regular.ttf");
        ((TextView)findViewById(R.id.txtDescription)).setTypeface(typeface);
    }
}
