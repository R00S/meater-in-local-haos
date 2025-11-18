package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.InterfaceC0093m;
import androidx.core.view.C0286d;
import androidx.core.view.C0311u;
import p024c.p025a.C0826d;

/* compiled from: MenuPopupHelper.java */
/* renamed from: androidx.appcompat.view.menu.l */
/* loaded from: classes.dex */
public class C0092l {

    /* renamed from: a */
    private final Context f651a;

    /* renamed from: b */
    private final C0087g f652b;

    /* renamed from: c */
    private final boolean f653c;

    /* renamed from: d */
    private final int f654d;

    /* renamed from: e */
    private final int f655e;

    /* renamed from: f */
    private View f656f;

    /* renamed from: g */
    private int f657g;

    /* renamed from: h */
    private boolean f658h;

    /* renamed from: i */
    private InterfaceC0093m.a f659i;

    /* renamed from: j */
    private AbstractC0091k f660j;

    /* renamed from: k */
    private PopupWindow.OnDismissListener f661k;

    /* renamed from: l */
    private final PopupWindow.OnDismissListener f662l;

    /* compiled from: MenuPopupHelper.java */
    /* renamed from: androidx.appcompat.view.menu.l$a */
    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            C0092l.this.mo656e();
        }
    }

    public C0092l(Context context, C0087g c0087g, View view, boolean z, int i2) {
        this(context, c0087g, view, z, i2, 0);
    }

    /* renamed from: a */
    private AbstractC0091k m651a() {
        Display defaultDisplay = ((WindowManager) this.f651a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        AbstractC0091k viewOnKeyListenerC0084d = Math.min(point.x, point.y) >= this.f651a.getResources().getDimensionPixelSize(C0826d.f5064c) ? new ViewOnKeyListenerC0084d(this.f651a, this.f656f, this.f654d, this.f655e, this.f653c) : new ViewOnKeyListenerC0097q(this.f651a, this.f652b, this.f656f, this.f654d, this.f655e, this.f653c);
        viewOnKeyListenerC0084d.mo524m(this.f652b);
        viewOnKeyListenerC0084d.mo530v(this.f662l);
        viewOnKeyListenerC0084d.mo526q(this.f656f);
        viewOnKeyListenerC0084d.mo496g(this.f659i);
        viewOnKeyListenerC0084d.mo527s(this.f658h);
        viewOnKeyListenerC0084d.mo528t(this.f657g);
        return viewOnKeyListenerC0084d;
    }

    /* renamed from: l */
    private void m652l(int i2, int i3, boolean z, boolean z2) {
        AbstractC0091k abstractC0091kM654c = m654c();
        abstractC0091kM654c.mo531w(z2);
        if (z) {
            if ((C0286d.m1932b(this.f657g, C0311u.m2162y(this.f656f)) & 7) == 5) {
                i2 -= this.f656f.getWidth();
            }
            abstractC0091kM654c.mo529u(i2);
            abstractC0091kM654c.mo532x(i3);
            int i4 = (int) ((this.f651a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC0091kM654c.m650r(new Rect(i2 - i4, i3 - i4, i2 + i4, i3 + i4));
        }
        abstractC0091kM654c.show();
    }

    /* renamed from: b */
    public void m653b() {
        if (m655d()) {
            this.f660j.dismiss();
        }
    }

    /* renamed from: c */
    public AbstractC0091k m654c() {
        if (this.f660j == null) {
            this.f660j = m651a();
        }
        return this.f660j;
    }

    /* renamed from: d */
    public boolean m655d() {
        AbstractC0091k abstractC0091k = this.f660j;
        return abstractC0091k != null && abstractC0091k.mo519a();
    }

    /* renamed from: e */
    protected void mo656e() {
        this.f660j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f661k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: f */
    public void m657f(View view) {
        this.f656f = view;
    }

    /* renamed from: g */
    public void m658g(boolean z) {
        this.f658h = z;
        AbstractC0091k abstractC0091k = this.f660j;
        if (abstractC0091k != null) {
            abstractC0091k.mo527s(z);
        }
    }

    /* renamed from: h */
    public void m659h(int i2) {
        this.f657g = i2;
    }

    /* renamed from: i */
    public void m660i(PopupWindow.OnDismissListener onDismissListener) {
        this.f661k = onDismissListener;
    }

    /* renamed from: j */
    public void m661j(InterfaceC0093m.a aVar) {
        this.f659i = aVar;
        AbstractC0091k abstractC0091k = this.f660j;
        if (abstractC0091k != null) {
            abstractC0091k.mo496g(aVar);
        }
    }

    /* renamed from: k */
    public void m662k() {
        if (!m663m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: m */
    public boolean m663m() {
        if (m655d()) {
            return true;
        }
        if (this.f656f == null) {
            return false;
        }
        m652l(0, 0, false, false);
        return true;
    }

    /* renamed from: n */
    public boolean m664n(int i2, int i3) {
        if (m655d()) {
            return true;
        }
        if (this.f656f == null) {
            return false;
        }
        m652l(i2, i3, true, true);
        return true;
    }

    public C0092l(Context context, C0087g c0087g, View view, boolean z, int i2, int i3) {
        this.f657g = 8388611;
        this.f662l = new a();
        this.f651a = context;
        this.f652b = c0087g;
        this.f656f = view;
        this.f653c = z;
        this.f654d = i2;
        this.f655e = i3;
    }
}
