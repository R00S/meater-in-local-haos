package io.sentry;

import cm.aptoide.p092pt.BuildConfig;
import io.sentry.protocol.C9558q;
import io.sentry.protocol.EnumC9567z;
import io.sentry.util.C9646q;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: TransactionContext.java */
/* renamed from: io.sentry.r5 */
/* loaded from: classes2.dex */
public final class C9581r5 extends C9436f5 {

    /* renamed from: p */
    private static final EnumC9567z f36805p = EnumC9567z.CUSTOM;

    /* renamed from: q */
    private String f36806q;

    /* renamed from: r */
    private EnumC9567z f36807r;

    /* renamed from: s */
    private C9574q5 f36808s;

    /* renamed from: t */
    private C9624u0 f36809t;

    /* renamed from: u */
    private EnumC9447h2 f36810u;

    @ApiStatus.Internal
    public C9581r5(String str, EnumC9567z enumC9567z, String str2) {
        this(str, enumC9567z, str2, null);
    }

    @ApiStatus.Internal
    /* renamed from: q */
    public static C9581r5 m31565q(C9526o3 c9526o3) throws NumberFormatException {
        C9574q5 c9574q5;
        Boolean boolM31128f = c9526o3.m31128f();
        C9574q5 c9574q52 = boolM31128f == null ? null : new C9574q5(boolM31128f);
        C9624u0 c9624u0M31124b = c9526o3.m31124b();
        if (c9624u0M31124b != null) {
            c9624u0M31124b.m31740a();
            Double dM31746h = c9624u0M31124b.m31746h();
            Boolean boolValueOf = Boolean.valueOf(boolM31128f != null ? boolM31128f.booleanValue() : false);
            if (dM31746h != null) {
                c9574q5 = new C9574q5(boolValueOf, dM31746h);
            } else {
                c9574q52 = new C9574q5(boolValueOf);
                c9574q5 = c9574q52;
            }
        } else {
            c9574q5 = c9574q52;
        }
        return new C9581r5(c9526o3.m31127e(), c9526o3.m31126d(), c9526o3.m31125c(), c9574q5, c9624u0M31124b);
    }

    /* renamed from: r */
    public C9624u0 m31566r() {
        return this.f36809t;
    }

    /* renamed from: s */
    public EnumC9447h2 m31567s() {
        return this.f36810u;
    }

    /* renamed from: t */
    public String m31568t() {
        return this.f36806q;
    }

    /* renamed from: u */
    public C9574q5 m31569u() {
        return this.f36808s;
    }

    /* renamed from: v */
    public EnumC9567z m31570v() {
        return this.f36807r;
    }

    @ApiStatus.Internal
    public C9581r5(String str, EnumC9567z enumC9567z, String str2, C9574q5 c9574q5) {
        super(str2);
        this.f36810u = EnumC9447h2.SENTRY;
        this.f36806q = (String) C9646q.m31802c(str, "name is required");
        this.f36807r = enumC9567z;
        m30806n(c9574q5);
    }

    @ApiStatus.Internal
    public C9581r5(C9558q c9558q, C9450h5 c9450h5, C9450h5 c9450h52, C9574q5 c9574q5, C9624u0 c9624u0) {
        super(c9558q, c9450h5, BuildConfig.APTOIDE_THEME, c9450h52, null);
        this.f36810u = EnumC9447h2.SENTRY;
        this.f36806q = "<unlabeled transaction>";
        this.f36808s = c9574q5;
        this.f36807r = f36805p;
        this.f36809t = c9624u0;
    }
}
