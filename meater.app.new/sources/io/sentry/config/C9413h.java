package io.sentry.config;

import io.sentry.C9521n5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: PropertiesProviderFactory.java */
@ApiStatus.Internal
/* renamed from: io.sentry.config.h */
/* loaded from: classes2.dex */
public final class C9413h {
    /* renamed from: a */
    public static InterfaceC9412g m30716a() throws IOException {
        Properties propertiesM30710a;
        Properties propertiesM30710a2;
        C9521n5 c9521n5 = new C9521n5();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C9415j());
        arrayList.add(new C9409d());
        String property = System.getProperty("sentry.properties.file");
        if (property != null && (propertiesM30710a2 = new C9410e(property, c9521n5).m30710a()) != null) {
            arrayList.add(new C9414i(propertiesM30710a2));
        }
        String str = System.getenv("SENTRY_PROPERTIES_FILE");
        if (str != null && (propertiesM30710a = new C9410e(str, c9521n5).m30710a()) != null) {
            arrayList.add(new C9414i(propertiesM30710a));
        }
        Properties propertiesM30708a = new C9407b(c9521n5).m30708a();
        if (propertiesM30708a != null) {
            arrayList.add(new C9414i(propertiesM30708a));
        }
        Properties propertiesM30710a3 = new C9410e("sentry.properties", c9521n5).m30710a();
        if (propertiesM30710a3 != null) {
            arrayList.add(new C9414i(propertiesM30710a3));
        }
        return new C9408c(arrayList);
    }
}
