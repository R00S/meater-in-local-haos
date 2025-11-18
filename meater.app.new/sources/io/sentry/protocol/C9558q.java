package io.sentry.protocol;

import io.sentry.C9518n2;
import io.sentry.InterfaceC9448h3;
import io.sentry.InterfaceC9504l2;
import io.sentry.InterfaceC9578r2;
import io.sentry.InterfaceC9670w1;
import io.sentry.util.C9654u;
import java.io.IOException;
import java.util.UUID;
import okhttp3.HttpUrl;

/* compiled from: SentryId.java */
/* renamed from: io.sentry.protocol.q */
/* loaded from: classes2.dex */
public final class C9558q implements InterfaceC9578r2 {

    /* renamed from: f */
    public static final C9558q f36725f = new C9558q(new UUID(0, 0));

    /* renamed from: g */
    private final UUID f36726g;

    /* compiled from: SentryId.java */
    /* renamed from: io.sentry.protocol.q$a */
    public static final class a implements InterfaceC9504l2<C9558q> {
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9558q mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            return new C9558q(c9518n2.m31881J());
        }
    }

    public C9558q() {
        this((UUID) null);
    }

    /* renamed from: a */
    private UUID m31452a(String str) {
        if (str.length() == 32) {
            str = new StringBuilder(str).insert(8, "-").insert(13, "-").insert(18, "-").insert(23, "-").toString();
        }
        if (str.length() == 36) {
            return UUID.fromString(str);
        }
        throw new IllegalArgumentException("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: " + str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C9558q.class == obj.getClass() && this.f36726g.compareTo(((C9558q) obj).f36726g) == 0;
    }

    public int hashCode() {
        return this.f36726g.hashCode();
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30819b(toString());
    }

    public String toString() {
        return C9654u.m31820d(this.f36726g.toString()).replace("-", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public C9558q(UUID uuid) {
        this.f36726g = uuid == null ? UUID.randomUUID() : uuid;
    }

    public C9558q(String str) {
        this.f36726g = m31452a(C9654u.m31820d(str));
    }
}
