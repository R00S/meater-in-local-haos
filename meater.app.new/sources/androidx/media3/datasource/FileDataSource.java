package androidx.media3.datasource;

import X1.C1804a;
import X1.L;
import a2.AbstractC1884a;
import a2.g;
import a2.n;
import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.media3.datasource.a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class FileDataSource extends AbstractC1884a {

    /* renamed from: e, reason: collision with root package name */
    private RandomAccessFile f26132e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f26133f;

    /* renamed from: g, reason: collision with root package name */
    private long f26134g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f26135h;

    public static class FileDataSourceException extends DataSourceException {
        public FileDataSourceException(Throwable th, int i10) {
            super(th, i10);
        }

        public FileDataSourceException(String str, Throwable th, int i10) {
            super(str, th, i10);
        }
    }

    public static final class a implements a.InterfaceC0371a {

        /* renamed from: a, reason: collision with root package name */
        private n f26136a;

        @Override // androidx.media3.datasource.a.InterfaceC0371a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public FileDataSource a() {
            FileDataSource fileDataSource = new FileDataSource();
            n nVar = this.f26136a;
            if (nVar != null) {
                fileDataSource.g(nVar);
            }
            return fileDataSource;
        }
    }

    public FileDataSource() {
        super(false);
    }

    private static RandomAccessFile u(Uri uri) throws FileDataSourceException {
        try {
            return new RandomAccessFile((String) C1804a.e(uri.getPath()), "r");
        } catch (FileNotFoundException e10) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(e10, ((e10.getCause() instanceof ErrnoException) && ((ErrnoException) e10.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new FileDataSourceException(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e10, 1004);
        } catch (SecurityException e11) {
            throw new FileDataSourceException(e11, 2006);
        } catch (RuntimeException e12) {
            throw new FileDataSourceException(e12, 2000);
        }
    }

    @Override // androidx.media3.datasource.a
    public long c(g gVar) throws IOException {
        Uri uri = gVar.f19983a;
        this.f26133f = uri;
        s(gVar);
        RandomAccessFile randomAccessFileU = u(uri);
        this.f26132e = randomAccessFileU;
        try {
            randomAccessFileU.seek(gVar.f19989g);
            long length = gVar.f19990h;
            if (length == -1) {
                length = this.f26132e.length() - gVar.f19989g;
            }
            this.f26134g = length;
            if (length < 0) {
                throw new FileDataSourceException(null, null, 2008);
            }
            this.f26135h = true;
            t(gVar);
            return this.f26134g;
        } catch (IOException e10) {
            throw new FileDataSourceException(e10, 2000);
        }
    }

    @Override // androidx.media3.datasource.a
    public void close() {
        this.f26133f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f26132e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new FileDataSourceException(e10, 2000);
            }
        } finally {
            this.f26132e = null;
            if (this.f26135h) {
                this.f26135h = false;
                r();
            }
        }
    }

    @Override // androidx.media3.datasource.a
    public Uri d() {
        return this.f26133f;
    }

    @Override // U1.InterfaceC1734j
    public int e(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        if (this.f26134g == 0) {
            return -1;
        }
        try {
            int i12 = ((RandomAccessFile) L.i(this.f26132e)).read(bArr, i10, (int) Math.min(this.f26134g, i11));
            if (i12 > 0) {
                this.f26134g -= i12;
                q(i12);
            }
            return i12;
        } catch (IOException e10) {
            throw new FileDataSourceException(e10, 2000);
        }
    }
}
