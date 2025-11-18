package B7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class P1 extends AbstractC3492a implements A7.F {
    public static final Parcelable.Creator<P1> CREATOR = new Q1();

    /* renamed from: B, reason: collision with root package name */
    private final int f1765B;

    /* renamed from: C, reason: collision with root package name */
    private final String f1766C;

    /* renamed from: D, reason: collision with root package name */
    private final String f1767D;

    /* renamed from: E, reason: collision with root package name */
    private final String f1768E;

    /* renamed from: F, reason: collision with root package name */
    private final String f1769F;

    /* renamed from: G, reason: collision with root package name */
    private final String f1770G;

    /* renamed from: H, reason: collision with root package name */
    private final String f1771H;

    /* renamed from: I, reason: collision with root package name */
    private final byte f1772I;

    /* renamed from: J, reason: collision with root package name */
    private final byte f1773J;

    /* renamed from: K, reason: collision with root package name */
    private final byte f1774K;

    /* renamed from: L, reason: collision with root package name */
    private final byte f1775L;

    /* renamed from: M, reason: collision with root package name */
    private final String f1776M;

    public P1(int i10, String str, String str2, String str3, String str4, String str5, String str6, byte b10, byte b11, byte b12, byte b13, String str7) {
        this.f1765B = i10;
        this.f1766C = str;
        this.f1767D = str2;
        this.f1768E = str3;
        this.f1769F = str4;
        this.f1770G = str5;
        this.f1771H = str6;
        this.f1772I = b10;
        this.f1773J = b11;
        this.f1774K = b12;
        this.f1775L = b13;
        this.f1776M = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || P1.class != obj.getClass()) {
            return false;
        }
        P1 p12 = (P1) obj;
        if (this.f1765B != p12.f1765B || this.f1772I != p12.f1772I || this.f1773J != p12.f1773J || this.f1774K != p12.f1774K || this.f1775L != p12.f1775L || !this.f1766C.equals(p12.f1766C)) {
            return false;
        }
        String str = this.f1767D;
        if (str == null ? p12.f1767D != null : !str.equals(p12.f1767D)) {
            return false;
        }
        if (!this.f1768E.equals(p12.f1768E) || !this.f1769F.equals(p12.f1769F) || !this.f1770G.equals(p12.f1770G)) {
            return false;
        }
        String str2 = this.f1771H;
        if (str2 == null ? p12.f1771H != null : !str2.equals(p12.f1771H)) {
            return false;
        }
        String str3 = this.f1776M;
        return str3 != null ? str3.equals(p12.f1776M) : p12.f1776M == null;
    }

    public final int hashCode() {
        int iHashCode = ((this.f1765B + 31) * 31) + this.f1766C.hashCode();
        String str = this.f1767D;
        int iHashCode2 = ((((((((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.f1768E.hashCode()) * 31) + this.f1769F.hashCode()) * 31) + this.f1770G.hashCode()) * 31;
        String str2 = this.f1771H;
        int iHashCode3 = (((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f1772I) * 31) + this.f1773J) * 31) + this.f1774K) * 31) + this.f1775L) * 31;
        String str3 = this.f1776M;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "AncsNotificationParcelable{, id=" + this.f1765B + ", appId='" + this.f1766C + "', dateTime='" + this.f1767D + "', eventId=" + ((int) this.f1772I) + ", eventFlags=" + ((int) this.f1773J) + ", categoryId=" + ((int) this.f1774K) + ", categoryCount=" + ((int) this.f1775L) + ", packageName='" + this.f1776M + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 2, this.f1765B);
        C3493b.q(parcel, 3, this.f1766C, false);
        C3493b.q(parcel, 4, this.f1767D, false);
        C3493b.q(parcel, 5, this.f1768E, false);
        C3493b.q(parcel, 6, this.f1769F, false);
        C3493b.q(parcel, 7, this.f1770G, false);
        String str = this.f1771H;
        if (str == null) {
            str = this.f1766C;
        }
        C3493b.q(parcel, 8, str, false);
        C3493b.f(parcel, 9, this.f1772I);
        C3493b.f(parcel, 10, this.f1773J);
        C3493b.f(parcel, 11, this.f1774K);
        C3493b.f(parcel, 12, this.f1775L);
        C3493b.q(parcel, 13, this.f1776M, false);
        C3493b.b(parcel, iA);
    }
}
