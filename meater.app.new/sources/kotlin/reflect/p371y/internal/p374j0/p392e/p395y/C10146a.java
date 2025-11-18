package kotlin.reflect.p371y.internal.p374j0.p392e.p395y;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.C10782c0;
import kotlin.collections.C10819v;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.ranges.IntRange;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.AbstractC10149a;

/* compiled from: BuiltInsBinaryVersion.kt */
/* renamed from: kotlin.f0.y.e.j0.e.y.a */
/* loaded from: classes3.dex */
public final class C10146a extends AbstractC10149a {

    /* renamed from: g */
    public static final a f39168g = new a(null);

    /* renamed from: h */
    public static final C10146a f39169h = new C10146a(1, 0, 7);

    /* renamed from: i */
    public static final C10146a f39170i = new C10146a(new int[0]);

    /* compiled from: BuiltInsBinaryVersion.kt */
    /* renamed from: kotlin.f0.y.e.j0.e.y.a$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final C10146a m35355a(InputStream inputStream) {
            C9801m.m32346f(inputStream, "stream");
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            IntRange intRange = new IntRange(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(C10819v.m38911u(intRange, 10));
            Iterator<Integer> it = intRange.iterator();
            while (it.hasNext()) {
                ((IntIterator) it).mo32397b();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] iArrM38568D0 = C10782c0.m38568D0(arrayList);
            return new C10146a(Arrays.copyOf(iArrM38568D0, iArrM38568D0.length));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10146a(int... iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
        C9801m.m32346f(iArr, "numbers");
    }

    /* renamed from: h */
    public boolean m35354h() {
        return m35363f(f39169h);
    }
}
