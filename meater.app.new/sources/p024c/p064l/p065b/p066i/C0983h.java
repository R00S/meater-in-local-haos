package p024c.p064l.p065b.p066i;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.InterfaceC0345j;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C10775u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10782c0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C9801m;
import p024c.p064l.p065b.C0971d;
import p024c.p064l.p065b.C0973f;
import p024c.p064l.p065b.C0974g;
import p024c.p064l.p065b.C0975h;
import p024c.p064l.p065b.p066i.AbstractC0979d;

/* compiled from: PreferencesSerializer.kt */
/* renamed from: c.l.b.i.h */
/* loaded from: classes.dex */
public final class C0983h implements InterfaceC0345j<AbstractC0979d> {

    /* renamed from: a */
    public static final C0983h f6497a = new C0983h();

    /* renamed from: b */
    private static final String f6498b = "preferences_pb";

    /* compiled from: PreferencesSerializer.kt */
    /* renamed from: c.l.b.i.h$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6499a;

        static {
            int[] iArr = new int[C0975h.b.values().length];
            iArr[C0975h.b.BOOLEAN.ordinal()] = 1;
            iArr[C0975h.b.FLOAT.ordinal()] = 2;
            iArr[C0975h.b.DOUBLE.ordinal()] = 3;
            iArr[C0975h.b.INTEGER.ordinal()] = 4;
            iArr[C0975h.b.LONG.ordinal()] = 5;
            iArr[C0975h.b.STRING.ordinal()] = 6;
            iArr[C0975h.b.STRING_SET.ordinal()] = 7;
            iArr[C0975h.b.VALUE_NOT_SET.ordinal()] = 8;
            f6499a = iArr;
        }
    }

    private C0983h() {
    }

    /* renamed from: d */
    private final void m6265d(String str, C0975h c0975h, C0976a c0976a) throws CorruptionException {
        C0975h.b bVarM6228Z = c0975h.m6228Z();
        switch (bVarM6228Z == null ? -1 : a.f6499a[bVarM6228Z.ordinal()]) {
            case -1:
                throw new CorruptionException("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                c0976a.m6243i(C0981f.m6256a(str), Boolean.valueOf(c0975h.m6221R()));
                return;
            case 2:
                c0976a.m6243i(C0981f.m6258c(str), Float.valueOf(c0975h.m6223U()));
                return;
            case 3:
                c0976a.m6243i(C0981f.m6257b(str), Double.valueOf(c0975h.m6222T()));
                return;
            case 4:
                c0976a.m6243i(C0981f.m6259d(str), Integer.valueOf(c0975h.m6224V()));
                return;
            case 5:
                c0976a.m6243i(C0981f.m6260e(str), Long.valueOf(c0975h.m6225W()));
                return;
            case 6:
                AbstractC0979d.a<String> aVarM6261f = C0981f.m6261f(str);
                String strM6226X = c0975h.m6226X();
                C9801m.m32345e(strM6226X, "value.string");
                c0976a.m6243i(aVarM6261f, strM6226X);
                return;
            case 7:
                AbstractC0979d.a<Set<String>> aVarM6262g = C0981f.m6262g(str);
                List<String> listM6202O = c0975h.m6227Y().m6202O();
                C9801m.m32345e(listM6202O, "value.stringSet.stringsList");
                c0976a.m6243i(aVarM6262g, C10782c0.m38574I0(listM6202O));
                return;
            case 8:
                throw new CorruptionException("Value not set.", null, 2, null);
        }
    }

    /* renamed from: g */
    private final C0975h m6266g(Object obj) {
        if (obj instanceof Boolean) {
            C0975h c0975hMo3158c = C0975h.m6213a0().m6235w(((Boolean) obj).booleanValue()).mo3158c();
            C9801m.m32345e(c0975hMo3158c, "newBuilder().setBoolean(value).build()");
            return c0975hMo3158c;
        }
        if (obj instanceof Float) {
            C0975h c0975hMo3158c2 = C0975h.m6213a0().m6230B(((Number) obj).floatValue()).mo3158c();
            C9801m.m32345e(c0975hMo3158c2, "newBuilder().setFloat(value).build()");
            return c0975hMo3158c2;
        }
        if (obj instanceof Double) {
            C0975h c0975hMo3158c3 = C0975h.m6213a0().m6229A(((Number) obj).doubleValue()).mo3158c();
            C9801m.m32345e(c0975hMo3158c3, "newBuilder().setDouble(value).build()");
            return c0975hMo3158c3;
        }
        if (obj instanceof Integer) {
            C0975h c0975hMo3158c4 = C0975h.m6213a0().m6231C(((Number) obj).intValue()).mo3158c();
            C9801m.m32345e(c0975hMo3158c4, "newBuilder().setInteger(value).build()");
            return c0975hMo3158c4;
        }
        if (obj instanceof Long) {
            C0975h c0975hMo3158c5 = C0975h.m6213a0().m6232D(((Number) obj).longValue()).mo3158c();
            C9801m.m32345e(c0975hMo3158c5, "newBuilder().setLong(value).build()");
            return c0975hMo3158c5;
        }
        if (obj instanceof String) {
            C0975h c0975hMo3158c6 = C0975h.m6213a0().m6233E((String) obj).mo3158c();
            C9801m.m32345e(c0975hMo3158c6, "newBuilder().setString(value).build()");
            return c0975hMo3158c6;
        }
        if (!(obj instanceof Set)) {
            throw new IllegalStateException(C9801m.m32354n("PreferencesSerializer does not support type: ", obj.getClass().getName()));
        }
        C0975h c0975hMo3158c7 = C0975h.m6213a0().m6234F(C0974g.m6201P().m6203w((Set) obj)).mo3158c();
        C9801m.m32345e(c0975hMo3158c7, "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()");
        return c0975hMo3158c7;
    }

    @Override // androidx.datastore.core.InterfaceC0345j
    /* renamed from: c */
    public Object mo2366c(InputStream inputStream, Continuation<? super AbstractC0979d> continuation) throws IOException {
        C0973f c0973fM6186a = C0971d.f6469a.m6186a(inputStream);
        C0976a c0976aM6255b = C0980e.m6255b(new AbstractC0979d.b[0]);
        Map<String, C0975h> mapM6194M = c0973fM6186a.m6194M();
        C9801m.m32345e(mapM6194M, "preferencesProto.preferencesMap");
        for (Map.Entry<String, C0975h> entry : mapM6194M.entrySet()) {
            String key = entry.getKey();
            C0975h value = entry.getValue();
            C0983h c0983h = f6497a;
            C9801m.m32345e(key, "name");
            C9801m.m32345e(value, "value");
            c0983h.m6265d(key, value, c0976aM6255b);
        }
        return c0976aM6255b.m6250d();
    }

    @Override // androidx.datastore.core.InterfaceC0345j
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC0979d mo2364a() {
        return C0980e.m6254a();
    }

    /* renamed from: f */
    public final String m6268f() {
        return f6498b;
    }

    @Override // androidx.datastore.core.InterfaceC0345j
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Object mo2365b(AbstractC0979d abstractC0979d, OutputStream outputStream, Continuation<? super C10775u> continuation) throws IOException {
        Map<AbstractC0979d.a<?>, Object> mapMo6237a = abstractC0979d.mo6237a();
        C0973f.a aVarM6192P = C0973f.m6192P();
        for (Map.Entry<AbstractC0979d.a<?>, Object> entry : mapMo6237a.entrySet()) {
            aVarM6192P.m6195w(entry.getKey().m6251a(), m6266g(entry.getValue()));
        }
        aVarM6192P.mo3158c().m2549o(outputStream);
        return C10775u.f41439a;
    }
}
