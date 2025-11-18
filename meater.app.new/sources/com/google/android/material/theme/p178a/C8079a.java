package com.google.android.material.theme.p178a;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p024c.p025a.p032o.C0844d;
import p241e.p254e.p256b.p271c.C8908b;

/* compiled from: MaterialThemeOverlay.java */
/* renamed from: com.google.android.material.theme.a.a */
/* loaded from: classes2.dex */
public class C8079a {

    /* renamed from: a */
    private static final int[] f30600a = {R.attr.theme, C8908b.f33809J};

    /* renamed from: b */
    private static final int[] f30601b = {C8908b.f33834x};

    /* renamed from: a */
    private static int m24904a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f30600a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    /* renamed from: b */
    private static int m24905b(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f30601b, i2, i3);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: c */
    public static Context m24906c(Context context, AttributeSet attributeSet, int i2, int i3) {
        int iM24905b = m24905b(context, attributeSet, i2, i3);
        boolean z = (context instanceof C0844d) && ((C0844d) context).m5345c() == iM24905b;
        if (iM24905b == 0 || z) {
            return context;
        }
        C0844d c0844d = new C0844d(context, iM24905b);
        int iM24904a = m24904a(context, attributeSet);
        if (iM24904a != 0) {
            c0844d.getTheme().applyStyle(iM24904a, true);
        }
        return c0844d;
    }
}
