package com.coretech.number_table;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    EditText editText;
    int ans=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        editText=findViewById(R.id.edittext);
        textView=findViewById(R.id.textView);

        /*String s= editText.getText().toString();
        int num= Integer.parseInt(s);
        int j=0;*/
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button:
                        StringBuffer buffer=new StringBuffer();
                        int res;
                    String s = editText.getText().toString();
                    int num = Integer.parseInt(s);
                    int j = 0;

                    for (int i = 0; i < 10; i++) {
                        j = j + 1;
                        ans = (num * j);
                        buffer.append(num+"x"+j+" = "+ans+"\n\n");


                    }
                    textView.setText(buffer);
                    break;
                }
            }
        });
    }
}