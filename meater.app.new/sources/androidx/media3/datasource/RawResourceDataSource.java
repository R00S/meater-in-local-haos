package androidx.media3.datasource;

import X1.C1804a;
import X1.L;
import a2.AbstractC1884a;
import a2.g;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;

/* loaded from: classes.dex */
public final class RawResourceDataSource extends AbstractC1884a {

    /* renamed from: e, reason: collision with root package name */
    private final Context f26144e;

    /* renamed from: f, reason: collision with root package name */
    private g f26145f;

    /* renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f26146g;

    /* renamed from: h, reason: collision with root package name */
    private InputStream f26147h;

    /* renamed from: i, reason: collision with root package name */
    private long f26148i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f26149j;

    public static class RawResourceDataSourceException extends DataSourceException {
        @Deprecated
        public RawResourceDataSourceException(String str) {
            super(str, null, 2000);
        }

        public RawResourceDataSourceException(String str, Throwable th, int i10) {
            super(str, th, i10);
        }
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.f26144e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    private static AssetFileDescriptor u(Context context, g gVar) throws Resources.NotFoundException, PackageManager.NameNotFoundException, RawResourceDataSourceException {
        Resources resourcesForApplication;
        int identifier;
        Uri uriNormalizeScheme = gVar.f19983a.normalizeScheme();
        if (TextUtils.equals("rawresource", uriNormalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new RawResourceDataSourceException("rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            identifier = v(pathSegments.get(0));
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new RawResourceDataSourceException("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String strSubstring = (String) C1804a.e(uriNormalizeScheme.getPath());
            if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new RawResourceDataSourceException("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e10, 2005);
                }
            }
            if (strSubstring.matches("\\d+")) {
                identifier = v(strSubstring);
            } else {
                identifier = resourcesForApplication.getIdentifier(packageName + ":" + strSubstring, "raw", null);
                if (identifier == 0) {
                    throw new RawResourceDataSourceException("Resource not found.", null, 2005);
                }
            }
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (assetFileDescriptorOpenRawResourceFd != null) {
                return assetFileDescriptorOpenRawResourceFd;
            }
            throw new RawResourceDataSourceException("Resource is compressed: " + uriNormalizeScheme, null, 2000);
        } catch (Resources.NotFoundException e11) {
            throw new RawResourceDataSourceException(null, e11, 2005);
        }
    }

    private static int v(String str) throws RawResourceDataSourceException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
        }
    }

    @Override // androidx.media3.datasource.a
    public long c(g gVar) throws DataSourceException, Resources.NotFoundException, PackageManager.NameNotFoundException {
        this.f26145f = gVar;
        s(gVar);
        AssetFileDescriptor assetFileDescriptorU = u(this.f26144e, gVar);
        this.f26146g = assetFileDescriptorU;
        long length = assetFileDescriptorU.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.f26146g.getFileDescriptor());
        this.f26147h = fileInputStream;
        if (length != -1) {
            try {
                if (gVar.f19989g > length) {
                    throw new RawResourceDataSourceException(null, null, 2008);
                }
            } catch (RawResourceDataSourceException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RawResourceDataSourceException(null, e11, 2000);
            }
        }
        long startOffset = this.f26146g.getStartOffset();
        long jSkip = fileInputStream.skip(gVar.f19989g + startOffset) - startOffset;
        if (jSkip != gVar.f19989g) {
            throw new RawResourceDataSourceException(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.f26148i = -1L;
            } else {
                long size = channel.size() - channel.position();
                this.f26148i = size;
                if (size < 0) {
                    throw new RawResourceDataSourceException(null, null, 2008);
                }
            }
        } else {
            long j10 = length - jSkip;
            this.f26148i = j10;
            if (j10 < 0) {
                throw new DataSourceException(2008);
            }
        }
        long jMin = gVar.f19990h;
        if (jMin != -1) {
            long j11 = this.f26148i;
            if (j11 != -1) {
                jMin = Math.min(j11, jMin);
            }
            this.f26148i = jMin;
        }
        this.f26149j = true;
        t(gVar);
        long j12 = gVar.f19990h;
        return j12 != -1 ? j12 : this.f26148i;
    }

    @Override // androidx.media3.datasource.a
    public void close() {
        this.f26145f = null;
        try {
            try {
                InputStream inputStream = this.f26147h;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f26147h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f26146g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new RawResourceDataSourceException(null, e10, 2000);
                    }
                } finally {
                    this.f26146g = null;
                    if (this.f26149j) {
                        this.f26149j = false;
                        r();
                    }
                }
            } catch (Throwable th) {
                this.f26147h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f26146g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f26146g = null;
                        if (this.f26149j) {
                            this.f26149j = false;
                            r();
                        }
                        throw th;
                    } finally {
                        this.f26146g = null;
                        if (this.f26149j) {
                            this.f26149j = false;
                            r();
                        }
                    }
                } catch (IOException e11) {
                    throw new RawResourceDataSourceException(null, e11, 2000);
                }
            }
        } catch (IOException e12) {
            throw new RawResourceDataSourceException(null, e12, 2000);
        }
    }

    @Override // androidx.media3.datasource.a
    public Uri d() {
        g gVar = this.f26145f;
        if (gVar != null) {
            return gVar.f19983a;
        }
        return null;
    }

    @Override // U1.InterfaceC1734j
    public int e(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f26148i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new RawResourceDataSourceException(null, e10, 2000);
            }
        }
        int i12 = ((InputStream) L.i(this.f26147h)).read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f26148i == -1) {
                return -1;
            }
            throw new RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j11 = this.f26148i;
        if (j11 != -1) {
            this.f26148i = j11 - i12;
        }
        q(i12);
        return i12;
    }
}
