package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import m6.EnumC3966a;

/* compiled from: LocalUriFetcher.java */
/* loaded from: classes2.dex */
public abstract class l<T> implements d<T> {

    /* renamed from: B, reason: collision with root package name */
    private final Uri f33056B;

    /* renamed from: C, reason: collision with root package name */
    private final ContentResolver f33057C;

    /* renamed from: D, reason: collision with root package name */
    private T f33058D;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f33057C = contentResolver;
        this.f33056B = uri;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        T t10 = this.f33058D;
        if (t10 != null) {
            try {
                c(t10);
            } catch (IOException unused) {
            }
        }
    }

    protected abstract void c(T t10);

    @Override // com.bumptech.glide.load.data.d
    public EnumC3966a d() {
        return EnumC3966a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.g gVar, d.a<? super T> aVar) {
        try {
            T tF = f(this.f33056B, this.f33057C);
            this.f33058D = tF;
            aVar.f(tF);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e10);
            }
            aVar.c(e10);
        }
    }

    protected abstract T f(Uri uri, ContentResolver contentResolver);

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}
