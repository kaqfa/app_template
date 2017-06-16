package id.co.keuangan.aplikasikeuangan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText edtEmail, edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtEmail = (EditText) findViewById(R.id.log_email);
        edtPassword = (EditText) findViewById(R.id.log_password);
    }

    public void toRegister(View view){
        startActivity(new Intent(this, RegisterActivity.class));
    }
}