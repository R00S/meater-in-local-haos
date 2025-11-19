package oc;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: Protocol.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Loc/A;", "", "", "protocol", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "B", "Ljava/lang/String;", "C", "a", "D", "E", "F", "G", "H", "I", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: oc.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC4177A {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final String protocol;

    /* compiled from: Protocol.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Loc/A$a;", "", "<init>", "()V", "", "protocol", "Loc/A;", "a", "(Ljava/lang/String;)Loc/A;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: oc.A$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final EnumC4177A a(String protocol) throws IOException {
            C3862t.g(protocol, "protocol");
            EnumC4177A enumC4177A = EnumC4177A.HTTP_1_0;
            if (!C3862t.b(protocol, enumC4177A.protocol)) {
                enumC4177A = EnumC4177A.HTTP_1_1;
                if (!C3862t.b(protocol, enumC4177A.protocol)) {
                    enumC4177A = EnumC4177A.H2_PRIOR_KNOWLEDGE;
                    if (!C3862t.b(protocol, enumC4177A.protocol)) {
                        enumC4177A = EnumC4177A.HTTP_2;
                        if (!C3862t.b(protocol, enumC4177A.protocol)) {
                            enumC4177A = EnumC4177A.SPDY_3;
                            if (!C3862t.b(protocol, enumC4177A.protocol)) {
                                enumC4177A = EnumC4177A.QUIC;
                                if (!C3862t.b(protocol, enumC4177A.protocol)) {
                                    throw new IOException("Unexpected protocol: " + protocol);
                                }
                            }
                        }
                    }
                }
            }
            return enumC4177A;
        }

        private Companion() {
        }
    }

    EnumC4177A(String str) {
        this.protocol = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
