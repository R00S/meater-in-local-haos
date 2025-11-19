package com.google.android.datatransport.cct;

import M6.g;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: CCTDestination.java */
/* loaded from: classes2.dex */
public final class a implements g {

    /* renamed from: c, reason: collision with root package name */
    static final String f33387c;

    /* renamed from: d, reason: collision with root package name */
    static final String f33388d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f33389e;

    /* renamed from: f, reason: collision with root package name */
    private static final Set<K6.c> f33390f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f33391g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f33392h;

    /* renamed from: a, reason: collision with root package name */
    private final String f33393a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33394b;

    static {
        String strA = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f33387c = strA;
        String strA2 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f33388d = strA2;
        String strA3 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f33389e = strA3;
        f33390f = Collections.unmodifiableSet(new HashSet(Arrays.asList(K6.c.b("proto"), K6.c.b("json"))));
        f33391g = new a(strA, null);
        f33392h = new a(strA2, strA3);
    }

    public a(String str, String str2) {
        this.f33393a = str;
        this.f33394b = str2;
    }

    public static a c(byte[] bArr) {
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
        return new a(str2, str3);
    }

    @Override // M6.g
    public Set<K6.c> a() {
        return f33390f;
    }

    public byte[] b() {
        String str = this.f33394b;
        if (str == null && this.f33393a == null) {
            return null;
        }
        String str2 = this.f33393a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName("UTF-8"));
    }

    public String d() {
        return this.f33394b;
    }

    public String e() {
        return this.f33393a;
    }

    @Override // M6.f
    public byte[] getExtras() {
        return b();
    }

    @Override // M6.f
    public String getName() {
        return "cct";
    }
}
