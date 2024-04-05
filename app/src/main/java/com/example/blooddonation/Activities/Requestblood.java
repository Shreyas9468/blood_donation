package com.example.blooddonation.Activities;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Requestblood extends AppCompatActivity {

    private EditText etName, etContact, etRequiredDates, etUnits, etAddress;
    private Spinner spBloodGroup, spAge, spGender, spReason;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.);

        // Initialize EditTexts
        etName = findViewById(R.id.et_name);
        etContact = findViewById(R.id.et_contact);
        etRequiredDates = findViewById(R.id.et_required_dates);
        etUnits = findViewById(R.id.et_units);
        etAddress = findViewById(R.id.et_address);

        // Initialize Spinners
        spBloodGroup = findViewById(R.id.sp_blood_group);
        spAge = findViewById(R.id.sp_age);
        spGender = findViewById(R.id.sp_gender);
        spReason = findViewById(R.id.sp_reason);

        // Initialize Button
        btnSubmit = findViewById(R.id.btnSubmit);

        // Set up Spinners with ArrayAdapter
        ArrayAdapter<CharSequence> bloodGroupAdapter = ArrayAdapter.createFromResource(this,
                R.array.blood_group, android.R.layout.simple_spinner_item);
        bloodGroupAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spBloodGroup.setAdapter(bloodGroupAdapter);

        // Implement other Spinners similarly with their respective array resources

        // Set up Button click listener
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Validate inputs and submit the request
                submitRequest();
            }
        });
    }

    private void submitRequest() {
        // You can retrieve values from EditTexts and Spinners here
        String name = etName.getText().toString();
        String contact = etContact.getText().toString();
        String requiredDates = etRequiredDates.getText().toString();
        String units = etUnits.getText().toString();
        String address = etAddress.getText().toString();
        String bloodGroup = spBloodGroup.getSelectedItem().toString();
        // Retrieve values from other Spinners similarly

        // Perform validation if needed

        // You can then proceed with submitting the request, for now, let's just show a Toast
        Toast.makeText(this, "Request Submitted!", Toast.LENGTH_SHORT).show();
    }
}