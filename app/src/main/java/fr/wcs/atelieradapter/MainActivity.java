package fr.wcs.atelieradapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Construct the data source
        final ArrayList<StudentModel> arrayOfStudents = new ArrayList<StudentModel>();
        // Create the adapter to convert the array to views
        StudentAdapter  adapter = new StudentAdapter(this, arrayOfStudents);
        // Attach the adapter to a ListView
        final ListView listView = (ListView) findViewById(R.id.studentList);
        listView.setAdapter(adapter);
        try {

            arrayOfStudents.add(new StudentModel("Stan", "Marsh"));
            arrayOfStudents.add(new StudentModel("Eric", "Cartman"));
            arrayOfStudents.add(new StudentModel("Kenny", "Broflovski"));
            arrayOfStudents.add(new StudentModel("Kyle", "McCormick"));
            arrayOfStudents.add(new StudentModel("Wendy", "Testaburger"));


        }catch (Exception e){}


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                StudentModel item =(StudentModel) listView.getItemAtPosition(position);

                Intent intent = new Intent(MainActivity.this, StudentActivity.class);
                intent.putExtra("firstname", item.getFirstname());
                intent.putExtra("lastname", item.getLastname());

                startActivity(intent);
            }
        });
        }


}
