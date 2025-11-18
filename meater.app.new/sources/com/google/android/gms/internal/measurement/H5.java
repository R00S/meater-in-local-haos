package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
final class H5 extends M5 {

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ G5 f33773C;

    @Override // com.google.android.gms.internal.measurement.M5, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new I5(this.f33773C);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private H5(G5 g52) {
        super(g52);
        this.f33773C = g52;
    }
}
