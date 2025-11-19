package B4;

import B4.b;
import android.os.Handler;
import android.os.Looper;
import com.apptionlabs.meater_app.model.MEATERDevice;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: MEATERBLEOperationQueue.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: d, reason: collision with root package name */
    private static final Handler f1552d = new Handler(Looper.getMainLooper());

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<b> f1553a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private b f1554b = null;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f1555c = new Runnable() { // from class: B4.d
        @Override // java.lang.Runnable
        public final void run() {
            this.f1550B.k();
        }
    };

    private void f() {
        f1552d.removeCallbacks(this.f1555c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(b bVar) {
        if (bVar.f1538a.E()) {
            if (this.f1553a.size() > 0 || this.f1554b != null) {
                this.f1553a.add(bVar);
                return;
            }
            this.f1554b = bVar;
            bVar.d();
            m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        f();
        b bVar = this.f1554b;
        if (bVar != null) {
            bVar.f();
            this.f1553a.remove(this.f1554b);
            this.f1554b = null;
        }
        b bVarL = l();
        this.f1554b = bVarL;
        if (bVarL != null) {
            this.f1553a.remove(bVarL);
            U4.b.a("Start operation: %s", this.f1554b.toString());
            this.f1554b.d();
            m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        U4.b.a("Timing out operation %s", this.f1554b.toString());
        this.f1554b.a().n();
    }

    private b l() {
        Iterator<b> it = this.f1553a.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f1544g.equals(b.a.High)) {
                return next;
            }
        }
        if (this.f1553a.size() > 0) {
            return this.f1553a.get(0);
        }
        return null;
    }

    private void m() {
        f();
        try {
            f1552d.postDelayed(this.f1555c, this.f1554b != null ? r0.f1543f * 1000 : 15000);
        } catch (Exception e10) {
            U4.b.a("Reset operation timeout failed: %s", e10.getLocalizedMessage());
        }
    }

    public void d(final b bVar) {
        f1552d.post(new Runnable() { // from class: B4.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f1548B.i(bVar);
            }
        });
    }

    public void e(MEATERDevice mEATERDevice) {
        b bVar = this.f1554b;
        if (bVar != null && bVar.a().r() == mEATERDevice) {
            this.f1554b = null;
            f();
        }
        int i10 = 0;
        while (i10 < this.f1553a.size()) {
            b bVar2 = this.f1553a.get(i10);
            if (bVar2.a().r() == mEATERDevice) {
                this.f1553a.remove(bVar2);
                i10--;
            }
            i10++;
        }
    }

    public void g() {
        f1552d.postDelayed(new Runnable() { // from class: B4.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f1551B.j();
            }
        }, 25L);
    }

    public b h() {
        return this.f1554b;
    }
}
