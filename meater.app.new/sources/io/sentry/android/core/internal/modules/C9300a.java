package io.sentry.android.core.internal.modules;

import android.content.Context;
import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9670w1;
import io.sentry.internal.modules.AbstractC9483d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: AssetsModulesLoader.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.internal.modules.a */
/* loaded from: classes2.dex */
public final class C9300a extends AbstractC9483d {

    /* renamed from: d */
    private final Context f35958d;

    public C9300a(Context context, InterfaceC9670w1 interfaceC9670w1) {
        super(interfaceC9670w1);
        this.f35958d = context;
    }

    @Override // io.sentry.internal.modules.AbstractC9483d
    /* renamed from: b */
    protected Map<String, String> mo30259b() throws IOException {
        TreeMap treeMap = new TreeMap();
        try {
            InputStream inputStreamOpen = this.f35958d.getAssets().open("sentry-external-modules.txt");
            try {
                Map<String, String> mapM30872c = m30872c(inputStreamOpen);
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                return mapM30872c;
            } catch (Throwable th) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused2) {
            this.f36378b.mo30214c(EnumC9587s4.INFO, "%s file was not found.", "sentry-external-modules.txt");
            return treeMap;
        } catch (IOException e2) {
            this.f36378b.mo30213b(EnumC9587s4.ERROR, "Error extracting modules.", e2);
            return treeMap;
        }
    }
}
