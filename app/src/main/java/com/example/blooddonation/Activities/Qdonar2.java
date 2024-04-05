package com.example.blooddonation.Activities;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.blooddonation.R;

public class Qdonar2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qdonar2);

        Button submitButton = findViewById(R.id.button);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle submit button click
                validateAnswers();
            }
        });
    }

    private void validateAnswers() {
        RadioGroup question1RadioGroup = findViewById(R.id.question1RadioGroup);
        RadioGroup question2RadioGroup = findViewById(R.id.question2RadioGroup);
        RadioGroup question3RadioGroup = findViewById(R.id.question3RadioGroup);
        RadioGroup question4RadioGroup = findViewById(R.id.question4RadioGroup);
        RadioGroup question5RadioGroup = findViewById(R.id.question5RadioGroup);
        RadioGroup question6RadioGroup = findViewById(R.id.question6RadioGroup);
        RadioGroup question7RadioGroup = findViewById(R.id.question7RadioGroup);

        boolean allQuestionsAnswered = true;

        if (!isRadioButtonSelected(question1RadioGroup)) {
            allQuestionsAnswered = false;
        }
        if (!isRadioButtonSelected(question2RadioGroup)) {
            allQuestionsAnswered = false;
        }
        if (!isRadioButtonSelected(question3RadioGroup)) {
            allQuestionsAnswered = false;
        }
        if (!isRadioButtonSelected(question4RadioGroup)) {
            allQuestionsAnswered = false;
        }
        if (!isRadioButtonSelected(question5RadioGroup)) {
            allQuestionsAnswered = false;
        }
        if (!isRadioButtonSelected(question6RadioGroup)) {
            allQuestionsAnswered = false;
        }
        if (!isRadioButtonSelected(question7RadioGroup)) {
            allQuestionsAnswered = false;
        }

        if (allQuestionsAnswered) {
            // All questions answered
            Toast.makeText(this, "All questions answered!", Toast.LENGTH_SHORT).show();
        } else {
            // Not all questions answered
            Toast.makeText(this, "Please answer all questions!", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean isRadioButtonSelected(RadioGroup radioGroup) {
        int selectedRadioButtonId = radioGroup.getCheckedRadioButtonId();
        return selectedRadioButtonId != -1;
    }
}