package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* compiled from: CalendarStyle.java */
/* loaded from: classes2.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    final b f36393a;

    /* renamed from: b, reason: collision with root package name */
    final b f36394b;

    /* renamed from: c, reason: collision with root package name */
    final b f36395c;

    /* renamed from: d, reason: collision with root package name */
    final b f36396d;

    /* renamed from: e, reason: collision with root package name */
    final b f36397e;

    /* renamed from: f, reason: collision with root package name */
    final b f36398f;

    /* renamed from: g, reason: collision with root package name */
    final b f36399g;

    /* renamed from: h, reason: collision with root package name */
    final Paint f36400h;

    c(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(U7.b.d(context, C7.c.f2278B, i.class.getCanonicalName()), C7.m.f2774S3);
        this.f36393a = b.a(context, typedArrayObtainStyledAttributes.getResourceId(C7.m.f2814W3, 0));
        this.f36399g = b.a(context, typedArrayObtainStyledAttributes.getResourceId(C7.m.f2794U3, 0));
        this.f36394b = b.a(context, typedArrayObtainStyledAttributes.getResourceId(C7.m.f2804V3, 0));
        this.f36395c = b.a(context, typedArrayObtainStyledAttributes.getResourceId(C7.m.f2824X3, 0));
        ColorStateList colorStateListA = U7.c.a(context, typedArrayObtainStyledAttributes, C7.m.f2834Y3);
        this.f36396d = b.a(context, typedArrayObtainStyledAttributes.getResourceId(C7.m.f2855a4, 0));
        this.f36397e = b.a(context, typedArrayObtainStyledAttributes.getResourceId(C7.m.f2844Z3, 0));
        this.f36398f = b.a(context, typedArrayObtainStyledAttributes.getResourceId(C7.m.f2866b4, 0));
        Paint paint = new Paint();
        this.f36400h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
