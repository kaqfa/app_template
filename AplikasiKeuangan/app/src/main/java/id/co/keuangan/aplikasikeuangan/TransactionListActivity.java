package id.co.keuangan.aplikasikeuangan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class TransactionListActivity extends AppCompatActivity {

    private ArrayList<Transaction> transList = new ArrayList<>();

    ArrayAdapter adapter;
    ListView transactionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_list);

        transactionList = (ListView) findViewById(R.id.list_transactions);

        dummyData();
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, transList);
        transactionList.setAdapter(adapter);

        transactionList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getBaseContext(),
                        TransactionDetailActivity.class);
                intent.putExtra("transaction.detail", transList.get(position));
                startActivity(intent);
            }
        });
    }

    private void dummyData(){
        transList.add(new Transaction("1", "Makan malam",
                Transaction.PENGELUARAN, 20000, "Makan malam sendirian"));
        transList.add(new Transaction("2", "Action Figure",
                Transaction.PENGELUARAN, 1200000, "Action figure Sumanto"));
        transList.add(new Transaction("3", "Gaji Bulanan",
                Transaction.PEMASUKAN, 10000000, "Gaji reguler tiap bulan"));
        transList.add(new Transaction("4", "Bonus Lembur",
                Transaction.PEMASUKAN, 5000000, "Lemburan penelitian bersama"));
        transList.add(new Transaction("5", "Oleh-oleh kampung",
                Transaction.PENGELUARAN, 2000000, "Beli oleh-oleh buat keluarga"));
    }
}
