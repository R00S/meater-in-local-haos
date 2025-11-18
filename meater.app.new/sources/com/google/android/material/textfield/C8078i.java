package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p024c.p025a.p026k.p027a.C0833a;
import p241e.p254e.p256b.p271c.C8911e;
import p241e.p254e.p256b.p271c.C8916j;

/* compiled from: PasswordToggleEndIconDelegate.java */
/* renamed from: com.google.android.material.textfield.i */
/* loaded from: classes2.dex */
class C8078i extends AbstractC8074e {

    /* renamed from: d */
    private final TextWatcher f30593d;

    /* renamed from: e */
    private final TextInputLayout.InterfaceC8068f f30594e;

    /* renamed from: f */
    private final TextInputLayout.InterfaceC8069g f30595f;

    /* compiled from: PasswordToggleEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.i$a */
    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            C8078i.this.f30561c.setChecked(!r1.m24897g());
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.i$b */
    class b implements TextInputLayout.InterfaceC8068f {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC8068f
        /* renamed from: a */
        public void mo24796a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            C8078i.this.f30561c.setChecked(!r4.m24897g());
            editText.removeTextChangedListener(C8078i.this.f30593d);
            editText.addTextChangedListener(C8078i.this.f30593d);
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.i$c */
    class c implements TextInputLayout.InterfaceC8069g {
        c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC8069g
        /* renamed from: a */
        public void mo24797a(TextInputLayout textInputLayout, int i2) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i2 != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.removeTextChangedListener(C8078i.this.f30593d);
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.i$d */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = C8078i.this.f30559a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            if (C8078i.this.m24897g()) {
                editText.setTransformationMethod(null);
            } else {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
        }
    }

    C8078i(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f30593d = new a();
        this.f30594e = new b();
        this.f30595f = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public boolean m24897g() {
        EditText editText = this.f30559a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* renamed from: h */
    private static boolean m24898h(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    @Override // com.google.android.material.textfield.AbstractC8074e
    /* renamed from: a */
    void mo24807a() {
        this.f30559a.setEndIconDrawable(C0833a.m5262d(this.f30560b, C8911e.f33893b));
        TextInputLayout textInputLayout = this.f30559a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C8916j.f33975s));
        this.f30559a.setEndIconOnClickListener(new d());
        this.f30559a.addOnEditTextAttachedListener(this.f30594e);
        this.f30559a.addOnEndIconChangedListener(this.f30595f);
        EditText editText = this.f30559a.getEditText();
        if (m24898h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
