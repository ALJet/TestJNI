package indi.aljet.testjni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JNIUtil jniUtil = new JNIUtil();
        TextView textView = findViewById(R.id.tv_info);
        textView.setText(jniUtil.getWorld());

    }
}
