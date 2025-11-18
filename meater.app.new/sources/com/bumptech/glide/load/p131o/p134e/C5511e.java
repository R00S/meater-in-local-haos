package com.bumptech.glide.load.p131o.p134e;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.InterfaceC5427j;
import com.bumptech.glide.load.engine.InterfaceC5404u;
import java.util.List;

/* compiled from: ResourceDrawableDecoder.java */
/* renamed from: com.bumptech.glide.load.o.e.e */
/* loaded from: classes.dex */
public class C5511e implements InterfaceC5427j<Uri, Drawable> {

    /* renamed from: a */
    private final Context f13793a;

    public C5511e(Context context) {
        this.f13793a = context.getApplicationContext();
    }

    /* renamed from: d */
    private Context m10715d(Uri uri, String str) {
        if (str.equals(this.f13793a.getPackageName())) {
            return this.f13793a;
        }
        try {
            return this.f13793a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            if (str.contains(this.f13793a.getPackageName())) {
                return this.f13793a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e2);
        }
    }

    /* renamed from: e */
    private int m10716e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e2) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e2);
        }
    }

    /* renamed from: f */
    private int m10717f(Context context, Uri uri) {
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

    /* renamed from: g */
    private int m10718g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return m10717f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return m10716e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // com.bumptech.glide.load.InterfaceC5427j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5404u<Drawable> mo10453b(Uri uri, int i2, int i3, C5426i c5426i) {
        Context contextM10715d = m10715d(uri, uri.getAuthority());
        return C5510d.m10714f(C5507a.m10705b(this.f13793a, contextM10715d, m10718g(contextM10715d, uri)));
    }

    @Override // com.bumptech.glide.load.InterfaceC5427j
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean mo10452a(Uri uri, C5426i c5426i) {
        return uri.getScheme().equals("android.resource");
    }
}
