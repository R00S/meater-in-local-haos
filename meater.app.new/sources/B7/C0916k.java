package B7;

import A7.AbstractC0851e;
import A7.InterfaceC0849c;
import android.os.Parcel;
import android.os.Parcelable;
import g7.C3443n;
import g7.C3445p;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: B7.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0916k extends AbstractC3492a implements InterfaceC0849c, AbstractC0851e.a {
    public static final Parcelable.Creator<C0916k> CREATOR = new C0919l();

    /* renamed from: B, reason: collision with root package name */
    private final String f1843B;

    /* renamed from: C, reason: collision with root package name */
    private final String f1844C;

    /* renamed from: D, reason: collision with root package name */
    private final String f1845D;

    public C0916k(String str, String str2, String str3) {
        this.f1843B = (String) C3445p.k(str);
        this.f1844C = (String) C3445p.k(str2);
        this.f1845D = (String) C3445p.k(str3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0916k)) {
            return false;
        }
        C0916k c0916k = (C0916k) obj;
        return this.f1843B.equals(c0916k.f1843B) && C3443n.a(c0916k.f1844C, this.f1844C) && C3443n.a(c0916k.f1845D, this.f1845D);
    }

    public final int hashCode() {
        return this.f1843B.hashCode();
    }

    public final String toString() {
        int i10 = 0;
        for (char c10 : this.f1843B.toCharArray()) {
            i10 += c10;
        }
        String strTrim = this.f1843B.trim();
        int length = strTrim.length();
        if (length > 25) {
            strTrim = strTrim.substring(0, 10) + "..." + strTrim.substring(length - 10, length) + "::" + i10;
        }
        return "Channel{token=" + strTrim + ", nodeId=" + this.f1844C + ", path=" + this.f1845D + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f1843B;
        int iA = C3493b.a(parcel);
        C3493b.q(parcel, 2, str, false);
        C3493b.q(parcel, 3, this.f1844C, false);
        C3493b.q(parcel, 4, this.f1845D, false);
        C3493b.b(parcel, iA);
    }
}
