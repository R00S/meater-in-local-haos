package B7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: B7.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0942t extends AbstractC3492a {
    public static final Parcelable.Creator<C0942t> CREATOR = new C0945u();

    /* renamed from: B, reason: collision with root package name */
    private final int f1868B;

    /* renamed from: C, reason: collision with root package name */
    private final String f1869C;

    public C0942t(int i10, String str) {
        this.f1868B = i10;
        this.f1869C = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0942t)) {
            return false;
        }
        C0942t c0942t = (C0942t) obj;
        return this.f1868B == c0942t.f1868B && Objects.equals(this.f1869C, c0942t.f1869C);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f1868B), this.f1869C);
    }

    public final String toString() {
        String str;
        int i10 = this.f1868B;
        switch (i10) {
            case -9:
                str = "Migration was cancelled";
                break;
            case -8:
                str = "Another migration is already in progress";
                break;
            case -7:
                str = "Connect message malformed";
                break;
            case -6:
                str = "Migration status mismatch between watch and phone";
                break;
            case -5:
                str = "Phone switching feature disabled";
                break;
            case -4:
                str = "Did not receive connect msg";
                break;
            case -3:
                str = "No bluetooth connection";
                break;
            case -2:
                str = "Accounts mismatch";
                break;
            case -1:
                str = "Unknown failure";
                break;
            case 0:
                str = "Connected";
                break;
            case 1:
                str = "Connection handshake in progress";
                break;
            case 2:
                str = "Connection handshake complete";
                break;
            case 3:
                str = "Sync with old node suspended";
                break;
            case 4:
                str = "Control plane transport connected";
                break;
            case 5:
                str = "Accounts Matched";
                break;
            case 6:
                str = "Association to watch terminated";
                break;
            default:
                str = "Unrecognized state value: " + i10;
                break;
        }
        return String.format("ConnectionStateEvent: address: %s, state: %s", this.f1869C, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f1868B;
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 1, i11);
        C3493b.q(parcel, 2, this.f1869C, false);
        C3493b.b(parcel, iA);
    }
}
