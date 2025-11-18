package io.sentry.internal.modules;

import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9670w1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: ModulesLoader.java */
@ApiStatus.Internal
/* renamed from: io.sentry.internal.modules.d */
/* loaded from: classes2.dex */
public abstract class AbstractC9483d implements InterfaceC9481b {

    /* renamed from: a */
    private static final Charset f36377a = Charset.forName("UTF-8");

    /* renamed from: b */
    protected final InterfaceC9670w1 f36378b;

    /* renamed from: c */
    private Map<String, String> f36379c = null;

    public AbstractC9483d(InterfaceC9670w1 interfaceC9670w1) {
        this.f36378b = interfaceC9670w1;
    }

    @Override // io.sentry.internal.modules.InterfaceC9481b
    /* renamed from: a */
    public Map<String, String> mo30866a() {
        Map<String, String> map = this.f36379c;
        if (map != null) {
            return map;
        }
        Map<String, String> mapMo30259b = mo30259b();
        this.f36379c = mapMo30259b;
        return mapMo30259b;
    }

    /* renamed from: b */
    protected abstract Map<String, String> mo30259b();

    /* renamed from: c */
    protected Map<String, String> m30872c(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader;
        TreeMap treeMap = new TreeMap();
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, f36377a));
        } catch (IOException e2) {
            this.f36378b.mo30213b(EnumC9587s4.ERROR, "Error extracting modules.", e2);
        } catch (RuntimeException e3) {
            this.f36378b.mo30212a(EnumC9587s4.ERROR, e3, "%s file is malformed.", "sentry-external-modules.txt");
        }
        try {
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                int iLastIndexOf = line.lastIndexOf(58);
                treeMap.put(line.substring(0, iLastIndexOf), line.substring(iLastIndexOf + 1));
            }
            this.f36378b.mo30214c(EnumC9587s4.DEBUG, "Extracted %d modules from resources.", Integer.valueOf(treeMap.size()));
            bufferedReader.close();
            return treeMap;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
