package E6;

import H6.k;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ViewTarget.java */
@Deprecated
/* loaded from: classes2.dex */
public abstract class j<T extends View, Z> extends E6.a<Z> {

    /* renamed from: G, reason: collision with root package name */
    private static boolean f3998G;

    /* renamed from: H, reason: collision with root package name */
    private static int f3999H = com.bumptech.glide.h.f32976a;

    /* renamed from: B, reason: collision with root package name */
    protected final T f4000B;

    /* renamed from: C, reason: collision with root package name */
    private final a f4001C;

    /* renamed from: D, reason: collision with root package name */
    private View.OnAttachStateChangeListener f4002D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f4003E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f4004F;

    /* compiled from: ViewTarget.java */
    static final class a {

        /* renamed from: e, reason: collision with root package name */
        static Integer f4005e;

        /* renamed from: a, reason: collision with root package name */
        private final View f4006a;

        /* renamed from: b, reason: collision with root package name */
        private final List<h> f4007b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        boolean f4008c;

        /* renamed from: d, reason: collision with root package name */
        private ViewTreeObserverOnPreDrawListenerC0071a f4009d;

        /* compiled from: ViewTarget.java */
        /* renamed from: E6.j$a$a, reason: collision with other inner class name */
        private static final class ViewTreeObserverOnPreDrawListenerC0071a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: B, reason: collision with root package name */
            private final WeakReference<a> f4010B;

            ViewTreeObserverOnPreDrawListenerC0071a(a aVar) {
                this.f4010B = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.f4010B.get();
                if (aVar == null) {
                    return true;
                }
                aVar.a();
                return true;
            }
        }

        a(View view) {
            this.f4006a = view;
        }

        private static int c(Context context) {
            if (f4005e == null) {
                Display defaultDisplay = ((WindowManager) k.d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f4005e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f4005e.intValue();
        }

        private int e(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            if (this.f4008c && this.f4006a.isLayoutRequested()) {
                return 0;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (this.f4006a.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.f4006a.getContext());
        }

        private int f() {
            int paddingTop = this.f4006a.getPaddingTop() + this.f4006a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f4006a.getLayoutParams();
            return e(this.f4006a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        private int g() {
            int paddingLeft = this.f4006a.getPaddingLeft() + this.f4006a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f4006a.getLayoutParams();
            return e(this.f4006a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        private boolean h(int i10) {
            return i10 > 0 || i10 == Integer.MIN_VALUE;
        }

        private boolean i(int i10, int i11) {
            return h(i10) && h(i11);
        }

        private void j(int i10, int i11) {
            Iterator it = new ArrayList(this.f4007b).iterator();
            while (it.hasNext()) {
                ((h) it.next()).c(i10, i11);
            }
        }

        void a() {
            if (this.f4007b.isEmpty()) {
                return;
            }
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                j(iG, iF);
                b();
            }
        }

        void b() {
            ViewTreeObserver viewTreeObserver = this.f4006a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f4009d);
            }
            this.f4009d = null;
            this.f4007b.clear();
        }

        void d(h hVar) {
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                hVar.c(iG, iF);
                return;
            }
            if (!this.f4007b.contains(hVar)) {
                this.f4007b.add(hVar);
            }
            if (this.f4009d == null) {
                ViewTreeObserver viewTreeObserver = this.f4006a.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC0071a viewTreeObserverOnPreDrawListenerC0071a = new ViewTreeObserverOnPreDrawListenerC0071a(this);
                this.f4009d = viewTreeObserverOnPreDrawListenerC0071a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0071a);
            }
        }

        void k(h hVar) {
            this.f4007b.remove(hVar);
        }
    }

    public j(T t10) {
        this.f4000B = (T) k.d(t10);
        this.f4001C = new a(t10);
    }

    private Object l() {
        return this.f4000B.getTag(f3999H);
    }

    private void m() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f4002D;
        if (onAttachStateChangeListener == null || this.f4004F) {
            return;
        }
        this.f4000B.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f4004F = true;
    }

    private void n() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f4002D;
        if (onAttachStateChangeListener == null || !this.f4004F) {
            return;
        }
        this.f4000B.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f4004F = false;
    }

    private void o(Object obj) {
        f3998G = true;
        this.f4000B.setTag(f3999H, obj);
    }

    @Override // E6.i
    public void c(h hVar) {
        this.f4001C.d(hVar);
    }

    @Override // E6.i
    public void d(D6.d dVar) {
        o(dVar);
    }

    @Override // E6.i
    public void f(h hVar) {
        this.f4001C.k(hVar);
    }

    @Override // E6.a, E6.i
    public void h(Drawable drawable) {
        super.h(drawable);
        m();
    }

    @Override // E6.i
    public D6.d i() {
        Object objL = l();
        if (objL == null) {
            return null;
        }
        if (objL instanceof D6.d) {
            return (D6.d) objL;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // E6.a, E6.i
    public void k(Drawable drawable) {
        super.k(drawable);
        this.f4001C.b();
        if (this.f4003E) {
            return;
        }
        n();
    }

    public String toString() {
        return "Target for: " + this.f4000B;
    }
}
