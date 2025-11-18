package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.rw */
/* loaded from: classes2.dex */
final class C7132rw extends C7354xw {

    /* renamed from: g */
    private final /* synthetic */ C7021ow f20475g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C7132rw(C7021ow c7021ow) {
        super(c7021ow, null);
        this.f20475g = c7021ow;
    }

    @Override // com.google.android.gms.internal.ads.C7354xw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new C7095qw(this.f20475g, null);
    }

    /* synthetic */ C7132rw(C7021ow c7021ow, C7058pw c7058pw) {
        this(c7021ow);
    }
}
