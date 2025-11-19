package E1;

import B1.j;
import D1.f;
import D1.h;
import E1.d;
import androidx.datastore.core.CorruptionException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import ta.InterfaceC4588d;

/* compiled from: PreferencesSerializer.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"LE1/h;", "LB1/j;", "LE1/d;", "<init>", "()V", "", "value", "LD1/h;", "g", "(Ljava/lang/Object;)LD1/h;", "", "name", "LE1/a;", "mutablePreferences", "Loa/F;", "d", "(Ljava/lang/String;LD1/h;LE1/a;)V", "Ljava/io/InputStream;", "input", "c", "(Ljava/io/InputStream;Lta/d;)Ljava/lang/Object;", "t", "Ljava/io/OutputStream;", "output", "h", "(LE1/d;Ljava/io/OutputStream;Lta/d;)Ljava/lang/Object;", "b", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "fileExtension", "e", "()LE1/d;", "defaultValue", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class h implements j<d> {

    /* renamed from: a, reason: collision with root package name */
    public static final h f3812a = new h();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final String fileExtension = "preferences_pb";

    /* compiled from: PreferencesSerializer.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3814a;

        static {
            int[] iArr = new int[h.b.values().length];
            iArr[h.b.BOOLEAN.ordinal()] = 1;
            iArr[h.b.FLOAT.ordinal()] = 2;
            iArr[h.b.DOUBLE.ordinal()] = 3;
            iArr[h.b.INTEGER.ordinal()] = 4;
            iArr[h.b.LONG.ordinal()] = 5;
            iArr[h.b.STRING.ordinal()] = 6;
            iArr[h.b.STRING_SET.ordinal()] = 7;
            iArr[h.b.VALUE_NOT_SET.ordinal()] = 8;
            f3814a = iArr;
        }
    }

    private h() {
    }

    private final void d(String name, D1.h value, E1.a mutablePreferences) throws CorruptionException {
        h.b bVarB0 = value.b0();
        switch (bVarB0 == null ? -1 : a.f3814a[bVarB0.ordinal()]) {
            case -1:
                throw new CorruptionException("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                mutablePreferences.i(f.a(name), Boolean.valueOf(value.T()));
                return;
            case 2:
                mutablePreferences.i(f.c(name), Float.valueOf(value.W()));
                return;
            case 3:
                mutablePreferences.i(f.b(name), Double.valueOf(value.V()));
                return;
            case 4:
                mutablePreferences.i(f.d(name), Integer.valueOf(value.X()));
                return;
            case 5:
                mutablePreferences.i(f.e(name), Long.valueOf(value.Y()));
                return;
            case 6:
                d.a<String> aVarF = f.f(name);
                String strZ = value.Z();
                C3862t.f(strZ, "value.string");
                mutablePreferences.i(aVarF, strZ);
                return;
            case 7:
                d.a<Set<String>> aVarG = f.g(name);
                List<String> listQ = value.a0().Q();
                C3862t.f(listQ, "value.stringSet.stringsList");
                mutablePreferences.i(aVarG, r.b1(listQ));
                return;
            case 8:
                throw new CorruptionException("Value not set.", null, 2, null);
        }
    }

    private final D1.h g(Object value) {
        if (value instanceof Boolean) {
            D1.h hVarE = D1.h.c0().B(((Boolean) value).booleanValue()).e();
            C3862t.f(hVarE, "newBuilder().setBoolean(value).build()");
            return hVarE;
        }
        if (value instanceof Float) {
            D1.h hVarE2 = D1.h.c0().D(((Number) value).floatValue()).e();
            C3862t.f(hVarE2, "newBuilder().setFloat(value).build()");
            return hVarE2;
        }
        if (value instanceof Double) {
            D1.h hVarE3 = D1.h.c0().C(((Number) value).doubleValue()).e();
            C3862t.f(hVarE3, "newBuilder().setDouble(value).build()");
            return hVarE3;
        }
        if (value instanceof Integer) {
            D1.h hVarE4 = D1.h.c0().E(((Number) value).intValue()).e();
            C3862t.f(hVarE4, "newBuilder().setInteger(value).build()");
            return hVarE4;
        }
        if (value instanceof Long) {
            D1.h hVarE5 = D1.h.c0().F(((Number) value).longValue()).e();
            C3862t.f(hVarE5, "newBuilder().setLong(value).build()");
            return hVarE5;
        }
        if (value instanceof String) {
            D1.h hVarE6 = D1.h.c0().G((String) value).e();
            C3862t.f(hVarE6, "newBuilder().setString(value).build()");
            return hVarE6;
        }
        if (!(value instanceof Set)) {
            throw new IllegalStateException(C3862t.n("PreferencesSerializer does not support type: ", value.getClass().getName()));
        }
        D1.h hVarE7 = D1.h.c0().H(D1.g.R().B((Set) value)).e();
        C3862t.f(hVarE7, "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()");
        return hVarE7;
    }

    @Override // B1.j
    public Object c(InputStream inputStream, InterfaceC4588d<? super d> interfaceC4588d) throws CorruptionException {
        D1.f fVarA = D1.d.INSTANCE.a(inputStream);
        E1.a aVarB = e.b(new d.b[0]);
        Map<String, D1.h> mapO = fVarA.O();
        C3862t.f(mapO, "preferencesProto.preferencesMap");
        for (Map.Entry<String, D1.h> entry : mapO.entrySet()) {
            String name = entry.getKey();
            D1.h value = entry.getValue();
            h hVar = f3812a;
            C3862t.f(name, "name");
            C3862t.f(value, "value");
            hVar.d(name, value, aVarB);
        }
        return aVarB.d();
    }

    @Override // B1.j
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public d a() {
        return e.a();
    }

    public final String f() {
        return fileExtension;
    }

    @Override // B1.j
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Object b(d dVar, OutputStream outputStream, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Map<d.a<?>, Object> mapA = dVar.a();
        f.a aVarR = D1.f.R();
        for (Map.Entry<d.a<?>, Object> entry : mapA.entrySet()) {
            aVarR.B(entry.getKey().getName(), g(entry.getValue()));
        }
        aVarR.e().q(outputStream);
        return C4153F.f46609a;
    }
}
