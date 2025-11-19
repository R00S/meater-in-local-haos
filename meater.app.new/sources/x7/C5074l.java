package x7;

import android.os.Parcel;
import android.os.Parcelable;
import c7.C2333b;
import g7.O;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* renamed from: x7.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5074l extends AbstractC3492a {
    public static final Parcelable.Creator<C5074l> CREATOR = new C5075m();

    /* renamed from: B, reason: collision with root package name */
    final int f52890B;

    /* renamed from: C, reason: collision with root package name */
    private final C2333b f52891C;

    /* renamed from: D, reason: collision with root package name */
    private final O f52892D;

    C5074l(int i10, C2333b c2333b, O o10) {
        this.f52890B = i10;
        this.f52891C = c2333b;
        this.f52892D = o10;
    }

    public final C2333b f0() {
        return this.f52891C;
    }

    public final O h0() {
        return this.f52892D;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 1, this.f52890B);
        C3493b.p(parcel, 2, this.f52891C, i10, false);
        C3493b.p(parcel, 3, this.f52892D, i10, false);
        C3493b.b(parcel, iA);
    }
}
