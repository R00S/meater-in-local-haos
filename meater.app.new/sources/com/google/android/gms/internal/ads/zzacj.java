package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public abstract class zzacj<T> {

    /* renamed from: a */
    private final int f21578a;

    /* renamed from: b */
    private final String f21579b;

    /* renamed from: c */
    private final T f21580c;

    private zzacj(int i2, String str, T t) {
        this.f21578a = i2;
        this.f21579b = str;
        this.f21580c = t;
        zzyt.m20847d().m16413b(this);
    }

    /* renamed from: c */
    public static zzacj<Float> m16402c(int i2, String str, float f2) {
        return new C6988o(i2, str, Float.valueOf(f2));
    }

    /* renamed from: d */
    public static zzacj<Integer> m16403d(int i2, String str, int i3) {
        return new C6914m(i2, str, Integer.valueOf(i3));
    }

    /* renamed from: e */
    public static zzacj<Long> m16404e(int i2, String str, long j2) {
        return new C6951n(i2, str, Long.valueOf(j2));
    }

    /* renamed from: f */
    public static zzacj<Boolean> m16405f(int i2, String str, Boolean bool) {
        return new C6877l(i2, str, bool);
    }

    /* renamed from: g */
    public static zzacj<String> m16406g(int i2, String str, String str2) {
        return new C7025p(i2, str, str2);
    }

    /* renamed from: l */
    public static zzacj<String> m16407l(int i2, String str) {
        zzacj<String> zzacjVarM16406g = m16406g(i2, str, null);
        zzyt.m20847d().m16414c(zzacjVarM16406g);
        return zzacjVarM16406g;
    }

    /* renamed from: m */
    public static zzacj<String> m16408m(int i2, String str) {
        zzacj<String> zzacjVarM16406g = m16406g(i2, str, null);
        zzyt.m20847d().m16415d(zzacjVarM16406g);
        return zzacjVarM16406g;
    }

    /* renamed from: a */
    public final String m16409a() {
        return this.f21579b;
    }

    /* renamed from: b */
    public final int m16410b() {
        return this.f21578a;
    }

    /* renamed from: h */
    protected abstract T mo15498h(SharedPreferences sharedPreferences);

    /* renamed from: i */
    public abstract T mo15499i(Bundle bundle);

    /* renamed from: j */
    protected abstract T mo15500j(JSONObject jSONObject);

    /* renamed from: k */
    public abstract void mo15501k(SharedPreferences.Editor editor, T t);

    /* renamed from: n */
    public final T m16411n() {
        return this.f21580c;
    }

    /* synthetic */ zzacj(int i2, String str, Object obj, C6877l c6877l) {
        this(i2, str, obj);
    }
}
