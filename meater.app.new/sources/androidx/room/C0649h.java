package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.database.SQLException;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.C0648g;
import androidx.room.InterfaceC0645d;
import androidx.room.InterfaceC0646e;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MultiInstanceInvalidationClient.java */
/* renamed from: androidx.room.h */
/* loaded from: classes.dex */
class C0649h {

    /* renamed from: a */
    final Context f4279a;

    /* renamed from: b */
    final String f4280b;

    /* renamed from: c */
    int f4281c;

    /* renamed from: d */
    final C0648g f4282d;

    /* renamed from: e */
    final C0648g.c f4283e;

    /* renamed from: f */
    InterfaceC0646e f4284f;

    /* renamed from: g */
    final Executor f4285g;

    /* renamed from: h */
    final InterfaceC0645d f4286h = new a();

    /* renamed from: i */
    final AtomicBoolean f4287i = new AtomicBoolean(false);

    /* renamed from: j */
    final ServiceConnection f4288j;

    /* renamed from: k */
    final Runnable f4289k;

    /* renamed from: l */
    final Runnable f4290l;

    /* renamed from: m */
    private final Runnable f4291m;

    /* compiled from: MultiInstanceInvalidationClient.java */
    /* renamed from: androidx.room.h$a */
    class a extends InterfaceC0645d.a {

        /* compiled from: MultiInstanceInvalidationClient.java */
        /* renamed from: androidx.room.h$a$a, reason: collision with other inner class name */
        class RunnableC11441a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ String[] f4293f;

            RunnableC11441a(String[] strArr) {
                this.f4293f = strArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0649h.this.f4282d.m4597e(this.f4293f);
            }
        }

        a() {
        }

        @Override // androidx.room.InterfaceC0645d
        /* renamed from: L1 */
        public void mo4587L1(String[] strArr) {
            C0649h.this.f4285g.execute(new RunnableC11441a(strArr));
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.java */
    /* renamed from: androidx.room.h$b */
    class b implements ServiceConnection {
        b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C0649h.this.f4284f = InterfaceC0646e.a.m4589H(iBinder);
            C0649h c0649h = C0649h.this;
            c0649h.f4285g.execute(c0649h.f4289k);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C0649h c0649h = C0649h.this;
            c0649h.f4285g.execute(c0649h.f4290l);
            C0649h.this.f4284f = null;
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.java */
    /* renamed from: androidx.room.h$c */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() throws SQLException {
            try {
                C0649h c0649h = C0649h.this;
                InterfaceC0646e interfaceC0646e = c0649h.f4284f;
                if (interfaceC0646e != null) {
                    c0649h.f4281c = interfaceC0646e.mo4584k2(c0649h.f4286h, c0649h.f4280b);
                    C0649h c0649h2 = C0649h.this;
                    c0649h2.f4282d.m4594a(c0649h2.f4283e);
                }
            } catch (RemoteException e2) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e2);
            }
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.java */
    /* renamed from: androidx.room.h$d */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() throws SQLException {
            C0649h c0649h = C0649h.this;
            c0649h.f4282d.m4599g(c0649h.f4283e);
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.java */
    /* renamed from: androidx.room.h$e */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() throws SQLException {
            C0649h c0649h = C0649h.this;
            c0649h.f4282d.m4599g(c0649h.f4283e);
            try {
                C0649h c0649h2 = C0649h.this;
                InterfaceC0646e interfaceC0646e = c0649h2.f4284f;
                if (interfaceC0646e != null) {
                    interfaceC0646e.mo4583S6(c0649h2.f4286h, c0649h2.f4281c);
                }
            } catch (RemoteException e2) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e2);
            }
            C0649h c0649h3 = C0649h.this;
            c0649h3.f4279a.unbindService(c0649h3.f4288j);
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.java */
    /* renamed from: androidx.room.h$f */
    class f extends C0648g.c {
        f(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.C0648g.c
        /* renamed from: a */
        boolean mo4609a() {
            return true;
        }

        @Override // androidx.room.C0648g.c
        /* renamed from: b */
        public void mo4610b(Set<String> set) {
            if (C0649h.this.f4287i.get()) {
                return;
            }
            try {
                C0649h c0649h = C0649h.this;
                InterfaceC0646e interfaceC0646e = c0649h.f4284f;
                if (interfaceC0646e != null) {
                    interfaceC0646e.mo4585z6(c0649h.f4281c, (String[]) set.toArray(new String[0]));
                }
            } catch (RemoteException e2) {
                Log.w("ROOM", "Cannot broadcast invalidation", e2);
            }
        }
    }

    C0649h(Context context, String str, C0648g c0648g, Executor executor) {
        b bVar = new b();
        this.f4288j = bVar;
        this.f4289k = new c();
        this.f4290l = new d();
        this.f4291m = new e();
        Context applicationContext = context.getApplicationContext();
        this.f4279a = applicationContext;
        this.f4280b = str;
        this.f4282d = c0648g;
        this.f4285g = executor;
        this.f4283e = new f((String[]) c0648g.f4256b.keySet().toArray(new String[0]));
        applicationContext.bindService(new Intent(applicationContext, (Class<?>) MultiInstanceInvalidationService.class), bVar, 1);
    }

    /* renamed from: a */
    void m4613a() {
        if (this.f4287i.compareAndSet(false, true)) {
            this.f4285g.execute(this.f4291m);
        }
    }
}
