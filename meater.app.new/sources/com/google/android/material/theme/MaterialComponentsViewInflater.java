package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.C0073j;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.C0156c;
import androidx.appcompat.widget.C0160e;
import androidx.appcompat.widget.C0190t;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.C8076g;
import com.google.android.material.textview.MaterialTextView;
import p241e.p254e.p256b.p271c.p275o.C8931a;
import p241e.p254e.p256b.p271c.p284w.C8944a;

/* loaded from: classes2.dex */
public class MaterialComponentsViewInflater extends C0073j {
    @Override // androidx.appcompat.app.C0073j
    /* renamed from: b */
    protected C0156c mo396b(Context context, AttributeSet attributeSet) {
        return new C8076g(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0073j
    /* renamed from: c */
    protected AppCompatButton mo397c(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0073j
    /* renamed from: d */
    protected C0160e mo398d(Context context, AttributeSet attributeSet) {
        return new C8931a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0073j
    /* renamed from: j */
    protected AppCompatRadioButton mo404j(Context context, AttributeSet attributeSet) {
        return new C8944a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0073j
    /* renamed from: n */
    protected C0190t mo408n(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
