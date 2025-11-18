package com.airbnb.lottie.p112s;

import com.airbnb.lottie.p112s.p114j.C5264n;
import java.util.List;

/* compiled from: FontCharacter.java */
/* renamed from: com.airbnb.lottie.s.d */
/* loaded from: classes.dex */
public class C5232d {

    /* renamed from: a */
    private final List<C5264n> f12666a;

    /* renamed from: b */
    private final char f12667b;

    /* renamed from: c */
    private final double f12668c;

    /* renamed from: d */
    private final double f12669d;

    /* renamed from: e */
    private final String f12670e;

    /* renamed from: f */
    private final String f12671f;

    public C5232d(List<C5264n> list, char c2, double d2, double d3, String str, String str2) {
        this.f12666a = list;
        this.f12667b = c2;
        this.f12668c = d2;
        this.f12669d = d3;
        this.f12670e = str;
        this.f12671f = str2;
    }

    /* renamed from: c */
    public static int m9600c(char c2, String str, String str2) {
        return ((((0 + c2) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    /* renamed from: a */
    public List<C5264n> m9601a() {
        return this.f12666a;
    }

    /* renamed from: b */
    public double m9602b() {
        return this.f12669d;
    }

    public int hashCode() {
        return m9600c(this.f12667b, this.f12671f, this.f12670e);
    }
}
