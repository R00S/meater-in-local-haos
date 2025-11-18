package com.google.firebase;

import K8.n;
import K8.t;
import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.google.android.gms.common.util.o;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import e7.ComponentCallbacks2C3213c;
import g7.C3443n;
import g7.C3445p;
import h9.C3500f;
import j9.InterfaceC3755b;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C4734X;
import n1.p;
import p9.C4247a;
import s.C4391a;

/* compiled from: FirebaseApp.java */
/* loaded from: classes2.dex */
public class f {

    /* renamed from: k, reason: collision with root package name */
    private static final Object f38157k = new Object();

    /* renamed from: l, reason: collision with root package name */
    static final Map<String, f> f38158l = new C4391a();

    /* renamed from: a, reason: collision with root package name */
    private final Context f38159a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38160b;

    /* renamed from: c, reason: collision with root package name */
    private final m f38161c;

    /* renamed from: d, reason: collision with root package name */
    private final K8.n f38162d;

    /* renamed from: g, reason: collision with root package name */
    private final t<C4247a> f38165g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3755b<C3500f> f38166h;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f38163e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f38164f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    private final List<a> f38167i = new CopyOnWriteArrayList();

    /* renamed from: j, reason: collision with root package name */
    private final List<g> f38168j = new CopyOnWriteArrayList();

    /* compiled from: FirebaseApp.java */
    public interface a {
        void a(boolean z10);
    }

    /* compiled from: FirebaseApp.java */
    @TargetApi(14)
    private static class b implements ComponentCallbacks2C3213c.a {

        /* renamed from: a, reason: collision with root package name */
        private static AtomicReference<b> f38169a = new AtomicReference<>();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Context context) {
            if (com.google.android.gms.common.util.l.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f38169a.get() == null) {
                    b bVar = new b();
                    if (C4734X.a(f38169a, null, bVar)) {
                        ComponentCallbacks2C3213c.c(application);
                        ComponentCallbacks2C3213c.b().a(bVar);
                    }
                }
            }
        }

        @Override // e7.ComponentCallbacks2C3213c.a
        public void a(boolean z10) {
            synchronized (f.f38157k) {
                try {
                    Iterator it = new ArrayList(f.f38158l.values()).iterator();
                    while (it.hasNext()) {
                        f fVar = (f) it.next();
                        if (fVar.f38163e.get()) {
                            fVar.y(z10);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: FirebaseApp.java */
    @TargetApi(24)
    private static class c extends BroadcastReceiver {

        /* renamed from: b, reason: collision with root package name */
        private static AtomicReference<c> f38170b = new AtomicReference<>();

        /* renamed from: a, reason: collision with root package name */
        private final Context f38171a;

        public c(Context context) {
            this.f38171a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (f38170b.get() == null) {
                c cVar = new c(context);
                if (C4734X.a(f38170b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f38171a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (f.f38157k) {
                try {
                    Iterator<f> it = f.f38158l.values().iterator();
                    while (it.hasNext()) {
                        it.next().p();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c();
        }
    }

    protected f(final Context context, String str, m mVar) {
        this.f38159a = (Context) C3445p.k(context);
        this.f38160b = C3445p.e(str);
        this.f38161c = (m) C3445p.k(mVar);
        n nVarB = FirebaseInitProvider.b();
        L9.c.b("Firebase");
        L9.c.b("ComponentDiscovery");
        List<InterfaceC3755b<ComponentRegistrar>> listB = K8.f.c(context, ComponentDiscoveryService.class).b();
        L9.c.a();
        L9.c.b("Runtime");
        n.b bVarG = K8.n.m(L8.k.INSTANCE).d(listB).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(K8.c.s(context, Context.class, new Class[0])).b(K8.c.s(this, f.class, new Class[0])).b(K8.c.s(mVar, m.class, new Class[0])).g(new L9.b());
        if (p.a(context) && FirebaseInitProvider.c()) {
            bVarG.b(K8.c.s(nVarB, n.class, new Class[0]));
        }
        K8.n nVarE = bVarG.e();
        this.f38162d = nVarE;
        L9.c.a();
        this.f38165g = new t<>(new InterfaceC3755b() { // from class: com.google.firebase.d
            @Override // j9.InterfaceC3755b
            public final Object get() {
                return this.f38154a.v(context);
            }
        });
        this.f38166h = nVarE.d(C3500f.class);
        g(new a() { // from class: com.google.firebase.e
            @Override // com.google.firebase.f.a
            public final void a(boolean z10) {
                this.f38156a.w(z10);
            }
        });
        L9.c.a();
    }

    private void i() {
        C3445p.o(!this.f38164f.get(), "FirebaseApp was deleted");
    }

    public static f l() {
        f fVar;
        synchronized (f38157k) {
            try {
                fVar = f38158l.get("[DEFAULT]");
                if (fVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + o.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                fVar.f38166h.get().l();
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if (!p.a(this.f38159a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + m());
            c.b(this.f38159a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + m());
        this.f38162d.p(u());
        this.f38166h.get().l();
    }

    public static f q(Context context) {
        synchronized (f38157k) {
            try {
                if (f38158l.containsKey("[DEFAULT]")) {
                    return l();
                }
                m mVarA = m.a(context);
                if (mVarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return r(context, mVarA);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static f r(Context context, m mVar) {
        return s(context, mVar, "[DEFAULT]");
    }

    public static f s(Context context, m mVar, String str) {
        f fVar;
        b.c(context);
        String strX = x(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f38157k) {
            Map<String, f> map = f38158l;
            C3445p.o(!map.containsKey(strX), "FirebaseApp name " + strX + " already exists!");
            C3445p.l(context, "Application context cannot be null.");
            fVar = new f(context, strX, mVar);
            map.put(strX, fVar);
        }
        fVar.p();
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C4247a v(Context context) {
        return new C4247a(context, o(), (g9.c) this.f38162d.a(g9.c.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(boolean z10) {
        if (z10) {
            return;
        }
        this.f38166h.get().l();
    }

    private static String x(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(boolean z10) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator<a> it = this.f38167i.iterator();
        while (it.hasNext()) {
            it.next().a(z10);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f38160b.equals(((f) obj).m());
        }
        return false;
    }

    public void g(a aVar) {
        i();
        if (this.f38163e.get() && ComponentCallbacks2C3213c.b().d()) {
            aVar.a(true);
        }
        this.f38167i.add(aVar);
    }

    public void h(g gVar) {
        i();
        C3445p.k(gVar);
        this.f38168j.add(gVar);
    }

    public int hashCode() {
        return this.f38160b.hashCode();
    }

    public <T> T j(Class<T> cls) {
        i();
        return (T) this.f38162d.a(cls);
    }

    public Context k() {
        i();
        return this.f38159a;
    }

    public String m() {
        i();
        return this.f38160b;
    }

    public m n() {
        i();
        return this.f38161c;
    }

    public String o() {
        return com.google.android.gms.common.util.c.a(m().getBytes(Charset.defaultCharset())) + "+" + com.google.android.gms.common.util.c.a(n().c().getBytes(Charset.defaultCharset()));
    }

    public boolean t() {
        i();
        return this.f38165g.get().b();
    }

    public String toString() {
        return C3443n.c(this).a("name", this.f38160b).a("options", this.f38161c).toString();
    }

    public boolean u() {
        return "[DEFAULT]".equals(m());
    }
}
