package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import s1.X;

/* compiled from: CalendarItemStyle.java */
/* loaded from: classes2.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Rect f36387a;

    /* renamed from: b, reason: collision with root package name */
    private final ColorStateList f36388b;

    /* renamed from: c, reason: collision with root package name */
    private final ColorStateList f36389c;

    /* renamed from: d, reason: collision with root package name */
    private final ColorStateList f36390d;

    /* renamed from: e, reason: collision with root package name */
    private final int f36391e;

    /* renamed from: f, reason: collision with root package name */
    private final X7.k f36392f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, X7.k kVar, Rect rect) {
        r1.i.d(rect.left);
        r1.i.d(rect.top);
        r1.i.d(rect.right);
        r1.i.d(rect.bottom);
        this.f36387a = rect;
        this.f36388b = colorStateList2;
        this.f36389c = colorStateList;
        this.f36390d = colorStateList3;
        this.f36391e = i10;
        this.f36392f = kVar;
    }

    static b a(Context context, int i10) throws Resources.NotFoundException {
        r1.i.b(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, C7.m.f2877c4);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(C7.m.f2888d4, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(C7.m.f2910f4, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(C7.m.f2899e4, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(C7.m.f2921g4, 0));
        ColorStateList colorStateListA = U7.c.a(context, typedArrayObtainStyledAttributes, C7.m.f2932h4);
        ColorStateList colorStateListA2 = U7.c.a(context, typedArrayObtainStyledAttributes, C7.m.f2987m4);
        ColorStateList colorStateListA3 = U7.c.a(context, typedArrayObtainStyledAttributes, C7.m.f2965k4);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7.m.f2976l4, 0);
        X7.k kVarM = X7.k.b(context, typedArrayObtainStyledAttributes.getResourceId(C7.m.f2943i4, 0), typedArrayObtainStyledAttributes.getResourceId(C7.m.f2954j4, 0)).m();
        typedArrayObtainStyledAttributes.recycle();
        return new b(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, kVarM, rect);
    }

    int b() {
        return this.f36387a.bottom;
    }

    int c() {
        return this.f36387a.top;
    }

    void d(TextView textView) {
        e(textView, null, null);
    }

    void e(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        X7.g gVar = new X7.g();
        X7.g gVar2 = new X7.g();
        gVar.setShapeAppearanceModel(this.f36392f);
        gVar2.setShapeAppearanceModel(this.f36392f);
        if (colorStateList == null) {
            colorStateList = this.f36389c;
        }
        gVar.b0(colorStateList);
        gVar.i0(this.f36391e, this.f36390d);
        if (colorStateList2 == null) {
            colorStateList2 = this.f36388b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f36388b.withAlpha(30), gVar, gVar2);
        Rect rect = this.f36387a;
        X.r0(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
