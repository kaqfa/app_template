package id.co.keuangan.aplikasikeuangan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class RegisterActivity extends AppCompatActivity {

    EditText txtEmail, txtPassword, txtConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        txtEmail = (EditText) findViewById(R.id.reg_email);
        txtPassword = (EditText) findViewById(R.id.reg_password);
        txtConfirm = (EditText) findViewById(R.id.reg_confirm);
    }

    public void toLogin(View view){
        finish();
    }
}
