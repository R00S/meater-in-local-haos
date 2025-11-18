package B7;

import android.os.Parcel;
import android.os.Parcelable;
import g7.C3443n;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: B7.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0901f extends AbstractC3492a {
    public static final Parcelable.Creator<C0901f> CREATOR = new C0931p();

    /* renamed from: B, reason: collision with root package name */
    private final String f1824B;

    /* renamed from: C, reason: collision with root package name */
    private final boolean f1825C;

    public C0901f(String str, boolean z10) {
        this.f1824B = str;
        this.f1825C = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0901f)) {
            return false;
        }
        C0901f c0901f = (C0901f) obj;
        return this.f1824B.equals(c0901f.f1824B) && this.f1825C == c0901f.f1825C;
    }

    public final int hashCode() {
        return C3443n.b(this.f1824B, Boolean.valueOf(this.f1825C));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f1824B;
        int iA = C3493b.a(parcel);
        C3493b.q(parcel, 1, str, false);
        C3493b.c(parcel, 2, this.f1825C);
        C3493b.b(parcel, iA);
    }
}
