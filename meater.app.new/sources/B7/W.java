package B7;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class W extends AbstractC3492a {
    public static final Parcelable.Creator<W> CREATOR = new X();

    /* renamed from: B, reason: collision with root package name */
    public final int f1799B;

    /* renamed from: C, reason: collision with root package name */
    public final ParcelFileDescriptor f1800C;

    public W(int i10, ParcelFileDescriptor parcelFileDescriptor) {
        this.f1799B = i10;
        this.f1800C = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f1799B;
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 2, i11);
        C3493b.p(parcel, 3, this.f1800C, i10, false);
        C3493b.b(parcel, iA);
    }
}
