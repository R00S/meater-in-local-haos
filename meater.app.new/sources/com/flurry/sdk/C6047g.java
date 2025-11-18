package com.flurry.sdk;

import android.text.TextUtils;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import okhttp3.HttpUrl;

/* renamed from: com.flurry.sdk.g */
/* loaded from: classes2.dex */
public final class C6047g {

    /* renamed from: a */
    String f15883a;

    /* renamed from: b */
    final Set<String> f15884b;

    /* renamed from: com.flurry.sdk.g$a */
    final class a implements FilenameFilter {
        a() {
        }

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(".flurryagent.");
        }
    }

    C6047g() {
        HashSet hashSet = new HashSet();
        hashSet.add(HttpUrl.FRAGMENT_ENCODE_SET);
        hashSet.add(null);
        hashSet.add("null");
        hashSet.add("9774d56d682e549c");
        hashSet.add("dead00beef");
        this.f15884b = Collections.unmodifiableSet(hashSet);
        this.f15883a = HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* renamed from: a */
    static String m13062a() throws IOException {
        DataInputStream dataInputStream;
        File fileStreamPath = C6002b0.m12964a().getFileStreamPath(".flurryb.");
        String utf = null;
        if (fileStreamPath == null || !fileStreamPath.exists()) {
            return null;
        }
        try {
            dataInputStream = new DataInputStream(new FileInputStream(fileStreamPath));
        } catch (Throwable th) {
            th = th;
            dataInputStream = null;
        }
        try {
            if (1 == dataInputStream.readInt()) {
                utf = dataInputStream.readUTF();
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                C6021d1.m13031d(6, "DeviceIdProvider", "Error when loading deviceId", th);
                return utf;
            } finally {
                C6013c2.m12990f(dataInputStream);
            }
        }
        return utf;
    }

    /* renamed from: b */
    static void m13063b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File fileStreamPath = C6002b0.m12964a().getFileStreamPath(".flurryb.");
        if (!C6004b2.m12968b(fileStreamPath)) {
            return;
        }
        DataOutputStream dataOutputStream = null;
        try {
            DataOutputStream dataOutputStream2 = new DataOutputStream(new FileOutputStream(fileStreamPath));
            try {
                dataOutputStream2.writeInt(1);
                dataOutputStream2.writeUTF(str);
                C6013c2.m12990f(dataOutputStream2);
            } catch (Throwable th) {
                th = th;
                dataOutputStream = dataOutputStream2;
                try {
                    C6021d1.m13031d(6, "DeviceIdProvider", "Error when saving deviceId", th);
                } finally {
                    C6013c2.m12990f(dataOutputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: c */
    final String m13064c() throws IOException {
        String[] list;
        DataInputStream dataInputStream;
        File filesDir = C6002b0.m12964a().getFilesDir();
        String utf = null;
        if (filesDir != null && (list = filesDir.list(new a())) != null && list.length != 0) {
            File fileStreamPath = C6002b0.m12964a().getFileStreamPath(list[0]);
            if (fileStreamPath != null && fileStreamPath.exists()) {
                try {
                    dataInputStream = new DataInputStream(new FileInputStream(fileStreamPath));
                } catch (Throwable th) {
                    th = th;
                    dataInputStream = null;
                }
                try {
                    if (46586 == dataInputStream.readUnsignedShort() && 2 == dataInputStream.readUnsignedShort()) {
                        dataInputStream.readUTF();
                        utf = dataInputStream.readUTF();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        C6021d1.m13031d(6, "DeviceIdProvider", "Error when loading deviceId", th);
                        return utf;
                    } finally {
                        C6013c2.m12990f(dataInputStream);
                    }
                }
                return utf;
            }
        }
        return null;
    }
}
