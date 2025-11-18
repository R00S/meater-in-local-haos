package com.google.firebase.installations;

import android.util.Log;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* compiled from: CrossProcessLock.java */
/* renamed from: com.google.firebase.installations.g */
/* loaded from: classes2.dex */
class C8383g {

    /* renamed from: a */
    private final FileChannel f31791a;

    /* renamed from: b */
    private final FileLock f31792b;

    private C8383g(FileChannel fileChannel, FileLock fileLock) {
        this.f31791a = fileChannel;
        this.f31792b = fileLock;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.google.firebase.installations.C8383g m26252a(android.content.Context r4, java.lang.String r5) throws java.io.IOException {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L2c java.lang.Error -> L2e java.io.IOException -> L30
            java.io.File r4 = r4.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L2c java.lang.Error -> L2e java.io.IOException -> L30
            r1.<init>(r4, r5)     // Catch: java.nio.channels.OverlappingFileLockException -> L2c java.lang.Error -> L2e java.io.IOException -> L30
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L2c java.lang.Error -> L2e java.io.IOException -> L30
            java.lang.String r5 = "rw"
            r4.<init>(r1, r5)     // Catch: java.nio.channels.OverlappingFileLockException -> L2c java.lang.Error -> L2e java.io.IOException -> L30
            java.nio.channels.FileChannel r4 = r4.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L2c java.lang.Error -> L2e java.io.IOException -> L30
            java.nio.channels.FileLock r5 = r4.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L25 java.lang.Error -> L27 java.io.IOException -> L29
            com.google.firebase.installations.g r1 = new com.google.firebase.installations.g     // Catch: java.nio.channels.OverlappingFileLockException -> L1f java.lang.Error -> L21 java.io.IOException -> L23
            r1.<init>(r4, r5)     // Catch: java.nio.channels.OverlappingFileLockException -> L1f java.lang.Error -> L21 java.io.IOException -> L23
            return r1
        L1f:
            r1 = move-exception
            goto L33
        L21:
            r1 = move-exception
            goto L33
        L23:
            r1 = move-exception
            goto L33
        L25:
            r1 = move-exception
            goto L2a
        L27:
            r1 = move-exception
            goto L2a
        L29:
            r1 = move-exception
        L2a:
            r5 = r0
            goto L33
        L2c:
            r1 = move-exception
            goto L31
        L2e:
            r1 = move-exception
            goto L31
        L30:
            r1 = move-exception
        L31:
            r4 = r0
            r5 = r4
        L33:
            java.lang.String r2 = "CrossProcessLock"
            java.lang.String r3 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r2, r3, r1)
            if (r5 == 0) goto L41
            r5.release()     // Catch: java.io.IOException -> L40
            goto L41
        L40:
        L41:
            if (r4 == 0) goto L46
            r4.close()     // Catch: java.io.IOException -> L46
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C8383g.m26252a(android.content.Context, java.lang.String):com.google.firebase.installations.g");
    }

    /* renamed from: b */
    void m26253b() throws IOException {
        try {
            this.f31792b.release();
            this.f31791a.close();
        } catch (IOException e2) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e2);
        }
    }
}
