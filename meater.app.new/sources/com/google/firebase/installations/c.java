package com.google.firebase.installations;

import K8.t;
import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.google.firebase.installations.FirebaseInstallationsException;
import g7.C3445p;
import h9.i;
import j9.InterfaceC3755b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import k9.C3812g;
import k9.InterfaceC3810e;
import l9.InterfaceC3919a;
import m9.AbstractC4014d;
import m9.C4012b;
import m9.C4013c;
import n9.d;
import n9.f;
import z7.AbstractC5208j;
import z7.C5209k;
import z7.C5211m;

/* compiled from: FirebaseInstallations.java */
/* loaded from: classes2.dex */
public class c implements InterfaceC3810e {

    /* renamed from: m, reason: collision with root package name */
    private static final Object f38185m = new Object();

    /* renamed from: n, reason: collision with root package name */
    private static final ThreadFactory f38186n = new a();

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.f f38187a;

    /* renamed from: b, reason: collision with root package name */
    private final n9.c f38188b;

    /* renamed from: c, reason: collision with root package name */
    private final C4013c f38189c;

    /* renamed from: d, reason: collision with root package name */
    private final h f38190d;

    /* renamed from: e, reason: collision with root package name */
    private final t<C4012b> f38191e;

    /* renamed from: f, reason: collision with root package name */
    private final C3812g f38192f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f38193g;

    /* renamed from: h, reason: collision with root package name */
    private final ExecutorService f38194h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f38195i;

    /* renamed from: j, reason: collision with root package name */
    private String f38196j;

    /* renamed from: k, reason: collision with root package name */
    private Set<InterfaceC3919a> f38197k;

    /* renamed from: l, reason: collision with root package name */
    private final List<g> f38198l;

    /* compiled from: FirebaseInstallations.java */
    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f38199a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        @SuppressLint({"ThreadPoolCreation"})
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f38199a.getAndIncrement())));
        }
    }

    /* compiled from: FirebaseInstallations.java */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f38200a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f38201b;

        static {
            int[] iArr = new int[f.b.values().length];
            f38201b = iArr;
            try {
                iArr[f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38201b[f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38201b[f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f38200a = iArr2;
            try {
                iArr2[d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38200a[d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    c(final com.google.firebase.f fVar, InterfaceC3755b<i> interfaceC3755b, ExecutorService executorService, Executor executor) {
        this(executorService, executor, fVar, new n9.c(fVar.k(), interfaceC3755b), new C4013c(fVar), h.c(), new t(new InterfaceC3755b() { // from class: k9.a
            @Override // j9.InterfaceC3755b
            public final Object get() {
                return com.google.firebase.installations.c.z(fVar);
            }
        }), new C3812g());
    }

    private void A() {
        C3445p.f(n(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C3445p.f(u(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C3445p.f(m(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C3445p.b(h.h(n()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C3445p.b(h.g(m()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private String B(AbstractC4014d abstractC4014d) {
        if ((!this.f38187a.m().equals("CHIME_ANDROID_SDK") && !this.f38187a.u()) || !abstractC4014d.m()) {
            return this.f38192f.a();
        }
        String strF = p().f();
        return TextUtils.isEmpty(strF) ? this.f38192f.a() : strF;
    }

    private AbstractC4014d C(AbstractC4014d abstractC4014d) throws FirebaseInstallationsException {
        n9.d dVarD = this.f38188b.d(m(), abstractC4014d.d(), u(), n(), (abstractC4014d.d() == null || abstractC4014d.d().length() != 11) ? null : p().i());
        int i10 = b.f38200a[dVarD.e().ordinal()];
        if (i10 == 1) {
            return abstractC4014d.s(dVarD.c(), dVarD.d(), this.f38190d.b(), dVarD.b().c(), dVarD.b().d());
        }
        if (i10 == 2) {
            return abstractC4014d.q("BAD CONFIG");
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
    }

    private void D(Exception exc) {
        synchronized (this.f38193g) {
            try {
                Iterator<g> it = this.f38198l.iterator();
                while (it.hasNext()) {
                    if (it.next().a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void E(AbstractC4014d abstractC4014d) {
        synchronized (this.f38193g) {
            try {
                Iterator<g> it = this.f38198l.iterator();
                while (it.hasNext()) {
                    if (it.next().b(abstractC4014d)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized void F(String str) {
        this.f38196j = str;
    }

    private synchronized void G(AbstractC4014d abstractC4014d, AbstractC4014d abstractC4014d2) {
        if (this.f38197k.size() != 0 && !TextUtils.equals(abstractC4014d.d(), abstractC4014d2.d())) {
            Iterator<InterfaceC3919a> it = this.f38197k.iterator();
            while (it.hasNext()) {
                it.next().a(abstractC4014d2.d());
            }
        }
    }

    private AbstractC5208j<f> g() {
        C5209k c5209k = new C5209k();
        i(new d(this.f38190d, c5209k));
        return c5209k.a();
    }

    private AbstractC5208j<String> h() {
        C5209k c5209k = new C5209k();
        i(new e(c5209k));
        return c5209k.a();
    }

    private void i(g gVar) {
        synchronized (this.f38193g) {
            this.f38198l.add(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void w(boolean z10) {
        AbstractC4014d abstractC4014dC;
        AbstractC4014d abstractC4014dS = s();
        try {
            if (abstractC4014dS.i() || abstractC4014dS.l()) {
                abstractC4014dC = C(abstractC4014dS);
            } else {
                if (!z10 && !this.f38190d.f(abstractC4014dS)) {
                    return;
                }
                abstractC4014dC = l(abstractC4014dS);
            }
            v(abstractC4014dC);
            G(abstractC4014dS, abstractC4014dC);
            if (abstractC4014dC.k()) {
                F(abstractC4014dC.d());
            }
            if (abstractC4014dC.i()) {
                D(new FirebaseInstallationsException(FirebaseInstallationsException.a.BAD_CONFIG));
            } else if (abstractC4014dC.j()) {
                D(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
            } else {
                E(abstractC4014dC);
            }
        } catch (FirebaseInstallationsException e10) {
            D(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void y(final boolean z10) {
        AbstractC4014d abstractC4014dT = t();
        if (z10) {
            abstractC4014dT = abstractC4014dT.p();
        }
        E(abstractC4014dT);
        this.f38195i.execute(new Runnable() { // from class: k9.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f43827B.w(z10);
            }
        });
    }

    private AbstractC4014d l(AbstractC4014d abstractC4014d) throws FirebaseInstallationsException {
        n9.f fVarE = this.f38188b.e(m(), abstractC4014d.d(), u(), abstractC4014d.f());
        int i10 = b.f38201b[fVarE.b().ordinal()];
        if (i10 == 1) {
            return abstractC4014d.o(fVarE.c(), fVarE.d(), this.f38190d.b());
        }
        if (i10 == 2) {
            return abstractC4014d.q("BAD CONFIG");
        }
        if (i10 != 3) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
        }
        F(null);
        return abstractC4014d.r();
    }

    private synchronized String o() {
        return this.f38196j;
    }

    private C4012b p() {
        return this.f38191e.get();
    }

    public static c q() {
        return r(com.google.firebase.f.l());
    }

    public static c r(com.google.firebase.f fVar) {
        C3445p.b(fVar != null, "Null is not a valid value of FirebaseApp.");
        return (c) fVar.j(InterfaceC3810e.class);
    }

    /* JADX WARN: Finally extract failed */
    private AbstractC4014d s() {
        AbstractC4014d abstractC4014dD;
        synchronized (f38185m) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f38187a.k(), "generatefid.lock");
                try {
                    abstractC4014dD = this.f38189c.d();
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return abstractC4014dD;
    }

    /* JADX WARN: Finally extract failed */
    private AbstractC4014d t() {
        AbstractC4014d abstractC4014dD;
        synchronized (f38185m) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f38187a.k(), "generatefid.lock");
                try {
                    abstractC4014dD = this.f38189c.d();
                    if (abstractC4014dD.j()) {
                        abstractC4014dD = this.f38189c.b(abstractC4014dD.t(B(abstractC4014dD)));
                    }
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return abstractC4014dD;
    }

    /* JADX WARN: Finally extract failed */
    private void v(AbstractC4014d abstractC4014d) {
        synchronized (f38185m) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f38187a.k(), "generatefid.lock");
                try {
                    this.f38189c.b(abstractC4014d);
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x() {
        y(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C4012b z(com.google.firebase.f fVar) {
        return new C4012b(fVar);
    }

    @Override // k9.InterfaceC3810e
    public AbstractC5208j<f> a(final boolean z10) {
        A();
        AbstractC5208j<f> abstractC5208jG = g();
        this.f38194h.execute(new Runnable() { // from class: k9.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f43825B.y(z10);
            }
        });
        return abstractC5208jG;
    }

    @Override // k9.InterfaceC3810e
    public AbstractC5208j<String> c() {
        A();
        String strO = o();
        if (strO != null) {
            return C5211m.e(strO);
        }
        AbstractC5208j<String> abstractC5208jH = h();
        this.f38194h.execute(new Runnable() { // from class: k9.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f43824B.x();
            }
        });
        return abstractC5208jH;
    }

    String m() {
        return this.f38187a.n().b();
    }

    String n() {
        return this.f38187a.n().c();
    }

    String u() {
        return this.f38187a.n().e();
    }

    @SuppressLint({"ThreadPoolCreation"})
    c(ExecutorService executorService, Executor executor, com.google.firebase.f fVar, n9.c cVar, C4013c c4013c, h hVar, t<C4012b> tVar, C3812g c3812g) {
        this.f38193g = new Object();
        this.f38197k = new HashSet();
        this.f38198l = new ArrayList();
        this.f38187a = fVar;
        this.f38188b = cVar;
        this.f38189c = c4013c;
        this.f38190d = hVar;
        this.f38191e = tVar;
        this.f38192f = c3812g;
        this.f38194h = executorService;
        this.f38195i = executor;
    }
}
