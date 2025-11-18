package p241e.p307h.p308a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import p241e.p307h.p308a.p315k0.C9032b;

/* compiled from: FileDownloadMessageStation.java */
/* renamed from: e.h.a.j */
/* loaded from: classes2.dex */
public class C9027j {

    /* renamed from: a */
    private static final Executor f34798a = C9032b.m28953a(5, "BlockCompleted");

    /* renamed from: b */
    static int f34799b = 10;

    /* renamed from: c */
    static int f34800c = 5;

    /* renamed from: d */
    private final Handler f34801d;

    /* renamed from: e */
    private final LinkedBlockingQueue<InterfaceC9045t> f34802e;

    /* renamed from: f */
    private final Object f34803f;

    /* renamed from: g */
    private final ArrayList<InterfaceC9045t> f34804g;

    /* compiled from: FileDownloadMessageStation.java */
    /* renamed from: e.h.a.j$a */
    static class a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ InterfaceC9045t f34805f;

        a(InterfaceC9045t interfaceC9045t) {
            this.f34805f = interfaceC9045t;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f34805f.mo28945m();
        }
    }

    /* compiled from: FileDownloadMessageStation.java */
    /* renamed from: e.h.a.j$b */
    private static final class b {

        /* renamed from: a */
        private static final C9027j f34806a = new C9027j(null);
    }

    /* compiled from: FileDownloadMessageStation.java */
    /* renamed from: e.h.a.j$c */
    private static class c implements Handler.Callback {
        private c() {
        }

        /* renamed from: a */
        private void m28924a(ArrayList<InterfaceC9045t> arrayList) {
            Iterator<InterfaceC9045t> it = arrayList.iterator();
            while (it.hasNext()) {
                InterfaceC9045t next = it.next();
                if (!C9027j.m28918f(next)) {
                    next.mo28945m();
                }
            }
            arrayList.clear();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                ((InterfaceC9045t) message.obj).mo28945m();
            } else if (i2 == 2) {
                m28924a((ArrayList) message.obj);
                C9027j.m28916d().m28920h();
            }
            return true;
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* synthetic */ C9027j(a aVar) {
        this();
    }

    /* renamed from: c */
    private void m28915c(InterfaceC9045t interfaceC9045t) {
        synchronized (this.f34803f) {
            this.f34802e.offer(interfaceC9045t);
        }
        m28920h();
    }

    /* renamed from: d */
    public static C9027j m28916d() {
        return b.f34806a;
    }

    /* renamed from: e */
    private void m28917e(InterfaceC9045t interfaceC9045t) {
        Handler handler = this.f34801d;
        handler.sendMessage(handler.obtainMessage(1, interfaceC9045t));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static boolean m28918f(InterfaceC9045t interfaceC9045t) {
        if (!interfaceC9045t.mo28942j()) {
            return false;
        }
        f34798a.execute(new a(interfaceC9045t));
        return true;
    }

    /* renamed from: g */
    public static boolean m28919g() {
        return f34799b > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m28920h() {
        synchronized (this.f34803f) {
            if (this.f34804g.isEmpty()) {
                if (this.f34802e.isEmpty()) {
                    return;
                }
                int i2 = 0;
                if (m28919g()) {
                    int i3 = f34799b;
                    int iMin = Math.min(this.f34802e.size(), f34800c);
                    while (i2 < iMin) {
                        this.f34804g.add(this.f34802e.remove());
                        i2++;
                    }
                    i2 = i3;
                } else {
                    this.f34802e.drainTo(this.f34804g);
                }
                Handler handler = this.f34801d;
                handler.sendMessageDelayed(handler.obtainMessage(2, this.f34804g), i2);
            }
        }
    }

    /* renamed from: i */
    void m28921i(InterfaceC9045t interfaceC9045t) {
        m28922j(interfaceC9045t, false);
    }

    /* renamed from: j */
    void m28922j(InterfaceC9045t interfaceC9045t, boolean z) {
        if (interfaceC9045t.mo28933a()) {
            interfaceC9045t.mo28945m();
            return;
        }
        if (m28918f(interfaceC9045t)) {
            return;
        }
        if (!m28919g() && !this.f34802e.isEmpty()) {
            synchronized (this.f34803f) {
                if (!this.f34802e.isEmpty()) {
                    Iterator<InterfaceC9045t> it = this.f34802e.iterator();
                    while (it.hasNext()) {
                        m28917e(it.next());
                    }
                }
                this.f34802e.clear();
            }
        }
        if (!m28919g() || z) {
            m28917e(interfaceC9045t);
        } else {
            m28915c(interfaceC9045t);
        }
    }

    private C9027j() {
        this.f34803f = new Object();
        this.f34804g = new ArrayList<>();
        this.f34801d = new Handler(Looper.getMainLooper(), new c(null));
        this.f34802e = new LinkedBlockingQueue<>();
    }
}
