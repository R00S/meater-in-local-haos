package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.gms.internal.ads.wy */
/* loaded from: classes2.dex */
final class C7319wy implements zzge {

    /* renamed from: a */
    private final Handler f20879a;

    /* renamed from: b */
    private final C7393yy f20880b;

    /* renamed from: c */
    private final CopyOnWriteArraySet<zzgh> f20881c;

    /* renamed from: d */
    private final boolean[] f20882d;

    /* renamed from: e */
    private boolean f20883e;

    /* renamed from: f */
    private int f20884f;

    /* renamed from: g */
    private int f20885g;

    @SuppressLint({"HandlerLeak"})
    public C7319wy(int i2, int i3, int i4) {
        Log.i("ExoPlayerImpl", "Init 1.3.1");
        int i5 = 0;
        this.f20883e = false;
        this.f20884f = 1;
        this.f20881c = new CopyOnWriteArraySet<>();
        this.f20882d = new boolean[2];
        while (true) {
            boolean[] zArr = this.f20882d;
            if (i5 >= zArr.length) {
                HandlerC7356xy handlerC7356xy = new HandlerC7356xy(this);
                this.f20879a = handlerC7356xy;
                this.f20880b = new C7393yy(handlerC7356xy, this.f20883e, this.f20882d, 2500, 5000);
                return;
            }
            zArr[i5] = true;
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzge
    /* renamed from: F */
    public final int mo15985F() {
        return this.f20884f;
    }

    @Override // com.google.android.gms.internal.ads.zzge
    /* renamed from: a */
    public final void mo15986a(boolean z) {
        if (this.f20883e != z) {
            this.f20883e = z;
            this.f20885g++;
            this.f20880b.m16147n(z);
            Iterator<zzgh> it = this.f20881c.iterator();
            while (it.hasNext()) {
                it.next().mo15364a(z, this.f20884f);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzge
    /* renamed from: b */
    public final void mo15987b(long j2) {
        this.f20880b.m16141d(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzge
    /* renamed from: c */
    public final void mo15988c() {
        this.f20880b.m16140c();
        this.f20879a.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzge
    /* renamed from: d */
    public final long mo15989d() {
        return this.f20880b.m16138a();
    }

    @Override // com.google.android.gms.internal.ads.zzge
    /* renamed from: e */
    public final long mo15990e() {
        return this.f20880b.m16148o();
    }

    @Override // com.google.android.gms.internal.ads.zzge
    /* renamed from: f */
    public final boolean mo15991f() {
        return this.f20883e;
    }

    @Override // com.google.android.gms.internal.ads.zzge
    /* renamed from: g */
    public final long mo15992g() {
        return this.f20880b.m16139b();
    }

    @Override // com.google.android.gms.internal.ads.zzge
    /* renamed from: h */
    public final void mo15993h(zzgf zzgfVar, int i2, Object obj) {
        this.f20880b.m16145k(zzgfVar, 1, obj);
    }

    @Override // com.google.android.gms.internal.ads.zzge
    /* renamed from: i */
    public final void mo15994i(zzgh zzghVar) {
        this.f20881c.add(zzghVar);
    }

    @Override // com.google.android.gms.internal.ads.zzge
    /* renamed from: j */
    public final void mo15995j(zzgf zzgfVar, int i2, Object obj) {
        this.f20880b.m16143h(zzgfVar, 1, obj);
    }

    @Override // com.google.android.gms.internal.ads.zzge
    /* renamed from: k */
    public final void mo15996k(zzhp... zzhpVarArr) {
        this.f20880b.m16144i(zzhpVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzge
    /* renamed from: l */
    public final void mo15997l(int i2, boolean z) {
        boolean[] zArr = this.f20882d;
        if (zArr[0] != z) {
            zArr[0] = z;
            this.f20880b.m16146m(0, z);
        }
    }

    /* renamed from: m */
    final void m15998m(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            this.f20884f = message.arg1;
            Iterator<zzgh> it = this.f20881c.iterator();
            while (it.hasNext()) {
                it.next().mo15364a(this.f20883e, this.f20884f);
            }
            return;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                return;
            }
            zzgd zzgdVar = (zzgd) message.obj;
            Iterator<zzgh> it2 = this.f20881c.iterator();
            while (it2.hasNext()) {
                it2.next().mo15365b(zzgdVar);
            }
            return;
        }
        int i3 = this.f20885g - 1;
        this.f20885g = i3;
        if (i3 == 0) {
            Iterator<zzgh> it3 = this.f20881c.iterator();
            while (it3.hasNext()) {
                it3.next().mo15366c();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final void stop() {
        this.f20880b.m16142f();
    }
}
