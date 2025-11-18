package com.bumptech.glide.load.data;

import m6.EnumC3966a;

/* compiled from: DataFetcher.java */
/* loaded from: classes2.dex */
public interface d<T> {

    /* compiled from: DataFetcher.java */
    public interface a<T> {
        void c(Exception exc);

        void f(T t10);
    }

    Class<T> a();

    void b();

    void cancel();

    EnumC3966a d();

    void e(com.bumptech.glide.g gVar, a<? super T> aVar);
}
