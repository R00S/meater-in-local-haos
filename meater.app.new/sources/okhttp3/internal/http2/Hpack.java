package okhttp3.internal.http2;

import cm.aptoide.p092pt.dataprovider.BuildConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C10782c0;
import kotlin.collections.C10801m;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import p353j.C9703f;
import p353j.C9710i;
import p353j.C9718q;
import p353j.InterfaceC9700d0;
import p353j.InterfaceC9709h;

/* compiled from: Hpack.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR%\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0006R\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000b¨\u0006\u001e"}, m32267d2 = {"Lokhttp3/internal/http2/Hpack;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "Lj/i;", HttpUrl.FRAGMENT_ENCODE_SET, "nameToFirstIndex", "()Ljava/util/Map;", "name", "checkLowercase", "(Lj/i;)Lj/i;", "SETTINGS_HEADER_TABLE_SIZE_LIMIT", "I", "PREFIX_7_BITS", "PREFIX_5_BITS", "NAME_TO_FIRST_INDEX", "Ljava/util/Map;", "getNAME_TO_FIRST_INDEX", "PREFIX_4_BITS", "SETTINGS_HEADER_TABLE_SIZE", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/internal/http2/Header;", "STATIC_HEADER_TABLE", "[Lokhttp3/internal/http2/Header;", "getSTATIC_HEADER_TABLE", "()[Lokhttp3/internal/http2/Header;", "PREFIX_6_BITS", "<init>", "()V", "Reader", "Writer", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class Hpack {
    public static final Hpack INSTANCE;
    private static final Map<C9710i, Integer> NAME_TO_FIRST_INDEX;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
    private static final Header[] STATIC_HEADER_TABLE;

    static {
        Hpack hpack = new Hpack();
        INSTANCE = hpack;
        C9710i c9710i = Header.TARGET_METHOD;
        C9710i c9710i2 = Header.TARGET_PATH;
        C9710i c9710i3 = Header.TARGET_SCHEME;
        C9710i c9710i4 = Header.RESPONSE_STATUS;
        STATIC_HEADER_TABLE = new Header[]{new Header(Header.TARGET_AUTHORITY, HttpUrl.FRAGMENT_ENCODE_SET), new Header(c9710i, "GET"), new Header(c9710i, "POST"), new Header(c9710i2, "/"), new Header(c9710i2, "/index.html"), new Header(c9710i3, "http"), new Header(c9710i3, BuildConfig.APTOIDE_WEB_SERVICES_SCHEME), new Header(c9710i4, "200"), new Header(c9710i4, "204"), new Header(c9710i4, "206"), new Header(c9710i4, "304"), new Header(c9710i4, "400"), new Header(c9710i4, "404"), new Header(c9710i4, "500"), new Header("accept-charset", HttpUrl.FRAGMENT_ENCODE_SET), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", HttpUrl.FRAGMENT_ENCODE_SET), new Header("accept-ranges", HttpUrl.FRAGMENT_ENCODE_SET), new Header("accept", HttpUrl.FRAGMENT_ENCODE_SET), new Header("access-control-allow-origin", HttpUrl.FRAGMENT_ENCODE_SET), new Header("age", HttpUrl.FRAGMENT_ENCODE_SET), new Header("allow", HttpUrl.FRAGMENT_ENCODE_SET), new Header("authorization", HttpUrl.FRAGMENT_ENCODE_SET), new Header("cache-control", HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-disposition", HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-encoding", HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-language", HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-length", HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-location", HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-range", HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-type", HttpUrl.FRAGMENT_ENCODE_SET), new Header("cookie", HttpUrl.FRAGMENT_ENCODE_SET), new Header("date", HttpUrl.FRAGMENT_ENCODE_SET), new Header("etag", HttpUrl.FRAGMENT_ENCODE_SET), new Header("expect", HttpUrl.FRAGMENT_ENCODE_SET), new Header("expires", HttpUrl.FRAGMENT_ENCODE_SET), new Header("from", HttpUrl.FRAGMENT_ENCODE_SET), new Header("host", HttpUrl.FRAGMENT_ENCODE_SET), new Header("if-match", HttpUrl.FRAGMENT_ENCODE_SET), new Header("if-modified-since", HttpUrl.FRAGMENT_ENCODE_SET), new Header("if-none-match", HttpUrl.FRAGMENT_ENCODE_SET), new Header("if-range", HttpUrl.FRAGMENT_ENCODE_SET), new Header("if-unmodified-since", HttpUrl.FRAGMENT_ENCODE_SET), new Header("last-modified", HttpUrl.FRAGMENT_ENCODE_SET), new Header("link", HttpUrl.FRAGMENT_ENCODE_SET), new Header("location", HttpUrl.FRAGMENT_ENCODE_SET), new Header("max-forwards", HttpUrl.FRAGMENT_ENCODE_SET), new Header("proxy-authenticate", HttpUrl.FRAGMENT_ENCODE_SET), new Header("proxy-authorization", HttpUrl.FRAGMENT_ENCODE_SET), new Header("range", HttpUrl.FRAGMENT_ENCODE_SET), new Header("referer", HttpUrl.FRAGMENT_ENCODE_SET), new Header("refresh", HttpUrl.FRAGMENT_ENCODE_SET), new Header("retry-after", HttpUrl.FRAGMENT_ENCODE_SET), new Header("server", HttpUrl.FRAGMENT_ENCODE_SET), new Header("set-cookie", HttpUrl.FRAGMENT_ENCODE_SET), new Header("strict-transport-security", HttpUrl.FRAGMENT_ENCODE_SET), new Header("transfer-encoding", HttpUrl.FRAGMENT_ENCODE_SET), new Header("user-agent", HttpUrl.FRAGMENT_ENCODE_SET), new Header("vary", HttpUrl.FRAGMENT_ENCODE_SET), new Header("via", HttpUrl.FRAGMENT_ENCODE_SET), new Header("www-authenticate", HttpUrl.FRAGMENT_ENCODE_SET)};
        NAME_TO_FIRST_INDEX = hpack.nameToFirstIndex();
    }

    private Hpack() {
    }

    private final Map<C9710i, Integer> nameToFirstIndex() {
        Header[] headerArr = STATIC_HEADER_TABLE;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            Header[] headerArr2 = STATIC_HEADER_TABLE;
            if (!linkedHashMap.containsKey(headerArr2[i2].name)) {
                linkedHashMap.put(headerArr2[i2].name, Integer.valueOf(i2));
            }
        }
        Map<C9710i, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C9801m.m32345e(mapUnmodifiableMap, "Collections.unmodifiableMap(result)");
        return mapUnmodifiableMap;
    }

    public final C9710i checkLowercase(C9710i name) throws IOException {
        C9801m.m32346f(name, "name");
        int iM32093P = name.m32093P();
        for (int i2 = 0; i2 < iM32093P; i2++) {
            byte b2 = (byte) 65;
            byte b3 = (byte) 90;
            byte bM32097x = name.m32097x(i2);
            if (b2 <= bM32097x && b3 >= bM32097x) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.m32095S());
            }
        }
        return name;
    }

    public final Map<C9710i, Integer> getNAME_TO_FIRST_INDEX() {
        return NAME_TO_FIRST_INDEX;
    }

    public final Header[] getSTATIC_HEADER_TABLE() {
        return STATIC_HEADER_TABLE;
    }

    /* compiled from: Hpack.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u00100\u001a\u000208\u0012\u0006\u00103\u001a\u00020\u0006\u0012\b\b\u0002\u0010\"\u001a\u00020\u0006¢\u0006\u0004\b9\u0010:J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u001f¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010\u001eJ\r\u0010#\u001a\u00020\u0002¢\u0006\u0004\b#\u0010\u0004J\u001d\u0010&\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0006¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0013¢\u0006\u0004\b(\u0010)R\u001e\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190*8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b2\u0010.R\u0016\u00103\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010.R\u0016\u00104\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010.R\u001c\u00106\u001a\b\u0012\u0004\u0012\u00020\u0019058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010.¨\u0006;"}, m32267d2 = {"Lokhttp3/internal/http2/Hpack$Reader;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/u;", "adjustDynamicTableByteCount", "()V", "clearDynamicTable", HttpUrl.FRAGMENT_ENCODE_SET, "bytesToRecover", "evictToRecoverBytes", "(I)I", "index", "readIndexedHeader", "(I)V", "dynamicTableIndex", "readLiteralHeaderWithoutIndexingIndexedName", "readLiteralHeaderWithoutIndexingNewName", "nameIndex", "readLiteralHeaderWithIncrementalIndexingIndexedName", "readLiteralHeaderWithIncrementalIndexingNewName", "Lj/i;", "getName", "(I)Lj/i;", HttpUrl.FRAGMENT_ENCODE_SET, "isStaticHeader", "(I)Z", "Lokhttp3/internal/http2/Header;", "entry", "insertIntoDynamicTable", "(ILokhttp3/internal/http2/Header;)V", "readByte", "()I", HttpUrl.FRAGMENT_ENCODE_SET, "getAndResetHeaderList", "()Ljava/util/List;", "maxDynamicTableByteCount", "readHeaders", "firstByte", "prefixMask", "readInt", "(II)I", "readByteString", "()Lj/i;", HttpUrl.FRAGMENT_ENCODE_SET, "dynamicTable", "[Lokhttp3/internal/http2/Header;", "dynamicTableByteCount", "I", "Lj/h;", "source", "Lj/h;", "headerCount", "headerTableSizeSetting", "nextHeaderIndex", HttpUrl.FRAGMENT_ENCODE_SET, "headerList", "Ljava/util/List;", "Lj/d0;", "<init>", "(Lj/d0;II)V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    public static final class Reader {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        public int headerCount;
        private final List<Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final InterfaceC9709h source;

        public Reader(InterfaceC9700d0 interfaceC9700d0, int i2) {
            this(interfaceC9700d0, i2, 0, 4, null);
        }

        public Reader(InterfaceC9700d0 interfaceC9700d0, int i2, int i3) {
            C9801m.m32346f(interfaceC9700d0, "source");
            this.headerTableSizeSetting = i2;
            this.maxDynamicTableByteCount = i3;
            this.headerList = new ArrayList();
            this.source = C9718q.m32120d(interfaceC9700d0);
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = r2.length - 1;
        }

        private final void adjustDynamicTableByteCount() {
            int i2 = this.maxDynamicTableByteCount;
            int i3 = this.dynamicTableByteCount;
            if (i2 < i3) {
                if (i2 == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i3 - i2);
                }
            }
        }

        private final void clearDynamicTable() {
            C10801m.m38712m(this.dynamicTable, null, 0, 0, 6, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int dynamicTableIndex(int index) {
            return this.nextHeaderIndex + 1 + index;
        }

        private final int evictToRecoverBytes(int bytesToRecover) {
            int i2;
            int i3 = 0;
            if (bytesToRecover > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i2 = this.nextHeaderIndex;
                    if (length < i2 || bytesToRecover <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    C9801m.m32343c(header);
                    int i4 = header.hpackSize;
                    bytesToRecover -= i4;
                    this.dynamicTableByteCount -= i4;
                    this.headerCount--;
                    i3++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i2 + 1, headerArr, i2 + 1 + i3, this.headerCount);
                this.nextHeaderIndex += i3;
            }
            return i3;
        }

        private final C9710i getName(int index) throws IOException {
            if (isStaticHeader(index)) {
                return Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[index].name;
            }
            int iDynamicTableIndex = dynamicTableIndex(index - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (iDynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (iDynamicTableIndex < headerArr.length) {
                    Header header = headerArr[iDynamicTableIndex];
                    C9801m.m32343c(header);
                    return header.name;
                }
            }
            throw new IOException("Header index too large " + (index + 1));
        }

        private final void insertIntoDynamicTable(int index, Header entry) {
            this.headerList.add(entry);
            int i2 = entry.hpackSize;
            if (index != -1) {
                Header header = this.dynamicTable[dynamicTableIndex(index)];
                C9801m.m32343c(header);
                i2 -= header.hpackSize;
            }
            int i3 = this.maxDynamicTableByteCount;
            if (i2 > i3) {
                clearDynamicTable();
                return;
            }
            int iEvictToRecoverBytes = evictToRecoverBytes((this.dynamicTableByteCount + i2) - i3);
            if (index == -1) {
                int i4 = this.headerCount + 1;
                Header[] headerArr = this.dynamicTable;
                if (i4 > headerArr.length) {
                    Header[] headerArr2 = new Header[headerArr.length * 2];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = headerArr2;
                }
                int i5 = this.nextHeaderIndex;
                this.nextHeaderIndex = i5 - 1;
                this.dynamicTable[i5] = entry;
                this.headerCount++;
            } else {
                this.dynamicTable[index + dynamicTableIndex(index) + iEvictToRecoverBytes] = entry;
            }
            this.dynamicTableByteCount += i2;
        }

        private final boolean isStaticHeader(int index) {
            return index >= 0 && index <= Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length - 1;
        }

        private final int readByte() throws IOException {
            return Util.and(this.source.readByte(), 255);
        }

        private final void readIndexedHeader(int index) throws IOException {
            if (isStaticHeader(index)) {
                this.headerList.add(Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[index]);
                return;
            }
            int iDynamicTableIndex = dynamicTableIndex(index - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (iDynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (iDynamicTableIndex < headerArr.length) {
                    List<Header> list = this.headerList;
                    Header header = headerArr[iDynamicTableIndex];
                    C9801m.m32343c(header);
                    list.add(header);
                    return;
                }
            }
            throw new IOException("Header index too large " + (index + 1));
        }

        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int nameIndex) throws IOException {
            insertIntoDynamicTable(-1, new Header(getName(nameIndex), readByteString()));
        }

        private final void readLiteralHeaderWithIncrementalIndexingNewName() throws IOException {
            insertIntoDynamicTable(-1, new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingIndexedName(int index) throws IOException {
            this.headerList.add(new Header(getName(index), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingNewName() throws IOException {
            this.headerList.add(new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        public final List<Header> getAndResetHeaderList() {
            List<Header> listM38569E0 = C10782c0.m38569E0(this.headerList);
            this.headerList.clear();
            return listM38569E0;
        }

        /* renamed from: maxDynamicTableByteCount, reason: from getter */
        public final int getMaxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        public final C9710i readByteString() throws IOException {
            int i2 = readByte();
            boolean z = (i2 & 128) == 128;
            long j2 = readInt(i2, 127);
            if (!z) {
                return this.source.mo32058u(j2);
            }
            C9703f c9703f = new C9703f();
            Huffman.INSTANCE.decode(this.source, j2, c9703f);
            return c9703f.mo32003D0();
        }

        public final void readHeaders() throws IOException {
            while (!this.source.mo32019R()) {
                int iAnd = Util.and(this.source.readByte(), 255);
                if (iAnd == 128) {
                    throw new IOException("index == 0");
                }
                if ((iAnd & 128) == 128) {
                    readIndexedHeader(readInt(iAnd, 127) - 1);
                } else if (iAnd == 64) {
                    readLiteralHeaderWithIncrementalIndexingNewName();
                } else if ((iAnd & 64) == 64) {
                    readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(iAnd, 63) - 1);
                } else if ((iAnd & 32) == 32) {
                    int i2 = readInt(iAnd, 31);
                    this.maxDynamicTableByteCount = i2;
                    if (i2 < 0 || i2 > this.headerTableSizeSetting) {
                        throw new IOException("Invalid dynamic table size update " + this.maxDynamicTableByteCount);
                    }
                    adjustDynamicTableByteCount();
                } else if (iAnd == 16 || iAnd == 0) {
                    readLiteralHeaderWithoutIndexingNewName();
                } else {
                    readLiteralHeaderWithoutIndexingIndexedName(readInt(iAnd, 15) - 1);
                }
            }
        }

        public final int readInt(int firstByte, int prefixMask) throws IOException {
            int i2 = firstByte & prefixMask;
            if (i2 < prefixMask) {
                return i2;
            }
            int i3 = 0;
            while (true) {
                int i4 = readByte();
                if ((i4 & 128) == 0) {
                    return prefixMask + (i4 << i3);
                }
                prefixMask += (i4 & 127) << i3;
                i3 += 7;
            }
        }

        public /* synthetic */ Reader(InterfaceC9700d0 interfaceC9700d0, int i2, int i3, int i4, C9789g c9789g) {
            this(interfaceC9700d0, i2, (i4 & 4) != 0 ? i2 : i3);
        }
    }

    /* compiled from: Hpack.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0005\u0012\b\b\u0002\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b.\u0010/J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0004J\u001b\u0010\u0010\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u001b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u0016\u0010\"\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\"\u0010!R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0016\u0010'\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010!R\u0016\u0010(\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b(\u0010!R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010!R\u0016\u0010-\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b-\u0010!¨\u00060"}, m32267d2 = {"Lokhttp3/internal/http2/Hpack$Writer;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/u;", "clearDynamicTable", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "bytesToRecover", "evictToRecoverBytes", "(I)I", "Lokhttp3/internal/http2/Header;", "entry", "insertIntoDynamicTable", "(Lokhttp3/internal/http2/Header;)V", "adjustDynamicTableByteCount", HttpUrl.FRAGMENT_ENCODE_SET, "headerBlock", "writeHeaders", "(Ljava/util/List;)V", "value", "prefixMask", "bits", "writeInt", "(III)V", "Lj/i;", "data", "writeByteString", "(Lj/i;)V", "headerTableSizeSetting", "resizeHeaderTable", "(I)V", HttpUrl.FRAGMENT_ENCODE_SET, "dynamicTable", "[Lokhttp3/internal/http2/Header;", "I", "dynamicTableByteCount", HttpUrl.FRAGMENT_ENCODE_SET, "emitDynamicTableSizeUpdate", "Z", "useCompression", "smallestHeaderTableSizeSetting", "maxDynamicTableByteCount", "Lj/f;", "out", "Lj/f;", "nextHeaderIndex", "headerCount", "<init>", "(IZLj/f;)V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    public static final class Writer {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        public int headerCount;
        public int headerTableSizeSetting;
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final C9703f out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        public Writer(int i2, C9703f c9703f) {
            this(i2, false, c9703f, 2, null);
        }

        public Writer(int i2, boolean z, C9703f c9703f) {
            C9801m.m32346f(c9703f, "out");
            this.headerTableSizeSetting = i2;
            this.useCompression = z;
            this.out = c9703f;
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.maxDynamicTableByteCount = i2;
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = r2.length - 1;
        }

        public Writer(C9703f c9703f) {
            this(0, false, c9703f, 3, null);
        }

        private final void adjustDynamicTableByteCount() {
            int i2 = this.maxDynamicTableByteCount;
            int i3 = this.dynamicTableByteCount;
            if (i2 < i3) {
                if (i2 == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i3 - i2);
                }
            }
        }

        private final void clearDynamicTable() {
            C10801m.m38712m(this.dynamicTable, null, 0, 0, 6, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int evictToRecoverBytes(int bytesToRecover) {
            int i2;
            int i3 = 0;
            if (bytesToRecover > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i2 = this.nextHeaderIndex;
                    if (length < i2 || bytesToRecover <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    C9801m.m32343c(header);
                    bytesToRecover -= header.hpackSize;
                    int i4 = this.dynamicTableByteCount;
                    Header header2 = this.dynamicTable[length];
                    C9801m.m32343c(header2);
                    this.dynamicTableByteCount = i4 - header2.hpackSize;
                    this.headerCount--;
                    i3++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i2 + 1, headerArr, i2 + 1 + i3, this.headerCount);
                Header[] headerArr2 = this.dynamicTable;
                int i5 = this.nextHeaderIndex;
                Arrays.fill(headerArr2, i5 + 1, i5 + 1 + i3, (Object) null);
                this.nextHeaderIndex += i3;
            }
            return i3;
        }

        private final void insertIntoDynamicTable(Header entry) {
            int i2 = entry.hpackSize;
            int i3 = this.maxDynamicTableByteCount;
            if (i2 > i3) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i2) - i3);
            int i4 = this.headerCount + 1;
            Header[] headerArr = this.dynamicTable;
            if (i4 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i5 = this.nextHeaderIndex;
            this.nextHeaderIndex = i5 - 1;
            this.dynamicTable[i5] = entry;
            this.headerCount++;
            this.dynamicTableByteCount += i2;
        }

        public final void resizeHeaderTable(int headerTableSizeSetting) {
            this.headerTableSizeSetting = headerTableSizeSetting;
            int iMin = Math.min(headerTableSizeSetting, 16384);
            int i2 = this.maxDynamicTableByteCount;
            if (i2 == iMin) {
                return;
            }
            if (iMin < i2) {
                this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, iMin);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = iMin;
            adjustDynamicTableByteCount();
        }

        public final void writeByteString(C9710i data) throws IOException {
            C9801m.m32346f(data, "data");
            if (this.useCompression) {
                Huffman huffman = Huffman.INSTANCE;
                if (huffman.encodedLength(data) < data.m32093P()) {
                    C9703f c9703f = new C9703f();
                    huffman.encode(data, c9703f);
                    C9710i c9710iMo32003D0 = c9703f.mo32003D0();
                    writeInt(c9710iMo32003D0.m32093P(), 127, 128);
                    this.out.mo32023U0(c9710iMo32003D0);
                    return;
                }
            }
            writeInt(data.m32093P(), 127, 0);
            this.out.mo32023U0(data);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void writeHeaders(java.util.List<okhttp3.internal.http2.Header> r14) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 268
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Hpack.Writer.writeHeaders(java.util.List):void");
        }

        public final void writeInt(int value, int prefixMask, int bits) {
            if (value < prefixMask) {
                this.out.writeByte(value | bits);
                return;
            }
            this.out.writeByte(bits | prefixMask);
            int i2 = value - prefixMask;
            while (i2 >= 128) {
                this.out.writeByte(128 | (i2 & 127));
                i2 >>>= 7;
            }
            this.out.writeByte(i2);
        }

        public /* synthetic */ Writer(int i2, boolean z, C9703f c9703f, int i3, C9789g c9789g) {
            this((i3 & 1) != 0 ? 4096 : i2, (i3 & 2) != 0 ? true : z, c9703f);
        }
    }
}
