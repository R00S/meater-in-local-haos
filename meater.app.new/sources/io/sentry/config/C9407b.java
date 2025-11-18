package io.sentry.config;

import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9670w1;
import io.sentry.util.C9637h;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* compiled from: ClasspathPropertiesLoader.java */
/* renamed from: io.sentry.config.b */
/* loaded from: classes2.dex */
final class C9407b {

    /* renamed from: a */
    private final String f36253a;

    /* renamed from: b */
    private final ClassLoader f36254b;

    /* renamed from: c */
    private final InterfaceC9670w1 f36255c;

    public C9407b(String str, ClassLoader classLoader, InterfaceC9670w1 interfaceC9670w1) {
        this.f36253a = str;
        this.f36254b = C9637h.m31765a(classLoader);
        this.f36255c = interfaceC9670w1;
    }

    /* renamed from: a */
    public Properties m30708a() throws IOException {
        try {
            InputStream resourceAsStream = this.f36254b.getResourceAsStream(this.f36253a);
            if (resourceAsStream == null) {
                if (resourceAsStream != null) {
                }
                return null;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
                try {
                    Properties properties = new Properties();
                    properties.load(bufferedInputStream);
                    bufferedInputStream.close();
                    resourceAsStream.close();
                    return properties;
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } finally {
                try {
                    resourceAsStream.close();
                } catch (Throwable unused2) {
                }
            }
        } catch (IOException e2) {
            this.f36255c.mo30212a(EnumC9587s4.ERROR, e2, "Failed to load Sentry configuration from classpath resource: %s", this.f36253a);
            return null;
        }
    }

    public C9407b(InterfaceC9670w1 interfaceC9670w1) {
        this("sentry.properties", C9407b.class.getClassLoader(), interfaceC9670w1);
    }
}
