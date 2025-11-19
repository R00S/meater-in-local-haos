package B9;

import android.os.Bundle;
import v9.C4925a;

/* compiled from: ImmutableBundle.java */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    private static final C4925a f1930b = C4925a.e();

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f1931a;

    public f() {
        this(new Bundle());
    }

    private g<Integer> d(String str) {
        if (!a(str)) {
            return g.a();
        }
        try {
            return g.b((Integer) this.f1931a.get(str));
        } catch (ClassCastException e10) {
            f1930b.b("Metadata key %s contains type other than int: %s", str, e10.getMessage());
            return g.a();
        }
    }

    public boolean a(String str) {
        return str != null && this.f1931a.containsKey(str);
    }

    public g<Boolean> b(String str) {
        if (!a(str)) {
            return g.a();
        }
        try {
            return g.b((Boolean) this.f1931a.get(str));
        } catch (ClassCastException e10) {
            f1930b.b("Metadata key %s contains type other than boolean: %s", str, e10.getMessage());
            return g.a();
        }
    }

    public g<Double> c(String str) {
        if (!a(str)) {
            return g.a();
        }
        Object obj = this.f1931a.get(str);
        if (obj == null) {
            return g.a();
        }
        if (obj instanceof Float) {
            return g.e(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return g.e((Double) obj);
        }
        f1930b.b("Metadata key %s contains type other than double: %s", str);
        return g.a();
    }

    public g<Long> e(String str) {
        return d(str).d() ? g.e(Long.valueOf(r3.c().intValue())) : g.a();
    }

    public f(Bundle bundle) {
        this.f1931a = (Bundle) bundle.clone();
    }
}
