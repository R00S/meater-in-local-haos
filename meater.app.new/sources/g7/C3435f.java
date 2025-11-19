package g7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* renamed from: g7.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3435f extends AbstractC3492a {
    public static final Parcelable.Creator<C3435f> CREATOR = new j0();

    /* renamed from: B, reason: collision with root package name */
    private final r f42028B;

    /* renamed from: C, reason: collision with root package name */
    private final boolean f42029C;

    /* renamed from: D, reason: collision with root package name */
    private final boolean f42030D;

    /* renamed from: E, reason: collision with root package name */
    private final int[] f42031E;

    /* renamed from: F, reason: collision with root package name */
    private final int f42032F;

    /* renamed from: G, reason: collision with root package name */
    private final int[] f42033G;

    public C3435f(r rVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f42028B = rVar;
        this.f42029C = z10;
        this.f42030D = z11;
        this.f42031E = iArr;
        this.f42032F = i10;
        this.f42033G = iArr2;
    }

    public boolean G0() {
        return this.f42030D;
    }

    public final r O0() {
        return this.f42028B;
    }

    public int f0() {
        return this.f42032F;
    }

    public int[] h0() {
        return this.f42031E;
    }

    public int[] r0() {
        return this.f42033G;
    }

    public boolean v0() {
        return this.f42029C;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C3493b.a(parcel);
        C3493b.p(parcel, 1, this.f42028B, i10, false);
        C3493b.c(parcel, 2, v0());
        C3493b.c(parcel, 3, G0());
        C3493b.l(parcel, 4, h0(), false);
        C3493b.k(parcel, 5, f0());
        C3493b.l(parcel, 6, r0(), false);
        C3493b.b(parcel, iA);
    }
}
