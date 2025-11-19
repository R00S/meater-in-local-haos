package bd;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C3830k;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import org.koin.core.error.DefinitionOverrideException;

/* compiled from: Module.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u00052\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LZc/b;", "factory", "", "Lorg/koin/core/definition/IndexKey;", "mapping", "Loa/F;", "b", "(LZc/b;Ljava/lang/String;)V", "", "Lbd/a;", "modules", "", "a", "(Ljava/util/List;)Ljava/util/Set;", "koin-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {
    public static final Set<a> a(List<a> modules) {
        C3862t.g(modules, "modules");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C3830k c3830k = new C3830k(r.S(modules));
        while (!c3830k.isEmpty()) {
            a aVar = (a) c3830k.removeLast();
            if (linkedHashSet.add(aVar)) {
                for (a aVar2 : aVar.b()) {
                    if (!linkedHashSet.contains(aVar2)) {
                        c3830k.add(aVar2);
                    }
                }
            }
        }
        return linkedHashSet;
    }

    public static final void b(Zc.b<?> factory, String mapping) {
        C3862t.g(factory, "factory");
        C3862t.g(mapping, "mapping");
        throw new DefinitionOverrideException("Already existing definition for " + factory.c() + " at " + mapping);
    }
}
