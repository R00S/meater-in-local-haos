package uc;

import Cc.l;
import Cc.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import oc.AbstractC4179C;
import oc.C4178B;
import oc.C4180D;
import oc.E;
import oc.m;
import oc.n;
import oc.w;
import oc.x;

/* compiled from: BridgeInterceptor.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Luc/a;", "Loc/w;", "Loc/n;", "cookieJar", "<init>", "(Loc/n;)V", "", "Loc/m;", "cookies", "", "b", "(Ljava/util/List;)Ljava/lang/String;", "Loc/w$a;", "chain", "Loc/D;", "a", "(Loc/w$a;)Loc/D;", "Loc/n;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: uc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4704a implements w {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n cookieJar;

    public C4704a(n cookieJar) {
        C3862t.g(cookieJar, "cookieJar");
        this.cookieJar = cookieJar;
    }

    private final String b(List<m> cookies) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (Object obj : cookies) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                r.w();
            }
            m mVar = (m) obj;
            if (i10 > 0) {
                sb2.append("; ");
            }
            sb2.append(mVar.getName());
            sb2.append('=');
            sb2.append(mVar.getValue());
            i10 = i11;
        }
        String string = sb2.toString();
        C3862t.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // oc.w
    public C4180D a(w.a chain) {
        E body;
        C3862t.g(chain, "chain");
        C4178B c4178bRequest = chain.request();
        C4178B.a aVarI = c4178bRequest.i();
        AbstractC4179C body2 = c4178bRequest.getBody();
        if (body2 != null) {
            x contentType = body2.getContentType();
            if (contentType != null) {
                aVarI.d("Content-Type", contentType.getMediaType());
            }
            long jA = body2.a();
            if (jA != -1) {
                aVarI.d("Content-Length", String.valueOf(jA));
                aVarI.g("Transfer-Encoding");
            } else {
                aVarI.d("Transfer-Encoding", "chunked");
                aVarI.g("Content-Length");
            }
        }
        boolean z10 = false;
        if (c4178bRequest.d("Host") == null) {
            aVarI.d("Host", pc.d.S(c4178bRequest.getUrl(), false, 1, null));
        }
        if (c4178bRequest.d("Connection") == null) {
            aVarI.d("Connection", "Keep-Alive");
        }
        if (c4178bRequest.d("Accept-Encoding") == null && c4178bRequest.d("Range") == null) {
            aVarI.d("Accept-Encoding", "gzip");
            z10 = true;
        }
        List<m> listB = this.cookieJar.b(c4178bRequest.getUrl());
        if (!listB.isEmpty()) {
            aVarI.d("Cookie", b(listB));
        }
        if (c4178bRequest.d("User-Agent") == null) {
            aVarI.d("User-Agent", "okhttp/4.12.0");
        }
        C4180D c4180dA = chain.a(aVarI.b());
        e.f(this.cookieJar, c4178bRequest.getUrl(), c4180dA.getHeaders());
        C4180D.a aVarR = c4180dA.o().r(c4178bRequest);
        if (z10 && Ub.n.t("gzip", C4180D.k(c4180dA, "Content-Encoding", null, 2, null), true) && e.b(c4180dA) && (body = c4180dA.getBody()) != null) {
            l lVar = new l(body.getSource());
            aVarR.k(c4180dA.getHeaders().i().h("Content-Encoding").h("Content-Length").e());
            aVarR.b(new h(C4180D.k(c4180dA, "Content-Type", null, 2, null), -1L, o.d(lVar)));
        }
        return aVarR.c();
    }
}
