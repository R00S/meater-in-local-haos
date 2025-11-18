package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.EnumC5365a;
import com.bumptech.glide.load.InterfaceC5423f;
import com.bumptech.glide.load.engine.InterfaceC5389f;
import com.bumptech.glide.load.p127m.InterfaceC5433d;
import com.bumptech.glide.load.p129n.InterfaceC5462n;
import java.io.File;
import java.util.List;

/* compiled from: DataCacheGenerator.java */
/* renamed from: com.bumptech.glide.load.engine.c */
/* loaded from: classes.dex */
class C5385c implements InterfaceC5389f, InterfaceC5433d.a<Object> {

    /* renamed from: f */
    private final List<InterfaceC5423f> f13300f;

    /* renamed from: g */
    private final C5390g<?> f13301g;

    /* renamed from: h */
    private final InterfaceC5389f.a f13302h;

    /* renamed from: i */
    private int f13303i;

    /* renamed from: j */
    private InterfaceC5423f f13304j;

    /* renamed from: k */
    private List<InterfaceC5462n<File, ?>> f13305k;

    /* renamed from: l */
    private int f13306l;

    /* renamed from: m */
    private volatile InterfaceC5462n.a<?> f13307m;

    /* renamed from: n */
    private File f13308n;

    C5385c(C5390g<?> c5390g, InterfaceC5389f.a aVar) {
        this(c5390g.m10234c(), c5390g, aVar);
    }

    /* renamed from: b */
    private boolean m10225b() {
        return this.f13306l < this.f13305k.size();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5389f
    /* renamed from: a */
    public boolean mo10226a() {
        while (true) {
            boolean z = false;
            if (this.f13305k != null && m10225b()) {
                this.f13307m = null;
                while (!z && m10225b()) {
                    List<InterfaceC5462n<File, ?>> list = this.f13305k;
                    int i2 = this.f13306l;
                    this.f13306l = i2 + 1;
                    this.f13307m = list.get(i2).mo10509b(this.f13308n, this.f13301g.m10250s(), this.f13301g.m10237f(), this.f13301g.m10242k());
                    if (this.f13307m != null && this.f13301g.m10251t(this.f13307m.f13656c.mo10455a())) {
                        this.f13307m.f13656c.mo10463e(this.f13301g.m10243l(), this);
                        z = true;
                    }
                }
                return z;
            }
            int i3 = this.f13303i + 1;
            this.f13303i = i3;
            if (i3 >= this.f13300f.size()) {
                return false;
            }
            InterfaceC5423f interfaceC5423f = this.f13300f.get(this.f13303i);
            File fileMo10180b = this.f13301g.m10235d().mo10180b(new C5387d(interfaceC5423f, this.f13301g.m10246o()));
            this.f13308n = fileMo10180b;
            if (fileMo10180b != null) {
                this.f13304j = interfaceC5423f;
                this.f13305k = this.f13301g.m10241j(fileMo10180b);
                this.f13306l = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.p127m.InterfaceC5433d.a
    /* renamed from: c */
    public void mo10227c(Exception exc) {
        this.f13302h.mo10229g(this.f13304j, exc, this.f13307m.f13656c, EnumC5365a.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5389f
    public void cancel() {
        InterfaceC5462n.a<?> aVar = this.f13307m;
        if (aVar != null) {
            aVar.f13656c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.p127m.InterfaceC5433d.a
    /* renamed from: f */
    public void mo10228f(Object obj) {
        this.f13302h.mo10231q(this.f13304j, obj, this.f13307m.f13656c, EnumC5365a.DATA_DISK_CACHE, this.f13304j);
    }

    C5385c(List<InterfaceC5423f> list, C5390g<?> c5390g, InterfaceC5389f.a aVar) {
        this.f13303i = -1;
        this.f13300f = list;
        this.f13301g = c5390g;
        this.f13302h = aVar;
    }
}
