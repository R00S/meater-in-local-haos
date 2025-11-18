package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import m7.InterfaceC3977a;
import r7.C4356a;
import r7.C4359d;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public final class m extends C4356a implements IInterface {
    m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int k() {
        Parcel parcelC = c(6, g());
        int i10 = parcelC.readInt();
        parcelC.recycle();
        return i10;
    }

    public final int u1(InterfaceC3977a interfaceC3977a, String str, boolean z10) {
        Parcel parcelG = g();
        C4359d.d(parcelG, interfaceC3977a);
        parcelG.writeString(str);
        parcelG.writeInt(z10 ? 1 : 0);
        Parcel parcelC = c(3, parcelG);
        int i10 = parcelC.readInt();
        parcelC.recycle();
        return i10;
    }

    public final int v1(InterfaceC3977a interfaceC3977a, String str, boolean z10) {
        Parcel parcelG = g();
        C4359d.d(parcelG, interfaceC3977a);
        parcelG.writeString(str);
        parcelG.writeInt(z10 ? 1 : 0);
        Parcel parcelC = c(5, parcelG);
        int i10 = parcelC.readInt();
        parcelC.recycle();
        return i10;
    }

    public final InterfaceC3977a w1(InterfaceC3977a interfaceC3977a, String str, int i10) {
        Parcel parcelG = g();
        C4359d.d(parcelG, interfaceC3977a);
        parcelG.writeString(str);
        parcelG.writeInt(i10);
        Parcel parcelC = c(2, parcelG);
        InterfaceC3977a interfaceC3977aG = InterfaceC3977a.AbstractBinderC0607a.g(parcelC.readStrongBinder());
        parcelC.recycle();
        return interfaceC3977aG;
    }

    public final InterfaceC3977a x1(InterfaceC3977a interfaceC3977a, String str, int i10, InterfaceC3977a interfaceC3977a2) {
        Parcel parcelG = g();
        C4359d.d(parcelG, interfaceC3977a);
        parcelG.writeString(str);
        parcelG.writeInt(i10);
        C4359d.d(parcelG, interfaceC3977a2);
        Parcel parcelC = c(8, parcelG);
        InterfaceC3977a interfaceC3977aG = InterfaceC3977a.AbstractBinderC0607a.g(parcelC.readStrongBinder());
        parcelC.recycle();
        return interfaceC3977aG;
    }

    public final InterfaceC3977a y1(InterfaceC3977a interfaceC3977a, String str, int i10) {
        Parcel parcelG = g();
        C4359d.d(parcelG, interfaceC3977a);
        parcelG.writeString(str);
        parcelG.writeInt(i10);
        Parcel parcelC = c(4, parcelG);
        InterfaceC3977a interfaceC3977aG = InterfaceC3977a.AbstractBinderC0607a.g(parcelC.readStrongBinder());
        parcelC.recycle();
        return interfaceC3977aG;
    }

    public final InterfaceC3977a z1(InterfaceC3977a interfaceC3977a, String str, boolean z10, long j10) {
        Parcel parcelG = g();
        C4359d.d(parcelG, interfaceC3977a);
        parcelG.writeString(str);
        parcelG.writeInt(z10 ? 1 : 0);
        parcelG.writeLong(j10);
        Parcel parcelC = c(7, parcelG);
        InterfaceC3977a interfaceC3977aG = InterfaceC3977a.AbstractBinderC0607a.g(parcelC.readStrongBinder());
        parcelC.recycle();
        return interfaceC3977aG;
    }
}
