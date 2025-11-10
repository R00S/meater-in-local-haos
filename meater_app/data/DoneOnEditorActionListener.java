package com.apptionlabs.meater_app.data;

import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

/* loaded from: /tmp/meat/meat/classes.dex */
public class DoneOnEditorActionListener implements TextView.OnEditorActionListener {
    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        ((InputMethodManager) textView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(textView.getWindowToken(), 0);
        return true;
    }
}
