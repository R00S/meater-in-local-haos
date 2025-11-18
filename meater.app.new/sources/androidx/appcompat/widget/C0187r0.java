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
import androidx.appcompat.view.menu.C0081a;
import androidx.appcompat.view.menu.C0087g;
import androidx.appcompat.view.menu.InterfaceC0093m;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C0281a0;
import androidx.core.view.C0311u;
import androidx.core.view.C0315y;
import p024c.p025a.C0823a;
import p024c.p025a.C0827e;
import p024c.p025a.C0828f;
import p024c.p025a.C0830h;
import p024c.p025a.C0832j;
import p024c.p025a.p026k.p027a.C0833a;

/* compiled from: ToolbarWidgetWrapper.java */
/* renamed from: androidx.appcompat.widget.r0 */
/* loaded from: classes.dex */
public class C0187r0 implements InterfaceC0198x {

    /* renamed from: a */
    Toolbar f1244a;

    /* renamed from: b */
    private int f1245b;

    /* renamed from: c */
    private View f1246c;

    /* renamed from: d */
    private View f1247d;

    /* renamed from: e */
    private Drawable f1248e;

    /* renamed from: f */
    private Drawable f1249f;

    /* renamed from: g */
    private Drawable f1250g;

    /* renamed from: h */
    private boolean f1251h;

    /* renamed from: i */
    CharSequence f1252i;

    /* renamed from: j */
    private CharSequence f1253j;

    /* renamed from: k */
    private CharSequence f1254k;

    /* renamed from: l */
    Window.Callback f1255l;

    /* renamed from: m */
    boolean f1256m;

    /* renamed from: n */
    private ActionMenuPresenter f1257n;

    /* renamed from: o */
    private int f1258o;

    /* renamed from: p */
    private int f1259p;

    /* renamed from: q */
    private Drawable f1260q;

    /* compiled from: ToolbarWidgetWrapper.java */
    /* renamed from: androidx.appcompat.widget.r0$a */
    class a implements View.OnClickListener {

        /* renamed from: f */
        final C0081a f1261f;

        a() {
            this.f1261f = new C0081a(C0187r0.this.f1244a.getContext(), 0, R.id.home, 0, 0, C0187r0.this.f1252i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0187r0 c0187r0 = C0187r0.this;
            Window.Callback callback = c0187r0.f1255l;
            if (callback == null || !c0187r0.f1256m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1261f);
        }
    }

    /* compiled from: ToolbarWidgetWrapper.java */
    /* renamed from: androidx.appcompat.widget.r0$b */
    class b extends C0281a0 {

        /* renamed from: a */
        private boolean f1263a = false;

        /* renamed from: b */
        final /* synthetic */ int f1264b;

        b(int i2) {
            this.f1264b = i2;
        }

        @Override // androidx.core.view.C0281a0, androidx.core.view.InterfaceC0316z
        public void onAnimationCancel(View view) {
            this.f1263a = true;
        }

        @Override // androidx.core.view.C0281a0, androidx.core.view.InterfaceC0316z
        public void onAnimationEnd(View view) {
            if (this.f1263a) {
                return;
            }
            C0187r0.this.f1244a.setVisibility(this.f1264b);
        }

        @Override // androidx.core.view.C0281a0, androidx.core.view.InterfaceC0316z
        public void onAnimationStart(View view) {
            C0187r0.this.f1244a.setVisibility(0);
        }
    }

    public C0187r0(Toolbar toolbar, boolean z) {
        this(toolbar, z, C0830h.f5182a, C0827e.f5107n);
    }

    /* renamed from: F */
    private void m1114F(CharSequence charSequence) {
        this.f1252i = charSequence;
        if ((this.f1245b & 8) != 0) {
            this.f1244a.setTitle(charSequence);
        }
    }

    /* renamed from: G */
    private void m1115G() {
        if ((this.f1245b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1254k)) {
                this.f1244a.setNavigationContentDescription(this.f1259p);
            } else {
                this.f1244a.setNavigationContentDescription(this.f1254k);
            }
        }
    }

    /* renamed from: H */
    private void m1116H() {
        if ((this.f1245b & 4) == 0) {
            this.f1244a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f1244a;
        Drawable drawable = this.f1250g;
        if (drawable == null) {
            drawable = this.f1260q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* renamed from: I */
    private void m1117I() {
        Drawable drawable;
        int i2 = this.f1245b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) == 0 || (drawable = this.f1249f) == null) {
            drawable = this.f1248e;
        }
        this.f1244a.setLogo(drawable);
    }

    /* renamed from: x */
    private int m1118x() {
        if (this.f1244a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1260q = this.f1244a.getNavigationIcon();
        return 15;
    }

    /* renamed from: A */
    public void m1119A(Drawable drawable) {
        this.f1249f = drawable;
        m1117I();
    }

    /* renamed from: B */
    public void m1120B(int i2) {
        m1121C(i2 == 0 ? null : getContext().getString(i2));
    }

    /* renamed from: C */
    public void m1121C(CharSequence charSequence) {
        this.f1254k = charSequence;
        m1115G();
    }

    /* renamed from: D */
    public void m1122D(Drawable drawable) {
        this.f1250g = drawable;
        m1116H();
    }

    /* renamed from: E */
    public void m1123E(CharSequence charSequence) {
        this.f1253j = charSequence;
        if ((this.f1245b & 8) != 0) {
            this.f1244a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0198x
    /* renamed from: a */
    public void mo1124a(Menu menu, InterfaceC0093m.a aVar) {
        if (this.f1257n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f1244a.getContext());
            this.f1257n = actionMenuPresenter;
            actionMenuPresenter.m505r(C0828f.f5142g);
        }
        this.f1257n.mo496g(aVar);
        this.f1244a.m862I((C0087g) menu, this.f1257n);
    }

    @Override // androidx.appcompat.widget.InterfaceC0198x
    /* renamed from: b */
    public boolean mo1125b() {
        return this.f1244a.m859A();
    }

    @Override // androidx.appcompat.widget.InterfaceC0198x
    /* renamed from: c */
    public void mo1126c() {
        this.f1256m = true;
    }

    @Override // androidx.appcompat.widget.InterfaceC0198x
    public void collapseActionView() {
        this.f1244a.m869e();
    }

    @Override // androidx.appcompat.widget.InterfaceC0198x
    /* renamed from: d */
    public boolean mo1127d() {
        return this.f1244a.m868d();
    }

    @Override // androidx.appcompat.widget.InterfaceC0198x
    /* renamed from: e */
    public boolean mo1128e() {
        return this.f1244a.m878z();
    }

    @Override // androidx.appcompat.widget.InterfaceC0198x
    /* renamed from: f */
    public boolean mo1129f() {
        return this.f1244a.m876w();
    }

    @Override // androidx.appcompat.widget.InterfaceC0198x
    /* renamed from: g */
    public boolean mo1130g() {
        return this.f1244a.m866O();
    }

    @Override // androidx.appcompat.widget.InterfaceC0198x
    public Context getContext() {
        return this.f1244a.getContext();
    }

    @Override // androidx.appcompat.widget.InterfaceC0198x
    public CharSequence getTitle() {
        return this.f1244a.getTitle();
    }

    @Override // androidx.appcompat.widget.InterfaceC0198x
    /* renamed from: h */
    public void mo1131h() {
        this.f1244a.m870f();
    }

    @Override // androidx.appcompat.widget.InterfaceC0198x
    /* renamed from: i */
    public void mo1132i(C0171j0 c0171j0) {
        View view = this.f1246c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1244a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1246c);
            }
        }
        this.f1246c = c0171j0;
        if (c0171j0 == null || this.f1258o != 2) {
            return;
        }
        this.f1244a.addView(c0171j0, 0);
        Toolbar.C0149e c0149e = (Toolbar.C0149e) this.f1246c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0149e).width = -2;
        ((ViewGroup.MarginLayoutParams) c0149e).height = -2;
        c0149e.f264a = 8388691;
        c0171j0.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.InterfaceC0198x
    /* renamed from: j */
    public boolean mo1133j() {
        return this.f1244a.m875v();
    }

    @Override // androidx.appcompat.widget.InterfaceC0198x
    /* renamed from: k */
    public void mo1134k(int i2) {
        View view;
        int i3 = this.f1245b ^ i2;
        this.f1245b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    m1115G();
                }
                m1116H();
            }
            if ((i3 & 3) != 0) {
                m1117I();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.f1244a.setTitle(this.f1252i);
                    this.f1244a.setSubtitle(this.f1253j);
                } else {
                    this.f1244a.setTitle((CharSequence) null);
                    this.f1244a.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) == 0 || (view = this.f1247d) == null) {
                return;
            }
            if ((i2 & 16) != 0) {
                this.f1244a.addView(view);
            } else {
                this.f1244a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0198x
    /* renamed from: l */
    public Menu mo1135l() {
        return this.f1244a.getMenu();
    }

    @Override // androidx.appcompat.widget.InterfaceC0198x
    /* renamed from: m */
    public void mo1136m(int i2) {
        m1119A(i2 != 0 ? C0833a.m5262d(getContext(), i2) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC0198x
    /* renamed from: n */
    public int mo1137n() {
        return this.f1258o;
    }

    @Override // androidx.appcompat.widget.InterfaceC0198x
    /* renamed from: o */
    public C0315y mo1138o(int i2, long j2) {
        return C0311u.m2118c(this.f1244a).m2217a(i2 == 0 ? 1.0f : 0.0f).m2220d(j2).m2222f(new b(i2));
    }

    @Override // androidx.appcompat.widget.InterfaceC0198x
    /* renamed from: p */
    public void mo1139p(InterfaceC0093m.a aVar, C0087g.a aVar2) {
        this.f1244a.m863J(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.InterfaceC0198x
    /* renamed from: q */
    public void mo1140q(int i2) {
        this.f1244a.setVisibility(i2);
    }

    @Override // androidx.appcompat.widget.InterfaceC0198x
    /* renamed from: r */
    public ViewGroup mo1141r() {
        return this.f1244a;
    }

    @Override // androidx.appcompat.widget.InterfaceC0198x
    /* renamed from: s */
    public void mo1142s(boolean z) {
    }

    @Override // androidx.appcompat.widget.InterfaceC0198x
    public void setIcon(int i2) {
        setIcon(i2 != 0 ? C0833a.m5262d(getContext(), i2) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC0198x
    public void setTitle(CharSequence charSequence) {
        this.f1251h = true;
        m1114F(charSequence);
    }

    @Override // androidx.appcompat.widget.InterfaceC0198x
    public void setWindowCallback(Window.Callback callback) {
        this.f1255l = callback;
    }

    @Override // androidx.appcompat.widget.InterfaceC0198x
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f1251h) {
            return;
        }
        m1114F(charSequence);
    }

    @Override // androidx.appcompat.widget.InterfaceC0198x
    /* renamed from: t */
    public int mo1143t() {
        return this.f1245b;
    }

    @Override // androidx.appcompat.widget.InterfaceC0198x
    /* renamed from: u */
    public void mo1144u() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.InterfaceC0198x
    /* renamed from: v */
    public void mo1145v() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.InterfaceC0198x
    /* renamed from: w */
    public void mo1146w(boolean z) {
        this.f1244a.setCollapsible(z);
    }

    /* renamed from: y */
    public void m1147y(View view) {
        View view2 = this.f1247d;
        if (view2 != null && (this.f1245b & 16) != 0) {
            this.f1244a.removeView(view2);
        }
        this.f1247d = view;
        if (view == null || (this.f1245b & 16) == 0) {
            return;
        }
        this.f1244a.addView(view);
    }

    /* renamed from: z */
    public void m1148z(int i2) {
        if (i2 == this.f1259p) {
            return;
        }
        this.f1259p = i2;
        if (TextUtils.isEmpty(this.f1244a.getNavigationContentDescription())) {
            m1120B(this.f1259p);
        }
    }

    public C0187r0(Toolbar toolbar, boolean z, int i2, int i3) {
        Drawable drawable;
        this.f1258o = 0;
        this.f1259p = 0;
        this.f1244a = toolbar;
        this.f1252i = toolbar.getTitle();
        this.f1253j = toolbar.getSubtitle();
        this.f1251h = this.f1252i != null;
        this.f1250g = toolbar.getNavigationIcon();
        C0185q0 c0185q0M1091v = C0185q0.m1091v(toolbar.getContext(), null, C0832j.f5328a, C0823a.f5029c, 0);
        this.f1260q = c0185q0M1091v.m1098g(C0832j.f5383l);
        if (z) {
            CharSequence charSequenceM1107p = c0185q0M1091v.m1107p(C0832j.f5413r);
            if (!TextUtils.isEmpty(charSequenceM1107p)) {
                setTitle(charSequenceM1107p);
            }
            CharSequence charSequenceM1107p2 = c0185q0M1091v.m1107p(C0832j.f5403p);
            if (!TextUtils.isEmpty(charSequenceM1107p2)) {
                m1123E(charSequenceM1107p2);
            }
            Drawable drawableM1098g = c0185q0M1091v.m1098g(C0832j.f5393n);
            if (drawableM1098g != null) {
                m1119A(drawableM1098g);
            }
            Drawable drawableM1098g2 = c0185q0M1091v.m1098g(C0832j.f5388m);
            if (drawableM1098g2 != null) {
                setIcon(drawableM1098g2);
            }
            if (this.f1250g == null && (drawable = this.f1260q) != null) {
                m1122D(drawable);
            }
            mo1134k(c0185q0M1091v.m1102k(C0832j.f5363h, 0));
            int iM1105n = c0185q0M1091v.m1105n(C0832j.f5358g, 0);
            if (iM1105n != 0) {
                m1147y(LayoutInflater.from(this.f1244a.getContext()).inflate(iM1105n, (ViewGroup) this.f1244a, false));
                mo1134k(this.f1245b | 16);
            }
            int iM1104m = c0185q0M1091v.m1104m(C0832j.f5373j, 0);
            if (iM1104m > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1244a.getLayoutParams();
                layoutParams.height = iM1104m;
                this.f1244a.setLayoutParams(layoutParams);
            }
            int iM1096e = c0185q0M1091v.m1096e(C0832j.f5353f, -1);
            int iM1096e2 = c0185q0M1091v.m1096e(C0832j.f5348e, -1);
            if (iM1096e >= 0 || iM1096e2 >= 0) {
                this.f1244a.m861H(Math.max(iM1096e, 0), Math.max(iM1096e2, 0));
            }
            int iM1105n2 = c0185q0M1091v.m1105n(C0832j.f5418s, 0);
            if (iM1105n2 != 0) {
                Toolbar toolbar2 = this.f1244a;
                toolbar2.m865L(toolbar2.getContext(), iM1105n2);
            }
            int iM1105n3 = c0185q0M1091v.m1105n(C0832j.f5408q, 0);
            if (iM1105n3 != 0) {
                Toolbar toolbar3 = this.f1244a;
                toolbar3.m864K(toolbar3.getContext(), iM1105n3);
            }
            int iM1105n4 = c0185q0M1091v.m1105n(C0832j.f5398o, 0);
            if (iM1105n4 != 0) {
                this.f1244a.setPopupTheme(iM1105n4);
            }
        } else {
            this.f1245b = m1118x();
        }
        c0185q0M1091v.m1111w();
        m1148z(i2);
        this.f1254k = this.f1244a.getNavigationContentDescription();
        this.f1244a.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.widget.InterfaceC0198x
    public void setIcon(Drawable drawable) {
        this.f1248e = drawable;
        m1117I();
    }
}
