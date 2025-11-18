package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.f;
import java.io.File;
import java.util.List;
import m6.EnumC3966a;
import m6.InterfaceC3970e;
import s6.o;

/* compiled from: ResourceCacheGenerator.java */
/* loaded from: classes2.dex */
class s implements f, d.a<Object> {

    /* renamed from: B, reason: collision with root package name */
    private final f.a f33258B;

    /* renamed from: C, reason: collision with root package name */
    private final g<?> f33259C;

    /* renamed from: D, reason: collision with root package name */
    private int f33260D;

    /* renamed from: E, reason: collision with root package name */
    private int f33261E = -1;

    /* renamed from: F, reason: collision with root package name */
    private InterfaceC3970e f33262F;

    /* renamed from: G, reason: collision with root package name */
    private List<s6.o<File, ?>> f33263G;

    /* renamed from: H, reason: collision with root package name */
    private int f33264H;

    /* renamed from: I, reason: collision with root package name */
    private volatile o.a<?> f33265I;

    /* renamed from: J, reason: collision with root package name */
    private File f33266J;

    /* renamed from: K, reason: collision with root package name */
    private t f33267K;

    s(g<?> gVar, f.a aVar) {
        this.f33259C = gVar;
        this.f33258B = aVar;
    }

    private boolean b() {
        return this.f33264H < this.f33263G.size();
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean a() {
        I6.b.a("ResourceCacheGenerator.startNext");
        try {
            List<InterfaceC3970e> listC = this.f33259C.c();
            boolean z10 = false;
            if (listC.isEmpty()) {
                I6.b.e();
                return false;
            }
            List<Class<?>> listM = this.f33259C.m();
            if (listM.isEmpty()) {
                if (File.class.equals(this.f33259C.r())) {
                    I6.b.e();
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f33259C.i() + " to " + this.f33259C.r());
            }
            while (true) {
                if (this.f33263G != null && b()) {
                    this.f33265I = null;
                    while (!z10 && b()) {
                        List<s6.o<File, ?>> list = this.f33263G;
                        int i10 = this.f33264H;
                        this.f33264H = i10 + 1;
                        this.f33265I = list.get(i10).b(this.f33266J, this.f33259C.t(), this.f33259C.f(), this.f33259C.k());
                        if (this.f33265I != null && this.f33259C.u(this.f33265I.f49349c.a())) {
                            this.f33265I.f49349c.e(this.f33259C.l(), this);
                            z10 = true;
                        }
                    }
                    I6.b.e();
                    return z10;
                }
                int i11 = this.f33261E + 1;
                this.f33261E = i11;
                if (i11 >= listM.size()) {
                    int i12 = this.f33260D + 1;
                    this.f33260D = i12;
                    if (i12 >= listC.size()) {
                        I6.b.e();
                        return false;
                    }
                    this.f33261E = 0;
                }
                InterfaceC3970e interfaceC3970e = listC.get(this.f33260D);
                Class<?> cls = listM.get(this.f33261E);
                this.f33267K = new t(this.f33259C.b(), interfaceC3970e, this.f33259C.p(), this.f33259C.t(), this.f33259C.f(), this.f33259C.s(cls), cls, this.f33259C.k());
                File fileB = this.f33259C.d().b(this.f33267K);
                this.f33266J = fileB;
                if (fileB != null) {
                    this.f33262F = interfaceC3970e;
                    this.f33263G = this.f33259C.j(fileB);
                    this.f33264H = 0;
                }
            }
        } catch (Throwable th) {
            I6.b.e();
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        this.f33258B.n(this.f33267K, exc, this.f33265I.f49349c, EnumC3966a.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        o.a<?> aVar = this.f33265I;
        if (aVar != null) {
            aVar.f49349c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f33258B.c(this.f33262F, obj, this.f33265I.f49349c, EnumC3966a.RESOURCE_DISK_CACHE, this.f33267K);
    }
}
