package space.space.first.noted;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import space.space.first.R;

public class EditActivity1 extends AppCompatActivity {
    private  EditText edTitle,edDesc;
    private MyDpManager myDpManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit1);
        init();
    }
    @Override
    protected void onResume(){
        super.onResume();
        myDpManager.openDp();
    }

    private void init(){
        //myDpManager = new MyDpManager(//this);
        edTitle =findViewById(R.id.edTitle);
        edDesc =findViewById(R.id.edDesc);

    }
    public void onClickSave(View view) {// равно пустоте equals
        String title= edTitle.getText().toString();
        String desc= edDesc.getText().toString();
        if(title.equals("")
                || desc.equals("")) {
            Toast.makeText(this, R.string.text_empty, Toast.LENGTH_LONG).show();
        }
        else{
            myDpManager.insertToDb(title,desc);
            Toast.makeText(this, R.string.saved,Toast.LENGTH_LONG).show();
            finish();
            }

        }


    public void onClickApp(View view) {
    }
}
