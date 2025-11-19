package Ob;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.C3862t;

/* compiled from: ArrayMapOwner.kt */
/* loaded from: classes3.dex */
public abstract class z<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, Integer> f13632a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f13633b = new AtomicInteger(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final int f(z zVar, String it) {
        C3862t.g(it, "it");
        return zVar.f13633b.getAndIncrement();
    }

    public abstract int b(ConcurrentHashMap<String, Integer> concurrentHashMap, String str, Ba.l<? super String, Integer> lVar);

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends V, KK extends K> n<K, V, T> c(Ia.d<KK> kClass) {
        C3862t.g(kClass, "kClass");
        return new n<>(d(kClass));
    }

    public final <T extends K> int d(Ia.d<T> kClass) {
        C3862t.g(kClass, "kClass");
        String strQ = kClass.q();
        C3862t.d(strQ);
        return e(strQ);
    }

    public final int e(String keyQualifiedName) {
        C3862t.g(keyQualifiedName, "keyQualifiedName");
        return b(this.f13632a, keyQualifiedName, new y(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Collection<Integer> g() {
        Collection<Integer> collectionValues = this.f13632a.values();
        C3862t.f(collectionValues, "<get-values>(...)");
        return collectionValues;
    }
}
