package retrofit2;

import java.util.Objects;
import nd.s;

/* loaded from: classes3.dex */
public class HttpException extends RuntimeException {

    /* renamed from: B, reason: collision with root package name */
    private final int f48581B;

    /* renamed from: C, reason: collision with root package name */
    private final String f48582C;

    /* renamed from: D, reason: collision with root package name */
    private final transient s<?> f48583D;

    public HttpException(s<?> sVar) {
        super(a(sVar));
        this.f48581B = sVar.b();
        this.f48582C = sVar.g();
        this.f48583D = sVar;
    }

    private static String a(s<?> sVar) {
        Objects.requireNonNull(sVar, "response == null");
        return "HTTP " + sVar.b() + " " + sVar.g();
    }
}
