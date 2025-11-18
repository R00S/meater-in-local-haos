package p024c.p025a.p032o;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* compiled from: ActionMode.java */
/* renamed from: c.a.o.b */
/* loaded from: classes.dex */
public abstract class AbstractC0842b {

    /* renamed from: f */
    private Object f5556f;

    /* renamed from: g */
    private boolean f5557g;

    /* compiled from: ActionMode.java */
    /* renamed from: c.a.o.b$a */
    public interface a {
        /* renamed from: a */
        void mo368a(AbstractC0842b abstractC0842b);

        /* renamed from: b */
        boolean mo369b(AbstractC0842b abstractC0842b, Menu menu);

        /* renamed from: c */
        boolean mo370c(AbstractC0842b abstractC0842b, Menu menu);

        /* renamed from: d */
        boolean mo371d(AbstractC0842b abstractC0842b, MenuItem menuItem);
    }

    /* renamed from: c */
    public abstract void mo452c();

    /* renamed from: d */
    public abstract View mo453d();

    /* renamed from: e */
    public abstract Menu mo454e();

    /* renamed from: f */
    public abstract MenuInflater mo455f();

    /* renamed from: g */
    public abstract CharSequence mo456g();

    /* renamed from: h */
    public Object m5339h() {
        return this.f5556f;
    }

    /* renamed from: i */
    public abstract CharSequence mo457i();

    /* renamed from: j */
    public boolean m5340j() {
        return this.f5557g;
    }

    /* renamed from: k */
    public abstract void mo458k();

    /* renamed from: l */
    public abstract boolean mo459l();

    /* renamed from: m */
    public abstract void mo460m(View view);

    /* renamed from: n */
    public abstract void mo461n(int i2);

    /* renamed from: o */
    public abstract void mo462o(CharSequence charSequence);

    /* renamed from: p */
    public void m5341p(Object obj) {
        this.f5556f = obj;
    }

    /* renamed from: q */
    public abstract void mo463q(int i2);

    /* renamed from: r */
    public abstract void mo464r(CharSequence charSequence);

    /* renamed from: s */
    public void mo465s(boolean z) {
        this.f5557g = z;
    }
}
