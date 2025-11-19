package B7;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: B7.v0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0949v0 extends AbstractC3492a {
    public static final Parcelable.Creator<C0949v0> CREATOR = new R0();

    /* renamed from: B, reason: collision with root package name */
    public final M0 f1883B;

    /* renamed from: C, reason: collision with root package name */
    public final IntentFilter[] f1884C;

    /* renamed from: D, reason: collision with root package name */
    public final String f1885D;

    /* renamed from: E, reason: collision with root package name */
    public final String f1886E;

    C0949v0(IBinder iBinder, IntentFilter[] intentFilterArr, String str, String str2) {
        M0 k02;
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            k02 = iInterfaceQueryLocalInterface instanceof M0 ? (M0) iInterfaceQueryLocalInterface : new K0(iBinder);
        } else {
            k02 = null;
        }
        this.f1883B = k02;
        this.f1884C = intentFilterArr;
        this.f1885D = str;
        this.f1886E = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        M0 m02 = this.f1883B;
        int iA = C3493b.a(parcel);
        C3493b.j(parcel, 2, m02 == null ? null : m02.asBinder(), false);
        C3493b.t(parcel, 3, this.f1884C, i10, false);
        C3493b.q(parcel, 4, this.f1885D, false);
        C3493b.q(parcel, 5, this.f1886E, false);
        C3493b.b(parcel, iA);
    }

    public C0949v0(L1 l12) {
        this.f1883B = l12;
        this.f1884C = l12.k();
        this.f1885D = l12.g();
        this.f1886E = null;
    }
}
