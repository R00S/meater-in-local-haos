package B7;

import A7.InterfaceC0869x;
import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class H1 extends AbstractC3492a implements InterfaceC0869x {
    public static final Parcelable.Creator<H1> CREATOR = new O1();

    /* renamed from: B, reason: collision with root package name */
    private final byte f1729B;

    /* renamed from: C, reason: collision with root package name */
    private final byte f1730C;

    /* renamed from: D, reason: collision with root package name */
    private final String f1731D;

    public H1(byte b10, byte b11, String str) {
        this.f1729B = b10;
        this.f1730C = b11;
        this.f1731D = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || H1.class != obj.getClass()) {
            return false;
        }
        H1 h12 = (H1) obj;
        return this.f1729B == h12.f1729B && this.f1730C == h12.f1730C && this.f1731D.equals(h12.f1731D);
    }

    public final int hashCode() {
        return ((((this.f1729B + 31) * 31) + this.f1730C) * 31) + this.f1731D.hashCode();
    }

    public final String toString() {
        return "AmsEntityUpdateParcelable{, mEntityId=" + ((int) this.f1729B) + ", mAttributeId=" + ((int) this.f1730C) + ", mValue='" + this.f1731D + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C3493b.a(parcel);
        C3493b.f(parcel, 2, this.f1729B);
        C3493b.f(parcel, 3, this.f1730C);
        C3493b.q(parcel, 4, this.f1731D, false);
        C3493b.b(parcel, iA);
    }
}
