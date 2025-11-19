package Ob;

import java.util.Iterator;
import kotlin.jvm.internal.C3854k;

/* compiled from: ArrayMap.kt */
/* loaded from: classes3.dex */
public abstract class c<T> implements Iterable<T>, Ca.a {
    public /* synthetic */ c(C3854k c3854k) {
        this();
    }

    public abstract int c();

    public abstract T get(int i10);

    public abstract void h(int i10, T t10);

    @Override // java.lang.Iterable
    public abstract Iterator<T> iterator();

    private c() {
    }
}
