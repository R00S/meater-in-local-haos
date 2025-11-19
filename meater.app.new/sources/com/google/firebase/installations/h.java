package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import m9.AbstractC4014d;
import o9.InterfaceC4147a;

/* compiled from: Utils.java */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final long f38205b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f38206c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    private static h f38207d;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4147a f38208a;

    private h(InterfaceC4147a interfaceC4147a) {
        this.f38208a = interfaceC4147a;
    }

    public static h c() {
        return d(o9.b.b());
    }

    public static h d(InterfaceC4147a interfaceC4147a) {
        if (f38207d == null) {
            f38207d = new h(interfaceC4147a);
        }
        return f38207d;
    }

    static boolean g(String str) {
        return f38206c.matcher(str).matches();
    }

    static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f38208a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(AbstractC4014d abstractC4014d) {
        return TextUtils.isEmpty(abstractC4014d.b()) || abstractC4014d.h() + abstractC4014d.c() < b() + f38205b;
    }
}
