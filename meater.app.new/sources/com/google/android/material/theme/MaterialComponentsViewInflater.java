package com.google.android.material.theme;

import I7.a;
import a8.C1911a;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.r;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C1982d;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.v;

/* loaded from: classes2.dex */
public class MaterialComponentsViewInflater extends r {
    @Override // androidx.appcompat.app.r
    protected C1982d c(Context context, AttributeSet attributeSet) {
        return new v(context, attributeSet);
    }

    @Override // androidx.appcompat.app.r
    protected AppCompatButton d(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.r
    protected AppCompatCheckBox e(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.r
    protected androidx.appcompat.widget.r k(Context context, AttributeSet attributeSet) {
        return new T7.a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.r
    protected AppCompatTextView o(Context context, AttributeSet attributeSet) {
        return new C1911a(context, attributeSet);
    }
}
