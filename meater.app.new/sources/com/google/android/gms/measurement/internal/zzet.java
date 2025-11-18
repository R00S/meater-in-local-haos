package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import okhttp3.HttpUrl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzet extends AbstractC7799q4 {

    /* renamed from: c */
    private char f29212c;

    /* renamed from: d */
    private long f29213d;

    /* renamed from: e */
    private String f29214e;

    /* renamed from: f */
    private final zzev f29215f;

    /* renamed from: g */
    private final zzev f29216g;

    /* renamed from: h */
    private final zzev f29217h;

    /* renamed from: i */
    private final zzev f29218i;

    /* renamed from: j */
    private final zzev f29219j;

    /* renamed from: k */
    private final zzev f29220k;

    /* renamed from: l */
    private final zzev f29221l;

    /* renamed from: m */
    private final zzev f29222m;

    /* renamed from: n */
    private final zzev f29223n;

    zzet(zzfx zzfxVar) {
        super(zzfxVar);
        this.f29212c = (char) 0;
        this.f29213d = -1L;
        this.f29215f = new zzev(this, 6, false, false);
        this.f29216g = new zzev(this, 6, true, false);
        this.f29217h = new zzev(this, 6, false, true);
        this.f29218i = new zzev(this, 5, false, false);
        this.f29219j = new zzev(this, 5, true, false);
        this.f29220k = new zzev(this, 5, false, true);
        this.f29221l = new zzev(this, 4, false, false);
        this.f29222m = new zzev(this, 3, false, false);
        this.f29223n = new zzev(this, 2, false, false);
    }

    @VisibleForTesting
    /* renamed from: D */
    private final String m23125D() {
        String str;
        synchronized (this) {
            if (this.f29214e == null) {
                if (this.f28874a.m23223O() != null) {
                    this.f29214e = this.f28874a.m23223O();
                } else {
                    this.f29214e = zzx.m23562z();
                }
            }
            str = this.f29214e;
        }
        return str;
    }

    /* renamed from: F */
    private static String m23127F(String str) {
        if (TextUtils.isEmpty(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf == -1 ? str : str.substring(0, iLastIndexOf);
    }

    /* renamed from: x */
    protected static Object m23131x(String str) {
        if (str == null) {
            return null;
        }
        return new C7726i3(str);
    }

    @VisibleForTesting
    /* renamed from: y */
    private static String m23132y(boolean z, Object obj) {
        String className;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        if (obj == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i2 = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = "-";
            }
            String strValueOf = String.valueOf(Math.abs(l.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(str.length() + 43 + str.length());
            sb.append(str);
            sb.append(jRound);
            sb.append("...");
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof C7726i3 ? ((C7726i3) obj).f28699a : z ? "-" : String.valueOf(obj);
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String strM23127F = m23127F(zzfx.class.getCanonicalName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i2];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m23127F(className).equals(strM23127F)) {
                sb2.append(": ");
                sb2.append(stackTraceElement);
                break;
            }
            i2++;
        }
        return sb2.toString();
    }

    /* renamed from: z */
    static String m23133z(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String strM23132y = m23132y(z, obj);
        String strM23132y2 = m23132y(z, obj2);
        String strM23132y3 = m23132y(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strM23132y)) {
            sb.append(str2);
            sb.append(strM23132y);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strM23132y2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strM23132y2);
        }
        if (!TextUtils.isEmpty(strM23132y3)) {
            sb.append(str3);
            sb.append(strM23132y3);
        }
        return sb.toString();
    }

    @VisibleForTesting
    /* renamed from: A */
    protected final void m23134A(int i2, String str) {
        Log.println(i2, m23125D(), str);
    }

    /* renamed from: B */
    protected final void m23135B(int i2, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) throws IllegalStateException {
        if (!z && m23136C(i2)) {
            m23134A(i2, m23133z(false, str, obj, obj2, obj3));
        }
        if (z2 || i2 < 5) {
            return;
        }
        Preconditions.m14372k(str);
        zzfu zzfuVarM23215F = this.f28874a.m23215F();
        if (zzfuVarM23215F == null) {
            m23134A(6, "Scheduler not set. Not logging error/warn");
        } else {
            if (!zzfuVarM23215F.m22811t()) {
                m23134A(6, "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            zzfuVarM23215F.m23201z(new RunnableC7717h3(this, i2 >= 9 ? 8 : i2, str, obj, obj2, obj3));
        }
    }

    @VisibleForTesting
    /* renamed from: C */
    protected final boolean m23136C(int i2) {
        return Log.isLoggable(m23125D(), i2);
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: G */
    public final /* bridge */ /* synthetic */ zzw mo22832G() {
        return super.mo22832G();
    }

    /* renamed from: H */
    public final zzev m23137H() {
        return this.f29215f;
    }

    /* renamed from: I */
    public final zzev m23138I() {
        return this.f29216g;
    }

    /* renamed from: J */
    public final zzev m23139J() {
        return this.f29217h;
    }

    /* renamed from: K */
    public final zzev m23140K() {
        return this.f29218i;
    }

    /* renamed from: L */
    public final zzev m23141L() {
        return this.f29219j;
    }

    /* renamed from: M */
    public final zzev m23142M() {
        return this.f29220k;
    }

    /* renamed from: N */
    public final zzev m23143N() {
        return this.f29221l;
    }

    /* renamed from: O */
    public final zzev m23144O() {
        return this.f29222m;
    }

    /* renamed from: P */
    public final zzev m23145P() {
        return this.f29223n;
    }

    /* renamed from: Q */
    public final String m23146Q() {
        Pair<String, Long> pairM23163a = mo22840m().f28852e.m23163a();
        if (pairM23163a == null || pairM23163a == C7807r3.f28847c) {
            return null;
        }
        String strValueOf = String.valueOf(pairM23163a.second);
        String str = (String) pairM23163a.first;
        StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length());
        sb.append(strValueOf);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo22789a() {
        super.mo22789a();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo22790b() {
        super.mo22790b();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo22791c() {
        super.mo22791c();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo22792d() {
        super.mo22792d();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ zzah mo22833e() {
        return super.mo22833e();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Context mo22834f() {
        return super.mo22834f();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ zzfu mo22835g() {
        return super.mo22835g();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ zzet mo22836h() {
        return super.mo22836h();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4, com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ Clock mo22837j() {
        return super.mo22837j();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ zzer mo22838k() {
        return super.mo22838k();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ zzkk mo22839l() {
        return super.mo22839l();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C7807r3 mo22840m() {
        return super.mo22840m();
    }

    @Override // com.google.android.gms.measurement.internal.C7808r4
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ zzx mo22841n() {
        return super.mo22841n();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC7799q4
    /* renamed from: s */
    protected final boolean mo22810s() {
        return false;
    }
}
