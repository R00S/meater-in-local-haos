package m8;

import java.io.Serializable;

/* compiled from: ImmutableEntry.java */
/* renamed from: m8.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C4008x<K, V> extends AbstractC3990e<K, V> implements Serializable {

    /* renamed from: B, reason: collision with root package name */
    final K f45376B;

    /* renamed from: C, reason: collision with root package name */
    final V f45377C;

    C4008x(K k10, V v10) {
        this.f45376B = k10;
        this.f45377C = v10;
    }

    @Override // m8.AbstractC3990e, java.util.Map.Entry
    public final K getKey() {
        return this.f45376B;
    }

    @Override // m8.AbstractC3990e, java.util.Map.Entry
    public final V getValue() {
        return this.f45377C;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v10) {
        throw new UnsupportedOperationException();
    }
}
