package org.parceler.p455g;

import android.os.Parcel;
import java.util.Map;
import org.parceler.InterfaceC11189f;

/* compiled from: MapParcelConverter.java */
/* renamed from: org.parceler.g.j */
/* loaded from: classes3.dex */
public abstract class AbstractC11199j<K, V, M extends Map<K, V>> implements InterfaceC11189f<Map<K, V>, M> {
    /* renamed from: c */
    public abstract M mo39890c();

    @Override // org.parceler.InterfaceC11189f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public M mo39880a(Parcel parcel) {
        int i2 = parcel.readInt();
        if (i2 == -1) {
            return null;
        }
        M m = (M) mo39890c();
        for (int i3 = 0; i3 < i2; i3++) {
            m.put(mo39797e(parcel), mo39799g(parcel));
        }
        return m;
    }

    /* renamed from: e */
    public abstract K mo39797e(Parcel parcel);

    /* renamed from: f */
    public abstract void mo39798f(K k2, Parcel parcel);

    /* renamed from: g */
    public abstract V mo39799g(Parcel parcel);

    /* renamed from: h */
    public abstract void mo39800h(V v, Parcel parcel);

    @Override // org.parceler.InterfaceC11189f
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo39881b(Map<K, V> map, Parcel parcel) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            mo39798f(entry.getKey(), parcel);
            mo39800h(entry.getValue(), parcel);
        }
    }
}
