package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.d3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC2458d3 {
    String a(ContentResolver contentResolver, String str);

    <T extends Map<String, String>> T b(ContentResolver contentResolver, String[] strArr, InterfaceC2440b3<T> interfaceC2440b3);
}
