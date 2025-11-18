package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import androidx.core.graphics.drawable.C0265a;
import com.google.android.gms.base.C6325R;
import com.google.android.gms.common.util.DeviceProperties;

/* loaded from: classes2.dex */
public final class SignInButtonImpl extends Button {
    public SignInButtonImpl(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private static int m14398b(int i2, int i3, int i4, int i5) {
        if (i2 == 0) {
            return i3;
        }
        if (i2 == 1) {
            return i4;
        }
        if (i2 == 2) {
            return i5;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Unknown color scheme: ");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public final void m14399a(Resources resources, int i2, int i3) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i4 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i4);
        setMinWidth(i4);
        int i5 = C6325R.drawable.f17113b;
        int i6 = C6325R.drawable.f17114c;
        int iM14398b = m14398b(i3, i5, i6, i6);
        int i7 = C6325R.drawable.f17115d;
        int i8 = C6325R.drawable.f17116e;
        int iM14398b2 = m14398b(i3, i7, i8, i8);
        if (i2 == 0 || i2 == 1) {
            iM14398b = iM14398b2;
        } else if (i2 != 2) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Unknown button size: ");
            sb.append(i2);
            throw new IllegalStateException(sb.toString());
        }
        Drawable drawableM1821r = C0265a.m1821r(resources.getDrawable(iM14398b));
        C0265a.m1818o(drawableM1821r, resources.getColorStateList(C6325R.color.f17111c));
        C0265a.m1819p(drawableM1821r, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(drawableM1821r);
        int i9 = C6325R.color.f17109a;
        int i10 = C6325R.color.f17110b;
        setTextColor((ColorStateList) Preconditions.m14372k(resources.getColorStateList(m14398b(i3, i9, i10, i10))));
        if (i2 == 0) {
            setText(resources.getString(C6325R.string.f17132p));
        } else if (i2 == 1) {
            setText(resources.getString(C6325R.string.f17133q));
        } else {
            if (i2 != 2) {
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Unknown button size: ");
                sb2.append(i2);
                throw new IllegalStateException(sb2.toString());
            }
            setText((CharSequence) null);
        }
        setTransformationMethod(null);
        if (DeviceProperties.m14624d(getContext())) {
            setGravity(19);
        }
    }

    public SignInButtonImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyle);
    }
}
