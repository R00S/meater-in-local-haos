package hd;

import Ba.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: ModuleDSL.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a1\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b*\"\u0010\t\"\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¨\u0006\n"}, d2 = {"", "createdAtStart", "Lkotlin/Function1;", "Lbd/a;", "Loa/F;", "Lorg/koin/dsl/ModuleDeclaration;", "moduleDeclaration", "a", "(ZLBa/l;)Lbd/a;", "ModuleDeclaration", "koin-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {
    public static final bd.a a(boolean z10, l<? super bd.a, C4153F> moduleDeclaration) {
        C3862t.g(moduleDeclaration, "moduleDeclaration");
        bd.a aVar = new bd.a(z10);
        moduleDeclaration.invoke(aVar);
        return aVar;
    }

    public static /* synthetic */ bd.a b(boolean z10, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return a(z10, lVar);
    }
}
