package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC0093m;
import androidx.appcompat.widget.C0163f0;
import androidx.core.view.C0311u;
import p024c.p025a.C0826d;
import p024c.p025a.C0829g;

/* compiled from: StandardMenuPopup.java */
/* renamed from: androidx.appcompat.view.menu.q */
/* loaded from: classes.dex */
final class ViewOnKeyListenerC0097q extends AbstractC0091k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, InterfaceC0093m, View.OnKeyListener {

    /* renamed from: g */
    private static final int f665g = C0829g.f5174m;

    /* renamed from: A */
    private boolean f666A;

    /* renamed from: h */
    private final Context f667h;

    /* renamed from: i */
    private final C0087g f668i;

    /* renamed from: j */
    private final C0086f f669j;

    /* renamed from: k */
    private final boolean f670k;

    /* renamed from: l */
    private final int f671l;

    /* renamed from: m */
    private final int f672m;

    /* renamed from: n */
    private final int f673n;

    /* renamed from: o */
    final C0163f0 f674o;

    /* renamed from: r */
    private PopupWindow.OnDismissListener f677r;

    /* renamed from: s */
    private View f678s;

    /* renamed from: t */
    View f679t;

    /* renamed from: u */
    private InterfaceC0093m.a f680u;

    /* renamed from: v */
    ViewTreeObserver f681v;

    /* renamed from: w */
    private boolean f682w;

    /* renamed from: x */
    private boolean f683x;

    /* renamed from: y */
    private int f684y;

    /* renamed from: p */
    final ViewTreeObserver.OnGlobalLayoutListener f675p = new a();

    /* renamed from: q */
    private final View.OnAttachStateChangeListener f676q = new b();

    /* renamed from: z */
    private int f685z = 0;

    /* compiled from: StandardMenuPopup.java */
    /* renamed from: androidx.appcompat.view.menu.q$a */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!ViewOnKeyListenerC0097q.this.mo519a() || ViewOnKeyListenerC0097q.this.f674o.m931A()) {
                return;
            }
            View view = ViewOnKeyListenerC0097q.this.f679t;
            if (view == null || !view.isShown()) {
                ViewOnKeyListenerC0097q.this.dismiss();
            } else {
                ViewOnKeyListenerC0097q.this.f674o.show();
            }
        }
    }

    /* compiled from: StandardMenuPopup.java */
    /* renamed from: androidx.appcompat.view.menu.q$b */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC0097q.this.f681v;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC0097q.this.f681v = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC0097q viewOnKeyListenerC0097q = ViewOnKeyListenerC0097q.this;
                viewOnKeyListenerC0097q.f681v.removeGlobalOnLayoutListener(viewOnKeyListenerC0097q.f675p);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public ViewOnKeyListenerC0097q(Context context, C0087g c0087g, View view, int i2, int i3, boolean z) {
        this.f667h = context;
        this.f668i = c0087g;
        this.f670k = z;
        this.f669j = new C0086f(c0087g, LayoutInflater.from(context), z, f665g);
        this.f672m = i2;
        this.f673n = i3;
        Resources resources = context.getResources();
        this.f671l = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0826d.f5065d));
        this.f678s = view;
        this.f674o = new C0163f0(context, null, i2, i3);
        c0087g.m583c(this, context);
    }

    /* renamed from: A */
    private boolean m665A() {
        View view;
        if (mo519a()) {
            return true;
        }
        if (this.f682w || (view = this.f678s) == null) {
            return false;
        }
        this.f679t = view;
        this.f674o.m939J(this);
        this.f674o.m940K(this);
        this.f674o.m938I(true);
        View view2 = this.f679t;
        boolean z = this.f681v == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f681v = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f675p);
        }
        view2.addOnAttachStateChangeListener(this.f676q);
        this.f674o.m932C(view2);
        this.f674o.m935F(this.f685z);
        if (!this.f683x) {
            this.f684y = AbstractC0091k.m646p(this.f669j, null, this.f667h, this.f671l);
            this.f683x = true;
        }
        this.f674o.m934E(this.f684y);
        this.f674o.m937H(2);
        this.f674o.m936G(m649o());
        this.f674o.show();
        ListView listViewMo522j = this.f674o.mo522j();
        listViewMo522j.setOnKeyListener(this);
        if (this.f666A && this.f668i.m605z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f667h).inflate(C0829g.f5173l, (ViewGroup) listViewMo522j, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f668i.m605z());
            }
            frameLayout.setEnabled(false);
            listViewMo522j.addHeaderView(frameLayout, null, false);
        }
        this.f674o.mo764o(this.f669j);
        this.f674o.show();
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0096p
    /* renamed from: a */
    public boolean mo519a() {
        return !this.f682w && this.f674o.mo519a();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: b */
    public void mo492b(C0087g c0087g, boolean z) {
        if (c0087g != this.f668i) {
            return;
        }
        dismiss();
        InterfaceC0093m.a aVar = this.f680u;
        if (aVar != null) {
            aVar.mo366b(c0087g, z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: c */
    public void mo493c(boolean z) {
        this.f683x = false;
        C0086f c0086f = this.f669j;
        if (c0086f != null) {
            c0086f.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: d */
    public boolean mo520d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0096p
    public void dismiss() {
        if (mo519a()) {
            this.f674o.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: g */
    public void mo496g(InterfaceC0093m.a aVar) {
        this.f680u = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: i */
    public void mo521i(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0096p
    /* renamed from: j */
    public ListView mo522j() {
        return this.f674o.mo522j();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: k */
    public boolean mo499k(SubMenuC0098r subMenuC0098r) {
        if (subMenuC0098r.hasVisibleItems()) {
            C0092l c0092l = new C0092l(this.f667h, subMenuC0098r, this.f679t, this.f670k, this.f672m, this.f673n);
            c0092l.m661j(this.f680u);
            c0092l.m658g(AbstractC0091k.m647y(subMenuC0098r));
            c0092l.m660i(this.f677r);
            this.f677r = null;
            this.f668i.m587e(false);
            int iM946c = this.f674o.m946c();
            int iM950n = this.f674o.m950n();
            if ((Gravity.getAbsoluteGravity(this.f685z, C0311u.m2162y(this.f678s)) & 7) == 5) {
                iM946c += this.f678s.getWidth();
            }
            if (c0092l.m664n(iM946c, iM950n)) {
                InterfaceC0093m.a aVar = this.f680u;
                if (aVar == null) {
                    return true;
                }
                aVar.mo367c(subMenuC0098r);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: l */
    public Parcelable mo523l() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0091k
    /* renamed from: m */
    public void mo524m(C0087g c0087g) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f682w = true;
        this.f668i.close();
        ViewTreeObserver viewTreeObserver = this.f681v;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f681v = this.f679t.getViewTreeObserver();
            }
            this.f681v.removeGlobalOnLayoutListener(this.f675p);
            this.f681v = null;
        }
        this.f679t.removeOnAttachStateChangeListener(this.f676q);
        PopupWindow.OnDismissListener onDismissListener = this.f677r;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0091k
    /* renamed from: q */
    public void mo526q(View view) {
        this.f678s = view;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0091k
    /* renamed from: s */
    public void mo527s(boolean z) {
        this.f669j.m545d(z);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0096p
    public void show() {
        if (!m665A()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0091k
    /* renamed from: t */
    public void mo528t(int i2) {
        this.f685z = i2;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0091k
    /* renamed from: u */
    public void mo529u(int i2) {
        this.f674o.m947e(i2);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0091k
    /* renamed from: v */
    public void mo530v(PopupWindow.OnDismissListener onDismissListener) {
        this.f677r = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0091k
    /* renamed from: w */
    public void mo531w(boolean z) {
        this.f666A = z;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0091k
    /* renamed from: x */
    public void mo532x(int i2) {
        this.f674o.m949k(i2);
    }
}
