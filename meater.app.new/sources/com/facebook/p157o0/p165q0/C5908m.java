package com.facebook.p157o0.p165q0;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.C5641a0;
import java.util.UUID;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: SessionInfo.kt */
/* renamed from: com.facebook.o0.q0.m */
/* loaded from: classes2.dex */
public final class C5908m {

    /* renamed from: a */
    public static final a f15393a = new a(null);

    /* renamed from: b */
    private final Long f15394b;

    /* renamed from: c */
    private Long f15395c;

    /* renamed from: d */
    private UUID f15396d;

    /* renamed from: e */
    private int f15397e;

    /* renamed from: f */
    private Long f15398f;

    /* renamed from: g */
    private C5910o f15399g;

    /* compiled from: SessionInfo.kt */
    /* renamed from: com.facebook.o0.q0.m$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final void m12663a() {
            C5641a0 c5641a0 = C5641a0.f14199a;
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(C5641a0.m11284c()).edit();
            editorEdit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
            editorEdit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
            editorEdit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
            editorEdit.remove("com.facebook.appevents.SessionInfo.sessionId");
            editorEdit.apply();
            C5910o.f15403a.m12671a();
        }

        /* renamed from: b */
        public final C5908m m12664b() {
            C5641a0 c5641a0 = C5641a0.f14199a;
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C5641a0.m11284c());
            long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
            long j3 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
            String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
            if (j2 == 0 || j3 == 0 || string == null) {
                return null;
            }
            C5908m c5908m = new C5908m(Long.valueOf(j2), Long.valueOf(j3), null, 4, null);
            c5908m.f15397e = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
            c5908m.m12661l(C5910o.f15403a.m12672b());
            c5908m.m12658i(Long.valueOf(System.currentTimeMillis()));
            UUID uuidFromString = UUID.fromString(string);
            C9801m.m32345e(uuidFromString, "fromString(sessionIDStr)");
            c5908m.m12659j(uuidFromString);
            return c5908m;
        }
    }

    public C5908m(Long l, Long l2, UUID uuid) {
        C9801m.m32346f(uuid, "sessionId");
        this.f15394b = l;
        this.f15395c = l2;
        this.f15396d = uuid;
    }

    /* renamed from: b */
    public final Long m12651b() {
        Long l = this.f15398f;
        if (l == null) {
            return 0L;
        }
        return l;
    }

    /* renamed from: c */
    public final int m12652c() {
        return this.f15397e;
    }

    /* renamed from: d */
    public final UUID m12653d() {
        return this.f15396d;
    }

    /* renamed from: e */
    public final Long m12654e() {
        return this.f15395c;
    }

    /* renamed from: f */
    public final long m12655f() {
        Long l;
        if (this.f15394b == null || (l = this.f15395c) == null) {
            return 0L;
        }
        if (l != null) {
            return l.longValue() - this.f15394b.longValue();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: g */
    public final C5910o m12656g() {
        return this.f15399g;
    }

    /* renamed from: h */
    public final void m12657h() {
        this.f15397e++;
    }

    /* renamed from: i */
    public final void m12658i(Long l) {
        this.f15398f = l;
    }

    /* renamed from: j */
    public final void m12659j(UUID uuid) {
        C9801m.m32346f(uuid, "<set-?>");
        this.f15396d = uuid;
    }

    /* renamed from: k */
    public final void m12660k(Long l) {
        this.f15395c = l;
    }

    /* renamed from: l */
    public final void m12661l(C5910o c5910o) {
        this.f15399g = c5910o;
    }

    /* renamed from: m */
    public final void m12662m() {
        C5641a0 c5641a0 = C5641a0.f14199a;
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(C5641a0.m11284c()).edit();
        Long l = this.f15394b;
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", l == null ? 0L : l.longValue());
        Long l2 = this.f15395c;
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", l2 != null ? l2.longValue() : 0L);
        editorEdit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f15397e);
        editorEdit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f15396d.toString());
        editorEdit.apply();
        C5910o c5910o = this.f15399g;
        if (c5910o == null || c5910o == null) {
            return;
        }
        c5910o.m12670a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C5908m(Long l, Long l2, UUID uuid, int i2, C9789g c9789g) {
        if ((i2 & 4) != 0) {
            uuid = UUID.randomUUID();
            C9801m.m32345e(uuid, "randomUUID()");
        }
        this(l, l2, uuid);
    }
}
