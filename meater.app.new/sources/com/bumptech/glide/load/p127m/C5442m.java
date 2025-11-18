package com.bumptech.glide.load.p127m;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: StreamAssetPathFetcher.java */
/* renamed from: com.bumptech.glide.load.m.m */
/* loaded from: classes.dex */
public class C5442m extends AbstractC5431b<InputStream> {
    public C5442m(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.p127m.InterfaceC5433d
    /* renamed from: a */
    public Class<InputStream> mo10455a() {
        return InputStream.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.p127m.AbstractC5431b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo10461c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.p127m.AbstractC5431b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public InputStream mo10464f(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
