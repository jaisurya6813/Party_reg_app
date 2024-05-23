package com.example.my_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClktxt(View view)
    {
        TextView tv= findViewById(R.id.link);
        Intent i = new Intent(this, Terms.class);
        startActivity(i);
    }
    public void onClkButt(View view)
    {
            CheckBox chk = findViewById(R.id.chk);
            EditText editText1 = findViewById(R.id.edt1);
            EditText editText2 = findViewById(R.id.edt2);
            String myEditValue = editText1.getText().toString();

            if(chk.isChecked()) {
                long myNum = Long.parseLong(editText2.getText().toString());
                Toast.makeText(this, "Welcome " + myEditValue, Toast.LENGTH_SHORT).show();
                Intent i = new Intent(this, MainActivity2.class);
                i.putExtra("num", myNum);
                i.putExtra("name", myEditValue);
                startActivity(i);
            }
            else {
                Toast.makeText(this, "Accept terms and conditions", Toast.LENGTH_SHORT).show();

            }


    }
}