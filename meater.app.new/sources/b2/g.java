package b2;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: DefaultContentMetadata.java */
/* loaded from: classes.dex */
public final class g implements e {

    /* renamed from: c, reason: collision with root package name */
    public static final g f30108c = new g(Collections.emptyMap());

    /* renamed from: a, reason: collision with root package name */
    private int f30109a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, byte[]> f30110b;

    public g() {
        this(Collections.emptyMap());
    }

    private static void e(HashMap<String, byte[]> map, Map<String, Object> map2) {
        for (Map.Entry<String, Object> entry : map2.entrySet()) {
            map.put(entry.getKey(), i(entry.getValue()));
        }
    }

    private static Map<String, byte[]> f(Map<String, byte[]> map, f fVar) {
        HashMap map2 = new HashMap(map);
        k(map2, fVar.c());
        e(map2, fVar.b());
        return map2;
    }

    private static byte[] i(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(StandardCharsets.UTF_8);
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    private static boolean j(Map<String, byte[]> map, Map<String, byte[]> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    private static void k(HashMap<String, byte[]> map, List<String> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            map.remove(list.get(i10));
        }
    }

    @Override // b2.e
    public final String b(String str, String str2) {
        byte[] bArr = this.f30110b.get(str);
        return bArr != null ? new String(bArr, StandardCharsets.UTF_8) : str2;
    }

    @Override // b2.e
    public final long c(String str, long j10) {
        byte[] bArr = this.f30110b.get(str);
        return bArr != null ? ByteBuffer.wrap(bArr).getLong() : j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        return j(this.f30110b, ((g) obj).f30110b);
    }

    public g g(f fVar) {
        Map<String, byte[]> mapF = f(this.f30110b, fVar);
        return j(this.f30110b, mapF) ? this : new g(mapF);
    }

    public Set<Map.Entry<String, byte[]>> h() {
        return this.f30110b.entrySet();
    }

    public int hashCode() {
        if (this.f30109a == 0) {
            int iHashCode = 0;
            for (Map.Entry<String, byte[]> entry : this.f30110b.entrySet()) {
                iHashCode += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.f30109a = iHashCode;
        }
        return this.f30109a;
    }

    public g(Map<String, byte[]> map) {
        this.f30110b = Collections.unmodifiableMap(map);
    }
}
