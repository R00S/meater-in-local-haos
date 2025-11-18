package o6;

import m6.EnumC3966a;
import m6.EnumC3968c;

/* compiled from: DiskCacheStrategy.java */
/* renamed from: o6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4137a {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC4137a f46568a = new C0636a();

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC4137a f46569b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC4137a f46570c = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC4137a f46571d = new d();

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC4137a f46572e = new e();

    /* compiled from: DiskCacheStrategy.java */
    /* renamed from: o6.a$a, reason: collision with other inner class name */
    class C0636a extends AbstractC4137a {
        C0636a() {
        }

        @Override // o6.AbstractC4137a
        public boolean a() {
            return true;
        }

        @Override // o6.AbstractC4137a
        public boolean b() {
            return true;
        }

        @Override // o6.AbstractC4137a
        public boolean c(EnumC3966a enumC3966a) {
            return enumC3966a == EnumC3966a.REMOTE;
        }

        @Override // o6.AbstractC4137a
        public boolean d(boolean z10, EnumC3966a enumC3966a, EnumC3968c enumC3968c) {
            return (enumC3966a == EnumC3966a.RESOURCE_DISK_CACHE || enumC3966a == EnumC3966a.MEMORY_CACHE) ? false : true;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* renamed from: o6.a$b */
    class b extends AbstractC4137a {
        b() {
        }

        @Override // o6.AbstractC4137a
        public boolean a() {
            return false;
        }

        @Override // o6.AbstractC4137a
        public boolean b() {
            return false;
        }

        @Override // o6.AbstractC4137a
        public boolean c(EnumC3966a enumC3966a) {
            return false;
        }

        @Override // o6.AbstractC4137a
        public boolean d(boolean z10, EnumC3966a enumC3966a, EnumC3968c enumC3968c) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* renamed from: o6.a$c */
    class c extends AbstractC4137a {
        c() {
        }

        @Override // o6.AbstractC4137a
        public boolean a() {
            return true;
        }

        @Override // o6.AbstractC4137a
        public boolean b() {
            return false;
        }

        @Override // o6.AbstractC4137a
        public boolean c(EnumC3966a enumC3966a) {
            return (enumC3966a == EnumC3966a.DATA_DISK_CACHE || enumC3966a == EnumC3966a.MEMORY_CACHE) ? false : true;
        }

        @Override // o6.AbstractC4137a
        public boolean d(boolean z10, EnumC3966a enumC3966a, EnumC3968c enumC3968c) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* renamed from: o6.a$d */
    class d extends AbstractC4137a {
        d() {
        }

        @Override // o6.AbstractC4137a
        public boolean a() {
            return false;
        }

        @Override // o6.AbstractC4137a
        public boolean b() {
            return true;
        }

        @Override // o6.AbstractC4137a
        public boolean c(EnumC3966a enumC3966a) {
            return false;
        }

        @Override // o6.AbstractC4137a
        public boolean d(boolean z10, EnumC3966a enumC3966a, EnumC3968c enumC3968c) {
            return (enumC3966a == EnumC3966a.RESOURCE_DISK_CACHE || enumC3966a == EnumC3966a.MEMORY_CACHE) ? false : true;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* renamed from: o6.a$e */
    class e extends AbstractC4137a {
        e() {
        }

        @Override // o6.AbstractC4137a
        public boolean a() {
            return true;
        }

        @Override // o6.AbstractC4137a
        public boolean b() {
            return true;
        }

        @Override // o6.AbstractC4137a
        public boolean c(EnumC3966a enumC3966a) {
            return enumC3966a == EnumC3966a.REMOTE;
        }

        @Override // o6.AbstractC4137a
        public boolean d(boolean z10, EnumC3966a enumC3966a, EnumC3968c enumC3968c) {
            return ((z10 && enumC3966a == EnumC3966a.DATA_DISK_CACHE) || enumC3966a == EnumC3966a.LOCAL) && enumC3968c == EnumC3968c.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(EnumC3966a enumC3966a);

    public abstract boolean d(boolean z10, EnumC3966a enumC3966a, EnumC3968c enumC3968c);
}
