package A6;

import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: RequestTracker.java */
/* loaded from: classes2.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private final Set<D6.d> f929a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private final Set<D6.d> f930b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private boolean f931c;

    public boolean a(D6.d dVar) {
        boolean z10 = true;
        if (dVar == null) {
            return true;
        }
        boolean zRemove = this.f929a.remove(dVar);
        if (!this.f930b.remove(dVar) && !zRemove) {
            z10 = false;
        }
        if (z10) {
            dVar.clear();
        }
        return z10;
    }

    public void b() {
        Iterator it = H6.l.j(this.f929a).iterator();
        while (it.hasNext()) {
            a((D6.d) it.next());
        }
        this.f930b.clear();
    }

    public void c() {
        this.f931c = true;
        for (D6.d dVar : H6.l.j(this.f929a)) {
            if (dVar.isRunning() || dVar.k()) {
                dVar.clear();
                this.f930b.add(dVar);
            }
        }
    }

    public void d() {
        this.f931c = true;
        for (D6.d dVar : H6.l.j(this.f929a)) {
            if (dVar.isRunning()) {
                dVar.f();
                this.f930b.add(dVar);
            }
        }
    }

    public void e() {
        for (D6.d dVar : H6.l.j(this.f929a)) {
            if (!dVar.k() && !dVar.i()) {
                dVar.clear();
                if (this.f931c) {
                    this.f930b.add(dVar);
                } else {
                    dVar.j();
                }
            }
        }
    }

    public void f() {
        this.f931c = false;
        for (D6.d dVar : H6.l.j(this.f929a)) {
            if (!dVar.k() && !dVar.isRunning()) {
                dVar.j();
            }
        }
        this.f930b.clear();
    }

    public void g(D6.d dVar) {
        this.f929a.add(dVar);
        if (!this.f931c) {
            dVar.j();
            return;
        }
        dVar.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f930b.add(dVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f929a.size() + ", isPaused=" + this.f931c + "}";
    }
}
