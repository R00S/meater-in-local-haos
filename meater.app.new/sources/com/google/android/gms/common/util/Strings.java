package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@VisibleForTesting
@KeepForSdk
/* loaded from: classes.dex */
public class Strings {

    /* renamed from: a */
    private static final Pattern f17993a = Pattern.compile("\\$\\{(.*?)\\}");

    private Strings() {
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    @KeepForSdk
    /* renamed from: a */
    public static boolean m14655a(String str) {
        return str == null || str.trim().isEmpty();
    }
}
