package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.EnumC5365a;
import com.bumptech.glide.load.EnumC5367c;

/* compiled from: DiskCacheStrategy.java */
/* renamed from: com.bumptech.glide.load.engine.j */
/* loaded from: classes.dex */
public abstract class AbstractC5393j {

    /* renamed from: a */
    public static final AbstractC5393j f13394a = new a();

    /* renamed from: b */
    public static final AbstractC5393j f13395b = new b();

    /* renamed from: c */
    public static final AbstractC5393j f13396c = new c();

    /* renamed from: d */
    public static final AbstractC5393j f13397d = new d();

    /* renamed from: e */
    public static final AbstractC5393j f13398e = new e();

    /* compiled from: DiskCacheStrategy.java */
    /* renamed from: com.bumptech.glide.load.engine.j$a */
    class a extends AbstractC5393j {
        a() {
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5393j
        /* renamed from: a */
        public boolean mo10298a() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5393j
        /* renamed from: b */
        public boolean mo10299b() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5393j
        /* renamed from: c */
        public boolean mo10300c(EnumC5365a enumC5365a) {
            return enumC5365a == EnumC5365a.REMOTE;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5393j
        /* renamed from: d */
        public boolean mo10301d(boolean z, EnumC5365a enumC5365a, EnumC5367c enumC5367c) {
            return (enumC5365a == EnumC5365a.RESOURCE_DISK_CACHE || enumC5365a == EnumC5365a.MEMORY_CACHE) ? false : true;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* renamed from: com.bumptech.glide.load.engine.j$b */
    class b extends AbstractC5393j {
        b() {
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5393j
        /* renamed from: a */
        public boolean mo10298a() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5393j
        /* renamed from: b */
        public boolean mo10299b() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5393j
        /* renamed from: c */
        public boolean mo10300c(EnumC5365a enumC5365a) {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5393j
        /* renamed from: d */
        public boolean mo10301d(boolean z, EnumC5365a enumC5365a, EnumC5367c enumC5367c) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* renamed from: com.bumptech.glide.load.engine.j$c */
    class c extends AbstractC5393j {
        c() {
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5393j
        /* renamed from: a */
        public boolean mo10298a() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5393j
        /* renamed from: b */
        public boolean mo10299b() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5393j
        /* renamed from: c */
        public boolean mo10300c(EnumC5365a enumC5365a) {
            return (enumC5365a == EnumC5365a.DATA_DISK_CACHE || enumC5365a == EnumC5365a.MEMORY_CACHE) ? false : true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5393j
        /* renamed from: d */
        public boolean mo10301d(boolean z, EnumC5365a enumC5365a, EnumC5367c enumC5367c) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* renamed from: com.bumptech.glide.load.engine.j$d */
    class d extends AbstractC5393j {
        d() {
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5393j
        /* renamed from: a */
        public boolean mo10298a() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5393j
        /* renamed from: b */
        public boolean mo10299b() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5393j
        /* renamed from: c */
        public boolean mo10300c(EnumC5365a enumC5365a) {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5393j
        /* renamed from: d */
        public boolean mo10301d(boolean z, EnumC5365a enumC5365a, EnumC5367c enumC5367c) {
            return (enumC5365a == EnumC5365a.RESOURCE_DISK_CACHE || enumC5365a == EnumC5365a.MEMORY_CACHE) ? false : true;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* renamed from: com.bumptech.glide.load.engine.j$e */
    class e extends AbstractC5393j {
        e() {
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5393j
        /* renamed from: a */
        public boolean mo10298a() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5393j
        /* renamed from: b */
        public boolean mo10299b() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5393j
        /* renamed from: c */
        public boolean mo10300c(EnumC5365a enumC5365a) {
            return enumC5365a == EnumC5365a.REMOTE;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5393j
        /* renamed from: d */
        public boolean mo10301d(boolean z, EnumC5365a enumC5365a, EnumC5367c enumC5367c) {
            return ((z && enumC5365a == EnumC5365a.DATA_DISK_CACHE) || enumC5365a == EnumC5365a.LOCAL) && enumC5367c == EnumC5367c.TRANSFORMED;
        }
    }

    /* renamed from: a */
    public abstract boolean mo10298a();

    /* renamed from: b */
    public abstract boolean mo10299b();

    /* renamed from: c */
    public abstract boolean mo10300c(EnumC5365a enumC5365a);

    /* renamed from: d */
    public abstract boolean mo10301d(boolean z, EnumC5365a enumC5365a, EnumC5367c enumC5367c);
}
