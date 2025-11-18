package B7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class S extends AbstractC3492a {
    public static final Parcelable.Creator<S> CREATOR = new T();

    /* renamed from: B, reason: collision with root package name */
    public final int f1787B;

    /* renamed from: C, reason: collision with root package name */
    public final C0892c f1788C;

    public S(int i10, C0892c c0892c) {
        this.f1787B = i10;
        this.f1788C = c0892c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f1787B;
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 2, i11);
        C3493b.p(parcel, 3, this.f1788C, i10, false);
        C3493b.b(parcel, iA);
    }
}
