package j8;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.play.core.review.internal.zzu;
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

/* compiled from: com.google.android.play:review@@2.0.2 */
/* loaded from: classes2.dex */
public final class t {

    /* renamed from: n, reason: collision with root package name */
    private static final Map f43553n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Context f43554a;

    /* renamed from: b, reason: collision with root package name */
    private final i f43555b;

    /* renamed from: g, reason: collision with root package name */
    private boolean f43560g;

    /* renamed from: h, reason: collision with root package name */
    private final Intent f43561h;

    /* renamed from: l, reason: collision with root package name */
    private ServiceConnection f43565l;

    /* renamed from: m, reason: collision with root package name */
    private IInterface f43566m;

    /* renamed from: d, reason: collision with root package name */
    private final List f43557d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final Set f43558e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final Object f43559f = new Object();

    /* renamed from: j, reason: collision with root package name */
    private final IBinder.DeathRecipient f43563j = new IBinder.DeathRecipient() { // from class: j8.k
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            t.j(this.f43542a);
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private final AtomicInteger f43564k = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    private final String f43556c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* renamed from: i, reason: collision with root package name */
    private final WeakReference f43562i = new WeakReference(null);

    public t(Context context, i iVar, String str, Intent intent, i8.h hVar, o oVar) {
        this.f43554a = context;
        this.f43555b = iVar;
        this.f43561h = intent;
    }

    public static /* synthetic */ void j(t tVar) {
        tVar.f43555b.c("reportBinderDeath", new Object[0]);
        o oVar = (o) tVar.f43562i.get();
        if (oVar != null) {
            tVar.f43555b.c("calling onBinderDied", new Object[0]);
            oVar.a();
        } else {
            tVar.f43555b.c("%s : Binder has died.", tVar.f43556c);
            Iterator it = tVar.f43557d.iterator();
            while (it.hasNext()) {
                ((j) it.next()).c(tVar.v());
            }
            tVar.f43557d.clear();
        }
        synchronized (tVar.f43559f) {
            tVar.w();
        }
    }

    static /* bridge */ /* synthetic */ void n(final t tVar, final C5209k c5209k) {
        tVar.f43558e.add(c5209k);
        c5209k.a().c(new InterfaceC5203e() { // from class: j8.l
            @Override // z7.InterfaceC5203e
            public final void a(AbstractC5208j abstractC5208j) {
                this.f43543a.t(c5209k, abstractC5208j);
            }
        });
    }

    static /* bridge */ /* synthetic */ void p(t tVar, j jVar) {
        if (tVar.f43566m != null || tVar.f43560g) {
            if (!tVar.f43560g) {
                jVar.run();
                return;
            } else {
                tVar.f43555b.c("Waiting to bind to the service.", new Object[0]);
                tVar.f43557d.add(jVar);
                return;
            }
        }
        tVar.f43555b.c("Initiate binding to the service.", new Object[0]);
        tVar.f43557d.add(jVar);
        r rVar = new r(tVar, null);
        tVar.f43565l = rVar;
        tVar.f43560g = true;
        if (tVar.f43554a.bindService(tVar.f43561h, rVar, 1)) {
            return;
        }
        tVar.f43555b.c("Failed to bind to the service.", new Object[0]);
        tVar.f43560g = false;
        Iterator it = tVar.f43557d.iterator();
        while (it.hasNext()) {
            ((j) it.next()).c(new zzu());
        }
        tVar.f43557d.clear();
    }

    static /* bridge */ /* synthetic */ void q(t tVar) throws RemoteException {
        tVar.f43555b.c("linkToDeath", new Object[0]);
        try {
            tVar.f43566m.asBinder().linkToDeath(tVar.f43563j, 0);
        } catch (RemoteException e10) {
            tVar.f43555b.b(e10, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void r(t tVar) {
        tVar.f43555b.c("unlinkToDeath", new Object[0]);
        tVar.f43566m.asBinder().unlinkToDeath(tVar.f43563j, 0);
    }

    private final RemoteException v() {
        return new RemoteException(String.valueOf(this.f43556c).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        Iterator it = this.f43558e.iterator();
        while (it.hasNext()) {
            ((C5209k) it.next()).d(v());
        }
        this.f43558e.clear();
    }

    public final Handler c() {
        Handler handler;
        Map map = f43553n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f43556c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f43556c, 10);
                    handlerThread.start();
                    map.put(this.f43556c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f43556c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f43566m;
    }

    public final void s(j jVar, C5209k c5209k) {
        c().post(new m(this, jVar.b(), c5209k, jVar));
    }

    final /* synthetic */ void t(C5209k c5209k, AbstractC5208j abstractC5208j) {
        synchronized (this.f43559f) {
            this.f43558e.remove(c5209k);
        }
    }

    public final void u(C5209k c5209k) {
        synchronized (this.f43559f) {
            this.f43558e.remove(c5209k);
        }
        c().post(new n(this));
    }
}
