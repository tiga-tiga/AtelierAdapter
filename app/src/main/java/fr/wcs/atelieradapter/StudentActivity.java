package fr.wcs.atelieradapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        Intent intent = getIntent();
        String firstname = intent.getStringExtra("firstname");
        String lastname = intent.getStringExtra("lastname");
        TextView textFirst = (TextView) findViewById(R.id.textFirstname);
        TextView textLast = (TextView) findViewById(R.id.textLastname);
        textFirst.setText(firstname);
        textLast.setText(lastname);

    }
}
