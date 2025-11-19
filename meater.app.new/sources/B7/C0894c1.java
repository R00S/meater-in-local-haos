package B7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: B7.c1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0894c1 extends AbstractC3492a {
    public static final Parcelable.Creator<C0894c1> CREATOR = new C0962z1();

    /* renamed from: B, reason: collision with root package name */
    public final int f1818B;

    public C0894c1(int i10) {
        this.f1818B = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f1818B;
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 2, i11);
        C3493b.b(parcel, iA);
    }
}
