package com.nativescreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    Bundle bundleMessage=getIntent().getExtras();
    Double amountPayment=bundleMessage.getDouble("amount");
        AlertDialog.Builder alertMessage=new AlertDialog.Builder(Main2Activity.this);
        alertMessage.setMessage("Cantidad: "+amountPayment);
        alertMessage.setPositiveButton("Yes", new Dialog.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.cancel();
            }

        });

        alertMessage.setNegativeButton("No", new Dialog.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.cancel();

            }

        });

        alertMessage.show();
    }

}