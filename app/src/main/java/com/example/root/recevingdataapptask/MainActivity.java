
package com.example.root.recevingdataapptask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText name2_etv;
    private EditText phone2_etv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name2_etv=(EditText)findViewById(R.id.name2_etv);
        phone2_etv=(EditText)findViewById(R.id.phone2_etv);

        Intent intent=getIntent();
        String nam=intent.getStringExtra(Intent.EXTRA_TEXT);
        String phn=intent.getStringExtra("phone");

        name2_etv.setText(nam);
        phone2_etv.setText(phn);

    }

    public void share(View view)
    {
        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.putExtra("name2",name2_etv.getText().toString());
        intent.putExtra("phone2",phone2_etv.getText().toString());
        intent.setType("text/plain");
        startActivity(intent);

    }


}
