package B7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class r extends AbstractC3492a {
    public static final Parcelable.Creator<r> CREATOR = new C0939s();

    /* renamed from: B, reason: collision with root package name */
    public final int f1864B;

    public r(int i10) {
        this.f1864B = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f1864B;
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 2, i11);
        C3493b.b(parcel, iA);
    }
}
