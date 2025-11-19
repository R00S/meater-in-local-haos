package Va;

import Ra.w0;
import Ra.x0;
import kotlin.jvm.internal.C3862t;

/* compiled from: JavaVisibilities.kt */
/* loaded from: classes3.dex */
public final class b extends x0 {

    /* renamed from: c, reason: collision with root package name */
    public static final b f18234c = new b();

    private b() {
        super("protected_and_package", true);
    }

    @Override // Ra.x0
    public Integer a(x0 visibility) {
        C3862t.g(visibility, "visibility");
        if (C3862t.b(this, visibility)) {
            return 0;
        }
        if (visibility == w0.b.f15188c) {
            return null;
        }
        return Integer.valueOf(w0.f15184a.b(visibility) ? 1 : -1);
    }

    @Override // Ra.x0
    public String b() {
        return "protected/*protected and package*/";
    }

    @Override // Ra.x0
    public x0 d() {
        return w0.g.f15193c;
    }
}
