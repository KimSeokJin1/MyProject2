package space.space.first.visual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;

import space.space.first.R;

public class Shop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // Window w = getWindow();
       // w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION|//скрываем нижнюю панель
               // View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);// появляется поверх игры и исзчезает
        setContentView(R.layout.activity_shop);

    }
}