package p6;

import android.graphics.Bitmap;

/* compiled from: LruPoolStrategy.java */
/* loaded from: classes2.dex */
interface k {
    String a(int i10, int i11, Bitmap.Config config);

    int b(Bitmap bitmap);

    void c(Bitmap bitmap);

    Bitmap d(int i10, int i11, Bitmap.Config config);

    String e(Bitmap bitmap);

    Bitmap removeLast();
}
