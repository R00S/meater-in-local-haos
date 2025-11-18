package com.liulishuo.filedownloader.exception;

import p241e.p307h.p308a.p315k0.C9036f;

/* loaded from: classes2.dex */
public class PathConflictException extends IllegalAccessException {

    /* renamed from: f */
    private final String f32974f;

    /* renamed from: g */
    private final String f32975g;

    /* renamed from: h */
    private final int f32976h;

    public PathConflictException(int i2, String str, String str2) {
        super(C9036f.m29009o("There is an another running task(%d) with the same downloading path(%s), because of they are with the same target-file-path(%s), so if the current task is started, the path of the file is sure to be written by multiple tasks, it is wrong, then you receive this exception to avoid such conflict.", Integer.valueOf(i2), str, str2));
        this.f32976h = i2;
        this.f32974f = str;
        this.f32975g = str2;
    }
}
