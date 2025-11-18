package io.sentry.config;

import io.sentry.util.C9646q;
import io.sentry.util.C9654u;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import okhttp3.HttpUrl;

/* compiled from: AbstractPropertiesProvider.java */
/* renamed from: io.sentry.config.a */
/* loaded from: classes2.dex */
abstract class AbstractC9406a implements InterfaceC9412g {

    /* renamed from: a */
    private final String f36251a;

    /* renamed from: b */
    private final Properties f36252b;

    protected AbstractC9406a(String str, Properties properties) {
        this.f36251a = (String) C9646q.m31802c(str, "prefix is required");
        this.f36252b = (Properties) C9646q.m31802c(properties, "properties are required");
    }

    @Override // io.sentry.config.InterfaceC9412g
    /* renamed from: a */
    public Map<String, String> mo30701a(String str) {
        String str2 = this.f36251a + str + ".";
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f36252b.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str3 = (String) entry.getKey();
                if (str3.startsWith(str2)) {
                    map.put(str3.substring(str2.length()), C9654u.m31821e((String) entry.getValue(), "\""));
                }
            }
        }
        return map;
    }

    @Override // io.sentry.config.InterfaceC9412g
    /* renamed from: b */
    public String mo30702b(String str) {
        return C9654u.m31821e(this.f36252b.getProperty(this.f36251a + str), "\"");
    }

    @Override // io.sentry.config.InterfaceC9412g
    /* renamed from: c */
    public /* synthetic */ Boolean mo30703c(String str) {
        return C9411f.m30711a(this, str);
    }

    @Override // io.sentry.config.InterfaceC9412g
    /* renamed from: d */
    public /* synthetic */ Long mo30704d(String str) {
        return C9411f.m30714d(this, str);
    }

    @Override // io.sentry.config.InterfaceC9412g
    /* renamed from: e */
    public /* synthetic */ Double mo30705e(String str) {
        return C9411f.m30712b(this, str);
    }

    @Override // io.sentry.config.InterfaceC9412g
    /* renamed from: f */
    public /* synthetic */ String mo30706f(String str, String str2) {
        return C9411f.m30715e(this, str, str2);
    }

    @Override // io.sentry.config.InterfaceC9412g
    /* renamed from: g */
    public /* synthetic */ List mo30707g(String str) {
        return C9411f.m30713c(this, str);
    }

    protected AbstractC9406a(Properties properties) {
        this(HttpUrl.FRAGMENT_ENCODE_SET, properties);
    }
}
