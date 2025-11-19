package B7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: B7.f1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0903f1 extends AbstractC3492a {
    public static final Parcelable.Creator<C0903f1> CREATOR = new C0900e1();

    /* renamed from: B, reason: collision with root package name */
    public final String f1826B;

    /* renamed from: C, reason: collision with root package name */
    public final DataHolder f1827C;

    public C0903f1(String str, DataHolder dataHolder) {
        this.f1826B = str;
        this.f1827C = dataHolder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f1826B;
        int iA = C3493b.a(parcel);
        C3493b.q(parcel, 1, str, false);
        C3493b.p(parcel, 2, this.f1827C, i10, false);
        C3493b.b(parcel, iA);
    }
}
