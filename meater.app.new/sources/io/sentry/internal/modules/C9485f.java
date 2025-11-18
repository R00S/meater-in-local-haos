package io.sentry.internal.modules;

import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9670w1;
import io.sentry.util.C9637h;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: ResourcesModulesLoader.java */
@ApiStatus.Internal
/* renamed from: io.sentry.internal.modules.f */
/* loaded from: classes2.dex */
public final class C9485f extends AbstractC9483d {

    /* renamed from: d */
    private final ClassLoader f36381d;

    public C9485f(InterfaceC9670w1 interfaceC9670w1) {
        this(interfaceC9670w1, C9485f.class.getClassLoader());
    }

    @Override // io.sentry.internal.modules.AbstractC9483d
    /* renamed from: b */
    protected Map<String, String> mo30259b() throws IOException {
        TreeMap treeMap = new TreeMap();
        try {
            InputStream resourceAsStream = this.f36381d.getResourceAsStream("sentry-external-modules.txt");
            try {
                if (resourceAsStream != null) {
                    Map<String, String> mapM30872c = m30872c(resourceAsStream);
                    resourceAsStream.close();
                    return mapM30872c;
                }
                this.f36378b.mo30214c(EnumC9587s4.INFO, "%s file was not found.", "sentry-external-modules.txt");
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
                return treeMap;
            } catch (Throwable th) {
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            this.f36378b.mo30213b(EnumC9587s4.INFO, "Access to resources failed.", e2);
            return treeMap;
        } catch (SecurityException e3) {
            this.f36378b.mo30213b(EnumC9587s4.INFO, "Access to resources denied.", e3);
            return treeMap;
        }
    }

    C9485f(InterfaceC9670w1 interfaceC9670w1, ClassLoader classLoader) {
        super(interfaceC9670w1);
        this.f36381d = C9637h.m31765a(classLoader);
    }
}
