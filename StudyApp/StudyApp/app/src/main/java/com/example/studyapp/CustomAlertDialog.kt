package com.example.studyapp

import android.app.Activity
import android.app.AlertDialog
import android.content.DialogInterface

class CustomAlertDialog(activity: Activity,title: String,text:String) {
    init {
        // Build Alert Dialog
        val dialogBuilder = AlertDialog.Builder(activity)

        // set message of alert dialog
        dialogBuilder.setMessage(text)
            //Positive button text and action
            .setPositiveButton("ok",DialogInterface.OnClickListener{dialog, id -> dialog.cancel()
            })
        //create dialog box
        val alert = dialogBuilder.create()
        //set title for alert dialog box
        alert.setTitle(title)
        // Show alert dialog
        alert.show()
    }
}