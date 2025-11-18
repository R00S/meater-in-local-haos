package com.liulishuo.filedownloader.services;

import android.content.Intent;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import p241e.p307h.p308a.p315k0.C9033c;

/* compiled from: FileDownloadBroadcastHandler.java */
/* renamed from: com.liulishuo.filedownloader.services.f */
/* loaded from: classes2.dex */
public class C8706f {
    /* renamed from: a */
    public static void m27648a(FileDownloadModel fileDownloadModel) {
        if (fileDownloadModel == null) {
            throw new IllegalArgumentException();
        }
        if (fileDownloadModel.m27564h() != -3) {
            throw new IllegalStateException();
        }
        Intent intent = new Intent("filedownloader.intent.action.completed");
        intent.putExtra("model", fileDownloadModel);
        C9033c.m28956a().sendBroadcast(intent);
    }
}
