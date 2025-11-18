package com.bumptech.glide.load.engine.p123a0;

import com.bumptech.glide.load.engine.p123a0.InterfaceC5372a;
import java.io.File;

/* compiled from: DiskLruCacheFactory.java */
/* renamed from: com.bumptech.glide.load.engine.a0.d */
/* loaded from: classes.dex */
public class C5375d implements InterfaceC5372a.a {

    /* renamed from: a */
    private final long f13258a;

    /* renamed from: b */
    private final a f13259b;

    /* compiled from: DiskLruCacheFactory.java */
    /* renamed from: com.bumptech.glide.load.engine.a0.d$a */
    public interface a {
        /* renamed from: a */
        File mo10187a();
    }

    public C5375d(a aVar, long j2) {
        this.f13258a = j2;
        this.f13259b = aVar;
    }

    @Override // com.bumptech.glide.load.engine.p123a0.InterfaceC5372a.a
    /* renamed from: c */
    public InterfaceC5372a mo10181c() {
        File fileMo10187a = this.f13259b.mo10187a();
        if (fileMo10187a == null) {
            return null;
        }
        if (fileMo10187a.mkdirs() || (fileMo10187a.exists() && fileMo10187a.isDirectory())) {
            return C5376e.m10188c(fileMo10187a, this.f13258a);
        }
        return null;
    }
}
