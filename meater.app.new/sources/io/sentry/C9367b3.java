package io.sentry;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;
import okhttp3.HttpUrl;

/* compiled from: NoOpSerializer.java */
/* renamed from: io.sentry.b3 */
/* loaded from: classes2.dex */
final class C9367b3 implements InterfaceC9373c2 {

    /* renamed from: a */
    private static final C9367b3 f36151a = new C9367b3();

    private C9367b3() {
    }

    /* renamed from: g */
    public static C9367b3 m30486g() {
        return f36151a;
    }

    @Override // io.sentry.InterfaceC9373c2
    /* renamed from: a */
    public <T> void mo30487a(T t, Writer writer) throws IOException {
    }

    @Override // io.sentry.InterfaceC9373c2
    /* renamed from: b */
    public void mo30488b(C9449h4 c9449h4, OutputStream outputStream) throws Exception {
    }

    @Override // io.sentry.InterfaceC9373c2
    /* renamed from: c */
    public <T> T mo30489c(Reader reader, Class<T> cls) {
        return null;
    }

    @Override // io.sentry.InterfaceC9373c2
    /* renamed from: d */
    public C9449h4 mo30490d(InputStream inputStream) {
        return null;
    }

    @Override // io.sentry.InterfaceC9373c2
    /* renamed from: e */
    public <T, R> T mo30491e(Reader reader, Class<T> cls, InterfaceC9504l2<R> interfaceC9504l2) {
        return null;
    }

    @Override // io.sentry.InterfaceC9373c2
    /* renamed from: f */
    public String mo30492f(Map<String, Object> map) throws Exception {
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }
}
