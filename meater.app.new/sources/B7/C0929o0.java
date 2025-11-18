package B7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: B7.o0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0929o0 extends AbstractC3492a {
    public static final Parcelable.Creator<C0929o0> CREATOR = new C0932p0();

    /* renamed from: B, reason: collision with root package name */
    public final int f1857B;

    /* renamed from: C, reason: collision with root package name */
    public final String f1858C;

    public C0929o0(int i10, String str) {
        this.f1857B = i10;
        this.f1858C = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f1857B;
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 2, i11);
        C3493b.q(parcel, 3, this.f1858C, false);
        C3493b.b(parcel, iA);
    }
}
