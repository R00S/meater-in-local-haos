package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.firebase.installations.p197q.AbstractC8396d;
import com.google.firebase.installations.p199s.C8404b;
import com.google.firebase.installations.p199s.InterfaceC8403a;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: Utils.java */
/* renamed from: com.google.firebase.installations.o */
/* loaded from: classes2.dex */
public final class C8391o {

    /* renamed from: a */
    public static final long f31815a = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: b */
    private static final Pattern f31816b = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: c */
    private static C8391o f31817c;

    /* renamed from: d */
    private final InterfaceC8403a f31818d;

    private C8391o(InterfaceC8403a interfaceC8403a) {
        this.f31818d = interfaceC8403a;
    }

    /* renamed from: c */
    public static C8391o m26290c() {
        return m26291d(C8404b.m26386b());
    }

    /* renamed from: d */
    public static C8391o m26291d(InterfaceC8403a interfaceC8403a) {
        if (f31817c == null) {
            f31817c = new C8391o(interfaceC8403a);
        }
        return f31817c;
    }

    /* renamed from: g */
    static boolean m26292g(String str) {
        return f31816b.matcher(str).matches();
    }

    /* renamed from: h */
    static boolean m26293h(String str) {
        return str.contains(":");
    }

    /* renamed from: a */
    public long m26294a() {
        return this.f31818d.mo26385a();
    }

    /* renamed from: b */
    public long m26295b() {
        return TimeUnit.MILLISECONDS.toSeconds(m26294a());
    }

    /* renamed from: e */
    public long m26296e() {
        return (long) (Math.random() * 1000.0d);
    }

    /* renamed from: f */
    public boolean m26297f(AbstractC8396d abstractC8396d) {
        return TextUtils.isEmpty(abstractC8396d.mo26299b()) || abstractC8396d.mo26305h() + abstractC8396d.mo26300c() < m26295b() + f31815a;
    }
}
