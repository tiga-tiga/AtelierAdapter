package fr.wcs.atelieradapter;

import android.view.View;
import android.widget.TextView;

/**
 * Created by wilder on 14/03/18.
 */

public class ViewHolder {
    TextView studentFirstname;
    TextView studentLastname;

        public ViewHolder(View view) {
            studentFirstname = (TextView)
                    view.findViewById(R.id.textViewFirstname);
            studentLastname = (TextView)
                    view.findViewById(R.id.textViewLastname);
        }


}
