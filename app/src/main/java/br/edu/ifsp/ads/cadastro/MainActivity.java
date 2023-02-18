package br.edu.ifsp.ads.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText nameET;
    private EditText phoneET;
    private EditText mailET;
    private CheckBox messageCB;
    private RadioButton manRB;
    private RadioButton womanRB;
    private EditText cityET;
    private Spinner estateSP;
    private Button clearBT;
    private Button saveBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViewElements();

        saveBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Form form = getValuesFromView();

                Toast.makeText(MainActivity.this, form.toString(), Toast.LENGTH_LONG).show();
            }
        });

        clearBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearValuesOfView();
            }
        });
    }

    private void bindViewElements() {
        nameET = findViewById(R.id.nameET);
        phoneET = findViewById(R.id.phoneET);
        mailET = findViewById(R.id.mailET);
        messageCB = findViewById(R.id.messageCB);
        manRB = findViewById(R.id.manRB);
        womanRB = findViewById(R.id.womanRB);
        cityET = findViewById(R.id.cityET);
        estateSP = findViewById(R.id.estateSP);
        clearBT = findViewById(R.id.clearBT);
        saveBT = findViewById(R.id.saveBT);
    }

    private Form getValuesFromView() {
        String fullName = nameET.getText().toString();
        String phone = phoneET.getText().toString();
        String mail = mailET.getText().toString();
        Boolean receiveMail = messageCB.isChecked();
        String sex = manRB.isChecked() ? "Masculino" : "Feminino";
        String city = cityET.getText().toString();
        String uf = ((TextView) estateSP.getSelectedView()).getText().toString();

        return new Form(fullName, phone, mail, receiveMail, sex, city, uf);
    }
    
    private void clearValuesOfView() {
        nameET.setText("");
        phoneET.setText("");
        mailET.setText("");
        messageCB.setChecked(false);
        manRB.setChecked(false);
        womanRB.setChecked(false);
        cityET.setText("");
        estateSP.setSelection(0);
    }
}