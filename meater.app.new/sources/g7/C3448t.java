package g7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* renamed from: g7.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3448t extends AbstractC3492a {
    public static final Parcelable.Creator<C3448t> CREATOR = new C3452x();

    /* renamed from: B, reason: collision with root package name */
    private final int f42116B;

    /* renamed from: C, reason: collision with root package name */
    private List f42117C;

    public C3448t(int i10, List list) {
        this.f42116B = i10;
        this.f42117C = list;
    }

    public final int f0() {
        return this.f42116B;
    }

    public final List h0() {
        return this.f42117C;
    }

    public final void r0(C3442m c3442m) {
        if (this.f42117C == null) {
            this.f42117C = new ArrayList();
        }
        this.f42117C.add(c3442m);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 1, this.f42116B);
        C3493b.u(parcel, 2, this.f42117C, false);
        C3493b.b(parcel, iA);
    }
}
