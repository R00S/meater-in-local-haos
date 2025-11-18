package com.liulishuo.filedownloader.exception;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p241e.p307h.p308a.p315k0.C9036f;

/* loaded from: classes2.dex */
public class FileDownloadHttpException extends IOException {

    /* renamed from: f */
    private final int f32968f;

    /* renamed from: g */
    private final Map<String, List<String>> f32969g;

    /* renamed from: h */
    private final Map<String, List<String>> f32970h;

    public FileDownloadHttpException(int i2, Map<String, List<String>> map, Map<String, List<String>> map2) {
        super(C9036f.m29009o("response code error: %d, \n request headers: %s \n response headers: %s", Integer.valueOf(i2), map, map2));
        this.f32968f = i2;
        this.f32969g = m27515a(map);
        this.f32970h = m27515a(map);
    }

    /* renamed from: a */
    private static Map<String, List<String>> m27515a(Map<String, List<String>> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            map2.put(entry.getKey(), new ArrayList(entry.getValue()));
        }
        return map2;
    }

    /* renamed from: b */
    public int m27516b() {
        return this.f32968f;
    }
}
