package jp.hotmix.hellosample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HelloSampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_sample);

        Button btClick = findViewById(R.id.btClick);
        HelloListener listner = new HelloListener();
        btClick.setOnClickListener(listner);
    }

    private class HelloListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            EditText input = findViewById(R.id.etName);
            TextView output = findViewById(R.id.tvOutput);
            String inputStr = input.getText().toString();
            output.setText(inputStr + "さん、こんにちは！");
        }
    }
}
