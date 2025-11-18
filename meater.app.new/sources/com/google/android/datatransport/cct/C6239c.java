package com.google.android.datatransport.cct;

import cm.aptoide.p092pt.networking.BodyInterceptorV3;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import p241e.p254e.p256b.p257a.C8785b;
import p241e.p254e.p256b.p257a.p258i.InterfaceC8865h;

/* compiled from: CCTDestination.java */
/* renamed from: com.google.android.datatransport.cct.c */
/* loaded from: classes2.dex */
public final class C6239c implements InterfaceC8865h {

    /* renamed from: a */
    static final String f16579a;

    /* renamed from: b */
    static final String f16580b;

    /* renamed from: c */
    private static final String f16581c;

    /* renamed from: d */
    private static final Set<C8785b> f16582d;

    /* renamed from: e */
    public static final C6239c f16583e;

    /* renamed from: f */
    public static final C6239c f16584f;

    /* renamed from: g */
    private final String f16585g;

    /* renamed from: h */
    private final String f16586h;

    static {
        String strM13416a = C6241e.m13416a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f16579a = strM13416a;
        String strM13416a2 = C6241e.m13416a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f16580b = strM13416a2;
        String strM13416a3 = C6241e.m13416a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f16581c = strM13416a3;
        f16582d = Collections.unmodifiableSet(new HashSet(Arrays.asList(C8785b.m27945b("proto"), C8785b.m27945b(BodyInterceptorV3.RESPONSE_MODE_JSON))));
        f16583e = new C6239c(strM13416a, null);
        f16584f = new C6239c(strM13416a2, strM13416a3);
    }

    public C6239c(String str, String str2) {
        this.f16585g = str;
        this.f16586h = str2;
    }

    /* renamed from: c */
    public static C6239c m13397c(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new C6239c(str2, str3);
    }

    @Override // p241e.p254e.p256b.p257a.p258i.InterfaceC8865h
    /* renamed from: a */
    public Set<C8785b> mo13398a() {
        return f16582d;
    }

    /* renamed from: b */
    public byte[] m13399b() {
        String str = this.f16586h;
        if (str == null && this.f16585g == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f16585g;
        objArr[2] = "\\";
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    /* renamed from: d */
    public String m13400d() {
        return this.f16586h;
    }

    /* renamed from: e */
    public String m13401e() {
        return this.f16585g;
    }

    @Override // p241e.p254e.p256b.p257a.p258i.InterfaceC8864g
    public byte[] getExtras() {
        return m13399b();
    }

    @Override // p241e.p254e.p256b.p257a.p258i.InterfaceC8864g
    public String getName() {
        return "cct";
    }
}
