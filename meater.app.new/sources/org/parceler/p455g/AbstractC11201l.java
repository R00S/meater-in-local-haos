package org.parceler.p455g;

import android.os.Parcel;
import android.util.SparseArray;
import org.parceler.InterfaceC11189f;

/* compiled from: SparseArrayParcelConverter.java */
/* renamed from: org.parceler.g.l */
/* loaded from: classes3.dex */
public abstract class AbstractC11201l<T> implements InterfaceC11189f {
    @Override // org.parceler.InterfaceC11189f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SparseArray<T> mo39880a(Parcel parcel) {
        int i2 = parcel.readInt();
        if (i2 < 0) {
            return null;
        }
        SparseArray<T> sparseArray = new SparseArray<>(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            sparseArray.append(parcel.readInt(), mo39820d(parcel));
        }
        return sparseArray;
    }

    /* renamed from: d */
    public abstract T mo39820d(Parcel parcel);

    /* renamed from: e */
    public abstract void mo39821e(T t, Parcel parcel);

    @Override // org.parceler.InterfaceC11189f
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo39881b(SparseArray<T> sparseArray, Parcel parcel) {
        if (sparseArray == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(sparseArray.size());
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            mo39821e(sparseArray.valueAt(i2), parcel);
        }
    }
}
