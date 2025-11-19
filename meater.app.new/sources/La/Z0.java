package La;

import Xa.C1822f;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: moduleByClassLoader.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Ljava/lang/Class;", "LWa/k;", "a", "(Ljava/lang/Class;)LWa/k;", "Ljava/util/concurrent/ConcurrentMap;", "LLa/k1;", "Ljava/lang/ref/WeakReference;", "Ljava/util/concurrent/ConcurrentMap;", "moduleByClassLoader", "kotlin-reflection"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Z0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ConcurrentMap<k1, WeakReference<Wa.k>> f11176a = new ConcurrentHashMap();

    public static final Wa.k a(Class<?> cls) {
        C3862t.g(cls, "<this>");
        ClassLoader classLoaderJ = C1822f.j(cls);
        k1 k1Var = new k1(classLoaderJ);
        ConcurrentMap<k1, WeakReference<Wa.k>> concurrentMap = f11176a;
        WeakReference<Wa.k> weakReference = concurrentMap.get(k1Var);
        if (weakReference != null) {
            Wa.k kVar = weakReference.get();
            if (kVar != null) {
                return kVar;
            }
            concurrentMap.remove(k1Var, weakReference);
        }
        Wa.k kVarA = Wa.k.f18489c.a(classLoaderJ);
        while (true) {
            try {
                ConcurrentMap<k1, WeakReference<Wa.k>> concurrentMap2 = f11176a;
                WeakReference<Wa.k> weakReferencePutIfAbsent = concurrentMap2.putIfAbsent(k1Var, new WeakReference<>(kVarA));
                if (weakReferencePutIfAbsent == null) {
                    return kVarA;
                }
                Wa.k kVar2 = weakReferencePutIfAbsent.get();
                if (kVar2 != null) {
                    return kVar2;
                }
                concurrentMap2.remove(k1Var, weakReferencePutIfAbsent);
            } finally {
                k1Var.a(null);
            }
        }
    }
}
