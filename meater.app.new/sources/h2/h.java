package h2;

import X1.L;

/* compiled from: ProgramInformation.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f42257a;

    /* renamed from: b, reason: collision with root package name */
    public final String f42258b;

    /* renamed from: c, reason: collision with root package name */
    public final String f42259c;

    /* renamed from: d, reason: collision with root package name */
    public final String f42260d;

    /* renamed from: e, reason: collision with root package name */
    public final String f42261e;

    public h(String str, String str2, String str3, String str4, String str5) {
        this.f42257a = str;
        this.f42258b = str2;
        this.f42259c = str3;
        this.f42260d = str4;
        this.f42261e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.d(this.f42257a, hVar.f42257a) && L.d(this.f42258b, hVar.f42258b) && L.d(this.f42259c, hVar.f42259c) && L.d(this.f42260d, hVar.f42260d) && L.d(this.f42261e, hVar.f42261e);
    }

    public int hashCode() {
        String str = this.f42257a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f42258b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f42259c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f42260d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f42261e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
