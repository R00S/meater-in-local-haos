package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import m7.InterfaceC3977a;
import r7.C4356a;
import r7.C4359d;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public final class n extends C4356a implements IInterface {
    n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final InterfaceC3977a k(InterfaceC3977a interfaceC3977a, String str, int i10, InterfaceC3977a interfaceC3977a2) {
        Parcel parcelG = g();
        C4359d.d(parcelG, interfaceC3977a);
        parcelG.writeString(str);
        parcelG.writeInt(i10);
        C4359d.d(parcelG, interfaceC3977a2);
        Parcel parcelC = c(2, parcelG);
        InterfaceC3977a interfaceC3977aG = InterfaceC3977a.AbstractBinderC0607a.g(parcelC.readStrongBinder());
        parcelC.recycle();
        return interfaceC3977aG;
    }

    public final InterfaceC3977a u1(InterfaceC3977a interfaceC3977a, String str, int i10, InterfaceC3977a interfaceC3977a2) {
        Parcel parcelG = g();
        C4359d.d(parcelG, interfaceC3977a);
        parcelG.writeString(str);
        parcelG.writeInt(i10);
        C4359d.d(parcelG, interfaceC3977a2);
        Parcel parcelC = c(3, parcelG);
        InterfaceC3977a interfaceC3977aG = InterfaceC3977a.AbstractBinderC0607a.g(parcelC.readStrongBinder());
        parcelC.recycle();
        return interfaceC3977aG;
    }
}
