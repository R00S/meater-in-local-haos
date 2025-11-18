package io.sentry;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;

/* compiled from: ISerializer.java */
/* renamed from: io.sentry.c2 */
/* loaded from: classes2.dex */
public interface InterfaceC9373c2 {
    /* renamed from: a */
    <T> void mo30487a(T t, Writer writer) throws IOException;

    /* renamed from: b */
    void mo30488b(C9449h4 c9449h4, OutputStream outputStream) throws Exception;

    /* renamed from: c */
    <T> T mo30489c(Reader reader, Class<T> cls);

    /* renamed from: d */
    C9449h4 mo30490d(InputStream inputStream);

    /* renamed from: e */
    <T, R> T mo30491e(Reader reader, Class<T> cls, InterfaceC9504l2<R> interfaceC9504l2);

    /* renamed from: f */
    String mo30492f(Map<String, Object> map) throws Exception;
}
