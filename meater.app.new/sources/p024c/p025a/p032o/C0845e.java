package p024c.p025a.p032o;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0087g;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p024c.p025a.p032o.AbstractC0842b;

/* compiled from: StandaloneActionMode.java */
/* renamed from: c.a.o.e */
/* loaded from: classes.dex */
public class C0845e extends AbstractC0842b implements C0087g.a {

    /* renamed from: h */
    private Context f5563h;

    /* renamed from: i */
    private ActionBarContextView f5564i;

    /* renamed from: j */
    private AbstractC0842b.a f5565j;

    /* renamed from: k */
    private WeakReference<View> f5566k;

    /* renamed from: l */
    private boolean f5567l;

    /* renamed from: m */
    private boolean f5568m;

    /* renamed from: n */
    private C0087g f5569n;

    public C0845e(Context context, ActionBarContextView actionBarContextView, AbstractC0842b.a aVar, boolean z) {
        this.f5563h = context;
        this.f5564i = actionBarContextView;
        this.f5565j = aVar;
        C0087g c0087gM576W = new C0087g(actionBarContextView.getContext()).m576W(1);
        this.f5569n = c0087gM576W;
        c0087gM576W.mo575V(this);
        this.f5568m = z;
    }

    @Override // androidx.appcompat.view.menu.C0087g.a
    /* renamed from: a */
    public boolean mo347a(C0087g c0087g, MenuItem menuItem) {
        return this.f5565j.mo371d(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0087g.a
    /* renamed from: b */
    public void mo349b(C0087g c0087g) {
        mo458k();
        this.f5564i.m675l();
    }

    @Override // p024c.p025a.p032o.AbstractC0842b
    /* renamed from: c */
    public void mo452c() {
        if (this.f5567l) {
            return;
        }
        this.f5567l = true;
        this.f5564i.sendAccessibilityEvent(32);
        this.f5565j.mo368a(this);
    }

    @Override // p024c.p025a.p032o.AbstractC0842b
    /* renamed from: d */
    public View mo453d() {
        WeakReference<View> weakReference = this.f5566k;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // p024c.p025a.p032o.AbstractC0842b
    /* renamed from: e */
    public Menu mo454e() {
        return this.f5569n;
    }

    @Override // p024c.p025a.p032o.AbstractC0842b
    /* renamed from: f */
    public MenuInflater mo455f() {
        return new C0847g(this.f5564i.getContext());
    }

    @Override // p024c.p025a.p032o.AbstractC0842b
    /* renamed from: g */
    public CharSequence mo456g() {
        return this.f5564i.getSubtitle();
    }

    @Override // p024c.p025a.p032o.AbstractC0842b
    /* renamed from: i */
    public CharSequence mo457i() {
        return this.f5564i.getTitle();
    }

    @Override // p024c.p025a.p032o.AbstractC0842b
    /* renamed from: k */
    public void mo458k() {
        this.f5565j.mo370c(this, this.f5569n);
    }

    @Override // p024c.p025a.p032o.AbstractC0842b
    /* renamed from: l */
    public boolean mo459l() {
        return this.f5564i.m673j();
    }

    @Override // p024c.p025a.p032o.AbstractC0842b
    /* renamed from: m */
    public void mo460m(View view) {
        this.f5564i.setCustomView(view);
        this.f5566k = view != null ? new WeakReference<>(view) : null;
    }

    @Override // p024c.p025a.p032o.AbstractC0842b
    /* renamed from: n */
    public void mo461n(int i2) {
        mo462o(this.f5563h.getString(i2));
    }

    @Override // p024c.p025a.p032o.AbstractC0842b
    /* renamed from: o */
    public void mo462o(CharSequence charSequence) {
        this.f5564i.setSubtitle(charSequence);
    }

    @Override // p024c.p025a.p032o.AbstractC0842b
    /* renamed from: q */
    public void mo463q(int i2) {
        mo464r(this.f5563h.getString(i2));
    }

    @Override // p024c.p025a.p032o.AbstractC0842b
    /* renamed from: r */
    public void mo464r(CharSequence charSequence) {
        this.f5564i.setTitle(charSequence);
    }

    @Override // p024c.p025a.p032o.AbstractC0842b
    /* renamed from: s */
    public void mo465s(boolean z) {
        super.mo465s(z);
        this.f5564i.setTitleOptional(z);
    }
}
