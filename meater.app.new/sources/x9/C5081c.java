package x9;

import B9.m;
import C9.h;
import android.content.Context;
import java.net.URI;
import v9.C4925a;

/* compiled from: FirebasePerfNetworkValidator.java */
/* renamed from: x9.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5081c extends e {

    /* renamed from: c, reason: collision with root package name */
    private static final C4925a f52905c = C4925a.e();

    /* renamed from: a, reason: collision with root package name */
    private final h f52906a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f52907b;

    C5081c(h hVar, Context context) {
        this.f52907b = context;
        this.f52906a = hVar;
    }

    private URI g(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URI.create(str);
        } catch (IllegalArgumentException | IllegalStateException e10) {
            f52905c.k("getResultUrl throws exception %s", e10.getMessage());
            return null;
        }
    }

    private boolean h(URI uri, Context context) {
        if (uri == null) {
            return false;
        }
        return m.a(uri, context);
    }

    private boolean i(String str) {
        if (str == null) {
            return true;
        }
        return str.trim().isEmpty();
    }

    private boolean j(String str) {
        return i(str);
    }

    private boolean k(String str) {
        return (str == null || i(str) || str.length() > 255) ? false : true;
    }

    private boolean m(int i10) {
        return i10 > 0;
    }

    private boolean n(long j10) {
        return j10 >= 0;
    }

    private boolean o(int i10) {
        return i10 == -1 || i10 > 0;
    }

    private boolean p(String str) {
        if (str == null) {
            return false;
        }
        return "http".equalsIgnoreCase(str) || "https".equalsIgnoreCase(str);
    }

    private boolean q(long j10) {
        return j10 >= 0;
    }

    private boolean r(String str) {
        return str == null;
    }

    @Override // x9.e
    public boolean c() {
        if (j(this.f52906a.C0())) {
            f52905c.j("URL is missing:" + this.f52906a.C0());
            return false;
        }
        URI uriG = g(this.f52906a.C0());
        if (uriG == null) {
            f52905c.j("URL cannot be parsed");
            return false;
        }
        if (!h(uriG, this.f52907b)) {
            f52905c.j("URL fails allowlist rule: " + uriG);
            return false;
        }
        if (!k(uriG.getHost())) {
            f52905c.j("URL host is null or invalid");
            return false;
        }
        if (!p(uriG.getScheme())) {
            f52905c.j("URL scheme is null or invalid");
            return false;
        }
        if (!r(uriG.getUserInfo())) {
            f52905c.j("URL user info is null");
            return false;
        }
        if (!o(uriG.getPort())) {
            f52905c.j("URL port is less than or equal to 0");
            return false;
        }
        if (!l(this.f52906a.E0() ? this.f52906a.t0() : null)) {
            f52905c.j("HTTP Method is null or invalid: " + this.f52906a.t0());
            return false;
        }
        if (this.f52906a.F0() && !m(this.f52906a.u0())) {
            f52905c.j("HTTP ResponseCode is a negative value:" + this.f52906a.u0());
            return false;
        }
        if (this.f52906a.G0() && !n(this.f52906a.w0())) {
            f52905c.j("Request Payload is a negative value:" + this.f52906a.w0());
            return false;
        }
        if (this.f52906a.H0() && !n(this.f52906a.y0())) {
            f52905c.j("Response Payload is a negative value:" + this.f52906a.y0());
            return false;
        }
        if (!this.f52906a.D0() || this.f52906a.r0() <= 0) {
            f52905c.j("Start time of the request is null, or zero, or a negative value:" + this.f52906a.r0());
            return false;
        }
        if (this.f52906a.I0() && !q(this.f52906a.z0())) {
            f52905c.j("Time to complete the request is a negative value:" + this.f52906a.z0());
            return false;
        }
        if (this.f52906a.K0() && !q(this.f52906a.B0())) {
            f52905c.j("Time from the start of the request to the start of the response is null or a negative value:" + this.f52906a.B0());
            return false;
        }
        if (this.f52906a.J0() && this.f52906a.A0() > 0) {
            if (this.f52906a.F0()) {
                return true;
            }
            f52905c.j("Did not receive a HTTP Response Code");
            return false;
        }
        f52905c.j("Time from the start of the request to the end of the response is null, negative or zero:" + this.f52906a.A0());
        return false;
    }

    boolean l(h.d dVar) {
        return (dVar == null || dVar == h.d.HTTP_METHOD_UNKNOWN) ? false : true;
    }
}
