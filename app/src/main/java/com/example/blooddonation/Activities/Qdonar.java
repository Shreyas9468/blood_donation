package com.example.blooddonation.Activities;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Qdonar extends AppCompatActivity {

    private EditText nameEditText, addressEditText, ageEditText;
    private Spinner bloodGroupSpinner, bloodTypeSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_Qdonar);

        // Initialize views
        nameEditText = findViewById(R.id.nameEditText);
        addressEditText = findViewById(R.id.addressEditText);
        ageEditText = findViewById(R.id.ageEditText);
        bloodGroupSpinner = findViewById(R.id.bloodGroupSpinner);
        bloodTypeSpinner = findViewById(R.id.bloodTypeSpinner);

        Button nextButton = findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle next button click
                validateInput();
            }
        });

        Button backButton = findViewById(R.id.button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle back button click
                onBackPressed();
            }
        });
    }

    private void validateInput() {
        String name = nameEditText.getText().toString().trim();
        String address = addressEditText.getText().toString().trim();
        String age = ageEditText.getText().toString().trim();
        String bloodGroup = bloodGroupSpinner.getSelectedItem().toString();
        String bloodType = bloodTypeSpinner.getSelectedItem().toString();

        if (!name.isEmpty() && !address.isEmpty() && !age.isEmpty()) {
            // All fields are filled
            // Proceed with next steps
            Toast.makeText(this, "All fields are filled!", Toast.LENGTH_SHORT).show();
        } else {
            // Some fields are empty
            Toast.makeText(this, "Please fill in all fields!", Toast.LENGTH_SHORT).show();
        }
    }
}