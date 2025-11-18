package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzfw extends AbstractC7523i1<String> implements zzfv, RandomAccess {

    /* renamed from: g */
    private static final zzfw f28161g;

    /* renamed from: h */
    private static final zzfv f28162h;

    /* renamed from: i */
    private final List<Object> f28163i;

    static {
        zzfw zzfwVar = new zzfw();
        f28161g = zzfwVar;
        zzfwVar.mo21144I();
        f28162h = zzfwVar;
    }

    public zzfw() {
        this(10);
    }

    /* renamed from: f */
    private static String m22314f(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zzdu ? ((zzdu) obj).m22156w() : zzff.m22294i((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7523i1, com.google.android.gms.internal.measurement.zzfl
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo21145a() {
        return super.mo21145a();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        m21146c();
        this.f28163i.add(i2, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7523i1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.measurement.zzfv
    /* renamed from: b */
    public final List<?> mo22310b() {
        return Collections.unmodifiableList(this.f28163i);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7523i1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m21146c();
        this.f28163i.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzfl
    /* renamed from: d */
    public final /* synthetic */ zzfl mo20982d(int i2) {
        if (i2 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i2);
        arrayList.addAll(this.f28163i);
        return new zzfw((ArrayList<Object>) arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.zzfv
    /* renamed from: e */
    public final Object mo22311e(int i2) {
        return this.f28163i.get(i2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7523i1, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        Object obj = this.f28163i.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzdu) {
            zzdu zzduVar = (zzdu) obj;
            String strM22156w = zzduVar.m22156w();
            if (zzduVar.mo21415y()) {
                this.f28163i.set(i2, strM22156w);
            }
            return strM22156w;
        }
        byte[] bArr = (byte[]) obj;
        String strM22294i = zzff.m22294i(bArr);
        if (zzff.m22293h(bArr)) {
            this.f28163i.set(i2, strM22294i);
        }
        return strM22294i;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7523i1, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.zzfv
    /* renamed from: n1 */
    public final void mo22312n1(zzdu zzduVar) {
        m21146c();
        this.f28163i.add(zzduVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7523i1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7523i1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7523i1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i2, Object obj) {
        m21146c();
        return m22314f(this.f28163i.set(i2, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f28163i.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzfv
    /* renamed from: y0 */
    public final zzfv mo22313y0() {
        return mo21145a() ? new zzia(this) : this;
    }

    public zzfw(int i2) {
        this((ArrayList<Object>) new ArrayList(i2));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7523i1, java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection<? extends String> collection) {
        m21146c();
        if (collection instanceof zzfv) {
            collection = ((zzfv) collection).mo22310b();
        }
        boolean zAddAll = this.f28163i.addAll(i2, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i2) {
        m21146c();
        Object objRemove = this.f28163i.remove(i2);
        ((AbstractList) this).modCount++;
        return m22314f(objRemove);
    }

    private zzfw(ArrayList<Object> arrayList) {
        this.f28163i = arrayList;
    }
}
