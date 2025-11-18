package io.sentry;

import io.sentry.protocol.C9542b0;

/* compiled from: Attachment.java */
/* renamed from: io.sentry.s0 */
/* loaded from: classes2.dex */
public final class C9583s0 {

    /* renamed from: a */
    private byte[] f36815a;

    /* renamed from: b */
    private final InterfaceC9578r2 f36816b;

    /* renamed from: c */
    private String f36817c;

    /* renamed from: d */
    private final String f36818d;

    /* renamed from: e */
    private final String f36819e;

    /* renamed from: f */
    private final boolean f36820f;

    /* renamed from: g */
    private String f36821g;

    public C9583s0(byte[] bArr, String str, String str2, boolean z) {
        this(bArr, str, str2, "event.attachment", z);
    }

    /* renamed from: a */
    public static C9583s0 m31572a(byte[] bArr) {
        return new C9583s0(bArr, "screenshot.png", "image/png", false);
    }

    /* renamed from: b */
    public static C9583s0 m31573b(byte[] bArr) {
        return new C9583s0(bArr, "thread-dump.txt", "text/plain", false);
    }

    /* renamed from: c */
    public static C9583s0 m31574c(C9542b0 c9542b0) {
        return new C9583s0((InterfaceC9578r2) c9542b0, "view-hierarchy.json", "application/json", "event.view_hierarchy", false);
    }

    /* renamed from: d */
    public String m31575d() {
        return this.f36821g;
    }

    /* renamed from: e */
    public byte[] m31576e() {
        return this.f36815a;
    }

    /* renamed from: f */
    public String m31577f() {
        return this.f36819e;
    }

    /* renamed from: g */
    public String m31578g() {
        return this.f36818d;
    }

    /* renamed from: h */
    public String m31579h() {
        return this.f36817c;
    }

    /* renamed from: i */
    public InterfaceC9578r2 m31580i() {
        return this.f36816b;
    }

    /* renamed from: j */
    boolean m31581j() {
        return this.f36820f;
    }

    public C9583s0(byte[] bArr, String str, String str2, String str3, boolean z) {
        this.f36821g = "event.attachment";
        this.f36815a = bArr;
        this.f36816b = null;
        this.f36818d = str;
        this.f36819e = str2;
        this.f36821g = str3;
        this.f36820f = z;
    }

    public C9583s0(InterfaceC9578r2 interfaceC9578r2, String str, String str2, String str3, boolean z) {
        this.f36821g = "event.attachment";
        this.f36815a = null;
        this.f36816b = interfaceC9578r2;
        this.f36818d = str;
        this.f36819e = str2;
        this.f36821g = str3;
        this.f36820f = z;
    }
}
