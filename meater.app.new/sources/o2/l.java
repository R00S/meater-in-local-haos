package o2;

import U1.s;
import X1.C1804a;

/* compiled from: MediaChunk.java */
/* loaded from: classes.dex */
public abstract class l extends AbstractC4103e {

    /* renamed from: j, reason: collision with root package name */
    public final long f46398j;

    public l(androidx.media3.datasource.a aVar, a2.g gVar, s sVar, int i10, Object obj, long j10, long j11, long j12) {
        super(aVar, gVar, 1, sVar, i10, obj, j10, j11);
        C1804a.e(sVar);
        this.f46398j = j12;
    }

    public long f() {
        long j10 = this.f46398j;
        if (j10 != -1) {
            return 1 + j10;
        }
        return -1L;
    }

    public abstract boolean g();
}
