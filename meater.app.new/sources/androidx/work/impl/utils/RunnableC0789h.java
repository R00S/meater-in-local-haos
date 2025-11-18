package androidx.work.impl.utils;

import androidx.work.WorkerParameters;
import androidx.work.impl.C0737j;

/* compiled from: StartWorkRunnable.java */
/* renamed from: androidx.work.impl.utils.h */
/* loaded from: classes.dex */
public class RunnableC0789h implements Runnable {

    /* renamed from: f */
    private C0737j f4880f;

    /* renamed from: g */
    private String f4881g;

    /* renamed from: h */
    private WorkerParameters.C0700a f4882h;

    public RunnableC0789h(C0737j c0737j, String str, WorkerParameters.C0700a c0700a) {
        this.f4880f = c0737j;
        this.f4881g = str;
        this.f4882h = c0700a;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f4880f.m4995r().m4938k(this.f4881g, this.f4882h);
    }
}
