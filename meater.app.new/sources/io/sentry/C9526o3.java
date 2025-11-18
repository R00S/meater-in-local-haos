package io.sentry;

import io.sentry.protocol.C9558q;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: PropagationContext.java */
@ApiStatus.Internal
/* renamed from: io.sentry.o3 */
/* loaded from: classes2.dex */
public final class C9526o3 {

    /* renamed from: a */
    private C9558q f36533a;

    /* renamed from: b */
    private C9450h5 f36534b;

    /* renamed from: c */
    private C9450h5 f36535c;

    /* renamed from: d */
    private Boolean f36536d;

    /* renamed from: e */
    private C9624u0 f36537e;

    public C9526o3() {
        this(new C9558q(), new C9450h5(), null, null, null);
    }

    /* renamed from: a */
    private static C9624u0 m31123a(C9624u0 c9624u0) {
        if (c9624u0 != null) {
            return new C9624u0(c9624u0);
        }
        return null;
    }

    /* renamed from: b */
    public C9624u0 m31124b() {
        return this.f36537e;
    }

    /* renamed from: c */
    public C9450h5 m31125c() {
        return this.f36535c;
    }

    /* renamed from: d */
    public C9450h5 m31126d() {
        return this.f36534b;
    }

    /* renamed from: e */
    public C9558q m31127e() {
        return this.f36533a;
    }

    /* renamed from: f */
    public Boolean m31128f() {
        return this.f36536d;
    }

    /* renamed from: g */
    public void m31129g(C9624u0 c9624u0) {
        this.f36537e = c9624u0;
    }

    /* renamed from: h */
    public C9528o5 m31130h() {
        C9624u0 c9624u0 = this.f36537e;
        if (c9624u0 != null) {
            return c9624u0.m31739F();
        }
        return null;
    }

    public C9526o3(C9526o3 c9526o3) {
        this(c9526o3.m31127e(), c9526o3.m31126d(), c9526o3.m31125c(), m31123a(c9526o3.m31124b()), c9526o3.m31128f());
    }

    public C9526o3(C9558q c9558q, C9450h5 c9450h5, C9450h5 c9450h52, C9624u0 c9624u0, Boolean bool) {
        this.f36533a = c9558q;
        this.f36534b = c9450h5;
        this.f36535c = c9450h52;
        this.f36537e = c9624u0;
        this.f36536d = bool;
    }
}
