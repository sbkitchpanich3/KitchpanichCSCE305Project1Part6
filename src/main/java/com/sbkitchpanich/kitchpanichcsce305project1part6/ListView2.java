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

public class ListView2 extends AppCompatActivity {

    private ArrayAdapter<String> listAdapter;
    private EditText filterText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview2);

        filterText = (EditText) findViewById(R.id.editText);

        ListView itemList = (ListView) findViewById(R.id.listView);

        filterText.setVisibility(View.GONE);

        String[] listViewAdapterContent = {"กัด - to bite", "ขัด - to scrub", "นัด - appointment", "ตัด - to cut", "พัด - to blow", "ปิด - to turn off", "ผิด - wrong"};

        listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listViewAdapterContent);

        itemList.setAdapter(listAdapter);

        filterText.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                ListView2.this.listAdapter.getFilter().filter(s);
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
        Intent getListView1Intent = new Intent(this, ListView1.class);
        startActivity(getListView1Intent);
        finish();
    }

    public void show2(View view) {
    }

    public void show3(View view) {
        Intent getListView3Intent = new Intent(this, ListView3.class);
        startActivity(getListView3Intent);
        finish();
    }
}
