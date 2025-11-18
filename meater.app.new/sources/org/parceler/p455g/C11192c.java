package org.parceler.p455g;

import android.os.Parcel;
import org.parceler.InterfaceC11189f;

/* compiled from: CharArrayParcelConverter.java */
/* renamed from: org.parceler.g.c */
/* loaded from: classes3.dex */
public class C11192c implements InterfaceC11189f {
    @Override // org.parceler.InterfaceC11189f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public char[] mo39880a(Parcel parcel) {
        int i2 = parcel.readInt();
        if (i2 == -1) {
            return null;
        }
        char[] cArr = new char[i2];
        parcel.readCharArray(cArr);
        return cArr;
    }

    @Override // org.parceler.InterfaceC11189f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo39881b(char[] cArr, Parcel parcel) {
        if (cArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(cArr.length);
            parcel.writeCharArray(cArr);
        }
    }
}
