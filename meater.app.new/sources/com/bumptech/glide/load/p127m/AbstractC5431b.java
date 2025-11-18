package com.bumptech.glide.load.p127m;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.EnumC5353g;
import com.bumptech.glide.load.EnumC5365a;
import com.bumptech.glide.load.p127m.InterfaceC5433d;
import java.io.IOException;

/* compiled from: AssetPathFetcher.java */
/* renamed from: com.bumptech.glide.load.m.b */
/* loaded from: classes.dex */
public abstract class AbstractC5431b<T> implements InterfaceC5433d<T> {

    /* renamed from: f */
    private final String f13563f;

    /* renamed from: g */
    private final AssetManager f13564g;

    /* renamed from: h */
    private T f13565h;

    public AbstractC5431b(AssetManager assetManager, String str) {
        this.f13564g = assetManager;
        this.f13563f = str;
    }

    @Override // com.bumptech.glide.load.p127m.InterfaceC5433d
    /* renamed from: b */
    public void mo10460b() {
        T t = this.f13565h;
        if (t == null) {
            return;
        }
        try {
            mo10461c(t);
        } catch (IOException unused) {
        }
    }

    /* renamed from: c */
    protected abstract void mo10461c(T t) throws IOException;

    @Override // com.bumptech.glide.load.p127m.InterfaceC5433d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.p127m.InterfaceC5433d
    /* renamed from: d */
    public EnumC5365a mo10462d() {
        return EnumC5365a.LOCAL;
    }

    @Override // com.bumptech.glide.load.p127m.InterfaceC5433d
    /* renamed from: e */
    public void mo10463e(EnumC5353g enumC5353g, InterfaceC5433d.a<? super T> aVar) {
        try {
            T tMo10464f = mo10464f(this.f13564g, this.f13563f);
            this.f13565h = tMo10464f;
            aVar.mo10228f(tMo10464f);
        } catch (IOException e2) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e2);
            }
            aVar.mo10227c(e2);
        }
    }

    /* renamed from: f */
    protected abstract T mo10464f(AssetManager assetManager, String str) throws IOException;
}
