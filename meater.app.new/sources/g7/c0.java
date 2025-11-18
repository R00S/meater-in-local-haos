package g7;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    private Object f41974a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f41975b = false;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC3433d f41976c;

    public c0(AbstractC3433d abstractC3433d, Object obj) {
        this.f41976c = abstractC3433d;
        this.f41974a = obj;
    }

    protected abstract void a(Object obj);

    protected abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f41974a;
                if (this.f41975b) {
                    Log.w("GmsClient", "Callback proxy " + toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.f41975b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f41974a = null;
        }
    }

    public final void e() {
        d();
        synchronized (this.f41976c.f41996S) {
            this.f41976c.f41996S.remove(this);
        }
    }
}
