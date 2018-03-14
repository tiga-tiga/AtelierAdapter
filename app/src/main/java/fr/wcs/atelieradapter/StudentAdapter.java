package fr.wcs.atelieradapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by wilder on 12/03/18.
 */

public class StudentAdapter extends ArrayAdapter<StudentModel> {
      public StudentAdapter(Context context, ArrayList<StudentModel> students) {
        super(context, 0, students);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        /*StudentModel student = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.student_item, parent, false);
        }
        // Lookup view for data population
        TextView first = (TextView) convertView.findViewById(R.id.textViewFirstname);
        TextView last = (TextView) convertView.findViewById(R.id.textViewLastname);
        // Populate the data into the template view using the data object
        first.setText(student.getFirstname());
        last.setText(student.getLastname());*/

        //optimisation with ViewHolder
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.student_item, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        StudentModel student = (StudentModel) getItem(position);
        viewHolder.studentFirstname.setText(student.getFirstname());
        viewHolder.studentLastname.setText(student.getLastname());


        // Return the completed view to render on screen
        return convertView;



    }


}
