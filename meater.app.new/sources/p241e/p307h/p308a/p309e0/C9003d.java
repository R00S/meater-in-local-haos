package p241e.p307h.p308a.p309e0;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p241e.p307h.p308a.p311g0.C9013c;
import p241e.p307h.p308a.p315k0.C9034d;
import p241e.p307h.p308a.p315k0.C9036f;

/* compiled from: RedirectHandler.java */
/* renamed from: e.h.a.e0.d */
/* loaded from: classes2.dex */
public class C9003d {
    /* renamed from: a */
    private static InterfaceC9001b m28721a(Map<String, List<String>> map, String str) throws IOException {
        InterfaceC9001b interfaceC9001bM28792a = C9013c.m28789j().m28792a(str);
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            if (value != null) {
                Iterator<String> it = value.iterator();
                while (it.hasNext()) {
                    interfaceC9001bM28792a.mo27915f(key, it.next());
                }
            }
        }
        return interfaceC9001bM28792a;
    }

    /* renamed from: b */
    private static boolean m28722b(int i2) {
        return i2 == 301 || i2 == 302 || i2 == 303 || i2 == 300 || i2 == 307 || i2 == 308;
    }

    /* renamed from: c */
    public static InterfaceC9001b m28723c(Map<String, List<String>> map, InterfaceC9001b interfaceC9001b, List<String> list) throws IllegalAccessException, IOException {
        int iMo27913d = interfaceC9001b.mo27913d();
        String strMo27914e = interfaceC9001b.mo27914e("Location");
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (m28722b(iMo27913d)) {
            if (strMo27914e == null) {
                throw new IllegalAccessException(C9036f.m29009o("receive %d (redirect) but the location is null with response [%s]", Integer.valueOf(iMo27913d), interfaceC9001b.mo27911b()));
            }
            if (C9034d.f34819a) {
                C9034d.m28962a(C9003d.class, "redirect to %s with %d, %s", strMo27914e, Integer.valueOf(iMo27913d), arrayList);
            }
            interfaceC9001b.mo27916g();
            interfaceC9001b = m28721a(map, strMo27914e);
            arrayList.add(strMo27914e);
            interfaceC9001b.execute();
            iMo27913d = interfaceC9001b.mo27913d();
            strMo27914e = interfaceC9001b.mo27914e("Location");
            i2++;
            if (i2 >= 10) {
                throw new IllegalAccessException(C9036f.m29009o("redirect too many times! %s", arrayList));
            }
        }
        if (list != null) {
            list.addAll(arrayList);
        }
        return interfaceC9001b;
    }
}
