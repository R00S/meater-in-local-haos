package g7;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Uri f42108a;

    /* renamed from: b, reason: collision with root package name */
    private static final Uri f42109b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f42110c = 0;

    static {
        Uri uri = Uri.parse("https://plus.google.com/");
        f42108a = uri;
        f42109b = uri.buildUpon().appendPath("circles").appendPath("find").build();
    }
}
