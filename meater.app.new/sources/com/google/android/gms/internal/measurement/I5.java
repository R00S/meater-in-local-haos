package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
final class I5 implements Iterator {

    /* renamed from: B, reason: collision with root package name */
    private int f33785B;

    /* renamed from: C, reason: collision with root package name */
    private Iterator f33786C;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ G5 f33787D;

    private final Iterator b() {
        if (this.f33786C == null) {
            this.f33786C = this.f33787D.f33762G.entrySet().iterator();
        }
        return this.f33786C;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f33785B;
        return (i10 > 0 && i10 <= this.f33787D.f33758C) || b().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (b().hasNext()) {
            return (Map.Entry) b().next();
        }
        Object[] objArr = this.f33787D.f33757B;
        int i10 = this.f33785B - 1;
        this.f33785B = i10;
        return (K5) objArr[i10];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private I5(G5 g52) {
        this.f33787D = g52;
        this.f33785B = g52.f33758C;
    }
}
