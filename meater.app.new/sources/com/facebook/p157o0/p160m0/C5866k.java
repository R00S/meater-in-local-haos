package com.facebook.p157o0.p160m0;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.p157o0.p160m0.p161n.C5869a;
import com.facebook.p157o0.p160m0.p161n.C5874f;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C9801m;

/* compiled from: RCTCodelessLoggingEventListener.kt */
/* renamed from: com.facebook.o0.m0.k */
/* loaded from: classes.dex */
public final class C5866k {

    /* renamed from: a */
    public static final C5866k f15198a = new C5866k();

    /* compiled from: RCTCodelessLoggingEventListener.kt */
    /* renamed from: com.facebook.o0.m0.k$a */
    public static final class a implements View.OnTouchListener {

        /* renamed from: f */
        private final C5869a f15199f;

        /* renamed from: g */
        private final WeakReference<View> f15200g;

        /* renamed from: h */
        private final WeakReference<View> f15201h;

        /* renamed from: i */
        private final View.OnTouchListener f15202i;

        /* renamed from: j */
        private boolean f15203j;

        public a(C5869a c5869a, View view, View view2) {
            C9801m.m32346f(c5869a, "mapping");
            C9801m.m32346f(view, "rootView");
            C9801m.m32346f(view2, "hostView");
            this.f15199f = c5869a;
            this.f15200g = new WeakReference<>(view2);
            this.f15201h = new WeakReference<>(view);
            C5874f c5874f = C5874f.f15257a;
            this.f15202i = C5874f.m12475h(view2);
            this.f15203j = true;
        }

        /* renamed from: a */
        public final boolean m12417a() {
            return this.f15203j;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            C9801m.m32346f(view, "view");
            C9801m.m32346f(motionEvent, "motionEvent");
            View view2 = this.f15201h.get();
            View view3 = this.f15200g.get();
            if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
                C5863h c5863h = C5863h.f15163a;
                C5863h.m12374d(this.f15199f, view2, view3);
            }
            View.OnTouchListener onTouchListener = this.f15202i;
            return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
        }
    }

    private C5866k() {
    }

    /* renamed from: a */
    public static final a m12416a(C5869a c5869a, View view, View view2) {
        C9801m.m32346f(c5869a, "mapping");
        C9801m.m32346f(view, "rootView");
        C9801m.m32346f(view2, "hostView");
        return new a(c5869a, view, view2);
    }
}
