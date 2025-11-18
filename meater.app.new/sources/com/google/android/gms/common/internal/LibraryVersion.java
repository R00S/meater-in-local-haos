package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
@Deprecated
/* loaded from: classes2.dex */
public class LibraryVersion {

    /* renamed from: a */
    private static final GmsLogger f17769a = new GmsLogger("LibraryVersion", HttpUrl.FRAGMENT_ENCODE_SET);

    /* renamed from: b */
    private static LibraryVersion f17770b = new LibraryVersion();

    /* renamed from: c */
    private ConcurrentHashMap f17771c = new ConcurrentHashMap();

    @VisibleForTesting
    protected LibraryVersion() {
    }
}
