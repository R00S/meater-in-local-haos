package x7;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import d7.InterfaceC3051e;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* renamed from: x7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5064b extends AbstractC3492a implements InterfaceC3051e {
    public static final Parcelable.Creator<C5064b> CREATOR = new C5065c();

    /* renamed from: B, reason: collision with root package name */
    final int f52883B;

    /* renamed from: C, reason: collision with root package name */
    private int f52884C;

    /* renamed from: D, reason: collision with root package name */
    private Intent f52885D;

    public C5064b() {
        this(2, 0, null);
    }

    @Override // d7.InterfaceC3051e
    public final Status a0() {
        return this.f52884C == 0 ? Status.f33456G : Status.f33460K;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f52883B;
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 1, i11);
        C3493b.k(parcel, 2, this.f52884C);
        C3493b.p(parcel, 3, this.f52885D, i10, false);
        C3493b.b(parcel, iA);
    }

    C5064b(int i10, int i11, Intent intent) {
        this.f52883B = i10;
        this.f52884C = i11;
        this.f52885D = intent;
    }
}
