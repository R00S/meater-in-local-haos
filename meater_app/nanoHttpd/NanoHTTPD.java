package com.apptionlabs.meater_app.nanoHttpd;

import com.apptionlabs.meater_app.data.Temperature;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;

/* loaded from: /tmp/meat/meat/classes.dex */
public abstract class NanoHTTPD {

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f9624h = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;]*)['|\"]?", 2);

    /* renamed from: i, reason: collision with root package name */
    private static final Pattern f9625i = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;]*)['|\"]?", 2);

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f9626j = Pattern.compile("([ |\t]*Content-Disposition[ |\t]*:)(.*)", 2);

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f9627k = Pattern.compile("([ |\t]*content-type[ |\t]*:)(.*)", 2);

    /* renamed from: l, reason: collision with root package name */
    private static final Pattern f9628l = Pattern.compile("[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]");

    /* renamed from: m, reason: collision with root package name */
    private static final Logger f9629m = Logger.getLogger(NanoHTTPD.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final String f9630a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9631b;

    /* renamed from: c, reason: collision with root package name */
    private volatile ServerSocket f9632c;

    /* renamed from: d, reason: collision with root package name */
    private o f9633d;

    /* renamed from: e, reason: collision with root package name */
    private Thread f9634e;

    /* renamed from: f, reason: collision with root package name */
    protected a f9635f;

    /* renamed from: g, reason: collision with root package name */
    private r f9636g;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class ResponseException extends Exception {

        /* renamed from: q, reason: collision with root package name */
        private final m.c f9637q;

        public ResponseException(m.c cVar, String str) {
            super(str);
            this.f9637q = cVar;
        }

        public m.c a() {
            return this.f9637q;
        }

        public ResponseException(m.c cVar, String str, Exception exc) {
            super(str, exc);
            this.f9637q = cVar;
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public interface a {
        void a();

        void b(b bVar);

        void c(b bVar);
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public class b implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        private final InputStream f9638q;

        /* renamed from: r, reason: collision with root package name */
        private final Socket f9639r;

        public void a() {
            NanoHTTPD.s(this.f9638q);
            NanoHTTPD.s(this.f9639r);
        }

        @Override // java.lang.Runnable
        public void run() {
            OutputStream outputStream = null;
            try {
                try {
                    outputStream = this.f9639r.getOutputStream();
                    this.f9639r.setSendBufferSize(512);
                    j jVar = new j(NanoHTTPD.this.f9636g.a(), this.f9638q, outputStream, this.f9639r.getInetAddress());
                    while (!this.f9639r.isClosed()) {
                        jVar.j();
                    }
                } catch (Exception e10) {
                    if ((!(e10 instanceof SocketException) || !"NanoHttpd Shutdown".equals(e10.getMessage())) && !(e10 instanceof SocketTimeoutException)) {
                        NanoHTTPD.f9629m.log(Level.FINE, "Communication with the client broken", (Throwable) e10);
                    }
                }
            } finally {
                NanoHTTPD.s(outputStream);
                NanoHTTPD.s(this.f9638q);
                NanoHTTPD.s(this.f9639r);
                NanoHTTPD.this.f9635f.c(this);
            }
        }

        private b(InputStream inputStream, Socket socket) {
            this.f9638q = inputStream;
            this.f9639r = socket;
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f9641a;

        /* renamed from: b, reason: collision with root package name */
        private final String f9642b;

        /* renamed from: c, reason: collision with root package name */
        private final String f9643c;

        public String a() {
            return String.format("%s=%s; expires=%s", this.f9641a, this.f9642b, this.f9643c);
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public class d implements Iterable<String> {

        /* renamed from: q, reason: collision with root package name */
        private final HashMap<String, String> f9644q = new HashMap<>();

        /* renamed from: r, reason: collision with root package name */
        private final ArrayList<c> f9645r = new ArrayList<>();

        public d(NanoHTTPD nanoHTTPD, Map<String, String> map) {
            String str = map.get("cookie");
            if (str != null) {
                for (String str2 : str.split(";")) {
                    String[] split = str2.trim().split("=");
                    if (split.length == 2) {
                        this.f9644q.put(split[0], split[1]);
                    }
                }
            }
        }

        public void a(m mVar) {
            Iterator<c> it = this.f9645r.iterator();
            while (it.hasNext()) {
                mVar.a("Set-Cookie", it.next().a());
            }
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return this.f9644q.keySet().iterator();
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static class e implements a {

        /* renamed from: a, reason: collision with root package name */
        private long f9646a;

        /* renamed from: b, reason: collision with root package name */
        private final List<b> f9647b = Collections.synchronizedList(new ArrayList());

        @Override // com.apptionlabs.meater_app.nanoHttpd.NanoHTTPD.a
        public void a() {
            Iterator it = new ArrayList(this.f9647b).iterator();
            while (it.hasNext()) {
                ((b) it.next()).a();
            }
        }

        @Override // com.apptionlabs.meater_app.nanoHttpd.NanoHTTPD.a
        public void b(b bVar) {
            this.f9646a++;
            Thread thread = new Thread(bVar);
            thread.setDaemon(true);
            thread.setName("NanoHttpd Request Processor (#" + this.f9646a + ")");
            this.f9647b.add(bVar);
            thread.start();
        }

        @Override // com.apptionlabs.meater_app.nanoHttpd.NanoHTTPD.a
        public void c(b bVar) {
            this.f9647b.remove(bVar);
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static class f implements o {
        @Override // com.apptionlabs.meater_app.nanoHttpd.NanoHTTPD.o
        public ServerSocket a() {
            return new ServerSocket();
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static class g implements p {

        /* renamed from: a, reason: collision with root package name */
        private final File f9648a;

        /* renamed from: b, reason: collision with root package name */
        private final OutputStream f9649b;

        public g(File file) {
            File createTempFile = File.createTempFile("NanoHTTPD-", "", file);
            this.f9648a = createTempFile;
            this.f9649b = new FileOutputStream(createTempFile);
        }

        @Override // com.apptionlabs.meater_app.nanoHttpd.NanoHTTPD.p
        public void a() {
            NanoHTTPD.s(this.f9649b);
            if (this.f9648a.delete()) {
            } else {
                throw new Exception("could not delete temporary file");
            }
        }

        @Override // com.apptionlabs.meater_app.nanoHttpd.NanoHTTPD.p
        public String getName() {
            return this.f9648a.getAbsolutePath();
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static class h implements q {

        /* renamed from: a, reason: collision with root package name */
        private final File f9650a;

        /* renamed from: b, reason: collision with root package name */
        private final List<p> f9651b;

        public h() {
            File file = new File(System.getProperty("java.io.tmpdir"));
            this.f9650a = file;
            if (!file.exists()) {
                file.mkdirs();
            }
            this.f9651b = new ArrayList();
        }

        @Override // com.apptionlabs.meater_app.nanoHttpd.NanoHTTPD.q
        public p a(String str) {
            g gVar = new g(this.f9650a);
            this.f9651b.add(gVar);
            return gVar;
        }

        @Override // com.apptionlabs.meater_app.nanoHttpd.NanoHTTPD.q
        public void clear() {
            Iterator<p> it = this.f9651b.iterator();
            while (it.hasNext()) {
                try {
                    it.next().a();
                } catch (Exception e10) {
                    NanoHTTPD.f9629m.log(Level.WARNING, "could not delete file ", (Throwable) e10);
                }
            }
            this.f9651b.clear();
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private class i implements r {
        private i(NanoHTTPD nanoHTTPD) {
        }

        @Override // com.apptionlabs.meater_app.nanoHttpd.NanoHTTPD.r
        public q a() {
            return new h();
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    protected class j implements k {

        /* renamed from: a, reason: collision with root package name */
        private final q f9652a;

        /* renamed from: b, reason: collision with root package name */
        private final OutputStream f9653b;

        /* renamed from: c, reason: collision with root package name */
        private final BufferedInputStream f9654c;

        /* renamed from: d, reason: collision with root package name */
        private int f9655d;

        /* renamed from: e, reason: collision with root package name */
        private int f9656e;

        /* renamed from: f, reason: collision with root package name */
        private String f9657f;

        /* renamed from: g, reason: collision with root package name */
        private l f9658g;

        /* renamed from: h, reason: collision with root package name */
        private Map<String, String> f9659h;

        /* renamed from: i, reason: collision with root package name */
        private Map<String, String> f9660i;

        /* renamed from: j, reason: collision with root package name */
        private d f9661j;

        /* renamed from: k, reason: collision with root package name */
        private String f9662k;

        /* renamed from: l, reason: collision with root package name */
        private String f9663l;

        /* renamed from: m, reason: collision with root package name */
        private String f9664m;

        public j(q qVar, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
            String str;
            this.f9652a = qVar;
            this.f9654c = new BufferedInputStream(inputStream, 8192);
            this.f9653b = outputStream;
            if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
                str = inetAddress.getHostAddress();
            } else {
                str = "127.0.0.1";
            }
            this.f9663l = str;
            this.f9660i = new HashMap();
        }

        private void g(BufferedReader bufferedReader, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
            String n10;
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(readLine);
                if (stringTokenizer.hasMoreTokens()) {
                    map.put("method", stringTokenizer.nextToken());
                    if (stringTokenizer.hasMoreTokens()) {
                        String nextToken = stringTokenizer.nextToken();
                        int indexOf = nextToken.indexOf(63);
                        if (indexOf >= 0) {
                            i(nextToken.substring(indexOf + 1), map2);
                            n10 = NanoHTTPD.n(nextToken.substring(0, indexOf));
                        } else {
                            n10 = NanoHTTPD.n(nextToken);
                        }
                        if (stringTokenizer.hasMoreTokens()) {
                            this.f9664m = stringTokenizer.nextToken();
                        } else {
                            this.f9664m = "HTTP/1.1";
                            NanoHTTPD.f9629m.log(Level.FINE, "no protocol version specified, strange. Assuming HTTP/1.1.");
                        }
                        String readLine2 = bufferedReader.readLine();
                        while (readLine2 != null && readLine2.trim().length() > 0) {
                            int indexOf2 = readLine2.indexOf(58);
                            if (indexOf2 >= 0) {
                                map3.put(readLine2.substring(0, indexOf2).trim().toLowerCase(Locale.US), readLine2.substring(indexOf2 + 1).trim());
                            }
                            readLine2 = bufferedReader.readLine();
                        }
                        map.put("uri", n10);
                        return;
                    }
                    throw new ResponseException(m.c.BAD_REQUEST, "BAD REQUEST: Missing URI. Usage: GET /example/file.html");
                }
                throw new ResponseException(m.c.BAD_REQUEST, "BAD REQUEST: Syntax error. Usage: GET /example/file.html");
            } catch (IOException e10) {
                throw new ResponseException(m.c.INTERNAL_ERROR, "SERVER INTERNAL ERROR: IOException: " + e10.getMessage(), e10);
            }
        }

        private void h(String str, String str2, ByteBuffer byteBuffer, Map<String, String> map, Map<String, String> map2) {
            int i10;
            int i11;
            try {
                int[] n10 = n(byteBuffer, str.getBytes());
                int i12 = 2;
                if (n10.length >= 2) {
                    int i13 = 1024;
                    byte[] bArr = new byte[1024];
                    int i14 = 0;
                    int i15 = 0;
                    while (i15 < n10.length - 1) {
                        byteBuffer.position(n10[i15]);
                        if (byteBuffer.remaining() < i13) {
                            i10 = byteBuffer.remaining();
                        } else {
                            i10 = i13;
                        }
                        byteBuffer.get(bArr, i14, i10);
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, i14, i10), Charset.forName(str2)), i10);
                        if (bufferedReader.readLine().contains(str)) {
                            String readLine = bufferedReader.readLine();
                            String str3 = null;
                            int i16 = i12;
                            String str4 = null;
                            String str5 = null;
                            while (readLine != null && readLine.trim().length() > 0) {
                                Matcher matcher = NanoHTTPD.f9626j.matcher(readLine);
                                if (matcher.matches()) {
                                    Matcher matcher2 = NanoHTTPD.f9628l.matcher(matcher.group(i12));
                                    while (matcher2.find()) {
                                        String str6 = str4;
                                        String group = matcher2.group(1);
                                        if (group.equalsIgnoreCase("name")) {
                                            str5 = matcher2.group(2);
                                        } else if (group.equalsIgnoreCase("filename")) {
                                            str4 = matcher2.group(2);
                                        }
                                        str4 = str6;
                                    }
                                }
                                Matcher matcher3 = NanoHTTPD.f9627k.matcher(readLine);
                                if (matcher3.matches()) {
                                    i11 = 2;
                                    str3 = matcher3.group(2).trim();
                                } else {
                                    i11 = 2;
                                }
                                readLine = bufferedReader.readLine();
                                i16++;
                                i12 = i11;
                            }
                            int i17 = i12;
                            int i18 = 0;
                            while (true) {
                                int i19 = i16 - 1;
                                if (i16 <= 0) {
                                    break;
                                }
                                i18 = q(bArr, i18);
                                i16 = i19;
                            }
                            if (i18 < i10 - 4) {
                                int i20 = n10[i15] + i18;
                                i15++;
                                int i21 = n10[i15] - 4;
                                byteBuffer.position(i20);
                                if (str3 == null) {
                                    byte[] bArr2 = new byte[i21 - i20];
                                    byteBuffer.get(bArr2);
                                    map.put(str5, new String(bArr2, str2));
                                } else {
                                    String p10 = p(byteBuffer, i20, i21 - i20, str4);
                                    if (!map2.containsKey(str5)) {
                                        map2.put(str5, p10);
                                    } else {
                                        int i22 = i17;
                                        while (true) {
                                            if (!map2.containsKey(str5 + i22)) {
                                                break;
                                            } else {
                                                i22++;
                                            }
                                        }
                                        map2.put(str5 + i22, p10);
                                    }
                                    map.put(str5, str4);
                                }
                                i12 = i17;
                                i13 = 1024;
                                i14 = 0;
                            } else {
                                throw new ResponseException(m.c.INTERNAL_ERROR, "Multipart header size exceeds MAX_HEADER_SIZE.");
                            }
                        } else {
                            throw new ResponseException(m.c.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but chunk does not start with boundary.");
                        }
                    }
                    return;
                }
                throw new ResponseException(m.c.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but contains less than two boundary strings.");
            } catch (ResponseException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new ResponseException(m.c.INTERNAL_ERROR, e11.toString());
            }
        }

        private void i(String str, Map<String, String> map) {
            if (str == null) {
                this.f9662k = "";
                return;
            }
            this.f9662k = str;
            StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                int indexOf = nextToken.indexOf(61);
                if (indexOf >= 0) {
                    map.put(NanoHTTPD.n(nextToken.substring(0, indexOf)).trim(), NanoHTTPD.n(nextToken.substring(indexOf + 1)));
                } else {
                    map.put(NanoHTTPD.n(nextToken).trim(), "");
                }
            }
        }

        private int k(byte[] bArr, int i10) {
            int i11;
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                if (i13 >= i10) {
                    return 0;
                }
                byte b10 = bArr[i12];
                if (b10 == 13 && bArr[i13] == 10 && (i11 = i12 + 3) < i10 && bArr[i12 + 2] == 13 && bArr[i11] == 10) {
                    return i12 + 4;
                }
                if (b10 == 10 && bArr[i13] == 10) {
                    return i12 + 2;
                }
                i12 = i13;
            }
        }

        private String l(String str, Pattern pattern, String str2) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group(2);
            }
            return str2;
        }

        private int[] n(ByteBuffer byteBuffer, byte[] bArr) {
            int i10;
            int[] iArr = new int[0];
            if (byteBuffer.remaining() < bArr.length) {
                return iArr;
            }
            int length = bArr.length + 4096;
            byte[] bArr2 = new byte[length];
            if (byteBuffer.remaining() < length) {
                i10 = byteBuffer.remaining();
            } else {
                i10 = length;
            }
            byteBuffer.get(bArr2, 0, i10);
            int length2 = i10 - bArr.length;
            int i11 = 0;
            do {
                for (int i12 = 0; i12 < length2; i12++) {
                    for (int i13 = 0; i13 < bArr.length && bArr2[i12 + i13] == bArr[i13]; i13++) {
                        if (i13 == bArr.length - 1) {
                            int[] iArr2 = new int[iArr.length + 1];
                            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                            iArr2[iArr.length] = i11 + i12;
                            iArr = iArr2;
                        }
                    }
                }
                i11 += length2;
                System.arraycopy(bArr2, length - bArr.length, bArr2, 0, bArr.length);
                length2 = length - bArr.length;
                if (byteBuffer.remaining() < length2) {
                    length2 = byteBuffer.remaining();
                }
                byteBuffer.get(bArr2, bArr.length, length2);
            } while (length2 > 0);
            return iArr;
        }

        private RandomAccessFile o() {
            try {
                return new RandomAccessFile(this.f9652a.a(null).getName(), "rw");
            } catch (Exception e10) {
                throw new Error(e10);
            }
        }

        private String p(ByteBuffer byteBuffer, int i10, int i11, String str) {
            p a10;
            ByteBuffer duplicate;
            FileOutputStream fileOutputStream;
            if (i11 > 0) {
                FileOutputStream fileOutputStream2 = null;
                try {
                    try {
                        a10 = this.f9652a.a(str);
                        duplicate = byteBuffer.duplicate();
                        fileOutputStream = new FileOutputStream(a10.getName());
                    } catch (Exception e10) {
                        e = e10;
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    FileChannel channel = fileOutputStream.getChannel();
                    duplicate.position(i10).limit(i10 + i11);
                    channel.write(duplicate.slice());
                    String name = a10.getName();
                    NanoHTTPD.s(fileOutputStream);
                    return name;
                } catch (Exception e11) {
                    e = e11;
                    fileOutputStream2 = fileOutputStream;
                    throw new Error(e);
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream2 = fileOutputStream;
                    NanoHTTPD.s(fileOutputStream2);
                    throw th;
                }
            }
            return "";
        }

        private int q(byte[] bArr, int i10) {
            while (bArr[i10] != 10) {
                i10++;
            }
            return i10 + 1;
        }

        @Override // com.apptionlabs.meater_app.nanoHttpd.NanoHTTPD.k
        public final Map<String, String> a() {
            return this.f9660i;
        }

        @Override // com.apptionlabs.meater_app.nanoHttpd.NanoHTTPD.k
        public final Map<String, String> b() {
            return this.f9659h;
        }

        @Override // com.apptionlabs.meater_app.nanoHttpd.NanoHTTPD.k
        public final String c() {
            return this.f9657f;
        }

        @Override // com.apptionlabs.meater_app.nanoHttpd.NanoHTTPD.k
        public void d(Map<String, String> map) {
            ByteArrayOutputStream byteArrayOutputStream;
            RandomAccessFile randomAccessFile;
            DataOutput dataOutput;
            ByteBuffer map2;
            StringTokenizer stringTokenizer;
            RandomAccessFile randomAccessFile2 = null;
            try {
                long m10 = m();
                if (m10 < 1024) {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    randomAccessFile = null;
                    dataOutput = new DataOutputStream(byteArrayOutputStream);
                } else {
                    RandomAccessFile o10 = o();
                    byteArrayOutputStream = null;
                    randomAccessFile = o10;
                    dataOutput = o10;
                }
                try {
                    byte[] bArr = new byte[512];
                    while (this.f9656e >= 0 && m10 > 0) {
                        int read = this.f9654c.read(bArr, 0, (int) Math.min(m10, 512L));
                        this.f9656e = read;
                        m10 -= read;
                        if (read > 0) {
                            dataOutput.write(bArr, 0, read);
                        }
                    }
                    if (byteArrayOutputStream != null) {
                        map2 = ByteBuffer.wrap(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
                    } else {
                        map2 = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, randomAccessFile.length());
                        randomAccessFile.seek(0L);
                    }
                    ByteBuffer byteBuffer = map2;
                    if (l.POST.equals(this.f9658g)) {
                        String str = "";
                        String str2 = this.f9660i.get("content-type");
                        if (str2 != null) {
                            stringTokenizer = new StringTokenizer(str2, ",; ");
                            if (stringTokenizer.hasMoreTokens()) {
                                str = stringTokenizer.nextToken();
                            }
                        } else {
                            stringTokenizer = null;
                        }
                        if ("multipart/form-data".equalsIgnoreCase(str)) {
                            if (stringTokenizer.hasMoreTokens()) {
                                h(l(str2, NanoHTTPD.f9625i, null), l(str2, NanoHTTPD.f9624h, "US-ASCII"), byteBuffer, this.f9659h, map);
                            } else {
                                throw new ResponseException(m.c.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but boundary missing. Usage: GET /example/file.html");
                            }
                        } else {
                            byte[] bArr2 = new byte[byteBuffer.remaining()];
                            byteBuffer.get(bArr2);
                            String trim = new String(bArr2).trim();
                            if ("application/x-www-form-urlencoded".equalsIgnoreCase(str)) {
                                i(trim, this.f9659h);
                            } else if (trim.length() != 0) {
                                map.put("postData", trim);
                            }
                        }
                    } else if (l.PUT.equals(this.f9658g)) {
                        map.put("content", p(byteBuffer, 0, byteBuffer.limit(), null));
                    }
                    NanoHTTPD.s(randomAccessFile);
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile2 = randomAccessFile;
                    NanoHTTPD.s(randomAccessFile2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override // com.apptionlabs.meater_app.nanoHttpd.NanoHTTPD.k
        public final l e() {
            return this.f9658g;
        }

        @Override // com.apptionlabs.meater_app.nanoHttpd.NanoHTTPD.k
        public String f() {
            return this.f9662k;
        }

        public void j() {
            byte[] bArr;
            int read;
            boolean z10;
            boolean z11;
            m mVar = null;
            try {
                try {
                    try {
                        bArr = new byte[8192];
                        this.f9655d = 0;
                        this.f9656e = 0;
                        this.f9654c.mark(8192);
                        try {
                            read = this.f9654c.read(bArr, 0, 8192);
                        } catch (Exception unused) {
                            NanoHTTPD.s(this.f9654c);
                            NanoHTTPD.s(this.f9653b);
                            throw new SocketException("NanoHttpd Shutdown");
                        }
                    } catch (Throwable th) {
                        k6.b.c("OTA NANO httpd finally  ", new Object[0]);
                        NanoHTTPD.s(null);
                        this.f9652a.clear();
                        throw th;
                    }
                } catch (ResponseException e10) {
                    k6.b.c("OTA NANO httpd ResponseException %s ", e10.getLocalizedMessage());
                    NanoHTTPD.r(e10.a(), "text/plain", e10.getMessage()).f(this.f9653b);
                    NanoHTTPD.s(this.f9653b);
                    k6.b.c("OTA NANO httpd finally  ", new Object[0]);
                } catch (SocketException e11) {
                    k6.b.c("OTA NANO httpd SocketException %s ", e11.getLocalizedMessage());
                    throw e11;
                }
            } catch (SocketTimeoutException e12) {
                k6.b.c("OTA NANO httpd SocketTimeoutException %s ", e12.getLocalizedMessage());
                throw e12;
            } catch (IOException e13) {
                k6.b.c("OTA NANO httpd IOException %s ", e13.getLocalizedMessage());
                NanoHTTPD.r(m.c.INTERNAL_ERROR, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e13.getMessage()).f(this.f9653b);
                NanoHTTPD.s(this.f9653b);
                k6.b.c("OTA NANO httpd finally  ", new Object[0]);
            }
            if (read == -1) {
                NanoHTTPD.s(this.f9654c);
                NanoHTTPD.s(this.f9653b);
                throw new SocketException("NanoHttpd Shutdown");
            }
            while (read > 0) {
                int i10 = this.f9656e + read;
                this.f9656e = i10;
                int k10 = k(bArr, i10);
                this.f9655d = k10;
                if (k10 > 0) {
                    break;
                }
                BufferedInputStream bufferedInputStream = this.f9654c;
                int i11 = this.f9656e;
                read = bufferedInputStream.read(bArr, i11, 8192 - i11);
            }
            if (this.f9655d < this.f9656e) {
                this.f9654c.reset();
                this.f9654c.skip(this.f9655d);
            }
            this.f9659h = new HashMap();
            Map<String, String> map = this.f9660i;
            if (map == null) {
                this.f9660i = new HashMap();
            } else {
                map.clear();
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.f9656e)));
            HashMap hashMap = new HashMap();
            g(bufferedReader, hashMap, this.f9659h, this.f9660i);
            String str = this.f9663l;
            if (str != null) {
                this.f9660i.put("remote-addr", str);
                this.f9660i.put("http-client-ip", this.f9663l);
            }
            l i12 = l.i(hashMap.get("method"));
            this.f9658g = i12;
            if (i12 != null) {
                this.f9657f = hashMap.get("uri");
                this.f9661j = new d(NanoHTTPD.this, this.f9660i);
                String str2 = this.f9660i.get("connection");
                if (this.f9664m.equals("HTTP/1.1") && (str2 == null || !str2.matches("(?i).*close.*"))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                mVar = NanoHTTPD.this.t(this);
                if (mVar != null) {
                    String str3 = this.f9660i.get("accept-encoding");
                    this.f9661j.a(mVar);
                    mVar.o(this.f9658g);
                    if (NanoHTTPD.this.B(mVar) && str3 != null && str3.contains("gzip")) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    mVar.m(z11);
                    mVar.n(z10);
                    mVar.f(this.f9653b);
                    if (z10 && !"close".equalsIgnoreCase(mVar.b("connection"))) {
                        k6.b.c("OTA NANO httpd finally  ", new Object[0]);
                        NanoHTTPD.s(mVar);
                        this.f9652a.clear();
                        return;
                    }
                    k6.b.c("OTA NANO httpd keepAlive || \"close\".equalsIgnoreCase(r.getHeader(\"connection\"))", new Object[0]);
                    throw new SocketException("NanoHttpd Shutdown");
                }
                throw new ResponseException(m.c.INTERNAL_ERROR, "SERVER INTERNAL ERROR: Serve() returned a null response.");
            }
            throw new ResponseException(m.c.BAD_REQUEST, "BAD REQUEST: Syntax error.");
        }

        public long m() {
            if (this.f9660i.containsKey("content-length")) {
                return Long.parseLong(this.f9660i.get("content-length"));
            }
            if (this.f9655d < this.f9656e) {
                return r1 - r0;
            }
            return 0L;
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public interface k {
        Map<String, String> a();

        Map<String, String> b();

        String c();

        void d(Map<String, String> map);

        l e();

        String f();
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public enum l {
        GET,
        PUT,
        POST,
        DELETE,
        HEAD,
        OPTIONS,
        TRACE,
        CONNECT,
        PATCH;

        static l i(String str) {
            for (l lVar : values()) {
                if (lVar.toString().equalsIgnoreCase(str)) {
                    return lVar;
                }
            }
            return null;
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public class n implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        private final int f9695q;

        /* renamed from: r, reason: collision with root package name */
        private IOException f9696r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f9697s;

        @Override // java.lang.Runnable
        public void run() {
            InetSocketAddress inetSocketAddress;
            try {
                ServerSocket serverSocket = NanoHTTPD.this.f9632c;
                if (NanoHTTPD.this.f9630a != null) {
                    inetSocketAddress = new InetSocketAddress(NanoHTTPD.this.f9630a, NanoHTTPD.this.f9631b);
                } else {
                    inetSocketAddress = new InetSocketAddress(NanoHTTPD.this.f9631b);
                }
                serverSocket.bind(inetSocketAddress);
                this.f9697s = true;
                k6.b.c(" hasBinded <><>  myServerSocket.bind port: %s ," + NanoHTTPD.this.f9631b, new Object[0]);
                do {
                    try {
                        Socket accept = NanoHTTPD.this.f9632c.accept();
                        int i10 = this.f9695q;
                        if (i10 > 0) {
                            accept.setSoTimeout(i10);
                        }
                        InputStream inputStream = accept.getInputStream();
                        NanoHTTPD nanoHTTPD = NanoHTTPD.this;
                        nanoHTTPD.f9635f.b(nanoHTTPD.l(accept, inputStream));
                    } catch (IOException e10) {
                        k6.b.b("Communication with the client broken: %s" + e10.getLocalizedMessage(), new Object[0]);
                        NanoHTTPD.f9629m.log(Level.FINE, "Communication with the client broken", (Throwable) e10);
                    }
                } while (!NanoHTTPD.this.f9632c.isClosed());
            } catch (IOException e11) {
                k6.b.c("Exception while binding: %s" + e11.getLocalizedMessage(), new Object[0]);
                this.f9696r = e11;
            }
        }

        private n(int i10) {
            this.f9697s = false;
            this.f9695q = i10;
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public interface o {
        ServerSocket a();
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public interface p {
        void a();

        String getName();
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public interface q {
        p a(String str);

        void clear();
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public interface r {
        q a();
    }

    public NanoHTTPD(int i10) {
        this(null, i10);
    }

    protected static String n(String str) {
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e10) {
            f9629m.log(Level.WARNING, "Encoding not supported, ignored", (Throwable) e10);
            return null;
        }
    }

    public static m q(m.b bVar, String str, InputStream inputStream, long j10) {
        return new m(bVar, str, inputStream, j10);
    }

    public static m r(m.b bVar, String str, String str2) {
        if (str2 == null) {
            return q(bVar, str, new ByteArrayInputStream(new byte[0]), 0L);
        }
        return q(bVar, str, new ByteArrayInputStream(str2.getBytes(StandardCharsets.UTF_8)), r5.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                } else if (obj instanceof Socket) {
                    ((Socket) obj).close();
                } else {
                    if (obj instanceof ServerSocket) {
                        ((ServerSocket) obj).close();
                        return;
                    }
                    throw new IllegalArgumentException("Unknown object to close");
                }
            } catch (IOException e10) {
                f9629m.log(Level.SEVERE, "Could not close", (Throwable) e10);
            }
        }
    }

    public void A() {
        try {
            s(this.f9632c);
            this.f9635f.a();
            Thread thread = this.f9634e;
            if (thread != null) {
                thread.join();
            }
        } catch (Exception e10) {
            f9629m.log(Level.SEVERE, "Could not stop all connections", (Throwable) e10);
        }
    }

    protected boolean B(m mVar) {
        if (mVar.c() != null && mVar.c().toLowerCase().contains("text/")) {
            return true;
        }
        return false;
    }

    public final boolean C() {
        if (this.f9632c != null && this.f9634e != null) {
            return true;
        }
        return false;
    }

    protected b l(Socket socket, InputStream inputStream) {
        return new b(inputStream, socket);
    }

    protected n m(int i10) {
        return new n(i10);
    }

    public o o() {
        return this.f9633d;
    }

    public final boolean p() {
        if (C() && !this.f9632c.isClosed() && this.f9634e.isAlive()) {
            return true;
        }
        return false;
    }

    public m t(k kVar) {
        HashMap hashMap = new HashMap();
        l e10 = kVar.e();
        if (l.PUT.equals(e10) || l.POST.equals(e10)) {
            try {
                kVar.d(hashMap);
            } catch (ResponseException e11) {
                return r(e11.a(), "text/plain", e11.getMessage());
            } catch (IOException e12) {
                return r(m.c.INTERNAL_ERROR, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e12.getMessage());
            }
        }
        Map<String, String> b10 = kVar.b();
        b10.put("NanoHttpd.QUERY_STRING", kVar.f());
        return u(kVar.c(), e10, kVar.a(), b10, hashMap);
    }

    @Deprecated
    public m u(String str, l lVar, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        return r(m.c.NOT_FOUND, "text/plain", "Not Found");
    }

    public void v(a aVar) {
        this.f9635f = aVar;
    }

    public void w(r rVar) {
        this.f9636g = rVar;
    }

    public void x() {
        y(5000);
    }

    public void y(int i10) {
        z(i10, true);
    }

    public void z(int i10, boolean z10) {
        this.f9632c = o().a();
        this.f9632c.setReuseAddress(true);
        n m10 = m(i10);
        Thread thread = new Thread(m10);
        this.f9634e = thread;
        thread.setDaemon(z10);
        this.f9634e.setName("NanoHttpd Main Listener");
        this.f9634e.start();
        while (!m10.f9697s && m10.f9696r == null) {
            try {
                Thread.sleep(10L);
            } catch (Throwable th) {
                k6.b.c("serverRunnable.hasBinded: %s" + th.getLocalizedMessage(), new Object[0]);
            }
        }
        if (m10.f9696r == null) {
            try {
                Thread.sleep(1000L);
                return;
            } catch (Throwable th2) {
                k6.b.c("Thread.sleep(1000L)<><>: %s" + th2.getLocalizedMessage(), new Object[0]);
                return;
            }
        }
        k6.b.c("serverRunnable.bindException != null ooooo ", new Object[0]);
        throw m10.f9696r;
    }

    public NanoHTTPD(String str, int i10) {
        this.f9633d = new f();
        this.f9630a = str;
        this.f9631b = i10;
        w(new i());
        v(new e());
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static class m implements Closeable {

        /* renamed from: q, reason: collision with root package name */
        private b f9676q;

        /* renamed from: r, reason: collision with root package name */
        private String f9677r;

        /* renamed from: s, reason: collision with root package name */
        private InputStream f9678s;

        /* renamed from: t, reason: collision with root package name */
        private final long f9679t;

        /* renamed from: u, reason: collision with root package name */
        private final Map<String, String> f9680u = new HashMap();

        /* renamed from: v, reason: collision with root package name */
        private l f9681v;

        /* renamed from: w, reason: collision with root package name */
        private boolean f9682w;

        /* renamed from: x, reason: collision with root package name */
        private boolean f9683x;

        /* renamed from: y, reason: collision with root package name */
        private boolean f9684y;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: /tmp/meat/meat/classes.dex */
        public static class a extends FilterOutputStream {
            public a(OutputStream outputStream) {
                super(outputStream);
            }

            public void a() {
                ((FilterOutputStream) this).out.write("0\r\n\r\n".getBytes());
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i10) {
                write(new byte[]{(byte) i10}, 0, 1);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr) {
                write(bArr, 0, bArr.length);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i10, int i11) {
                if (i11 == 0) {
                    return;
                }
                ((FilterOutputStream) this).out.write(String.format("%x\r\n", Integer.valueOf(i11)).getBytes());
                ((FilterOutputStream) this).out.write(bArr, i10, i11);
                ((FilterOutputStream) this).out.write("\r\n".getBytes());
            }
        }

        /* loaded from: /tmp/meat/meat/classes.dex */
        public interface b {
            String g();
        }

        /* loaded from: /tmp/meat/meat/classes.dex */
        public enum c implements b {
            SWITCH_PROTOCOL(101, "Switching Protocols"),
            OK(200, "OK"),
            CREATED(201, "Created"),
            ACCEPTED(202, "Accepted"),
            NO_CONTENT(204, "No Content"),
            PARTIAL_CONTENT(206, "Partial Content"),
            REDIRECT(301, "Moved Permanently"),
            NOT_MODIFIED(304, "Not Modified"),
            BAD_REQUEST(400, "Bad Request"),
            UNAUTHORIZED(401, "Unauthorized"),
            FORBIDDEN(403, "Forbidden"),
            NOT_FOUND(404, "Not Found"),
            METHOD_NOT_ALLOWED(405, "Method Not Allowed"),
            NOT_ACCEPTABLE(406, "Not Acceptable"),
            REQUEST_TIMEOUT(408, "Request Timeout"),
            CONFLICT(409, "Conflict"),
            RANGE_NOT_SATISFIABLE(416, "Requested Range Not Satisfiable"),
            INTERNAL_ERROR(Temperature.MAX_AMBIENT_SECOND_GEN_PROBE, "Internal Server Error"),
            NOT_IMPLEMENTED(501, "Not Implemented"),
            UNSUPPORTED_HTTP_VERSION(505, "HTTP Version Not Supported");


            /* renamed from: q, reason: collision with root package name */
            private final int f9693q;

            /* renamed from: r, reason: collision with root package name */
            private final String f9694r;

            c(int i10, String str) {
                this.f9693q = i10;
                this.f9694r = str;
            }

            @Override // com.apptionlabs.meater_app.nanoHttpd.NanoHTTPD.m.b
            public String g() {
                return "" + this.f9693q + " " + this.f9694r;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public m(b bVar, String str, InputStream inputStream, long j10) {
            this.f9676q = bVar;
            this.f9677r = str;
            if (inputStream == null) {
                this.f9678s = new ByteArrayInputStream(new byte[0]);
                this.f9679t = 0L;
            } else {
                this.f9678s = inputStream;
                this.f9679t = j10;
            }
            this.f9682w = this.f9679t < 0;
            this.f9684y = true;
        }

        private static boolean d(Map<String, String> map, String str) {
            Iterator<String> it = map.keySet().iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                z10 |= it.next().equalsIgnoreCase(str);
            }
            return z10;
        }

        private void g(OutputStream outputStream, long j10) {
            boolean z10;
            long min;
            byte[] bArr = new byte[(int) 512];
            if (j10 == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            long j11 = j10;
            while (true) {
                if (j11 > 0 || z10) {
                    if (z10) {
                        min = 512;
                    } else {
                        min = Math.min(j11, 512L);
                    }
                    int read = this.f9678s.read(bArr, 0, (int) min);
                    if (read <= 0) {
                        return;
                    }
                    outputStream.write(bArr, 0, read);
                    if (!z10) {
                        j11 -= read;
                    }
                    p(j10, j10 - j11);
                } else {
                    return;
                }
            }
        }

        private void i(OutputStream outputStream, long j10) {
            if (this.f9683x) {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                g(gZIPOutputStream, -1L);
                gZIPOutputStream.finish();
                return;
            }
            g(outputStream, j10);
        }

        private void j(OutputStream outputStream, long j10) {
            if (this.f9681v != l.HEAD && this.f9682w) {
                a aVar = new a(outputStream);
                i(aVar, -1L);
                aVar.a();
                return;
            }
            i(outputStream, j10);
        }

        protected static long k(PrintWriter printWriter, Map<String, String> map, long j10) {
            for (String str : map.keySet()) {
                if (str.equalsIgnoreCase("content-length")) {
                    try {
                        return Long.parseLong(map.get(str));
                    } catch (NumberFormatException unused) {
                        return j10;
                    }
                }
            }
            printWriter.print("Content-Length: " + j10 + "\r\n");
            return j10;
        }

        public void a(String str, String str2) {
            this.f9680u.put(str, str2);
        }

        public String b(String str) {
            for (String str2 : this.f9680u.keySet()) {
                if (str2.equalsIgnoreCase(str)) {
                    return this.f9680u.get(str2);
                }
            }
            return null;
        }

        public String c() {
            return this.f9677r;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            InputStream inputStream = this.f9678s;
            if (inputStream != null) {
                inputStream.close();
            }
        }

        protected void f(OutputStream outputStream) {
            long j10;
            String str;
            String str2 = this.f9677r;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            try {
                if (this.f9676q != null) {
                    PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8)), false);
                    printWriter.print("HTTP/1.1 " + this.f9676q.g() + " \r\n");
                    if (str2 != null) {
                        printWriter.print("Content-Type: " + str2 + "\r\n");
                    }
                    Map<String, String> map = this.f9680u;
                    if (map == null || map.get("Date") == null) {
                        printWriter.print("Date: " + simpleDateFormat.format(new Date()) + "\r\n");
                    }
                    Map<String, String> map2 = this.f9680u;
                    if (map2 != null) {
                        for (String str3 : map2.keySet()) {
                            printWriter.print(str3 + ": " + this.f9680u.get(str3) + "\r\n");
                        }
                    }
                    if (!d(this.f9680u, "connection")) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Connection: ");
                        if (this.f9684y) {
                            str = "keep-alive";
                        } else {
                            str = "close";
                        }
                        sb.append(str);
                        sb.append("\r\n");
                        printWriter.print(sb.toString());
                    }
                    if (d(this.f9680u, "content-length")) {
                        this.f9683x = false;
                    }
                    if (this.f9683x) {
                        printWriter.print("Content-Encoding: gzip\r\n");
                        l(true);
                    }
                    if (this.f9678s != null) {
                        j10 = this.f9679t;
                    } else {
                        j10 = 0;
                    }
                    if (this.f9681v != l.HEAD && this.f9682w) {
                        printWriter.print("Transfer-Encoding: chunked\r\n");
                    } else if (!this.f9683x) {
                        j10 = k(printWriter, this.f9680u, j10);
                    }
                    printWriter.print("\r\n");
                    printWriter.flush();
                    j(outputStream, j10);
                    outputStream.flush();
                    NanoHTTPD.s(this.f9678s);
                    return;
                }
                throw new Error("sendResponse(): Status can't be null.");
            } catch (IOException e10) {
                NanoHTTPD.f9629m.log(Level.SEVERE, "Could not send response to the client", (Throwable) e10);
            }
        }

        public void l(boolean z10) {
            this.f9682w = z10;
        }

        public void m(boolean z10) {
            this.f9683x = z10;
        }

        public void n(boolean z10) {
            this.f9684y = z10;
        }

        public void o(l lVar) {
            this.f9681v = lVar;
        }

        public void p(long j10, long j11) {
        }
    }
}
