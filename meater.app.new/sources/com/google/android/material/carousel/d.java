package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;

/* compiled from: CarouselStrategy.java */
/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private float f36242a;

    /* renamed from: b, reason: collision with root package name */
    private float f36243b;

    static int[] a(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr2[i10] = iArr[i10] * 2;
        }
        return iArr2;
    }

    static float b(float f10, float f11, float f12) {
        return 1.0f - ((f10 - f12) / (f11 - f12));
    }

    public float c() {
        return this.f36243b;
    }

    public float d() {
        return this.f36242a;
    }

    void e(Context context) {
        float fH = this.f36242a;
        if (fH <= 0.0f) {
            fH = e.h(context);
        }
        this.f36242a = fH;
        float fG = this.f36243b;
        if (fG <= 0.0f) {
            fG = e.g(context);
        }
        this.f36243b = fG;
    }

    boolean f() {
        return true;
    }

    abstract f g(b bVar, View view);

    abstract boolean h(b bVar, int i10);
}
