package androidx.work.impl.p013m.p015f;

import android.content.Context;
import androidx.work.AbstractC0807n;
import androidx.work.impl.p013m.InterfaceC0741a;
import androidx.work.impl.utils.p018p.InterfaceC0799a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: ConstraintTracker.java */
/* renamed from: androidx.work.impl.m.f.d */
/* loaded from: classes.dex */
public abstract class AbstractC0756d<T> {

    /* renamed from: a */
    private static final String f4746a = AbstractC0807n.m5223f("ConstraintTracker");

    /* renamed from: b */
    protected final InterfaceC0799a f4747b;

    /* renamed from: c */
    protected final Context f4748c;

    /* renamed from: d */
    private final Object f4749d = new Object();

    /* renamed from: e */
    private final Set<InterfaceC0741a<T>> f4750e = new LinkedHashSet();

    /* renamed from: f */
    T f4751f;

    /* compiled from: ConstraintTracker.java */
    /* renamed from: androidx.work.impl.m.f.d$a */
    class a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ List f4752f;

        a(List list) {
            this.f4752f = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f4752f.iterator();
            while (it.hasNext()) {
                ((InterfaceC0741a) it.next()).mo5026a(AbstractC0756d.this.f4751f);
            }
        }
    }

    AbstractC0756d(Context context, InterfaceC0799a interfaceC0799a) {
        this.f4748c = context.getApplicationContext();
        this.f4747b = interfaceC0799a;
    }

    /* renamed from: a */
    public void m5058a(InterfaceC0741a<T> interfaceC0741a) {
        synchronized (this.f4749d) {
            if (this.f4750e.add(interfaceC0741a)) {
                if (this.f4750e.size() == 1) {
                    this.f4751f = mo5051b();
                    AbstractC0807n.m5221c().mo5224a(f4746a, String.format("%s: initial state = %s", getClass().getSimpleName(), this.f4751f), new Throwable[0]);
                    mo5056e();
                }
                interfaceC0741a.mo5026a(this.f4751f);
            }
        }
    }

    /* renamed from: b */
    public abstract T mo5051b();

    /* renamed from: c */
    public void m5059c(InterfaceC0741a<T> interfaceC0741a) {
        synchronized (this.f4749d) {
            if (this.f4750e.remove(interfaceC0741a) && this.f4750e.isEmpty()) {
                mo5057f();
            }
        }
    }

    /* renamed from: d */
    public void m5060d(T t) {
        synchronized (this.f4749d) {
            T t2 = this.f4751f;
            if (t2 != t && (t2 == null || !t2.equals(t))) {
                this.f4751f = t;
                this.f4747b.mo5204a().execute(new a(new ArrayList(this.f4750e)));
            }
        }
    }

    /* renamed from: e */
    public abstract void mo5056e();

    /* renamed from: f */
    public abstract void mo5057f();
}
