package Uc;

import Vb.h;
import ad.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: KoinApplication.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u0003R\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015¨\u0006\u0017"}, d2 = {"LUc/b;", "", "<init>", "()V", "", "Lbd/a;", "modules", "Loa/F;", "c", "(Ljava/util/List;)V", "d", "(Lbd/a;)LUc/b;", "e", "(Ljava/util/List;)LUc/b;", "a", "LUc/a;", "LUc/a;", "b", "()LUc/a;", "koin", "", "Z", "allowOverride", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a koin;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean allowOverride;

    /* compiled from: KoinApplication.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LUc/b$a;", "", "<init>", "()V", "LUc/b;", "a", "()LUc/b;", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Uc.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final b a() {
            return new b(null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ b(C3854k c3854k) {
        this();
    }

    private final void c(List<bd.a> modules) {
        this.koin.h(modules, this.allowOverride, false);
    }

    public final void a() {
        this.koin.a();
    }

    /* renamed from: b, reason: from getter */
    public final a getKoin() {
        return this.koin;
    }

    public final b d(bd.a modules) {
        C3862t.g(modules, "modules");
        return e(r.e(modules));
    }

    public final b e(List<bd.a> modules) {
        C3862t.g(modules, "modules");
        c logger = this.koin.getLogger();
        ad.b bVar = ad.b.f20457C;
        if (logger.getLevel().compareTo(bVar) <= 0) {
            long jA = h.f18255a.a();
            c(modules);
            long j10 = h.a.j(jA);
            int iJ = this.koin.getInstanceRegistry().j();
            this.koin.getLogger().b(bVar, "Started " + iJ + " definitions in " + gd.a.a(j10) + " ms");
        } else {
            c(modules);
        }
        return this;
    }

    private b() {
        this.koin = new a();
        this.allowOverride = true;
    }
}
