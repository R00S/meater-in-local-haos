package y9;

import B9.l;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import w9.g;

/* compiled from: InstrumentApacheHttpResponseHandler.java */
/* renamed from: y9.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5142c<T> implements ResponseHandler<T> {

    /* renamed from: a, reason: collision with root package name */
    private final ResponseHandler<? extends T> f53250a;

    /* renamed from: b, reason: collision with root package name */
    private final l f53251b;

    /* renamed from: c, reason: collision with root package name */
    private final g f53252c;

    public C5142c(ResponseHandler<? extends T> responseHandler, l lVar, g gVar) {
        this.f53250a = responseHandler;
        this.f53251b = lVar;
        this.f53252c = gVar;
    }

    @Override // org.apache.http.client.ResponseHandler
    public T handleResponse(HttpResponse httpResponse) {
        this.f53252c.r(this.f53251b.c());
        this.f53252c.k(httpResponse.getStatusLine().getStatusCode());
        Long lA = C5143d.a(httpResponse);
        if (lA != null) {
            this.f53252c.p(lA.longValue());
        }
        String strB = C5143d.b(httpResponse);
        if (strB != null) {
            this.f53252c.o(strB);
        }
        this.f53252c.b();
        return this.f53250a.handleResponse(httpResponse);
    }
}
