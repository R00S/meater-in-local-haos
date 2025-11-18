package com.google.android.material.progressindicator;

import C7.m;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.r;

/* compiled from: LinearProgressIndicatorSpec.java */
/* loaded from: classes2.dex */
public final class k extends b {

    /* renamed from: h, reason: collision with root package name */
    public int f36981h;

    /* renamed from: i, reason: collision with root package name */
    public int f36982i;

    /* renamed from: j, reason: collision with root package name */
    boolean f36983j;

    /* renamed from: k, reason: collision with root package name */
    public int f36984k;

    public k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7.c.f2340y);
    }

    @Override // com.google.android.material.progressindicator.b
    void e() {
        super.e();
        if (this.f36984k < 0) {
            throw new IllegalArgumentException("Stop indicator size must be >= 0.");
        }
        if (this.f36981h == 0) {
            if (this.f36916b > 0 && this.f36921g == 0) {
                throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            }
            if (this.f36917c.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }

    public k(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, LinearProgressIndicator.f36895Q);
    }

    public k(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayI = r.i(context, attributeSet, m.f2887d3, C7.c.f2340y, LinearProgressIndicator.f36895Q, new int[0]);
        this.f36981h = typedArrayI.getInt(m.f2898e3, 1);
        this.f36982i = typedArrayI.getInt(m.f2909f3, 0);
        this.f36984k = Math.min(typedArrayI.getDimensionPixelSize(m.f2920g3, 0), this.f36915a);
        typedArrayI.recycle();
        e();
        this.f36983j = this.f36982i == 1;
    }
}
