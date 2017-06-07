package id.co.uang.urusanuang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;


public class TransactionFormActivity extends AppCompatActivity {
    Spinner spnType;
    EditText edtName;
    EditText edtAmount;
    EditText edtDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_form);

        spnType = (Spinner) findViewById(R.id.spn_type);
        edtName = (EditText) findViewById(R.id.edt_name);
        edtAmount = (EditText) findViewById(R.id.edt_amount);
        edtDescription = (EditText) findViewById(R.id.edt_description);

        String type [] = {"Pengeluaran", "Pemasukan"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, type);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnType.setAdapter(adapter);
    }

}
