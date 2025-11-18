package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
final class J5 implements Iterator {

    /* renamed from: B, reason: collision with root package name */
    private int f33793B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f33794C;

    /* renamed from: D, reason: collision with root package name */
    private Iterator f33795D;

    /* renamed from: E, reason: collision with root package name */
    private final /* synthetic */ G5 f33796E;

    private final Iterator b() {
        if (this.f33795D == null) {
            this.f33795D = this.f33796E.f33759D.entrySet().iterator();
        }
        return this.f33795D;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33793B + 1 < this.f33796E.f33758C || (!this.f33796E.f33759D.isEmpty() && b().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f33794C = true;
        int i10 = this.f33793B + 1;
        this.f33793B = i10;
        return i10 < this.f33796E.f33758C ? (K5) this.f33796E.f33757B[this.f33793B] : (Map.Entry) b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f33794C) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f33794C = false;
        this.f33796E.u();
        if (this.f33793B >= this.f33796E.f33758C) {
            b().remove();
            return;
        }
        G5 g52 = this.f33796E;
        int i10 = this.f33793B;
        this.f33793B = i10 - 1;
        g52.j(i10);
    }

    private J5(G5 g52) {
        this.f33796E = g52;
        this.f33793B = -1;
    }
}
