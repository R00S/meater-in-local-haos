package io.sentry;

import io.sentry.util.C9646q;
import io.sentry.util.C9654u;
import java.io.IOException;
import java.util.UUID;
import okhttp3.HttpUrl;

/* compiled from: SpanId.java */
/* renamed from: io.sentry.h5 */
/* loaded from: classes2.dex */
public final class C9450h5 implements InterfaceC9578r2 {

    /* renamed from: f */
    public static final C9450h5 f36344f = new C9450h5(new UUID(0, 0));

    /* renamed from: g */
    private final String f36345g;

    /* compiled from: SpanId.java */
    /* renamed from: io.sentry.h5$a */
    public static final class a implements InterfaceC9504l2<C9450h5> {
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9450h5 mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            return new C9450h5(c9518n2.m31881J());
        }
    }

    public C9450h5(String str) {
        this.f36345g = (String) C9646q.m31802c(str, "value is required");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9450h5.class != obj.getClass()) {
            return false;
        }
        return this.f36345g.equals(((C9450h5) obj).f36345g);
    }

    public int hashCode() {
        return this.f36345g.hashCode();
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30819b(this.f36345g);
    }

    public String toString() {
        return this.f36345g;
    }

    public C9450h5() {
        this(UUID.randomUUID());
    }

    private C9450h5(UUID uuid) {
        this(C9654u.m31820d(uuid.toString()).replace("-", HttpUrl.FRAGMENT_ENCODE_SET).substring(0, 16));
    }
}
