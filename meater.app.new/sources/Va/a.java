package Va;

import Ra.w0;
import Ra.x0;
import kotlin.jvm.internal.C3862t;

/* compiled from: JavaVisibilities.kt */
/* loaded from: classes3.dex */
public final class a extends x0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f18233c = new a();

    private a() {
        super("package", false);
    }

    @Override // Ra.x0
    public Integer a(x0 visibility) {
        C3862t.g(visibility, "visibility");
        if (this == visibility) {
            return 0;
        }
        return w0.f15184a.b(visibility) ? 1 : -1;
    }

    @Override // Ra.x0
    public String b() {
        return "public/*package*/";
    }

    @Override // Ra.x0
    public x0 d() {
        return w0.g.f15193c;
    }
}
