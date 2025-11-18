package o2;

import U1.s;
import o2.InterfaceC4104f;
import v2.C4801g;
import v2.C4803i;

/* compiled from: InitializationChunk.java */
/* loaded from: classes.dex */
public final class k extends AbstractC4103e {

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC4104f f46393j;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC4104f.b f46394k;

    /* renamed from: l, reason: collision with root package name */
    private C4801g f46395l;

    /* renamed from: m, reason: collision with root package name */
    private long f46396m;

    /* renamed from: n, reason: collision with root package name */
    private volatile boolean f46397n;

    public k(androidx.media3.datasource.a aVar, a2.g gVar, s sVar, int i10, Object obj, InterfaceC4104f interfaceC4104f) {
        super(aVar, gVar, 2, sVar, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f46393j = interfaceC4104f;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.e
    public void a() {
        if (this.f46396m == 0) {
            this.f46393j.e(this.f46394k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            a2.g gVarE = this.f46347b.e(this.f46396m);
            a2.l lVar = this.f46354i;
            C4803i c4803i = new C4803i(lVar, gVarE.f19989g, lVar.c(gVarE));
            while (!this.f46397n && this.f46393j.d(c4803i)) {
                try {
                } finally {
                    this.f46396m = c4803i.getPosition() - this.f46347b.f19989g;
                    this.f46395l = this.f46393j.g();
                }
            }
        } finally {
            a2.f.a(this.f46354i);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.e
    public void b() {
        this.f46397n = true;
    }

    public void f(InterfaceC4104f.b bVar) {
        this.f46394k = bVar;
    }
}
