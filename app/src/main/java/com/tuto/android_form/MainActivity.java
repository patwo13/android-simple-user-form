package com.tuto.android_form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set max length
        EditText editTextName = findViewById(R.id.names);
        InputFilter[] inputFilters = new InputFilter[1];
        inputFilters[0] = new InputFilter.LengthFilter(40);
        editTextName.setFilters(inputFilters);

        String fullName = editTextName.getText().toString();

        EditText editTextIc = findViewById(R.id.ic);
        EditText editTextEmail = findViewById(R.id.email);
        EditText editTextPhone = findViewById(R.id.phone);
        EditText editTextAddress = findViewById(R.id.address);
        EditText editTextAddress2 = findViewById(R.id.address2);
        EditText editTextAddress3 = findViewById(R.id.address3);
        EditText editTextPostocde = findViewById(R.id.postcode);
        EditText editTextCity = findViewById(R.id.city);
        EditText editTextState = findViewById(R.id.state);

        //initiate a check box
        CheckBox checkBoxCondition = findViewById(R.id.citizen);
        //check current state of the check box
        Boolean checkBoxState = checkBoxCondition.isChecked();
    }

    public void radioButtonHandler(View view){
        //Action when click
    }

    public void submitbuttonHandler(View view){
        //Decide what happens when the user clicks the submit button

    }
}
