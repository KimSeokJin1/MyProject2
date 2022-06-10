package space.space.first;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.logging.Level;

public class GameLevels extends AppCompatActivity implements GameLevels8 {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamelevels);

        Button button = (Button) findViewById(R.id.button_back);
        button.setOnClickListener(new View.OnClickListener() {
            // Установить на щелчок слушатель тоесть он ждет что бы кто-нибудь нажмет кнопку
            @Override
            public void onClick(View view) {
                //Здесь команда для кнопки
                //Начало конструкции
                try {
                    Intent intent = new Intent(GameLevels.this, MainActivity.class);
                    //Есть намерение перейти из файла GameLevel в файл главного меню
                    startActivity(intent);
                    finish();
                } catch (Exception e) {

                }
                //Конец конструкции
            }
        });

        //Кнопка для перехода на первый уровень - начало
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(GameLevels.this, Level1.class);
                    //Есть намерение перейти из файла GameLevel в файл главного меню
                    startActivity(intent);
                    finish();
                } catch (Exception e) {

                }
                //Конец конструкции
            }
        });
        //Кнопка для перехода на первый уровень - конец


        //Кнопка для перехода на второй уровень - начало
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(GameLevels.this, Level2 .class);
                    //Есть намерение перейти из файла GameLevel в файл главного меню
                    startActivity(intent);
                    finish();
                } catch (Exception e) {

                }
                //Конец конструкции
            }
        });
        //Кнопка для перехода на второй уровень - начало
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(GameLevels.this, Level3 .class);
                    //Есть намерение перейти из файла GameLevel в файл главного меню
                    startActivity(intent);
                    finish();
                } catch (Exception e) {

                }
                //Конец конструкции
            }
        });

        //Кнопка для перехода на второй уровень - начало
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(GameLevels.this, Level3 .class);
                    //Есть намерение перейти из файла GameLevel в файл главного меню
                    startActivity(intent);
                    finish();
                } catch (Exception e) {

                }
                //Конец конструкции
            }
        });



    }
         // Системна кнопка "Назад"-начало
 @Override
        public void onBonBackPressed() {
          try {
              Intent intent = new Intent(GameLevels.this, MainActivity.class);
              //Есть намерение перейти из файла GameLevel в файл главного меню
              startActivity(intent);
              finish();
          } catch (Exception e) {


          }
        // Системна кнопка "Назад"-конец
    }
}