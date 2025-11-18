package com.bumptech.glide.load.p127m;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: AssetFileDescriptorLocalUriFetcher.java */
/* renamed from: com.bumptech.glide.load.m.a */
/* loaded from: classes.dex */
public final class C5430a extends AbstractC5441l<AssetFileDescriptor> {
    public C5430a(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // com.bumptech.glide.load.p127m.InterfaceC5433d
    /* renamed from: a */
    public Class<AssetFileDescriptor> mo10455a() {
        return AssetFileDescriptor.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.p127m.AbstractC5441l
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo10456c(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.p127m.AbstractC5441l
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public AssetFileDescriptor mo10457f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            return assetFileDescriptorOpenAssetFileDescriptor;
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }
}
