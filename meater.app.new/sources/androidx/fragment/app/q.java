package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;

/* compiled from: FragmentController.java */
/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private final s<?> f25715a;

    private q(s<?> sVar) {
        this.f25715a = sVar;
    }

    public static q b(s<?> sVar) {
        return new q((s) r1.i.h(sVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        v fragmentManager = this.f25715a.getFragmentManager();
        s<?> sVar = this.f25715a;
        fragmentManager.p(sVar, sVar, fragment);
    }

    public void c() {
        this.f25715a.getFragmentManager().C();
    }

    public boolean d(MenuItem menuItem) {
        return this.f25715a.getFragmentManager().F(menuItem);
    }

    public void e() {
        this.f25715a.getFragmentManager().G();
    }

    public void f() {
        this.f25715a.getFragmentManager().I();
    }

    public void g() {
        this.f25715a.getFragmentManager().R();
    }

    public void h() {
        this.f25715a.getFragmentManager().V();
    }

    public void i() {
        this.f25715a.getFragmentManager().W();
    }

    public void j() {
        this.f25715a.getFragmentManager().Y();
    }

    public boolean k() {
        return this.f25715a.getFragmentManager().f0(true);
    }

    public v l() {
        return this.f25715a.getFragmentManager();
    }

    public void m() {
        this.f25715a.getFragmentManager().g1();
    }

    public View n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f25715a.getFragmentManager().E0().onCreateView(view, str, context, attributeSet);
    }
}
