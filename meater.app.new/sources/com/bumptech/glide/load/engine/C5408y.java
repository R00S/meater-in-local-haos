package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.EnumC5365a;
import com.bumptech.glide.load.InterfaceC5368d;
import com.bumptech.glide.load.InterfaceC5423f;
import com.bumptech.glide.load.engine.InterfaceC5389f;
import com.bumptech.glide.load.p127m.InterfaceC5433d;
import com.bumptech.glide.load.p129n.InterfaceC5462n;
import com.bumptech.glide.p145r.C5592f;
import java.util.Collections;
import java.util.List;

/* compiled from: SourceGenerator.java */
/* renamed from: com.bumptech.glide.load.engine.y */
/* loaded from: classes.dex */
class C5408y implements InterfaceC5389f, InterfaceC5433d.a<Object>, InterfaceC5389f.a {

    /* renamed from: f */
    private final C5390g<?> f13503f;

    /* renamed from: g */
    private final InterfaceC5389f.a f13504g;

    /* renamed from: h */
    private int f13505h;

    /* renamed from: i */
    private C5385c f13506i;

    /* renamed from: j */
    private Object f13507j;

    /* renamed from: k */
    private volatile InterfaceC5462n.a<?> f13508k;

    /* renamed from: l */
    private C5387d f13509l;

    C5408y(C5390g<?> c5390g, InterfaceC5389f.a aVar) {
        this.f13503f = c5390g;
        this.f13504g = aVar;
    }

    /* renamed from: b */
    private void m10361b(Object obj) {
        long jM11028b = C5592f.m11028b();
        try {
            InterfaceC5368d<X> interfaceC5368dM10247p = this.f13503f.m10247p(obj);
            C5388e c5388e = new C5388e(interfaceC5368dM10247p, obj, this.f13503f.m10242k());
            this.f13509l = new C5387d(this.f13508k.f13654a, this.f13503f.m10246o());
            this.f13503f.m10235d().mo10179a(this.f13509l, c5388e);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.f13509l + ", data: " + obj + ", encoder: " + interfaceC5368dM10247p + ", duration: " + C5592f.m11027a(jM11028b));
            }
            this.f13508k.f13656c.mo10460b();
            this.f13506i = new C5385c(Collections.singletonList(this.f13508k.f13654a), this.f13503f, this);
        } catch (Throwable th) {
            this.f13508k.f13656c.mo10460b();
            throw th;
        }
    }

    /* renamed from: d */
    private boolean m10362d() {
        return this.f13505h < this.f13503f.m10238g().size();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5389f
    /* renamed from: a */
    public boolean mo10226a() {
        Object obj = this.f13507j;
        if (obj != null) {
            this.f13507j = null;
            m10361b(obj);
        }
        C5385c c5385c = this.f13506i;
        if (c5385c != null && c5385c.mo10226a()) {
            return true;
        }
        this.f13506i = null;
        this.f13508k = null;
        boolean z = false;
        while (!z && m10362d()) {
            List<InterfaceC5462n.a<?>> listM10238g = this.f13503f.m10238g();
            int i2 = this.f13505h;
            this.f13505h = i2 + 1;
            this.f13508k = listM10238g.get(i2);
            if (this.f13508k != null && (this.f13503f.m10236e().mo10300c(this.f13508k.f13656c.mo10462d()) || this.f13503f.m10251t(this.f13508k.f13656c.mo10455a()))) {
                this.f13508k.f13656c.mo10463e(this.f13503f.m10243l(), this);
                z = true;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.load.p127m.InterfaceC5433d.a
    /* renamed from: c */
    public void mo10227c(Exception exc) {
        this.f13504g.mo10229g(this.f13509l, exc, this.f13508k.f13656c, this.f13508k.f13656c.mo10462d());
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5389f
    public void cancel() {
        InterfaceC5462n.a<?> aVar = this.f13508k;
        if (aVar != null) {
            aVar.f13656c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.p127m.InterfaceC5433d.a
    /* renamed from: f */
    public void mo10228f(Object obj) {
        AbstractC5393j abstractC5393jM10236e = this.f13503f.m10236e();
        if (obj == null || !abstractC5393jM10236e.mo10300c(this.f13508k.f13656c.mo10462d())) {
            this.f13504g.mo10231q(this.f13508k.f13654a, obj, this.f13508k.f13656c, this.f13508k.f13656c.mo10462d(), this.f13509l);
        } else {
            this.f13507j = obj;
            this.f13504g.mo10230k();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5389f.a
    /* renamed from: g */
    public void mo10229g(InterfaceC5423f interfaceC5423f, Exception exc, InterfaceC5433d<?> interfaceC5433d, EnumC5365a enumC5365a) {
        this.f13504g.mo10229g(interfaceC5423f, exc, interfaceC5433d, this.f13508k.f13656c.mo10462d());
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5389f.a
    /* renamed from: k */
    public void mo10230k() {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5389f.a
    /* renamed from: q */
    public void mo10231q(InterfaceC5423f interfaceC5423f, Object obj, InterfaceC5433d<?> interfaceC5433d, EnumC5365a enumC5365a, InterfaceC5423f interfaceC5423f2) {
        this.f13504g.mo10231q(interfaceC5423f, obj, interfaceC5433d, this.f13508k.f13656c.mo10462d(), interfaceC5423f);
    }
}
