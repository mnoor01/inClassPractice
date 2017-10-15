package nyc.c4q.myhelloworldandroidproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {
    private static final String TAG= "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Waaaaaaaaoooowwww");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"We the best.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"I am vegeta.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "I am Goku");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"I am Majin bu.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"I am Freeza");
    }
}
