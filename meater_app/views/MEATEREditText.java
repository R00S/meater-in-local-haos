package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;

/* loaded from: /tmp/meat/meat/classes.dex */
public class MEATEREditText extends AppCompatEditText {
    public MEATEREditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean i(View view, MotionEvent motionEvent) {
        setCursorVisible(true);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean k(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 == 6) {
            clearFocus();
            setCursorVisible(false);
        }
        return false;
    }

    void h(final Context context) {
        setOnTouchListener(new View.OnTouchListener() { // from class: com.apptionlabs.meater_app.views.j0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean i10;
                i10 = MEATEREditText.this.i(view, motionEvent);
                return i10;
            }
        });
        setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.apptionlabs.meater_app.views.k0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                f8.l0.u(context, view);
            }
        });
        setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.apptionlabs.meater_app.views.l0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                boolean k10;
                k10 = MEATEREditText.this.k(textView, i10, keyEvent);
                return k10;
            }
        });
        addTextChangedListener(new a(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class a implements TextWatcher {
        a(MEATEREditText mEATEREditText) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
