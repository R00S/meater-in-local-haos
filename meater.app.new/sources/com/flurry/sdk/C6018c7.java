package com.flurry.sdk;

import java.io.File;

/* renamed from: com.flurry.sdk.c7 */
/* loaded from: classes2.dex */
public final class C6018c7<T> {

    /* renamed from: a */
    private final File f15740a;

    /* renamed from: b */
    private final InterfaceC6180v1<T> f15741b;

    public C6018c7(File file, String str, int i2, InterfaceC6204y1<T> interfaceC6204y1) {
        this.f15740a = file;
        this.f15741b = new C6164t1(new C6196x1(str, i2, interfaceC6204y1));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T m13011a() throws java.lang.Throwable {
        /*
            r7 = this;
            java.io.File r0 = r7.f15740a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r0.exists()
            java.lang.String r2 = "VersionedDataFile"
            if (r0 != 0) goto L27
            r0 = 5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "No data to read for file:"
            r3.<init>(r4)
            java.io.File r4 = r7.f15740a
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.flurry.sdk.C6021d1.m13030c(r0, r2, r3)
            return r1
        L27:
            r0 = 0
            r3 = 3
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            java.io.File r5 = r7.f15740a     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            com.flurry.sdk.v1<T> r5 = r7.f15741b     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L78
            java.lang.Object r1 = r5.mo13096b(r4)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L78
        L36:
            com.flurry.sdk.C6013c2.m12990f(r4)
            goto L59
        L3a:
            r0 = move-exception
            goto L40
        L3c:
            r0 = move-exception
            goto L7a
        L3e:
            r0 = move-exception
            r4 = r1
        L40:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L78
            java.lang.String r6 = "Error reading data file:"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L78
            java.io.File r6 = r7.f15740a     // Catch: java.lang.Throwable -> L78
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L78
            r5.append(r6)     // Catch: java.lang.Throwable -> L78
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L78
            com.flurry.sdk.C6021d1.m13031d(r3, r2, r5, r0)     // Catch: java.lang.Throwable -> L78
            r0 = 1
            goto L36
        L59:
            if (r0 == 0) goto L77
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "Deleting data file:"
            r0.<init>(r4)
            java.io.File r4 = r7.f15740a
            java.lang.String r4 = r4.getName()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.flurry.sdk.C6021d1.m13030c(r3, r2, r0)
            java.io.File r0 = r7.f15740a
            r0.delete()
        L77:
            return r1
        L78:
            r0 = move-exception
            r1 = r4
        L7a:
            com.flurry.sdk.C6013c2.m12990f(r1)
            goto L7f
        L7e:
            throw r0
        L7f:
            goto L7e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C6018c7.m13011a():java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m13012b(T r6) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.String r0 = "VersionedDataFile"
            r1 = 3
            r2 = 0
            java.io.File r3 = r5.f15740a     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            boolean r3 = com.flurry.sdk.C6004b2.m12968b(r3)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            if (r3 == 0) goto L23
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            java.io.File r4 = r5.f15740a     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            com.flurry.sdk.v1<T> r2 = r5.f15741b     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            r2.mo13095a(r3, r6)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            com.flurry.sdk.C6013c2.m12990f(r3)
            r6 = 0
            goto L49
        L1d:
            r6 = move-exception
            r2 = r3
            goto L68
        L20:
            r6 = move-exception
            r2 = r3
            goto L2e
        L23:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            java.lang.String r3 = "Cannot create parent directory!"
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            throw r6     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
        L2b:
            r6 = move-exception
            goto L68
        L2d:
            r6 = move-exception
        L2e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
            java.lang.String r4 = "Error writing data file:"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2b
            java.io.File r4 = r5.f15740a     // Catch: java.lang.Throwable -> L2b
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L2b
            r3.append(r4)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2b
            com.flurry.sdk.C6021d1.m13031d(r1, r0, r3, r6)     // Catch: java.lang.Throwable -> L2b
            r6 = 1
            com.flurry.sdk.C6013c2.m12990f(r2)
        L49:
            if (r6 == 0) goto L67
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "Deleting data file:"
            r6.<init>(r2)
            java.io.File r2 = r5.f15740a
            java.lang.String r2 = r2.getName()
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            com.flurry.sdk.C6021d1.m13030c(r1, r0, r6)
            java.io.File r6 = r5.f15740a
            r6.delete()
        L67:
            return
        L68:
            com.flurry.sdk.C6013c2.m12990f(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C6018c7.m13012b(java.lang.Object):void");
    }

    /* renamed from: c */
    public final boolean m13013c() {
        File file = this.f15740a;
        if (file == null) {
            return false;
        }
        return file.delete();
    }
}
