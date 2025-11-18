package ed;

import Zc.d;
import Zc.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;

/* compiled from: InstanceRegistry.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\b2\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0016\u001a\u00020\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00142\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0018\u0010\u0019J9\u0010 \u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001b2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b \u0010!J3\u0010'\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001d2\n\u0010#\u001a\u0006\u0012\u0002\b\u00030\"2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010&\u001a\u00020$H\u0000¢\u0006\u0004\b'\u0010(J=\u0010,\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010)2\b\u0010%\u001a\u0004\u0018\u00010$2\n\u0010#\u001a\u0006\u0012\u0002\b\u00030\"2\u0006\u0010&\u001a\u00020$2\u0006\u0010+\u001a\u00020*H\u0000¢\u0006\u0004\b,\u0010-J\r\u0010/\u001a\u00020.¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u00103R(\u00106\u001a\u0016\u0012\b\u0012\u00060\u001aj\u0002`\u001b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00105R$\u00107\u001a\u0012\u0012\u0004\u0012\u00020.\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00105¨\u00068"}, d2 = {"Led/a;", "", "LUc/a;", "_koin", "<init>", "(LUc/a;)V", "Lbd/a;", "module", "Loa/F;", "a", "(Lbd/a;)V", "", "allowOverride", "d", "(Lbd/a;Z)V", "", "LZc/f;", "instances", "c", "(Ljava/util/Collection;)V", "", "modules", "e", "(Ljava/util/Set;Z)V", "b", "()V", "", "Lorg/koin/core/definition/IndexKey;", "mapping", "LZc/b;", "factory", "logWarning", "h", "(ZLjava/lang/String;LZc/b;Z)V", "LIa/d;", "clazz", "Ldd/a;", "qualifier", "scopeQualifier", "f", "(LIa/d;Ldd/a;Ldd/a;)LZc/b;", "T", "LZc/d;", "instanceContext", "g", "(Ldd/a;LIa/d;Ldd/a;LZc/d;)Ljava/lang/Object;", "", "j", "()I", "LUc/a;", "get_koin", "()LUc/a;", "", "Ljava/util/Map;", "_instances", "eagerInstances", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Uc.a _koin;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Zc.b<?>> _instances;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<Integer, f<?>> eagerInstances;

    public a(Uc.a _koin) {
        C3862t.g(_koin, "_koin");
        this._koin = _koin;
        kd.a aVar = kd.a.f43922a;
        this._instances = aVar.f();
        this.eagerInstances = aVar.f();
    }

    private final void a(bd.a module) {
        for (f<?> fVar : module.a()) {
            this.eagerInstances.put(Integer.valueOf(fVar.c().hashCode()), fVar);
        }
    }

    private final void c(Collection<? extends f<?>> instances) {
        d dVar = new d(this._koin.getLogger(), this._koin.getScopeRegistry().getRootScope(), P.b(Zc.c.class), null, null, 24, null);
        Iterator<T> it = instances.iterator();
        while (it.hasNext()) {
            ((f) it.next()).b(dVar);
        }
    }

    private final void d(bd.a module, boolean allowOverride) {
        for (Map.Entry<String, Zc.b<?>> entry : module.c().entrySet()) {
            i(this, allowOverride, entry.getKey(), entry.getValue(), false, 8, null);
        }
    }

    public static /* synthetic */ void i(a aVar, boolean z10, String str, Zc.b bVar, boolean z11, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        aVar.h(z10, str, bVar, z11);
    }

    public final void b() {
        f[] fVarArr = (f[]) this.eagerInstances.values().toArray(new f[0]);
        ArrayList arrayListG = r.g(Arrays.copyOf(fVarArr, fVarArr.length));
        this.eagerInstances.clear();
        c(arrayListG);
    }

    public final void e(Set<bd.a> modules, boolean allowOverride) {
        C3862t.g(modules, "modules");
        for (bd.a aVar : modules) {
            d(aVar, allowOverride);
            a(aVar);
        }
    }

    public final Zc.b<?> f(Ia.d<?> clazz, dd.a qualifier, dd.a scopeQualifier) {
        String value;
        C3862t.g(clazz, "clazz");
        C3862t.g(scopeQualifier, "scopeQualifier");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(id.a.a(clazz));
        sb2.append(':');
        if (qualifier == null || (value = qualifier.getValue()) == null) {
            value = "";
        }
        sb2.append(value);
        sb2.append(':');
        sb2.append(scopeQualifier);
        String string = sb2.toString();
        C3862t.f(string, "toString(...)");
        return this._instances.get(string);
    }

    public final <T> T g(dd.a qualifier, Ia.d<?> clazz, dd.a scopeQualifier, d instanceContext) {
        C3862t.g(clazz, "clazz");
        C3862t.g(scopeQualifier, "scopeQualifier");
        C3862t.g(instanceContext, "instanceContext");
        Zc.b<?> bVarF = f(clazz, qualifier, scopeQualifier);
        Object objB = bVarF != null ? bVarF.b(instanceContext) : null;
        if (objB == null) {
            return null;
        }
        return (T) objB;
    }

    public final void h(boolean allowOverride, String mapping, Zc.b<?> factory, boolean logWarning) {
        C3862t.g(mapping, "mapping");
        C3862t.g(factory, "factory");
        if (this._instances.get(mapping) != null) {
            if (!allowOverride) {
                bd.b.b(factory, mapping);
            } else if (logWarning) {
                this._koin.getLogger().g("(+) override index '" + mapping + "' -> '" + factory.c() + '\'');
            }
        }
        this._koin.getLogger().a("(+) index '" + mapping + "' -> '" + factory.c() + '\'');
        this._instances.put(mapping, factory);
    }

    public final int j() {
        return this._instances.size();
    }
}
