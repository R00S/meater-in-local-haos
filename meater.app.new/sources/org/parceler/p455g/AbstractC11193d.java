package org.parceler.p455g;

import android.os.Parcel;
import java.util.Collection;
import java.util.Iterator;
import org.parceler.InterfaceC11189f;

/* compiled from: CollectionParcelConverter.java */
/* renamed from: org.parceler.g.d */
/* loaded from: classes3.dex */
public abstract class AbstractC11193d<T, C extends Collection<T>> implements InterfaceC11189f<Collection<T>, C> {
    /* renamed from: c */
    public abstract C mo39882c();

    @Override // org.parceler.InterfaceC11189f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C mo39880a(Parcel parcel) {
        int i2 = parcel.readInt();
        if (i2 == -1) {
            return null;
        }
        C c2 = (C) mo39882c();
        for (int i3 = 0; i3 < i2; i3++) {
            c2.add(mo39777e(parcel));
        }
        return c2;
    }

    /* renamed from: e */
    public abstract T mo39777e(Parcel parcel);

    /* renamed from: f */
    public abstract void mo39778f(T t, Parcel parcel);

    @Override // org.parceler.InterfaceC11189f
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo39881b(Collection<T> collection, Parcel parcel) {
        if (collection == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            mo39778f(it.next(), parcel);
        }
    }
}
