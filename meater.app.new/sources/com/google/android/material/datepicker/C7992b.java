package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import p241e.p254e.p256b.p271c.C8908b;
import p241e.p254e.p256b.p271c.C8918l;
import p241e.p254e.p256b.p271c.p285x.C8946b;
import p241e.p254e.p256b.p271c.p285x.C8947c;

/* compiled from: CalendarStyle.java */
/* renamed from: com.google.android.material.datepicker.b */
/* loaded from: classes2.dex */
final class C7992b {

    /* renamed from: a */
    final C7991a f30092a;

    /* renamed from: b */
    final C7991a f30093b;

    /* renamed from: c */
    final C7991a f30094c;

    /* renamed from: d */
    final C7991a f30095d;

    /* renamed from: e */
    final C7991a f30096e;

    /* renamed from: f */
    final C7991a f30097f;

    /* renamed from: g */
    final C7991a f30098g;

    /* renamed from: h */
    final Paint f30099h;

    C7992b(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C8946b.m28497c(context, C8908b.f33832v, C7995e.class.getCanonicalName()), C8918l.f34101O2);
        this.f30092a = C7991a.m24348a(context, typedArrayObtainStyledAttributes.getResourceId(C8918l.f34122R2, 0));
        this.f30098g = C7991a.m24348a(context, typedArrayObtainStyledAttributes.getResourceId(C8918l.f34108P2, 0));
        this.f30093b = C7991a.m24348a(context, typedArrayObtainStyledAttributes.getResourceId(C8918l.f34115Q2, 0));
        this.f30094c = C7991a.m24348a(context, typedArrayObtainStyledAttributes.getResourceId(C8918l.f34129S2, 0));
        ColorStateList colorStateListM28499a = C8947c.m28499a(context, typedArrayObtainStyledAttributes, C8918l.f34136T2);
        this.f30095d = C7991a.m24348a(context, typedArrayObtainStyledAttributes.getResourceId(C8918l.f34150V2, 0));
        this.f30096e = C7991a.m24348a(context, typedArrayObtainStyledAttributes.getResourceId(C8918l.f34143U2, 0));
        this.f30097f = C7991a.m24348a(context, typedArrayObtainStyledAttributes.getResourceId(C8918l.f34157W2, 0));
        Paint paint = new Paint();
        this.f30099h = paint;
        paint.setColor(colorStateListM28499a.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
