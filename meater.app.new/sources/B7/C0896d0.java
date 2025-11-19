package B7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: B7.d0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0896d0 extends AbstractC3492a {
    public static final Parcelable.Creator<C0896d0> CREATOR = new C0893c0();

    /* renamed from: B, reason: collision with root package name */
    public final int f1819B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f1820C;

    public C0896d0(int i10, boolean z10) {
        this.f1819B = i10;
        this.f1820C = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f1819B;
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 2, i11);
        C3493b.c(parcel, 3, this.f1820C);
        C3493b.b(parcel, iA);
    }
}
