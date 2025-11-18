package com.google.firebase.remoteconfig.internal;

/* compiled from: FirebaseRemoteConfigInfoImpl.java */
/* loaded from: classes2.dex */
public class v implements E9.h {

    /* renamed from: a, reason: collision with root package name */
    private final long f38777a;

    /* renamed from: b, reason: collision with root package name */
    private final int f38778b;

    /* renamed from: c, reason: collision with root package name */
    private final E9.i f38779c;

    /* compiled from: FirebaseRemoteConfigInfoImpl.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private long f38780a;

        /* renamed from: b, reason: collision with root package name */
        private int f38781b;

        /* renamed from: c, reason: collision with root package name */
        private E9.i f38782c;

        public v a() {
            return new v(this.f38780a, this.f38781b, this.f38782c);
        }

        b b(E9.i iVar) {
            this.f38782c = iVar;
            return this;
        }

        b c(int i10) {
            this.f38781b = i10;
            return this;
        }

        public b d(long j10) {
            this.f38780a = j10;
            return this;
        }

        private b() {
        }
    }

    static b b() {
        return new b();
    }

    @Override // E9.h
    public int a() {
        return this.f38778b;
    }

    private v(long j10, int i10, E9.i iVar) {
        this.f38777a = j10;
        this.f38778b = i10;
        this.f38779c = iVar;
    }
}
