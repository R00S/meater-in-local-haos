package z8;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import r8.v;
import r8.w;
import r8.x;

/* compiled from: ChunkedMacWrapper.java */
/* loaded from: classes2.dex */
public class h implements w<g, g> {

    /* renamed from: a, reason: collision with root package name */
    private static final h f53874a = new h();

    /* compiled from: ChunkedMacWrapper.java */
    private static class b implements g {

        /* renamed from: a, reason: collision with root package name */
        private final v<g> f53875a;

        private b(v<g> vVar) {
            this.f53875a = vVar;
        }
    }

    private h() {
    }

    static void d() {
        x.n(f53874a);
    }

    @Override // r8.w
    public Class<g> a() {
        return g.class;
    }

    @Override // r8.w
    public Class<g> b() {
        return g.class;
    }

    @Override // r8.w
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public g c(v<g> vVar) throws GeneralSecurityException {
        if (vVar == null) {
            throw new GeneralSecurityException("primitive set must be non-null");
        }
        if (vVar.e() == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator<List<v.c<g>>> it = vVar.c().iterator();
        while (it.hasNext()) {
            Iterator<v.c<g>> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().a();
            }
        }
        return new b(vVar);
    }
}
