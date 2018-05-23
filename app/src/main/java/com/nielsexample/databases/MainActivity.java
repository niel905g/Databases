package com.nielsexample.databases;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        DBAdapter db = new DBAdapter(this);
 /*
 //---add a contact---
 ...
 //--get all contacts---
 ...
 //---get a contact---
 ...
 //---update contact---
 ...
 db.close();
 */
        //---delete a contact---
        db.open();
        if (db.deleteContact(1))
            Toast.makeText(this, "Delete successful.",
                    Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this, "Delete failed.", Toast.LENGTH_LONG).show();
        db.close();
    }
}