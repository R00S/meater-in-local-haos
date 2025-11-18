package B7;

import A7.InterfaceC0848b;
import A7.InterfaceC0862p;
import android.os.Parcel;
import android.os.Parcelable;
import g7.C3445p;
import h7.AbstractC3492a;
import h7.C3493b;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: B7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0892c extends AbstractC3492a implements InterfaceC0848b {
    public static final Parcelable.Creator<C0892c> CREATOR = new C0895d();

    /* renamed from: C, reason: collision with root package name */
    private final String f1815C;

    /* renamed from: D, reason: collision with root package name */
    private final List f1816D;

    /* renamed from: B, reason: collision with root package name */
    private final Object f1814B = new Object();

    /* renamed from: E, reason: collision with root package name */
    private Set f1817E = null;

    public C0892c(String str, List list) {
        this.f1815C = str;
        this.f1816D = list;
        C3445p.k(str);
        C3445p.k(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0892c.class != obj.getClass()) {
            return false;
        }
        C0892c c0892c = (C0892c) obj;
        String str = this.f1815C;
        if (str == null ? c0892c.f1815C != null : !str.equals(c0892c.f1815C)) {
            return false;
        }
        List list = this.f1816D;
        return list == null ? c0892c.f1816D == null : list.equals(c0892c.f1816D);
    }

    public final int hashCode() {
        String str = this.f1815C;
        int iHashCode = str != null ? str.hashCode() : 0;
        List list = this.f1816D;
        return ((iHashCode + 31) * 31) + (list != null ? list.hashCode() : 0);
    }

    @Override // A7.InterfaceC0848b
    public final Set<InterfaceC0862p> j() {
        Set<InterfaceC0862p> set;
        synchronized (this.f1814B) {
            try {
                if (this.f1817E == null) {
                    this.f1817E = new HashSet(this.f1816D);
                }
                set = this.f1817E;
            } catch (Throwable th) {
                throw th;
            }
        }
        return set;
    }

    public final String toString() {
        return "CapabilityInfo{" + this.f1815C + ", " + String.valueOf(this.f1816D) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f1815C;
        int iA = C3493b.a(parcel);
        C3493b.q(parcel, 2, str, false);
        C3493b.u(parcel, 3, this.f1816D, false);
        C3493b.b(parcel, iA);
    }
}
