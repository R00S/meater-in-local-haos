package R7;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import d.C2998b;
import u1.C4661a;

/* compiled from: MaterialBackAnimationHelper.java */
/* loaded from: classes2.dex */
public abstract class a<V extends View> {

    /* renamed from: a, reason: collision with root package name */
    private final TimeInterpolator f15061a;

    /* renamed from: b, reason: collision with root package name */
    protected final V f15062b;

    /* renamed from: c, reason: collision with root package name */
    protected final int f15063c;

    /* renamed from: d, reason: collision with root package name */
    protected final int f15064d;

    /* renamed from: e, reason: collision with root package name */
    protected final int f15065e;

    /* renamed from: f, reason: collision with root package name */
    private C2998b f15066f;

    public a(V v10) {
        this.f15062b = v10;
        Context context = v10.getContext();
        this.f15061a = i.g(context, C7.c.f2295S, C4661a.a(0.0f, 0.0f, 0.0f, 1.0f));
        this.f15063c = i.f(context, C7.c.f2284H, 300);
        this.f15064d = i.f(context, C7.c.f2288L, 150);
        this.f15065e = i.f(context, C7.c.f2287K, 100);
    }

    public float a(float f10) {
        return this.f15061a.getInterpolation(f10);
    }

    protected C2998b b() {
        if (this.f15066f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        C2998b c2998b = this.f15066f;
        this.f15066f = null;
        return c2998b;
    }

    public C2998b c() {
        C2998b c2998b = this.f15066f;
        this.f15066f = null;
        return c2998b;
    }

    protected void d(C2998b c2998b) {
        this.f15066f = c2998b;
    }

    protected C2998b e(C2998b c2998b) {
        if (this.f15066f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        C2998b c2998b2 = this.f15066f;
        this.f15066f = c2998b;
        return c2998b2;
    }
}
