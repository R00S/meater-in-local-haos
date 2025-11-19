package A6;

import A6.b;
import H6.f;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: SingletonConnectivityReceiver.java */
/* loaded from: classes2.dex */
final class r {

    /* renamed from: d, reason: collision with root package name */
    private static volatile r f932d;

    /* renamed from: a, reason: collision with root package name */
    private final c f933a;

    /* renamed from: b, reason: collision with root package name */
    final Set<b.a> f934b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private boolean f935c;

    /* compiled from: SingletonConnectivityReceiver.java */
    class a implements f.b<ConnectivityManager> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f936a;

        a(Context context) {
            this.f936a = context;
        }

        @Override // H6.f.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f936a.getSystemService("connectivity");
        }
    }

    /* compiled from: SingletonConnectivityReceiver.java */
    class b implements b.a {
        b() {
        }

        @Override // A6.b.a
        public void a(boolean z10) {
            ArrayList arrayList;
            H6.l.a();
            synchronized (r.this) {
                arrayList = new ArrayList(r.this.f934b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b.a) it.next()).a(z10);
            }
        }
    }

    /* compiled from: SingletonConnectivityReceiver.java */
    private interface c {
        void a();

        boolean b();
    }

    /* compiled from: SingletonConnectivityReceiver.java */
    private static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        boolean f939a;

        /* renamed from: b, reason: collision with root package name */
        final b.a f940b;

        /* renamed from: c, reason: collision with root package name */
        private final f.b<ConnectivityManager> f941c;

        /* renamed from: d, reason: collision with root package name */
        private final ConnectivityManager.NetworkCallback f942d = new a();

        /* compiled from: SingletonConnectivityReceiver.java */
        class a extends ConnectivityManager.NetworkCallback {

            /* compiled from: SingletonConnectivityReceiver.java */
            /* renamed from: A6.r$d$a$a, reason: collision with other inner class name */
            class RunnableC0018a implements Runnable {

                /* renamed from: B, reason: collision with root package name */
                final /* synthetic */ boolean f944B;

                RunnableC0018a(boolean z10) {
                    this.f944B = z10;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.a(this.f944B);
                }
            }

            a() {
            }

            private void b(boolean z10) {
                H6.l.u(new RunnableC0018a(z10));
            }

            void a(boolean z10) {
                H6.l.a();
                d dVar = d.this;
                boolean z11 = dVar.f939a;
                dVar.f939a = z10;
                if (z11 != z10) {
                    dVar.f940b.a(z10);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                b(false);
            }
        }

        d(f.b<ConnectivityManager> bVar, b.a aVar) {
            this.f941c = bVar;
            this.f940b = aVar;
        }

        @Override // A6.r.c
        public void a() {
            this.f941c.get().unregisterNetworkCallback(this.f942d);
        }

        @Override // A6.r.c
        @SuppressLint({"MissingPermission"})
        public boolean b() {
            this.f939a = this.f941c.get().getActiveNetwork() != null;
            try {
                this.f941c.get().registerDefaultNetworkCallback(this.f942d);
                return true;
            } catch (RuntimeException e10) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e10);
                }
                return false;
            }
        }
    }

    private r(Context context) {
        this.f933a = new d(H6.f.a(new a(context)), new b());
    }

    static r a(Context context) {
        if (f932d == null) {
            synchronized (r.class) {
                try {
                    if (f932d == null) {
                        f932d = new r(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f932d;
    }

    private void b() {
        if (this.f935c || this.f934b.isEmpty()) {
            return;
        }
        this.f935c = this.f933a.b();
    }

    private void c() {
        if (this.f935c && this.f934b.isEmpty()) {
            this.f933a.a();
            this.f935c = false;
        }
    }

    synchronized void d(b.a aVar) {
        this.f934b.add(aVar);
        b();
    }

    synchronized void e(b.a aVar) {
        this.f934b.remove(aVar);
        c();
    }
}
