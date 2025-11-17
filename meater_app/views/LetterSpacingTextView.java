package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: /tmp/meat/meat/classes.dex */
public class LetterSpacingTextView extends AppCompatTextView {

    /* renamed from: x, reason: collision with root package name */
    private float f10318x;

    /* renamed from: y, reason: collision with root package name */
    private CharSequence f10319y;

    public LetterSpacingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10318x = 0.0f;
        this.f10319y = "";
    }

    private void s() {
        if (this.f10319y == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        while (i10 < this.f10319y.length()) {
            sb.append(this.f10319y.charAt(i10));
            i10++;
            if (i10 < this.f10319y.length()) {
                sb.append(" ");
            }
        }
        SpannableString spannableString = new SpannableString(sb.toString());
        if (sb.toString().length() > 1) {
            for (int i11 = 1; i11 < sb.toString().length(); i11 += 2) {
                spannableString.setSpan(new ScaleXSpan((this.f10318x + 1.0f) / 10.0f), i11, i11 + 1, 33);
            }
        }
        super.setText(spannableString, TextView.BufferType.SPANNABLE);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public CharSequence getText() {
        return this.f10319y;
    }

    public void setSpacing(float f10) {
        this.f10318x = f10;
        s();
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.f10319y = charSequence;
        s();
    }
}
