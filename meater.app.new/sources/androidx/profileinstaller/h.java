package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* compiled from: ProfileVerifier.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final androidx.concurrent.futures.d<c> f28472a = androidx.concurrent.futures.d.H();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f28473b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static c f28474c = null;

    /* compiled from: ProfileVerifier.java */
    private static class a {
        static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* compiled from: ProfileVerifier.java */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        final int f28475a;

        /* renamed from: b, reason: collision with root package name */
        final int f28476b;

        /* renamed from: c, reason: collision with root package name */
        final long f28477c;

        /* renamed from: d, reason: collision with root package name */
        final long f28478d;

        b(int i10, int i11, long j10, long j11) {
            this.f28475a = i10;
            this.f28476b = i11;
            this.f28477c = j10;
            this.f28478d = j11;
        }

        static b a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        void b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f28475a);
                dataOutputStream.writeInt(this.f28476b);
                dataOutputStream.writeLong(this.f28477c);
                dataOutputStream.writeLong(this.f28478d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f28476b == bVar.f28476b && this.f28477c == bVar.f28477c && this.f28475a == bVar.f28475a && this.f28478d == bVar.f28478d;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f28476b), Long.valueOf(this.f28477c), Integer.valueOf(this.f28475a), Long.valueOf(this.f28478d));
        }
    }

    /* compiled from: ProfileVerifier.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        final int f28479a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f28480b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f28481c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f28482d;

        c(int i10, boolean z10, boolean z11, boolean z12) {
            this.f28479a = i10;
            this.f28481c = z11;
            this.f28480b = z10;
            this.f28482d = z12;
        }
    }

    private static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    private static c b(int i10, boolean z10, boolean z11, boolean z12) {
        c cVar = new c(i10, z10, z11, z12);
        f28474c = cVar;
        f28472a.D(cVar);
        return f28474c;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static androidx.profileinstaller.h.c c(android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.h.c(android.content.Context, boolean):androidx.profileinstaller.h$c");
    }
}
