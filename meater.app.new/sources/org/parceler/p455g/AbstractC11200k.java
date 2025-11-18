package org.parceler.p455g;

import android.os.Parcel;
import org.parceler.InterfaceC11189f;

/* compiled from: NullableParcelConverter.java */
/* renamed from: org.parceler.g.k */
/* loaded from: classes3.dex */
public abstract class AbstractC11200k<T> implements InterfaceC11189f {
    @Override // org.parceler.InterfaceC11189f
    /* renamed from: a */
    public T mo39880a(Parcel parcel) {
        if (parcel.readInt() == -1) {
            return null;
        }
        return mo39757c(parcel);
    }

    @Override // org.parceler.InterfaceC11189f
    /* renamed from: b */
    public void mo39881b(T t, Parcel parcel) {
        if (t == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            mo39758d(t, parcel);
        }
    }

    /* renamed from: c */
    public abstract T mo39757c(Parcel parcel);

    /* renamed from: d */
    public abstract void mo39758d(T t, Parcel parcel);
}
