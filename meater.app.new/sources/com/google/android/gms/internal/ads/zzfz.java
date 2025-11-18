package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzfz extends zzfm implements zzfx {
    zzfz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    /* renamed from: N3 */
    public final void mo19954N3(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        parcelM19944H.writeString(str);
        parcelM19944H.writeString(null);
        m19946k0(8, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    /* renamed from: R0 */
    public final void mo19955R0(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        parcelM19944H.writeString(str);
        m19946k0(2, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    /* renamed from: U0 */
    public final void mo19956U0(byte[] bArr) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        parcelM19944H.writeByteArray(bArr);
        m19946k0(5, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    /* renamed from: a1 */
    public final void mo19957a1(int i2) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        parcelM19944H.writeInt(i2);
        m19946k0(7, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    /* renamed from: a3 */
    public final void mo19958a3(int[] iArr) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        parcelM19944H.writeIntArray(null);
        m19946k0(4, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    /* renamed from: b6 */
    public final void mo19959b6() throws RemoteException {
        m19946k0(3, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    /* renamed from: z3 */
    public final void mo19960z3(int i2) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        parcelM19944H.writeInt(i2);
        m19946k0(6, parcelM19944H);
    }
}
