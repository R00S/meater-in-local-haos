package com.facebook.p174r0.p175a;

import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.facebook.AccessToken;
import com.facebook.EnumC5655e0;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.internal.C5696p0;
import java.io.File;
import java.io.FileNotFoundException;
import kotlin.jvm.internal.C9801m;

/* compiled from: ShareInternalUtility.kt */
/* renamed from: com.facebook.r0.a.a */
/* loaded from: classes2.dex */
public final class C5951a {

    /* renamed from: a */
    public static final C5951a f15564a = new C5951a();

    private C5951a() {
    }

    /* renamed from: a */
    public static final GraphRequest m12886a(AccessToken accessToken, Uri uri, GraphRequest.InterfaceC5631b interfaceC5631b) throws FileNotFoundException {
        C9801m.m32346f(uri, "imageUri");
        String path = uri.getPath();
        C5696p0 c5696p0 = C5696p0.f14478a;
        if (C5696p0.m11554Y(uri) && path != null) {
            return m12887b(accessToken, new File(path), interfaceC5631b);
        }
        if (!C5696p0.m11551V(uri)) {
            throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
        }
        GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(uri, "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("file", parcelableResourceWithMimeType);
        return new GraphRequest(accessToken, "me/staging_resources", bundle, EnumC5655e0.POST, interfaceC5631b, null, 32, null);
    }

    /* renamed from: b */
    public static final GraphRequest m12887b(AccessToken accessToken, File file, GraphRequest.InterfaceC5631b interfaceC5631b) throws FileNotFoundException {
        GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(ParcelFileDescriptor.open(file, 268435456), "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("file", parcelableResourceWithMimeType);
        return new GraphRequest(accessToken, "me/staging_resources", bundle, EnumC5655e0.POST, interfaceC5631b, null, 32, null);
    }
}
