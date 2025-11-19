package com.google.android.material.progressindicator;

import android.animation.Animator;
import com.google.android.material.progressindicator.e;
import java.util.ArrayList;
import java.util.List;

/* compiled from: IndeterminateAnimatorDelegate.java */
/* loaded from: classes2.dex */
abstract class f<T extends Animator> {

    /* renamed from: a, reason: collision with root package name */
    protected g f36950a;

    /* renamed from: b, reason: collision with root package name */
    protected final List<e.a> f36951b = new ArrayList();

    protected f(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            this.f36951b.add(new e.a());
        }
    }

    abstract void a();

    protected float b(int i10, int i11, int i12) {
        return (i10 - i11) / i12;
    }

    public abstract void c();

    public abstract void d(androidx.vectordrawable.graphics.drawable.b bVar);

    protected void e(g gVar) {
        this.f36950a = gVar;
    }

    abstract void f();

    abstract void g();

    public abstract void h();
}
