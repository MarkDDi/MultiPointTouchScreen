package wjh.com.multipointtouchscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import wjh.com.multipointtouchscreen.multipoint.MultiTouchView;

public class MainActivity extends AppCompatActivity {
    MultiTouchView multiTouchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        multiTouchView = (MultiTouchView) findViewById(R.id.multiTouchView);
        multiTouchView.setOnMultiTouchListener(new MultiTouchView.OnMultiTouchListener());
    }
}
