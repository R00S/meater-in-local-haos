package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.wrappers.Wrappers;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzag {

    /* renamed from: a */
    private static final Object f17842a = new Object();

    /* renamed from: b */
    private static boolean f17843b;

    /* renamed from: c */
    private static String f17844c;

    /* renamed from: d */
    private static int f17845d;

    /* renamed from: a */
    public static int m14500a(Context context) {
        m14502c(context);
        return f17845d;
    }

    /* renamed from: b */
    public static String m14501b(Context context) {
        m14502c(context);
        return f17844c;
    }

    /* renamed from: c */
    private static void m14502c(Context context) {
        Bundle bundle;
        synchronized (f17842a) {
            if (f17843b) {
                return;
            }
            f17843b = true;
            try {
                bundle = Wrappers.m14674a(context).m14669c(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("MetadataValueReader", "This should never happen.", e2);
            }
            if (bundle == null) {
                return;
            }
            f17844c = bundle.getString("com.google.app.id");
            f17845d = bundle.getInt("com.google.android.gms.version");
        }
    }
}
