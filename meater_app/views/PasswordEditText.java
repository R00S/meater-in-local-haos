package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;

/* loaded from: /tmp/meat/meat/classes.dex */
public class PasswordEditText extends AppCompatEditText {

    /* renamed from: w, reason: collision with root package name */
    PasswordEditText f10382w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f10383x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f10384y;

    public PasswordEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10383x = false;
        this.f10384y = false;
        h(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(Context context, View view, boolean z10) {
        f8.l0.u(context, view);
        if (view == this.f10382w) {
            this.f10384y = false;
        }
    }

    private void k(String str) {
        if (this.f10383x) {
            this.f10382w = this;
            setInputType(144);
            this.f10382w.setTypeface(Typeface.DEFAULT);
            this.f10382w.setTransformationMethod(null);
        } else {
            this.f10382w = this;
            setInputType(144);
            this.f10382w.setTypeface(Typeface.DEFAULT);
            this.f10382w.setTransformationMethod(new PasswordTransformationMethod());
        }
        this.f10382w.setText(str);
        PasswordEditText passwordEditText = this.f10382w;
        passwordEditText.setSelection(passwordEditText.getText().length());
    }

    void h(final Context context) {
        j(false, "");
        setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.apptionlabs.meater_app.views.f1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                PasswordEditText.this.i(context, view, z10);
            }
        });
        addTextChangedListener(new a());
    }

    public void j(boolean z10, String str) {
        this.f10383x = z10;
        k(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String obj = editable.toString();
            String replaceAll = obj.replaceAll("(\\r|\\n|\\r\\n)+", " ");
            if (!replaceAll.equals(obj)) {
                PasswordEditText.this.f10382w.setText(replaceAll);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (!PasswordEditText.this.f10384y) {
                PasswordEditText.this.f10384y = true;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
