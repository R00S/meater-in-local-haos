package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.android.material.progressindicator.b;

/* compiled from: DrawingDelegate.java */
/* loaded from: classes2.dex */
abstract class e<S extends b> {

    /* renamed from: a, reason: collision with root package name */
    S f36945a;

    /* compiled from: DrawingDelegate.java */
    protected static class a {

        /* renamed from: a, reason: collision with root package name */
        float f36946a;

        /* renamed from: b, reason: collision with root package name */
        float f36947b;

        /* renamed from: c, reason: collision with root package name */
        int f36948c;

        /* renamed from: d, reason: collision with root package name */
        int f36949d;

        protected a() {
        }
    }

    public e(S s10) {
        this.f36945a = s10;
    }

    abstract void a(Canvas canvas, Rect rect, float f10, boolean z10, boolean z11);

    abstract void b(Canvas canvas, Paint paint, int i10, int i11);

    abstract void c(Canvas canvas, Paint paint, a aVar, int i10);

    abstract void d(Canvas canvas, Paint paint, float f10, float f11, int i10, int i11, int i12);

    abstract int e();

    abstract int f();

    void g(Canvas canvas, Rect rect, float f10, boolean z10, boolean z11) {
        this.f36945a.e();
        a(canvas, rect, f10, z10, z11);
    }
}
