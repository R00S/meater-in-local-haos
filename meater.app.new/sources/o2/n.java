package o2;

import U1.s;
import v2.C4803i;
import v2.O;

/* compiled from: SingleSampleMediaChunk.java */
@Deprecated
/* loaded from: classes.dex */
public final class n extends AbstractC4099a {

    /* renamed from: o, reason: collision with root package name */
    private final int f46400o;

    /* renamed from: p, reason: collision with root package name */
    private final s f46401p;

    /* renamed from: q, reason: collision with root package name */
    private long f46402q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f46403r;

    public n(androidx.media3.datasource.a aVar, a2.g gVar, s sVar, int i10, Object obj, long j10, long j11, long j12, int i11, s sVar2) {
        super(aVar, gVar, sVar, i10, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.f46400o = i11;
        this.f46401p = sVar2;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.e
    public void a() {
        C4101c c4101cI = i();
        c4101cI.c(0L);
        O oA = c4101cI.a(0, this.f46400o);
        oA.f(this.f46401p);
        try {
            long jC = this.f46354i.c(this.f46347b.e(this.f46402q));
            if (jC != -1) {
                jC += this.f46402q;
            }
            C4803i c4803i = new C4803i(this.f46354i, this.f46402q, jC);
            for (int iC = 0; iC != -1; iC = oA.c(c4803i, Integer.MAX_VALUE, true)) {
                this.f46402q += iC;
            }
            oA.e(this.f46352g, 1, (int) this.f46402q, 0, null);
            a2.f.a(this.f46354i);
            this.f46403r = true;
        } catch (Throwable th) {
            a2.f.a(this.f46354i);
            throw th;
        }
    }

    @Override // o2.l
    public boolean g() {
        return this.f46403r;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.e
    public void b() {
    }
}
