package com.airbnb.epoxy;

import android.os.Handler;
import androidx.recyclerview.widget.C0625f;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: AsyncEpoxyDiffer.java */
/* renamed from: com.airbnb.epoxy.c */
/* loaded from: classes.dex */
class C5131c {

    /* renamed from: a */
    private final Executor f12190a;

    /* renamed from: b */
    private final e f12191b;

    /* renamed from: c */
    private final C0625f.d<AbstractC5166s<?>> f12192c;

    /* renamed from: e */
    private volatile List<? extends AbstractC5166s<?>> f12194e;

    /* renamed from: d */
    private final d f12193d = new d(null);

    /* renamed from: f */
    private volatile List<? extends AbstractC5166s<?>> f12195f = Collections.emptyList();

    /* compiled from: AsyncEpoxyDiffer.java */
    /* renamed from: com.airbnb.epoxy.c$a */
    class a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ c f12196f;

        /* renamed from: g */
        final /* synthetic */ int f12197g;

        /* renamed from: h */
        final /* synthetic */ List f12198h;

        /* renamed from: i */
        final /* synthetic */ List f12199i;

        a(c cVar, int i2, List list, List list2) {
            this.f12196f = cVar;
            this.f12197g = i2;
            this.f12198h = list;
            this.f12199i = list2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0625f.c cVarM4469a = C0625f.m4469a(this.f12196f);
            C5131c c5131c = C5131c.this;
            int i2 = this.f12197g;
            List list = this.f12198h;
            c5131c.m9205h(i2, list, C5147k.m9302b(this.f12199i, list, cVarM4469a));
        }
    }

    /* compiled from: AsyncEpoxyDiffer.java */
    /* renamed from: com.airbnb.epoxy.c$b */
    class b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ List f12201f;

        /* renamed from: g */
        final /* synthetic */ int f12202g;

        /* renamed from: h */
        final /* synthetic */ C5147k f12203h;

        b(List list, int i2, C5147k c5147k) {
            this.f12201f = list;
            this.f12202g = i2;
            this.f12203h = c5147k;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zM9206j = C5131c.this.m9206j(this.f12201f, this.f12202g);
            if (this.f12203h == null || !zM9206j) {
                return;
            }
            C5131c.this.f12191b.mo9216d(this.f12203h);
        }
    }

    /* compiled from: AsyncEpoxyDiffer.java */
    /* renamed from: com.airbnb.epoxy.c$c */
    private static class c extends C0625f.b {

        /* renamed from: a */
        final List<? extends AbstractC5166s<?>> f12205a;

        /* renamed from: b */
        final List<? extends AbstractC5166s<?>> f12206b;

        /* renamed from: c */
        private final C0625f.d<AbstractC5166s<?>> f12207c;

        c(List<? extends AbstractC5166s<?>> list, List<? extends AbstractC5166s<?>> list2, C0625f.d<AbstractC5166s<?>> dVar) {
            this.f12205a = list;
            this.f12206b = list2;
            this.f12207c = dVar;
        }

        @Override // androidx.recyclerview.widget.C0625f.b
        public boolean areContentsTheSame(int i2, int i3) {
            return this.f12207c.mo4483a(this.f12205a.get(i2), this.f12206b.get(i3));
        }

        @Override // androidx.recyclerview.widget.C0625f.b
        public boolean areItemsTheSame(int i2, int i3) {
            return this.f12207c.mo4484b(this.f12205a.get(i2), this.f12206b.get(i3));
        }

        @Override // androidx.recyclerview.widget.C0625f.b
        public Object getChangePayload(int i2, int i3) {
            return this.f12207c.mo4485c(this.f12205a.get(i2), this.f12206b.get(i3));
        }

        @Override // androidx.recyclerview.widget.C0625f.b
        public int getNewListSize() {
            return this.f12206b.size();
        }

        @Override // androidx.recyclerview.widget.C0625f.b
        public int getOldListSize() {
            return this.f12205a.size();
        }
    }

    /* compiled from: AsyncEpoxyDiffer.java */
    /* renamed from: com.airbnb.epoxy.c$d */
    private static class d {

        /* renamed from: a */
        private volatile int f12208a;

        /* renamed from: b */
        private volatile int f12209b;

        private d() {
        }

        /* renamed from: a */
        synchronized boolean m9212a(int i2) {
            boolean z;
            z = this.f12208a == i2 && i2 > this.f12209b;
            if (z) {
                this.f12209b = i2;
            }
            return z;
        }

        /* renamed from: b */
        synchronized boolean m9213b() {
            boolean zM9214c;
            zM9214c = m9214c();
            this.f12209b = this.f12208a;
            return zM9214c;
        }

        /* renamed from: c */
        synchronized boolean m9214c() {
            return this.f12208a > this.f12209b;
        }

        /* renamed from: d */
        synchronized int m9215d() {
            int i2;
            i2 = this.f12208a + 1;
            this.f12208a = i2;
            return i2;
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* compiled from: AsyncEpoxyDiffer.java */
    /* renamed from: com.airbnb.epoxy.c$e */
    interface e {
        /* renamed from: d */
        void mo9216d(C5147k c5147k);
    }

    C5131c(Handler handler, e eVar, C0625f.d<AbstractC5166s<?>> dVar) {
        this.f12190a = new ExecutorC5170w(handler);
        this.f12191b = eVar;
        this.f12192c = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m9205h(int i2, List<? extends AbstractC5166s<?>> list, C5147k c5147k) {
        C5130b0.f12189h.execute(new b(list, i2, c5147k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public synchronized boolean m9206j(List<? extends AbstractC5166s<?>> list, int i2) {
        if (!this.f12193d.m9212a(i2)) {
            return false;
        }
        this.f12194e = list;
        if (list == null) {
            this.f12195f = Collections.emptyList();
        } else {
            this.f12195f = Collections.unmodifiableList(list);
        }
        return true;
    }

    /* renamed from: d */
    public boolean m9207d() {
        return this.f12193d.m9213b();
    }

    /* renamed from: e */
    public synchronized boolean m9208e(List<AbstractC5166s<?>> list) {
        boolean zM9207d;
        zM9207d = m9207d();
        m9206j(list, this.f12193d.m9215d());
        return zM9207d;
    }

    /* renamed from: f */
    public List<? extends AbstractC5166s<?>> m9209f() {
        return this.f12195f;
    }

    /* renamed from: g */
    public boolean m9210g() {
        return this.f12193d.m9214c();
    }

    /* renamed from: i */
    public void m9211i(List<? extends AbstractC5166s<?>> list) {
        int iM9215d;
        List<? extends AbstractC5166s<?>> list2;
        synchronized (this) {
            iM9215d = this.f12193d.m9215d();
            list2 = this.f12194e;
        }
        if (list == list2) {
            m9205h(iM9215d, list, C5147k.m9304f(list2));
            return;
        }
        if (list == null || list.isEmpty()) {
            m9205h(iM9215d, null, (list2 == null || list2.isEmpty()) ? null : C5147k.m9301a(list2));
        } else if (list2 == null || list2.isEmpty()) {
            m9205h(iM9215d, list, C5147k.m9303e(list));
        } else {
            this.f12190a.execute(new a(new c(list2, list, this.f12192c), iM9215d, list, list2));
        }
    }
}
