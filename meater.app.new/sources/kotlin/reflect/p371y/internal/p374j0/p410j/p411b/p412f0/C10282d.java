package kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p412f0;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.C9801m;

/* compiled from: BuiltInsResourceLoader.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.f0.d */
/* loaded from: classes3.dex */
public final class C10282d {
    /* renamed from: a */
    public final InputStream m36251a(String str) throws IOException {
        C9801m.m32346f(str, "path");
        ClassLoader classLoader = C10282d.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResourceAsStream(str);
        }
        URL resource = classLoader.getResource(str);
        if (resource == null) {
            return null;
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        uRLConnectionOpenConnection.setUseCaches(false);
        return uRLConnectionOpenConnection.getInputStream();
    }
}
