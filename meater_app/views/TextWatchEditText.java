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
public class TextWatchEditText extends AppCompatEditText {

    /* renamed from: w, reason: collision with root package name */
    private boolean f10436w;

    /* renamed from: x, reason: collision with root package name */
    String f10437x;

    public TextWatchEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10436w = true;
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean k(View view, MotionEvent motionEvent) {
        setCursorVisible(true);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean l(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 == 6) {
            clearFocus();
            setCursorVisible(false);
        }
        return false;
    }

    void i() {
        setOnTouchListener(new View.OnTouchListener() { // from class: com.apptionlabs.meater_app.views.s1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean k10;
                k10 = TextWatchEditText.this.k(view, motionEvent);
                return k10;
            }
        });
        setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.apptionlabs.meater_app.views.t1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                boolean l10;
                l10 = TextWatchEditText.this.l(textView, i10, keyEvent);
                return l10;
            }
        });
        setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.apptionlabs.meater_app.views.u1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                TextWatchEditText.m(view, z10);
            }
        });
        addTextChangedListener(new a());
    }

    public boolean j() {
        return this.f10436w;
    }

    public void setIsHintText(boolean z10) {
        this.f10436w = z10;
    }

    public void setTempCookName(String str) {
        this.f10437x = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            TextWatchEditText textWatchEditText = TextWatchEditText.this;
            boolean unused = textWatchEditText.f10436w;
            String charSequence2 = charSequence.toString();
            String replaceAll = charSequence2.replaceAll("(\\r|\\n|\\r\\n)+", " ");
            if (replaceAll.trim().getBytes().length > 31) {
                textWatchEditText.setText(TextWatchEditText.this.f10437x);
                if (TextWatchEditText.this.f10437x.trim().length() > 1) {
                    textWatchEditText.setSelection(TextWatchEditText.this.f10437x.trim().length());
                    return;
                }
                return;
            }
            if (!replaceAll.equals(charSequence2)) {
                textWatchEditText.setText(replaceAll);
            }
            TextWatchEditText.this.f10437x = replaceAll;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(View view, boolean z10) {
    }
}
