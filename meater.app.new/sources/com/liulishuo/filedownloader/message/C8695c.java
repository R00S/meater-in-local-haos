package com.liulishuo.filedownloader.message;

import com.liulishuo.filedownloader.message.BlockCompleteMessage;
import com.liulishuo.filedownloader.message.LargeMessageSnapshot;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.message.SmallMessageSnapshot;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.io.File;
import p241e.p307h.p308a.InterfaceC8991a;
import p241e.p307h.p308a.p311g0.C9016f;
import p241e.p307h.p308a.p315k0.C9034d;
import p241e.p307h.p308a.p315k0.C9036f;

/* compiled from: MessageSnapshotTaker.java */
/* renamed from: com.liulishuo.filedownloader.message.c */
/* loaded from: classes2.dex */
public class C8695c {
    /* renamed from: a */
    public static MessageSnapshot m27540a(int i2, File file, boolean z) {
        long length = file.length();
        return length > 2147483647L ? z ? new LargeMessageSnapshot.CompletedFlowDirectlySnapshot(i2, true, length) : new LargeMessageSnapshot.CompletedSnapshot(i2, true, length) : z ? new SmallMessageSnapshot.CompletedFlowDirectlySnapshot(i2, true, (int) length) : new SmallMessageSnapshot.CompletedSnapshot(i2, true, (int) length);
    }

    /* renamed from: b */
    public static MessageSnapshot m27541b(int i2, long j2, Throwable th) {
        return j2 > 2147483647L ? new LargeMessageSnapshot.ErrorMessageSnapshot(i2, j2, th) : new SmallMessageSnapshot.ErrorMessageSnapshot(i2, (int) j2, th);
    }

    /* renamed from: c */
    public static MessageSnapshot m27542c(InterfaceC8991a interfaceC8991a) {
        return interfaceC8991a.mo28625h() ? new LargeMessageSnapshot.PausedSnapshot(interfaceC8991a.getId(), interfaceC8991a.mo28632o(), interfaceC8991a.mo28609E()) : new SmallMessageSnapshot.PausedSnapshot(interfaceC8991a.getId(), interfaceC8991a.mo28608B(), interfaceC8991a.mo28626i());
    }

    /* renamed from: d */
    public static MessageSnapshot m27543d(int i2, long j2, long j3, boolean z) {
        return j3 > 2147483647L ? z ? new LargeMessageSnapshot.WarnFlowDirectlySnapshot(i2, j2, j3) : new LargeMessageSnapshot.WarnMessageSnapshot(i2, j2, j3) : z ? new SmallMessageSnapshot.WarnFlowDirectlySnapshot(i2, (int) j2, (int) j3) : new SmallMessageSnapshot.WarnMessageSnapshot(i2, (int) j2, (int) j3);
    }

    /* renamed from: e */
    public static MessageSnapshot m27544e(byte b2, FileDownloadModel fileDownloadModel, C9016f.a aVar) {
        MessageSnapshot errorMessageSnapshot;
        int iM27561e = fileDownloadModel.m27561e();
        if (b2 == -4) {
            throw new IllegalStateException(C9036f.m29009o("please use #catchWarn instead %d", Integer.valueOf(iM27561e)));
        }
        if (b2 == -3) {
            return fileDownloadModel.m27571o() ? new LargeMessageSnapshot.CompletedSnapshot(iM27561e, false, fileDownloadModel.m27567k()) : new SmallMessageSnapshot.CompletedSnapshot(iM27561e, false, (int) fileDownloadModel.m27567k());
        }
        if (b2 == -1) {
            errorMessageSnapshot = fileDownloadModel.m27571o() ? new LargeMessageSnapshot.ErrorMessageSnapshot(iM27561e, fileDownloadModel.m27563g(), aVar.m28871a()) : new SmallMessageSnapshot.ErrorMessageSnapshot(iM27561e, (int) fileDownloadModel.m27563g(), aVar.m28871a());
        } else {
            if (b2 == 1) {
                return fileDownloadModel.m27571o() ? new LargeMessageSnapshot.PendingMessageSnapshot(iM27561e, fileDownloadModel.m27563g(), fileDownloadModel.m27567k()) : new SmallMessageSnapshot.PendingMessageSnapshot(iM27561e, (int) fileDownloadModel.m27563g(), (int) fileDownloadModel.m27567k());
            }
            if (b2 == 2) {
                String strM27560d = fileDownloadModel.m27572p() ? fileDownloadModel.m27560d() : null;
                return fileDownloadModel.m27571o() ? new LargeMessageSnapshot.ConnectedMessageSnapshot(iM27561e, aVar.m28873c(), fileDownloadModel.m27567k(), fileDownloadModel.m27558b(), strM27560d) : new SmallMessageSnapshot.ConnectedMessageSnapshot(iM27561e, aVar.m28873c(), (int) fileDownloadModel.m27567k(), fileDownloadModel.m27558b(), strM27560d);
            }
            if (b2 == 3) {
                return fileDownloadModel.m27571o() ? new LargeMessageSnapshot.ProgressMessageSnapshot(iM27561e, fileDownloadModel.m27563g()) : new SmallMessageSnapshot.ProgressMessageSnapshot(iM27561e, (int) fileDownloadModel.m27563g());
            }
            if (b2 != 5) {
                if (b2 == 6) {
                    return new MessageSnapshot.StartedMessageSnapshot(iM27561e);
                }
                String strM29009o = C9036f.m29009o("it can't takes a snapshot for the task(%s) when its status is %d,", fileDownloadModel, Byte.valueOf(b2));
                C9034d.m28970i(C8695c.class, "it can't takes a snapshot for the task(%s) when its status is %d,", fileDownloadModel, Byte.valueOf(b2));
                IllegalStateException illegalStateException = aVar.m28871a() != null ? new IllegalStateException(strM29009o, aVar.m28871a()) : new IllegalStateException(strM29009o);
                return fileDownloadModel.m27571o() ? new LargeMessageSnapshot.ErrorMessageSnapshot(iM27561e, fileDownloadModel.m27563g(), illegalStateException) : new SmallMessageSnapshot.ErrorMessageSnapshot(iM27561e, (int) fileDownloadModel.m27563g(), illegalStateException);
            }
            errorMessageSnapshot = fileDownloadModel.m27571o() ? new LargeMessageSnapshot.RetryMessageSnapshot(iM27561e, fileDownloadModel.m27563g(), aVar.m28871a(), aVar.m28872b()) : new SmallMessageSnapshot.RetryMessageSnapshot(iM27561e, (int) fileDownloadModel.m27563g(), aVar.m28871a(), aVar.m28872b());
        }
        return errorMessageSnapshot;
    }

    /* renamed from: f */
    public static MessageSnapshot m27545f(MessageSnapshot messageSnapshot) {
        if (messageSnapshot.mo27519k() == -3) {
            return new BlockCompleteMessage.BlockCompleteMessageImpl(messageSnapshot);
        }
        throw new IllegalStateException(C9036f.m29009o("take block completed snapshot, must has already be completed. %d %d", Integer.valueOf(messageSnapshot.m27531e()), Byte.valueOf(messageSnapshot.mo27519k())));
    }
}
