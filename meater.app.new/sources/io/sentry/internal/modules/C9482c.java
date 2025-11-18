package io.sentry.internal.modules;

import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9670w1;
import io.sentry.util.C9637h;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: ManifestModulesLoader.java */
@ApiStatus.Internal
@ApiStatus.Experimental
/* renamed from: io.sentry.internal.modules.c */
/* loaded from: classes2.dex */
public final class C9482c extends AbstractC9483d {

    /* renamed from: d */
    private final Pattern f36372d;

    /* renamed from: e */
    private final Pattern f36373e;

    /* renamed from: f */
    private final ClassLoader f36374f;

    /* compiled from: ManifestModulesLoader.java */
    /* renamed from: io.sentry.internal.modules.c$a */
    private static final class a {

        /* renamed from: a */
        private final String f36375a;

        /* renamed from: b */
        private final String f36376b;

        public a(String str, String str2) {
            this.f36375a = str;
            this.f36376b = str2;
        }
    }

    public C9482c(InterfaceC9670w1 interfaceC9670w1) {
        this(C9482c.class.getClassLoader(), interfaceC9670w1);
    }

    /* renamed from: d */
    private a m30867d(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = this.f36373e.matcher(str);
        if (matcher.matches() && matcher.groupCount() == 2) {
            return new a(matcher.group(1), matcher.group(2));
        }
        return null;
    }

    /* renamed from: e */
    private List<a> m30868e() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.f36374f.getResources("META-INF/MANIFEST.MF");
            while (resources.hasMoreElements()) {
                a aVarM30867d = m30867d(m30869f(resources.nextElement()));
                if (aVarM30867d != null) {
                    arrayList.add(aVarM30867d);
                }
            }
        } catch (Throwable th) {
            this.f36378b.mo30213b(EnumC9587s4.ERROR, "Unable to detect modules via manifest files.", th);
        }
        return arrayList;
    }

    /* renamed from: f */
    private String m30869f(URL url) {
        Matcher matcher = this.f36372d.matcher(url.toString());
        if (matcher.matches() && matcher.groupCount() == 1) {
            return matcher.group(1);
        }
        return null;
    }

    @Override // io.sentry.internal.modules.AbstractC9483d
    /* renamed from: b */
    protected Map<String, String> mo30259b() {
        HashMap map = new HashMap();
        for (a aVar : m30868e()) {
            map.put(aVar.f36375a, aVar.f36376b);
        }
        return map;
    }

    C9482c(ClassLoader classLoader, InterfaceC9670w1 interfaceC9670w1) {
        super(interfaceC9670w1);
        this.f36372d = Pattern.compile(".*/(.+)!/META-INF/MANIFEST.MF");
        this.f36373e = Pattern.compile("(.*?)-(\\d+\\.\\d+.*).jar");
        this.f36374f = C9637h.m31765a(classLoader);
    }
}
