package org.parceler.p455g;

import android.os.Parcel;
import org.parceler.InterfaceC11189f;

/* compiled from: BooleanArrayParcelConverter.java */
/* renamed from: org.parceler.g.b */
/* loaded from: classes3.dex */
public class C11191b implements InterfaceC11189f {
    @Override // org.parceler.InterfaceC11189f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean[] mo39880a(Parcel parcel) {
        int i2 = parcel.readInt();
        if (i2 == -1) {
            return null;
        }
        boolean[] zArr = new boolean[i2];
        parcel.readBooleanArray(zArr);
        return zArr;
    }

    @Override // org.parceler.InterfaceC11189f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo39881b(boolean[] zArr, Parcel parcel) {
        if (zArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(zArr.length);
            parcel.writeBooleanArray(zArr);
        }
    }
}
