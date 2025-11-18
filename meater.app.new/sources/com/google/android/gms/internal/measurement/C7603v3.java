package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.v3 */
/* loaded from: classes2.dex */
final class C7603v3 extends C7484b4 {

    /* renamed from: g */
    private final /* synthetic */ C7597u3 f27914g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C7603v3(C7597u3 c7597u3) {
        super(c7597u3, null);
        this.f27914g = c7597u3;
    }

    @Override // com.google.android.gms.internal.measurement.C7484b4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new C7609w3(this.f27914g, null);
    }

    /* synthetic */ C7603v3(C7597u3 c7597u3, C7591t3 c7591t3) {
        this(c7597u3);
    }
}
