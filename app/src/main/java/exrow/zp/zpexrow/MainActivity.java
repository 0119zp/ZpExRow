package exrow.zp.zpexrow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import exrow.zp.zpexrow.ex.activity.ZpExRowActivity;
import exrow.zp.zpexrow.ex.activity.ZpRecExRowActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void exOnClick(View view){

        Intent intent = new Intent(MainActivity.this, ZpExRowActivity.class);
        startActivity(intent);

    }

    public void recOnClick(View view){

        Intent intent = new Intent(MainActivity.this, ZpRecExRowActivity.class);
        startActivity(intent);

    }

}
