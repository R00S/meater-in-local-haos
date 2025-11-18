package B7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: B7.w1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0953w1 extends AbstractC3492a {
    public static final Parcelable.Creator<C0953w1> CREATOR = new C0956x1();

    /* renamed from: B, reason: collision with root package name */
    public final int f1887B;

    /* renamed from: C, reason: collision with root package name */
    public final int f1888C;

    public C0953w1(int i10, int i11) {
        this.f1887B = i10;
        this.f1888C = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f1887B;
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 2, i11);
        C3493b.k(parcel, 3, this.f1888C);
        C3493b.b(parcel, iA);
    }
}
