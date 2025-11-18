package Ua;

import kotlin.jvm.internal.C3862t;

/* compiled from: PackageViewDescriptorFactory.kt */
/* loaded from: classes3.dex */
public interface I {

    /* renamed from: a, reason: collision with root package name */
    public static final a f17713a = a.f17714a;

    /* compiled from: PackageViewDescriptorFactory.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f17714a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final Ra.G<I> f17715b = new Ra.G<>("PackageViewDescriptorFactory");

        private a() {
        }

        public final Ra.G<I> a() {
            return f17715b;
        }
    }

    /* compiled from: PackageViewDescriptorFactory.kt */
    public static final class b implements I {

        /* renamed from: b, reason: collision with root package name */
        public static final b f17716b = new b();

        private b() {
        }

        @Override // Ua.I
        public Ra.V a(F module, qb.c fqName, Gb.n storageManager) {
            C3862t.g(module, "module");
            C3862t.g(fqName, "fqName");
            C3862t.g(storageManager, "storageManager");
            return new C1784x(module, fqName, storageManager);
        }
    }

    Ra.V a(F f10, qb.c cVar, Gb.n nVar);
}
