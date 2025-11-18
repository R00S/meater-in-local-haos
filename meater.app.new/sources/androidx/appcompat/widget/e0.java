package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
import j.C3699a;
import n.C4046a;
import s1.C4434g0;
import s1.C4438i0;

/* compiled from: ToolbarWidgetWrapper.java */
/* loaded from: classes.dex */
public class e0 implements D {

    /* renamed from: a, reason: collision with root package name */
    Toolbar f21660a;

    /* renamed from: b, reason: collision with root package name */
    private int f21661b;

    /* renamed from: c, reason: collision with root package name */
    private View f21662c;

    /* renamed from: d, reason: collision with root package name */
    private View f21663d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f21664e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f21665f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f21666g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f21667h;

    /* renamed from: i, reason: collision with root package name */
    CharSequence f21668i;

    /* renamed from: j, reason: collision with root package name */
    private CharSequence f21669j;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f21670k;

    /* renamed from: l, reason: collision with root package name */
    Window.Callback f21671l;

    /* renamed from: m, reason: collision with root package name */
    boolean f21672m;

    /* renamed from: n, reason: collision with root package name */
    private C1981c f21673n;

    /* renamed from: o, reason: collision with root package name */
    private int f21674o;

    /* renamed from: p, reason: collision with root package name */
    private int f21675p;

    /* renamed from: q, reason: collision with root package name */
    private Drawable f21676q;

    /* compiled from: ToolbarWidgetWrapper.java */
    class a implements View.OnClickListener {

        /* renamed from: B, reason: collision with root package name */
        final C4046a f21677B;

        a() {
            this.f21677B = new C4046a(e0.this.f21660a.getContext(), 0, R.id.home, 0, 0, e0.this.f21668i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e0 e0Var = e0.this;
            Window.Callback callback = e0Var.f21671l;
            if (callback == null || !e0Var.f21672m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f21677B);
        }
    }

    /* compiled from: ToolbarWidgetWrapper.java */
    class b extends C4438i0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f21679a = false;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f21680b;

        b(int i10) {
            this.f21680b = i10;
        }

        @Override // s1.C4438i0, s1.InterfaceC4436h0
        public void a(View view) {
            this.f21679a = true;
        }

        @Override // s1.InterfaceC4436h0
        public void b(View view) {
            if (this.f21679a) {
                return;
            }
            e0.this.f21660a.setVisibility(this.f21680b);
        }

        @Override // s1.C4438i0, s1.InterfaceC4436h0
        public void c(View view) {
            e0.this.f21660a.setVisibility(0);
        }
    }

    public e0(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, i.h.f42545a, i.e.f42472n);
    }

    private void G(CharSequence charSequence) {
        this.f21668i = charSequence;
        if ((this.f21661b & 8) != 0) {
            this.f21660a.setTitle(charSequence);
            if (this.f21667h) {
                s1.X.q0(this.f21660a.getRootView(), charSequence);
            }
        }
    }

    private void H() {
        if ((this.f21661b & 4) != 0) {
            if (TextUtils.isEmpty(this.f21670k)) {
                this.f21660a.setNavigationContentDescription(this.f21675p);
            } else {
                this.f21660a.setNavigationContentDescription(this.f21670k);
            }
        }
    }

    private void I() {
        if ((this.f21661b & 4) == 0) {
            this.f21660a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f21660a;
        Drawable drawable = this.f21666g;
        if (drawable == null) {
            drawable = this.f21676q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void J() {
        Drawable drawable;
        int i10 = this.f21661b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f21665f) == null) {
            drawable = this.f21664e;
        }
        this.f21660a.setLogo(drawable);
    }

    private int z() {
        if (this.f21660a.getNavigationIcon() == null) {
            return 11;
        }
        this.f21676q = this.f21660a.getNavigationIcon();
        return 15;
    }

    public void A(int i10) {
        if (i10 == this.f21675p) {
            return;
        }
        this.f21675p = i10;
        if (TextUtils.isEmpty(this.f21660a.getNavigationContentDescription())) {
            C(this.f21675p);
        }
    }

    public void B(Drawable drawable) {
        this.f21665f = drawable;
        J();
    }

    public void C(int i10) {
        D(i10 == 0 ? null : getContext().getString(i10));
    }

    public void D(CharSequence charSequence) {
        this.f21670k = charSequence;
        H();
    }

    public void E(Drawable drawable) {
        this.f21666g = drawable;
        I();
    }

    public void F(CharSequence charSequence) {
        this.f21669j = charSequence;
        if ((this.f21661b & 8) != 0) {
            this.f21660a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.D
    public void a(Menu menu, j.a aVar) {
        if (this.f21673n == null) {
            C1981c c1981c = new C1981c(this.f21660a.getContext());
            this.f21673n = c1981c;
            c1981c.s(i.f.f42506g);
        }
        this.f21673n.i(aVar);
        this.f21660a.N((androidx.appcompat.view.menu.e) menu, this.f21673n);
    }

    @Override // androidx.appcompat.widget.D
    public boolean b() {
        return this.f21660a.D();
    }

    @Override // androidx.appcompat.widget.D
    public void c() {
        this.f21672m = true;
    }

    @Override // androidx.appcompat.widget.D
    public void collapseActionView() {
        this.f21660a.e();
    }

    @Override // androidx.appcompat.widget.D
    public boolean d() {
        return this.f21660a.d();
    }

    @Override // androidx.appcompat.widget.D
    public boolean e() {
        return this.f21660a.B();
    }

    @Override // androidx.appcompat.widget.D
    public boolean f() {
        return this.f21660a.x();
    }

    @Override // androidx.appcompat.widget.D
    public boolean g() {
        return this.f21660a.T();
    }

    @Override // androidx.appcompat.widget.D
    public Context getContext() {
        return this.f21660a.getContext();
    }

    @Override // androidx.appcompat.widget.D
    public CharSequence getTitle() {
        return this.f21660a.getTitle();
    }

    @Override // androidx.appcompat.widget.D
    public void h() {
        this.f21660a.f();
    }

    @Override // androidx.appcompat.widget.D
    public View i() {
        return this.f21663d;
    }

    @Override // androidx.appcompat.widget.D
    public void j(T t10) {
        View view = this.f21662c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f21660a;
            if (parent == toolbar) {
                toolbar.removeView(this.f21662c);
            }
        }
        this.f21662c = t10;
        if (t10 == null || this.f21674o != 2) {
            return;
        }
        this.f21660a.addView(t10, 0);
        Toolbar.g gVar = (Toolbar.g) this.f21662c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) gVar).width = -2;
        ((ViewGroup.MarginLayoutParams) gVar).height = -2;
        gVar.f20638a = 8388691;
        t10.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.D
    public boolean k() {
        return this.f21660a.w();
    }

    @Override // androidx.appcompat.widget.D
    public void l(int i10) {
        View view;
        int i11 = this.f21661b ^ i10;
        this.f21661b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    H();
                }
                I();
            }
            if ((i11 & 3) != 0) {
                J();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f21660a.setTitle(this.f21668i);
                    this.f21660a.setSubtitle(this.f21669j);
                } else {
                    this.f21660a.setTitle((CharSequence) null);
                    this.f21660a.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.f21663d) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                this.f21660a.addView(view);
            } else {
                this.f21660a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.D
    public Menu m() {
        return this.f21660a.getMenu();
    }

    @Override // androidx.appcompat.widget.D
    public void n(int i10) {
        B(i10 != 0 ? C3699a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.D
    public int o() {
        return this.f21674o;
    }

    @Override // androidx.appcompat.widget.D
    public C4434g0 p(int i10, long j10) {
        return s1.X.e(this.f21660a).b(i10 == 0 ? 1.0f : 0.0f).f(j10).h(new b(i10));
    }

    @Override // androidx.appcompat.widget.D
    public void q(j.a aVar, e.a aVar2) {
        this.f21660a.O(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.D
    public void r(int i10) {
        this.f21660a.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.D
    public ViewGroup s() {
        return this.f21660a;
    }

    @Override // androidx.appcompat.widget.D
    public void setIcon(int i10) {
        setIcon(i10 != 0 ? C3699a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.D
    public void setTitle(CharSequence charSequence) {
        this.f21667h = true;
        G(charSequence);
    }

    @Override // androidx.appcompat.widget.D
    public void setWindowCallback(Window.Callback callback) {
        this.f21671l = callback;
    }

    @Override // androidx.appcompat.widget.D
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f21667h) {
            return;
        }
        G(charSequence);
    }

    @Override // androidx.appcompat.widget.D
    public int u() {
        return this.f21661b;
    }

    @Override // androidx.appcompat.widget.D
    public void v(View view) {
        View view2 = this.f21663d;
        if (view2 != null && (this.f21661b & 16) != 0) {
            this.f21660a.removeView(view2);
        }
        this.f21663d = view;
        if (view == null || (this.f21661b & 16) == 0) {
            return;
        }
        this.f21660a.addView(view);
    }

    @Override // androidx.appcompat.widget.D
    public void w() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.D
    public void x() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.D
    public void y(boolean z10) {
        this.f21660a.setCollapsible(z10);
    }

    public e0(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f21674o = 0;
        this.f21675p = 0;
        this.f21660a = toolbar;
        this.f21668i = toolbar.getTitle();
        this.f21669j = toolbar.getSubtitle();
        this.f21667h = this.f21668i != null;
        this.f21666g = toolbar.getNavigationIcon();
        a0 a0VarV = a0.v(toolbar.getContext(), null, i.j.f42684a, i.a.f42396c, 0);
        this.f21676q = a0VarV.g(i.j.f42739l);
        if (z10) {
            CharSequence charSequenceP = a0VarV.p(i.j.f42769r);
            if (!TextUtils.isEmpty(charSequenceP)) {
                setTitle(charSequenceP);
            }
            CharSequence charSequenceP2 = a0VarV.p(i.j.f42759p);
            if (!TextUtils.isEmpty(charSequenceP2)) {
                F(charSequenceP2);
            }
            Drawable drawableG = a0VarV.g(i.j.f42749n);
            if (drawableG != null) {
                B(drawableG);
            }
            Drawable drawableG2 = a0VarV.g(i.j.f42744m);
            if (drawableG2 != null) {
                setIcon(drawableG2);
            }
            if (this.f21666g == null && (drawable = this.f21676q) != null) {
                E(drawable);
            }
            l(a0VarV.k(i.j.f42719h, 0));
            int iN = a0VarV.n(i.j.f42714g, 0);
            if (iN != 0) {
                v(LayoutInflater.from(this.f21660a.getContext()).inflate(iN, (ViewGroup) this.f21660a, false));
                l(this.f21661b | 16);
            }
            int iM = a0VarV.m(i.j.f42729j, 0);
            if (iM > 0) {
                ViewGroup.LayoutParams layoutParams = this.f21660a.getLayoutParams();
                layoutParams.height = iM;
                this.f21660a.setLayoutParams(layoutParams);
            }
            int iE = a0VarV.e(i.j.f42709f, -1);
            int iE2 = a0VarV.e(i.j.f42704e, -1);
            if (iE >= 0 || iE2 >= 0) {
                this.f21660a.M(Math.max(iE, 0), Math.max(iE2, 0));
            }
            int iN2 = a0VarV.n(i.j.f42774s, 0);
            if (iN2 != 0) {
                Toolbar toolbar2 = this.f21660a;
                toolbar2.Q(toolbar2.getContext(), iN2);
            }
            int iN3 = a0VarV.n(i.j.f42764q, 0);
            if (iN3 != 0) {
                Toolbar toolbar3 = this.f21660a;
                toolbar3.P(toolbar3.getContext(), iN3);
            }
            int iN4 = a0VarV.n(i.j.f42754o, 0);
            if (iN4 != 0) {
                this.f21660a.setPopupTheme(iN4);
            }
        } else {
            this.f21661b = z();
        }
        a0VarV.x();
        A(i10);
        this.f21670k = this.f21660a.getNavigationContentDescription();
        this.f21660a.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.widget.D
    public void setIcon(Drawable drawable) {
        this.f21664e = drawable;
        J();
    }

    @Override // androidx.appcompat.widget.D
    public void t(boolean z10) {
    }
}
