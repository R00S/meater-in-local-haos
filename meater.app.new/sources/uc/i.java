package uc;

import java.net.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oc.C4178B;
import oc.v;

/* compiled from: RequestLine.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Luc/i;", "", "<init>", "()V", "Loc/B;", "request", "Ljava/net/Proxy$Type;", "proxyType", "", "b", "(Loc/B;Ljava/net/Proxy$Type;)Z", "", "a", "(Loc/B;Ljava/net/Proxy$Type;)Ljava/lang/String;", "Loc/v;", "url", "c", "(Loc/v;)Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f50550a = new i();

    private i() {
    }

    private final boolean b(C4178B request, Proxy.Type proxyType) {
        return !request.g() && proxyType == Proxy.Type.HTTP;
    }

    public final String a(C4178B request, Proxy.Type proxyType) {
        C3862t.g(request, "request");
        C3862t.g(proxyType, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.getMethod());
        sb2.append(' ');
        i iVar = f50550a;
        if (iVar.b(request, proxyType)) {
            sb2.append(request.getUrl());
        } else {
            sb2.append(iVar.c(request.getUrl()));
        }
        sb2.append(" HTTP/1.1");
        String string = sb2.toString();
        C3862t.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String c(v url) {
        C3862t.g(url, "url");
        String strD = url.d();
        String strF = url.f();
        if (strF == null) {
            return strD;
        }
        return strD + '?' + strF;
    }
}
