package w6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;
import m6.C3971f;
import m6.C3972g;
import m6.InterfaceC3974i;
import o6.InterfaceC4139c;

/* compiled from: ResourceDrawableDecoder.java */
/* loaded from: classes2.dex */
public class l implements InterfaceC3974i<Uri, Drawable> {

    /* renamed from: b, reason: collision with root package name */
    public static final C3971f<Resources.Theme> f51963b = C3971f.e("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* renamed from: a, reason: collision with root package name */
    private final Context f51964a;

    public l(Context context) {
        this.f51964a = context.getApplicationContext();
    }

    private Context d(Uri uri, String str) {
        if (str.equals(this.f51964a.getPackageName())) {
            return this.f51964a;
        }
        try {
            return this.f51964a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            if (str.contains(this.f51964a.getPackageName())) {
                return this.f51964a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e10);
        }
    }

    private int e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e10);
        }
    }

    private int f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    private int g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // m6.InterfaceC3974i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC4139c<Drawable> a(Uri uri, int i10, int i11, C3972g c3972g) {
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            Context contextD = d(uri, authority);
            int iG = g(contextD, uri);
            Resources.Theme theme = ((String) H6.k.d(authority)).equals(this.f51964a.getPackageName()) ? (Resources.Theme) c3972g.c(f51963b) : null;
            return k.f(theme == null ? i.b(this.f51964a, contextD, iG) : i.a(this.f51964a, iG, theme));
        }
        throw new IllegalStateException("Package name for " + uri + " is null or empty");
    }

    @Override // m6.InterfaceC3974i
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri, C3972g c3972g) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }
}
