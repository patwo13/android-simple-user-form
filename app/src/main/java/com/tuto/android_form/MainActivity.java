package com.tuto.android_form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements AdapterView.OnItemSelectedListener{

    String[] states = { "State", "State 1", "State 2", "State 3", "State 4", };

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


        Spinner spinnerState = findViewById(R.id.state);
        spinnerState.setOnItemSelectedListener(this);

        //create instance of ArrayAdapter having list of courses
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, states);

        //set simple layout resource file for each item of spinner
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // set ArrayAdapter data on the spinner which binds data to spinner
        spinnerState.setAdapter(adapter);


        //initiate a check box
        CheckBox checkBoxCondition = findViewById(R.id.citizen);
        //check current state of the check box
        Boolean checkBoxState = checkBoxCondition.isChecked();
    }

    public void radioButtonHandler(View view){

        //is button checked
        boolean checked = ((RadioButton) view).isChecked();
        String gender = "";

        //which button is checked
        switch (view.getId()){
            case R.id.male:
                if(checked){
                    gender = "M";
                    break;
                }
            case R.id.female:
                if(checked){
                    gender = "F";
                    break;
                }
        }

        Toast.makeText(getApplicationContext(), "Gender : "+gender, Toast.LENGTH_LONG).show();
    }

    public void submitbuttonHandler(View view){
        //Decide what happens when the user clicks the submit button

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long id) {
        if(i > 0){
            Toast.makeText(getApplicationContext(), states[i], Toast.LENGTH_LONG).show();
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
