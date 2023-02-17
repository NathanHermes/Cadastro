package br.edu.ifsp.ads.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText nameET;
    private EditText phoneET;
    private EditText mailET;
    private CheckBox messageCB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameET = findViewById(R.id.nameET);
        phoneET = findViewById(R.id.phoneET);
        mailET = findViewById(R.id.mailET);
        messageCB = findViewById(R.id.messageCB);

        Button clearBT = findViewById(R.id.clearBT);

        clearBT.setOnClickListener(view -> {
            clear();
        });
    }

    private void clear() {
        nameET.setText("");
        phoneET.setText("");
        mailET.setText("");
        messageCB.setChecked(false);
    }
}