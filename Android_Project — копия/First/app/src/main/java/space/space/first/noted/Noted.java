package space.space.first.noted;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import space.space.first.R;

public class Noted extends AppCompatActivity {

    private MyDpManager myDpManager;
    private EditText edTitle,edDesc;



    private RecyclerView rcView;
    private MainAdapter mainAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noted);
        init();

    }
    //для инициализации
    private void init(){
        myDpManager = new MyDpManager(this);
        rcView=findViewById(R.id.rcView);
        mainAdapter= new MainAdapter(this);
        rcView.setAdapter(mainAdapter);
        edTitle=findViewById(R.id.edTitle);
        edDesc=findViewById(R.id.edDisc);
        rcView.setLayoutManager(new LinearLayoutManager(this));//расположение по вертикали элементо

    }

    @Override
    protected void onResume(){
        super.onResume();
        myDpManager.openDp();
        mainAdapter.updateAdappter(myDpManager.getFromDp());
    }
    public void onClickAdd(View view){

        Intent i = new Intent (Noted.this, EditActivity1.class);
        startActivity(i);
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        myDpManager.closeDp();
    }
}