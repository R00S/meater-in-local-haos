package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class zzdos extends AbstractC7388yt<String> implements zzdot, RandomAccess {

    /* renamed from: g */
    private static final zzdos f25796g;

    /* renamed from: h */
    private static final zzdot f25797h;

    /* renamed from: i */
    private final List<Object> f25798i;

    static {
        zzdos zzdosVar = new zzdos();
        f25796g = zzdosVar;
        zzdosVar.mo16108x0();
        f25797h = zzdosVar;
    }

    public zzdos() {
        this(10);
    }

    /* renamed from: f */
    private static String m19765f(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zzdmr ? ((zzdmr) obj).m19604n() : zzdod.m19745f((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzdot
    /* renamed from: H */
    public final zzdot mo19766H() {
        return mo16107m0() ? new zzdqw(this) : this;
    }

    @Override // com.google.android.gms.internal.ads.zzdoj
    /* renamed from: N */
    public final /* synthetic */ zzdoj mo14989N(int i2) {
        if (i2 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i2);
        arrayList.addAll(this.f25798i);
        return new zzdos((ArrayList<Object>) arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        m16106c();
        this.f25798i.add(i2, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7388yt, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7388yt, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m16106c();
        this.f25798i.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7388yt, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        Object obj = this.f25798i.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzdmr) {
            zzdmr zzdmrVar = (zzdmr) obj;
            String strM19604n = zzdmrVar.m19604n();
            if (zzdmrVar.mo15569o()) {
                this.f25798i.set(i2, strM19604n);
            }
            return strM19604n;
        }
        byte[] bArr = (byte[]) obj;
        String strM19745f = zzdod.m19745f(bArr);
        if (zzdod.m19744e(bArr)) {
            this.f25798i.set(i2, strM19745f);
        }
        return strM19745f;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7388yt, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzdot
    /* renamed from: k1 */
    public final Object mo19767k1(int i2) {
        return this.f25798i.get(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzdot
    /* renamed from: m */
    public final List<?> mo19768m() {
        return Collections.unmodifiableList(this.f25798i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7388yt, com.google.android.gms.internal.ads.zzdoj
    /* renamed from: m0 */
    public final /* bridge */ /* synthetic */ boolean mo16107m0() {
        return super.mo16107m0();
    }

    @Override // com.google.android.gms.internal.ads.zzdot
    /* renamed from: q0 */
    public final void mo19769q0(zzdmr zzdmrVar) {
        m16106c();
        this.f25798i.add(zzdmrVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7388yt, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7388yt, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7388yt, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i2, Object obj) {
        m16106c();
        return m19765f(this.f25798i.set(i2, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25798i.size();
    }

    public zzdos(int i2) {
        this((ArrayList<Object>) new ArrayList(i2));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7388yt, java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection<? extends String> collection) {
        m16106c();
        if (collection instanceof zzdot) {
            collection = ((zzdot) collection).mo19768m();
        }
        boolean zAddAll = this.f25798i.addAll(i2, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i2) {
        m16106c();
        Object objRemove = this.f25798i.remove(i2);
        ((AbstractList) this).modCount++;
        return m19765f(objRemove);
    }

    private zzdos(ArrayList<Object> arrayList) {
        this.f25798i = arrayList;
    }
}
