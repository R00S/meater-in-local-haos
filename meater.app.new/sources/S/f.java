package S;

import R.e;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.C1489A0;
import kotlin.Metadata;
import kotlin.collections.AbstractC3825f;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3846c;
import kotlin.jvm.internal.C3862t;

/* compiled from: PersistentVectorBuilder.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010*\n\u0002\b\u0011\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u001f\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0001\u0010\u0018J/\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\u001f\u0010 JA\u0010%\u001a\u00020$2\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b%\u0010&JA\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010(\u001a\u00020\nH\u0002¢\u0006\u0004\b)\u0010*J?\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010+\u001a\u00020\n2\u000e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070,H\u0002¢\u0006\u0004\b.\u0010/JG\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00100\u001a\u00020\n2\u0014\u00101\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u0006H\u0002¢\u0006\u0004\b2\u00103JO\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00100\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n2\u0014\u00104\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060,H\u0002¢\u0006\u0004\b5\u00106J1\u00108\u001a\u00020$2\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00107\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0002¢\u0006\u0004\b8\u00109JI\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010(\u001a\u00020\n2\u0006\u00107\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J]\u0010C\u001a\u00020$2\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>2\u0006\u00107\u001a\u00020\n2\u0006\u0010@\u001a\u00020\n2\u0016\u00101\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u0010A\u001a\u00020\n2\u000e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\bC\u0010DJW\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010E\u001a\u00020\n2\u0006\u0010@\u001a\u00020\n2\u0016\u00101\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u0010A\u001a\u00020\n2\u000e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\bF\u0010GJm\u0010J\u001a\u00020$2\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>2\u0006\u00107\u001a\u00020\n2\u000e\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010I\u001a\u00020\n2\u0016\u00101\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u0010A\u001a\u00020\n2\u000e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\bJ\u0010KJ\u001f\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u00107\u001a\u00020\nH\u0002¢\u0006\u0004\bL\u0010MJ;\u0010N\u001a\u0004\u0018\u00010\u00072\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00100\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n2\u0006\u00107\u001a\u00020\nH\u0002¢\u0006\u0004\bN\u0010OJ?\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010(\u001a\u00020\n2\u0006\u00107\u001a\u00020\n2\u0006\u0010P\u001a\u00020:H\u0002¢\u0006\u0004\bQ\u0010RJ1\u0010S\u001a\u00020$2\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00100\u001a\u00020\n2\u0006\u0010(\u001a\u00020\nH\u0002¢\u0006\u0004\bS\u0010TJA\u0010U\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010(\u001a\u00020\n2\u0006\u00100\u001a\u00020\n2\u0006\u0010P\u001a\u00020:H\u0002¢\u0006\u0004\bU\u0010RJ#\u0010X\u001a\u00020\u00152\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150VH\u0002¢\u0006\u0004\bX\u0010YJ1\u0010Z\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\bZ\u0010\u001bJ7\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u00107\u001a\u00020\n2\u0006\u0010(\u001a\u00020\nH\u0002¢\u0006\u0004\b[\u0010\\J3\u0010_\u001a\u00020\n2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150V2\u0006\u0010]\u001a\u00020\n2\u0006\u0010^\u001a\u00020:H\u0002¢\u0006\u0004\b_\u0010`JC\u0010b\u001a\u00020\n2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150V2\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010a\u001a\u00020\n2\u0006\u0010^\u001a\u00020:H\u0002¢\u0006\u0004\bb\u0010cJw\u0010g\u001a\u00020\n2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150V2\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010a\u001a\u00020\n2\u0006\u0010d\u001a\u00020\n2\u0006\u0010^\u001a\u00020:2\u0014\u0010f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060e2\u0014\u00101\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060eH\u0002¢\u0006\u0004\bg\u0010hJG\u0010k\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010(\u001a\u00020\n2\u0006\u00107\u001a\u00020\n2\u0006\u0010i\u001a\u00028\u00002\u0006\u0010j\u001a\u00020:H\u0002¢\u0006\u0004\bk\u0010=J%\u0010m\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060l2\u0006\u00107\u001a\u00020\nH\u0002¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u00020\nH\u0000¢\u0006\u0004\bo\u0010\u000fJ\u0015\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\bi\u0010pJ\u0017\u0010q\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0004\bq\u0010rJ\u001d\u0010s\u001a\u00020\u00152\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>H\u0016¢\u0006\u0004\bs\u0010tJ\u001f\u0010q\u001a\u00020$2\u0006\u00107\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0004\bq\u0010uJ%\u0010s\u001a\u00020\u00152\u0006\u00107\u001a\u00020\n2\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>H\u0016¢\u0006\u0004\bs\u0010vJ\u0018\u0010w\u001a\u00028\u00002\u0006\u00107\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\bw\u0010xJ\u0017\u0010y\u001a\u00028\u00002\u0006\u00107\u001a\u00020\nH\u0016¢\u0006\u0004\by\u0010xJ\u001d\u0010z\u001a\u00020\u00152\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>H\u0016¢\u0006\u0004\bz\u0010tJ!\u0010{\u001a\u00020\u00152\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150V¢\u0006\u0004\b{\u0010YJ \u0010|\u001a\u00028\u00002\u0006\u00107\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b|\u0010}J\u0017\u0010\u007f\u001a\b\u0012\u0004\u0012\u00028\u00000~H\u0096\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0019\u0010\u0082\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0081\u0001H\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J \u0010\u0082\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0081\u00012\u0006\u00107\u001a\u00020\nH\u0016¢\u0006\u0005\b\u0082\u0001\u0010nR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0016\u0010\u0084\u0001R\"\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bm\u0010\u0086\u0001R%\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b\u0001\u0010[\u001a\u0005\b\u0087\u0001\u0010\u000f\"\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0019\u0010\u008c\u0001\u001a\u00030\u008a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001a\u0010\u008b\u0001R;\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0011\u0010\u008d\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b\u001f\u0010\u0086\u0001\u001a\u0005\b\u008e\u0001\u0010 R7\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000f\u0010\u008d\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b\u001d\u0010\u0086\u0001\u001a\u0005\b\u008f\u0001\u0010 R&\u0010\u0010\u001a\u00020\n2\u0007\u0010\u008d\u0001\u001a\u00020\n8\u0016@RX\u0096\u000e¢\u0006\r\n\u0004\b[\u0010[\u001a\u0005\b\u0090\u0001\u0010\u000f¨\u0006\u0091\u0001"}, d2 = {"LS/f;", "E", "Lkotlin/collections/f;", "LR/e$a;", "LR/e;", "vector", "", "", "vectorRoot", "vectorTail", "", "rootShift", "<init>", "(LR/e;[Ljava/lang/Object;[Ljava/lang/Object;I)V", "b0", "()I", "size", "g0", "(I)I", "f0", "buffer", "", "B", "([Ljava/lang/Object;)Z", "([Ljava/lang/Object;)[Ljava/lang/Object;", "distance", "F", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "element", "H", "(Ljava/lang/Object;)[Ljava/lang/Object;", "G", "()[Ljava/lang/Object;", "root", "filledTail", "newTail", "Loa/F;", "O", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)V", "tail", "shift", "Q", "([Ljava/lang/Object;[Ljava/lang/Object;I)[Ljava/lang/Object;", "bufferIndex", "", "sourceIterator", "h", "([Ljava/lang/Object;ILjava/util/Iterator;)[Ljava/lang/Object;", "rootSize", "buffers", "M", "([Ljava/lang/Object;I[[Ljava/lang/Object;)[Ljava/lang/Object;", "buffersIterator", "L", "([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;", "index", "A", "([Ljava/lang/Object;ILjava/lang/Object;)V", "LS/d;", "elementCarry", "z", "([Ljava/lang/Object;IILjava/lang/Object;LS/d;)[Ljava/lang/Object;", "", "elements", "rightShift", "nullBuffers", "nextBuffer", "y", "(Ljava/util/Collection;II[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "startLeafIndex", "d0", "(II[[Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "startBuffer", "startBufferSize", "e0", "(Ljava/util/Collection;I[Ljava/lang/Object;I[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "c", "(I)[Ljava/lang/Object;", "Z", "([Ljava/lang/Object;III)Ljava/lang/Object;", "tailCarry", "Y", "([Ljava/lang/Object;IILS/d;)[Ljava/lang/Object;", "K", "([Ljava/lang/Object;II)V", "J", "Lkotlin/Function1;", "predicate", "T", "(LBa/l;)Z", "a0", "I", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "tailSize", "bufferRef", "U", "(LBa/l;ILS/d;)I", "bufferSize", "S", "(LBa/l;[Ljava/lang/Object;ILS/d;)I", "toBufferSize", "", "recyclableBuffers", "R", "(LBa/l;[Ljava/lang/Object;IILS/d;Ljava/util/List;Ljava/util/List;)I", "e", "oldElementCarry", "c0", "", "D", "(I)Ljava/util/ListIterator;", "i", "()LR/e;", "add", "(Ljava/lang/Object;)Z", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/lang/Object;)V", "(ILjava/util/Collection;)Z", "get", "(I)Ljava/lang/Object;", "removeAt", "removeAll", "V", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "LR/e;", "C", "[Ljava/lang/Object;", "w", "setRootShift$runtime_release", "(I)V", "LV/e;", "LV/e;", "ownership", "<set-?>", "j", "x", "getSize", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f<E> extends AbstractC3825f<E> implements e.a<E> {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private R.e<? extends E> vector;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private Object[] vectorRoot;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private Object[] vectorTail;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private int rootShift;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private V.e ownership = new V.e();

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private Object[] root;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private Object[] tail;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* compiled from: PersistentVectorBuilder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.l<E, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Collection<E> f15245B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Collection<? extends E> collection) {
            super(1);
            this.f15245B = collection;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(E e10) {
            return Boolean.valueOf(this.f15245B.contains(e10));
        }
    }

    public f(R.e<? extends E> eVar, Object[] objArr, Object[] objArr2, int i10) {
        this.vector = eVar;
        this.vectorRoot = objArr;
        this.vectorTail = objArr2;
        this.rootShift = i10;
        this.root = this.vectorRoot;
        this.tail = this.vectorTail;
        this.size = this.vector.size();
    }

    private final void A(Object[] root, int index, E element) {
        int iF0 = f0();
        Object[] objArrE = E(this.tail);
        if (iF0 < 32) {
            C3831l.l(this.tail, objArrE, index + 1, index, iF0);
            objArrE[index] = element;
            this.root = root;
            this.tail = objArrE;
            this.size = size() + 1;
            return;
        }
        Object[] objArr = this.tail;
        Object obj = objArr[31];
        C3831l.l(objArr, objArrE, index + 1, index, 31);
        objArrE[index] = element;
        O(root, objArrE, H(obj));
    }

    private final boolean B(Object[] buffer) {
        return buffer.length == 33 && buffer[32] == this.ownership;
    }

    private final ListIterator<Object[]> D(int index) {
        Object[] objArr = this.root;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iB0 = b0() >> 5;
        V.d.b(index, iB0);
        int i10 = this.rootShift;
        return i10 == 0 ? new i(objArr, index) : new k(objArr, index, iB0, i10 / 5);
    }

    private final Object[] E(Object[] buffer) {
        return buffer == null ? G() : B(buffer) ? buffer : C3831l.p(buffer, G(), 0, 0, Ha.g.g(buffer.length, 32), 6, null);
    }

    private final Object[] F(Object[] buffer, int distance) {
        return B(buffer) ? C3831l.l(buffer, buffer, distance, 0, 32 - distance) : C3831l.l(buffer, G(), distance, 0, 32 - distance);
    }

    private final Object[] G() {
        Object[] objArr = new Object[33];
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] H(Object element) {
        Object[] objArr = new Object[33];
        objArr[0] = element;
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] I(Object[] root, int index, int shift) {
        if (!(shift >= 0)) {
            C1489A0.a("shift should be positive");
        }
        if (shift == 0) {
            return root;
        }
        int iA = l.a(index, shift);
        Object obj = root[iA];
        C3862t.e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objI = I((Object[]) obj, index, shift - 5);
        if (iA < 31) {
            int i10 = iA + 1;
            if (root[i10] != null) {
                if (B(root)) {
                    C3831l.u(root, null, i10, 32);
                }
                root = C3831l.l(root, G(), 0, 0, i10);
            }
        }
        if (objI == root[iA]) {
            return root;
        }
        Object[] objArrE = E(root);
        objArrE[iA] = objI;
        return objArrE;
    }

    private final Object[] J(Object[] root, int shift, int rootSize, d tailCarry) {
        Object[] objArrJ;
        int iA = l.a(rootSize - 1, shift);
        if (shift == 5) {
            tailCarry.b(root[iA]);
            objArrJ = null;
        } else {
            Object obj = root[iA];
            C3862t.e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrJ = J((Object[]) obj, shift - 5, rootSize, tailCarry);
        }
        if (objArrJ == null && iA == 0) {
            return null;
        }
        Object[] objArrE = E(root);
        objArrE[iA] = objArrJ;
        return objArrE;
    }

    private final void K(Object[] root, int rootSize, int shift) {
        if (shift == 0) {
            this.root = null;
            if (root == null) {
                root = new Object[0];
            }
            this.tail = root;
            this.size = rootSize;
            this.rootShift = shift;
            return;
        }
        d dVar = new d(null);
        C3862t.d(root);
        Object[] objArrJ = J(root, shift, rootSize, dVar);
        C3862t.d(objArrJ);
        Object value = dVar.getValue();
        C3862t.e(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.tail = (Object[]) value;
        this.size = rootSize;
        if (objArrJ[1] == null) {
            this.root = (Object[]) objArrJ[0];
            this.rootShift = shift - 5;
        } else {
            this.root = objArrJ;
            this.rootShift = shift;
        }
    }

    private final Object[] L(Object[] root, int rootSize, int shift, Iterator<Object[]> buffersIterator) {
        if (!buffersIterator.hasNext()) {
            C1489A0.a("invalid buffersIterator");
        }
        if (!(shift >= 0)) {
            C1489A0.a("negative shift");
        }
        if (shift == 0) {
            return buffersIterator.next();
        }
        Object[] objArrE = E(root);
        int iA = l.a(rootSize, shift);
        int i10 = shift - 5;
        objArrE[iA] = L((Object[]) objArrE[iA], rootSize, i10, buffersIterator);
        while (true) {
            iA++;
            if (iA >= 32 || !buffersIterator.hasNext()) {
                break;
            }
            objArrE[iA] = L((Object[]) objArrE[iA], 0, i10, buffersIterator);
        }
        return objArrE;
    }

    private final Object[] M(Object[] root, int rootSize, Object[][] buffers) {
        Iterator<Object[]> itA = C3846c.a(buffers);
        int i10 = rootSize >> 5;
        int i11 = this.rootShift;
        Object[] objArrL = i10 < (1 << i11) ? L(root, rootSize, i11, itA) : E(root);
        while (itA.hasNext()) {
            this.rootShift += 5;
            objArrL = H(objArrL);
            int i12 = this.rootShift;
            L(objArrL, 1 << i12, i12, itA);
        }
        return objArrL;
    }

    private final void O(Object[] root, Object[] filledTail, Object[] newTail) {
        int size = size() >> 5;
        int i10 = this.rootShift;
        if (size > (1 << i10)) {
            this.root = Q(H(root), filledTail, this.rootShift + 5);
            this.tail = newTail;
            this.rootShift += 5;
            this.size = size() + 1;
            return;
        }
        if (root == null) {
            this.root = filledTail;
            this.tail = newTail;
            this.size = size() + 1;
        } else {
            this.root = Q(root, filledTail, i10);
            this.tail = newTail;
            this.size = size() + 1;
        }
    }

    private final Object[] Q(Object[] root, Object[] tail, int shift) {
        int iA = l.a(size() - 1, shift);
        Object[] objArrE = E(root);
        if (shift == 5) {
            objArrE[iA] = tail;
        } else {
            objArrE[iA] = Q((Object[]) objArrE[iA], tail, shift - 5);
        }
        return objArrE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int R(Ba.l<? super E, Boolean> predicate, Object[] buffer, int bufferSize, int toBufferSize, d bufferRef, List<Object[]> recyclableBuffers, List<Object[]> buffers) {
        if (B(buffer)) {
            recyclableBuffers.add(buffer);
        }
        Object value = bufferRef.getValue();
        C3862t.e(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        Object[] objArrRemove = objArr;
        for (int i10 = 0; i10 < bufferSize; i10++) {
            Object obj = buffer[i10];
            if (!predicate.invoke(obj).booleanValue()) {
                if (toBufferSize == 32) {
                    objArrRemove = !recyclableBuffers.isEmpty() ? recyclableBuffers.remove(recyclableBuffers.size() - 1) : G();
                    toBufferSize = 0;
                }
                objArrRemove[toBufferSize] = obj;
                toBufferSize++;
            }
        }
        bufferRef.b(objArrRemove);
        if (objArr != bufferRef.getValue()) {
            buffers.add(objArr);
        }
        return toBufferSize;
    }

    private final int S(Ba.l<? super E, Boolean> predicate, Object[] buffer, int bufferSize, d bufferRef) {
        Object[] objArrE = buffer;
        int i10 = bufferSize;
        boolean z10 = false;
        for (int i11 = 0; i11 < bufferSize; i11++) {
            Object obj = buffer[i11];
            if (predicate.invoke(obj).booleanValue()) {
                if (!z10) {
                    objArrE = E(buffer);
                    z10 = true;
                    i10 = i11;
                }
            } else if (z10) {
                objArrE[i10] = obj;
                i10++;
            }
        }
        bufferRef.b(objArrE);
        return i10;
    }

    private final boolean T(Ba.l<? super E, Boolean> predicate) {
        Object[] objArrL;
        int iF0 = f0();
        d dVar = new d(null);
        if (this.root == null) {
            return U(predicate, iF0, dVar) != iF0;
        }
        ListIterator<Object[]> listIteratorD = D(0);
        int iS = 32;
        while (iS == 32 && listIteratorD.hasNext()) {
            iS = S(predicate, listIteratorD.next(), 32, dVar);
        }
        if (iS == 32) {
            V.a.a(!listIteratorD.hasNext());
            int iU = U(predicate, iF0, dVar);
            if (iU == 0) {
                K(this.root, size(), this.rootShift);
            }
            return iU != iF0;
        }
        int iPreviousIndex = listIteratorD.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iR = iS;
        while (listIteratorD.hasNext()) {
            iR = R(predicate, listIteratorD.next(), 32, iR, dVar, arrayList2, arrayList);
            iPreviousIndex = iPreviousIndex;
        }
        int i10 = iPreviousIndex;
        int iR2 = R(predicate, this.tail, iF0, iR, dVar, arrayList2, arrayList);
        Object value = dVar.getValue();
        C3862t.e(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        C3831l.u(objArr, null, iR2, 32);
        if (arrayList.isEmpty()) {
            objArrL = this.root;
            C3862t.d(objArrL);
        } else {
            objArrL = L(this.root, i10, this.rootShift, arrayList.iterator());
        }
        int size = i10 + (arrayList.size() << 5);
        this.root = a0(objArrL, size);
        this.tail = objArr;
        this.size = size + iR2;
        return true;
    }

    private final int U(Ba.l<? super E, Boolean> predicate, int tailSize, d bufferRef) {
        int iS = S(predicate, this.tail, tailSize, bufferRef);
        if (iS == tailSize) {
            V.a.a(bufferRef.getValue() == this.tail);
            return tailSize;
        }
        Object value = bufferRef.getValue();
        C3862t.e(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        C3831l.u(objArr, null, iS, tailSize);
        this.tail = objArr;
        this.size = size() - (tailSize - iS);
        return iS;
    }

    private final Object[] Y(Object[] root, int shift, int index, d tailCarry) {
        int iA = l.a(index, shift);
        if (shift == 0) {
            Object obj = root[iA];
            Object[] objArrL = C3831l.l(root, E(root), iA, iA + 1, 32);
            objArrL[31] = tailCarry.getValue();
            tailCarry.b(obj);
            return objArrL;
        }
        int iA2 = root[31] == null ? l.a(b0() - 1, shift) : 31;
        Object[] objArrE = E(root);
        int i10 = shift - 5;
        int i11 = iA + 1;
        if (i11 <= iA2) {
            while (true) {
                Object obj2 = objArrE[iA2];
                C3862t.e(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrE[iA2] = Y((Object[]) obj2, i10, 0, tailCarry);
                if (iA2 == i11) {
                    break;
                }
                iA2--;
            }
        }
        Object obj3 = objArrE[iA];
        C3862t.e(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrE[iA] = Y((Object[]) obj3, i10, index, tailCarry);
        return objArrE;
    }

    private final Object Z(Object[] root, int rootSize, int shift, int index) {
        int size = size() - rootSize;
        V.a.a(index < size);
        if (size == 1) {
            Object obj = this.tail[0];
            K(root, rootSize, shift);
            return obj;
        }
        Object[] objArr = this.tail;
        Object obj2 = objArr[index];
        Object[] objArrL = C3831l.l(objArr, E(objArr), index, index + 1, size);
        objArrL[size - 1] = null;
        this.root = root;
        this.tail = objArrL;
        this.size = (rootSize + size) - 1;
        this.rootShift = shift;
        return obj2;
    }

    private final Object[] a0(Object[] root, int size) {
        if (!((size & 31) == 0)) {
            C1489A0.a("invalid size");
        }
        if (size == 0) {
            this.rootShift = 0;
            return null;
        }
        int i10 = size - 1;
        while (true) {
            int i11 = this.rootShift;
            if ((i10 >> i11) != 0) {
                return I(root, i10, i11);
            }
            this.rootShift = i11 - 5;
            Object[] objArr = root[0];
            C3862t.e(objArr, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            root = objArr;
        }
    }

    private final int b0() {
        if (size() <= 32) {
            return 0;
        }
        return l.d(size());
    }

    private final Object[] c(int index) {
        if (b0() <= index) {
            return this.tail;
        }
        Object[] objArr = this.root;
        C3862t.d(objArr);
        for (int i10 = this.rootShift; i10 > 0; i10 -= 5) {
            Object[] objArr2 = objArr[l.a(index, i10)];
            C3862t.e(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] c0(Object[] root, int shift, int index, E e10, d oldElementCarry) {
        int iA = l.a(index, shift);
        Object[] objArrE = E(root);
        if (shift != 0) {
            Object obj = objArrE[iA];
            C3862t.e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrE[iA] = c0((Object[]) obj, shift - 5, index, e10, oldElementCarry);
            return objArrE;
        }
        if (objArrE != root) {
            ((AbstractList) this).modCount++;
        }
        oldElementCarry.b(objArrE[iA]);
        objArrE[iA] = e10;
        return objArrE;
    }

    private final Object[] d0(int startLeafIndex, int rightShift, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        if (this.root == null) {
            throw new IllegalStateException("root is null");
        }
        ListIterator<Object[]> listIteratorD = D(b0() >> 5);
        while (listIteratorD.previousIndex() != startLeafIndex) {
            Object[] objArrPrevious = listIteratorD.previous();
            C3831l.l(objArrPrevious, nextBuffer, 0, 32 - rightShift, 32);
            nextBuffer = F(objArrPrevious, rightShift);
            nullBuffers--;
            buffers[nullBuffers] = nextBuffer;
        }
        return listIteratorD.previous();
    }

    private final void e0(Collection<? extends E> elements, int index, Object[] startBuffer, int startBufferSize, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        Object[] objArrG;
        if (!(nullBuffers >= 1)) {
            C1489A0.a("requires at least one nullBuffer");
        }
        Object[] objArrE = E(startBuffer);
        buffers[0] = objArrE;
        int i10 = index & 31;
        int size = ((index + elements.size()) - 1) & 31;
        int i11 = (startBufferSize - i10) + size;
        if (i11 < 32) {
            C3831l.l(objArrE, nextBuffer, size + 1, i10, startBufferSize);
        } else {
            int i12 = i11 - 31;
            if (nullBuffers == 1) {
                objArrG = objArrE;
            } else {
                objArrG = G();
                nullBuffers--;
                buffers[nullBuffers] = objArrG;
            }
            int i13 = startBufferSize - i12;
            C3831l.l(objArrE, nextBuffer, 0, i13, startBufferSize);
            C3831l.l(objArrE, objArrG, size + 1, i10, i13);
            nextBuffer = objArrG;
        }
        Iterator<? extends E> it = elements.iterator();
        h(objArrE, i10, it);
        for (int i14 = 1; i14 < nullBuffers; i14++) {
            buffers[i14] = h(G(), 0, it);
        }
        h(nextBuffer, 0, it);
    }

    private final int f0() {
        return g0(size());
    }

    private final int g0(int size) {
        return size <= 32 ? size : size - l.d(size);
    }

    private final Object[] h(Object[] buffer, int bufferIndex, Iterator<? extends Object> sourceIterator) {
        while (bufferIndex < 32 && sourceIterator.hasNext()) {
            buffer[bufferIndex] = sourceIterator.next();
            bufferIndex++;
        }
        return buffer;
    }

    private final void y(Collection<? extends E> elements, int index, int rightShift, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        if (this.root == null) {
            throw new IllegalStateException("root is null");
        }
        int i10 = index >> 5;
        Object[] objArrD0 = d0(i10, rightShift, buffers, nullBuffers, nextBuffer);
        int iB0 = nullBuffers - (((b0() >> 5) - 1) - i10);
        if (iB0 < nullBuffers) {
            nextBuffer = buffers[iB0];
            C3862t.d(nextBuffer);
        }
        e0(elements, index, objArrD0, 32, buffers, iB0, nextBuffer);
    }

    private final Object[] z(Object[] root, int shift, int index, Object element, d elementCarry) {
        Object obj;
        int iA = l.a(index, shift);
        if (shift == 0) {
            elementCarry.b(root[31]);
            Object[] objArrL = C3831l.l(root, E(root), iA + 1, iA, 31);
            objArrL[iA] = element;
            return objArrL;
        }
        Object[] objArrE = E(root);
        int i10 = shift - 5;
        Object obj2 = objArrE[iA];
        C3862t.e(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrE[iA] = z((Object[]) obj2, i10, index, element, elementCarry);
        while (true) {
            iA++;
            if (iA >= 32 || (obj = objArrE[iA]) == null) {
                break;
            }
            C3862t.e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrE[iA] = z((Object[]) obj, i10, 0, elementCarry.getValue(), elementCarry);
        }
        return objArrE;
    }

    public final boolean V(Ba.l<? super E, Boolean> predicate) {
        boolean zT = T(predicate);
        if (zT) {
            ((AbstractList) this).modCount++;
        }
        return zT;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        ((AbstractList) this).modCount++;
        int iF0 = f0();
        if (iF0 < 32) {
            Object[] objArrE = E(this.tail);
            objArrE[iF0] = element;
            this.tail = objArrE;
            this.size = size() + 1;
        } else {
            O(this.root, this.tail, H(element));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iF0 = f0();
        Iterator<? extends E> it = elements.iterator();
        if (32 - iF0 >= elements.size()) {
            this.tail = h(E(this.tail), iF0, it);
            this.size = size() + elements.size();
        } else {
            int size = ((elements.size() + iF0) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = h(E(this.tail), iF0, it);
            for (int i10 = 1; i10 < size; i10++) {
                objArr[i10] = h(G(), 0, it);
            }
            this.root = M(this.root, b0(), objArr);
            this.tail = h(G(), 0, it);
            this.size = size() + elements.size();
        }
        return true;
    }

    @Override // R.e.a
    public R.e<E> e() {
        e eVar;
        if (this.root == this.vectorRoot && this.tail == this.vectorTail) {
            eVar = this.vector;
        } else {
            this.ownership = new V.e();
            Object[] objArr = this.root;
            this.vectorRoot = objArr;
            Object[] objArr2 = this.tail;
            this.vectorTail = objArr2;
            if (objArr != null) {
                Object[] objArr3 = this.root;
                C3862t.d(objArr3);
                eVar = new e(objArr3, this.tail, size(), this.rootShift);
            } else if (objArr2.length == 0) {
                eVar = l.b();
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(this.tail, size());
                C3862t.f(objArrCopyOf, "copyOf(this, newSize)");
                eVar = new j(objArrCopyOf);
            }
        }
        this.vector = eVar;
        return (R.e<E>) eVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        V.d.a(index, size());
        return (E) c(index)[index & 31];
    }

    @Override // kotlin.collections.AbstractC3825f
    public int getSize() {
        return this.size;
    }

    public final int i() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator();
    }

    /* renamed from: j, reason: from getter */
    public final Object[] getRoot() {
        return this.root;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> elements) {
        return V(new a(elements));
    }

    @Override // kotlin.collections.AbstractC3825f
    public E removeAt(int index) {
        V.d.a(index, size());
        ((AbstractList) this).modCount++;
        int iB0 = b0();
        if (index >= iB0) {
            return (E) Z(this.root, iB0, this.rootShift, index - iB0);
        }
        d dVar = new d(this.tail[0]);
        Object[] objArr = this.root;
        C3862t.d(objArr);
        Z(Y(objArr, this.rootShift, index, dVar), iB0, this.rootShift, 0);
        return (E) dVar.getValue();
    }

    @Override // kotlin.collections.AbstractC3825f, java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        V.d.a(index, size());
        if (b0() > index) {
            d dVar = new d(null);
            Object[] objArr = this.root;
            C3862t.d(objArr);
            this.root = c0(objArr, this.rootShift, index, element, dVar);
            return (E) dVar.getValue();
        }
        Object[] objArrE = E(this.tail);
        if (objArrE != this.tail) {
            ((AbstractList) this).modCount++;
        }
        int i10 = index & 31;
        E e10 = (E) objArrE[i10];
        objArrE[i10] = element;
        this.tail = objArrE;
        return e10;
    }

    /* renamed from: w, reason: from getter */
    public final int getRootShift() {
        return this.rootShift;
    }

    /* renamed from: x, reason: from getter */
    public final Object[] getTail() {
        return this.tail;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int index) {
        V.d.b(index, size());
        return new h(this, index);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractC3825f, java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        V.d.b(index, size());
        if (index == size()) {
            add(element);
            return;
        }
        ((AbstractList) this).modCount++;
        int iB0 = b0();
        if (index >= iB0) {
            A(this.root, index - iB0, element);
            return;
        }
        d dVar = new d(null);
        Object[] objArr = this.root;
        C3862t.d(objArr);
        A(z(objArr, this.rootShift, index, element, dVar), 0, dVar.getValue());
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection<? extends E> elements) {
        Object[] objArrL;
        V.d.b(index, size());
        if (index == size()) {
            return addAll(elements);
        }
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i10 = (index >> 5) << 5;
        int size = (((size() - i10) + elements.size()) - 1) / 32;
        if (size == 0) {
            V.a.a(index >= b0());
            int i11 = index & 31;
            int size2 = ((index + elements.size()) - 1) & 31;
            Object[] objArr = this.tail;
            Object[] objArrL2 = C3831l.l(objArr, E(objArr), size2 + 1, i11, f0());
            h(objArrL2, i11, elements.iterator());
            this.tail = objArrL2;
            this.size = size() + elements.size();
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iF0 = f0();
        int iG0 = g0(size() + elements.size());
        if (index >= b0()) {
            objArrL = G();
            e0(elements, index, this.tail, iF0, objArr2, size, objArrL);
        } else if (iG0 > iF0) {
            int i12 = iG0 - iF0;
            objArrL = F(this.tail, i12);
            y(elements, index, i12, objArr2, size, objArrL);
        } else {
            int i13 = iF0 - iG0;
            objArrL = C3831l.l(this.tail, G(), 0, i13, iF0);
            int i14 = 32 - i13;
            Object[] objArrF = F(this.tail, i14);
            int i15 = size - 1;
            objArr2[i15] = objArrF;
            y(elements, index, i14, objArr2, i15, objArrF);
        }
        this.root = M(this.root, i10, objArr2);
        this.tail = objArrL;
        this.size = size() + elements.size();
        return true;
    }
}
