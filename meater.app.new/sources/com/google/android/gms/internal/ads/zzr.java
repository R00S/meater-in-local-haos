package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzag;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class zzr<T> implements Comparable<zzr<T>> {

    /* renamed from: f */
    private final zzag.C7432a f26876f;

    /* renamed from: g */
    private final int f26877g;

    /* renamed from: h */
    private final String f26878h;

    /* renamed from: i */
    private final int f26879i;

    /* renamed from: j */
    private final Object f26880j;

    /* renamed from: k */
    private zzz f26881k;

    /* renamed from: l */
    private Integer f26882l;

    /* renamed from: m */
    private zzv f26883m;

    /* renamed from: n */
    private boolean f26884n;

    /* renamed from: o */
    private boolean f26885o;

    /* renamed from: p */
    private boolean f26886p;

    /* renamed from: q */
    private boolean f26887q;

    /* renamed from: r */
    private zzac f26888r;

    /* renamed from: s */
    private zzc f26889s;

    /* renamed from: t */
    private o30 f26890t;

    public zzr(int i2, String str, zzz zzzVar) {
        Uri uri;
        String host;
        this.f26876f = zzag.C7432a.f21998a ? new zzag.C7432a() : null;
        this.f26880j = new Object();
        this.f26884n = true;
        int iHashCode = 0;
        this.f26885o = false;
        this.f26886p = false;
        this.f26887q = false;
        this.f26889s = null;
        this.f26877g = i2;
        this.f26878h = str;
        this.f26881k = zzzVar;
        this.f26888r = new zzh();
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.f26879i = iHashCode;
    }

    /* renamed from: A */
    final void m20413A(int i2) {
        zzv zzvVar = this.f26883m;
        if (zzvVar != null) {
            zzvVar.m20646b(this, i2);
        }
    }

    /* renamed from: D */
    final void m20414D(o30 o30Var) {
        synchronized (this.f26880j) {
            this.f26890t = o30Var;
        }
    }

    /* renamed from: E */
    final void m20415E(zzy<?> zzyVar) {
        o30 o30Var;
        synchronized (this.f26880j) {
            o30Var = this.f26890t;
        }
        if (o30Var != null) {
            o30Var.mo15672b(this, zzyVar);
        }
    }

    /* renamed from: F */
    protected abstract void mo16035F(T t);

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: G */
    public final zzr<?> m20416G(int i2) {
        this.f26882l = Integer.valueOf(i2);
        return this;
    }

    /* renamed from: H */
    public final void m20417H(zzaf zzafVar) {
        zzz zzzVar;
        synchronized (this.f26880j) {
            zzzVar = this.f26881k;
        }
        if (zzzVar != null) {
            zzzVar.mo14744a(zzafVar);
        }
    }

    /* renamed from: I */
    public final void m20418I(String str) {
        if (zzag.C7432a.f21998a) {
            this.f26876f.m16531a(str, Thread.currentThread().getId());
        }
    }

    /* renamed from: J */
    final void m20419J(String str) {
        zzv zzvVar = this.f26883m;
        if (zzvVar != null) {
            zzvVar.m20648d(this);
        }
        if (zzag.C7432a.f21998a) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new l30(this, str, id));
            } else {
                this.f26876f.m16531a(str, id);
                this.f26876f.m16532b(toString());
            }
        }
    }

    /* renamed from: K */
    public final int m20420K() {
        return this.f26879i;
    }

    /* renamed from: M */
    public final String m20421M() {
        String str = this.f26878h;
        int i2 = this.f26877g;
        if (i2 == 0 || i2 == -1) {
            return str;
        }
        String string = Integer.toString(i2);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(str).length());
        sb.append(string);
        sb.append('-');
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: N */
    public final zzc m20422N() {
        return this.f26889s;
    }

    /* renamed from: O */
    public byte[] mo16036O() throws zza {
        return null;
    }

    /* renamed from: P */
    public final boolean m20423P() {
        return this.f26884n;
    }

    /* renamed from: Q */
    public final int m20424Q() {
        return this.f26888r.mo16394b();
    }

    /* renamed from: R */
    public final zzac m20425R() {
        return this.f26888r;
    }

    /* renamed from: S */
    public final void m20426S() {
        synchronized (this.f26880j) {
            this.f26886p = true;
        }
    }

    /* renamed from: T */
    public final boolean m20427T() {
        boolean z;
        synchronized (this.f26880j) {
            z = this.f26886p;
        }
        return z;
    }

    /* renamed from: U */
    final void m20428U() {
        o30 o30Var;
        synchronized (this.f26880j) {
            o30Var = this.f26890t;
        }
        if (o30Var != null) {
            o30Var.mo15671a(this);
        }
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        zzr zzrVar = (zzr) obj;
        zzu zzuVar = zzu.NORMAL;
        return zzuVar == zzuVar ? this.f26882l.intValue() - zzrVar.f26882l.intValue() : zzuVar.ordinal() - zzuVar.ordinal();
    }

    /* renamed from: g */
    public Map<String, String> mo16038g() throws zza {
        return Collections.emptyMap();
    }

    /* renamed from: k */
    public final int m20429k() {
        return this.f26877g;
    }

    /* renamed from: q */
    public final String m20430q() {
        return this.f26878h;
    }

    public String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.f26879i));
        String strConcat = strValueOf.length() != 0 ? "0x".concat(strValueOf) : new String("0x");
        m20431u();
        String str = this.f26878h;
        String strValueOf2 = String.valueOf(zzu.NORMAL);
        String strValueOf3 = String.valueOf(this.f26882l);
        StringBuilder sb = new StringBuilder("[ ] ".length() + 3 + String.valueOf(str).length() + String.valueOf(strConcat).length() + strValueOf2.length() + strValueOf3.length());
        sb.append("[ ] ");
        sb.append(str);
        sb.append(" ");
        sb.append(strConcat);
        sb.append(" ");
        sb.append(strValueOf2);
        sb.append(" ");
        sb.append(strValueOf3);
        return sb.toString();
    }

    /* renamed from: u */
    public final boolean m20431u() {
        synchronized (this.f26880j) {
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: v */
    public final zzr<?> m20432v(zzc zzcVar) {
        this.f26889s = zzcVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: x */
    public final zzr<?> m20433x(zzv zzvVar) {
        this.f26883m = zzvVar;
        return this;
    }

    /* renamed from: y */
    protected abstract zzy<T> mo17084y(zzp zzpVar);
}
