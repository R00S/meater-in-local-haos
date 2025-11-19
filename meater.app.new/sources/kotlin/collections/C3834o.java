package kotlin.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _ArraysJvm.kt */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u0018\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002*\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000e\u001a\u00020\u0006*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000f\u001aS\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a9\u0010\u0017\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00162\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a9\u0010\u0019\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a9\u0010\u001c\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u001b2\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a9\u0010\u001e\u001a\u00020\t*\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a5\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0001¢\u0006\u0004\b \u0010!\u001a#\u0010\"\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\"\u0010#\u001a9\u0010%\u001a\u00020$\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00028\u00002\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&\u001a-\u0010'\u001a\u00020$*\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b'\u0010(\u001a-\u0010*\u001a\u00020$*\u00020\u001b2\u0006\u0010\u000b\u001a\u00020)2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b*\u0010+\u001a.\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b,\u0010-\u001a\u001c\u0010.\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b.\u0010/\u001a6\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u00100\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0004\b1\u00102\u001a\u001c\u00103\u001a\u00020\u0005*\u00020\u00052\u0006\u00100\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b3\u00104\u001a\u001c\u00105\u001a\u00020\u001b*\u00020\u001b2\u0006\u00100\u001a\u00020\u001bH\u0086\u0002¢\u0006\u0004\b5\u00106\u001a\u001c\u00107\u001a\u00020\t*\u00020\t2\u0006\u00100\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b7\u00108\u001a\u001c\u0010:\u001a\u000209*\u0002092\u0006\u00100\u001a\u000209H\u0086\u0002¢\u0006\u0004\b:\u0010;\u001a\u001f\u0010<\u001a\u00020$\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b<\u0010=\u001a%\u0010>\u001a\u00020$*\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b>\u0010?\u001a;\u0010C\u001a\u00020$\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010B\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000@j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`A¢\u0006\u0004\bC\u0010D\u001aO\u0010E\u001a\u00020$\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010B\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000@j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`A2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\bE\u0010F\u001a\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u0005¢\u0006\u0004\bG\u0010H\u001a\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020)0\u0001*\u00020\u001b¢\u0006\u0004\bI\u0010J\u001a\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00020\n0\u0001*\u00020\t¢\u0006\u0004\bK\u0010L\u001a\u0017\u0010N\u001a\b\u0012\u0004\u0012\u00020M0\u0001*\u000209¢\u0006\u0004\bN\u0010O¨\u0006P"}, d2 = {"T", "", "", "e", "([Ljava/lang/Object;)Ljava/util/List;", "", "", "d", "([I)Ljava/util/List;", "", "", "element", "fromIndex", "toIndex", "f", "([FFII)I", "destination", "destinationOffset", "startIndex", "endIndex", "l", "([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;", "", "h", "([B[BIII)[B", "j", "([I[IIII)[I", "", "k", "([J[JIII)[J", "i", "([F[FIII)[F", "r", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "q", "([BII)[B", "Loa/F;", "u", "([Ljava/lang/Object;Ljava/lang/Object;II)V", "s", "([IIII)V", "", "t", "([JJII)V", "C", "([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", "z", "([II)[I", "elements", "D", "([Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;", "A", "([I[I)[I", "B", "([J[J)[J", "y", "([F[F)[F", "", "E", "([Z[Z)[Z", "G", "([Ljava/lang/Object;)V", "F", "([III)V", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "H", "([Ljava/lang/Object;Ljava/util/Comparator;)V", "I", "([Ljava/lang/Object;Ljava/util/Comparator;II)V", "L", "([I)[Ljava/lang/Integer;", "M", "([J)[Ljava/lang/Long;", "K", "([F)[Ljava/lang/Float;", "", "J", "([Z)[Ljava/lang/Boolean;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
/* renamed from: kotlin.collections.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3834o extends C3833n {

    /* compiled from: _ArraysJvm.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"kotlin/collections/o$a", "Lkotlin/collections/c;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "isEmpty", "()Z", "element", "c", "(I)Z", "index", "h", "(I)Ljava/lang/Integer;", "i", "(I)I", "j", "getSize", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.o$a */
    public static final class a extends AbstractC3822c<Integer> implements RandomAccess {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ int[] f43959B;

        a(int[] iArr) {
            this.f43959B = iArr;
        }

        public boolean c(int element) {
            return C3831l.Q(this.f43959B, element);
        }

        @Override // kotlin.collections.AbstractC3820a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Integer) {
                return c(((Number) obj).intValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractC3822c, kotlin.collections.AbstractC3820a
        /* renamed from: getSize */
        public int get_size() {
            return this.f43959B.length;
        }

        @Override // kotlin.collections.AbstractC3822c, java.util.List
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer get(int index) {
            return Integer.valueOf(this.f43959B[index]);
        }

        public int i(int element) {
            return C3835p.g0(this.f43959B, element);
        }

        @Override // kotlin.collections.AbstractC3822c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return i(((Number) obj).intValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractC3820a, java.util.Collection
        public boolean isEmpty() {
            return this.f43959B.length == 0;
        }

        public int j(int element) {
            return C3835p.p0(this.f43959B, element);
        }

        @Override // kotlin.collections.AbstractC3822c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return j(((Number) obj).intValue());
            }
            return -1;
        }
    }

    public static int[] A(int[] iArr, int[] elements) {
        C3862t.g(iArr, "<this>");
        C3862t.g(elements, "elements");
        int length = iArr.length;
        int length2 = elements.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(elements, 0, iArrCopyOf, length, length2);
        C3862t.d(iArrCopyOf);
        return iArrCopyOf;
    }

    public static long[] B(long[] jArr, long[] elements) {
        C3862t.g(jArr, "<this>");
        C3862t.g(elements, "elements");
        int length = jArr.length;
        int length2 = elements.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(elements, 0, jArrCopyOf, length, length2);
        C3862t.d(jArrCopyOf);
        return jArrCopyOf;
    }

    public static <T> T[] C(T[] tArr, T t10) {
        C3862t.g(tArr, "<this>");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + 1);
        tArr2[length] = t10;
        C3862t.d(tArr2);
        return tArr2;
    }

    public static <T> T[] D(T[] tArr, T[] elements) {
        C3862t.g(tArr, "<this>");
        C3862t.g(elements, "elements");
        int length = tArr.length;
        int length2 = elements.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(elements, 0, tArr2, length, length2);
        C3862t.d(tArr2);
        return tArr2;
    }

    public static boolean[] E(boolean[] zArr, boolean[] elements) {
        C3862t.g(zArr, "<this>");
        C3862t.g(elements, "elements");
        int length = zArr.length;
        int length2 = elements.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(elements, 0, zArrCopyOf, length, length2);
        C3862t.d(zArrCopyOf);
        return zArrCopyOf;
    }

    public static void F(int[] iArr, int i10, int i11) {
        C3862t.g(iArr, "<this>");
        Arrays.sort(iArr, i10, i11);
    }

    public static <T> void G(T[] tArr) {
        C3862t.g(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static final <T> void H(T[] tArr, Comparator<? super T> comparator) {
        C3862t.g(tArr, "<this>");
        C3862t.g(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    public static <T> void I(T[] tArr, Comparator<? super T> comparator, int i10, int i11) {
        C3862t.g(tArr, "<this>");
        C3862t.g(comparator, "comparator");
        Arrays.sort(tArr, i10, i11, comparator);
    }

    public static Boolean[] J(boolean[] zArr) {
        C3862t.g(zArr, "<this>");
        Boolean[] boolArr = new Boolean[zArr.length];
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            boolArr[i10] = Boolean.valueOf(zArr[i10]);
        }
        return boolArr;
    }

    public static Float[] K(float[] fArr) {
        C3862t.g(fArr, "<this>");
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            fArr2[i10] = Float.valueOf(fArr[i10]);
        }
        return fArr2;
    }

    public static Integer[] L(int[] iArr) {
        C3862t.g(iArr, "<this>");
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            numArr[i10] = Integer.valueOf(iArr[i10]);
        }
        return numArr;
    }

    public static Long[] M(long[] jArr) {
        C3862t.g(jArr, "<this>");
        Long[] lArr = new Long[jArr.length];
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            lArr[i10] = Long.valueOf(jArr[i10]);
        }
        return lArr;
    }

    public static List<Integer> d(int[] iArr) {
        C3862t.g(iArr, "<this>");
        return new a(iArr);
    }

    public static <T> List<T> e(T[] tArr) {
        C3862t.g(tArr, "<this>");
        List<T> listA = C3836q.a(tArr);
        C3862t.f(listA, "asList(...)");
        return listA;
    }

    public static final int f(float[] fArr, float f10, int i10, int i11) {
        C3862t.g(fArr, "<this>");
        return Arrays.binarySearch(fArr, i10, i11, f10);
    }

    public static /* synthetic */ int g(float[] fArr, float f10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length;
        }
        return f(fArr, f10, i10, i11);
    }

    public static byte[] h(byte[] bArr, byte[] destination, int i10, int i11, int i12) {
        C3862t.g(bArr, "<this>");
        C3862t.g(destination, "destination");
        System.arraycopy(bArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static float[] i(float[] fArr, float[] destination, int i10, int i11, int i12) {
        C3862t.g(fArr, "<this>");
        C3862t.g(destination, "destination");
        System.arraycopy(fArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static int[] j(int[] iArr, int[] destination, int i10, int i11, int i12) {
        C3862t.g(iArr, "<this>");
        C3862t.g(destination, "destination");
        System.arraycopy(iArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static long[] k(long[] jArr, long[] destination, int i10, int i11, int i12) {
        C3862t.g(jArr, "<this>");
        C3862t.g(destination, "destination");
        System.arraycopy(jArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static <T> T[] l(T[] tArr, T[] destination, int i10, int i11, int i12) {
        C3862t.g(tArr, "<this>");
        C3862t.g(destination, "destination");
        System.arraycopy(tArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static /* synthetic */ byte[] m(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        return C3831l.h(bArr, bArr2, i10, i11, i12);
    }

    public static /* synthetic */ float[] n(float[] fArr, float[] fArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = fArr.length;
        }
        return C3831l.i(fArr, fArr2, i10, i11, i12);
    }

    public static /* synthetic */ int[] o(int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = iArr.length;
        }
        return C3831l.j(iArr, iArr2, i10, i11, i12);
    }

    public static /* synthetic */ Object[] p(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return C3831l.l(objArr, objArr2, i10, i11, i12);
    }

    public static byte[] q(byte[] bArr, int i10, int i11) {
        C3862t.g(bArr, "<this>");
        C3832m.b(i11, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        C3862t.f(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static <T> T[] r(T[] tArr, int i10, int i11) {
        C3862t.g(tArr, "<this>");
        C3832m.b(i11, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i10, i11);
        C3862t.f(tArr2, "copyOfRange(...)");
        return tArr2;
    }

    public static final void s(int[] iArr, int i10, int i11, int i12) {
        C3862t.g(iArr, "<this>");
        Arrays.fill(iArr, i11, i12, i10);
    }

    public static final void t(long[] jArr, long j10, int i10, int i11) {
        C3862t.g(jArr, "<this>");
        Arrays.fill(jArr, i10, i11, j10);
    }

    public static <T> void u(T[] tArr, T t10, int i10, int i11) {
        C3862t.g(tArr, "<this>");
        Arrays.fill(tArr, i10, i11, t10);
    }

    public static /* synthetic */ void v(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = iArr.length;
        }
        s(iArr, i10, i11, i12);
    }

    public static /* synthetic */ void w(long[] jArr, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length;
        }
        t(jArr, j10, i10, i11);
    }

    public static /* synthetic */ void x(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        C3831l.u(objArr, obj, i10, i11);
    }

    public static float[] y(float[] fArr, float[] elements) {
        C3862t.g(fArr, "<this>");
        C3862t.g(elements, "elements");
        int length = fArr.length;
        int length2 = elements.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(elements, 0, fArrCopyOf, length, length2);
        C3862t.d(fArrCopyOf);
        return fArrCopyOf;
    }

    public static int[] z(int[] iArr, int i10) {
        C3862t.g(iArr, "<this>");
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
        iArrCopyOf[length] = i10;
        C3862t.d(iArrCopyOf);
        return iArrCopyOf;
    }
}
