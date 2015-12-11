package github.com.junhyoung.killingtime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SelectModeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_mode1);
    }
    public void Exit(View v){
        finish();
    }
    public void infinite(View v){
        Intent myintent = new Intent(getApplicationContext(),StartActivity.class);
        startActivity(myintent);
    }

    public void test(View v){
        Intent myintent = new Intent(getApplicationContext(),StartActivity.class);
        startActivity(myintent);
    }
    public void perfect(View v){
        Intent myintent = new Intent(getApplicationContext(),StartActivity.class);
        startActivity(myintent);
    }
    public void exit(View v){
        finish();
    }
}
