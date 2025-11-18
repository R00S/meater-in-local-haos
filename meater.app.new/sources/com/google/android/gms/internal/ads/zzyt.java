package com.google.android.gms.internal.ads;

import java.util.Random;
import java.util.WeakHashMap;

@zzard
/* loaded from: classes2.dex */
public final class zzyt {

    /* renamed from: a */
    private static zzyt f27468a = new zzyt();

    /* renamed from: b */
    private final zzazt f27469b;

    /* renamed from: c */
    private final zzyh f27470c;

    /* renamed from: d */
    private final String f27471d;

    /* renamed from: e */
    private final zzacp f27472e;

    /* renamed from: f */
    private final zzacq f27473f;

    /* renamed from: g */
    private final zzacr f27474g;

    /* renamed from: h */
    private final zzbai f27475h;

    /* renamed from: i */
    private final Random f27476i;

    /* renamed from: j */
    private final WeakHashMap<Object, String> f27477j;

    protected zzyt() {
        this(new zzazt(), new zzyh(new zzxx(), new zzxw(), new zzabk(), new zzagk(), new zzatf(), new zzauj(), new zzaqf(), new zzagl()), new zzacp(), new zzacq(), new zzacr(), zzazt.m17319x(), new zzbai(0, 15000000, true), new Random(), new WeakHashMap());
    }

    /* renamed from: a */
    public static zzazt m20844a() {
        return f27468a.f27469b;
    }

    /* renamed from: b */
    public static zzyh m20845b() {
        return f27468a.f27470c;
    }

    /* renamed from: c */
    public static zzacq m20846c() {
        return f27468a.f27473f;
    }

    /* renamed from: d */
    public static zzacp m20847d() {
        return f27468a.f27472e;
    }

    /* renamed from: e */
    public static zzacr m20848e() {
        return f27468a.f27474g;
    }

    /* renamed from: f */
    public static String m20849f() {
        return f27468a.f27471d;
    }

    /* renamed from: g */
    public static zzbai m20850g() {
        return f27468a.f27475h;
    }

    /* renamed from: h */
    public static Random m20851h() {
        return f27468a.f27476i;
    }

    private zzyt(zzazt zzaztVar, zzyh zzyhVar, zzacp zzacpVar, zzacq zzacqVar, zzacr zzacrVar, String str, zzbai zzbaiVar, Random random, WeakHashMap<Object, String> weakHashMap) {
        this.f27469b = zzaztVar;
        this.f27470c = zzyhVar;
        this.f27472e = zzacpVar;
        this.f27473f = zzacqVar;
        this.f27474g = zzacrVar;
        this.f27471d = str;
        this.f27475h = zzbaiVar;
        this.f27476i = random;
        this.f27477j = weakHashMap;
    }
}
