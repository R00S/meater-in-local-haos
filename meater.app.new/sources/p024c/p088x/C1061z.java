package p024c.p088x;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.C0311u;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: ViewOverlayApi14.java */
/* renamed from: c.x.z */
/* loaded from: classes.dex */
class C1061z implements InterfaceC1026b0 {

    /* renamed from: a */
    protected a f6947a;

    /* compiled from: ViewOverlayApi14.java */
    /* renamed from: c.x.z$a */
    static class a extends ViewGroup {

        /* renamed from: f */
        static Method f6948f;

        /* renamed from: g */
        ViewGroup f6949g;

        /* renamed from: h */
        View f6950h;

        /* renamed from: i */
        ArrayList<Drawable> f6951i;

        /* renamed from: j */
        C1061z f6952j;

        /* renamed from: k */
        private boolean f6953k;

        static {
            try {
                Class cls = Integer.TYPE;
                f6948f = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        a(Context context, ViewGroup viewGroup, View view, C1061z c1061z) {
            super(context);
            this.f6951i = null;
            this.f6949g = viewGroup;
            this.f6950h = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f6952j = c1061z;
        }

        /* renamed from: c */
        private void m6686c() {
            if (this.f6953k) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        /* renamed from: d */
        private void m6687d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f6951i;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f6953k = true;
                    this.f6949g.removeView(this);
                }
            }
        }

        /* renamed from: e */
        private void m6688e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f6949g.getLocationOnScreen(iArr2);
            this.f6950h.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        /* renamed from: a */
        public void m6689a(Drawable drawable) {
            m6686c();
            if (this.f6951i == null) {
                this.f6951i = new ArrayList<>();
            }
            if (this.f6951i.contains(drawable)) {
                return;
            }
            this.f6951i.add(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(this);
        }

        /* renamed from: b */
        public void m6690b(View view) {
            m6686c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != this.f6949g && viewGroup.getParent() != null && C0311u.m2101N(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f6949g.getLocationOnScreen(iArr2);
                    C0311u.m2107T(view, iArr[0] - iArr2[0]);
                    C0311u.m2108U(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            this.f6949g.getLocationOnScreen(new int[2]);
            this.f6950h.getLocationOnScreen(new int[2]);
            canvas.translate(r0[0] - r1[0], r0[1] - r1[1]);
            canvas.clipRect(new Rect(0, 0, this.f6950h.getWidth(), this.f6950h.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f6951i;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f6951i.get(i2).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: f */
        public void m6691f(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f6951i;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                m6687d();
            }
        }

        /* renamed from: g */
        public void m6692g(View view) {
            super.removeView(view);
            m6687d();
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f6949g == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (!(this.f6949g instanceof ViewGroup)) {
                invalidate(rect);
                return null;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            int[] iArr2 = new int[2];
            m6688e(iArr2);
            rect.offset(iArr2[0], iArr2[1]);
            return super.invalidateChildInParent(iArr, rect);
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        }

        @Override // android.view.View
        protected boolean verifyDrawable(Drawable drawable) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(drawable) || ((arrayList = this.f6951i) != null && arrayList.contains(drawable));
        }
    }

    C1061z(Context context, ViewGroup viewGroup, View view) {
        this.f6947a = new a(context, viewGroup, view, this);
    }

    /* renamed from: e */
    static C1061z m6684e(View view) {
        ViewGroup viewGroupM6685f = m6685f(view);
        if (viewGroupM6685f == null) {
            return null;
        }
        int childCount = viewGroupM6685f.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroupM6685f.getChildAt(i2);
            if (childAt instanceof a) {
                return ((a) childAt).f6952j;
            }
        }
        return new C1056u(viewGroupM6685f.getContext(), viewGroupM6685f, view);
    }

    /* renamed from: f */
    static ViewGroup m6685f(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    @Override // p024c.p088x.InterfaceC1026b0
    /* renamed from: a */
    public void mo6533a(Drawable drawable) {
        this.f6947a.m6689a(drawable);
    }

    @Override // p024c.p088x.InterfaceC1026b0
    /* renamed from: b */
    public void mo6534b(Drawable drawable) {
        this.f6947a.m6691f(drawable);
    }
}
