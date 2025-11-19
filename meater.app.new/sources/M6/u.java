package M6;

import M6.i;
import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* compiled from: TransportRuntime.java */
/* loaded from: classes2.dex */
public class u implements t {

    /* renamed from: e, reason: collision with root package name */
    private static volatile v f12112e;

    /* renamed from: a, reason: collision with root package name */
    private final W6.a f12113a;

    /* renamed from: b, reason: collision with root package name */
    private final W6.a f12114b;

    /* renamed from: c, reason: collision with root package name */
    private final S6.e f12115c;

    /* renamed from: d, reason: collision with root package name */
    private final T6.r f12116d;

    u(W6.a aVar, W6.a aVar2, S6.e eVar, T6.r rVar, T6.v vVar) {
        this.f12113a = aVar;
        this.f12114b = aVar2;
        this.f12115c = eVar;
        this.f12116d = rVar;
        vVar.c();
    }

    private i b(o oVar) {
        i.a aVarG = i.a().i(this.f12113a.a()).o(this.f12114b.a()).n(oVar.g()).h(new h(oVar.b(), oVar.d())).g(oVar.c().a());
        if (oVar.c().e() != null && oVar.c().e().a() != null) {
            aVarG.l(oVar.c().e().a());
        }
        oVar.c().b();
        return aVarG.d();
    }

    public static u c() {
        v vVar = f12112e;
        if (vVar != null) {
            return vVar.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set<K6.c> d(f fVar) {
        return fVar instanceof g ? Collections.unmodifiableSet(((g) fVar).a()) : Collections.singleton(K6.c.b("proto"));
    }

    public static void f(Context context) {
        if (f12112e == null) {
            synchronized (u.class) {
                try {
                    if (f12112e == null) {
                        f12112e = e.a().f(context).e();
                    }
                } finally {
                }
            }
        }
    }

    @Override // M6.t
    public void a(o oVar, K6.k kVar) {
        this.f12115c.a(oVar.f().f(oVar.c().d()), b(oVar), kVar);
    }

    public T6.r e() {
        return this.f12116d;
    }

    public K6.j g(f fVar) {
        return new q(d(fVar), p.a().b(fVar.getName()).c(fVar.getExtras()).a(), this);
    }
}
