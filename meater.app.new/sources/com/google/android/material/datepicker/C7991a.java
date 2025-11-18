package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;
import androidx.core.view.C0311u;
import p024c.p052i.p059j.C0959i;
import p241e.p254e.p256b.p271c.C8918l;
import p241e.p254e.p256b.p271c.p272a0.C8900g;
import p241e.p254e.p256b.p271c.p272a0.C8904k;
import p241e.p254e.p256b.p271c.p285x.C8947c;

/* compiled from: CalendarItemStyle.java */
/* renamed from: com.google.android.material.datepicker.a */
/* loaded from: classes2.dex */
final class C7991a {

    /* renamed from: a */
    private final Rect f30086a;

    /* renamed from: b */
    private final ColorStateList f30087b;

    /* renamed from: c */
    private final ColorStateList f30088c;

    /* renamed from: d */
    private final ColorStateList f30089d;

    /* renamed from: e */
    private final int f30090e;

    /* renamed from: f */
    private final C8904k f30091f;

    private C7991a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i2, C8904k c8904k, Rect rect) {
        C0959i.m6064b(rect.left);
        C0959i.m6064b(rect.top);
        C0959i.m6064b(rect.right);
        C0959i.m6064b(rect.bottom);
        this.f30086a = rect;
        this.f30087b = colorStateList2;
        this.f30088c = colorStateList;
        this.f30089d = colorStateList3;
        this.f30090e = i2;
        this.f30091f = c8904k;
    }

    /* renamed from: a */
    static C7991a m24348a(Context context, int i2) throws Resources.NotFoundException {
        C0959i.m6063a(i2 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, C8918l.f34164X2);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(C8918l.f34171Y2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(C8918l.f34186a3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(C8918l.f34178Z2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(C8918l.f34194b3, 0));
        ColorStateList colorStateListM28499a = C8947c.m28499a(context, typedArrayObtainStyledAttributes, C8918l.f34202c3);
        ColorStateList colorStateListM28499a2 = C8947c.m28499a(context, typedArrayObtainStyledAttributes, C8918l.f34241h3);
        ColorStateList colorStateListM28499a3 = C8947c.m28499a(context, typedArrayObtainStyledAttributes, C8918l.f34226f3);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C8918l.f34234g3, 0);
        C8904k c8904kM28355m = C8904k.m28314b(context, typedArrayObtainStyledAttributes.getResourceId(C8918l.f34210d3, 0), typedArrayObtainStyledAttributes.getResourceId(C8918l.f34218e3, 0)).m28355m();
        typedArrayObtainStyledAttributes.recycle();
        return new C7991a(colorStateListM28499a, colorStateListM28499a2, colorStateListM28499a3, dimensionPixelSize, c8904kM28355m, rect);
    }

    /* renamed from: b */
    int m24349b() {
        return this.f30086a.bottom;
    }

    /* renamed from: c */
    int m24350c() {
        return this.f30086a.top;
    }

    /* renamed from: d */
    void m24351d(TextView textView) {
        C8900g c8900g = new C8900g();
        C8900g c8900g2 = new C8900g();
        c8900g.setShapeAppearanceModel(this.f30091f);
        c8900g2.setShapeAppearanceModel(this.f30091f);
        c8900g.m28284X(this.f30088c);
        c8900g.m28292f0(this.f30090e, this.f30089d);
        textView.setTextColor(this.f30087b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f30087b.withAlpha(30), c8900g, c8900g2) : c8900g;
        Rect rect = this.f30086a;
        C0311u.m2139m0(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
