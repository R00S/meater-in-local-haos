package W1;

import X1.C1804a;
import X1.L;
import android.os.Bundle;

/* compiled from: RubySpan.java */
/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: c, reason: collision with root package name */
    private static final String f18343c = L.B0(0);

    /* renamed from: d, reason: collision with root package name */
    private static final String f18344d = L.B0(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f18345a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18346b;

    public f(String str, int i10) {
        this.f18345a = str;
        this.f18346b = i10;
    }

    public static f a(Bundle bundle) {
        return new f((String) C1804a.e(bundle.getString(f18343c)), bundle.getInt(f18344d));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(f18343c, this.f18345a);
        bundle.putInt(f18344d, this.f18346b);
        return bundle;
    }
}
