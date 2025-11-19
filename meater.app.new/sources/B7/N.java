package B7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.AppTheme;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class N extends AbstractC3492a {
    public static final Parcelable.Creator<N> CREATOR = new O();

    /* renamed from: B, reason: collision with root package name */
    public final int f1757B;

    /* renamed from: C, reason: collision with root package name */
    public final AppTheme f1758C;

    public N(int i10, AppTheme appTheme) {
        this.f1757B = i10;
        this.f1758C = appTheme;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f1757B;
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 2, i11);
        C3493b.p(parcel, 3, this.f1758C, i10, false);
        C3493b.b(parcel, iA);
    }
}
