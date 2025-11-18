package com.google.firebase.remoteconfig;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.util.d;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import com.google.firebase.f;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.m;
import com.google.firebase.remoteconfig.internal.o;
import com.google.firebase.remoteconfig.internal.p;
import com.google.firebase.remoteconfig.internal.t;
import com.google.firebase.remoteconfig.internal.u;
import com.google.firebase.remoteconfig.internal.x;
import e7.ComponentCallbacks2C3213c;
import j9.InterfaceC3755b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import k9.InterfaceC3810e;
import kotlin.C4734X;
import z7.C5211m;

/* compiled from: RemoteConfigComponent.java */
/* loaded from: classes2.dex */
public class c implements G9.a {

    /* renamed from: j, reason: collision with root package name */
    private static final e f38624j = h.d();

    /* renamed from: k, reason: collision with root package name */
    private static final Random f38625k = new Random();

    /* renamed from: l, reason: collision with root package name */
    private static final Map<String, com.google.firebase.remoteconfig.a> f38626l = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, com.google.firebase.remoteconfig.a> f38627a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f38628b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f38629c;

    /* renamed from: d, reason: collision with root package name */
    private final f f38630d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3810e f38631e;

    /* renamed from: f, reason: collision with root package name */
    private final G8.b f38632f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3755b<I8.a> f38633g;

    /* renamed from: h, reason: collision with root package name */
    private final String f38634h;

    /* renamed from: i, reason: collision with root package name */
    private Map<String, String> f38635i;

    /* compiled from: RemoteConfigComponent.java */
    private static class a implements ComponentCallbacks2C3213c.a {

        /* renamed from: a, reason: collision with root package name */
        private static final AtomicReference<a> f38636a = new AtomicReference<>();

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Context context) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<a> atomicReference = f38636a;
            if (atomicReference.get() == null) {
                a aVar = new a();
                if (C4734X.a(atomicReference, null, aVar)) {
                    ComponentCallbacks2C3213c.c(application);
                    ComponentCallbacks2C3213c.b().a(aVar);
                }
            }
        }

        @Override // e7.ComponentCallbacks2C3213c.a
        public void a(boolean z10) {
            c.r(z10);
        }
    }

    c(Context context, @J8.b ScheduledExecutorService scheduledExecutorService, f fVar, InterfaceC3810e interfaceC3810e, G8.b bVar, InterfaceC3755b<I8.a> interfaceC3755b) {
        this(context, scheduledExecutorService, fVar, interfaceC3810e, bVar, interfaceC3755b, true);
    }

    private com.google.firebase.remoteconfig.internal.f f(String str, String str2) {
        return com.google.firebase.remoteconfig.internal.f.h(this.f38629c, u.c(this.f38628b, String.format("%s_%s_%s_%s.json", "frc", this.f38634h, str, str2)));
    }

    private o j(com.google.firebase.remoteconfig.internal.f fVar, com.google.firebase.remoteconfig.internal.f fVar2) {
        return new o(this.f38629c, fVar, fVar2);
    }

    private static x k(f fVar, String str, InterfaceC3755b<I8.a> interfaceC3755b) {
        if (p(fVar) && str.equals("firebase")) {
            return new x(interfaceC3755b);
        }
        return null;
    }

    private F9.e m(com.google.firebase.remoteconfig.internal.f fVar, com.google.firebase.remoteconfig.internal.f fVar2) {
        return new F9.e(fVar, F9.a.a(fVar, fVar2), this.f38629c);
    }

    static t n(Context context, String str, String str2) {
        return new t(context.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", str, str2, "settings"), 0));
    }

    private static boolean o(f fVar, String str) {
        return str.equals("firebase") && p(fVar);
    }

    private static boolean p(f fVar) {
        return fVar.m().equals("[DEFAULT]");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ I8.a q() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void r(boolean z10) {
        Iterator<com.google.firebase.remoteconfig.a> it = f38626l.values().iterator();
        while (it.hasNext()) {
            it.next().p(z10);
        }
    }

    @Override // G9.a
    public void a(String str, H9.f fVar) {
        e(str).j().h(fVar);
    }

    synchronized com.google.firebase.remoteconfig.a d(f fVar, String str, InterfaceC3810e interfaceC3810e, G8.b bVar, Executor executor, com.google.firebase.remoteconfig.internal.f fVar2, com.google.firebase.remoteconfig.internal.f fVar3, com.google.firebase.remoteconfig.internal.f fVar4, m mVar, o oVar, t tVar, F9.e eVar) {
        try {
            if (!this.f38627a.containsKey(str)) {
                com.google.firebase.remoteconfig.a aVar = new com.google.firebase.remoteconfig.a(this.f38628b, fVar, interfaceC3810e, o(fVar, str) ? bVar : null, executor, fVar2, fVar3, fVar4, mVar, oVar, tVar, l(fVar, interfaceC3810e, mVar, fVar3, this.f38628b, str, tVar), eVar);
                aVar.q();
                this.f38627a.put(str, aVar);
                f38626l.put(str, aVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f38627a.get(str);
    }

    public synchronized com.google.firebase.remoteconfig.a e(String str) {
        com.google.firebase.remoteconfig.internal.f fVarF;
        com.google.firebase.remoteconfig.internal.f fVarF2;
        com.google.firebase.remoteconfig.internal.f fVarF3;
        t tVarN;
        o oVarJ;
        try {
            fVarF = f(str, "fetch");
            fVarF2 = f(str, "activate");
            fVarF3 = f(str, "defaults");
            tVarN = n(this.f38628b, this.f38634h, str);
            oVarJ = j(fVarF2, fVarF3);
            final x xVarK = k(this.f38630d, str, this.f38633g);
            if (xVarK != null) {
                oVarJ.b(new d() { // from class: E9.k
                    @Override // com.google.android.gms.common.util.d
                    public final void a(Object obj, Object obj2) {
                        xVarK.a((String) obj, (com.google.firebase.remoteconfig.internal.g) obj2);
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
        return d(this.f38630d, str, this.f38631e, this.f38632f, this.f38629c, fVarF, fVarF2, fVarF3, h(str, fVarF, tVarN), oVarJ, tVarN, m(fVarF2, fVarF3));
    }

    com.google.firebase.remoteconfig.a g() {
        return e("firebase");
    }

    synchronized m h(String str, com.google.firebase.remoteconfig.internal.f fVar, t tVar) {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return new m(this.f38631e, p(this.f38630d) ? this.f38633g : new InterfaceC3755b() { // from class: E9.l
            @Override // j9.InterfaceC3755b
            public final Object get() {
                return com.google.firebase.remoteconfig.c.q();
            }
        }, this.f38629c, f38624j, f38625k, fVar, i(this.f38630d.n().b(), str, tVar), tVar, this.f38635i);
    }

    ConfigFetchHttpClient i(String str, String str2, t tVar) {
        return new ConfigFetchHttpClient(this.f38628b, this.f38630d.n().c(), str, str2, tVar.c(), tVar.c());
    }

    synchronized p l(f fVar, InterfaceC3810e interfaceC3810e, m mVar, com.google.firebase.remoteconfig.internal.f fVar2, Context context, String str, t tVar) {
        return new p(fVar, interfaceC3810e, mVar, fVar2, context, str, tVar, this.f38629c);
    }

    protected c(Context context, ScheduledExecutorService scheduledExecutorService, f fVar, InterfaceC3810e interfaceC3810e, G8.b bVar, InterfaceC3755b<I8.a> interfaceC3755b, boolean z10) {
        this.f38627a = new HashMap();
        this.f38635i = new HashMap();
        this.f38628b = context;
        this.f38629c = scheduledExecutorService;
        this.f38630d = fVar;
        this.f38631e = interfaceC3810e;
        this.f38632f = bVar;
        this.f38633g = interfaceC3755b;
        this.f38634h = fVar.n().c();
        a.c(context);
        if (z10) {
            C5211m.c(scheduledExecutorService, new Callable() { // from class: com.google.firebase.remoteconfig.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f38623a.g();
                }
            });
        }
    }
}
