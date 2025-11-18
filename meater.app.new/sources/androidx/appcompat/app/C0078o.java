package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.AbstractC0064a;
import androidx.appcompat.view.menu.C0087g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C0171j0;
import androidx.appcompat.widget.InterfaceC0198x;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C0281a0;
import androidx.core.view.C0311u;
import androidx.core.view.C0315y;
import androidx.core.view.InterfaceC0283b0;
import androidx.core.view.InterfaceC0316z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p024c.p025a.C0823a;
import p024c.p025a.C0828f;
import p024c.p025a.C0832j;
import p024c.p025a.p032o.AbstractC0842b;
import p024c.p025a.p032o.C0841a;
import p024c.p025a.p032o.C0847g;
import p024c.p025a.p032o.C0848h;

/* compiled from: WindowDecorActionBar.java */
/* renamed from: androidx.appcompat.app.o */
/* loaded from: classes.dex */
public class C0078o extends AbstractC0064a implements ActionBarOverlayLayout.InterfaceC0104d {

    /* renamed from: a */
    private static final Interpolator f416a = new AccelerateInterpolator();

    /* renamed from: b */
    private static final Interpolator f417b = new DecelerateInterpolator();

    /* renamed from: A */
    C0848h f418A;

    /* renamed from: B */
    private boolean f419B;

    /* renamed from: C */
    boolean f420C;

    /* renamed from: c */
    Context f424c;

    /* renamed from: d */
    private Context f425d;

    /* renamed from: e */
    private Activity f426e;

    /* renamed from: f */
    ActionBarOverlayLayout f427f;

    /* renamed from: g */
    ActionBarContainer f428g;

    /* renamed from: h */
    InterfaceC0198x f429h;

    /* renamed from: i */
    ActionBarContextView f430i;

    /* renamed from: j */
    View f431j;

    /* renamed from: k */
    C0171j0 f432k;

    /* renamed from: n */
    private boolean f435n;

    /* renamed from: o */
    d f436o;

    /* renamed from: p */
    AbstractC0842b f437p;

    /* renamed from: q */
    AbstractC0842b.a f438q;

    /* renamed from: r */
    private boolean f439r;

    /* renamed from: t */
    private boolean f441t;

    /* renamed from: w */
    boolean f444w;

    /* renamed from: x */
    boolean f445x;

    /* renamed from: y */
    private boolean f446y;

    /* renamed from: l */
    private ArrayList<?> f433l = new ArrayList<>();

    /* renamed from: m */
    private int f434m = -1;

    /* renamed from: s */
    private ArrayList<AbstractC0064a.b> f440s = new ArrayList<>();

    /* renamed from: u */
    private int f442u = 0;

    /* renamed from: v */
    boolean f443v = true;

    /* renamed from: z */
    private boolean f447z = true;

    /* renamed from: D */
    final InterfaceC0316z f421D = new a();

    /* renamed from: E */
    final InterfaceC0316z f422E = new b();

    /* renamed from: F */
    final InterfaceC0283b0 f423F = new c();

    /* compiled from: WindowDecorActionBar.java */
    /* renamed from: androidx.appcompat.app.o$a */
    class a extends C0281a0 {
        a() {
        }

        @Override // androidx.core.view.C0281a0, androidx.core.view.InterfaceC0316z
        public void onAnimationEnd(View view) {
            View view2;
            C0078o c0078o = C0078o.this;
            if (c0078o.f443v && (view2 = c0078o.f431j) != null) {
                view2.setTranslationY(0.0f);
                C0078o.this.f428g.setTranslationY(0.0f);
            }
            C0078o.this.f428g.setVisibility(8);
            C0078o.this.f428g.setTransitioning(false);
            C0078o c0078o2 = C0078o.this;
            c0078o2.f418A = null;
            c0078o2.m438A();
            ActionBarOverlayLayout actionBarOverlayLayout = C0078o.this.f427f;
            if (actionBarOverlayLayout != null) {
                C0311u.m2125f0(actionBarOverlayLayout);
            }
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* renamed from: androidx.appcompat.app.o$b */
    class b extends C0281a0 {
        b() {
        }

        @Override // androidx.core.view.C0281a0, androidx.core.view.InterfaceC0316z
        public void onAnimationEnd(View view) {
            C0078o c0078o = C0078o.this;
            c0078o.f418A = null;
            c0078o.f428g.requestLayout();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* renamed from: androidx.appcompat.app.o$c */
    class c implements InterfaceC0283b0 {
        c() {
        }

        @Override // androidx.core.view.InterfaceC0283b0
        /* renamed from: a */
        public void mo451a(View view) {
            ((View) C0078o.this.f428g.getParent()).invalidate();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* renamed from: androidx.appcompat.app.o$d */
    public class d extends AbstractC0842b implements C0087g.a {

        /* renamed from: h */
        private final Context f451h;

        /* renamed from: i */
        private final C0087g f452i;

        /* renamed from: j */
        private AbstractC0842b.a f453j;

        /* renamed from: k */
        private WeakReference<View> f454k;

        public d(Context context, AbstractC0842b.a aVar) {
            this.f451h = context;
            this.f453j = aVar;
            C0087g c0087gM576W = new C0087g(context).m576W(1);
            this.f452i = c0087gM576W;
            c0087gM576W.mo575V(this);
        }

        @Override // androidx.appcompat.view.menu.C0087g.a
        /* renamed from: a */
        public boolean mo347a(C0087g c0087g, MenuItem menuItem) {
            AbstractC0842b.a aVar = this.f453j;
            if (aVar != null) {
                return aVar.mo371d(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0087g.a
        /* renamed from: b */
        public void mo349b(C0087g c0087g) {
            if (this.f453j == null) {
                return;
            }
            mo458k();
            C0078o.this.f430i.m675l();
        }

        @Override // p024c.p025a.p032o.AbstractC0842b
        /* renamed from: c */
        public void mo452c() {
            C0078o c0078o = C0078o.this;
            if (c0078o.f436o != this) {
                return;
            }
            if (C0078o.m437z(c0078o.f444w, c0078o.f445x, false)) {
                this.f453j.mo368a(this);
            } else {
                C0078o c0078o2 = C0078o.this;
                c0078o2.f437p = this;
                c0078o2.f438q = this.f453j;
            }
            this.f453j = null;
            C0078o.this.m450y(false);
            C0078o.this.f430i.m671g();
            C0078o.this.f429h.mo1141r().sendAccessibilityEvent(32);
            C0078o c0078o3 = C0078o.this;
            c0078o3.f427f.setHideOnContentScrollEnabled(c0078o3.f420C);
            C0078o.this.f436o = null;
        }

        @Override // p024c.p025a.p032o.AbstractC0842b
        /* renamed from: d */
        public View mo453d() {
            WeakReference<View> weakReference = this.f454k;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // p024c.p025a.p032o.AbstractC0842b
        /* renamed from: e */
        public Menu mo454e() {
            return this.f452i;
        }

        @Override // p024c.p025a.p032o.AbstractC0842b
        /* renamed from: f */
        public MenuInflater mo455f() {
            return new C0847g(this.f451h);
        }

        @Override // p024c.p025a.p032o.AbstractC0842b
        /* renamed from: g */
        public CharSequence mo456g() {
            return C0078o.this.f430i.getSubtitle();
        }

        @Override // p024c.p025a.p032o.AbstractC0842b
        /* renamed from: i */
        public CharSequence mo457i() {
            return C0078o.this.f430i.getTitle();
        }

        @Override // p024c.p025a.p032o.AbstractC0842b
        /* renamed from: k */
        public void mo458k() {
            if (C0078o.this.f436o != this) {
                return;
            }
            this.f452i.m592h0();
            try {
                this.f453j.mo370c(this, this.f452i);
            } finally {
                this.f452i.m590g0();
            }
        }

        @Override // p024c.p025a.p032o.AbstractC0842b
        /* renamed from: l */
        public boolean mo459l() {
            return C0078o.this.f430i.m673j();
        }

        @Override // p024c.p025a.p032o.AbstractC0842b
        /* renamed from: m */
        public void mo460m(View view) {
            C0078o.this.f430i.setCustomView(view);
            this.f454k = new WeakReference<>(view);
        }

        @Override // p024c.p025a.p032o.AbstractC0842b
        /* renamed from: n */
        public void mo461n(int i2) {
            mo462o(C0078o.this.f424c.getResources().getString(i2));
        }

        @Override // p024c.p025a.p032o.AbstractC0842b
        /* renamed from: o */
        public void mo462o(CharSequence charSequence) {
            C0078o.this.f430i.setSubtitle(charSequence);
        }

        @Override // p024c.p025a.p032o.AbstractC0842b
        /* renamed from: q */
        public void mo463q(int i2) {
            mo464r(C0078o.this.f424c.getResources().getString(i2));
        }

        @Override // p024c.p025a.p032o.AbstractC0842b
        /* renamed from: r */
        public void mo464r(CharSequence charSequence) {
            C0078o.this.f430i.setTitle(charSequence);
        }

        @Override // p024c.p025a.p032o.AbstractC0842b
        /* renamed from: s */
        public void mo465s(boolean z) {
            super.mo465s(z);
            C0078o.this.f430i.setTitleOptional(z);
        }

        /* renamed from: t */
        public boolean m466t() {
            this.f452i.m592h0();
            try {
                return this.f453j.mo369b(this, this.f452i);
            } finally {
                this.f452i.m590g0();
            }
        }
    }

    public C0078o(Activity activity, boolean z) {
        this.f426e = activity;
        View decorView = activity.getWindow().getDecorView();
        m432G(decorView);
        if (z) {
            return;
        }
        this.f431j = decorView.findViewById(R.id.content);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: D */
    private InterfaceC0198x m430D(View view) {
        if (view instanceof InterfaceC0198x) {
            return (InterfaceC0198x) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: F */
    private void m431F() {
        if (this.f446y) {
            this.f446y = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f427f;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m436N(false);
        }
    }

    /* renamed from: G */
    private void m432G(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C0828f.f5151p);
        this.f427f = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f429h = m430D(view.findViewById(C0828f.f5136a));
        this.f430i = (ActionBarContextView) view.findViewById(C0828f.f5141f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C0828f.f5138c);
        this.f428g = actionBarContainer;
        InterfaceC0198x interfaceC0198x = this.f429h;
        if (interfaceC0198x == null || this.f430i == null || actionBarContainer == null) {
            throw new IllegalStateException(C0078o.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f424c = interfaceC0198x.getContext();
        boolean z = (this.f429h.mo1143t() & 4) != 0;
        if (z) {
            this.f435n = true;
        }
        C0841a c0841aM5331b = C0841a.m5331b(this.f424c);
        mo229t(c0841aM5331b.m5332a() || z);
        m433J(c0841aM5331b.m5337g());
        TypedArray typedArrayObtainStyledAttributes = this.f424c.obtainStyledAttributes(null, C0832j.f5328a, C0823a.f5029c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(C0832j.f5378k, false)) {
            m444K(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C0832j.f5368i, 0);
        if (dimensionPixelSize != 0) {
            m443I(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: J */
    private void m433J(boolean z) {
        this.f441t = z;
        if (z) {
            this.f428g.setTabContainer(null);
            this.f429h.mo1132i(this.f432k);
        } else {
            this.f429h.mo1132i(null);
            this.f428g.setTabContainer(this.f432k);
        }
        boolean z2 = m441E() == 2;
        C0171j0 c0171j0 = this.f432k;
        if (c0171j0 != null) {
            if (z2) {
                c0171j0.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f427f;
                if (actionBarOverlayLayout != null) {
                    C0311u.m2125f0(actionBarOverlayLayout);
                }
            } else {
                c0171j0.setVisibility(8);
            }
        }
        this.f429h.mo1146w(!this.f441t && z2);
        this.f427f.setHasNonEmbeddedTabs(!this.f441t && z2);
    }

    /* renamed from: L */
    private boolean m434L() {
        return C0311u.m2102O(this.f428g);
    }

    /* renamed from: M */
    private void m435M() {
        if (this.f446y) {
            return;
        }
        this.f446y = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f427f;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        m436N(false);
    }

    /* renamed from: N */
    private void m436N(boolean z) {
        if (m437z(this.f444w, this.f445x, this.f446y)) {
            if (this.f447z) {
                return;
            }
            this.f447z = true;
            m440C(z);
            return;
        }
        if (this.f447z) {
            this.f447z = false;
            m439B(z);
        }
    }

    /* renamed from: z */
    static boolean m437z(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    /* renamed from: A */
    void m438A() {
        AbstractC0842b.a aVar = this.f438q;
        if (aVar != null) {
            aVar.mo368a(this.f437p);
            this.f437p = null;
            this.f438q = null;
        }
    }

    /* renamed from: B */
    public void m439B(boolean z) {
        View view;
        C0848h c0848h = this.f418A;
        if (c0848h != null) {
            c0848h.m5361a();
        }
        if (this.f442u != 0 || (!this.f419B && !z)) {
            this.f421D.onAnimationEnd(null);
            return;
        }
        this.f428g.setAlpha(1.0f);
        this.f428g.setTransitioning(true);
        C0848h c0848h2 = new C0848h();
        float f2 = -this.f428g.getHeight();
        if (z) {
            this.f428g.getLocationInWindow(new int[]{0, 0});
            f2 -= r5[1];
        }
        C0315y c0315yM2226k = C0311u.m2118c(this.f428g).m2226k(f2);
        c0315yM2226k.m2224i(this.f423F);
        c0848h2.m5363c(c0315yM2226k);
        if (this.f443v && (view = this.f431j) != null) {
            c0848h2.m5363c(C0311u.m2118c(view).m2226k(f2));
        }
        c0848h2.m5366f(f416a);
        c0848h2.m5365e(250L);
        c0848h2.m5367g(this.f421D);
        this.f418A = c0848h2;
        c0848h2.m5368h();
    }

    /* renamed from: C */
    public void m440C(boolean z) {
        View view;
        View view2;
        C0848h c0848h = this.f418A;
        if (c0848h != null) {
            c0848h.m5361a();
        }
        this.f428g.setVisibility(0);
        if (this.f442u == 0 && (this.f419B || z)) {
            this.f428g.setTranslationY(0.0f);
            float f2 = -this.f428g.getHeight();
            if (z) {
                this.f428g.getLocationInWindow(new int[]{0, 0});
                f2 -= r5[1];
            }
            this.f428g.setTranslationY(f2);
            C0848h c0848h2 = new C0848h();
            C0315y c0315yM2226k = C0311u.m2118c(this.f428g).m2226k(0.0f);
            c0315yM2226k.m2224i(this.f423F);
            c0848h2.m5363c(c0315yM2226k);
            if (this.f443v && (view2 = this.f431j) != null) {
                view2.setTranslationY(f2);
                c0848h2.m5363c(C0311u.m2118c(this.f431j).m2226k(0.0f));
            }
            c0848h2.m5366f(f417b);
            c0848h2.m5365e(250L);
            c0848h2.m5367g(this.f422E);
            this.f418A = c0848h2;
            c0848h2.m5368h();
        } else {
            this.f428g.setAlpha(1.0f);
            this.f428g.setTranslationY(0.0f);
            if (this.f443v && (view = this.f431j) != null) {
                view.setTranslationY(0.0f);
            }
            this.f422E.onAnimationEnd(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f427f;
        if (actionBarOverlayLayout != null) {
            C0311u.m2125f0(actionBarOverlayLayout);
        }
    }

    /* renamed from: E */
    public int m441E() {
        return this.f429h.mo1137n();
    }

    /* renamed from: H */
    public void m442H(int i2, int i3) {
        int iMo1143t = this.f429h.mo1143t();
        if ((i3 & 4) != 0) {
            this.f435n = true;
        }
        this.f429h.mo1134k((i2 & i3) | ((i3 ^ (-1)) & iMo1143t));
    }

    /* renamed from: I */
    public void m443I(float f2) {
        C0311u.m2147q0(this.f428g, f2);
    }

    /* renamed from: K */
    public void m444K(boolean z) {
        if (z && !this.f427f.m702w()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f420C = z;
        this.f427f.setHideOnContentScrollEnabled(z);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0104d
    /* renamed from: a */
    public void mo445a() {
        if (this.f445x) {
            this.f445x = false;
            m436N(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0104d
    /* renamed from: b */
    public void mo446b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0104d
    /* renamed from: c */
    public void mo447c(boolean z) {
        this.f443v = z;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0104d
    /* renamed from: d */
    public void mo448d() {
        if (this.f445x) {
            return;
        }
        this.f445x = true;
        m436N(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0104d
    /* renamed from: e */
    public void mo449e() {
        C0848h c0848h = this.f418A;
        if (c0848h != null) {
            c0848h.m5361a();
            this.f418A = null;
        }
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: g */
    public boolean mo216g() {
        InterfaceC0198x interfaceC0198x = this.f429h;
        if (interfaceC0198x == null || !interfaceC0198x.mo1133j()) {
            return false;
        }
        this.f429h.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: h */
    public void mo217h(boolean z) {
        if (z == this.f439r) {
            return;
        }
        this.f439r = z;
        int size = this.f440s.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f440s.get(i2).m234a(z);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: i */
    public int mo218i() {
        return this.f429h.mo1143t();
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: j */
    public Context mo219j() {
        if (this.f425d == null) {
            TypedValue typedValue = new TypedValue();
            this.f424c.getTheme().resolveAttribute(C0823a.f5033g, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f425d = new ContextThemeWrapper(this.f424c, i2);
            } else {
                this.f425d = this.f424c;
            }
        }
        return this.f425d;
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: l */
    public void mo221l(Configuration configuration) {
        m433J(C0841a.m5331b(this.f424c).m5337g());
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: n */
    public boolean mo223n(int i2, KeyEvent keyEvent) {
        Menu menuMo454e;
        d dVar = this.f436o;
        if (dVar == null || (menuMo454e = dVar.mo454e()) == null) {
            return false;
        }
        menuMo454e.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuMo454e.performShortcut(i2, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0104d
    public void onWindowVisibilityChanged(int i2) {
        this.f442u = i2;
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: q */
    public void mo226q(boolean z) {
        if (this.f435n) {
            return;
        }
        mo227r(z);
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: r */
    public void mo227r(boolean z) {
        m442H(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: s */
    public void mo228s(boolean z) {
        m442H(z ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: t */
    public void mo229t(boolean z) {
        this.f429h.mo1142s(z);
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: u */
    public void mo230u(boolean z) {
        C0848h c0848h;
        this.f419B = z;
        if (z || (c0848h = this.f418A) == null) {
            return;
        }
        c0848h.m5361a();
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: v */
    public void mo231v(CharSequence charSequence) {
        this.f429h.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: w */
    public void mo232w(CharSequence charSequence) {
        this.f429h.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: x */
    public AbstractC0842b mo233x(AbstractC0842b.a aVar) {
        d dVar = this.f436o;
        if (dVar != null) {
            dVar.mo452c();
        }
        this.f427f.setHideOnContentScrollEnabled(false);
        this.f430i.m674k();
        d dVar2 = new d(this.f430i.getContext(), aVar);
        if (!dVar2.m466t()) {
            return null;
        }
        this.f436o = dVar2;
        dVar2.mo458k();
        this.f430i.m672h(dVar2);
        m450y(true);
        this.f430i.sendAccessibilityEvent(32);
        return dVar2;
    }

    /* renamed from: y */
    public void m450y(boolean z) {
        C0315y c0315yMo1138o;
        C0315y c0315yMo670f;
        if (z) {
            m435M();
        } else {
            m431F();
        }
        if (!m434L()) {
            if (z) {
                this.f429h.mo1140q(4);
                this.f430i.setVisibility(0);
                return;
            } else {
                this.f429h.mo1140q(0);
                this.f430i.setVisibility(8);
                return;
            }
        }
        if (z) {
            c0315yMo670f = this.f429h.mo1138o(4, 100L);
            c0315yMo1138o = this.f430i.mo670f(0, 200L);
        } else {
            c0315yMo1138o = this.f429h.mo1138o(0, 200L);
            c0315yMo670f = this.f430i.mo670f(8, 100L);
        }
        C0848h c0848h = new C0848h();
        c0848h.m5364d(c0315yMo670f, c0315yMo1138o);
        c0848h.m5368h();
    }

    public C0078o(Dialog dialog) {
        m432G(dialog.getWindow().getDecorView());
    }
}
