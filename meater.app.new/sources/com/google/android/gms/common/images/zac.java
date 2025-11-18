package com.google.android.gms.common.images;

import android.widget.ImageView;
import com.google.android.gms.common.internal.Objects;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class zac extends zaa {

    /* renamed from: b */
    private WeakReference<ImageView> f17688b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zac)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ImageView imageView = this.f17688b.get();
        ImageView imageView2 = ((zac) obj).f17688b.get();
        return (imageView2 == null || imageView == null || !Objects.m14355a(imageView2, imageView)) ? false : true;
    }

    public final int hashCode() {
        return 0;
    }
}
