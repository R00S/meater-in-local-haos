package Ka;

import Ia.i;
import Ia.m;
import La.A;
import La.j1;
import Ma.h;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: KCallablesJvm.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\",\u0010\u0007\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"LIa/c;", "", "value", "a", "(LIa/c;)Z", "setAccessible", "(LIa/c;Z)V", "isAccessible", "kotlin-reflection"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {
    public static final boolean a(Ia.c<?> cVar) {
        h<?> hVarT;
        C3862t.g(cVar, "<this>");
        if (cVar instanceof i) {
            m mVar = (m) cVar;
            Field fieldB = c.b(mVar);
            if (!(fieldB != null ? fieldB.isAccessible() : true)) {
                return false;
            }
            Method methodC = c.c(mVar);
            if (!(methodC != null ? methodC.isAccessible() : true)) {
                return false;
            }
            Method methodE = c.e((i) cVar);
            if (!(methodE != null ? methodE.isAccessible() : true)) {
                return false;
            }
        } else if (cVar instanceof m) {
            m mVar2 = (m) cVar;
            Field fieldB2 = c.b(mVar2);
            if (!(fieldB2 != null ? fieldB2.isAccessible() : true)) {
                return false;
            }
            Method methodC2 = c.c(mVar2);
            if (!(methodC2 != null ? methodC2.isAccessible() : true)) {
                return false;
            }
        } else if (cVar instanceof m.b) {
            Field fieldB3 = c.b(((m.b) cVar).c());
            if (!(fieldB3 != null ? fieldB3.isAccessible() : true)) {
                return false;
            }
            Method methodD = c.d((Ia.h) cVar);
            if (!(methodD != null ? methodD.isAccessible() : true)) {
                return false;
            }
        } else if (cVar instanceof i.a) {
            Field fieldB4 = c.b(((i.a) cVar).c());
            if (!(fieldB4 != null ? fieldB4.isAccessible() : true)) {
                return false;
            }
            Method methodD2 = c.d((Ia.h) cVar);
            if (!(methodD2 != null ? methodD2.isAccessible() : true)) {
                return false;
            }
        } else {
            if (!(cVar instanceof Ia.h)) {
                throw new UnsupportedOperationException("Unknown callable: " + cVar + " (" + cVar.getClass() + ')');
            }
            Ia.h hVar = (Ia.h) cVar;
            Method methodD3 = c.d(hVar);
            if (!(methodD3 != null ? methodD3.isAccessible() : true)) {
                return false;
            }
            A<?> aB = j1.b(cVar);
            Object objB = (aB == null || (hVarT = aB.T()) == null) ? null : hVarT.b();
            AccessibleObject accessibleObject = objB instanceof AccessibleObject ? (AccessibleObject) objB : null;
            if (!(accessibleObject != null ? accessibleObject.isAccessible() : true)) {
                return false;
            }
            Constructor constructorA = c.a(hVar);
            if (!(constructorA != null ? constructorA.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }
}
