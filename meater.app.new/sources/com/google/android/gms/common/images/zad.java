package com.google.android.gms.common.images;

import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.Objects;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class zad extends zaa {

    /* renamed from: b */
    private WeakReference<ImageManager.OnImageLoadedListener> f17689b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zad)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        zad zadVar = (zad) obj;
        ImageManager.OnImageLoadedListener onImageLoadedListener = this.f17689b.get();
        ImageManager.OnImageLoadedListener onImageLoadedListener2 = zadVar.f17689b.get();
        return onImageLoadedListener2 != null && onImageLoadedListener != null && Objects.m14355a(onImageLoadedListener2, onImageLoadedListener) && Objects.m14355a(zadVar.f17687a, this.f17687a);
    }

    public final int hashCode() {
        return Objects.m14356b(this.f17687a);
    }
}
