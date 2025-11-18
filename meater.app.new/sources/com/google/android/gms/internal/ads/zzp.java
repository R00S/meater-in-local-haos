package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class zzp {

    /* renamed from: a */
    public final int f26739a;

    /* renamed from: b */
    public final byte[] f26740b;

    /* renamed from: c */
    public final Map<String, String> f26741c;

    /* renamed from: d */
    public final List<zzl> f26742d;

    /* renamed from: e */
    public final boolean f26743e;

    /* renamed from: f */
    private final long f26744f;

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public zzp(int i2, byte[] bArr, Map<String, String> map, boolean z, long j2) {
        List arrayList;
        if (map == null) {
            arrayList = null;
        } else if (map.isEmpty()) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new zzl(entry.getKey(), entry.getValue()));
            }
        }
        this(i2, bArr, map, arrayList, z, j2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzp(int i2, byte[] bArr, boolean z, long j2, List<zzl> list) {
        Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = Collections.emptyMap();
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (zzl zzlVar : list) {
                treeMap.put(zzlVar.m20195a(), zzlVar.m20196b());
            }
        }
        this(i2, bArr, treeMap, list, z, j2);
    }

    @Deprecated
    public zzp(byte[] bArr, Map<String, String> map) {
        this(200, bArr, map, false, 0L);
    }

    private zzp(int i2, byte[] bArr, Map<String, String> map, List<zzl> list, boolean z, long j2) {
        this.f26739a = i2;
        this.f26740b = bArr;
        this.f26741c = map;
        if (list == null) {
            this.f26742d = null;
        } else {
            this.f26742d = Collections.unmodifiableList(list);
        }
        this.f26743e = z;
        this.f26744f = j2;
    }
}
