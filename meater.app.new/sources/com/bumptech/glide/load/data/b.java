package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import m6.EnumC3966a;

/* compiled from: AssetPathFetcher.java */
/* loaded from: classes2.dex */
public abstract class b<T> implements d<T> {

    /* renamed from: B, reason: collision with root package name */
    private final String f33032B;

    /* renamed from: C, reason: collision with root package name */
    private final AssetManager f33033C;

    /* renamed from: D, reason: collision with root package name */
    private T f33034D;

    public b(AssetManager assetManager, String str) {
        this.f33033C = assetManager;
        this.f33032B = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        T t10 = this.f33034D;
        if (t10 == null) {
            return;
        }
        try {
            c(t10);
        } catch (IOException unused) {
        }
    }

    protected abstract void c(T t10);

    @Override // com.bumptech.glide.load.data.d
    public EnumC3966a d() {
        return EnumC3966a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(com.bumptech.glide.g gVar, d.a<? super T> aVar) {
        try {
            T tF = f(this.f33033C, this.f33032B);
            this.f33034D = tF;
            aVar.f(tF);
        } catch (IOException e10) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e10);
            }
            aVar.c(e10);
        }
    }

    protected abstract T f(AssetManager assetManager, String str);

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}
