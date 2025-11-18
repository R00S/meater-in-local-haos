package Xb;

import cc.C2379j;
import kotlin.Metadata;
import oa.C4172q;
import oa.C4173r;
import ta.InterfaceC4588d;

/* compiled from: DebugStrings.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0007\u001a\u00020\u0001*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0018\u0010\t\u001a\u00020\u0001*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"Lta/d;", "", "c", "(Lta/d;)Ljava/lang/String;", "", "b", "(Ljava/lang/Object;)Ljava/lang/String;", "hexAddress", "a", "classSimpleName", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class M {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(InterfaceC4588d<?> interfaceC4588d) {
        Object objA;
        if (interfaceC4588d instanceof C2379j) {
            return interfaceC4588d.toString();
        }
        try {
            C4172q.Companion aVar = C4172q.INSTANCE;
            objA = C4172q.a(interfaceC4588d + '@' + b(interfaceC4588d));
        } catch (Throwable th) {
            C4172q.Companion aVar2 = C4172q.INSTANCE;
            objA = C4172q.a(C4173r.a(th));
        }
        if (C4172q.b(objA) != null) {
            objA = interfaceC4588d.getClass().getName() + '@' + b(interfaceC4588d);
        }
        return (String) objA;
    }
}
