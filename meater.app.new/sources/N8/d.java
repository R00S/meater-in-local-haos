package N8;

import T8.F;
import T8.G;
import j9.InterfaceC3754a;
import j9.InterfaceC3755b;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CrashlyticsNativeComponentDeferredProxy.java */
/* loaded from: classes2.dex */
public final class d implements N8.a {

    /* renamed from: c, reason: collision with root package name */
    private static final h f12569c = new b();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3754a<N8.a> f12570a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference<N8.a> f12571b = new AtomicReference<>(null);

    /* compiled from: CrashlyticsNativeComponentDeferredProxy.java */
    private static final class b implements h {
        private b() {
        }

        @Override // N8.h
        public File a() {
            return null;
        }

        @Override // N8.h
        public File b() {
            return null;
        }

        @Override // N8.h
        public File c() {
            return null;
        }

        @Override // N8.h
        public F.a d() {
            return null;
        }

        @Override // N8.h
        public File e() {
            return null;
        }

        @Override // N8.h
        public File f() {
            return null;
        }

        @Override // N8.h
        public File g() {
            return null;
        }
    }

    public d(InterfaceC3754a<N8.a> interfaceC3754a) {
        this.f12570a = interfaceC3754a;
        interfaceC3754a.a(new InterfaceC3754a.InterfaceC0558a() { // from class: N8.b
            @Override // j9.InterfaceC3754a.InterfaceC0558a
            public final void a(InterfaceC3755b interfaceC3755b) {
                this.f12564a.g(interfaceC3755b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(InterfaceC3755b interfaceC3755b) {
        g.f().b("Crashlytics native component now available.");
        this.f12571b.set((N8.a) interfaceC3755b.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(String str, String str2, long j10, G g10, InterfaceC3755b interfaceC3755b) {
        ((N8.a) interfaceC3755b.get()).d(str, str2, j10, g10);
    }

    @Override // N8.a
    public h a(String str) {
        N8.a aVar = this.f12571b.get();
        return aVar == null ? f12569c : aVar.a(str);
    }

    @Override // N8.a
    public boolean b() {
        N8.a aVar = this.f12571b.get();
        return aVar != null && aVar.b();
    }

    @Override // N8.a
    public boolean c(String str) {
        N8.a aVar = this.f12571b.get();
        return aVar != null && aVar.c(str);
    }

    @Override // N8.a
    public void d(final String str, final String str2, final long j10, final G g10) {
        g.f().i("Deferring native open session: " + str);
        this.f12570a.a(new InterfaceC3754a.InterfaceC0558a() { // from class: N8.c
            @Override // j9.InterfaceC3754a.InterfaceC0558a
            public final void a(InterfaceC3755b interfaceC3755b) {
                d.h(str, str2, j10, g10, interfaceC3755b);
            }
        });
    }
}
