package b2;

import java.io.File;

/* compiled from: CacheSpan.java */
/* loaded from: classes.dex */
public class c implements Comparable<c> {

    /* renamed from: B, reason: collision with root package name */
    public final String f30090B;

    /* renamed from: C, reason: collision with root package name */
    public final long f30091C;

    /* renamed from: D, reason: collision with root package name */
    public final long f30092D;

    /* renamed from: E, reason: collision with root package name */
    public final boolean f30093E;

    /* renamed from: F, reason: collision with root package name */
    public final File f30094F;

    /* renamed from: G, reason: collision with root package name */
    public final long f30095G;

    public c(String str, long j10, long j11, long j12, File file) {
        this.f30090B = str;
        this.f30091C = j10;
        this.f30092D = j11;
        this.f30093E = file != null;
        this.f30094F = file;
        this.f30095G = j12;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        if (!this.f30090B.equals(cVar.f30090B)) {
            return this.f30090B.compareTo(cVar.f30090B);
        }
        long j10 = this.f30091C - cVar.f30091C;
        if (j10 == 0) {
            return 0;
        }
        return j10 < 0 ? -1 : 1;
    }

    public boolean j() {
        return !this.f30093E;
    }

    public boolean n() {
        return this.f30092D == -1;
    }

    public String toString() {
        return "[" + this.f30091C + ", " + this.f30092D + "]";
    }
}
