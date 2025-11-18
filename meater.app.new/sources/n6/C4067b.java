package n6;

import android.net.Uri;

/* compiled from: MediaStoreUtil.java */
/* renamed from: n6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4067b {
    public static boolean a(Uri uri) {
        return c(uri) && uri.getPathSegments().contains("picker");
    }

    public static boolean b(Uri uri) {
        return c(uri) && !f(uri);
    }

    public static boolean c(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean d(Uri uri) {
        return c(uri) && f(uri);
    }

    public static boolean e(int i10, int i11) {
        return i10 != Integer.MIN_VALUE && i11 != Integer.MIN_VALUE && i10 <= 512 && i11 <= 384;
    }

    private static boolean f(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
