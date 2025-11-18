package Ob;

import java.util.Iterator;
import kotlin.jvm.internal.C3862t;

/* compiled from: ArrayMapOwner.kt */
/* renamed from: Ob.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1584a<K, V> implements Iterable<V>, Ca.a {

    /* compiled from: ArrayMapOwner.kt */
    /* renamed from: Ob.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0203a<K, V, T extends V> {

        /* renamed from: a, reason: collision with root package name */
        private final int f13523a;

        public AbstractC0203a(int i10) {
            this.f13523a = i10;
        }

        protected final T c(AbstractC1584a<K, V> thisRef) {
            C3862t.g(thisRef, "thisRef");
            return thisRef.c().get(this.f13523a);
        }
    }

    protected abstract c<V> c();

    protected abstract z<K, V> h();

    protected final void i(Ia.d<? extends K> tClass, V value) {
        C3862t.g(tClass, "tClass");
        C3862t.g(value, "value");
        String strQ = tClass.q();
        C3862t.d(strQ);
        j(strQ, value);
    }

    public final boolean isEmpty() {
        return c().c() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<V> iterator() {
        return c().iterator();
    }

    protected abstract void j(String str, V v10);
}
