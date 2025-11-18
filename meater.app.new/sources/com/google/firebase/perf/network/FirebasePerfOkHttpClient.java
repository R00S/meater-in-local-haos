package com.google.firebase.perf.network;

import A9.k;
import B9.l;
import androidx.annotation.Keep;
import java.io.IOException;
import oc.C4178B;
import oc.C4180D;
import oc.E;
import oc.InterfaceC4185e;
import oc.InterfaceC4186f;
import oc.v;
import oc.x;
import w9.g;
import y9.C5143d;

/* loaded from: classes2.dex */
public class FirebasePerfOkHttpClient {
    private FirebasePerfOkHttpClient() {
    }

    static void a(C4180D c4180d, g gVar, long j10, long j11) {
        C4178B request = c4180d.getRequest();
        if (request == null) {
            return;
        }
        gVar.t(request.getUrl().u().toString());
        gVar.j(request.getMethod());
        if (request.getBody() != null) {
            long jA = request.getBody().a();
            if (jA != -1) {
                gVar.m(jA);
            }
        }
        E body = c4180d.getBody();
        if (body != null) {
            long contentLength = body.getContentLength();
            if (contentLength != -1) {
                gVar.p(contentLength);
            }
            x f46807d = body.getF46807D();
            if (f46807d != null) {
                gVar.o(f46807d.getMediaType());
            }
        }
        gVar.k(c4180d.getCode());
        gVar.n(j10);
        gVar.r(j11);
        gVar.b();
    }

    @Keep
    public static void enqueue(InterfaceC4185e interfaceC4185e, InterfaceC4186f interfaceC4186f) {
        l lVar = new l();
        interfaceC4185e.v0(new d(interfaceC4186f, k.k(), lVar, lVar.e()));
    }

    @Keep
    public static C4180D execute(InterfaceC4185e interfaceC4185e) throws IOException {
        g gVarC = g.c(k.k());
        l lVar = new l();
        long jE = lVar.e();
        try {
            C4180D c4180dExecute = interfaceC4185e.execute();
            a(c4180dExecute, gVarC, jE, lVar.c());
            return c4180dExecute;
        } catch (IOException e10) {
            C4178B c4178bRequest = interfaceC4185e.request();
            if (c4178bRequest != null) {
                v url = c4178bRequest.getUrl();
                if (url != null) {
                    gVarC.t(url.u().toString());
                }
                if (c4178bRequest.getMethod() != null) {
                    gVarC.j(c4178bRequest.getMethod());
                }
            }
            gVarC.n(jE);
            gVarC.r(lVar.c());
            C5143d.d(gVarC);
            throw e10;
        }
    }
}
