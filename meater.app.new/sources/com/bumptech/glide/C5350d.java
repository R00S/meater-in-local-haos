package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.load.engine.C5394k;
import com.bumptech.glide.load.engine.p123a0.C5377f;
import com.bumptech.glide.load.engine.p123a0.C5378g;
import com.bumptech.glide.load.engine.p123a0.C5380i;
import com.bumptech.glide.load.engine.p123a0.InterfaceC5372a;
import com.bumptech.glide.load.engine.p123a0.InterfaceC5379h;
import com.bumptech.glide.load.engine.p124b0.ExecutorServiceC5383a;
import com.bumptech.glide.load.engine.p126z.C5414f;
import com.bumptech.glide.load.engine.p126z.C5418j;
import com.bumptech.glide.load.engine.p126z.C5419k;
import com.bumptech.glide.load.engine.p126z.InterfaceC5410b;
import com.bumptech.glide.load.engine.p126z.InterfaceC5413e;
import com.bumptech.glide.p138m.C5537f;
import com.bumptech.glide.p138m.C5543l;
import com.bumptech.glide.p138m.InterfaceC5535d;
import com.bumptech.glide.p141p.C5565h;
import com.bumptech.glide.p141p.InterfaceC5564g;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p024c.p041e.C0867a;

/* compiled from: GlideBuilder.java */
/* renamed from: com.bumptech.glide.d */
/* loaded from: classes.dex */
public final class C5350d {

    /* renamed from: b */
    private C5394k f13055b;

    /* renamed from: c */
    private InterfaceC5413e f13056c;

    /* renamed from: d */
    private InterfaceC5410b f13057d;

    /* renamed from: e */
    private InterfaceC5379h f13058e;

    /* renamed from: f */
    private ExecutorServiceC5383a f13059f;

    /* renamed from: g */
    private ExecutorServiceC5383a f13060g;

    /* renamed from: h */
    private InterfaceC5372a.a f13061h;

    /* renamed from: i */
    private C5380i f13062i;

    /* renamed from: j */
    private InterfaceC5535d f13063j;

    /* renamed from: m */
    private C5543l.b f13066m;

    /* renamed from: n */
    private ExecutorServiceC5383a f13067n;

    /* renamed from: o */
    private boolean f13068o;

    /* renamed from: p */
    private List<InterfaceC5564g<Object>> f13069p;

    /* renamed from: q */
    private boolean f13070q;

    /* renamed from: a */
    private final Map<Class<?>, AbstractC5356j<?, ?>> f13054a = new C0867a();

    /* renamed from: k */
    private int f13064k = 4;

    /* renamed from: l */
    private C5565h f13065l = new C5565h();

    /* renamed from: a */
    ComponentCallbacks2C5349c m9992a(Context context) {
        if (this.f13059f == null) {
            this.f13059f = ExecutorServiceC5383a.m10219f();
        }
        if (this.f13060g == null) {
            this.f13060g = ExecutorServiceC5383a.m10217d();
        }
        if (this.f13067n == null) {
            this.f13067n = ExecutorServiceC5383a.m10215b();
        }
        if (this.f13062i == null) {
            this.f13062i = new C5380i.a(context).m10206a();
        }
        if (this.f13063j == null) {
            this.f13063j = new C5537f();
        }
        if (this.f13056c == null) {
            int iM10204b = this.f13062i.m10204b();
            if (iM10204b > 0) {
                this.f13056c = new C5419k(iM10204b);
            } else {
                this.f13056c = new C5414f();
            }
        }
        if (this.f13057d == null) {
            this.f13057d = new C5418j(this.f13062i.m10203a());
        }
        if (this.f13058e == null) {
            this.f13058e = new C5378g(this.f13062i.m10205d());
        }
        if (this.f13061h == null) {
            this.f13061h = new C5377f(context);
        }
        if (this.f13055b == null) {
            this.f13055b = new C5394k(this.f13058e, this.f13061h, this.f13060g, this.f13059f, ExecutorServiceC5383a.m10221h(), ExecutorServiceC5383a.m10215b(), this.f13068o);
        }
        List<InterfaceC5564g<Object>> list = this.f13069p;
        if (list == null) {
            this.f13069p = Collections.emptyList();
        } else {
            this.f13069p = Collections.unmodifiableList(list);
        }
        return new ComponentCallbacks2C5349c(context, this.f13055b, this.f13058e, this.f13056c, this.f13057d, new C5543l(this.f13066m), this.f13063j, this.f13064k, this.f13065l.m10883Q(), this.f13054a, this.f13069p, this.f13070q);
    }

    /* renamed from: b */
    public C5350d m9993b(InterfaceC5413e interfaceC5413e) {
        this.f13056c = interfaceC5413e;
        return this;
    }

    /* renamed from: c */
    public C5350d m9994c(C5565h c5565h) {
        this.f13065l = c5565h;
        return this;
    }

    /* renamed from: d */
    public C5350d m9995d(InterfaceC5379h interfaceC5379h) {
        this.f13058e = interfaceC5379h;
        return this;
    }

    /* renamed from: e */
    void m9996e(C5543l.b bVar) {
        this.f13066m = bVar;
    }
}
