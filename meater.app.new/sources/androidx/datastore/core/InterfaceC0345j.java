package androidx.datastore.core;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.C10775u;
import kotlin.coroutines.Continuation;

/* compiled from: Serializer.kt */
/* renamed from: androidx.datastore.core.j */
/* loaded from: classes.dex */
public interface InterfaceC0345j<T> {
    /* renamed from: a */
    T mo2364a();

    /* renamed from: b */
    Object mo2365b(T t, OutputStream outputStream, Continuation<? super C10775u> continuation);

    /* renamed from: c */
    Object mo2366c(InputStream inputStream, Continuation<? super T> continuation);
}
