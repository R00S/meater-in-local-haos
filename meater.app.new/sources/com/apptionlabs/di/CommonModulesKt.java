package com.apptionlabs.di;

import Ba.l;
import a6.C1908q;
import bd.a;
import com.apptionlabs.di.CommonModulesKt;
import f4.z;
import hd.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0017\u0010\u0001\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lbd/a;", "common_modules", "Lbd/a;", "getCommon_modules", "()Lbd/a;", "di_playstoreLiveRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CommonModulesKt {
    private static final a common_modules = b.b(false, new l() { // from class: k4.a
        @Override // Ba.l
        public final Object invoke(Object obj) {
            return CommonModulesKt.common_modules$lambda$0((bd.a) obj);
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F common_modules$lambda$0(a module) {
        C3862t.g(module, "$this$module");
        module.f(z.E(), C1908q.t());
        return C4153F.f46609a;
    }

    public static final a getCommon_modules() {
        return common_modules;
    }
}
