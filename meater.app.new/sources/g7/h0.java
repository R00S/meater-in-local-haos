package g7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c7.C2335d;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public final class h0 extends AbstractC3492a {
    public static final Parcelable.Creator<h0> CREATOR = new i0();

    /* renamed from: B, reason: collision with root package name */
    Bundle f42056B;

    /* renamed from: C, reason: collision with root package name */
    C2335d[] f42057C;

    /* renamed from: D, reason: collision with root package name */
    int f42058D;

    /* renamed from: E, reason: collision with root package name */
    C3435f f42059E;

    public h0() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C3493b.a(parcel);
        C3493b.e(parcel, 1, this.f42056B, false);
        C3493b.t(parcel, 2, this.f42057C, i10, false);
        C3493b.k(parcel, 3, this.f42058D);
        C3493b.p(parcel, 4, this.f42059E, i10, false);
        C3493b.b(parcel, iA);
    }

    h0(Bundle bundle, C2335d[] c2335dArr, int i10, C3435f c3435f) {
        this.f42056B = bundle;
        this.f42057C = c2335dArr;
        this.f42058D = i10;
        this.f42059E = c3435f;
    }
}
