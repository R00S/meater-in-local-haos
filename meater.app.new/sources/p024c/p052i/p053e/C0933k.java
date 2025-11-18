package p024c.p052i.p053e;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p024c.p052i.p057h.C0943f;

/* compiled from: TypefaceCompatUtil.java */
/* renamed from: c.i.e.k */
/* loaded from: classes.dex */
public class C0933k {
    /* renamed from: a */
    public static void m5957a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static ByteBuffer m5958b(Context context, Resources resources, int i2) {
        File fileM5961e = m5961e(context);
        if (fileM5961e == null) {
            return null;
        }
        try {
            if (m5959c(fileM5961e, resources, i2)) {
                return m5963g(fileM5961e);
            }
            return null;
        } finally {
            fileM5961e.delete();
        }
    }

    /* renamed from: c */
    public static boolean m5959c(File file, Resources resources, int i2) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i2);
        } catch (Throwable th) {
            th = th;
            inputStreamOpenRawResource = null;
        }
        try {
            boolean zM5960d = m5960d(file, inputStreamOpenRawResource);
            m5957a(inputStreamOpenRawResource);
            return zM5960d;
        } catch (Throwable th2) {
            th = th2;
            m5957a(inputStreamOpenRawResource);
            throw th;
        }
    }

    /* renamed from: d */
    public static boolean m5960d(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i2 = inputStream.read(bArr);
                        if (i2 == -1) {
                            m5957a(fileOutputStream2);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, i2);
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    m5957a(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    m5957a(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            e = e3;
        }
    }

    /* renamed from: e */
    public static File m5961e(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i2 = 0; i2 < 100; i2++) {
            File file = new File(cacheDir, str + i2);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static ByteBuffer m5962f(Context context, CancellationSignal cancellationSignal, Uri uri) throws IOException {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } finally {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable unused2) {
                }
            }
        } catch (IOException unused3) {
            return null;
        }
    }

    /* renamed from: g */
    private static ByteBuffer m5963g(File file) throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                return map;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    /* renamed from: h */
    public static Map<Uri, ByteBuffer> m5964h(Context context, C0943f.b[] bVarArr, CancellationSignal cancellationSignal) {
        HashMap map = new HashMap();
        for (C0943f.b bVar : bVarArr) {
            if (bVar.m6001b() == 0) {
                Uri uriM6003d = bVar.m6003d();
                if (!map.containsKey(uriM6003d)) {
                    map.put(uriM6003d, m5962f(context, cancellationSignal, uriM6003d));
                }
            }
        }
        return Collections.unmodifiableMap(map);
    }
}
