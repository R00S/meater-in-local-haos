package io.sentry.internal.debugmeta;

import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9670w1;
import io.sentry.util.C9637h;
import io.sentry.util.C9639j;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: ResourcesDebugMetaLoader.java */
@ApiStatus.Internal
/* renamed from: io.sentry.internal.debugmeta.c */
/* loaded from: classes2.dex */
public final class C9477c implements InterfaceC9475a {

    /* renamed from: a */
    private final InterfaceC9670w1 f36364a;

    /* renamed from: b */
    private final ClassLoader f36365b;

    public C9477c(InterfaceC9670w1 interfaceC9670w1) {
        this(interfaceC9670w1, C9477c.class.getClassLoader());
    }

    @Override // io.sentry.internal.debugmeta.InterfaceC9475a
    /* renamed from: a */
    public Properties mo30216a() throws IOException {
        try {
            InputStream resourceAsStream = this.f36365b.getResourceAsStream(C9639j.f36929a);
            try {
                if (resourceAsStream == null) {
                    this.f36364a.mo30214c(EnumC9587s4.INFO, "%s file was not found.", C9639j.f36929a);
                } else {
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
                    } catch (IOException e2) {
                        this.f36364a.mo30212a(EnumC9587s4.ERROR, e2, "Failed to load %s", C9639j.f36929a);
                    } catch (RuntimeException e3) {
                        this.f36364a.mo30212a(EnumC9587s4.ERROR, e3, "%s file is malformed.", C9639j.f36929a);
                    }
                }
                if (resourceAsStream == null) {
                    return null;
                }
                resourceAsStream.close();
                return null;
            } catch (Throwable th2) {
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (Throwable unused2) {
                    }
                }
                throw th2;
            }
        } catch (IOException e4) {
            this.f36364a.mo30212a(EnumC9587s4.ERROR, e4, "Failed to load %s", C9639j.f36929a);
            return null;
        }
    }

    C9477c(InterfaceC9670w1 interfaceC9670w1, ClassLoader classLoader) {
        this.f36364a = interfaceC9670w1;
        this.f36365b = C9637h.m31765a(classLoader);
    }
}
