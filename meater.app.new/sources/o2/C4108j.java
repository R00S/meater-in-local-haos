package o2;

import U1.s;
import U1.z;
import X1.y;
import o2.InterfaceC4104f;
import v2.C4803i;
import v2.O;

/* compiled from: ContainerMediaChunk.java */
/* renamed from: o2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4108j extends AbstractC4099a {

    /* renamed from: o, reason: collision with root package name */
    private final int f46387o;

    /* renamed from: p, reason: collision with root package name */
    private final long f46388p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC4104f f46389q;

    /* renamed from: r, reason: collision with root package name */
    private long f46390r;

    /* renamed from: s, reason: collision with root package name */
    private volatile boolean f46391s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f46392t;

    public C4108j(androidx.media3.datasource.a aVar, a2.g gVar, s sVar, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, InterfaceC4104f interfaceC4104f) {
        super(aVar, gVar, sVar, i10, obj, j10, j11, j12, j13, j14);
        this.f46387o = i11;
        this.f46388p = j15;
        this.f46389q = interfaceC4104f;
    }

    private void l(C4101c c4101c) {
        if (z.p(this.f46349d.f17161n)) {
            s sVar = this.f46349d;
            int i10 = sVar.f17144K;
            if ((i10 <= 1 && sVar.f17145L <= 1) || i10 == -1 || sVar.f17145L == -1) {
                return;
            }
            O oA = c4101c.a(0, 4);
            s sVar2 = this.f46349d;
            int i11 = sVar2.f17145L * sVar2.f17144K;
            long j10 = (this.f46353h - this.f46352g) / i11;
            for (int i12 = 1; i12 < i11; i12++) {
                oA.d(new y(), 0);
                oA.e(i12 * j10, 0, 0, 0, null);
            }
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.e
    public final void a() {
        C4101c c4101cI = i();
        if (this.f46390r == 0) {
            c4101cI.c(this.f46388p);
            InterfaceC4104f interfaceC4104f = this.f46389q;
            InterfaceC4104f.b bVarK = k(c4101cI);
            long j10 = this.f46316k;
            long j11 = j10 == -9223372036854775807L ? -9223372036854775807L : j10 - this.f46388p;
            long j12 = this.f46317l;
            interfaceC4104f.e(bVarK, j11, j12 == -9223372036854775807L ? -9223372036854775807L : j12 - this.f46388p);
        }
        try {
            a2.g gVarE = this.f46347b.e(this.f46390r);
            a2.l lVar = this.f46354i;
            C4803i c4803i = new C4803i(lVar, gVarE.f19989g, lVar.c(gVarE));
            do {
                try {
                    if (this.f46391s) {
                        break;
                    }
                } finally {
                    this.f46390r = c4803i.getPosition() - this.f46347b.f19989g;
                }
            } while (this.f46389q.d(c4803i));
            l(c4101cI);
            this.f46390r = c4803i.getPosition() - this.f46347b.f19989g;
            a2.f.a(this.f46354i);
            this.f46392t = !this.f46391s;
        } catch (Throwable th) {
            a2.f.a(this.f46354i);
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.e
    public final void b() {
        this.f46391s = true;
    }

    @Override // o2.l
    public long f() {
        return this.f46398j + this.f46387o;
    }

    @Override // o2.l
    public boolean g() {
        return this.f46392t;
    }

    protected InterfaceC4104f.b k(C4101c c4101c) {
        return c4101c;
    }
}
