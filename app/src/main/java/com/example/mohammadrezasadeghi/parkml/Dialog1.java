package com.example.mohammadrezasadeghi.parkml;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;
import android.support.v7.app.AlertDialog;

public class Dialog1 extends AppCompatDialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder( getActivity() );
        builder.setTitle( "" )
                .setMessage( "\t HAVE FUN" )
                .setPositiveButton( "OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {

                    }
                } );
        return builder.create();
    }
}

       /* private Dialog onCreatDialog(Bundle SaveInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder( getActivity() );
        final AlertDialog.Builder builder1 = builder.setTitle( "" )
                .setMessage( "Thanks for Using " )
                .setPositiveButton( "OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {


                    }
                } );
        return builder.create();



    }


}

       */