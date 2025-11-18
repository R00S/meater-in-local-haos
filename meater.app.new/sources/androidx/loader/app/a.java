package androidx.loader.app;

import android.view.InterfaceC2114v;
import android.view.c0;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: LoaderManager.java */
/* loaded from: classes.dex */
public abstract class a {
    public static <T extends InterfaceC2114v & c0> a b(T t10) {
        return new b(t10, t10.v());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void c();
}
