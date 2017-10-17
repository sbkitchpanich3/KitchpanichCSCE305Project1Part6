package com.sbkitchpanich.kitchpanichcsce305project1part6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class ListView1 extends AppCompatActivity {

    private ArrayAdapter<String> listAdapter;
    private EditText filterText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview1);

        filterText = (EditText) findViewById(R.id.editText);

        ListView itemList = (ListView) findViewById(R.id.listView);

        filterText.setVisibility(View.GONE);

        String[] listViewAdapterContent = {"พัก - to rest", "ผัก - vegetable", "รัก - to love", "วิก - wig", "ตึก - building", "นึก - to recall", "สุก - ripe"};

        listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listViewAdapterContent);

        itemList.setAdapter(listAdapter);

        filterText.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                ListView1.this.listAdapter.getFilter().filter(s);
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }


    public void showAll(View view) {
        Intent getAllIntent = new Intent(this, MainActivity.class);
        startActivity(getAllIntent);
        finish();
    }

    public void show1(View view) {
    }

    public void show2(View view) {
        Intent getListView2Intent = new Intent(this, ListView2.class);
        startActivity(getListView2Intent);
        finish();
    }

    public void show3(View view) {
        Intent getListView3Intent = new Intent(this, ListView3.class);
        startActivity(getListView3Intent);
        finish();
    }
}
