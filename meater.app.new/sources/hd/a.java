package hd;

import Ia.d;
import Xc.KoinDefinition;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;

/* compiled from: DefinitionBinding.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a<\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0087\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "S", "LXc/e;", "LIa/d;", "clazz", "a", "(LXc/e;LIa/d;)LXc/e;", "koin-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {
    public static final <S> KoinDefinition<? extends S> a(KoinDefinition<? extends S> koinDefinition, d<S> clazz) {
        String value;
        C3862t.g(koinDefinition, "<this>");
        C3862t.g(clazz, "clazz");
        koinDefinition.a().c().g(r.G0(koinDefinition.a().c().f(), clazz));
        dd.a qualifier = koinDefinition.a().c().getQualifier();
        dd.a scopeQualifier = koinDefinition.a().c().getScopeQualifier();
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
        koinDefinition.getModule().i(string, koinDefinition.a());
        return koinDefinition;
    }
}
