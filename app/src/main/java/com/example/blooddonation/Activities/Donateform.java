package com.example.blooddonation.Activities;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.blooddonation.R;

public class Donateform extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nextButton = findViewById(R.id.nextButton);
        Button backButton = findViewById(R.id.button);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform action when Next button is clicked
                // For example, you can validate input fields here
                validateInput();
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform action when Back button is clicked
                // For example, you can navigate to the previous screen here
                onBackPressed();
            }
        });
    }

    private void validateInput() {
        EditText nameEditText = findViewById(R.id.nameEditText);
        EditText addressEditText = findViewById(R.id.addressEditText);
        Spinner bloodGroupSpinner = findViewById(R.id.bloodGroupSpinner);
        Spinner bloodTypeSpinner = findViewById(R.id.bloodTypeSpinner);
        EditText ageEditText = findViewById(R.id.ageEditText);

        String name = nameEditText.getText().toString().trim();
        String address = addressEditText.getText().toString().trim();
        String bloodGroup = bloodGroupSpinner.getSelectedItem().toString();
        String bloodType = bloodTypeSpinner.getSelectedItem().toString();
        String age = ageEditText.getText().toString().trim();

        if (name.isEmpty() || address.isEmpty() || age.isEmpty()) {
            Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
        } else {
            // Proceed with further actions
            // For example, you can pass the data to the next activity
            // or perform any other logic
            // Here, I'm just displaying a toast message
            Toast.makeText(this, "Data validated successfully", Toast.LENGTH_SHORT).show();
        }
    }
}