package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0190t;
import com.google.android.material.theme.p178a.C8079a;
import p241e.p254e.p256b.p271c.C8908b;
import p241e.p254e.p256b.p271c.C8918l;
import p241e.p254e.p256b.p271c.p285x.C8946b;
import p241e.p254e.p256b.p271c.p285x.C8947c;

/* loaded from: classes2.dex */
public class MaterialTextView extends C0190t {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* renamed from: f */
    private void m24899f(Resources.Theme theme, int i2) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i2, C8918l.f34367z3);
        int iM24902i = m24902i(getContext(), typedArrayObtainStyledAttributes, C8918l.f34004A3, C8918l.f34011B3);
        typedArrayObtainStyledAttributes.recycle();
        if (iM24902i >= 0) {
            setLineHeight(iM24902i);
        }
    }

    /* renamed from: g */
    private static boolean m24900g(Context context) {
        return C8946b.m28496b(context, C8908b.f33807H, true);
    }

    /* renamed from: h */
    private static int m24901h(Resources.Theme theme, AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C8918l.f34018C3, i2, i3);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C8918l.f34025D3, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: i */
    private static int m24902i(Context context, TypedArray typedArray, int... iArr) {
        int iM28501c = -1;
        for (int i2 = 0; i2 < iArr.length && iM28501c < 0; i2++) {
            iM28501c = C8947c.m28501c(context, typedArray, iArr[i2], -1);
        }
        return iM28501c;
    }

    /* renamed from: j */
    private static boolean m24903j(Context context, Resources.Theme theme, AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C8918l.f34018C3, i2, i3);
        int iM24902i = m24902i(context, typedArrayObtainStyledAttributes, C8918l.f34032E3, C8918l.f34039F3);
        typedArrayObtainStyledAttributes.recycle();
        return iM24902i != -1;
    }

    @Override // androidx.appcompat.widget.C0190t, android.widget.TextView
    public void setTextAppearance(Context context, int i2) throws Resources.NotFoundException {
        super.setTextAppearance(context, i2);
        if (m24900g(context)) {
            m24899f(context.getTheme(), i2);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i2, int i3) throws Resources.NotFoundException {
        int iM24901h;
        super(C8079a.m24906c(context, attributeSet, i2, i3), attributeSet, i2);
        Context context2 = getContext();
        if (m24900g(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (m24903j(context2, theme, attributeSet, i2, i3) || (iM24901h = m24901h(theme, attributeSet, i2, i3)) == -1) {
                return;
            }
            m24899f(theme, iM24901h);
        }
    }
}
