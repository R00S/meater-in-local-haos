package B7;

import A7.InterfaceC0850d;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: B7.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0910i extends AbstractC3492a {
    public static final Parcelable.Creator<C0910i> CREATOR = new C0913j();

    /* renamed from: B, reason: collision with root package name */
    final C0916k f1835B;

    /* renamed from: C, reason: collision with root package name */
    final int f1836C;

    /* renamed from: D, reason: collision with root package name */
    final int f1837D;

    /* renamed from: E, reason: collision with root package name */
    final int f1838E;

    public C0910i(C0916k c0916k, int i10, int i11, int i12) {
        this.f1835B = c0916k;
        this.f1836C = i10;
        this.f1837D = i11;
        this.f1838E = i12;
    }

    public final void f0(InterfaceC0850d.a aVar) {
        int i10 = this.f1836C;
        if (i10 == 1) {
            aVar.b(this.f1835B);
            return;
        }
        if (i10 == 2) {
            aVar.d(this.f1835B, this.f1837D, this.f1838E);
            return;
        }
        if (i10 == 3) {
            aVar.a(this.f1835B, this.f1837D, this.f1838E);
            return;
        }
        if (i10 == 4) {
            aVar.e(this.f1835B, this.f1837D, this.f1838E);
            return;
        }
        Log.w("ChannelEventParcelable", "Unknown type: " + i10);
    }

    public final String toString() {
        int i10 = this.f1836C;
        String strValueOf = String.valueOf(this.f1835B);
        String string = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? Integer.toString(i10) : "OUTPUT_CLOSED" : "INPUT_CLOSED" : "CHANNEL_CLOSED" : "CHANNEL_OPENED";
        int i11 = this.f1837D;
        return "ChannelEventParcelable[, channel=" + strValueOf + ", type=" + string + ", closeReason=" + (i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? Integer.toString(i11) : "CLOSE_REASON_LOCAL_CLOSE" : "CLOSE_REASON_REMOTE_CLOSE" : "CLOSE_REASON_DISCONNECTED" : "CLOSE_REASON_NORMAL") + ", appErrorCode=" + this.f1838E + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C0916k c0916k = this.f1835B;
        int iA = C3493b.a(parcel);
        C3493b.p(parcel, 2, c0916k, i10, false);
        C3493b.k(parcel, 3, this.f1836C);
        C3493b.k(parcel, 4, this.f1837D);
        C3493b.k(parcel, 5, this.f1838E);
        C3493b.b(parcel, iA);
    }
}
