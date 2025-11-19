package nd;

import oc.C4178B;

/* compiled from: Call.java */
/* loaded from: classes3.dex */
public interface b<T> extends Cloneable {
    void cancel();

    /* renamed from: clone */
    b<T> mo13clone();

    void enqueue(d<T> dVar);

    s<T> execute();

    boolean isCanceled();

    C4178B request();
}
