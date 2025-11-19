package B7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class Y1 extends AbstractC3492a {
    public static final Parcelable.Creator<Y1> CREATOR = new Z1();

    /* renamed from: B, reason: collision with root package name */
    public final int f1805B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f1806C;

    public Y1(int i10, boolean z10) {
        this.f1805B = i10;
        this.f1806C = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y1)) {
            return false;
        }
        Y1 y12 = (Y1) obj;
        return this.f1805B == y12.f1805B && this.f1806C == y12.f1806C;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f1805B), Boolean.valueOf(this.f1806C));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f1805B;
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 1, i11);
        C3493b.c(parcel, 2, this.f1806C);
        C3493b.b(parcel, iA);
    }
}
