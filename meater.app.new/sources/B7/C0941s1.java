package B7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: B7.s1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0941s1 extends AbstractC3492a {
    public static final Parcelable.Creator<C0941s1> CREATOR = new C0944t1();

    /* renamed from: B, reason: collision with root package name */
    private final String f1867B;

    public C0941s1(String str) {
        this.f1867B = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f1867B;
        int iA = C3493b.a(parcel);
        C3493b.q(parcel, 1, str, false);
        C3493b.b(parcel, iA);
    }
}
