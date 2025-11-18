package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzia extends AbstractList<String> implements zzfv, RandomAccess {

    /* renamed from: f */
    private final zzfv f28176f;

    public zzia(zzfv zzfvVar) {
        this.f28176f = zzfvVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzfv
    /* renamed from: b */
    public final List<?> mo22310b() {
        return this.f28176f.mo22310b();
    }

    @Override // com.google.android.gms.internal.measurement.zzfv
    /* renamed from: e */
    public final Object mo22311e(int i2) {
        return this.f28176f.mo22311e(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        return (String) this.f28176f.get(i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new C7544l4(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i2) {
        return new C7532j4(this, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzfv
    /* renamed from: n1 */
    public final void mo22312n1(zzdu zzduVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f28176f.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzfv
    /* renamed from: y0 */
    public final zzfv mo22313y0() {
        return this;
    }
}
