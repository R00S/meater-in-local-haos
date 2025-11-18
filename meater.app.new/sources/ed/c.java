package ed;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: ScopeRegistry.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 !2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u001b\u001a\u0012\u0012\b\u0012\u00060\u0017j\u0002`\u0018\u0012\u0004\u0012\u00020\u00190\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR \u0010 \u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0013\u0010\u001d¨\u0006\""}, d2 = {"Led/c;", "", "LUc/a;", "_koin", "<init>", "(LUc/a;)V", "Lbd/a;", "module", "Loa/F;", "c", "(Lbd/a;)V", "", "modules", "d", "(Ljava/util/Set;)V", "a", "LUc/a;", "", "Ldd/a;", "b", "Ljava/util/Set;", "_scopeDefinitions", "", "", "Lorg/koin/core/scope/ScopeID;", "Lfd/a;", "Ljava/util/Map;", "_scopes", "Lfd/a;", "()Lfd/a;", "getRootScope$annotations", "()V", "rootScope", "e", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    private static final dd.c f41015f = dd.b.a("_root_");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Uc.a _koin;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Set<dd.a> _scopeDefinitions;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, fd.a> _scopes;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final fd.a rootScope;

    /* compiled from: ScopeRegistry.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Led/c$a;", "", "<init>", "()V", "Ldd/c;", "rootScopeQualifier", "Ldd/c;", "a", "()Ldd/c;", "getRootScopeQualifier$annotations", "", "ROOT_SCOPE_ID", "Ljava/lang/String;", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ed.c$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final dd.c a() {
            return c.f41015f;
        }

        private Companion() {
        }
    }

    public c(Uc.a _koin) {
        C3862t.g(_koin, "_koin");
        this._koin = _koin;
        kd.a aVar = kd.a.f43922a;
        Set<dd.a> setG = aVar.g();
        this._scopeDefinitions = setG;
        Map<String, fd.a> mapF = aVar.f();
        this._scopes = mapF;
        fd.a aVar2 = new fd.a(f41015f, "_root_", true, _koin);
        this.rootScope = aVar2;
        setG.add(aVar2.getScopeQualifier());
        mapF.put(aVar2.getId(), aVar2);
    }

    private final void c(bd.a module) {
        this._scopeDefinitions.addAll(module.d());
    }

    /* renamed from: b, reason: from getter */
    public final fd.a getRootScope() {
        return this.rootScope;
    }

    public final void d(Set<bd.a> modules) {
        C3862t.g(modules, "modules");
        Iterator<T> it = modules.iterator();
        while (it.hasNext()) {
            c((bd.a) it.next());
        }
    }
}
