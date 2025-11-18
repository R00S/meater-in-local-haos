package com.google.android.gms.internal.wearable;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: com.google.android.gms.internal.wearable.e1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2652e1 implements Iterator {

    /* renamed from: B, reason: collision with root package name */
    private int f34564B = -1;

    /* renamed from: C, reason: collision with root package name */
    private boolean f34565C;

    /* renamed from: D, reason: collision with root package name */
    private Iterator f34566D;

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ C2661h1 f34567E;

    /* synthetic */ C2652e1(C2661h1 c2661h1, C2658g1 c2658g1) {
        this.f34567E = c2661h1;
    }

    private final Iterator b() {
        if (this.f34566D == null) {
            this.f34566D = this.f34567E.f34630D.entrySet().iterator();
        }
        return this.f34566D;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f34564B + 1;
        C2661h1 c2661h1 = this.f34567E;
        if (i10 >= c2661h1.f34629C) {
            return !c2661h1.f34630D.isEmpty() && b().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f34565C = true;
        int i10 = this.f34564B + 1;
        this.f34564B = i10;
        C2661h1 c2661h1 = this.f34567E;
        return i10 < c2661h1.f34629C ? (C2649d1) c2661h1.f34628B[i10] : (Map.Entry) b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f34565C) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f34565C = false;
        this.f34567E.q();
        int i10 = this.f34564B;
        C2661h1 c2661h1 = this.f34567E;
        if (i10 >= c2661h1.f34629C) {
            b().remove();
        } else {
            this.f34564B = i10 - 1;
            c2661h1.o(i10);
        }
    }
}
