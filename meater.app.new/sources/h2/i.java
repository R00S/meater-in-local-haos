package h2;

import X1.G;
import android.net.Uri;

/* compiled from: RangedUri.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final long f42262a;

    /* renamed from: b, reason: collision with root package name */
    public final long f42263b;

    /* renamed from: c, reason: collision with root package name */
    private final String f42264c;

    /* renamed from: d, reason: collision with root package name */
    private int f42265d;

    public i(String str, long j10, long j11) {
        this.f42264c = str == null ? "" : str;
        this.f42262a = j10;
        this.f42263b = j11;
    }

    public i a(i iVar, String str) {
        String strC = c(str);
        if (iVar != null && strC.equals(iVar.c(str))) {
            long j10 = this.f42263b;
            if (j10 != -1) {
                long j11 = this.f42262a;
                if (j11 + j10 == iVar.f42262a) {
                    long j12 = iVar.f42263b;
                    return new i(strC, j11, j12 != -1 ? j10 + j12 : -1L);
                }
            }
            long j13 = iVar.f42263b;
            if (j13 != -1) {
                long j14 = iVar.f42262a;
                if (j14 + j13 == this.f42262a) {
                    return new i(strC, j14, j10 != -1 ? j13 + j10 : -1L);
                }
            }
        }
        return null;
    }

    public Uri b(String str) {
        return G.f(str, this.f42264c);
    }

    public String c(String str) {
        return G.e(str, this.f42264c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f42262a == iVar.f42262a && this.f42263b == iVar.f42263b && this.f42264c.equals(iVar.f42264c);
    }

    public int hashCode() {
        if (this.f42265d == 0) {
            this.f42265d = ((((527 + ((int) this.f42262a)) * 31) + ((int) this.f42263b)) * 31) + this.f42264c.hashCode();
        }
        return this.f42265d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f42264c + ", start=" + this.f42262a + ", length=" + this.f42263b + ")";
    }
}
