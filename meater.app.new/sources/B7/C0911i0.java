package B7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: B7.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0911i0 extends AbstractC3492a {
    public static final Parcelable.Creator<C0911i0> CREATOR = new C0914j0();

    /* renamed from: B, reason: collision with root package name */
    public final int f1839B;

    /* renamed from: C, reason: collision with root package name */
    public final ConnectionConfiguration[] f1840C;

    public C0911i0(int i10, ConnectionConfiguration[] connectionConfigurationArr) {
        this.f1839B = i10;
        this.f1840C = connectionConfigurationArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f1839B;
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 2, i11);
        C3493b.t(parcel, 3, this.f1840C, i10, false);
        C3493b.b(parcel, iA);
    }
}
