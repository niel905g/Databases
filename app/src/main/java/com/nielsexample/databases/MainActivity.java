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
 db.close();
 */
        //---update contact---
        db.open();
        if (db.updateContact(1, "Oscar Diggs", "oscar@oscardiggs.com"))
            Toast.makeText(this, "Update successful.",
                    Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this, "Update failed.", Toast.LENGTH_LONG).show();
        db.close();
    }
}