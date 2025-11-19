package Lc;

import Fc.j;
import Fc.n;
import Gc.i;
import Gc.l;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;
import org.eclipse.paho.client.mqttv3.MqttPersistenceException;

/* compiled from: MqttDefaultFilePersistence.java */
/* loaded from: classes3.dex */
public class b implements j {

    /* renamed from: d, reason: collision with root package name */
    private static final FilenameFilter f11317d = new a();

    /* renamed from: a, reason: collision with root package name */
    private final File f11318a;

    /* renamed from: b, reason: collision with root package name */
    private File f11319b = null;

    /* renamed from: c, reason: collision with root package name */
    private i f11320c = null;

    /* compiled from: MqttDefaultFilePersistence.java */
    class a implements FilenameFilter {
        a() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.endsWith(".msg");
        }
    }

    /* compiled from: MqttDefaultFilePersistence.java */
    /* renamed from: Lc.b$b, reason: collision with other inner class name */
    class C0185b implements FileFilter {
        C0185b(b bVar) {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return file.getName().endsWith(".bup");
        }
    }

    public b(String str) {
        this.f11318a = new File(str);
    }

    private void f() throws MqttPersistenceException {
        if (this.f11319b == null) {
            throw new MqttPersistenceException();
        }
    }

    private File[] g() throws MqttPersistenceException {
        f();
        File[] fileArrListFiles = this.f11319b.listFiles(f11317d);
        if (fileArrListFiles != null) {
            return fileArrListFiles;
        }
        throw new MqttPersistenceException();
    }

    private boolean h(char c10) {
        return Character.isJavaIdentifierPart(c10) || c10 == '-';
    }

    private void i(File file) throws MqttPersistenceException {
        File[] fileArrListFiles = file.listFiles(new C0185b(this));
        if (fileArrListFiles == null) {
            throw new MqttPersistenceException();
        }
        for (int i10 = 0; i10 < fileArrListFiles.length; i10++) {
            File file2 = new File(file, fileArrListFiles[i10].getName().substring(0, fileArrListFiles[i10].getName().length() - 4));
            if (!fileArrListFiles[i10].renameTo(file2)) {
                file2.delete();
                fileArrListFiles[i10].renameTo(file2);
            }
        }
    }

    @Override // Fc.j
    public n a(String str) throws IOException, MqttPersistenceException {
        f();
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(this.f11319b, str + ".msg"));
            int iAvailable = fileInputStream.available();
            byte[] bArr = new byte[iAvailable];
            for (int i10 = 0; i10 < iAvailable; i10 += fileInputStream.read(bArr, i10, iAvailable - i10)) {
            }
            fileInputStream.close();
            return new l(str, bArr, 0, iAvailable, null, 0, 0);
        } catch (IOException e10) {
            throw new MqttPersistenceException(e10);
        }
    }

    @Override // Fc.j
    public void b(String str, n nVar) throws MqttPersistenceException {
        f();
        File file = new File(this.f11319b, str + ".msg");
        File file2 = new File(this.f11319b, str + ".msg.bup");
        if (file.exists() && !file.renameTo(file2)) {
            file2.delete();
            file.renameTo(file2);
        }
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(nVar.b(), nVar.c(), nVar.f());
                if (nVar.d() != null) {
                    fileOutputStream.write(nVar.d(), nVar.e(), nVar.a());
                }
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
                if (file2.exists()) {
                    file2.delete();
                }
                if (!file2.exists() || file2.renameTo(file)) {
                    return;
                }
                file.delete();
                file2.renameTo(file);
            } catch (IOException e10) {
                throw new MqttPersistenceException(e10);
            }
        } catch (Throwable th) {
            if (file2.exists() && !file2.renameTo(file)) {
                file.delete();
                file2.renameTo(file);
            }
            throw th;
        }
    }

    @Override // Fc.j
    public Enumeration c() throws MqttPersistenceException {
        f();
        File[] fileArrG = g();
        Vector vector = new Vector(fileArrG.length);
        for (File file : fileArrG) {
            vector.addElement(file.getName().substring(0, r4.length() - 4));
        }
        return vector.elements();
    }

    @Override // Fc.j
    public void clear() throws MqttPersistenceException {
        f();
        for (File file : g()) {
            file.delete();
        }
    }

    @Override // Fc.j
    public void close() {
        synchronized (this) {
            try {
                i iVar = this.f11320c;
                if (iVar != null) {
                    iVar.a();
                }
                if (g().length == 0) {
                    this.f11319b.delete();
                }
                this.f11319b = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Fc.j
    public void d(String str, String str2) throws MqttPersistenceException {
        if (this.f11318a.exists() && !this.f11318a.isDirectory()) {
            throw new MqttPersistenceException();
        }
        if (!this.f11318a.exists() && !this.f11318a.mkdirs()) {
            throw new MqttPersistenceException();
        }
        if (!this.f11318a.canWrite()) {
            throw new MqttPersistenceException();
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (h(cCharAt)) {
                stringBuffer.append(cCharAt);
            }
        }
        stringBuffer.append("-");
        for (int i11 = 0; i11 < str2.length(); i11++) {
            char cCharAt2 = str2.charAt(i11);
            if (h(cCharAt2)) {
                stringBuffer.append(cCharAt2);
            }
        }
        synchronized (this) {
            if (this.f11319b == null) {
                File file = new File(this.f11318a, stringBuffer.toString());
                this.f11319b = file;
                if (!file.exists()) {
                    this.f11319b.mkdir();
                }
            }
            try {
                this.f11320c = new i(this.f11319b, ".lck");
            } catch (Exception unused) {
            }
            i(this.f11319b);
        }
    }

    @Override // Fc.j
    public boolean e(String str) throws MqttPersistenceException {
        f();
        return new File(this.f11319b, str + ".msg").exists();
    }

    @Override // Fc.j
    public void remove(String str) throws MqttPersistenceException {
        f();
        File file = new File(this.f11319b, str + ".msg");
        if (file.exists()) {
            file.delete();
        }
    }
}
