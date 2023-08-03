package com.example.cryptoohhcrypto;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Encoder extends AppCompatActivity {

    EditText etenc;
    TextView enctv;
    ClipboardManager cpb; //used to copy the text from clipboard


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encoder);

        etenc = findViewById(R.id.etenc); //used to matchup the xml and java variables used in the design page
        enctv = findViewById(R.id.enctv);
        cpb = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
    }

    //passing thee value into encode algorithm
    public void enc(View view){
        String temp = etenc.getText().toString(); //getting the text from Edittext and converting it into string
        String rv = encode.enc(temp); //passing the string to encode function
        enctv.setText(rv); //after getting the result from encode function setting it up as rv.
    }

    //to copy the text from clipboard
    public void cp2(View view){
        String data = enctv.getText().toString().trim(); //getting the text from enctv where the result is stored after encrypting the text to string
        if(!data.isEmpty()){ //if data is not empty
            ClipData temp = ClipData.newPlainText("text",data); //storing the data into temp
            cpb.setPrimaryClip(temp); // the temp message is being copied
            Toast.makeText(this, "Copied", Toast.LENGTH_SHORT).show();
        }
    }
}