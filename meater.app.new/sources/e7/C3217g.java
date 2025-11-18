package e7;

import android.app.Activity;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* renamed from: e7.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3217g {

    /* renamed from: a, reason: collision with root package name */
    private final Object f40690a;

    public C3217g(Activity activity) {
        C3445p.l(activity, "Activity must not be null");
        this.f40690a = activity;
    }

    public final Activity a() {
        return (Activity) this.f40690a;
    }

    public final androidx.fragment.app.o b() {
        return (androidx.fragment.app.o) this.f40690a;
    }

    public final boolean c() {
        return this.f40690a instanceof Activity;
    }

    public final boolean d() {
        return this.f40690a instanceof androidx.fragment.app.o;
    }
}
