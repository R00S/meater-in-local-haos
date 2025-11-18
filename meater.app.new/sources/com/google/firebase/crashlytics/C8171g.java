package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.C8405j;
import com.google.firebase.analytics.p179a.InterfaceC8095a;
import com.google.firebase.crashlytics.internal.C8176e;
import com.google.firebase.crashlytics.internal.C8178g;
import com.google.firebase.crashlytics.internal.C8179h;
import com.google.firebase.crashlytics.internal.C8182k;
import com.google.firebase.crashlytics.internal.InterfaceC8175d;
import com.google.firebase.crashlytics.internal.p183n.C8201e0;
import com.google.firebase.crashlytics.internal.p183n.C8205g0;
import com.google.firebase.crashlytics.internal.p183n.C8209i0;
import com.google.firebase.crashlytics.internal.p183n.C8214l;
import com.google.firebase.crashlytics.internal.p183n.C8224q;
import com.google.firebase.crashlytics.internal.p183n.C8228t;
import com.google.firebase.crashlytics.internal.p183n.C8230v;
import com.google.firebase.crashlytics.internal.p183n.C8233y;
import com.google.firebase.crashlytics.internal.p187q.C8291b;
import com.google.firebase.crashlytics.internal.p188r.C8298f;
import com.google.firebase.crashlytics.internal.p190t.C8309f;
import com.google.firebase.installations.InterfaceC8385i;
import com.google.firebase.p205s.InterfaceC8495a;
import com.google.firebase.p210v.p211a.InterfaceC8557a;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: FirebaseCrashlytics.java */
/* renamed from: com.google.firebase.crashlytics.g */
/* loaded from: classes2.dex */
public class C8171g {

    /* renamed from: a */
    final C8233y f30841a;

    /* compiled from: FirebaseCrashlytics.java */
    /* renamed from: com.google.firebase.crashlytics.g$a */
    class a implements Continuation<Void, Object> {
        a() {
        }

        @Override // com.google.android.gms.tasks.Continuation
        /* renamed from: a */
        public Object mo13777a(Task<Void> task) throws Exception {
            if (task.mo23651n()) {
                return null;
            }
            C8179h.m25176f().m25180e("Error fetching settings.", task.mo23646i());
            return null;
        }
    }

    /* compiled from: FirebaseCrashlytics.java */
    /* renamed from: com.google.firebase.crashlytics.g$b */
    class b implements Callable<Void> {

        /* renamed from: f */
        final /* synthetic */ boolean f30842f;

        /* renamed from: g */
        final /* synthetic */ C8233y f30843g;

        /* renamed from: h */
        final /* synthetic */ C8309f f30844h;

        b(boolean z, C8233y c8233y, C8309f c8309f) {
            this.f30842f = z;
            this.f30843g = c8233y;
            this.f30844h = c8309f;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            if (!this.f30842f) {
                return null;
            }
            this.f30843g.m25445g(this.f30844h);
            return null;
        }
    }

    private C8171g(C8233y c8233y) {
        this.f30841a = c8233y;
    }

    /* renamed from: a */
    static C8171g m25151a(C8405j c8405j, InterfaceC8385i interfaceC8385i, InterfaceC8495a<InterfaceC8175d> interfaceC8495a, InterfaceC8495a<InterfaceC8095a> interfaceC8495a2, InterfaceC8495a<InterfaceC8557a> interfaceC8495a3) throws Resources.NotFoundException {
        Context contextM26404i = c8405j.m26404i();
        String packageName = contextM26404i.getPackageName();
        C8179h.m25176f().m25181g("Initializing Firebase Crashlytics " + C8233y.m25442i() + " for " + packageName);
        C8298f c8298f = new C8298f(contextM26404i);
        C8201e0 c8201e0 = new C8201e0(c8405j);
        C8209i0 c8209i0 = new C8209i0(contextM26404i, packageName, interfaceC8385i, c8201e0);
        C8176e c8176e = new C8176e(interfaceC8495a);
        C8169e c8169e = new C8169e(interfaceC8495a2);
        ExecutorService executorServiceM25246c = C8205g0.m25246c("Crashlytics Exception Handler");
        C8230v c8230v = new C8230v(c8201e0, c8298f);
        FirebaseSessionsDependencies.m26791e(c8230v);
        C8233y c8233y = new C8233y(c8405j, c8209i0, c8176e, c8201e0, c8169e.m25143b(), c8169e.m25142a(), c8298f, executorServiceM25246c, c8230v, new C8182k(interfaceC8495a3));
        String strM26424c = c8405j.m26406l().m26424c();
        String strM25342m = C8228t.m25342m(contextM26404i);
        List<C8224q> listM25339j = C8228t.m25339j(contextM26404i);
        C8179h.m25176f().m25177b("Mapping file ID is: " + strM25342m);
        for (C8224q c8224q : listM25339j) {
            C8179h.m25176f().m25177b(String.format("Build id for %s on %s: %s", c8224q.m25311c(), c8224q.m25309a(), c8224q.m25310b()));
        }
        try {
            C8214l c8214lM25274a = C8214l.m25274a(contextM26404i, c8209i0, strM26424c, strM25342m, listM25339j, new C8178g(contextM26404i));
            C8179h.m25176f().m25183i("Installer package name is: " + c8214lM25274a.f30936d);
            ExecutorService executorServiceM25246c2 = C8205g0.m25246c("com.google.firebase.crashlytics.startup");
            C8309f c8309fM26054l = C8309f.m26054l(contextM26404i, strM26424c, c8209i0, new C8291b(), c8214lM25274a.f30938f, c8214lM25274a.f30939g, c8298f, c8201e0);
            c8309fM26054l.m26063p(executorServiceM25246c2).mo23644g(executorServiceM25246c2, new a());
            Tasks.m23661c(executorServiceM25246c2, new b(c8233y.m25449n(c8214lM25274a, c8309fM26054l), c8233y, c8309fM26054l));
            return new C8171g(c8233y);
        } catch (PackageManager.NameNotFoundException e2) {
            C8179h.m25176f().m25180e("Error retrieving app package info.", e2);
            return null;
        }
    }
}
