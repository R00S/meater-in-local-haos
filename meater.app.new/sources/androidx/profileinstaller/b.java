package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.f;
import com.apptionlabs.meater_app.data.Config;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;

/* compiled from: DeviceProfileWriter.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final AssetManager f28441a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f28442b;

    /* renamed from: c, reason: collision with root package name */
    private final f.c f28443c;

    /* renamed from: e, reason: collision with root package name */
    private final File f28445e;

    /* renamed from: f, reason: collision with root package name */
    private final String f28446f;

    /* renamed from: g, reason: collision with root package name */
    private final String f28447g;

    /* renamed from: h, reason: collision with root package name */
    private final String f28448h;

    /* renamed from: j, reason: collision with root package name */
    private c[] f28450j;

    /* renamed from: k, reason: collision with root package name */
    private byte[] f28451k;

    /* renamed from: i, reason: collision with root package name */
    private boolean f28449i = false;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f28444d = d();

    public b(AssetManager assetManager, Executor executor, f.c cVar, String str, String str2, String str3, File file) {
        this.f28441a = assetManager;
        this.f28442b = executor;
        this.f28443c = cVar;
        this.f28446f = str;
        this.f28447g = str2;
        this.f28448h = str3;
        this.f28445e = file;
    }

    private b b(c[] cVarArr, byte[] bArr) throws IOException {
        InputStream inputStreamH;
        try {
            inputStreamH = h(this.f28441a, this.f28448h);
        } catch (FileNotFoundException e10) {
            this.f28443c.b(9, e10);
        } catch (IOException e11) {
            this.f28443c.b(7, e11);
        } catch (IllegalStateException e12) {
            this.f28450j = null;
            this.f28443c.b(8, e12);
        }
        if (inputStreamH == null) {
            if (inputStreamH != null) {
                inputStreamH.close();
            }
            return null;
        }
        try {
            this.f28450j = g.r(inputStreamH, g.p(inputStreamH, g.f28471b), bArr, cVarArr);
            inputStreamH.close();
            return this;
        } catch (Throwable th) {
            try {
                inputStreamH.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private void c() {
        if (!this.f28449i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return i.f28483a;
        }
        switch (i10) {
            case 26:
                return i.f28486d;
            case 27:
                return i.f28485c;
            case 28:
            case 29:
            case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
                return i.f28484b;
            default:
                return null;
        }
    }

    private InputStream f(AssetManager assetManager) {
        try {
            return h(assetManager, this.f28447g);
        } catch (FileNotFoundException e10) {
            this.f28443c.b(6, e10);
            return null;
        } catch (IOException e11) {
            this.f28443c.b(7, e11);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(int i10, Object obj) {
        this.f28443c.b(i10, obj);
    }

    private InputStream h(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f28443c.a(5, null);
            }
            return null;
        }
    }

    private c[] j(InputStream inputStream) throws IOException {
        try {
            try {
                try {
                    try {
                        c[] cVarArrX = g.x(inputStream, g.p(inputStream, g.f28470a), this.f28446f);
                        try {
                            inputStream.close();
                            return cVarArrX;
                        } catch (IOException e10) {
                            this.f28443c.b(7, e10);
                            return cVarArrX;
                        }
                    } catch (IOException e11) {
                        this.f28443c.b(7, e11);
                        inputStream.close();
                        return null;
                    }
                } catch (IllegalStateException e12) {
                    this.f28443c.b(8, e12);
                    inputStream.close();
                    return null;
                }
            } catch (IOException e13) {
                this.f28443c.b(7, e13);
                return null;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e14) {
                this.f28443c.b(7, e14);
            }
            throw th;
        }
    }

    private static boolean k() {
        return Build.VERSION.SDK_INT >= 31;
    }

    private void l(final int i10, final Object obj) {
        this.f28442b.execute(new Runnable() { // from class: p3.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f47416B.g(i10, obj);
            }
        });
    }

    public boolean e() {
        if (this.f28444d == null) {
            l(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f28445e.exists()) {
            try {
                if (!this.f28445e.createNewFile()) {
                    l(4, null);
                    return false;
                }
            } catch (IOException unused) {
                l(4, null);
                return false;
            }
        } else if (!this.f28445e.canWrite()) {
            l(4, null);
            return false;
        }
        this.f28449i = true;
        return true;
    }

    public b i() {
        b bVarB;
        c();
        if (this.f28444d == null) {
            return this;
        }
        InputStream inputStreamF = f(this.f28441a);
        if (inputStreamF != null) {
            this.f28450j = j(inputStreamF);
        }
        c[] cVarArr = this.f28450j;
        return (cVarArr == null || !k() || (bVarB = b(cVarArr, this.f28444d)) == null) ? this : bVarB;
    }

    public b m() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        c[] cVarArr = this.f28450j;
        byte[] bArr = this.f28444d;
        if (cVarArr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (IOException e10) {
                this.f28443c.b(7, e10);
            } catch (IllegalStateException e11) {
                this.f28443c.b(8, e11);
            }
            try {
                g.F(byteArrayOutputStream, bArr);
                if (!g.C(byteArrayOutputStream, bArr, cVarArr)) {
                    this.f28443c.b(5, null);
                    this.f28450j = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.f28451k = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.f28450j = null;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return this;
    }

    public boolean n() {
        byte[] bArr = this.f28451k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f28445e);
                    try {
                        FileChannel channel = fileOutputStream.getChannel();
                        try {
                            FileLock fileLockTryLock = channel.tryLock();
                            try {
                                d.l(byteArrayInputStream, fileOutputStream, fileLockTryLock);
                                l(1, null);
                                if (fileLockTryLock != null) {
                                    fileLockTryLock.close();
                                }
                                channel.close();
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                return true;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e10) {
                l(6, e10);
                return false;
            } catch (IOException e11) {
                l(7, e11);
                return false;
            }
        } finally {
            this.f28451k = null;
            this.f28450j = null;
        }
    }
}
