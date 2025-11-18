package c7;

import android.os.Parcel;
import android.os.Parcelable;
import g7.C3443n;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* renamed from: c7.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2335d extends AbstractC3492a {
    public static final Parcelable.Creator<C2335d> CREATOR = new n();

    /* renamed from: B, reason: collision with root package name */
    private final String f31075B;

    /* renamed from: C, reason: collision with root package name */
    @Deprecated
    private final int f31076C;

    /* renamed from: D, reason: collision with root package name */
    private final long f31077D;

    public C2335d(String str, int i10, long j10) {
        this.f31075B = str;
        this.f31076C = i10;
        this.f31077D = j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2335d) {
            C2335d c2335d = (C2335d) obj;
            if (((f0() != null && f0().equals(c2335d.f0())) || (f0() == null && c2335d.f0() == null)) && h0() == c2335d.h0()) {
                return true;
            }
        }
        return false;
    }

    public String f0() {
        return this.f31075B;
    }

    public long h0() {
        long j10 = this.f31077D;
        return j10 == -1 ? this.f31076C : j10;
    }

    public final int hashCode() {
        return C3443n.b(f0(), Long.valueOf(h0()));
    }

    public final String toString() {
        C3443n.a aVarC = C3443n.c(this);
        aVarC.a("name", f0());
        aVarC.a("version", Long.valueOf(h0()));
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C3493b.a(parcel);
        C3493b.q(parcel, 1, f0(), false);
        C3493b.k(parcel, 2, this.f31076C);
        C3493b.n(parcel, 3, h0());
        C3493b.b(parcel, iA);
    }

    public C2335d(String str, long j10) {
        this.f31075B = str;
        this.f31077D = j10;
        this.f31076C = -1;
    }
}
