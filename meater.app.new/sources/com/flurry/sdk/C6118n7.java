package com.flurry.sdk;

import com.google.android.gms.ads.AdRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: com.flurry.sdk.n7 */
/* loaded from: classes2.dex */
public final class C6118n7 {

    /* renamed from: a */
    private static final char[] f16183a;

    /* renamed from: b */
    private static final String f16184b;

    /* renamed from: c */
    private static final int f16185c;

    /* renamed from: d */
    private static final int f16186d;

    /* renamed from: e */
    private static final int f16187e;

    /* renamed from: f */
    private static final int f16188f;

    /* renamed from: g */
    private short f16189g;

    /* renamed from: h */
    private boolean f16190h;

    /* renamed from: i */
    public ByteBuffer f16191i;

    static {
        char[] cArr = {'F', 'C', 'B', 'M'};
        f16183a = cArr;
        f16184b = new String(cArr);
        f16185c = (cArr.length * 2) + 2 + 1 + 105984;
        int length = cArr.length * 2;
        f16186d = length;
        int i2 = length + 2;
        f16187e = i2;
        f16188f = i2 + 1;
    }

    C6118n7() {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(f16185c);
        this.f16191i = byteBufferAllocateDirect;
        byteBufferAllocateDirect.asCharBuffer().put(f16183a);
    }

    /* renamed from: a */
    private C6109m7 m13209a(int i2) {
        this.f16191i.position(f16188f + (i2 * AdRequest.MAX_CONTENT_URL_LENGTH));
        return new C6109m7(this.f16191i.asCharBuffer().limit(this.f16191i.getInt()).toString(), this.f16191i.getLong());
    }

    /* renamed from: c */
    public static int m13210c() {
        return 1;
    }

    /* renamed from: b */
    public final List<C6109m7> m13211b() {
        ArrayList arrayList = new ArrayList();
        if (this.f16191i == null) {
            return arrayList;
        }
        if (this.f16190h) {
            for (int i2 = this.f16189g; i2 < 207; i2++) {
                arrayList.add(m13209a(i2));
            }
        }
        for (int i3 = 0; i3 < this.f16189g; i3++) {
            arrayList.add(m13209a(i3));
        }
        return arrayList;
    }

    public final synchronized String toString() {
        StringBuilder sb;
        short s = this.f16191i == null ? (short) 0 : this.f16190h ? (short) 207 : this.f16189g;
        sb = new StringBuilder();
        sb.append("Total number of breadcrumbs: " + ((int) s) + "\n");
        Iterator<C6109m7> it = m13211b().iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
        }
        return sb.toString();
    }

    public C6118n7(File file) throws IOException {
        int i2;
        C6021d1.m13030c(6, "com.flurry.android.common.newProviders.errorCrashBreadcrumbsManager", String.format(Locale.getDefault(), "YCrashBreadcrumbs from %s", file.getAbsolutePath()));
        this.f16191i = ByteBuffer.allocate(f16185c);
        if (file.length() != this.f16191i.capacity()) {
            C6021d1.m13030c(6, "com.flurry.android.common.newProviders.errorCrashBreadcrumbsManager", String.format(Locale.getDefault(), "Crash breadcrumbs invalid file length %s != %s", Long.valueOf(file.length()), Integer.valueOf(this.f16191i.capacity())));
            this.f16191i = null;
            return;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileChannel channel = fileInputStream.getChannel();
            try {
                i2 = channel.read(this.f16191i);
            } catch (IOException unused) {
                C6021d1.m13030c(6, "com.flurry.android.common.newProviders.errorCrashBreadcrumbsManager", "Issue reading breadcrumbs from file.");
                i2 = 0;
            }
            C6013c2.m12990f(channel);
            C6013c2.m12990f(fileInputStream);
            if (i2 != this.f16191i.capacity()) {
                C6021d1.m13030c(6, "com.flurry.android.common.newProviders.errorCrashBreadcrumbsManager", String.format(Locale.getDefault(), "YCrashBreadcrumbs unexpected read size %s != %s", Integer.valueOf(i2), Integer.valueOf(this.f16191i.capacity())));
                this.f16191i = null;
                return;
            }
            this.f16191i.position(0);
            String string = this.f16191i.asCharBuffer().limit(f16183a.length).toString();
            if (!string.equals(f16184b)) {
                C6021d1.m13030c(6, "com.flurry.android.common.newProviders.errorCrashBreadcrumbsManager", String.format(Locale.getDefault(), "YCrashBreadcrumbs invalid magic string: '%s'", string));
                this.f16191i = null;
                return;
            }
            short s = this.f16191i.getShort(f16186d);
            this.f16189g = s;
            if (s >= 0 && s < 207) {
                this.f16190h = this.f16191i.get(f16187e) == 1;
            } else {
                C6021d1.m13030c(6, "com.flurry.android.common.newProviders.errorCrashBreadcrumbsManager", String.format(Locale.getDefault(), "YCrashBreadcrumbs invalid index: '%s'", Short.valueOf(this.f16189g)));
                this.f16191i = null;
            }
        } catch (FileNotFoundException unused2) {
            C6021d1.m13030c(6, "com.flurry.android.common.newProviders.errorCrashBreadcrumbsManager", "Issue reading breadcrumbs file.");
            this.f16191i = null;
        }
    }
}
