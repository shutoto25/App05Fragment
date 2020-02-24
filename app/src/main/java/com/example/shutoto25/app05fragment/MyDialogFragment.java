package com.example.shutoto25.app05fragment;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;

/**
 * 共通ダイアログ.(にしたい)
 */
public class MyDialogFragment extends DialogFragment {

    /**
     * ダイアログタイトル.
     */
    private String mTitle;
    /**
     * ダイアログ本文.
     */
    private String mMessage;


    public static MyDialogFragment newInstance() {
        return new MyDialogFragment();
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        Activity activity = getActivity();
        final AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        final View dialogView = LayoutInflater.from(activity).inflate(R.layout.fragment_dialog, null);
        builder.setView(dialogView);
        builder.setTitle(mTitle);
        builder.setMessage(mMessage);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                MyDialogFragment.this.dismiss();
            }
        });
        Dialog dialog = builder.create();
        return dialog;
    }


    /**
     * Setter for dialog title.
     *
     * @param title
     */
    public void setDialogTitle(String title) {
        this.mTitle = title;
    }

    /**
     * Setter for dialog message.
     *
     * @param message
     */
    public void setDialogMessage(String message) {
        this.mMessage = message;
    }
}
