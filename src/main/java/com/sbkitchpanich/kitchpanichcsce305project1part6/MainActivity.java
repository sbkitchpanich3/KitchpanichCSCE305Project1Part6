package com.sbkitchpanich.kitchpanichcsce305project1part6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ArrayAdapter<String> listAdapter;
    private EditText filterText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        filterText = (EditText) findViewById(R.id.editText);

        ListView itemList = (ListView) findViewById(R.id.listView);

        filterText.setVisibility(View.GONE);

        String[] listViewAdapterContent = {"พัก - to rest", "ผัก - vegetable", "รัก - to love", "วิก - wig", "ตึก - building", "นึก - to recall", "สุก - ripe",
                                           "กัด - to bite", "ขัด - to scrub", "นัด - appointment", "ตัด - to cut", "พัด - to blow", "ปิด - to turn off", "ผิด - wrong",
                                           "กับ - with", "ขับ - to drive", "สับ - to chop", "คับ - tight", "นับ - to count", "ดิบ - raw", "ริบ - to confiscate"};

        listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listViewAdapterContent);

        itemList.setAdapter(listAdapter);

        filterText.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                MainActivity.this.listAdapter.getFilter().filter(s);
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }


    public void showAll(View view) {
    }

    public void show1(View view) {
        Intent getListView1Intent = new Intent(this, ListView1.class);
        startActivity(getListView1Intent);
        finish();
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
