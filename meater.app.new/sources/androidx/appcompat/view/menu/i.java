package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import s1.C4456s;

/* compiled from: MenuPopupHelper.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final Context f21077a;

    /* renamed from: b, reason: collision with root package name */
    private final e f21078b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f21079c;

    /* renamed from: d, reason: collision with root package name */
    private final int f21080d;

    /* renamed from: e, reason: collision with root package name */
    private final int f21081e;

    /* renamed from: f, reason: collision with root package name */
    private View f21082f;

    /* renamed from: g, reason: collision with root package name */
    private int f21083g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f21084h;

    /* renamed from: i, reason: collision with root package name */
    private j.a f21085i;

    /* renamed from: j, reason: collision with root package name */
    private h f21086j;

    /* renamed from: k, reason: collision with root package name */
    private PopupWindow.OnDismissListener f21087k;

    /* renamed from: l, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f21088l;

    /* compiled from: MenuPopupHelper.java */
    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            i.this.e();
        }
    }

    public i(Context context, e eVar, View view, boolean z10, int i10) {
        this(context, eVar, view, z10, i10, 0);
    }

    private h a() {
        Display defaultDisplay = ((WindowManager) this.f21077a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        h bVar = Math.min(point.x, point.y) >= this.f21077a.getResources().getDimensionPixelSize(i.d.f42431c) ? new b(this.f21077a, this.f21082f, this.f21080d, this.f21081e, this.f21079c) : new l(this.f21077a, this.f21078b, this.f21082f, this.f21080d, this.f21081e, this.f21079c);
        bVar.o(this.f21078b);
        bVar.x(this.f21088l);
        bVar.s(this.f21082f);
        bVar.i(this.f21085i);
        bVar.u(this.f21084h);
        bVar.v(this.f21083g);
        return bVar;
    }

    private void l(int i10, int i11, boolean z10, boolean z11) {
        h hVarC = c();
        hVarC.y(z11);
        if (z10) {
            if ((C4456s.b(this.f21083g, this.f21082f.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f21082f.getWidth();
            }
            hVarC.w(i10);
            hVarC.z(i11);
            int i12 = (int) ((this.f21077a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            hVarC.t(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        hVarC.b();
    }

    public void b() {
        if (d()) {
            this.f21086j.dismiss();
        }
    }

    public h c() {
        if (this.f21086j == null) {
            this.f21086j = a();
        }
        return this.f21086j;
    }

    public boolean d() {
        h hVar = this.f21086j;
        return hVar != null && hVar.a();
    }

    protected void e() {
        this.f21086j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f21087k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f21082f = view;
    }

    public void g(boolean z10) {
        this.f21084h = z10;
        h hVar = this.f21086j;
        if (hVar != null) {
            hVar.u(z10);
        }
    }

    public void h(int i10) {
        this.f21083g = i10;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f21087k = onDismissListener;
    }

    public void j(j.a aVar) {
        this.f21085i = aVar;
        h hVar = this.f21086j;
        if (hVar != null) {
            hVar.i(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f21082f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i10, int i11) {
        if (d()) {
            return true;
        }
        if (this.f21082f == null) {
            return false;
        }
        l(i10, i11, true, true);
        return true;
    }

    public i(Context context, e eVar, View view, boolean z10, int i10, int i11) {
        this.f21083g = 8388611;
        this.f21088l = new a();
        this.f21077a = context;
        this.f21078b = eVar;
        this.f21082f = view;
        this.f21079c = z10;
        this.f21080d = i10;
        this.f21081e = i11;
    }
}
