package io.sentry.util;

import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9373c2;
import io.sentry.InterfaceC9578r2;
import io.sentry.InterfaceC9670w1;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: JsonSerializationUtils.java */
@ApiStatus.Internal
/* renamed from: io.sentry.util.n */
/* loaded from: classes2.dex */
public final class C9643n {

    /* renamed from: a */
    private static final Charset f36930a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static List<Object> m31795a(AtomicIntegerArray atomicIntegerArray) {
        int length = atomicIntegerArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(Integer.valueOf(atomicIntegerArray.get(i2)));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static byte[] m31796b(InterfaceC9373c2 interfaceC9373c2, InterfaceC9670w1 interfaceC9670w1, InterfaceC9578r2 interfaceC9578r2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f36930a));
                try {
                    interfaceC9373c2.mo30487a(interfaceC9578r2, bufferedWriter);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    bufferedWriter.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (Throwable th) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable unused2) {
                }
                throw th2;
            }
        } catch (Throwable th3) {
            interfaceC9670w1.mo30213b(EnumC9587s4.ERROR, "Could not serialize serializable", th3);
            return null;
        }
    }

    /* renamed from: c */
    public static Map<String, Object> m31797c(Calendar calendar) {
        HashMap map = new HashMap();
        map.put("year", Integer.valueOf(calendar.get(1)));
        map.put("month", Integer.valueOf(calendar.get(2)));
        map.put("dayOfMonth", Integer.valueOf(calendar.get(5)));
        map.put("hourOfDay", Integer.valueOf(calendar.get(11)));
        map.put("minute", Integer.valueOf(calendar.get(12)));
        map.put("second", Integer.valueOf(calendar.get(13)));
        return map;
    }
}
