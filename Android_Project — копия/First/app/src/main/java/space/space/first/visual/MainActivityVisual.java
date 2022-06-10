package space.space.first.visual;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import space.space.first.GameLevels;
import space.space.first.Level1;
import space.space.first.Level3;
import space.space.first.MainActivity;
import space.space.first.R;
import space.space.first.noted.Noted;

public class MainActivityVisual extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_visual);

        CardView tools = (CardView) findViewById(R.id.tools);
        tools.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(MainActivityVisual.this, Shop.class);

                    startActivity(intent);
                    finish();
                } catch (Exception e) {

                }
                //Конец конструкции
            }
        });

        ImageButton button2= (ImageButton) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(MainActivityVisual.this, MainActivity.class);
                    //Есть намерение перейти из файла GameLevel в файл главного меню
                    startActivity(intent);
                    finish();
                } catch (Exception e) {

                }
                //Конец конструкции
            }
        });

        ImageButton button3 = (ImageButton) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(MainActivityVisual.this, Noted.class );

                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
                //Конец конструкции
            }
        });
}


    }
