package I6;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import r1.C4341h;
import r1.InterfaceC4339f;

/* compiled from: FactoryPools.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final g<Object> f6703a = new C0133a();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FactoryPools.java */
    class b<T> implements d<List<T>> {
        b() {
        }

        @Override // I6.a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<T> a() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FactoryPools.java */
    class c<T> implements g<List<T>> {
        c() {
        }

        @Override // I6.a.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(List<T> list) {
            list.clear();
        }
    }

    /* compiled from: FactoryPools.java */
    public interface d<T> {
        T a();
    }

    /* compiled from: FactoryPools.java */
    private static final class e<T> implements InterfaceC4339f<T> {

        /* renamed from: a, reason: collision with root package name */
        private final d<T> f6704a;

        /* renamed from: b, reason: collision with root package name */
        private final g<T> f6705b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC4339f<T> f6706c;

        e(InterfaceC4339f<T> interfaceC4339f, d<T> dVar, g<T> gVar) {
            this.f6706c = interfaceC4339f;
            this.f6704a = dVar;
            this.f6705b = gVar;
        }

        @Override // r1.InterfaceC4339f
        public boolean a(T t10) {
            if (t10 instanceof f) {
                ((f) t10).p().b(true);
            }
            this.f6705b.a(t10);
            return this.f6706c.a(t10);
        }

        @Override // r1.InterfaceC4339f
        public T b() {
            T tB = this.f6706c.b();
            if (tB == null) {
                tB = this.f6704a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + tB.getClass());
                }
            }
            if (tB instanceof f) {
                tB.p().b(false);
            }
            return (T) tB;
        }
    }

    /* compiled from: FactoryPools.java */
    public interface f {
        I6.c p();
    }

    /* compiled from: FactoryPools.java */
    public interface g<T> {
        void a(T t10);
    }

    private static <T extends f> InterfaceC4339f<T> a(InterfaceC4339f<T> interfaceC4339f, d<T> dVar) {
        return b(interfaceC4339f, dVar, c());
    }

    private static <T> InterfaceC4339f<T> b(InterfaceC4339f<T> interfaceC4339f, d<T> dVar, g<T> gVar) {
        return new e(interfaceC4339f, dVar, gVar);
    }

    private static <T> g<T> c() {
        return (g<T>) f6703a;
    }

    public static <T extends f> InterfaceC4339f<T> d(int i10, d<T> dVar) {
        return a(new C4341h(i10), dVar);
    }

    public static <T> InterfaceC4339f<List<T>> e() {
        return f(20);
    }

    public static <T> InterfaceC4339f<List<T>> f(int i10) {
        return b(new C4341h(i10), new b(), new c());
    }

    /* compiled from: FactoryPools.java */
    /* renamed from: I6.a$a, reason: collision with other inner class name */
    class C0133a implements g<Object> {
        C0133a() {
        }

        @Override // I6.a.g
        public void a(Object obj) {
        }
    }
}
