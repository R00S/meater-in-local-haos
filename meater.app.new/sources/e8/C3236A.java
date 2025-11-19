package e8;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.play.core.appupdate.internal.zzy;
import d8.C3073q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import z7.AbstractC5208j;
import z7.C5209k;
import z7.InterfaceC5203e;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* renamed from: e8.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3236A {

    /* renamed from: o, reason: collision with root package name */
    private static final Map f40743o = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Context f40744a;

    /* renamed from: b, reason: collision with root package name */
    private final C3253p f40745b;

    /* renamed from: g, reason: collision with root package name */
    private boolean f40750g;

    /* renamed from: h, reason: collision with root package name */
    private final Intent f40751h;

    /* renamed from: l, reason: collision with root package name */
    private ServiceConnection f40755l;

    /* renamed from: m, reason: collision with root package name */
    private IInterface f40756m;

    /* renamed from: n, reason: collision with root package name */
    private final C3073q f40757n;

    /* renamed from: d, reason: collision with root package name */
    private final List f40747d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final Set f40748e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final Object f40749f = new Object();

    /* renamed from: j, reason: collision with root package name */
    private final IBinder.DeathRecipient f40753j = new IBinder.DeathRecipient() { // from class: e8.s
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C3236A.j(this.f40778a);
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private final AtomicInteger f40754k = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    private final String f40746c = "AppUpdateService";

    /* renamed from: i, reason: collision with root package name */
    private final WeakReference f40752i = new WeakReference(null);

    public C3236A(Context context, C3253p c3253p, String str, Intent intent, C3073q c3073q, v vVar) {
        this.f40744a = context;
        this.f40745b = c3253p;
        this.f40751h = intent;
        this.f40757n = c3073q;
    }

    public static /* synthetic */ void j(C3236A c3236a) {
        c3236a.f40745b.c("reportBinderDeath", new Object[0]);
        v vVar = (v) c3236a.f40752i.get();
        if (vVar != null) {
            c3236a.f40745b.c("calling onBinderDied", new Object[0]);
            vVar.a();
        } else {
            c3236a.f40745b.c("%s : Binder has died.", c3236a.f40746c);
            Iterator it = c3236a.f40747d.iterator();
            while (it.hasNext()) {
                ((AbstractRunnableC3254q) it.next()).c(c3236a.v());
            }
            c3236a.f40747d.clear();
        }
        synchronized (c3236a.f40749f) {
            c3236a.w();
        }
    }

    static /* bridge */ /* synthetic */ void n(final C3236A c3236a, final C5209k c5209k) {
        c3236a.f40748e.add(c5209k);
        c5209k.a().c(new InterfaceC5203e() { // from class: e8.r
            @Override // z7.InterfaceC5203e
            public final void a(AbstractC5208j abstractC5208j) {
                this.f40776a.t(c5209k, abstractC5208j);
            }
        });
    }

    static /* bridge */ /* synthetic */ void p(C3236A c3236a, AbstractRunnableC3254q abstractRunnableC3254q) {
        if (c3236a.f40756m != null || c3236a.f40750g) {
            if (!c3236a.f40750g) {
                abstractRunnableC3254q.run();
                return;
            } else {
                c3236a.f40745b.c("Waiting to bind to the service.", new Object[0]);
                c3236a.f40747d.add(abstractRunnableC3254q);
                return;
            }
        }
        c3236a.f40745b.c("Initiate binding to the service.", new Object[0]);
        c3236a.f40747d.add(abstractRunnableC3254q);
        z zVar = new z(c3236a, null);
        c3236a.f40755l = zVar;
        c3236a.f40750g = true;
        if (c3236a.f40744a.bindService(c3236a.f40751h, zVar, 1)) {
            return;
        }
        c3236a.f40745b.c("Failed to bind to the service.", new Object[0]);
        c3236a.f40750g = false;
        Iterator it = c3236a.f40747d.iterator();
        while (it.hasNext()) {
            ((AbstractRunnableC3254q) it.next()).c(new zzy());
        }
        c3236a.f40747d.clear();
    }

    static /* bridge */ /* synthetic */ void q(C3236A c3236a) throws RemoteException {
        c3236a.f40745b.c("linkToDeath", new Object[0]);
        try {
            c3236a.f40756m.asBinder().linkToDeath(c3236a.f40753j, 0);
        } catch (RemoteException e10) {
            c3236a.f40745b.b(e10, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void r(C3236A c3236a) {
        c3236a.f40745b.c("unlinkToDeath", new Object[0]);
        c3236a.f40756m.asBinder().unlinkToDeath(c3236a.f40753j, 0);
    }

    private final RemoteException v() {
        return new RemoteException(String.valueOf(this.f40746c).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        Iterator it = this.f40748e.iterator();
        while (it.hasNext()) {
            ((C5209k) it.next()).d(v());
        }
        this.f40748e.clear();
    }

    public final Handler c() {
        Handler handler;
        Map map = f40743o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f40746c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f40746c, 10);
                    handlerThread.start();
                    map.put(this.f40746c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f40746c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f40756m;
    }

    public final void s(AbstractRunnableC3254q abstractRunnableC3254q, C5209k c5209k) {
        c().post(new t(this, abstractRunnableC3254q.b(), c5209k, abstractRunnableC3254q));
    }

    final /* synthetic */ void t(C5209k c5209k, AbstractC5208j abstractC5208j) {
        synchronized (this.f40749f) {
            this.f40748e.remove(c5209k);
        }
    }

    public final void u(C5209k c5209k) {
        synchronized (this.f40749f) {
            this.f40748e.remove(c5209k);
        }
        c().post(new u(this));
    }
}
