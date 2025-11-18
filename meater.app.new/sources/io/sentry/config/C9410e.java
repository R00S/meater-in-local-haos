package io.sentry.config;

import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9670w1;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* compiled from: FilesystemPropertiesLoader.java */
/* renamed from: io.sentry.config.e */
/* loaded from: classes2.dex */
final class C9410e {

    /* renamed from: a */
    private final String f36257a;

    /* renamed from: b */
    private final InterfaceC9670w1 f36258b;

    public C9410e(String str, InterfaceC9670w1 interfaceC9670w1) {
        this.f36257a = str;
        this.f36258b = interfaceC9670w1;
    }

    /* renamed from: a */
    public Properties m30710a() throws IOException {
        try {
            File file = new File(this.f36257a);
            if (!file.isFile() || !file.canRead()) {
                return null;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                bufferedInputStream.close();
                return properties;
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IOException e2) {
            this.f36258b.mo30212a(EnumC9587s4.ERROR, e2, "Failed to load Sentry configuration from file: %s", this.f36257a);
            return null;
        }
    }
}
