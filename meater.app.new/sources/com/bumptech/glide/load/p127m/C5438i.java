package com.bumptech.glide.load.p127m;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: FileDescriptorLocalUriFetcher.java */
/* renamed from: com.bumptech.glide.load.m.i */
/* loaded from: classes.dex */
public class C5438i extends AbstractC5441l<ParcelFileDescriptor> {
    public C5438i(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // com.bumptech.glide.load.p127m.InterfaceC5433d
    /* renamed from: a */
    public Class<ParcelFileDescriptor> mo10455a() {
        return ParcelFileDescriptor.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.p127m.AbstractC5441l
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo10456c(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.p127m.AbstractC5441l
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor mo10457f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            return assetFileDescriptorOpenAssetFileDescriptor.getParcelFileDescriptor();
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }
}
