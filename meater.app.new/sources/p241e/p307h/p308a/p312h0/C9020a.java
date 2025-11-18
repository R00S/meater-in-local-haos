package p241e.p307h.p308a.p312h0;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.Executor;
import p241e.p307h.p308a.p315k0.C9032b;
import p241e.p307h.p308a.p315k0.C9034d;

/* compiled from: DownloadEventPoolImpl.java */
/* renamed from: e.h.a.h0.a */
/* loaded from: classes2.dex */
public class C9020a {

    /* renamed from: a */
    private final Executor f34784a = C9032b.m28953a(10, "EventPool");

    /* renamed from: b */
    private final HashMap<String, LinkedList<AbstractC9023d>> f34785b = new HashMap<>();

    /* compiled from: DownloadEventPoolImpl.java */
    /* renamed from: e.h.a.h0.a$a */
    class a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ AbstractC9022c f34786f;

        a(AbstractC9022c abstractC9022c) {
            this.f34786f = abstractC9022c;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9020a.this.m28907c(this.f34786f);
        }
    }

    /* renamed from: d */
    private void m28904d(LinkedList<AbstractC9023d> linkedList, AbstractC9022c abstractC9022c) {
        for (Object obj : linkedList.toArray()) {
            if (obj != null && ((AbstractC9023d) obj).mo28713d(abstractC9022c)) {
                break;
            }
        }
        Runnable runnable = abstractC9022c.f34794a;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public boolean m28905a(String str, AbstractC9023d abstractC9023d) {
        boolean zAdd;
        if (C9034d.f34819a) {
            C9034d.m28969h(this, "setListener %s", str);
        }
        if (abstractC9023d == null) {
            throw new IllegalArgumentException("listener must not be null!");
        }
        LinkedList<AbstractC9023d> linkedList = this.f34785b.get(str);
        if (linkedList == null) {
            synchronized (str.intern()) {
                linkedList = this.f34785b.get(str);
                if (linkedList == null) {
                    HashMap<String, LinkedList<AbstractC9023d>> map = this.f34785b;
                    LinkedList<AbstractC9023d> linkedList2 = new LinkedList<>();
                    map.put(str, linkedList2);
                    linkedList = linkedList2;
                }
            }
        }
        synchronized (str.intern()) {
            zAdd = linkedList.add(abstractC9023d);
        }
        return zAdd;
    }

    /* renamed from: b */
    public void m28906b(AbstractC9022c abstractC9022c) {
        if (C9034d.f34819a) {
            C9034d.m28969h(this, "asyncPublishInNewThread %s", abstractC9022c.m28909a());
        }
        if (abstractC9022c == null) {
            throw new IllegalArgumentException("event must not be null!");
        }
        this.f34784a.execute(new a(abstractC9022c));
    }

    /* renamed from: c */
    public boolean m28907c(AbstractC9022c abstractC9022c) {
        if (C9034d.f34819a) {
            C9034d.m28969h(this, "publish %s", abstractC9022c.m28909a());
        }
        if (abstractC9022c == null) {
            throw new IllegalArgumentException("event must not be null!");
        }
        String strM28909a = abstractC9022c.m28909a();
        LinkedList<AbstractC9023d> linkedList = this.f34785b.get(strM28909a);
        if (linkedList == null) {
            synchronized (strM28909a.intern()) {
                linkedList = this.f34785b.get(strM28909a);
                if (linkedList == null) {
                    if (C9034d.f34819a) {
                        C9034d.m28962a(this, "No listener for this event %s", strM28909a);
                    }
                    return false;
                }
            }
        }
        m28904d(linkedList, abstractC9022c);
        return true;
    }
}
