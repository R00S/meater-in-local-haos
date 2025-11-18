package com.google.android.material.bottomsheet;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import s1.C4444l0;
import s1.C4469y0;

/* compiled from: InsetsAnimationCallback.java */
/* loaded from: classes2.dex */
class c extends C4444l0.b {

    /* renamed from: D, reason: collision with root package name */
    private final View f36107D;

    /* renamed from: E, reason: collision with root package name */
    private int f36108E;

    /* renamed from: F, reason: collision with root package name */
    private int f36109F;

    /* renamed from: G, reason: collision with root package name */
    private final int[] f36110G;

    public c(View view) {
        super(0);
        this.f36110G = new int[2];
        this.f36107D = view;
    }

    @Override // s1.C4444l0.b
    public void c(C4444l0 c4444l0) {
        this.f36107D.setTranslationY(0.0f);
    }

    @Override // s1.C4444l0.b
    public void d(C4444l0 c4444l0) {
        this.f36107D.getLocationOnScreen(this.f36110G);
        this.f36108E = this.f36110G[1];
    }

    @Override // s1.C4444l0.b
    public C4469y0 e(C4469y0 c4469y0, List<C4444l0> list) {
        Iterator<C4444l0> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((it.next().c() & C4469y0.l.c()) != 0) {
                this.f36107D.setTranslationY(D7.a.c(this.f36109F, 0, r0.b()));
                break;
            }
        }
        return c4469y0;
    }

    @Override // s1.C4444l0.b
    public C4444l0.a f(C4444l0 c4444l0, C4444l0.a aVar) {
        this.f36107D.getLocationOnScreen(this.f36110G);
        int i10 = this.f36108E - this.f36110G[1];
        this.f36109F = i10;
        this.f36107D.setTranslationY(i10);
        return aVar;
    }
}
