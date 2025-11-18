package com.flurry.sdk;

import com.flurry.sdk.C6155s0;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.flurry.sdk.r0 */
/* loaded from: classes2.dex */
public final class C6147r0 {

    /* renamed from: a */
    public static final Integer f16299a = 50;

    /* renamed from: b */
    String f16300b;

    /* renamed from: c */
    LinkedHashMap<String, List<String>> f16301c = new LinkedHashMap<>();

    /* renamed from: com.flurry.sdk.r0$a */
    final class a implements InterfaceC6204y1<List<C6155s0>> {
        a() {
        }

        @Override // com.flurry.sdk.InterfaceC6204y1
        /* renamed from: a */
        public final InterfaceC6180v1<List<C6155s0>> mo13122a(int i2) {
            return new C6172u1(new C6155s0.a());
        }
    }

    /* renamed from: com.flurry.sdk.r0$b */
    final class b implements InterfaceC6204y1<List<C6155s0>> {
        b() {
        }

        @Override // com.flurry.sdk.InterfaceC6204y1
        /* renamed from: a */
        public final InterfaceC6180v1<List<C6155s0>> mo13122a(int i2) {
            return new C6172u1(new C6155s0.a());
        }
    }

    /* renamed from: com.flurry.sdk.r0$c */
    final class c implements InterfaceC6204y1<List<C6155s0>> {
        c() {
        }

        @Override // com.flurry.sdk.InterfaceC6204y1
        /* renamed from: a */
        public final InterfaceC6180v1<List<C6155s0>> mo13122a(int i2) {
            return new C6172u1(new C6155s0.a());
        }
    }

    /* renamed from: com.flurry.sdk.r0$d */
    final class d implements InterfaceC6204y1<List<C6155s0>> {
        d() {
        }

        @Override // com.flurry.sdk.InterfaceC6204y1
        /* renamed from: a */
        public final InterfaceC6180v1<List<C6155s0>> mo13122a(int i2) {
            return new C6172u1(new C6155s0.a());
        }
    }

    /* renamed from: com.flurry.sdk.r0$e */
    final class e implements InterfaceC6204y1<List<C6155s0>> {
        e() {
        }

        @Override // com.flurry.sdk.InterfaceC6204y1
        /* renamed from: a */
        public final InterfaceC6180v1<List<C6155s0>> mo13122a(int i2) {
            return new C6172u1(new C6155s0.a());
        }
    }

    public C6147r0(String str) {
        this.f16300b = str + "Main";
    }

    /* renamed from: d */
    private synchronized void m13277d(String str, List<String> list, String str2) {
        C6013c2.m12988d();
        C6021d1.m13030c(5, "FlurryDataSenderIndex", "Saving Index File for " + str + " file name:" + C6002b0.m12964a().getFileStreamPath(m13280i(str)));
        C6018c7 c6018c7 = new C6018c7(C6002b0.m12964a().getFileStreamPath(m13280i(str)), str2, 1, new c());
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C6155s0(it.next()));
        }
        c6018c7.m13012b(arrayList);
    }

    /* renamed from: f */
    private synchronized void m13278f() {
        LinkedList linkedList = new LinkedList(this.f16301c.keySet());
        new C6018c7(C6002b0.m12964a().getFileStreamPath(m13280i(this.f16300b)), ".YFlurrySenderIndex.info.", 1, new d()).m13013c();
        if (!linkedList.isEmpty()) {
            String str = this.f16300b;
            m13277d(str, linkedList, str);
        }
    }

    /* renamed from: h */
    static void m13279h(String str) {
        C6013c2.m12988d();
        C6021d1.m13030c(5, "FlurryDataSenderIndex", "Deleting Index File for " + str + " file name:" + C6002b0.m12964a().getFileStreamPath(".FlurrySenderIndex.info.".concat(String.valueOf(str))));
        File fileStreamPath = C6002b0.m12964a().getFileStreamPath(".FlurrySenderIndex.info.".concat(String.valueOf(str)));
        if (fileStreamPath.exists()) {
            C6021d1.m13030c(5, "FlurryDataSenderIndex", "Found file for " + str + ". Deleted - " + fileStreamPath.delete());
        }
    }

    /* renamed from: i */
    static String m13280i(String str) {
        return ".YFlurrySenderIndex.info.".concat(String.valueOf(str));
    }

    /* renamed from: l */
    private static byte[] m13281l(String str) {
        byte[] bArr;
        C6013c2.m12988d();
        C6021d1.m13030c(5, "FlurryDataSenderIndex", "Reading block File for " + str + " file name:" + C6002b0.m12964a().getFileStreamPath(".flurrydatasenderblock.".concat(String.valueOf(str))));
        File fileStreamPath = C6002b0.m12964a().getFileStreamPath(".flurrydatasenderblock.".concat(String.valueOf(str)));
        DataInputStream dataInputStream = null;
        byte[] bArr2 = null;
        if (!fileStreamPath.exists()) {
            C6021d1.m13030c(4, "FlurryDataSenderIndex", "Agent cache file doesn't exist.");
            return null;
        }
        C6021d1.m13030c(5, "FlurryDataSenderIndex", "Reading Index File for " + str + " Found file.");
        try {
            DataInputStream dataInputStream2 = new DataInputStream(new FileInputStream(fileStreamPath));
            try {
                int unsignedShort = dataInputStream2.readUnsignedShort();
                if (unsignedShort == 0) {
                    C6013c2.m12990f(dataInputStream2);
                    return null;
                }
                bArr2 = new byte[unsignedShort];
                dataInputStream2.readFully(bArr2);
                dataInputStream2.readUnsignedShort();
                C6013c2.m12990f(dataInputStream2);
                return bArr2;
            } catch (Throwable th) {
                th = th;
                byte[] bArr3 = bArr2;
                dataInputStream = dataInputStream2;
                bArr = bArr3;
                try {
                    C6021d1.m13031d(6, "FlurryDataSenderIndex", "Error when loading persistent file", th);
                    C6013c2.m12990f(dataInputStream);
                    return bArr;
                } catch (Throwable th2) {
                    C6013c2.m12990f(dataInputStream);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            bArr = null;
        }
    }

    /* renamed from: m */
    private synchronized boolean m13282m(String str) {
        boolean zM13013c;
        C6013c2.m12988d();
        C6018c7 c6018c7 = new C6018c7(C6002b0.m12964a().getFileStreamPath(m13280i(str)), ".YFlurrySenderIndex.info.", 1, new e());
        List<String> listM13289k = m13289k(str);
        if (listM13289k != null && !listM13289k.isEmpty()) {
            C6021d1.m13030c(4, "FlurryDataSenderIndex", "discardOutdatedBlocksForDataKey: notSentBlocks = " + listM13289k.size());
            for (String str2 : listM13289k) {
                C6138q0.m13265b(str2).m13013c();
                C6021d1.m13030c(4, "FlurryDataSenderIndex", "discardOutdatedBlocksForDataKey: removed block = ".concat(String.valueOf(str2)));
            }
        }
        this.f16301c.remove(str);
        zM13013c = c6018c7.m13013c();
        m13278f();
        return zM13013c;
    }

    /* renamed from: a */
    public final List<String> m13283a() {
        return new ArrayList(this.f16301c.keySet());
    }

    /* renamed from: b */
    final synchronized List<String> m13284b(String str) {
        ArrayList arrayList;
        DataInputStream dataInputStream;
        int unsignedShort;
        C6013c2.m12988d();
        C6021d1.m13030c(5, "FlurryDataSenderIndex", "Reading Index File for " + str + " file name:" + C6002b0.m12964a().getFileStreamPath(".FlurrySenderIndex.info.".concat(String.valueOf(str))));
        File fileStreamPath = C6002b0.m12964a().getFileStreamPath(".FlurrySenderIndex.info.".concat(String.valueOf(str)));
        ArrayList arrayList2 = null;
        DataInputStream dataInputStream2 = null;
        if (fileStreamPath.exists()) {
            C6021d1.m13030c(5, "FlurryDataSenderIndex", "Reading Index File for " + str + " Found file.");
            try {
                dataInputStream = new DataInputStream(new FileInputStream(fileStreamPath));
                try {
                    unsignedShort = dataInputStream.readUnsignedShort();
                } catch (Throwable th) {
                    th = th;
                    arrayList = null;
                }
            } catch (Throwable th2) {
                th = th2;
                arrayList = null;
            }
            if (unsignedShort == 0) {
                C6013c2.m12990f(dataInputStream);
                return null;
            }
            arrayList = new ArrayList(unsignedShort);
            for (int i2 = 0; i2 < unsignedShort; i2++) {
                try {
                    int unsignedShort2 = dataInputStream.readUnsignedShort();
                    C6021d1.m13030c(4, "FlurryDataSenderIndex", "read iter " + i2 + " dataLength = " + unsignedShort2);
                    byte[] bArr = new byte[unsignedShort2];
                    dataInputStream.readFully(bArr);
                    arrayList.add(new String(bArr));
                } catch (Throwable th3) {
                    th = th3;
                    dataInputStream2 = dataInputStream;
                    try {
                        C6021d1.m13031d(6, "FlurryDataSenderIndex", "Error when loading persistent file", th);
                        arrayList2 = arrayList;
                        return arrayList2;
                    } finally {
                        C6013c2.m12990f(dataInputStream2);
                    }
                }
            }
            dataInputStream.readUnsignedShort();
            C6013c2.m12990f(dataInputStream);
            arrayList2 = arrayList;
        } else {
            C6021d1.m13030c(5, "FlurryDataSenderIndex", "Agent cache file doesn't exist.");
        }
        return arrayList2;
    }

    /* renamed from: c */
    public final synchronized void m13285c(C6138q0 c6138q0, String str) {
        boolean z;
        C6021d1.m13030c(4, "FlurryDataSenderIndex", "addBlockInfo".concat(String.valueOf(str)));
        String str2 = c6138q0.f16272a;
        List<String> linkedList = this.f16301c.get(str);
        if (linkedList == null) {
            C6021d1.m13030c(4, "FlurryDataSenderIndex", "New Data Key");
            linkedList = new LinkedList<>();
            z = true;
        } else {
            z = false;
        }
        linkedList.add(str2);
        if (linkedList.size() > f16299a.intValue()) {
            C6138q0.m13265b(linkedList.get(0)).m13013c();
            linkedList.remove(0);
        }
        this.f16301c.put(str, linkedList);
        m13277d(str, linkedList, ".YFlurrySenderIndex.info.");
        if (z) {
            m13278f();
        }
    }

    /* renamed from: e */
    public final boolean m13286e(String str, String str2) {
        boolean zRemove;
        List<String> list = this.f16301c.get(str2);
        if (list != null) {
            C6138q0.m13265b(str).m13013c();
            zRemove = list.remove(str);
        } else {
            zRemove = false;
        }
        if (list == null || list.isEmpty()) {
            m13282m(str2);
        } else {
            this.f16301c.put(str2, list);
            m13277d(str2, list, ".YFlurrySenderIndex.info.");
        }
        return zRemove;
    }

    /* renamed from: g */
    final void m13287g(String str) throws Throwable {
        List<String> listM13284b = m13284b(str);
        if (listM13284b == null) {
            C6021d1.m13039l("FlurryDataSenderIndex", "No old file to replace");
            return;
        }
        for (String str2 : listM13284b) {
            byte[] bArrM13281l = m13281l(str2);
            if (bArrM13281l == null) {
                C6021d1.m13030c(6, "FlurryDataSenderIndex", "File does not exist");
            } else {
                C6013c2.m12988d();
                C6021d1.m13030c(5, "FlurryDataSenderIndex", "Saving Block File for " + str2 + " file name:" + C6002b0.m12964a().getFileStreamPath(C6138q0.m13264a(str2)));
                C6138q0.m13265b(str2).m13012b(new C6138q0(bArrM13281l));
                C6013c2.m12988d();
                C6021d1.m13030c(5, "FlurryDataSenderIndex", "Deleting  block File for " + str2 + " file name:" + C6002b0.m12964a().getFileStreamPath(".flurrydatasenderblock.".concat(String.valueOf(str2))));
                File fileStreamPath = C6002b0.m12964a().getFileStreamPath(".flurrydatasenderblock.".concat(String.valueOf(str2)));
                if (fileStreamPath.exists()) {
                    C6021d1.m13030c(5, "FlurryDataSenderIndex", "Found file for " + str2 + ". Deleted - " + fileStreamPath.delete());
                }
            }
        }
        m13277d(str, listM13284b, ".YFlurrySenderIndex.info.");
        m13279h(str);
    }

    /* renamed from: j */
    final synchronized List<String> m13288j(String str) {
        C6013c2.m12988d();
        C6021d1.m13030c(5, "FlurryDataSenderIndex", "Reading Index File for " + str + " file name:" + C6002b0.m12964a().getFileStreamPath(m13280i(str)));
        List list = (List) new C6018c7(C6002b0.m12964a().getFileStreamPath(m13280i(str)), ".YFlurrySenderIndex.info.", 1, new b()).m13011a();
        if (list == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C6155s0) it.next()).f16315a);
        }
        return arrayList;
    }

    /* renamed from: k */
    public final List<String> m13289k(String str) {
        List<String> list = this.f16301c.get(str);
        return list == null ? Collections.emptyList() : new ArrayList(list);
    }
}
