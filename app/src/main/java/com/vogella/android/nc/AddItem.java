package com.vogella.android.nc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import com.google.firebase.database.FirebaseDatabase;

public class AddItem extends AppCompatActivity {
    EditText Item_name,price;
    Button button;
    RadioGroup radiogroup;
    RadioButton radio_button;
    FirebaseDatabase database;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);
        final int[] veg = new int[1];
        button = findViewById(R.id.button);
        Item_name=findViewById(R.id.editText);
        price = findViewById(R.id.editText2);
        radiogroup=findViewById(R.id.radiogroup);
        final Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(AddItem.this,android.R.layout.simple_expandable_list_item_1,getResources().getStringArray(R.array.Category));
        adapter.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1);
        spinner.setAdapter(adapter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String category = spinner.getSelectedItem().toString();
                String item_name= Item_name.getText().toString();
                String Price = price.getText().toString();
                int radioId = radiogroup.getCheckedRadioButtonId();
                switch(radioId){
                    case 1: veg[0] = 1;break;
                    case 2: veg[0] = 0;break;
                }
                if(veg[0] == 1){
                    String sub_category = "veg";
                }
                else{
                    String sub_category= "non veg";
                }
                Intent inte = new Intent(getApplicationContext(),menu.class);
                startActivity(inte);


            }
        });

    }
}
