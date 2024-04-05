package com.example.blooddonation.Activities;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.blooddonation.R;

public class Benificiaries extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create the main layout (LinearLayout)
        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        ));
        mainLayout.setOrientation(LinearLayout.VERTICAL);
        mainLayout.setPadding(16, 16, 16, 16);
        mainLayout.setBackgroundColor(getResources().getColor(R.color.)); // set your desired color

        // Create TextView 1
        TextView textView1 = new TextView(this);
        textView1.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));
        textView1.setText("Beneficiaries:");
        textView1.setTextSize(25);
        textView1.setBackgroundColor(getResources().getColor(R.color.black)); // set your desired color
        textView1.setTextColor(getResources().getColor(R.color.black)); // set your desired color
        mainLayout.addView(textView1);

        // Array of sentences
        String[] sentences = {
                "1. Blood donation saves lives.",
                "2. It promotes cardiovascular health.",
                "3. Donors contribute to community well-being.",
                "4. Screening detects health issues early.",
                "5. Replenishes blood supply in emergencies.",
                "6. Donating is safe and straightforward.",
                "7. Improves blood flow and circulation.",
                "8. Reduces the risk of heart disease.",
                "9. Fosters a sense of altruism.",
                "10. Environmentally friendly practice."
        };

        // Create TextViews for each sentence
        for (String sentence : sentences) {
            TextView textView = new TextView(this);
            textView.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            ));
            textView.setText(sentence);
            textView.setTextSize(16);
            mainLayout.addView(textView);
        }

        // Set the content view to the main layout
        setContentView(mainLayout);
    }
}