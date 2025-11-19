package R7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import d.C2998b;
import s1.C4456s;
import s1.X;

/* compiled from: MaterialSideContainerBackHelper.java */
/* loaded from: classes2.dex */
public class h extends R7.a<View> {

    /* renamed from: g, reason: collision with root package name */
    private final float f15077g;

    /* renamed from: h, reason: collision with root package name */
    private final float f15078h;

    /* renamed from: i, reason: collision with root package name */
    private final float f15079i;

    /* compiled from: MaterialSideContainerBackHelper.java */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f15080a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f15081b;

        a(boolean z10, int i10) {
            this.f15080a = z10;
            this.f15081b = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            h.this.f15062b.setTranslationX(0.0f);
            h.this.k(0.0f, this.f15080a, this.f15081b);
        }
    }

    public h(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f15077g = resources.getDimension(C7.e.f2417t);
        this.f15078h = resources.getDimension(C7.e.f2415s);
        this.f15079i = resources.getDimension(C7.e.f2419u);
    }

    private boolean g(int i10, int i11) {
        return (C4456s.b(i10, X.z(this.f15062b)) & i11) == i11;
    }

    private int i(boolean z10) {
        ViewGroup.LayoutParams layoutParams = this.f15062b.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return z10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
    }

    public void f() {
        if (super.b() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f15062b, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f15062b, (Property<V, Float>) View.SCALE_Y, 1.0f));
        V v10 = this.f15062b;
        if (v10 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v10;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.f15065e);
        animatorSet.start();
    }

    public void h(C2998b c2998b, int i10, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        boolean z10 = c2998b.getSwipeEdge() == 0;
        boolean zG = g(i10, 3);
        float width = (this.f15062b.getWidth() * this.f15062b.getScaleX()) + i(zG);
        V v10 = this.f15062b;
        Property property = View.TRANSLATION_X;
        if (zG) {
            width = -width;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(v10, (Property<V, Float>) property, width);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new M1.b());
        objectAnimatorOfFloat.setDuration(D7.a.c(this.f15063c, this.f15064d, c2998b.getProgress()));
        objectAnimatorOfFloat.addListener(new a(z10, i10));
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public void j(C2998b c2998b) {
        super.d(c2998b);
    }

    public void k(float f10, boolean z10, int i10) {
        float fA = a(f10);
        boolean zG = g(i10, 3);
        boolean z11 = z10 == zG;
        int width = this.f15062b.getWidth();
        int height = this.f15062b.getHeight();
        float f11 = width;
        if (f11 > 0.0f) {
            float f12 = height;
            if (f12 <= 0.0f) {
                return;
            }
            float f13 = this.f15077g / f11;
            float f14 = this.f15078h / f11;
            float f15 = this.f15079i / f12;
            V v10 = this.f15062b;
            if (zG) {
                f11 = 0.0f;
            }
            v10.setPivotX(f11);
            if (!z11) {
                f14 = -f13;
            }
            float fA2 = D7.a.a(0.0f, f14, fA);
            float f16 = fA2 + 1.0f;
            this.f15062b.setScaleX(f16);
            float fA3 = 1.0f - D7.a.a(0.0f, f15, fA);
            this.f15062b.setScaleY(fA3);
            V v11 = this.f15062b;
            if (v11 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v11;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    childAt.setPivotX(zG ? (width - childAt.getRight()) + childAt.getWidth() : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f17 = z11 ? 1.0f - fA2 : 1.0f;
                    float f18 = fA3 != 0.0f ? (f16 / fA3) * f17 : 1.0f;
                    childAt.setScaleX(f17);
                    childAt.setScaleY(f18);
                }
            }
        }
    }

    public void l(C2998b c2998b, int i10) {
        if (super.e(c2998b) == null) {
            return;
        }
        k(c2998b.getProgress(), c2998b.getSwipeEdge() == 0, i10);
    }
}
