package com.google.firebase.installations;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.C8405j;
import com.google.firebase.components.C8134x;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.p196p.InterfaceC8392a;
import com.google.firebase.installations.p197q.AbstractC8396d;
import com.google.firebase.installations.p197q.C8394b;
import com.google.firebase.installations.p197q.C8395c;
import com.google.firebase.installations.p198r.AbstractC8400d;
import com.google.firebase.installations.p198r.AbstractC8402f;
import com.google.firebase.installations.p198r.C8399c;
import com.google.firebase.p204r.InterfaceC8491i;
import com.google.firebase.p205s.InterfaceC8496b;
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

/* compiled from: FirebaseInstallations.java */
/* renamed from: com.google.firebase.installations.h */
/* loaded from: classes2.dex */
public class C8384h implements InterfaceC8385i {

    /* renamed from: a */
    private static final Object f31793a = new Object();

    /* renamed from: b */
    private static final ThreadFactory f31794b = new a();

    /* renamed from: c */
    private final C8405j f31795c;

    /* renamed from: d */
    private final C8399c f31796d;

    /* renamed from: e */
    private final C8395c f31797e;

    /* renamed from: f */
    private final C8391o f31798f;

    /* renamed from: g */
    private final C8134x<C8394b> f31799g;

    /* renamed from: h */
    private final C8389m f31800h;

    /* renamed from: i */
    private final Object f31801i;

    /* renamed from: j */
    private final ExecutorService f31802j;

    /* renamed from: k */
    private final Executor f31803k;

    /* renamed from: l */
    private String f31804l;

    /* renamed from: m */
    private Set<InterfaceC8392a> f31805m;

    /* renamed from: n */
    private final List<InterfaceC8390n> f31806n;

    /* compiled from: FirebaseInstallations.java */
    /* renamed from: com.google.firebase.installations.h$a */
    class a implements ThreadFactory {

        /* renamed from: f */
        private final AtomicInteger f31807f = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        @SuppressLint({"ThreadPoolCreation"})
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f31807f.getAndIncrement())));
        }
    }

    /* compiled from: FirebaseInstallations.java */
    /* renamed from: com.google.firebase.installations.h$b */
    static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f31808a;

        /* renamed from: b */
        static final /* synthetic */ int[] f31809b;

        static {
            int[] iArr = new int[AbstractC8402f.b.values().length];
            f31809b = iArr;
            try {
                iArr[AbstractC8402f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31809b[AbstractC8402f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31809b[AbstractC8402f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[AbstractC8400d.b.values().length];
            f31808a = iArr2;
            try {
                iArr2[AbstractC8400d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31808a[AbstractC8400d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    C8384h(final C8405j c8405j, InterfaceC8496b<InterfaceC8491i> interfaceC8496b, ExecutorService executorService, Executor executor) {
        this(executorService, executor, c8405j, new C8399c(c8405j.m26404i(), interfaceC8496b), new C8395c(c8405j), C8391o.m26290c(), new C8134x(new InterfaceC8496b() { // from class: com.google.firebase.installations.a
            @Override // com.google.firebase.p205s.InterfaceC8496b
            public final Object get() {
                return C8384h.m26273w(c8405j);
            }
        }), new C8389m());
    }

    /* renamed from: A */
    private void m26254A(Exception exc) {
        synchronized (this.f31801i) {
            Iterator<InterfaceC8390n> it = this.f31806n.iterator();
            while (it.hasNext()) {
                if (it.next().mo26284a(exc)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: B */
    private void m26255B(AbstractC8396d abstractC8396d) {
        synchronized (this.f31801i) {
            Iterator<InterfaceC8390n> it = this.f31806n.iterator();
            while (it.hasNext()) {
                if (it.next().mo26285b(abstractC8396d)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: C */
    private synchronized void m26256C(String str) {
        this.f31804l = str;
    }

    /* renamed from: D */
    private synchronized void m26257D(AbstractC8396d abstractC8396d, AbstractC8396d abstractC8396d2) {
        if (this.f31805m.size() != 0 && !TextUtils.equals(abstractC8396d.mo26301d(), abstractC8396d2.mo26301d())) {
            Iterator<InterfaceC8392a> it = this.f31805m.iterator();
            while (it.hasNext()) {
                it.next().m26298a(abstractC8396d2.mo26301d());
            }
        }
    }

    /* renamed from: b */
    private Task<AbstractC8388l> m26258b() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m26260d(new C8386j(this.f31798f, taskCompletionSource));
        return taskCompletionSource.m23654a();
    }

    /* renamed from: c */
    private Task<String> m26259c() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m26260d(new C8387k(taskCompletionSource));
        return taskCompletionSource.m23654a();
    }

    /* renamed from: d */
    private void m26260d(InterfaceC8390n interfaceC8390n) {
        synchronized (this.f31801i) {
            this.f31806n.add(interfaceC8390n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m26281r(boolean z) {
        AbstractC8396d abstractC8396dM26276z;
        AbstractC8396d abstractC8396dM26267m = m26267m();
        try {
            if (abstractC8396dM26267m.m26329i() || abstractC8396dM26267m.m26332l()) {
                abstractC8396dM26276z = m26276z(abstractC8396dM26267m);
            } else {
                if (!z && !this.f31798f.m26297f(abstractC8396dM26267m)) {
                    return;
                }
                abstractC8396dM26276z = m26263g(abstractC8396dM26267m);
            }
            m26269p(abstractC8396dM26276z);
            m26257D(abstractC8396dM26267m, abstractC8396dM26276z);
            if (abstractC8396dM26276z.m26331k()) {
                m26256C(abstractC8396dM26276z.mo26301d());
            }
            if (abstractC8396dM26276z.m26329i()) {
                m26254A(new FirebaseInstallationsException(FirebaseInstallationsException.EnumC8376a.BAD_CONFIG));
            } else if (abstractC8396dM26276z.m26330j()) {
                m26254A(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
            } else {
                m26255B(abstractC8396dM26276z);
            }
        } catch (FirebaseInstallationsException e2) {
            m26254A(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void m26283v(final boolean z) {
        AbstractC8396d abstractC8396dM26268n = m26268n();
        if (z) {
            abstractC8396dM26268n = abstractC8396dM26268n.m26335p();
        }
        m26255B(abstractC8396dM26268n);
        this.f31803k.execute(new Runnable() { // from class: com.google.firebase.installations.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f31780f.m26281r(z);
            }
        });
    }

    /* renamed from: g */
    private AbstractC8396d m26263g(AbstractC8396d abstractC8396d) throws FirebaseInstallationsException {
        AbstractC8402f abstractC8402fM26376e = this.f31796d.m26376e(m26278h(), abstractC8396d.mo26301d(), m26280o(), abstractC8396d.mo26303f());
        int i2 = b.f31809b[abstractC8402fM26376e.mo26351b().ordinal()];
        if (i2 == 1) {
            return abstractC8396d.m26334o(abstractC8402fM26376e.mo26352c(), abstractC8402fM26376e.mo26353d(), this.f31798f.m26295b());
        }
        if (i2 == 2) {
            return abstractC8396d.m26336q("BAD CONFIG");
        }
        if (i2 != 3) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.EnumC8376a.UNAVAILABLE);
        }
        m26256C(null);
        return abstractC8396d.m26337r();
    }

    /* renamed from: j */
    private synchronized String m26264j() {
        return this.f31804l;
    }

    /* renamed from: k */
    private C8394b m26265k() {
        return this.f31799g.get();
    }

    /* renamed from: l */
    public static C8384h m26266l(C8405j c8405j) {
        Preconditions.m14363b(c8405j != null, "Null is not a valid value of FirebaseApp.");
        return (C8384h) c8405j.m26403h(InterfaceC8385i.class);
    }

    /* renamed from: m */
    private AbstractC8396d m26267m() {
        AbstractC8396d abstractC8396dM26327d;
        synchronized (f31793a) {
            C8383g c8383gM26252a = C8383g.m26252a(this.f31795c.m26404i(), "generatefid.lock");
            try {
                abstractC8396dM26327d = this.f31797e.m26327d();
            } finally {
                if (c8383gM26252a != null) {
                    c8383gM26252a.m26253b();
                }
            }
        }
        return abstractC8396dM26327d;
    }

    /* renamed from: n */
    private AbstractC8396d m26268n() {
        AbstractC8396d abstractC8396dM26327d;
        synchronized (f31793a) {
            C8383g c8383gM26252a = C8383g.m26252a(this.f31795c.m26404i(), "generatefid.lock");
            try {
                abstractC8396dM26327d = this.f31797e.m26327d();
                if (abstractC8396dM26327d.m26330j()) {
                    abstractC8396dM26327d = this.f31797e.m26326b(abstractC8396dM26327d.m26339t(m26275y(abstractC8396dM26327d)));
                }
            } finally {
                if (c8383gM26252a != null) {
                    c8383gM26252a.m26253b();
                }
            }
        }
        return abstractC8396dM26327d;
    }

    /* renamed from: p */
    private void m26269p(AbstractC8396d abstractC8396d) {
        synchronized (f31793a) {
            C8383g c8383gM26252a = C8383g.m26252a(this.f31795c.m26404i(), "generatefid.lock");
            try {
                this.f31797e.m26326b(abstractC8396d);
            } finally {
                if (c8383gM26252a != null) {
                    c8383gM26252a.m26253b();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m26282t() {
        m26272u(false);
    }

    /* renamed from: w */
    static /* synthetic */ C8394b m26273w(C8405j c8405j) {
        return new C8394b(c8405j);
    }

    /* renamed from: x */
    private void m26274x() {
        Preconditions.m14369h(m26279i(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.m14369h(m26280o(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.m14369h(m26278h(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.m14363b(C8391o.m26293h(m26279i()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.m14363b(C8391o.m26292g(m26278h()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* renamed from: y */
    private String m26275y(AbstractC8396d abstractC8396d) {
        if ((!this.f31795c.m26405k().equals("CHIME_ANDROID_SDK") && !this.f31795c.m26409s()) || !abstractC8396d.m26333m()) {
            return this.f31800h.m26289a();
        }
        String strM26322f = m26265k().m26322f();
        return TextUtils.isEmpty(strM26322f) ? this.f31800h.m26289a() : strM26322f;
    }

    /* renamed from: z */
    private AbstractC8396d m26276z(AbstractC8396d abstractC8396d) throws FirebaseInstallationsException {
        AbstractC8400d abstractC8400dM26375d = this.f31796d.m26375d(m26278h(), abstractC8396d.mo26301d(), m26280o(), m26279i(), (abstractC8396d.mo26301d() == null || abstractC8396d.mo26301d().length() != 11) ? null : m26265k().m26323i());
        int i2 = b.f31808a[abstractC8400dM26375d.mo26343e().ordinal()];
        if (i2 == 1) {
            return abstractC8396d.m26338s(abstractC8400dM26375d.mo26341c(), abstractC8400dM26375d.mo26342d(), this.f31798f.m26295b(), abstractC8400dM26375d.mo26340b().mo26352c(), abstractC8400dM26375d.mo26340b().mo26353d());
        }
        if (i2 == 2) {
            return abstractC8396d.m26336q("BAD CONFIG");
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.EnumC8376a.UNAVAILABLE);
    }

    @Override // com.google.firebase.installations.InterfaceC8385i
    /* renamed from: a */
    public Task<AbstractC8388l> mo26277a(final boolean z) {
        m26274x();
        Task<AbstractC8388l> taskM26258b = m26258b();
        this.f31802j.execute(new Runnable() { // from class: com.google.firebase.installations.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f31782f.m26283v(z);
            }
        });
        return taskM26258b;
    }

    @Override // com.google.firebase.installations.InterfaceC8385i
    public Task<String> getId() {
        m26274x();
        String strM26264j = m26264j();
        if (strM26264j != null) {
            return Tasks.m23663e(strM26264j);
        }
        Task<String> taskM26259c = m26259c();
        this.f31802j.execute(new Runnable() { // from class: com.google.firebase.installations.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f31779f.m26282t();
            }
        });
        return taskM26259c;
    }

    /* renamed from: h */
    String m26278h() {
        return this.f31795c.m26406l().m26423b();
    }

    /* renamed from: i */
    String m26279i() {
        return this.f31795c.m26406l().m26424c();
    }

    /* renamed from: o */
    String m26280o() {
        return this.f31795c.m26406l().m26426e();
    }

    @SuppressLint({"ThreadPoolCreation"})
    C8384h(ExecutorService executorService, Executor executor, C8405j c8405j, C8399c c8399c, C8395c c8395c, C8391o c8391o, C8134x<C8394b> c8134x, C8389m c8389m) {
        this.f31801i = new Object();
        this.f31805m = new HashSet();
        this.f31806n = new ArrayList();
        this.f31795c = c8405j;
        this.f31796d = c8399c;
        this.f31797e = c8395c;
        this.f31798f = c8391o;
        this.f31799g = c8134x;
        this.f31800h = c8389m;
        this.f31802j = executorService;
        this.f31803k = executor;
    }
}
