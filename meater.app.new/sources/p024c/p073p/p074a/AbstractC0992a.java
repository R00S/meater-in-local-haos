package p024c.p073p.p074a;

import android.os.Bundle;
import androidx.lifecycle.InterfaceC0501a0;
import androidx.lifecycle.InterfaceC0515k;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p024c.p073p.p075b.C0995b;

/* compiled from: LoaderManager.java */
/* renamed from: c.p.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC0992a {

    /* compiled from: LoaderManager.java */
    /* renamed from: c.p.a.a$a */
    public interface a<D> {
        /* renamed from: a */
        void mo6276a(C0995b<D> c0995b, D d2);

        /* renamed from: b */
        C0995b<D> mo6277b(int i2, Bundle bundle);

        /* renamed from: c */
        void mo6278c(C0995b<D> c0995b);
    }

    /* renamed from: b */
    public static <T extends InterfaceC0515k & InterfaceC0501a0> AbstractC0992a m6272b(T t) {
        return new C0993b(t, t.getViewModelStore());
    }

    @Deprecated
    /* renamed from: a */
    public abstract void mo6273a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: c */
    public abstract <D> C0995b<D> mo6274c(int i2, Bundle bundle, a<D> aVar);

    /* renamed from: d */
    public abstract void mo6275d();
}
