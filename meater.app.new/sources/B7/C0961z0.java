package B7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: B7.z0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0961z0 extends AbstractC3492a {
    public static final Parcelable.Creator<C0961z0> CREATOR = new A0();

    /* renamed from: B, reason: collision with root package name */
    public final int f1894B;

    /* renamed from: C, reason: collision with root package name */
    public final String f1895C;

    public C0961z0(int i10, String str) {
        this.f1894B = i10;
        this.f1895C = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f1894B;
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 2, i11);
        C3493b.q(parcel, 3, this.f1895C, false);
        C3493b.b(parcel, iA);
    }
}
