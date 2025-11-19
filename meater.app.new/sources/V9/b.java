package V9;

import S9.b;
import android.animation.Animator;
import android.animation.ValueAnimator;

/* compiled from: BaseAnimation.java */
/* loaded from: classes2.dex */
public abstract class b<T extends Animator> {

    /* renamed from: b, reason: collision with root package name */
    protected b.a f18181b;

    /* renamed from: a, reason: collision with root package name */
    protected long f18180a = 350;

    /* renamed from: c, reason: collision with root package name */
    protected T f18182c = (T) a();

    public b(b.a aVar) {
        this.f18181b = aVar;
    }

    public abstract T a();

    public b b(long j10) {
        this.f18180a = j10;
        T t10 = this.f18182c;
        if (t10 instanceof ValueAnimator) {
            t10.setDuration(j10);
        }
        return this;
    }

    public void c() {
        T t10 = this.f18182c;
        if (t10 == null || !t10.isStarted()) {
            return;
        }
        this.f18182c.end();
    }

    /* renamed from: d */
    public abstract b m(float f10);

    public void e() {
        T t10 = this.f18182c;
        if (t10 == null || t10.isRunning()) {
            return;
        }
        this.f18182c.start();
    }
}
