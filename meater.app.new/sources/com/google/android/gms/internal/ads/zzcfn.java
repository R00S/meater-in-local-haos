package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzcfn {

    /* renamed from: a */
    private final Clock f24228a;

    public zzcfn(Clock clock) {
        this.f24228a = clock;
    }

    /* renamed from: a */
    public final void m18734a(List<Object> list, String str, String str2, Object... objArr) throws IOException {
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21672N1)).booleanValue()) {
            long jMo14608a = this.f24228a.mo14608a();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(jMo14608a);
                jsonWriter.name("source").value(str);
                jsonWriter.name("event").value(str2);
                jsonWriter.name("components").beginArray();
                Iterator<Object> it = list.iterator();
                while (it.hasNext()) {
                    jsonWriter.value(it.next().toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    Object obj = objArr[i2];
                    jsonWriter.value(obj != null ? obj.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e2) {
                zzbad.m17347c("unable to log", e2);
            }
            String strValueOf = String.valueOf(stringWriter.toString());
            zzbad.m17352h(strValueOf.length() != 0 ? "AD-DBG ".concat(strValueOf) : new String("AD-DBG "));
        }
    }
}
