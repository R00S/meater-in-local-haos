package wc;

import Cc.B;
import Cc.C0982e;
import Cc.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.collections.r;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: Hpack.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\n\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u000e\u0010\b¨\u0006\u0015"}, d2 = {"Lwc/c;", "", "<init>", "()V", "", "LCc/h;", "", "d", "()Ljava/util/Map;", "name", "a", "(LCc/h;)LCc/h;", "", "Lwc/b;", "b", "[Lwc/b;", "c", "()[Lwc/b;", "STATIC_HEADER_TABLE", "Ljava/util/Map;", "NAME_TO_FIRST_INDEX", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f52043a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final wc.b[] STATIC_HEADER_TABLE;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Map<Cc.h, Integer> NAME_TO_FIRST_INDEX;

    static {
        c cVar = new c();
        f52043a = cVar;
        wc.b bVar = new wc.b(wc.b.f52039j, "");
        Cc.h hVar = wc.b.f52036g;
        wc.b bVar2 = new wc.b(hVar, "GET");
        wc.b bVar3 = new wc.b(hVar, "POST");
        Cc.h hVar2 = wc.b.f52037h;
        wc.b bVar4 = new wc.b(hVar2, "/");
        wc.b bVar5 = new wc.b(hVar2, "/index.html");
        Cc.h hVar3 = wc.b.f52038i;
        wc.b bVar6 = new wc.b(hVar3, "http");
        wc.b bVar7 = new wc.b(hVar3, "https");
        Cc.h hVar4 = wc.b.f52035f;
        STATIC_HEADER_TABLE = new wc.b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, new wc.b(hVar4, "200"), new wc.b(hVar4, "204"), new wc.b(hVar4, "206"), new wc.b(hVar4, "304"), new wc.b(hVar4, "400"), new wc.b(hVar4, "404"), new wc.b(hVar4, "500"), new wc.b("accept-charset", ""), new wc.b("accept-encoding", "gzip, deflate"), new wc.b("accept-language", ""), new wc.b("accept-ranges", ""), new wc.b("accept", ""), new wc.b("access-control-allow-origin", ""), new wc.b("age", ""), new wc.b("allow", ""), new wc.b("authorization", ""), new wc.b("cache-control", ""), new wc.b("content-disposition", ""), new wc.b("content-encoding", ""), new wc.b("content-language", ""), new wc.b("content-length", ""), new wc.b("content-location", ""), new wc.b("content-range", ""), new wc.b("content-type", ""), new wc.b("cookie", ""), new wc.b("date", ""), new wc.b("etag", ""), new wc.b("expect", ""), new wc.b("expires", ""), new wc.b("from", ""), new wc.b("host", ""), new wc.b("if-match", ""), new wc.b("if-modified-since", ""), new wc.b("if-none-match", ""), new wc.b("if-range", ""), new wc.b("if-unmodified-since", ""), new wc.b("last-modified", ""), new wc.b("link", ""), new wc.b("location", ""), new wc.b("max-forwards", ""), new wc.b("proxy-authenticate", ""), new wc.b("proxy-authorization", ""), new wc.b("range", ""), new wc.b("referer", ""), new wc.b("refresh", ""), new wc.b("retry-after", ""), new wc.b("server", ""), new wc.b("set-cookie", ""), new wc.b("strict-transport-security", ""), new wc.b("transfer-encoding", ""), new wc.b("user-agent", ""), new wc.b("vary", ""), new wc.b("via", ""), new wc.b("www-authenticate", "")};
        NAME_TO_FIRST_INDEX = cVar.d();
    }

    private c() {
    }

    private final Map<Cc.h, Integer> d() {
        wc.b[] bVarArr = STATIC_HEADER_TABLE;
        LinkedHashMap linkedHashMap = new LinkedHashMap(bVarArr.length);
        int length = bVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            wc.b[] bVarArr2 = STATIC_HEADER_TABLE;
            if (!linkedHashMap.containsKey(bVarArr2[i10].name)) {
                linkedHashMap.put(bVarArr2[i10].name, Integer.valueOf(i10));
            }
        }
        Map<Cc.h, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C3862t.f(mapUnmodifiableMap, "unmodifiableMap(result)");
        return mapUnmodifiableMap;
    }

    public final Cc.h a(Cc.h name) throws IOException {
        C3862t.g(name, "name");
        int iJ = name.J();
        for (int i10 = 0; i10 < iJ; i10++) {
            byte bT = name.t(i10);
            if (65 <= bT && bT < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.N());
            }
        }
        return name;
    }

    public final Map<Cc.h, Integer> b() {
        return NAME_TO_FIRST_INDEX;
    }

    public final wc.b[] c() {
        return STATIC_HEADER_TABLE;
    }

    /* compiled from: Hpack.kt */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u000bJ\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u000bJ\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0%¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\t¢\u0006\u0004\b(\u0010\u000bJ\u001d\u0010+\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0004¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0019¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010/R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010/R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u001f008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00101R\u0014\u0010\u0003\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00104R\u001e\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b&\u00106R\u0016\u00108\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010/R\u0016\u00109\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b!\u0010/R\u0016\u0010:\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010/¨\u0006;"}, d2 = {"Lwc/c$a;", "", "LCc/B;", "source", "", "headerTableSizeSetting", "maxDynamicTableByteCount", "<init>", "(LCc/B;II)V", "Loa/F;", "a", "()V", "b", "bytesToRecover", "d", "(I)I", "index", "l", "(I)V", "c", "p", "q", "nameIndex", "n", "o", "LCc/h;", "f", "(I)LCc/h;", "", "h", "(I)Z", "Lwc/b;", "entry", "g", "(ILwc/b;)V", "i", "()I", "", "e", "()Ljava/util/List;", "k", "firstByte", "prefixMask", "m", "(II)I", "j", "()LCc/h;", "I", "", "Ljava/util/List;", "headerList", "LCc/g;", "LCc/g;", "", "[Lwc/b;", "dynamicTable", "nextHeaderIndex", "headerCount", "dynamicTableByteCount", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int headerTableSizeSetting;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int maxDynamicTableByteCount;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<wc.b> headerList;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Cc.g source;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        public wc.b[] dynamicTable;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private int nextHeaderIndex;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        public int headerCount;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        public int dynamicTableByteCount;

        public a(B source, int i10, int i11) {
            C3862t.g(source, "source");
            this.headerTableSizeSetting = i10;
            this.maxDynamicTableByteCount = i11;
            this.headerList = new ArrayList();
            this.source = o.d(source);
            this.dynamicTable = new wc.b[8];
            this.nextHeaderIndex = r2.length - 1;
        }

        private final void a() {
            int i10 = this.maxDynamicTableByteCount;
            int i11 = this.dynamicTableByteCount;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    d(i11 - i10);
                }
            }
        }

        private final void b() {
            C3831l.x(this.dynamicTable, null, 0, 0, 6, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int c(int index) {
            return this.nextHeaderIndex + 1 + index;
        }

        private final int d(int bytesToRecover) {
            int i10;
            int i11 = 0;
            if (bytesToRecover > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i10 = this.nextHeaderIndex;
                    if (length < i10 || bytesToRecover <= 0) {
                        break;
                    }
                    wc.b bVar = this.dynamicTable[length];
                    C3862t.d(bVar);
                    int i12 = bVar.hpackSize;
                    bytesToRecover -= i12;
                    this.dynamicTableByteCount -= i12;
                    this.headerCount--;
                    i11++;
                }
                wc.b[] bVarArr = this.dynamicTable;
                System.arraycopy(bVarArr, i10 + 1, bVarArr, i10 + 1 + i11, this.headerCount);
                this.nextHeaderIndex += i11;
            }
            return i11;
        }

        private final Cc.h f(int index) throws IOException {
            if (h(index)) {
                return c.f52043a.c()[index].name;
            }
            int iC = c(index - c.f52043a.c().length);
            if (iC >= 0) {
                wc.b[] bVarArr = this.dynamicTable;
                if (iC < bVarArr.length) {
                    wc.b bVar = bVarArr[iC];
                    C3862t.d(bVar);
                    return bVar.name;
                }
            }
            throw new IOException("Header index too large " + (index + 1));
        }

        private final void g(int index, wc.b entry) {
            this.headerList.add(entry);
            int i10 = entry.hpackSize;
            if (index != -1) {
                wc.b bVar = this.dynamicTable[c(index)];
                C3862t.d(bVar);
                i10 -= bVar.hpackSize;
            }
            int i11 = this.maxDynamicTableByteCount;
            if (i10 > i11) {
                b();
                return;
            }
            int iD = d((this.dynamicTableByteCount + i10) - i11);
            if (index == -1) {
                int i12 = this.headerCount + 1;
                wc.b[] bVarArr = this.dynamicTable;
                if (i12 > bVarArr.length) {
                    wc.b[] bVarArr2 = new wc.b[bVarArr.length * 2];
                    System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = bVarArr2;
                }
                int i13 = this.nextHeaderIndex;
                this.nextHeaderIndex = i13 - 1;
                this.dynamicTable[i13] = entry;
                this.headerCount++;
            } else {
                this.dynamicTable[index + c(index) + iD] = entry;
            }
            this.dynamicTableByteCount += i10;
        }

        private final boolean h(int index) {
            return index >= 0 && index <= c.f52043a.c().length - 1;
        }

        private final int i() {
            return pc.d.d(this.source.readByte(), 255);
        }

        private final void l(int index) throws IOException {
            if (h(index)) {
                this.headerList.add(c.f52043a.c()[index]);
                return;
            }
            int iC = c(index - c.f52043a.c().length);
            if (iC >= 0) {
                wc.b[] bVarArr = this.dynamicTable;
                if (iC < bVarArr.length) {
                    List<wc.b> list = this.headerList;
                    wc.b bVar = bVarArr[iC];
                    C3862t.d(bVar);
                    list.add(bVar);
                    return;
                }
            }
            throw new IOException("Header index too large " + (index + 1));
        }

        private final void n(int nameIndex) {
            g(-1, new wc.b(f(nameIndex), j()));
        }

        private final void o() {
            g(-1, new wc.b(c.f52043a.a(j()), j()));
        }

        private final void p(int index) throws IOException {
            this.headerList.add(new wc.b(f(index), j()));
        }

        private final void q() throws IOException {
            this.headerList.add(new wc.b(c.f52043a.a(j()), j()));
        }

        public final List<wc.b> e() {
            List<wc.b> listW0 = r.W0(this.headerList);
            this.headerList.clear();
            return listW0;
        }

        public final Cc.h j() {
            int i10 = i();
            boolean z10 = (i10 & 128) == 128;
            long jM = m(i10, 127);
            if (!z10) {
                return this.source.H(jM);
            }
            C0982e c0982e = new C0982e();
            j.f52203a.b(this.source, jM, c0982e);
            return c0982e.u();
        }

        public final void k() throws IOException {
            while (!this.source.c0()) {
                int iD = pc.d.d(this.source.readByte(), 255);
                if (iD == 128) {
                    throw new IOException("index == 0");
                }
                if ((iD & 128) == 128) {
                    l(m(iD, 127) - 1);
                } else if (iD == 64) {
                    o();
                } else if ((iD & 64) == 64) {
                    n(m(iD, 63) - 1);
                } else if ((iD & 32) == 32) {
                    int iM = m(iD, 31);
                    this.maxDynamicTableByteCount = iM;
                    if (iM < 0 || iM > this.headerTableSizeSetting) {
                        throw new IOException("Invalid dynamic table size update " + this.maxDynamicTableByteCount);
                    }
                    a();
                } else if (iD == 16 || iD == 0) {
                    q();
                } else {
                    p(m(iD, 15) - 1);
                }
            }
        }

        public final int m(int firstByte, int prefixMask) {
            int i10 = firstByte & prefixMask;
            if (i10 < prefixMask) {
                return i10;
            }
            int i11 = 0;
            while (true) {
                int i12 = i();
                if ((i12 & 128) == 0) {
                    return prefixMask + (i12 << i11);
                }
                prefixMask += (i12 & 127) << i11;
                i11 += 7;
            }
        }

        public /* synthetic */ a(B b10, int i10, int i11, int i12, C3854k c3854k) {
            this(b10, i10, (i12 & 4) != 0 ? i10 : i11);
        }
    }

    /* compiled from: Hpack.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u001b\u0010\u0017\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010&R\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010%R\u0016\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010$R\u001e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100*8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010+R\u0016\u0010-\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010$R\u0016\u0010/\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b.\u0010$R\u0016\u00101\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b0\u0010$¨\u00062"}, d2 = {"Lwc/c$b;", "", "", "headerTableSizeSetting", "", "useCompression", "LCc/e;", "out", "<init>", "(IZLCc/e;)V", "Loa/F;", "b", "()V", "bytesToRecover", "c", "(I)I", "Lwc/b;", "entry", "d", "(Lwc/b;)V", "a", "", "headerBlock", "g", "(Ljava/util/List;)V", "value", "prefixMask", "bits", "h", "(III)V", "LCc/h;", "data", "f", "(LCc/h;)V", "e", "(I)V", "I", "Z", "LCc/e;", "smallestHeaderTableSizeSetting", "emitDynamicTableSizeUpdate", "maxDynamicTableByteCount", "", "[Lwc/b;", "dynamicTable", "nextHeaderIndex", "i", "headerCount", "j", "dynamicTableByteCount", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public int headerTableSizeSetting;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean useCompression;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final C0982e out;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int smallestHeaderTableSizeSetting;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean emitDynamicTableSizeUpdate;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        public int maxDynamicTableByteCount;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        public wc.b[] dynamicTable;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private int nextHeaderIndex;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        public int headerCount;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        public int dynamicTableByteCount;

        public b(int i10, boolean z10, C0982e out) {
            C3862t.g(out, "out");
            this.headerTableSizeSetting = i10;
            this.useCompression = z10;
            this.out = out;
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.maxDynamicTableByteCount = i10;
            this.dynamicTable = new wc.b[8];
            this.nextHeaderIndex = r2.length - 1;
        }

        private final void a() {
            int i10 = this.maxDynamicTableByteCount;
            int i11 = this.dynamicTableByteCount;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    c(i11 - i10);
                }
            }
        }

        private final void b() {
            C3831l.x(this.dynamicTable, null, 0, 0, 6, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int c(int bytesToRecover) {
            int i10;
            int i11 = 0;
            if (bytesToRecover > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i10 = this.nextHeaderIndex;
                    if (length < i10 || bytesToRecover <= 0) {
                        break;
                    }
                    wc.b bVar = this.dynamicTable[length];
                    C3862t.d(bVar);
                    bytesToRecover -= bVar.hpackSize;
                    int i12 = this.dynamicTableByteCount;
                    wc.b bVar2 = this.dynamicTable[length];
                    C3862t.d(bVar2);
                    this.dynamicTableByteCount = i12 - bVar2.hpackSize;
                    this.headerCount--;
                    i11++;
                }
                wc.b[] bVarArr = this.dynamicTable;
                System.arraycopy(bVarArr, i10 + 1, bVarArr, i10 + 1 + i11, this.headerCount);
                wc.b[] bVarArr2 = this.dynamicTable;
                int i13 = this.nextHeaderIndex;
                Arrays.fill(bVarArr2, i13 + 1, i13 + 1 + i11, (Object) null);
                this.nextHeaderIndex += i11;
            }
            return i11;
        }

        private final void d(wc.b entry) {
            int i10 = entry.hpackSize;
            int i11 = this.maxDynamicTableByteCount;
            if (i10 > i11) {
                b();
                return;
            }
            c((this.dynamicTableByteCount + i10) - i11);
            int i12 = this.headerCount + 1;
            wc.b[] bVarArr = this.dynamicTable;
            if (i12 > bVarArr.length) {
                wc.b[] bVarArr2 = new wc.b[bVarArr.length * 2];
                System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = bVarArr2;
            }
            int i13 = this.nextHeaderIndex;
            this.nextHeaderIndex = i13 - 1;
            this.dynamicTable[i13] = entry;
            this.headerCount++;
            this.dynamicTableByteCount += i10;
        }

        public final void e(int headerTableSizeSetting) {
            this.headerTableSizeSetting = headerTableSizeSetting;
            int iMin = Math.min(headerTableSizeSetting, 16384);
            int i10 = this.maxDynamicTableByteCount;
            if (i10 == iMin) {
                return;
            }
            if (iMin < i10) {
                this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, iMin);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = iMin;
            a();
        }

        public final void f(Cc.h data) {
            C3862t.g(data, "data");
            if (this.useCompression) {
                j jVar = j.f52203a;
                if (jVar.d(data) < data.J()) {
                    C0982e c0982e = new C0982e();
                    jVar.c(data, c0982e);
                    Cc.h hVarU = c0982e.u();
                    h(hVarU.J(), 127, 128);
                    this.out.t0(hVarU);
                    return;
                }
            }
            h(data.J(), 127, 0);
            this.out.t0(data);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void g(java.util.List<wc.b> r13) {
            /*
                Method dump skipped, instructions count: 264
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: wc.c.b.g(java.util.List):void");
        }

        public final void h(int value, int prefixMask, int bits) {
            if (value < prefixMask) {
                this.out.d0(value | bits);
                return;
            }
            this.out.d0(bits | prefixMask);
            int i10 = value - prefixMask;
            while (i10 >= 128) {
                this.out.d0(128 | (i10 & 127));
                i10 >>>= 7;
            }
            this.out.d0(i10);
        }

        public /* synthetic */ b(int i10, boolean z10, C0982e c0982e, int i11, C3854k c3854k) {
            this((i11 & 1) != 0 ? 4096 : i10, (i11 & 2) != 0 ? true : z10, c0982e);
        }
    }
}
