package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.EnumC5365a;
import com.bumptech.glide.load.InterfaceC5423f;
import com.bumptech.glide.load.engine.InterfaceC5389f;
import com.bumptech.glide.load.p127m.InterfaceC5433d;
import com.bumptech.glide.load.p129n.InterfaceC5462n;
import java.io.File;
import java.util.List;

/* compiled from: ResourceCacheGenerator.java */
/* renamed from: com.bumptech.glide.load.engine.v */
/* loaded from: classes.dex */
class C5405v implements InterfaceC5389f, InterfaceC5433d.a<Object> {

    /* renamed from: f */
    private final InterfaceC5389f.a f13482f;

    /* renamed from: g */
    private final C5390g<?> f13483g;

    /* renamed from: h */
    private int f13484h;

    /* renamed from: i */
    private int f13485i = -1;

    /* renamed from: j */
    private InterfaceC5423f f13486j;

    /* renamed from: k */
    private List<InterfaceC5462n<File, ?>> f13487k;

    /* renamed from: l */
    private int f13488l;

    /* renamed from: m */
    private volatile InterfaceC5462n.a<?> f13489m;

    /* renamed from: n */
    private File f13490n;

    /* renamed from: o */
    private C5406w f13491o;

    C5405v(C5390g<?> c5390g, InterfaceC5389f.a aVar) {
        this.f13483g = c5390g;
        this.f13482f = aVar;
    }

    /* renamed from: b */
    private boolean m10358b() {
        return this.f13488l < this.f13487k.size();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5389f
    /* renamed from: a */
    public boolean mo10226a() {
        List<InterfaceC5423f> listM10234c = this.f13483g.m10234c();
        boolean z = false;
        if (listM10234c.isEmpty()) {
            return false;
        }
        List<Class<?>> listM10244m = this.f13483g.m10244m();
        if (listM10244m.isEmpty()) {
            if (File.class.equals(this.f13483g.m10248q())) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f13483g.m10240i() + " to " + this.f13483g.m10248q());
        }
        while (true) {
            if (this.f13487k != null && m10358b()) {
                this.f13489m = null;
                while (!z && m10358b()) {
                    List<InterfaceC5462n<File, ?>> list = this.f13487k;
                    int i2 = this.f13488l;
                    this.f13488l = i2 + 1;
                    this.f13489m = list.get(i2).mo10509b(this.f13490n, this.f13483g.m10250s(), this.f13483g.m10237f(), this.f13483g.m10242k());
                    if (this.f13489m != null && this.f13483g.m10251t(this.f13489m.f13656c.mo10455a())) {
                        this.f13489m.f13656c.mo10463e(this.f13483g.m10243l(), this);
                        z = true;
                    }
                }
                return z;
            }
            int i3 = this.f13485i + 1;
            this.f13485i = i3;
            if (i3 >= listM10244m.size()) {
                int i4 = this.f13484h + 1;
                this.f13484h = i4;
                if (i4 >= listM10234c.size()) {
                    return false;
                }
                this.f13485i = 0;
            }
            InterfaceC5423f interfaceC5423f = listM10234c.get(this.f13484h);
            Class<?> cls = listM10244m.get(this.f13485i);
            this.f13491o = new C5406w(this.f13483g.m10233b(), interfaceC5423f, this.f13483g.m10246o(), this.f13483g.m10250s(), this.f13483g.m10237f(), this.f13483g.m10249r(cls), cls, this.f13483g.m10242k());
            File fileMo10180b = this.f13483g.m10235d().mo10180b(this.f13491o);
            this.f13490n = fileMo10180b;
            if (fileMo10180b != null) {
                this.f13486j = interfaceC5423f;
                this.f13487k = this.f13483g.m10241j(fileMo10180b);
                this.f13488l = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.p127m.InterfaceC5433d.a
    /* renamed from: c */
    public void mo10227c(Exception exc) {
        this.f13482f.mo10229g(this.f13491o, exc, this.f13489m.f13656c, EnumC5365a.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5389f
    public void cancel() {
        InterfaceC5462n.a<?> aVar = this.f13489m;
        if (aVar != null) {
            aVar.f13656c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.p127m.InterfaceC5433d.a
    /* renamed from: f */
    public void mo10228f(Object obj) {
        this.f13482f.mo10231q(this.f13486j, obj, this.f13489m.f13656c, EnumC5365a.RESOURCE_DISK_CACHE, this.f13491o);
    }
}
