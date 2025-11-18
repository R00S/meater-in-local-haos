package com.bumptech.glide.p141p.p142l;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bumptech.glide.p141p.InterfaceC5561d;
import com.bumptech.glide.p145r.C5596j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ViewTarget.java */
@Deprecated
/* renamed from: com.bumptech.glide.p.l.j */
/* loaded from: classes.dex */
public abstract class AbstractC5578j<T extends View, Z> extends AbstractC5569a<Z> {

    /* renamed from: f */
    private static boolean f13997f;

    /* renamed from: g */
    private static Integer f13998g;

    /* renamed from: h */
    protected final T f13999h;

    /* renamed from: i */
    private final a f14000i;

    /* renamed from: j */
    private View.OnAttachStateChangeListener f14001j;

    /* renamed from: k */
    private boolean f14002k;

    /* renamed from: l */
    private boolean f14003l;

    /* compiled from: ViewTarget.java */
    /* renamed from: com.bumptech.glide.p.l.j$a */
    static final class a {

        /* renamed from: a */
        static Integer f14004a;

        /* renamed from: b */
        private final View f14005b;

        /* renamed from: c */
        private final List<InterfaceC5576h> f14006c = new ArrayList();

        /* renamed from: d */
        boolean f14007d;

        /* renamed from: e */
        private ViewTreeObserverOnPreDrawListenerC11458a f14008e;

        /* compiled from: ViewTarget.java */
        /* renamed from: com.bumptech.glide.p.l.j$a$a, reason: collision with other inner class name */
        private static final class ViewTreeObserverOnPreDrawListenerC11458a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: f */
            private final WeakReference<a> f14009f;

            ViewTreeObserverOnPreDrawListenerC11458a(a aVar) {
                this.f14009f = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.f14009f.get();
                if (aVar == null) {
                    return true;
                }
                aVar.m10998a();
                return true;
            }
        }

        a(View view) {
            this.f14005b = view;
        }

        /* renamed from: c */
        private static int m10991c(Context context) {
            if (f14004a == null) {
                Display defaultDisplay = ((WindowManager) C5596j.m11042d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f14004a = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f14004a.intValue();
        }

        /* renamed from: e */
        private int m10992e(int i2, int i3, int i4) {
            int i5 = i3 - i4;
            if (i5 > 0) {
                return i5;
            }
            if (this.f14007d && this.f14005b.isLayoutRequested()) {
                return 0;
            }
            int i6 = i2 - i4;
            if (i6 > 0) {
                return i6;
            }
            if (this.f14005b.isLayoutRequested() || i3 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return m10991c(this.f14005b.getContext());
        }

        /* renamed from: f */
        private int m10993f() {
            int paddingTop = this.f14005b.getPaddingTop() + this.f14005b.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f14005b.getLayoutParams();
            return m10992e(this.f14005b.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* renamed from: g */
        private int m10994g() {
            int paddingLeft = this.f14005b.getPaddingLeft() + this.f14005b.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f14005b.getLayoutParams();
            return m10992e(this.f14005b.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        /* renamed from: h */
        private boolean m10995h(int i2) {
            return i2 > 0 || i2 == Integer.MIN_VALUE;
        }

        /* renamed from: i */
        private boolean m10996i(int i2, int i3) {
            return m10995h(i2) && m10995h(i3);
        }

        /* renamed from: j */
        private void m10997j(int i2, int i3) {
            Iterator it = new ArrayList(this.f14006c).iterator();
            while (it.hasNext()) {
                ((InterfaceC5576h) it.next()).mo10970g(i2, i3);
            }
        }

        /* renamed from: a */
        void m10998a() {
            if (this.f14006c.isEmpty()) {
                return;
            }
            int iM10994g = m10994g();
            int iM10993f = m10993f();
            if (m10996i(iM10994g, iM10993f)) {
                m10997j(iM10994g, iM10993f);
                m10999b();
            }
        }

        /* renamed from: b */
        void m10999b() {
            ViewTreeObserver viewTreeObserver = this.f14005b.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f14008e);
            }
            this.f14008e = null;
            this.f14006c.clear();
        }

        /* renamed from: d */
        void m11000d(InterfaceC5576h interfaceC5576h) {
            int iM10994g = m10994g();
            int iM10993f = m10993f();
            if (m10996i(iM10994g, iM10993f)) {
                interfaceC5576h.mo10970g(iM10994g, iM10993f);
                return;
            }
            if (!this.f14006c.contains(interfaceC5576h)) {
                this.f14006c.add(interfaceC5576h);
            }
            if (this.f14008e == null) {
                ViewTreeObserver viewTreeObserver = this.f14005b.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC11458a viewTreeObserverOnPreDrawListenerC11458a = new ViewTreeObserverOnPreDrawListenerC11458a(this);
                this.f14008e = viewTreeObserverOnPreDrawListenerC11458a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC11458a);
            }
        }

        /* renamed from: k */
        void m11001k(InterfaceC5576h interfaceC5576h) {
            this.f14006c.remove(interfaceC5576h);
        }
    }

    public AbstractC5578j(T t) {
        this.f13999h = (T) C5596j.m11042d(t);
        this.f14000i = new a(t);
    }

    /* renamed from: c */
    private Object m10987c() {
        Integer num = f13998g;
        return num == null ? this.f13999h.getTag() : this.f13999h.getTag(num.intValue());
    }

    /* renamed from: d */
    private void m10988d() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f14001j;
        if (onAttachStateChangeListener == null || this.f14003l) {
            return;
        }
        this.f13999h.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f14003l = true;
    }

    /* renamed from: e */
    private void m10989e() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f14001j;
        if (onAttachStateChangeListener == null || !this.f14003l) {
            return;
        }
        this.f13999h.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f14003l = false;
    }

    /* renamed from: f */
    private void m10990f(Object obj) {
        Integer num = f13998g;
        if (num != null) {
            this.f13999h.setTag(num.intValue(), obj);
        } else {
            f13997f = true;
            this.f13999h.setTag(obj);
        }
    }

    @Override // com.bumptech.glide.p141p.p142l.AbstractC5569a, com.bumptech.glide.p141p.p142l.InterfaceC5577i
    public InterfaceC5561d getRequest() {
        Object objM10987c = m10987c();
        if (objM10987c == null) {
            return null;
        }
        if (objM10987c instanceof InterfaceC5561d) {
            return (InterfaceC5561d) objM10987c;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // com.bumptech.glide.p141p.p142l.InterfaceC5577i
    public void getSize(InterfaceC5576h interfaceC5576h) {
        this.f14000i.m11000d(interfaceC5576h);
    }

    @Override // com.bumptech.glide.p141p.p142l.AbstractC5569a, com.bumptech.glide.p141p.p142l.InterfaceC5577i
    public void onLoadCleared(Drawable drawable) {
        super.onLoadCleared(drawable);
        this.f14000i.m10999b();
        if (this.f14002k) {
            return;
        }
        m10989e();
    }

    @Override // com.bumptech.glide.p141p.p142l.AbstractC5569a, com.bumptech.glide.p141p.p142l.InterfaceC5577i
    public void onLoadStarted(Drawable drawable) {
        super.onLoadStarted(drawable);
        m10988d();
    }

    @Override // com.bumptech.glide.p141p.p142l.InterfaceC5577i
    public void removeCallback(InterfaceC5576h interfaceC5576h) {
        this.f14000i.m11001k(interfaceC5576h);
    }

    @Override // com.bumptech.glide.p141p.p142l.AbstractC5569a, com.bumptech.glide.p141p.p142l.InterfaceC5577i
    public void setRequest(InterfaceC5561d interfaceC5561d) {
        m10990f(interfaceC5561d);
    }

    public String toString() {
        return "Target for: " + this.f13999h;
    }
}
