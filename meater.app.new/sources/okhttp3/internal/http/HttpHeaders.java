package okhttp3.internal.http;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10546u;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import p353j.C9703f;
import p353j.C9710i;

/* compiled from: HttpHeaders.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u000b\u001a\u00020\n*\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0012\u001a\u00020\r*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0015\u001a!\u0010\u001b\u001a\u00020\n*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001e\u001a\u00020\r*\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001dH\u0007¢\u0006\u0004\b!\u0010\u001f\"\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$\"\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$¨\u0006&"}, m32267d2 = {"Lokhttp3/Headers;", HttpUrl.FRAGMENT_ENCODE_SET, "headerName", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Challenge;", "parseChallenges", "(Lokhttp3/Headers;Ljava/lang/String;)Ljava/util/List;", "Lj/f;", HttpUrl.FRAGMENT_ENCODE_SET, "result", "Lkotlin/u;", "readChallengeHeader", "(Lj/f;Ljava/util/List;)V", HttpUrl.FRAGMENT_ENCODE_SET, "skipCommasAndWhitespace", "(Lj/f;)Z", HttpUrl.FRAGMENT_ENCODE_SET, "prefix", "startsWith", "(Lj/f;B)Z", "readQuotedString", "(Lj/f;)Ljava/lang/String;", "readToken", "Lokhttp3/CookieJar;", "Lokhttp3/HttpUrl;", "url", "headers", "receiveHeaders", "(Lokhttp3/CookieJar;Lokhttp3/HttpUrl;Lokhttp3/Headers;)V", "Lokhttp3/Response;", "promisesBody", "(Lokhttp3/Response;)Z", "response", "hasBody", "Lj/i;", "QUOTED_STRING_DELIMITERS", "Lj/i;", "TOKEN_DELIMITERS", "okhttp"}, m32268k = 2, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class HttpHeaders {
    private static final C9710i QUOTED_STRING_DELIMITERS;
    private static final C9710i TOKEN_DELIMITERS;

    static {
        C9710i.a aVar = C9710i.f37052g;
        QUOTED_STRING_DELIMITERS = aVar.m32103d("\"\\");
        TOKEN_DELIMITERS = aVar.m32103d("\t ,=");
    }

    public static final boolean hasBody(Response response) {
        C9801m.m32346f(response, "response");
        return promisesBody(response);
    }

    public static final List<Challenge> parseChallenges(Headers headers, String str) {
        C9801m.m32346f(headers, "$this$parseChallenges");
        C9801m.m32346f(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (C10546u.m37515q(str, headers.name(i2), true)) {
                try {
                    readChallengeHeader(new C9703f().mo32055r0(headers.value(i2)), arrayList);
                } catch (EOFException e2) {
                    Platform.INSTANCE.get().log("Unable to parse challenge", 5, e2);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(Response response) {
        C9801m.m32346f(response, "$this$promisesBody");
        if (C9801m.m32341a(response.request().method(), "HEAD")) {
            return false;
        }
        int iCode = response.code();
        return (((iCode >= 100 && iCode < 200) || iCode == 204 || iCode == 304) && Util.headersContentLength(response) == -1 && !C10546u.m37515q("chunked", Response.header$default(response, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0085, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0085, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void readChallengeHeader(p353j.C9703f r7, java.util.List<okhttp3.Challenge> r8) throws java.io.EOFException {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Le
            skipCommasAndWhitespace(r7)
            java.lang.String r1 = readToken(r7)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = skipCommasAndWhitespace(r7)
            java.lang.String r3 = readToken(r7)
            if (r3 != 0) goto L2c
            boolean r7 = r7.mo32019R()
            if (r7 != 0) goto L1f
            return
        L1f:
            okhttp3.Challenge r7 = new okhttp3.Challenge
            java.util.Map r0 = kotlin.collections.C10804n0.m38778i()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2c:
            r4 = 61
            byte r4 = (byte) r4
            int r5 = okhttp3.internal.Util.skipAll(r7, r4)
            boolean r6 = skipCommasAndWhitespace(r7)
            if (r2 != 0) goto L68
            if (r6 != 0) goto L41
            boolean r2 = r7.mo32019R()
            if (r2 == 0) goto L68
        L41:
            okhttp3.Challenge r2 = new okhttp3.Challenge
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "="
            java.lang.String r3 = kotlin.text.C10537l.m37490w(r3, r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "Collections.singletonMap…ek + \"=\".repeat(eqCount))"
            kotlin.jvm.internal.C9801m.m32345e(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L68:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = okhttp3.internal.Util.skipAll(r7, r4)
            int r5 = r5 + r6
        L72:
            if (r3 != 0) goto L83
            java.lang.String r3 = readToken(r7)
            boolean r5 = skipCommasAndWhitespace(r7)
            if (r5 == 0) goto L7f
            goto L85
        L7f:
            int r5 = okhttp3.internal.Util.skipAll(r7, r4)
        L83:
            if (r5 != 0) goto L90
        L85:
            okhttp3.Challenge r4 = new okhttp3.Challenge
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        L90:
            r6 = 1
            if (r5 <= r6) goto L94
            return
        L94:
            boolean r6 = skipCommasAndWhitespace(r7)
            if (r6 == 0) goto L9b
            return
        L9b:
            r6 = 34
            byte r6 = (byte) r6
            boolean r6 = startsWith(r7, r6)
            if (r6 == 0) goto La9
            java.lang.String r6 = readQuotedString(r7)
            goto Lad
        La9:
            java.lang.String r6 = readToken(r7)
        Lad:
            if (r6 == 0) goto Lc7
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lb8
            return
        Lb8:
            boolean r3 = skipCommasAndWhitespace(r7)
            if (r3 != 0) goto Lc5
            boolean r3 = r7.mo32019R()
            if (r3 != 0) goto Lc5
            return
        Lc5:
            r3 = r0
            goto L72
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.readChallengeHeader(j.f, java.util.List):void");
    }

    private static final String readQuotedString(C9703f c9703f) throws EOFException {
        byte b2 = (byte) 34;
        if (!(c9703f.readByte() == b2)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        C9703f c9703f2 = new C9703f();
        while (true) {
            long jMo32031b0 = c9703f.mo32031b0(QUOTED_STRING_DELIMITERS);
            if (jMo32031b0 == -1) {
                return null;
            }
            if (c9703f.m32047m(jMo32031b0) == b2) {
                c9703f2.write(c9703f, jMo32031b0);
                c9703f.readByte();
                return c9703f2.m32021T();
            }
            if (c9703f.size() == jMo32031b0 + 1) {
                return null;
            }
            c9703f2.write(c9703f, jMo32031b0);
            c9703f.readByte();
            c9703f2.write(c9703f, 1L);
        }
    }

    private static final String readToken(C9703f c9703f) {
        long jMo32031b0 = c9703f.mo32031b0(TOKEN_DELIMITERS);
        if (jMo32031b0 == -1) {
            jMo32031b0 = c9703f.size();
        }
        if (jMo32031b0 != 0) {
            return c9703f.m32027Z(jMo32031b0);
        }
        return null;
    }

    public static final void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        C9801m.m32346f(cookieJar, "$this$receiveHeaders");
        C9801m.m32346f(httpUrl, "url");
        C9801m.m32346f(headers, "headers");
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> all = Cookie.INSTANCE.parseAll(httpUrl, headers);
        if (all.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(httpUrl, all);
    }

    private static final boolean skipCommasAndWhitespace(C9703f c9703f) throws EOFException {
        boolean z = false;
        while (!c9703f.mo32019R()) {
            byte bM32047m = c9703f.m32047m(0L);
            if (bM32047m == 9 || bM32047m == 32) {
                c9703f.readByte();
            } else {
                if (bM32047m != 44) {
                    break;
                }
                c9703f.readByte();
                z = true;
            }
        }
        return z;
    }

    private static final boolean startsWith(C9703f c9703f, byte b2) {
        return !c9703f.mo32019R() && c9703f.m32047m(0L) == b2;
    }
}
