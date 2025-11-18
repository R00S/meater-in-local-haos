package com.bumptech.glide.load;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* compiled from: Key.java */
/* renamed from: com.bumptech.glide.load.f */
/* loaded from: classes.dex */
public interface InterfaceC5423f {

    /* renamed from: a */
    public static final Charset f13555a = Charset.forName("UTF-8");

    boolean equals(Object obj);

    int hashCode();

    void updateDiskCacheKey(MessageDigest messageDigest);
}
