package com.liulishuo.filedownloader.services;

import com.liulishuo.filedownloader.model.C8699a;
import com.liulishuo.filedownloader.model.C8700b;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.Iterator;
import java.util.List;
import p241e.p307h.p308a.InterfaceC9050y;
import p241e.p307h.p308a.p310f0.InterfaceC9005a;
import p241e.p307h.p308a.p311g0.C9013c;
import p241e.p307h.p308a.p315k0.C9034d;
import p241e.p307h.p308a.p315k0.C9036f;

/* compiled from: FileDownloadManager.java */
/* renamed from: com.liulishuo.filedownloader.services.g */
/* loaded from: classes2.dex */
class C8707g implements InterfaceC9050y {

    /* renamed from: a */
    private final InterfaceC9005a f33054a;

    /* renamed from: b */
    private final C8708h f33055b;

    C8707g() {
        C9013c c9013cM28789j = C9013c.m28789j();
        this.f33054a = c9013cM28789j.m28795f();
        this.f33055b = new C8708h(c9013cM28789j.m28798k());
    }

    @Override // p241e.p307h.p308a.InterfaceC9050y
    /* renamed from: a */
    public boolean mo27649a(FileDownloadModel fileDownloadModel) {
        if (fileDownloadModel == null) {
            return false;
        }
        boolean zM27669g = this.f33055b.m27669g(fileDownloadModel.m27561e());
        if (C8700b.m27601e(fileDownloadModel.m27564h())) {
            if (!zM27669g) {
                return false;
            }
        } else if (!zM27669g) {
            C9034d.m28963b(this, "%d status is[%s](not finish) & but not in the pool", Integer.valueOf(fileDownloadModel.m27561e()), Byte.valueOf(fileDownloadModel.m27564h()));
            return false;
        }
        return true;
    }

    @Override // p241e.p307h.p308a.InterfaceC9050y
    /* renamed from: b */
    public int mo27650b(String str, int i2) {
        return this.f33055b.m27667e(str, i2);
    }

    /* renamed from: c */
    public void m27651c() {
        this.f33054a.clear();
    }

    /* renamed from: d */
    public boolean m27652d(int i2) {
        if (i2 == 0) {
            C9034d.m28970i(this, "The task[%d] id is invalid, can't clear it.", Integer.valueOf(i2));
            return false;
        }
        if (m27656h(i2)) {
            C9034d.m28970i(this, "The task[%d] is downloading, can't clear it.", Integer.valueOf(i2));
            return false;
        }
        this.f33054a.remove(i2);
        this.f33054a.mo28733h(i2);
        return true;
    }

    /* renamed from: e */
    public long m27653e(int i2) {
        FileDownloadModel fileDownloadModelMo28740o = this.f33054a.mo28740o(i2);
        if (fileDownloadModelMo28740o == null) {
            return 0L;
        }
        int iM27557a = fileDownloadModelMo28740o.m27557a();
        if (iM27557a <= 1) {
            return fileDownloadModelMo28740o.m27563g();
        }
        List<C8699a> listMo28739n = this.f33054a.mo28739n(i2);
        if (listMo28739n == null || listMo28739n.size() != iM27557a) {
            return 0L;
        }
        return C8699a.m27585f(listMo28739n);
    }

    /* renamed from: f */
    public byte m27654f(int i2) {
        FileDownloadModel fileDownloadModelMo28740o = this.f33054a.mo28740o(i2);
        if (fileDownloadModelMo28740o == null) {
            return (byte) 0;
        }
        return fileDownloadModelMo28740o.m27564h();
    }

    /* renamed from: g */
    public long m27655g(int i2) {
        FileDownloadModel fileDownloadModelMo28740o = this.f33054a.mo28740o(i2);
        if (fileDownloadModelMo28740o == null) {
            return 0L;
        }
        return fileDownloadModelMo28740o.m27567k();
    }

    /* renamed from: h */
    public boolean m27656h(int i2) {
        return mo27649a(this.f33054a.mo28740o(i2));
    }

    /* renamed from: i */
    public boolean m27657i(String str, String str2) {
        return m27656h(C9036f.m29012r(str, str2));
    }

    /* renamed from: j */
    public boolean m27658j() {
        return this.f33055b.m27665b() <= 0;
    }

    /* renamed from: k */
    public boolean m27659k(int i2) {
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "request pause the task %d", Integer.valueOf(i2));
        }
        FileDownloadModel fileDownloadModelMo28740o = this.f33054a.mo28740o(i2);
        if (fileDownloadModelMo28740o == null) {
            return false;
        }
        fileDownloadModelMo28740o.m27581y((byte) -2);
        this.f33055b.m27664a(i2);
        return true;
    }

    /* renamed from: l */
    public void m27660l() {
        List<Integer> listM27668f = this.f33055b.m27668f();
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "pause all tasks %d", Integer.valueOf(listM27668f.size()));
        }
        Iterator<Integer> it = listM27668f.iterator();
        while (it.hasNext()) {
            m27659k(it.next().intValue());
        }
    }

    /* renamed from: m */
    public synchronized boolean m27661m(int i2) {
        return this.f33055b.m27670h(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0184 A[Catch: all -> 0x01cf, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x0010, B:7:0x0022, B:10:0x0034, B:12:0x0044, B:14:0x004e, B:16:0x0052, B:17:0x0065, B:21:0x0072, B:23:0x0078, B:25:0x007c, B:29:0x008d, B:31:0x0096, B:33:0x009f, B:35:0x00a3, B:40:0x00b6, B:43:0x00bf, B:45:0x00c8, B:47:0x00d7, B:49:0x00db, B:51:0x00ec, B:55:0x00fa, B:57:0x0101, B:59:0x0108, B:61:0x010e, B:63:0x0115, B:65:0x011b, B:67:0x0121, B:69:0x013b, B:70:0x013f, B:72:0x0145, B:81:0x0184, B:82:0x0189, B:73:0x0154, B:75:0x015e, B:77:0x0164, B:78:0x016a, B:44:0x00c4, B:30:0x0092), top: B:90:0x0009 }] */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void m27662n(java.lang.String r19, java.lang.String r20, boolean r21, int r22, int r23, int r24, boolean r25, com.liulishuo.filedownloader.model.FileDownloadHeader r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.filedownloader.services.C8707g.m27662n(java.lang.String, java.lang.String, boolean, int, int, int, boolean, com.liulishuo.filedownloader.model.FileDownloadHeader, boolean):void");
    }
}
