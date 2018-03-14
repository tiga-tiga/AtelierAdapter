package fr.wcs.atelieradapter;

/**
 * Created by wilder on 12/03/18.
 */

public class StudentModel {
    String firstname;
    String lastname;

    public StudentModel(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

}
