package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.l;
import androidx.room.m;
import androidx.room.q;
import androidx.room.t;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: MultiInstanceInvalidationClient.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001f\u001a\n \u001d*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001eR\"\u0010%\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010!\u001a\u0004\b\u0019\u0010\"\"\u0004\b#\u0010$R\"\u0010,\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)\"\u0004\b*\u0010+R$\u00104\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0017\u00109\u001a\u0002058\u0006¢\u0006\f\n\u0004\b0\u00106\u001a\u0004\b7\u00108R\u0017\u0010?\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010D\u001a\u00020@8\u0006¢\u0006\f\n\u0004\b=\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010I\u001a\u00020E8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b;\u0010HR\u0017\u0010J\u001a\u00020E8\u0006¢\u0006\f\n\u0004\b*\u0010G\u001a\u0004\b.\u0010H¨\u0006K"}, d2 = {"Landroidx/room/t;", "", "Landroid/content/Context;", "context", "", "name", "Landroid/content/Intent;", "serviceIntent", "Landroidx/room/q;", "invalidationTracker", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroidx/room/q;Ljava/util/concurrent/Executor;)V", "Loa/F;", "o", "()V", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "Landroidx/room/q;", "e", "()Landroidx/room/q;", "c", "Ljava/util/concurrent/Executor;", "d", "()Ljava/util/concurrent/Executor;", "kotlin.jvm.PlatformType", "Landroid/content/Context;", "appContext", "", "I", "()I", "setClientId", "(I)V", "clientId", "Landroidx/room/q$c;", "f", "Landroidx/room/q$c;", "()Landroidx/room/q$c;", "l", "(Landroidx/room/q$c;)V", "observer", "Landroidx/room/m;", "g", "Landroidx/room/m;", "h", "()Landroidx/room/m;", "m", "(Landroidx/room/m;)V", "service", "Landroidx/room/l;", "Landroidx/room/l;", "getCallback", "()Landroidx/room/l;", "callback", "Ljava/util/concurrent/atomic/AtomicBoolean;", "i", "Ljava/util/concurrent/atomic/AtomicBoolean;", "j", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "stopped", "Landroid/content/ServiceConnection;", "Landroid/content/ServiceConnection;", "getServiceConnection", "()Landroid/content/ServiceConnection;", "serviceConnection", "Ljava/lang/Runnable;", "k", "Ljava/lang/Runnable;", "()Ljava/lang/Runnable;", "setUpRunnable", "removeObserverRunnable", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q invalidationTracker;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Executor executor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Context appContext;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int clientId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public q.c observer;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private m service;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final l callback;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean stopped;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ServiceConnection serviceConnection;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Runnable setUpRunnable;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Runnable removeObserverRunnable;

    /* compiled from: MultiInstanceInvalidationClient.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"androidx/room/t$a", "Landroidx/room/q$c;", "", "", "tables", "Loa/F;", "c", "(Ljava/util/Set;)V", "", "b", "()Z", "isRemote", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends q.c {
        a(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.q.c
        public boolean b() {
            return true;
        }

        @Override // androidx.room.q.c
        public void c(Set<String> tables) {
            C3862t.g(tables, "tables");
            if (t.this.getStopped().get()) {
                return;
            }
            try {
                m service = t.this.getService();
                if (service != null) {
                    service.d1(t.this.getClientId(), (String[]) tables.toArray(new String[0]));
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot broadcast invalidation", e10);
            }
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/room/t$b", "Landroidx/room/l$a;", "", "", "tables", "Loa/F;", "D", "([Ljava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends l.a {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(t this$0, String[] tables) {
            C3862t.g(this$0, "this$0");
            C3862t.g(tables, "$tables");
            this$0.getInvalidationTracker().m((String[]) Arrays.copyOf(tables, tables.length));
        }

        @Override // androidx.room.l
        public void D(final String[] tables) {
            C3862t.g(tables, "tables");
            Executor executor = t.this.getExecutor();
            final t tVar = t.this;
            executor.execute(new Runnable() { // from class: androidx.room.u
                @Override // java.lang.Runnable
                public final void run() {
                    t.b.k(tVar, tables);
                }
            });
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/room/t$c", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", "service", "Loa/F;", "onServiceConnected", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements ServiceConnection {
        c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            C3862t.g(name, "name");
            C3862t.g(service, "service");
            t.this.m(m.a.c(service));
            t.this.getExecutor().execute(t.this.getSetUpRunnable());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            C3862t.g(name, "name");
            t.this.getExecutor().execute(t.this.getRemoveObserverRunnable());
            t.this.m(null);
        }
    }

    public t(Context context, String name, Intent serviceIntent, q invalidationTracker, Executor executor) {
        C3862t.g(context, "context");
        C3862t.g(name, "name");
        C3862t.g(serviceIntent, "serviceIntent");
        C3862t.g(invalidationTracker, "invalidationTracker");
        C3862t.g(executor, "executor");
        this.name = name;
        this.invalidationTracker = invalidationTracker;
        this.executor = executor;
        Context applicationContext = context.getApplicationContext();
        this.appContext = applicationContext;
        this.callback = new b();
        this.stopped = new AtomicBoolean(false);
        c cVar = new c();
        this.serviceConnection = cVar;
        this.setUpRunnable = new Runnable() { // from class: androidx.room.r
            @Override // java.lang.Runnable
            public final void run() {
                t.n(this.f29216B);
            }
        };
        this.removeObserverRunnable = new Runnable() { // from class: androidx.room.s
            @Override // java.lang.Runnable
            public final void run() {
                t.k(this.f29217B);
            }
        };
        l(new a((String[]) invalidationTracker.k().keySet().toArray(new String[0])));
        applicationContext.bindService(serviceIntent, cVar, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(t this$0) {
        C3862t.g(this$0, "this$0");
        this$0.invalidationTracker.p(this$0.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(t this$0) {
        C3862t.g(this$0, "this$0");
        try {
            m mVar = this$0.service;
            if (mVar != null) {
                this$0.clientId = mVar.Q(this$0.callback, this$0.name);
                this$0.invalidationTracker.c(this$0.f());
            }
        } catch (RemoteException e10) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e10);
        }
    }

    /* renamed from: c, reason: from getter */
    public final int getClientId() {
        return this.clientId;
    }

    /* renamed from: d, reason: from getter */
    public final Executor getExecutor() {
        return this.executor;
    }

    /* renamed from: e, reason: from getter */
    public final q getInvalidationTracker() {
        return this.invalidationTracker;
    }

    public final q.c f() {
        q.c cVar = this.observer;
        if (cVar != null) {
            return cVar;
        }
        C3862t.u("observer");
        return null;
    }

    /* renamed from: g, reason: from getter */
    public final Runnable getRemoveObserverRunnable() {
        return this.removeObserverRunnable;
    }

    /* renamed from: h, reason: from getter */
    public final m getService() {
        return this.service;
    }

    /* renamed from: i, reason: from getter */
    public final Runnable getSetUpRunnable() {
        return this.setUpRunnable;
    }

    /* renamed from: j, reason: from getter */
    public final AtomicBoolean getStopped() {
        return this.stopped;
    }

    public final void l(q.c cVar) {
        C3862t.g(cVar, "<set-?>");
        this.observer = cVar;
    }

    public final void m(m mVar) {
        this.service = mVar;
    }

    public final void o() {
        if (this.stopped.compareAndSet(false, true)) {
            this.invalidationTracker.p(f());
            try {
                m mVar = this.service;
                if (mVar != null) {
                    mVar.n1(this.callback, this.clientId);
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e10);
            }
            this.appContext.unbindService(this.serviceConnection);
        }
    }
}
