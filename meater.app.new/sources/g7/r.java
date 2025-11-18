package g7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public class r extends AbstractC3492a {
    public static final Parcelable.Creator<r> CREATOR = new a0();

    /* renamed from: B, reason: collision with root package name */
    private final int f42103B;

    /* renamed from: C, reason: collision with root package name */
    private final boolean f42104C;

    /* renamed from: D, reason: collision with root package name */
    private final boolean f42105D;

    /* renamed from: E, reason: collision with root package name */
    private final int f42106E;

    /* renamed from: F, reason: collision with root package name */
    private final int f42107F;

    public r(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f42103B = i10;
        this.f42104C = z10;
        this.f42105D = z11;
        this.f42106E = i11;
        this.f42107F = i12;
    }

    public int G0() {
        return this.f42103B;
    }

    public int f0() {
        return this.f42106E;
    }

    public int h0() {
        return this.f42107F;
    }

    public boolean r0() {
        return this.f42104C;
    }

    public boolean v0() {
        return this.f42105D;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 1, G0());
        C3493b.c(parcel, 2, r0());
        C3493b.c(parcel, 3, v0());
        C3493b.k(parcel, 4, f0());
        C3493b.k(parcel, 5, h0());
        C3493b.b(parcel, iA);
    }
}
