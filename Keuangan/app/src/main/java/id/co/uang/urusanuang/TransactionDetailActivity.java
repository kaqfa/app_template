package id.co.uang.urusanuang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class TransactionDetailActivity extends AppCompatActivity {

    private Transaction transaction;
    private TextView txtName;
    private TextView txtType;
    private TextView txtAmount;
    private TextView txtDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_detail);

        txtName = (TextView) findViewById(R.id.txt_name);
        txtType = (TextView) findViewById(R.id.txt_type);
        txtAmount = (TextView) findViewById(R.id.txt_amount);
        txtDescription = (TextView) findViewById(R.id.txt_description);

        Intent intent = getIntent();
        transaction = (Transaction) intent.getSerializableExtra("transaction.detail");

        txtName.setText(transaction.getName());
        txtType.setText(transaction.stringType());
        txtAmount.setText(Integer.toString(transaction.getAmount()));
        txtDescription.setText(transaction.getDescription());
    }
}
