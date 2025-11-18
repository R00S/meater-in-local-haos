package com.google.android.material.progressindicator;

import C7.m;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.r;

/* compiled from: BaseProgressIndicatorSpec.java */
/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public int f36915a;

    /* renamed from: b, reason: collision with root package name */
    public int f36916b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f36917c = new int[0];

    /* renamed from: d, reason: collision with root package name */
    public int f36918d;

    /* renamed from: e, reason: collision with root package name */
    public int f36919e;

    /* renamed from: f, reason: collision with root package name */
    public int f36920f;

    /* renamed from: g, reason: collision with root package name */
    public int f36921g;

    protected b(Context context, AttributeSet attributeSet, int i10, int i11) throws Resources.NotFoundException {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C7.e.f2418t0);
        TypedArray typedArrayI = r.i(context, attributeSet, m.f2928h0, i10, i11, new int[0]);
        this.f36915a = U7.c.d(context, typedArrayI, m.f3027q0, dimensionPixelSize);
        this.f36916b = Math.min(U7.c.d(context, typedArrayI, m.f3016p0, 0), this.f36915a / 2);
        this.f36919e = typedArrayI.getInt(m.f2983m0, 0);
        this.f36920f = typedArrayI.getInt(m.f2939i0, 0);
        this.f36921g = typedArrayI.getDimensionPixelSize(m.f2961k0, 0);
        c(context, typedArrayI);
        d(context, typedArrayI);
        typedArrayI.recycle();
    }

    private void c(Context context, TypedArray typedArray) throws Resources.NotFoundException {
        int i10 = m.f2950j0;
        if (!typedArray.hasValue(i10)) {
            this.f36917c = new int[]{M7.a.b(context, C7.c.f2329n, -1)};
            return;
        }
        if (typedArray.peekValue(i10).type != 1) {
            this.f36917c = new int[]{typedArray.getColor(i10, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i10, -1));
        this.f36917c = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    private void d(Context context, TypedArray typedArray) {
        int i10 = m.f3005o0;
        if (typedArray.hasValue(i10)) {
            this.f36918d = typedArray.getColor(i10, -1);
            return;
        }
        this.f36918d = this.f36917c[0];
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
        float f10 = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
        typedArrayObtainStyledAttributes.recycle();
        this.f36918d = M7.a.a(this.f36918d, (int) (f10 * 255.0f));
    }

    public boolean a() {
        return this.f36920f != 0;
    }

    public boolean b() {
        return this.f36919e != 0;
    }

    void e() {
        if (this.f36921g < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}
