package androidx.media3.extractor.flv;

import X1.y;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import v2.C4807m;

/* compiled from: ScriptTagPayloadReader.java */
/* loaded from: classes.dex */
final class c extends TagPayloadReader {

    /* renamed from: b, reason: collision with root package name */
    private long f28058b;

    /* renamed from: c, reason: collision with root package name */
    private long[] f28059c;

    /* renamed from: d, reason: collision with root package name */
    private long[] f28060d;

    public c() {
        super(new C4807m());
        this.f28058b = -9223372036854775807L;
        this.f28059c = new long[0];
        this.f28060d = new long[0];
    }

    private static Boolean g(y yVar) {
        return Boolean.valueOf(yVar.H() == 1);
    }

    private static Object h(y yVar, int i10) {
        if (i10 == 0) {
            return j(yVar);
        }
        if (i10 == 1) {
            return g(yVar);
        }
        if (i10 == 2) {
            return n(yVar);
        }
        if (i10 == 3) {
            return l(yVar);
        }
        if (i10 == 8) {
            return k(yVar);
        }
        if (i10 == 10) {
            return m(yVar);
        }
        if (i10 != 11) {
            return null;
        }
        return i(yVar);
    }

    private static Date i(y yVar) {
        Date date = new Date((long) j(yVar).doubleValue());
        yVar.X(2);
        return date;
    }

    private static Double j(y yVar) {
        return Double.valueOf(Double.longBitsToDouble(yVar.A()));
    }

    private static HashMap<String, Object> k(y yVar) {
        int iL = yVar.L();
        HashMap<String, Object> map = new HashMap<>(iL);
        for (int i10 = 0; i10 < iL; i10++) {
            String strN = n(yVar);
            Object objH = h(yVar, o(yVar));
            if (objH != null) {
                map.put(strN, objH);
            }
        }
        return map;
    }

    private static HashMap<String, Object> l(y yVar) {
        HashMap<String, Object> map = new HashMap<>();
        while (true) {
            String strN = n(yVar);
            int iO = o(yVar);
            if (iO == 9) {
                return map;
            }
            Object objH = h(yVar, iO);
            if (objH != null) {
                map.put(strN, objH);
            }
        }
    }

    private static ArrayList<Object> m(y yVar) {
        int iL = yVar.L();
        ArrayList<Object> arrayList = new ArrayList<>(iL);
        for (int i10 = 0; i10 < iL; i10++) {
            Object objH = h(yVar, o(yVar));
            if (objH != null) {
                arrayList.add(objH);
            }
        }
        return arrayList;
    }

    private static String n(y yVar) {
        int iP = yVar.P();
        int iF = yVar.f();
        yVar.X(iP);
        return new String(yVar.e(), iF, iP);
    }

    private static int o(y yVar) {
        return yVar.H();
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean b(y yVar) {
        return true;
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean c(y yVar, long j10) {
        if (o(yVar) != 2 || !"onMetaData".equals(n(yVar)) || yVar.a() == 0 || o(yVar) != 8) {
            return false;
        }
        HashMap<String, Object> mapK = k(yVar);
        Object obj = mapK.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f28058b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapK.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f28059c = new long[size];
                this.f28060d = new long[size];
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f28059c = new long[0];
                        this.f28060d = new long[0];
                        break;
                    }
                    this.f28059c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f28060d[i10] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public long d() {
        return this.f28058b;
    }

    public long[] e() {
        return this.f28060d;
    }

    public long[] f() {
        return this.f28059c;
    }
}
