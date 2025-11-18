package com.google.android.material.timepicker;

import C7.g;
import C7.i;
import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.q;
import com.google.android.material.internal.u;
import com.google.android.material.textfield.TextInputLayout;
import s1.X;

/* loaded from: classes2.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: B, reason: collision with root package name */
    private final Chip f37464B;

    /* renamed from: C, reason: collision with root package name */
    private final TextInputLayout f37465C;

    /* renamed from: D, reason: collision with root package name */
    private final EditText f37466D;

    /* renamed from: E, reason: collision with root package name */
    private TextWatcher f37467E;

    /* renamed from: F, reason: collision with root package name */
    private TextView f37468F;

    private class b extends q {
        private b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f37464B.setText(ChipTextInputComboView.this.c("00"));
                return;
            }
            String strC = ChipTextInputComboView.this.c(editable);
            Chip chip = ChipTextInputComboView.this.f37464B;
            if (TextUtils.isEmpty(strC)) {
                strC = ChipTextInputComboView.this.c("00");
            }
            chip.setText(strC);
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(CharSequence charSequence) {
        return e.a(getResources(), charSequence);
    }

    private void d() {
        this.f37466D.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f37464B.isChecked();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        this.f37464B.setChecked(z10);
        this.f37466D.setVisibility(z10 ? 0 : 4);
        this.f37464B.setVisibility(z10 ? 8 : 0);
        if (isChecked()) {
            u.k(this.f37466D, false);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f37464B.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        this.f37464B.setTag(i10, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f37464B.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(i.f2515m, (ViewGroup) this, false);
        this.f37464B = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(i.f2516n, (ViewGroup) this, false);
        this.f37465C = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f37466D = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f37467E = bVar;
        editText.addTextChangedListener(bVar);
        d();
        addView(chip);
        addView(textInputLayout);
        this.f37468F = (TextView) findViewById(g.f2489p);
        editText.setId(X.k());
        X.A0(this.f37468F, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
