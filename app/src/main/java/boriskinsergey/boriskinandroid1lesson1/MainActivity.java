package boriskinsergey.boriskinandroid1lesson1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtHello;

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("...", "сработал onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("...", "сработал onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("...", "сработал onPause");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("...", "сработал onPostResume");
    }

    boolean click = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtHello = (TextView) findViewById(R.id.textHello);
        Log.d("...", "сработал onCreate");
    }

    public void bttHello(View view) {
        if (click) txtHello.setText("Привет Сергей!");
        else txtHello.setText("Привет Мир!");
        click=!click;
    }
}
