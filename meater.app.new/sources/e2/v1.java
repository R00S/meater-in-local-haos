package e2;

import X1.C1804a;
import android.media.metrics.LogSessionId;
import java.util.Objects;

/* compiled from: PlayerId.java */
/* loaded from: classes.dex */
public final class v1 {

    /* renamed from: d, reason: collision with root package name */
    public static final v1 f40283d;

    /* renamed from: a, reason: collision with root package name */
    public final String f40284a;

    /* renamed from: b, reason: collision with root package name */
    private final a f40285b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f40286c;

    /* compiled from: PlayerId.java */
    private static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f40287b = new a(LogSessionId.LOG_SESSION_ID_NONE);

        /* renamed from: a, reason: collision with root package name */
        public final LogSessionId f40288a;

        public a(LogSessionId logSessionId) {
            this.f40288a = logSessionId;
        }
    }

    static {
        f40283d = X1.L.f18626a < 31 ? new v1("") : new v1(a.f40287b, "");
    }

    public v1(String str) {
        C1804a.g(X1.L.f18626a < 31);
        this.f40284a = str;
        this.f40285b = null;
        this.f40286c = new Object();
    }

    public LogSessionId a() {
        return ((a) C1804a.e(this.f40285b)).f40288a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return Objects.equals(this.f40284a, v1Var.f40284a) && Objects.equals(this.f40285b, v1Var.f40285b) && Objects.equals(this.f40286c, v1Var.f40286c);
    }

    public int hashCode() {
        return Objects.hash(this.f40284a, this.f40285b, this.f40286c);
    }

    public v1(LogSessionId logSessionId, String str) {
        this(new a(logSessionId), str);
    }

    private v1(a aVar, String str) {
        this.f40285b = aVar;
        this.f40284a = str;
        this.f40286c = new Object();
    }
}
