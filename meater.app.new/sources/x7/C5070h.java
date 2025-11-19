package x7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import d7.InterfaceC3051e;
import h7.AbstractC3492a;
import h7.C3493b;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* renamed from: x7.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5070h extends AbstractC3492a implements InterfaceC3051e {
    public static final Parcelable.Creator<C5070h> CREATOR = new C5071i();

    /* renamed from: B, reason: collision with root package name */
    private final List f52886B;

    /* renamed from: C, reason: collision with root package name */
    private final String f52887C;

    public C5070h(List list, String str) {
        this.f52886B = list;
        this.f52887C = str;
    }

    @Override // d7.InterfaceC3051e
    public final Status a0() {
        return this.f52887C != null ? Status.f33456G : Status.f33460K;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f52886B;
        int iA = C3493b.a(parcel);
        C3493b.s(parcel, 1, list, false);
        C3493b.q(parcel, 2, this.f52887C, false);
        C3493b.b(parcel, iA);
    }
}
