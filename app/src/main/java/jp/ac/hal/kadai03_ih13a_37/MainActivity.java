package jp.ac.hal.kadai03_ih13a_37;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView tvDisplayNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplayNum = findViewById(R.id.display_area);

        Button[] btn = new Button[10];
        btn[0] = findViewById(R.id.button0);
        btn[1] = findViewById(R.id.button1);
        btn[2] = findViewById(R.id.button2);
        btn[3] = findViewById(R.id.button3);
        btn[4] = findViewById(R.id.button4);
        btn[5] = findViewById(R.id.button5);
        btn[6] = findViewById(R.id.button6);
        btn[7] = findViewById(R.id.button7);
        btn[8] = findViewById(R.id.button8);
        btn[9] = findViewById(R.id.button9);

        for(int i =1;i<btn.length;i++){
            btn[i].setOnClickListener(view -> numBtnClicked(view));
        }
    }


    private void numBtnClicked(View view) {
        Button b = (Button) view;

        String str = b.getText().toString();


        int num = Integer.parseInt(tvDisplayNum.getText().toString());
        num = (10 * num) + Integer.parseInt(str);
        tvDisplayNum.setText(String.valueOf(num));
    }




//    Button clearBtn = findViewById(R.id.clear);
//        clearBtn.setOnClickListener(view -> clear());
//
//
//
//
//    private void clear(){
//        tvDisplayNum.setText("0");
//    }
}