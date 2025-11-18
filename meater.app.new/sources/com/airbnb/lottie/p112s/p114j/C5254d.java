package com.airbnb.lottie.p112s.p114j;

import android.graphics.Path;
import com.airbnb.lottie.C5182f;
import com.airbnb.lottie.p108q.p109a.C5199g;
import com.airbnb.lottie.p108q.p109a.InterfaceC5194b;
import com.airbnb.lottie.p112s.p113i.C5238b;
import com.airbnb.lottie.p112s.p113i.C5239c;
import com.airbnb.lottie.p112s.p113i.C5240d;
import com.airbnb.lottie.p112s.p113i.C5242f;
import com.airbnb.lottie.p112s.p115k.AbstractC5268a;

/* compiled from: GradientFill.java */
/* renamed from: com.airbnb.lottie.s.j.d */
/* loaded from: classes.dex */
public class C5254d implements InterfaceC5252b {

    /* renamed from: a */
    private final EnumC5256f f12699a;

    /* renamed from: b */
    private final Path.FillType f12700b;

    /* renamed from: c */
    private final C5239c f12701c;

    /* renamed from: d */
    private final C5240d f12702d;

    /* renamed from: e */
    private final C5242f f12703e;

    /* renamed from: f */
    private final C5242f f12704f;

    /* renamed from: g */
    private final String f12705g;

    /* renamed from: h */
    private final C5238b f12706h;

    /* renamed from: i */
    private final C5238b f12707i;

    public C5254d(String str, EnumC5256f enumC5256f, Path.FillType fillType, C5239c c5239c, C5240d c5240d, C5242f c5242f, C5242f c5242f2, C5238b c5238b, C5238b c5238b2) {
        this.f12699a = enumC5256f;
        this.f12700b = fillType;
        this.f12701c = c5239c;
        this.f12702d = c5240d;
        this.f12703e = c5242f;
        this.f12704f = c5242f2;
        this.f12705g = str;
        this.f12706h = c5238b;
        this.f12707i = c5238b2;
    }

    @Override // com.airbnb.lottie.p112s.p114j.InterfaceC5252b
    /* renamed from: a */
    public InterfaceC5194b mo9619a(C5182f c5182f, AbstractC5268a abstractC5268a) {
        return new C5199g(c5182f, abstractC5268a, this);
    }

    /* renamed from: b */
    public C5242f m9636b() {
        return this.f12704f;
    }

    /* renamed from: c */
    public Path.FillType m9637c() {
        return this.f12700b;
    }

    /* renamed from: d */
    public C5239c m9638d() {
        return this.f12701c;
    }

    /* renamed from: e */
    public EnumC5256f m9639e() {
        return this.f12699a;
    }

    /* renamed from: f */
    public String m9640f() {
        return this.f12705g;
    }

    /* renamed from: g */
    public C5240d m9641g() {
        return this.f12702d;
    }

    /* renamed from: h */
    public C5242f m9642h() {
        return this.f12703e;
    }
}
