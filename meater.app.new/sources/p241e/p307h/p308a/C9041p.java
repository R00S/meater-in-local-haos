package p241e.p307h.p308a;

import com.liulishuo.filedownloader.message.C8694b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import p241e.p307h.p308a.InterfaceC9049x;
import p241e.p307h.p308a.p315k0.C9032b;
import p241e.p307h.p308a.p315k0.C9034d;

/* compiled from: FileDownloadTaskLauncher.java */
/* renamed from: e.h.a.p */
/* loaded from: classes2.dex */
class C9041p {

    /* renamed from: a */
    private final b f34842a = new b();

    /* compiled from: FileDownloadTaskLauncher.java */
    /* renamed from: e.h.a.p$a */
    private static class a {

        /* renamed from: a */
        private static final C9041p f34843a = new C9041p();

        static {
            C8694b.m27535a().m27537c(new C8992a0());
        }
    }

    /* compiled from: FileDownloadTaskLauncher.java */
    /* renamed from: e.h.a.p$b */
    private static class b {

        /* renamed from: a */
        private ThreadPoolExecutor f34844a;

        /* renamed from: b */
        private LinkedBlockingQueue<Runnable> f34845b;

        b() {
            m29046d();
        }

        /* renamed from: d */
        private void m29046d() {
            LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<>();
            this.f34845b = linkedBlockingQueue;
            this.f34844a = C9032b.m28954b(3, linkedBlockingQueue, "LauncherTask");
        }

        /* renamed from: a */
        public void m29047a(InterfaceC9049x.b bVar) {
            this.f34844a.execute(new c(bVar));
        }

        /* renamed from: b */
        public void m29048b(AbstractC9024i abstractC9024i) {
            if (abstractC9024i == null) {
                C9034d.m28970i(this, "want to expire by listener, but the listener provided is null", new Object[0]);
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<Runnable> it = this.f34845b.iterator();
            while (it.hasNext()) {
                Runnable next = it.next();
                c cVar = (c) next;
                if (cVar.m29051b(abstractC9024i)) {
                    cVar.m29050a();
                    arrayList.add(next);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            if (C9034d.f34819a) {
                C9034d.m28962a(this, "expire %d tasks with listener[%s]", Integer.valueOf(arrayList.size()), abstractC9024i);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                this.f34844a.remove((Runnable) it2.next());
            }
        }

        /* renamed from: c */
        public void m29049c(InterfaceC9049x.b bVar) {
            this.f34845b.remove(bVar);
        }
    }

    /* compiled from: FileDownloadTaskLauncher.java */
    /* renamed from: e.h.a.p$c */
    private static class c implements Runnable {

        /* renamed from: f */
        private final InterfaceC9049x.b f34846f;

        /* renamed from: g */
        private boolean f34847g = false;

        c(InterfaceC9049x.b bVar) {
            this.f34846f = bVar;
        }

        /* renamed from: a */
        public void m29050a() {
            this.f34847g = true;
        }

        /* renamed from: b */
        public boolean m29051b(AbstractC9024i abstractC9024i) {
            InterfaceC9049x.b bVar = this.f34846f;
            return bVar != null && bVar.mo28712r(abstractC9024i);
        }

        public boolean equals(Object obj) {
            return super.equals(obj) || obj == this.f34846f;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f34847g) {
                return;
            }
            this.f34846f.start();
        }
    }

    C9041p() {
    }

    /* renamed from: c */
    public static C9041p m29041c() {
        return a.f34843a;
    }

    /* renamed from: a */
    synchronized void m29042a(AbstractC9024i abstractC9024i) {
        this.f34842a.m29048b(abstractC9024i);
    }

    /* renamed from: b */
    synchronized void m29043b(InterfaceC9049x.b bVar) {
        this.f34842a.m29049c(bVar);
    }

    /* renamed from: d */
    synchronized void m29044d(InterfaceC9049x.b bVar) {
        this.f34842a.m29047a(bVar);
    }
}
