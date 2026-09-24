package com.googletv.kumanda;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int vol = 24;
    int ch = 7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(40,40,40,40);
        TextView title = new TextView(this);
        title.setTextSize(20);
        title.setText("GTV Kumanda - Ses: " + vol + " Kanal: " + ch);
        layout.addView(title);
        Button b1 = new Button(this); b1.setText("Ses +");
        b1.setOnClickListener(v->{ if(vol<100) vol++; title.setText("Ses: "+vol+" Kanal: "+ch); });
        layout.addView(b1);
        Button b2 = new Button(this); b2.setText("Ses -");
        b2.setOnClickListener(v->{ if(vol>0) vol--; title.setText("Ses: "+vol+" Kanal: "+ch); });
        layout.addView(b2);
        Button b3 = new Button(this); b3.setText("Kanal +");
        b3.setOnClickListener(v->{ ch++; title.setText("Ses: "+vol+" Kanal: "+ch); });
        layout.addView(b3);
        Button b4 = new Button(this); b4.setText("Kanal -");
        b4.setOnClickListener(v->{ if(ch>1) ch--; title.setText("Ses: "+vol+" Kanal: "+ch); });
        layout.addView(b4);
        for(int i=0;i<=9;i++){
            Button b = new Button(this);
            b.setText(String.valueOf(i));
            layout.addView(b);
        }
        setContentView(layout);
    }
}
