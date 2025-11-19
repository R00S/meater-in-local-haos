package pc;

import Cc.B;
import Cc.C0982e;
import Cc.g;
import Cc.h;
import Cc.r;
import Ha.f;
import Ub.k;
import Ub.n;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.collections.J;
import kotlin.collections.M;
import kotlin.jvm.internal.C3846c;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.V;
import oa.C4153F;
import oa.C4158c;
import oc.AbstractC4179C;
import oc.C4180D;
import oc.E;
import oc.InterfaceC4185e;
import oc.r;
import oc.u;
import oc.v;
import oc.z;
import xc.InterfaceC5088a;
import za.C5220a;

/* compiled from: Util.kt */
@Metadata(d1 = {"\u0000 \u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\f\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a%\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e*\b\u0012\u0004\u0012\u00020\u00070\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a7\u0010\u0014\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00070\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0018\u001a\u00020\u0007*\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019\u001a-\u0010\u001c\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u001a\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u001c\u0010\u001d\u001a%\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e*\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a%\u0010\"\u001a\u00020\u001b*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b\"\u0010#\u001a%\u0010$\u001a\u00020\u001b*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b$\u0010#\u001a%\u0010%\u001a\u00020\u0007*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b%\u0010&\u001a-\u0010(\u001a\u00020\u001b*\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b(\u0010)\u001a-\u0010,\u001a\u00020\u001b*\u00020\u00072\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b,\u0010-\u001a\u0011\u0010.\u001a\u00020\u001b*\u00020\u0007¢\u0006\u0004\b.\u0010/\u001a\u0011\u00100\u001a\u00020\t*\u00020\u0007¢\u0006\u0004\b0\u00101\u001a\u0015\u00102\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b2\u00101\u001a)\u00106\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00072\u0012\u00105\u001a\n\u0012\u0006\b\u0001\u0012\u0002040\u000e\"\u000204¢\u0006\u0004\b6\u00107\u001a\u0019\u0010;\u001a\u000209*\u0002082\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<\u001a'\u0010@\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u00002\b\u0010?\u001a\u0004\u0018\u00010>¢\u0006\u0004\b@\u0010A\u001a\u0011\u0010B\u001a\u00020\u001b*\u00020*¢\u0006\u0004\bB\u0010C\u001a\u0017\u0010G\u001a\u00020F*\b\u0012\u0004\u0012\u00020E0D¢\u0006\u0004\bG\u0010H\u001a\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020E0D*\u00020F¢\u0006\u0004\bI\u0010J\u001a\u0019\u0010K\u001a\u00020\t*\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0016¢\u0006\u0004\bK\u0010L\u001a\u0011\u0010O\u001a\u00020N*\u00020M¢\u0006\u0004\bO\u0010P\u001a\u001c\u0010S\u001a\u00020\u001b*\u00020Q2\u0006\u0010R\u001a\u00020\u001bH\u0086\u0004¢\u0006\u0004\bS\u0010T\u001a\u001c\u0010V\u001a\u00020\u001b*\u00020U2\u0006\u0010R\u001a\u00020\u001bH\u0086\u0004¢\u0006\u0004\bV\u0010W\u001a\u001c\u0010X\u001a\u00020\u0000*\u00020\u001b2\u0006\u0010R\u001a\u00020\u0000H\u0086\u0004¢\u0006\u0004\bX\u0010Y\u001a\u0019\u0010\\\u001a\u00020\u0004*\u00020Z2\u0006\u0010[\u001a\u00020\u001b¢\u0006\u0004\b\\\u0010]\u001a\u0011\u0010^\u001a\u00020\u001b*\u000208¢\u0006\u0004\b^\u0010_\u001a!\u0010b\u001a\u00020\t*\u00020`2\u0006\u0010=\u001a\u00020\u001b2\u0006\u0010a\u001a\u00020>¢\u0006\u0004\bb\u0010c\u001a!\u0010e\u001a\u00020\t*\u00020`2\u0006\u0010d\u001a\u00020\u001b2\u0006\u0010a\u001a\u00020>¢\u0006\u0004\be\u0010c\u001a\u0019\u0010h\u001a\u00020\t*\u00020f2\u0006\u0010g\u001a\u000208¢\u0006\u0004\bh\u0010i\u001a\u0019\u0010l\u001a\u00020\u001b*\u00020j2\u0006\u0010k\u001a\u00020Q¢\u0006\u0004\bl\u0010m\u001a\u001b\u0010n\u001a\u00020\u001b*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b¢\u0006\u0004\bn\u0010o\u001a\u0011\u0010q\u001a\u00020\u0000*\u00020p¢\u0006\u0004\bq\u0010r\u001a\u0019\u0010t\u001a\u00020\u0000*\u00020\u00072\u0006\u0010s\u001a\u00020\u0000¢\u0006\u0004\bt\u0010u\u001a\u001b\u0010v\u001a\u00020\u001b*\u0004\u0018\u00010\u00072\u0006\u0010s\u001a\u00020\u001b¢\u0006\u0004\bv\u0010o\u001a#\u0010w\u001a\b\u0012\u0004\u0012\u00028\u00000D\"\u0004\b\u0000\u0010w*\b\u0012\u0004\u0012\u00028\u00000D¢\u0006\u0004\bw\u0010x\u001a/\u0010z\u001a\b\u0012\u0004\u0012\u00028\u00000D\"\u0004\b\u0000\u0010w2\u0012\u0010y\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000e\"\u00028\u0000H\u0007¢\u0006\u0004\bz\u0010{\u001a5\u0010}\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010|\"\u0004\b\u0000\u0010^\"\u0004\b\u0001\u0010t*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010|¢\u0006\u0004\b}\u0010~\u001a\u0014\u0010\u0080\u0001\u001a\u00020\u0004*\u00020\u007f¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0014\u0010\u0082\u0001\u001a\u00020\u0004*\u00020f¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u001f\u0010\u0087\u0001\u001a\u00020\t*\u00030\u0084\u00012\b\u0010\u0086\u0001\u001a\u00030\u0085\u0001¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a,\u0010\u008b\u0001\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0012*\t\u0012\u0004\u0012\u00028\u00000\u0089\u00012\u0007\u0010\u008a\u0001\u001a\u00028\u0000H\u0000¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a0\u0010\u0091\u0001\u001a\u00030\u0090\u0001*\b0\u008d\u0001j\u0003`\u008e\u00012\u0013\u0010\u008f\u0001\u001a\u000e\u0012\n\u0012\b0\u008d\u0001j\u0003`\u008e\u00010D¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0018\u0010\u0096\u0001\u001a\u00030\u0093\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0016\u0010\u0098\u0001\u001a\u00020F8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\bk\u0010\u0097\u0001\"\u0018\u0010\u009b\u0001\u001a\u00030\u0099\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u009a\u0001\"\u0017\u0010\u009e\u0001\u001a\u00030\u009c\u00018\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\bS\u0010\u009d\u0001\"\u0017\u0010¡\u0001\u001a\u00030\u009f\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bV\u0010 \u0001\"\u0017\u0010¤\u0001\u001a\u00030¢\u00018\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\bX\u0010£\u0001\"\u0017\u0010§\u0001\u001a\u00030¥\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bO\u0010¦\u0001\"\u0017\u0010©\u0001\u001a\u00020\t8\u0000X\u0081\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010\u0091\u0001\"\u0016\u0010«\u0001\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0007\n\u0005\b0\u0010ª\u0001¨\u0006¬\u0001"}, d2 = {"", "arrayLength", "offset", "count", "Loa/F;", "l", "(JJJ)V", "", "name", "", "daemon", "Ljava/util/concurrent/ThreadFactory;", "N", "(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;", "", "other", "Ljava/util/Comparator;", "comparator", "E", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", "u", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "Loc/v;", "includeDefaultPort", "R", "(Loc/v;Z)Ljava/lang/String;", "value", "", "x", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", "o", "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "startIndex", "endIndex", "z", "(Ljava/lang/String;II)I", "B", "X", "(Ljava/lang/String;II)Ljava/lang/String;", "delimiters", "q", "(Ljava/lang/String;Ljava/lang/String;II)I", "", "delimiter", "p", "(Ljava/lang/String;CII)I", "y", "(Ljava/lang/String;)I", "i", "(Ljava/lang/String;)Z", "H", "format", "", "args", "t", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "LCc/g;", "Ljava/nio/charset/Charset;", "default", "J", "(LCc/g;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;", "duration", "Ljava/util/concurrent/TimeUnit;", "unit", "k", "(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I", "I", "(C)I", "", "Lwc/b;", "Loc/u;", "Q", "(Ljava/util/List;)Loc/u;", "P", "(Loc/u;)Ljava/util/List;", "j", "(Loc/v;Loc/v;)Z", "Loc/r;", "Loc/r$c;", "g", "(Loc/r;)Loc/r$c;", "", "mask", "d", "(BI)I", "", "e", "(SI)I", "f", "(IJ)J", "LCc/f;", "medium", "a0", "(LCc/f;I)V", "K", "(LCc/g;)I", "LCc/B;", "timeUnit", "M", "(LCc/B;ILjava/util/concurrent/TimeUnit;)Z", "timeout", "s", "Ljava/net/Socket;", "source", "G", "(Ljava/net/Socket;LCc/g;)Z", "LCc/e;", "b", "L", "(LCc/e;B)I", "D", "(Ljava/lang/String;I)I", "Loc/D;", "v", "(Loc/D;)J", "defaultValue", "V", "(Ljava/lang/String;J)J", "W", "T", "(Ljava/util/List;)Ljava/util/List;", "elements", "w", "([Ljava/lang/Object;)Ljava/util/List;", "", "U", "(Ljava/util/Map;)Ljava/util/Map;", "Ljava/io/Closeable;", "m", "(Ljava/io/Closeable;)V", "n", "(Ljava/net/Socket;)V", "Lxc/a;", "Ljava/io/File;", "file", "F", "(Lxc/a;Ljava/io/File;)Z", "", "element", "c", "(Ljava/util/List;Ljava/lang/Object;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "suppressed", "", "Z", "(Ljava/lang/Exception;Ljava/util/List;)Ljava/lang/Throwable;", "", "a", "[B", "EMPTY_BYTE_ARRAY", "Loc/u;", "EMPTY_HEADERS", "Loc/E;", "Loc/E;", "EMPTY_RESPONSE", "Loc/C;", "Loc/C;", "EMPTY_REQUEST", "LCc/r;", "LCc/r;", "UNICODE_BOMS", "Ljava/util/TimeZone;", "Ljava/util/TimeZone;", "UTC", "LUb/k;", "LUb/k;", "VERIFY_AS_IP_ADDRESS", "h", "assertionsEnabled", "Ljava/lang/String;", "okHttpName", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f47751a;

    /* renamed from: b, reason: collision with root package name */
    public static final u f47752b = u.INSTANCE.g(new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final E f47753c;

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC4179C f47754d;

    /* renamed from: e, reason: collision with root package name */
    private static final r f47755e;

    /* renamed from: f, reason: collision with root package name */
    public static final TimeZone f47756f;

    /* renamed from: g, reason: collision with root package name */
    private static final k f47757g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f47758h;

    /* renamed from: i, reason: collision with root package name */
    public static final String f47759i;

    static {
        byte[] bArr = new byte[0];
        f47751a = bArr;
        f47753c = E.Companion.d(E.INSTANCE, bArr, null, 1, null);
        f47754d = AbstractC4179C.Companion.h(AbstractC4179C.INSTANCE, bArr, null, 0, 0, 7, null);
        r.Companion aVar = r.INSTANCE;
        h.Companion companion = h.INSTANCE;
        f47755e = aVar.d(companion.b("efbbbf"), companion.b("feff"), companion.b("fffe"), companion.b("0000ffff"), companion.b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        C3862t.d(timeZone);
        f47756f = timeZone;
        f47757g = new k("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f47758h = false;
        String name = z.class.getName();
        C3862t.f(name, "OkHttpClient::class.java.name");
        f47759i = n.r0(n.p0(name, "okhttp3."), "Client");
    }

    public static /* synthetic */ int A(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return z(str, i10, i11);
    }

    public static final int B(String str, int i10, int i11) {
        C3862t.g(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                char cCharAt = str.charAt(i12);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i12 + 1;
                }
                if (i12 == i10) {
                    break;
                }
                i12--;
            }
        }
        return i10;
    }

    public static /* synthetic */ int C(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return B(str, i10, i11);
    }

    public static final int D(String str, int i10) {
        C3862t.g(str, "<this>");
        int length = str.length();
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    public static final String[] E(String[] strArr, String[] other, Comparator<? super String> comparator) {
        C3862t.g(strArr, "<this>");
        C3862t.g(other, "other");
        C3862t.g(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (comparator.compare(str, other[i10]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i10++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean F(InterfaceC5088a interfaceC5088a, File file) {
        C3862t.g(interfaceC5088a, "<this>");
        C3862t.g(file, "file");
        Cc.z zVarB = interfaceC5088a.b(file);
        try {
            try {
                interfaceC5088a.f(file);
                C5220a.a(zVarB, null);
                return true;
            } finally {
            }
        } catch (IOException unused) {
            C4153F c4153f = C4153F.f46609a;
            C5220a.a(zVarB, null);
            interfaceC5088a.f(file);
            return false;
        }
    }

    public static final boolean G(Socket socket, g source) throws SocketException {
        C3862t.g(socket, "<this>");
        C3862t.g(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z10 = !source.c0();
                socket.setSoTimeout(soTimeout);
                return z10;
            } catch (Throwable th) {
                socket.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean H(String name) {
        C3862t.g(name, "name");
        return n.t(name, "Authorization", true) || n.t(name, "Cookie", true) || n.t(name, "Proxy-Authorization", true) || n.t(name, "Set-Cookie", true);
    }

    public static final int I(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' > c10 || c10 >= 'G') {
            return -1;
        }
        return c10 - '7';
    }

    public static final Charset J(g gVar, Charset charset) {
        C3862t.g(gVar, "<this>");
        C3862t.g(charset, "default");
        int iY1 = gVar.y1(f47755e);
        if (iY1 == -1) {
            return charset;
        }
        if (iY1 == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            C3862t.f(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iY1 == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            C3862t.f(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iY1 == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            C3862t.f(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iY1 == 3) {
            return Ub.d.f17927a.a();
        }
        if (iY1 == 4) {
            return Ub.d.f17927a.b();
        }
        throw new AssertionError();
    }

    public static final int K(g gVar) {
        C3862t.g(gVar, "<this>");
        return d(gVar.readByte(), 255) | (d(gVar.readByte(), 255) << 16) | (d(gVar.readByte(), 255) << 8);
    }

    public static final int L(C0982e c0982e, byte b10) throws EOFException {
        C3862t.g(c0982e, "<this>");
        int i10 = 0;
        while (!c0982e.c0() && c0982e.m(0L) == b10) {
            i10++;
            c0982e.readByte();
        }
        return i10;
    }

    public static final boolean M(B b10, int i10, TimeUnit timeUnit) {
        C3862t.g(b10, "<this>");
        C3862t.g(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = b10.getTimeout().getHasDeadline() ? b10.getTimeout().c() - jNanoTime : Long.MAX_VALUE;
        b10.getTimeout().d(Math.min(jC, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            C0982e c0982e = new C0982e();
            while (b10.I0(c0982e, 8192L) != -1) {
                c0982e.b();
            }
            if (jC == Long.MAX_VALUE) {
                b10.getTimeout().a();
            } else {
                b10.getTimeout().d(jNanoTime + jC);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                b10.getTimeout().a();
            } else {
                b10.getTimeout().d(jNanoTime + jC);
            }
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                b10.getTimeout().a();
            } else {
                b10.getTimeout().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final ThreadFactory N(final String name, final boolean z10) {
        C3862t.g(name, "name");
        return new ThreadFactory() { // from class: pc.c
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return d.O(name, z10, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread O(String name, boolean z10, Runnable runnable) {
        C3862t.g(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(z10);
        return thread;
    }

    public static final List<wc.b> P(u uVar) {
        C3862t.g(uVar, "<this>");
        f fVarP = Ha.g.p(0, uVar.size());
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(fVarP, 10));
        Iterator<Integer> it = fVarP.iterator();
        while (it.hasNext()) {
            int iB = ((J) it).b();
            arrayList.add(new wc.b(uVar.h(iB), uVar.w(iB)));
        }
        return arrayList;
    }

    public static final u Q(List<wc.b> list) {
        C3862t.g(list, "<this>");
        u.a aVar = new u.a();
        for (wc.b bVar : list) {
            aVar.d(bVar.getName().N(), bVar.getValue().N());
        }
        return aVar.e();
    }

    public static final String R(v vVar, boolean z10) {
        String host;
        C3862t.g(vVar, "<this>");
        if (n.L(vVar.getHost(), ":", false, 2, null)) {
            host = '[' + vVar.getHost() + ']';
        } else {
            host = vVar.getHost();
        }
        if (!z10 && vVar.getPort() == v.INSTANCE.c(vVar.getScheme())) {
            return host;
        }
        return host + ':' + vVar.getPort();
    }

    public static /* synthetic */ String S(v vVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return R(vVar, z10);
    }

    public static final <T> List<T> T(List<? extends T> list) {
        C3862t.g(list, "<this>");
        List<T> listUnmodifiableList = Collections.unmodifiableList(kotlin.collections.r.Z0(list));
        C3862t.f(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final <K, V> Map<K, V> U(Map<K, ? extends V> map) {
        C3862t.g(map, "<this>");
        if (map.isEmpty()) {
            return M.h();
        }
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        C3862t.f(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return mapUnmodifiableMap;
    }

    public static final long V(String str, long j10) {
        C3862t.g(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static final int W(String str, int i10) throws NumberFormatException {
        if (str != null) {
            try {
                long j10 = Long.parseLong(str);
                if (j10 > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (j10 < 0) {
                    return 0;
                }
                return (int) j10;
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public static final String X(String str, int i10, int i11) {
        C3862t.g(str, "<this>");
        int iZ = z(str, i10, i11);
        String strSubstring = str.substring(iZ, B(str, iZ, i11));
        C3862t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String Y(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return X(str, i10, i11);
    }

    public static final Throwable Z(Exception exc, List<? extends Exception> suppressed) {
        C3862t.g(exc, "<this>");
        C3862t.g(suppressed, "suppressed");
        Iterator<? extends Exception> it = suppressed.iterator();
        while (it.hasNext()) {
            C4158c.a(exc, it.next());
        }
        return exc;
    }

    public static final void a0(Cc.f fVar, int i10) {
        C3862t.g(fVar, "<this>");
        fVar.d0((i10 >>> 16) & 255);
        fVar.d0((i10 >>> 8) & 255);
        fVar.d0(i10 & 255);
    }

    public static final <E> void c(List<E> list, E e10) {
        C3862t.g(list, "<this>");
        if (list.contains(e10)) {
            return;
        }
        list.add(e10);
    }

    public static final int d(byte b10, int i10) {
        return b10 & i10;
    }

    public static final int e(short s10, int i10) {
        return s10 & i10;
    }

    public static final long f(int i10, long j10) {
        return i10 & j10;
    }

    public static final r.c g(final oc.r rVar) {
        C3862t.g(rVar, "<this>");
        return new r.c() { // from class: pc.b
            @Override // oc.r.c
            public final oc.r a(InterfaceC4185e interfaceC4185e) {
                return d.h(rVar, interfaceC4185e);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oc.r h(oc.r this_asFactory, InterfaceC4185e it) {
        C3862t.g(this_asFactory, "$this_asFactory");
        C3862t.g(it, "it");
        return this_asFactory;
    }

    public static final boolean i(String str) {
        C3862t.g(str, "<this>");
        return f47757g.b(str);
    }

    public static final boolean j(v vVar, v other) {
        C3862t.g(vVar, "<this>");
        C3862t.g(other, "other");
        return C3862t.b(vVar.getHost(), other.getHost()) && vVar.getPort() == other.getPort() && C3862t.b(vVar.getScheme(), other.getScheme());
    }

    public static final int k(String name, long j10, TimeUnit timeUnit) {
        C3862t.g(name, "name");
        if (j10 < 0) {
            throw new IllegalStateException((name + " < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j10);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException((name + " too large.").toString());
        }
        if (millis != 0 || j10 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException((name + " too small.").toString());
    }

    public static final void l(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void m(Closeable closeable) throws IOException {
        C3862t.g(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void n(Socket socket) throws IOException {
        C3862t.g(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!C3862t.b(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final String[] o(String[] strArr, String value) {
        C3862t.g(strArr, "<this>");
        C3862t.g(value, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        C3862t.f(objArrCopyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[C3831l.c0(strArr2)] = value;
        return strArr2;
    }

    public static final int p(String str, char c10, int i10, int i11) {
        C3862t.g(str, "<this>");
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int q(String str, String delimiters, int i10, int i11) {
        C3862t.g(str, "<this>");
        C3862t.g(delimiters, "delimiters");
        while (i10 < i11) {
            if (n.K(delimiters, str.charAt(i10), false, 2, null)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int r(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return p(str, c10, i10, i11);
    }

    public static final boolean s(B b10, int i10, TimeUnit timeUnit) {
        C3862t.g(b10, "<this>");
        C3862t.g(timeUnit, "timeUnit");
        try {
            return M(b10, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String t(String format, Object... args) {
        C3862t.g(format, "format");
        C3862t.g(args, "args");
        V v10 = V.f43983a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        C3862t.f(str, "format(locale, format, *args)");
        return str;
    }

    public static final boolean u(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        C3862t.g(strArr, "<this>");
        C3862t.g(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator itA = C3846c.a(strArr2);
                while (itA.hasNext()) {
                    if (comparator.compare(str, (String) itA.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long v(C4180D c4180d) {
        C3862t.g(c4180d, "<this>");
        String strC = c4180d.getHeaders().c("Content-Length");
        if (strC != null) {
            return V(strC, -1L);
        }
        return -1L;
    }

    @SafeVarargs
    public static final <T> List<T> w(T... elements) {
        C3862t.g(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List<T> listUnmodifiableList = Collections.unmodifiableList(kotlin.collections.r.p(Arrays.copyOf(objArr, objArr.length)));
        C3862t.f(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int x(String[] strArr, String value, Comparator<String> comparator) {
        C3862t.g(strArr, "<this>");
        C3862t.g(value, "value");
        C3862t.g(comparator, "comparator");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], value) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int y(String str) {
        C3862t.g(str, "<this>");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (C3862t.i(cCharAt, 31) <= 0 || C3862t.i(cCharAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int z(String str, int i10, int i11) {
        C3862t.g(str, "<this>");
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }
}
