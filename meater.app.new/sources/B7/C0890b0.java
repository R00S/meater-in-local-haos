package B7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: B7.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0890b0 extends AbstractC3492a {
    public static final Parcelable.Creator<C0890b0> CREATOR = new C0887a0();

    /* renamed from: B, reason: collision with root package name */
    public final int f1811B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f1812C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f1813D;

    public C0890b0(int i10, boolean z10, boolean z11) {
        this.f1811B = i10;
        this.f1812C = z10;
        this.f1813D = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f1811B;
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 2, i11);
        C3493b.c(parcel, 3, this.f1812C);
        C3493b.c(parcel, 4, this.f1813D);
        C3493b.b(parcel, iA);
    }
}
