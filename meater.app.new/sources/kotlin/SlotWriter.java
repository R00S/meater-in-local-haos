package kotlin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.collections.r;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import s.C4380B;
import s.C4381C;
import s.C4386H;

/* compiled from: SlotTable.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\bU\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0000\u0018\u0000 ý\u00012\u00020\u0001:\u0002±\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001e\u0010\u0014J\u000f\u0010\u001f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001f\u0010\u0017J\u000f\u0010 \u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010!J'\u0010%\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\tH\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\tH\u0002¢\u0006\u0004\b(\u0010\u0019J\u001f\u0010)\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000fH\u0002¢\u0006\u0004\b+\u0010\u0017J\u0017\u0010-\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\tH\u0002¢\u0006\u0004\b-\u0010\u0019J\u001f\u0010.\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b.\u0010*J\u001f\u00101\u001a\u00020\f2\u0006\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\tH\u0002¢\u0006\u0004\b1\u00102J\u0019\u00104\u001a\u0004\u0018\u0001032\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b4\u00105J'\u00106\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b6\u0010&J!\u00107\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b7\u00108J\u001f\u0010;\u001a\u00020\u000f2\u0006\u00109\u001a\u00020\t2\u0006\u0010:\u001a\u00020\tH\u0002¢\u0006\u0004\b;\u0010*JG\u0010A\u001a\u00020\f2\u0006\u0010<\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t2&\u0010@\u001a\"\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u000203\u0018\u00010=j\u0010\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u000203\u0018\u0001`?H\u0002¢\u0006\u0004\bA\u0010BJ'\u0010E\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020\t2\u0006\u0010D\u001a\u00020\t2\u0006\u0010,\u001a\u00020\tH\u0002¢\u0006\u0004\bE\u0010&J\u0017\u0010F\u001a\u00020\t2\u0006\u0010'\u001a\u00020\tH\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\t2\u0006\u0010H\u001a\u00020\tH\u0002¢\u0006\u0004\bI\u0010GJ\u001b\u0010K\u001a\u00020\t*\u00020J2\u0006\u0010'\u001a\u00020\tH\u0002¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020\t2\u0006\u0010'\u001a\u00020\tH\u0002¢\u0006\u0004\bM\u0010GJ\u001b\u0010O\u001a\u00020\t*\u00020J2\u0006\u0010N\u001a\u00020\tH\u0002¢\u0006\u0004\bO\u0010LJ\u001b\u0010P\u001a\u00020\t*\u00020J2\u0006\u0010N\u001a\u00020\tH\u0002¢\u0006\u0004\bP\u0010LJ#\u0010Q\u001a\u00020\u000f*\u00020J2\u0006\u0010N\u001a\u00020\t2\u0006\u0010H\u001a\u00020\tH\u0002¢\u0006\u0004\bQ\u0010RJ\u001b\u0010S\u001a\u00020\t*\u00020J2\u0006\u0010N\u001a\u00020\tH\u0002¢\u0006\u0004\bS\u0010LJ\u001b\u0010T\u001a\u00020\t*\u00020J2\u0006\u0010N\u001a\u00020\tH\u0002¢\u0006\u0004\bT\u0010LJ/\u0010W\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\u0006\u0010<\u001a\u00020\t2\u0006\u0010U\u001a\u00020\t2\u0006\u0010V\u001a\u00020\tH\u0002¢\u0006\u0004\bW\u0010XJ'\u0010Z\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\t2\u0006\u0010U\u001a\u00020\t2\u0006\u0010V\u001a\u00020\tH\u0002¢\u0006\u0004\bZ\u0010[J\u001f\u0010\\\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\u0006\u0010<\u001a\u00020\tH\u0002¢\u0006\u0004\b\\\u0010]J\u0017\u0010^\u001a\u00020\t2\u0006\u0010'\u001a\u00020\tH\u0002¢\u0006\u0004\b^\u0010GJ\u0015\u0010_\u001a\u00020\f2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\b_\u0010\u0014J\u0015\u0010`\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\b`\u0010GJ\u0015\u0010a\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\ba\u0010GJ\u0017\u0010b\u001a\u0004\u0018\u00010\u00012\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\bb\u0010cJ\u0015\u0010d\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\bd\u0010GJ\u0017\u0010e\u001a\u0004\u0018\u00010\u00012\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\be\u0010cJ\u0015\u0010f\u001a\u00020\f2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\bf\u0010\u0014J\u0015\u0010g\u001a\u00020\f2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\bg\u0010\u0014J\u001d\u0010h\u001a\u00020\f2\u0006\u0010'\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\bh\u00102J\u0017\u0010i\u001a\u0004\u0018\u00010\u00012\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\bi\u0010cJ\u0017\u0010j\u001a\u0004\u0018\u00010\u00012\u0006\u0010Y\u001a\u00020>¢\u0006\u0004\bj\u0010kJ\u0015\u0010l\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\bl\u0010GJ\u0015\u0010n\u001a\u00020\u000f2\u0006\u0010m\u001a\u00020\f¢\u0006\u0004\bn\u0010oJ\r\u0010p\u001a\u00020\u000f¢\u0006\u0004\bp\u0010\u0017J\u0019\u0010q\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bq\u0010\bJ\u001f\u0010r\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020>2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\br\u0010sJ\u0015\u0010u\u001a\u00020\u000f2\u0006\u0010t\u001a\u00020\t¢\u0006\u0004\bu\u0010\u0019J\u0017\u0010v\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bv\u0010wJ\r\u0010x\u001a\u00020\u000f¢\u0006\u0004\bx\u0010\u0017J\u0017\u0010y\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\by\u0010wJ\u001f\u0010z\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020>2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bz\u0010sJ\u0017\u0010{\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b{\u0010wJ!\u0010|\u001a\u0004\u0018\u00010\u00012\u0006\u0010'\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b|\u0010}J\u001d\u0010~\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\b~\u0010]J*\u0010\u007f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0012\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0001¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\"\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010Y\u001a\u00020>2\u0006\u0010'\u001a\u00020\t¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J#\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00012\u0007\u0010\u0085\u0001\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001a\u0010\u0088\u0001\u001a\u00020\t2\u0007\u0010\u0085\u0001\u001a\u00020\tH\u0000¢\u0006\u0005\b\u0088\u0001\u0010GJ\u001a\u0010\u0089\u0001\u001a\u00020\t2\u0007\u0010\u0085\u0001\u001a\u00020\tH\u0000¢\u0006\u0005\b\u0089\u0001\u0010GJ\u001a\u0010\u008a\u0001\u001a\u00020\t2\u0007\u0010\u0085\u0001\u001a\u00020\tH\u0000¢\u0006\u0005\b\u008a\u0001\u0010GJ\u0018\u0010\u008c\u0001\u001a\u00020\u000f2\u0007\u0010\u008b\u0001\u001a\u00020\t¢\u0006\u0005\b\u008c\u0001\u0010\u0019J\u000f\u0010\u008d\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u008d\u0001\u0010\u0017J\u000f\u0010\u008e\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u008e\u0001\u0010\u0017J\u000f\u0010\u008f\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u008f\u0001\u0010\u0017J\u000f\u0010\u0090\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u0090\u0001\u0010\u0017J\"\u0010\u0092\u0001\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0001¢\u0006\u0005\b\u0092\u0001\u00108J!\u0010\u0093\u0001\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0005\b\u0093\u0001\u00108J,\u0010\u0094\u0001\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u000f\u0010\u0096\u0001\u001a\u00020\t¢\u0006\u0005\b\u0096\u0001\u0010!J\u0017\u0010\u0097\u0001\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\t¢\u0006\u0005\b\u0097\u0001\u0010\u0019J\u0018\u0010\u0098\u0001\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020>¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u000f\u0010\u009a\u0001\u001a\u00020\t¢\u0006\u0005\b\u009a\u0001\u0010!J\u0010\u0010\u009b\u0001\u001a\u00020\f¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u0018\u0010\u009e\u0001\u001a\u00020\u000f2\u0007\u0010\u009d\u0001\u001a\u00020\t¢\u0006\u0005\b\u009e\u0001\u0010\u0019J1\u0010¡\u0001\u001a\t\u0012\u0004\u0012\u00020>0 \u00012\u0006\u0010Y\u001a\u00020>2\u0007\u0010\u009d\u0001\u001a\u00020\t2\u0007\u0010\u009f\u0001\u001a\u00020\u0000¢\u0006\u0006\b¡\u0001\u0010¢\u0001J2\u0010¤\u0001\u001a\t\u0012\u0004\u0012\u00020>0 \u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\t2\t\b\u0002\u0010£\u0001\u001a\u00020\f¢\u0006\u0006\b¤\u0001\u0010¥\u0001J0\u0010¦\u0001\u001a\t\u0012\u0004\u0012\u00020>0 \u00012\u0007\u0010\u009d\u0001\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\t¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u001a\u0010¨\u0001\u001a\u00020>2\b\b\u0002\u0010'\u001a\u00020\t¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u0019\u0010ª\u0001\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\t¢\u0006\u0005\bª\u0001\u0010\u0019J\u0018\u0010«\u0001\u001a\u00020\t2\u0006\u0010Y\u001a\u00020>¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u0013\u0010®\u0001\u001a\u00030\u00ad\u0001H\u0016¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u001c\u0010°\u0001\u001a\u0004\u0018\u00010>2\u0006\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0006\b°\u0001\u0010©\u0001R\u001e\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001R\u0019\u0010·\u0001\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\"\u0010»\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010¸\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R+\u0010À\u0001\u001a\u0014\u0012\u0004\u0012\u00020>0¼\u0001j\t\u0012\u0004\u0012\u00020>`½\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R8\u0010@\u001a\"\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u000203\u0018\u00010=j\u0010\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u000203\u0018\u0001`?8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R#\u0010Ç\u0001\u001a\f\u0012\u0005\u0012\u00030Ä\u0001\u0018\u00010Ã\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R\u0019\u0010É\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010\u008e\u0001R\u0019\u0010Ë\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010\u008e\u0001R\u0019\u0010Í\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010\u008e\u0001R\u0019\u0010Ï\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÎ\u0001\u0010\u008e\u0001R\u0019\u0010Ñ\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0001\u0010\u008e\u0001R\u0019\u0010Ó\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0001\u0010\u008e\u0001R\u0019\u0010Õ\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÔ\u0001\u0010\u008e\u0001R\u0019\u0010×\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÖ\u0001\u0010\u008e\u0001R\u0019\u0010Ù\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bØ\u0001\u0010\u008e\u0001R\u0018\u0010Ý\u0001\u001a\u00030Ú\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÛ\u0001\u0010Ü\u0001R\u0018\u0010ß\u0001\u001a\u00030Ú\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÞ\u0001\u0010Ü\u0001R\u0018\u0010á\u0001\u001a\u00030Ú\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bà\u0001\u0010Ü\u0001R+\u0010ä\u0001\u001a\u0014\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010â\u0001\u0018\u00010Ã\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bã\u0001\u0010Æ\u0001R)\u0010è\u0001\u001a\u00020\t2\u0007\u0010å\u0001\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\bæ\u0001\u0010\u008e\u0001\u001a\u0005\bç\u0001\u0010!R)\u0010ë\u0001\u001a\u00020\t2\u0007\u0010å\u0001\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\bé\u0001\u0010\u008e\u0001\u001a\u0005\bê\u0001\u0010!R(\u0010\"\u001a\u00020\t2\u0007\u0010å\u0001\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\bì\u0001\u0010\u008e\u0001\u001a\u0005\bí\u0001\u0010!R*\u0010ð\u0001\u001a\u00020\f2\u0007\u0010å\u0001\u001a\u00020\f8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bî\u0001\u0010ï\u0001\u001a\u0006\bï\u0001\u0010\u009c\u0001R\u001b\u0010ó\u0001\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bñ\u0001\u0010ò\u0001R\u0015\u0010V\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bô\u0001\u0010!R\u0013\u0010ö\u0001\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\bõ\u0001\u0010!R\u0013\u0010\r\u001a\u00020\f8F¢\u0006\b\u001a\u0006\b÷\u0001\u0010\u009c\u0001R\u0014\u0010ù\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\bø\u0001\u0010\u009c\u0001R\u0014\u0010û\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\bú\u0001\u0010\u009c\u0001R\u0015\u0010,\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bü\u0001\u0010!¨\u0006þ\u0001"}, d2 = {"LO/c1;", "", "LO/Z0;", "table", "<init>", "(LO/Z0;)V", "value", "L0", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "key", "objectKey", "", "isNode", "aux", "Loa/F;", "l1", "(ILjava/lang/Object;ZLjava/lang/Object;)V", "group", "N", "(I)Z", "M", "M0", "()V", "s1", "(I)V", "LO/D0;", "set", "t1", "(ILO/D0;)V", "J", "T0", "S0", "()I", "parent", "endGroup", "firstChild", "X", "(III)V", "index", "z0", "B0", "(II)V", "K", "size", "q0", "r0", "start", "len", "P0", "(II)Z", "LO/U;", "h1", "(I)LO/U;", "Q0", "x1", "(ILjava/lang/Object;)V", "previousGapStart", "newGapStart", "q1", "gapStart", "Ljava/util/HashMap;", "LO/d;", "Lkotlin/collections/HashMap;", "sourceInformationMap", "N0", "(IILjava/util/HashMap;)Z", "originalLocation", "newLocation", "w0", "j0", "(I)I", "dataIndex", "R", "", "I0", "([II)I", "P", "address", "Q", "c1", "u1", "([III)V", "G0", "H", "gapLen", "capacity", "S", "(IIII)I", "anchor", "O", "(III)I", "K0", "(II)I", "J0", "t0", "F0", "k0", "l0", "(I)Ljava/lang/Object;", "m0", "i0", "p0", "n0", "o0", "D0", "E0", "(LO/d;)Ljava/lang/Object;", "H0", "normalClose", "L", "(Z)V", "R0", "p1", "G", "(LO/d;Ljava/lang/Object;)V", "count", "n1", "r1", "(Ljava/lang/Object;)V", "y1", "w1", "v1", "W0", "V0", "(ILjava/lang/Object;)Ljava/lang/Object;", "d1", "U0", "(IILjava/lang/Object;)Ljava/lang/Object;", "X0", "()Ljava/lang/Object;", "b1", "(LO/d;I)Ljava/lang/Object;", "groupIndex", "a1", "(II)Ljava/lang/Object;", "g1", "f1", "e1", "amount", "D", "Z0", "I", "U", "j1", "dataKey", "k1", "m1", "i1", "(ILjava/lang/Object;Ljava/lang/Object;)V", "T", "V", "W", "(LO/d;)V", "Y0", "O0", "()Z", "offset", "y0", "writer", "", "C0", "(LO/d;ILO/c1;)Ljava/util/List;", "removeSourceGroup", "x0", "(LO/Z0;IZ)Ljava/util/List;", "A0", "(ILO/Z0;I)Ljava/util/List;", "E", "(I)LO/d;", "u0", "F", "(LO/d;)I", "", "toString", "()Ljava/lang/String;", "o1", "a", "LO/Z0;", "h0", "()LO/Z0;", "b", "[I", "groups", "", "c", "[Ljava/lang/Object;", "slots", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "d", "Ljava/util/ArrayList;", "anchors", "e", "Ljava/util/HashMap;", "Ls/B;", "Ls/C;", "f", "Ls/B;", "calledByMap", "g", "groupGapStart", "h", "groupGapLen", "i", "currentSlot", "j", "currentSlotEnd", "k", "slotsGapStart", "l", "slotsGapLen", "m", "slotsGapOwner", "n", "insertCount", "o", "nodeCount", "LO/V;", "p", "LO/V;", "startStack", "q", "endStack", "r", "nodeCountStack", "Ls/H;", "s", "deferredSlotWrites", "<set-?>", "t", "c0", "currentGroup", "u", "d0", "currentGroupEnd", "v", "e0", "w", "Z", "closed", "x", "LO/D0;", "pendingRecalculateMarks", "Y", "g0", "slotsSize", "s0", "b0", "collectingSourceInformation", "a0", "collectingCalledInformation", "f0", "y", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.c1, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final class SlotWriter {

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: z, reason: collision with root package name */
    public static final int f12819z = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Z0 table;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int[] groups;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Object[] slots;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private ArrayList<C1536d> anchors;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private HashMap<C1536d, C1521U> sourceInformationMap;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private C4380B<C4381C> calledByMap;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int groupGapStart;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int groupGapLen;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int currentSlot;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int currentSlotEnd;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int slotsGapStart;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int slotsGapLen;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int slotsGapOwner;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int insertCount;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int nodeCount;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private C4380B<C4386H<Object>> deferredSlotWrites;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int currentGroup;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private int currentGroupEnd;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private C1495D0 pendingRecalculateMarks;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final C1522V startStack = new C1522V();

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final C1522V endStack = new C1522V();

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final C1522V nodeCountStack = new C1522V();

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int parent = -1;

    /* compiled from: SlotTable.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LO/c1$a;", "", "<init>", "()V", "LO/c1;", "fromWriter", "", "fromIndex", "toWriter", "", "updateFromCursor", "updateToCursor", "removeSourceGroup", "", "LO/d;", "b", "(LO/c1;ILO/c1;ZZZ)Ljava/util/List;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O.c1$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<C1536d> b(SlotWriter fromWriter, int fromIndex, SlotWriter toWriter, boolean updateFromCursor, boolean updateToCursor, boolean removeSourceGroup) {
            boolean zP0;
            List<C1536d> listM;
            int i10;
            int iM0 = fromWriter.m0(fromIndex);
            int i11 = fromIndex + iM0;
            int iP = fromWriter.P(fromIndex);
            int iP2 = fromWriter.P(i11);
            int i12 = iP2 - iP;
            boolean zM = fromWriter.M(fromIndex);
            toWriter.q0(iM0);
            toWriter.r0(i12, toWriter.getCurrentGroup());
            if (fromWriter.groupGapStart < i11) {
                fromWriter.z0(i11);
            }
            if (fromWriter.slotsGapStart < iP2) {
                fromWriter.B0(iP2, i11);
            }
            int[] iArr = toWriter.groups;
            int currentGroup = toWriter.getCurrentGroup();
            C3831l.j(fromWriter.groups, iArr, currentGroup * 5, fromIndex * 5, i11 * 5);
            Object[] objArr = toWriter.slots;
            int i13 = toWriter.currentSlot;
            C3831l.l(fromWriter.slots, objArr, i13, iP, iP2);
            int parent = toWriter.getParent();
            C1532b1.b0(iArr, currentGroup, parent);
            int i14 = currentGroup - fromIndex;
            int i15 = currentGroup + iM0;
            int iQ = i13 - toWriter.Q(iArr, currentGroup);
            int i16 = toWriter.slotsGapOwner;
            int i17 = toWriter.slotsGapLen;
            int length = objArr.length;
            int i18 = i16;
            int i19 = currentGroup;
            while (true) {
                zP0 = false;
                if (i19 >= i15) {
                    break;
                }
                if (i19 != currentGroup) {
                    i10 = i15;
                    C1532b1.b0(iArr, i19, C1532b1.T(iArr, i19) + i14);
                } else {
                    i10 = i15;
                }
                int i20 = iQ;
                C1532b1.X(iArr, i19, toWriter.S(toWriter.Q(iArr, i19) + iQ, i18 >= i19 ? toWriter.slotsGapStart : 0, i17, length));
                if (i19 == i18) {
                    i18++;
                }
                i19++;
                iQ = i20;
                i15 = i10;
            }
            int i21 = i15;
            toWriter.slotsGapOwner = i18;
            int iP3 = C1532b1.P(fromWriter.anchors, fromIndex, fromWriter.f0());
            int iP4 = C1532b1.P(fromWriter.anchors, i11, fromWriter.f0());
            if (iP3 < iP4) {
                ArrayList arrayList = fromWriter.anchors;
                ArrayList arrayList2 = new ArrayList(iP4 - iP3);
                for (int i22 = iP3; i22 < iP4; i22++) {
                    C1536d c1536d = (C1536d) arrayList.get(i22);
                    c1536d.c(c1536d.getLocation() + i14);
                    arrayList2.add(c1536d);
                }
                toWriter.anchors.addAll(C1532b1.P(toWriter.anchors, toWriter.getCurrentGroup(), toWriter.f0()), arrayList2);
                arrayList.subList(iP3, iP4).clear();
                listM = arrayList2;
            } else {
                listM = r.m();
            }
            if (!listM.isEmpty()) {
                HashMap map = fromWriter.sourceInformationMap;
                HashMap map2 = toWriter.sourceInformationMap;
                if (map != null && map2 != null) {
                    int size = listM.size();
                    for (int i23 = 0; i23 < size; i23++) {
                        C1536d c1536d2 = listM.get(i23);
                        C1521U c1521u = (C1521U) map.get(c1536d2);
                        if (c1521u != null) {
                            map.remove(c1536d2);
                            map2.put(c1536d2, c1521u);
                        }
                    }
                }
            }
            int parent2 = toWriter.getParent();
            C1521U c1521uH1 = toWriter.h1(parent);
            if (c1521uH1 != null) {
                int I10 = parent2 + 1;
                int currentGroup2 = toWriter.getCurrentGroup();
                int i24 = -1;
                while (I10 < currentGroup2) {
                    i24 = I10;
                    I10 = C1532b1.I(toWriter.groups, I10) + I10;
                }
                c1521uH1.b(toWriter, i24, currentGroup2);
            }
            int iH0 = fromWriter.H0(fromIndex);
            if (removeSourceGroup) {
                if (updateFromCursor) {
                    boolean z10 = iH0 >= 0;
                    if (z10) {
                        fromWriter.j1();
                        fromWriter.D(iH0 - fromWriter.getCurrentGroup());
                        fromWriter.j1();
                    }
                    fromWriter.D(fromIndex - fromWriter.getCurrentGroup());
                    boolean zO0 = fromWriter.O0();
                    if (z10) {
                        fromWriter.Z0();
                        fromWriter.T();
                        fromWriter.Z0();
                        fromWriter.T();
                    }
                    zP0 = zO0;
                } else {
                    zP0 = fromWriter.P0(fromIndex, iM0);
                    fromWriter.Q0(iP, i12, fromIndex - 1);
                }
            }
            if (zP0) {
                C1560o.s("Unexpectedly removed anchors");
            }
            toWriter.nodeCount += C1532b1.N(iArr, currentGroup) ? 1 : C1532b1.Q(iArr, currentGroup);
            if (updateToCursor) {
                toWriter.currentGroup = i21;
                toWriter.currentSlot = i13 + i12;
            }
            if (zM) {
                toWriter.s1(parent);
            }
            return listM;
        }

        static /* synthetic */ List c(Companion companion, SlotWriter slotWriter, int i10, SlotWriter slotWriter2, boolean z10, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 32) != 0) {
                z12 = true;
            }
            return companion.b(slotWriter, i10, slotWriter2, z10, z11, z12);
        }

        private Companion() {
        }
    }

    public SlotWriter(Z0 z02) {
        this.table = z02;
        this.groups = z02.getGroups();
        this.slots = z02.getSlots();
        this.anchors = z02.z();
        this.sourceInformationMap = z02.G();
        this.calledByMap = z02.A();
        this.groupGapStart = z02.getGroupsSize();
        this.groupGapLen = (this.groups.length / 5) - z02.getGroupsSize();
        this.slotsGapStart = z02.getSlotsSize();
        this.slotsGapLen = this.slots.length - z02.getSlotsSize();
        this.slotsGapOwner = z02.getGroupsSize();
        this.currentGroupEnd = z02.getGroupsSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B0(int index, int group) {
        int i10 = this.slotsGapLen;
        int i11 = this.slotsGapStart;
        int i12 = this.slotsGapOwner;
        if (i11 != index) {
            Object[] objArr = this.slots;
            if (index < i11) {
                C3831l.l(objArr, objArr, index + i10, index, i11);
            } else {
                C3831l.l(objArr, objArr, i11, i11 + i10, index + i10);
            }
        }
        int iMin = Math.min(group + 1, f0());
        if (i12 != iMin) {
            int length = this.slots.length - i10;
            if (iMin < i12) {
                int iJ0 = j0(iMin);
                int iJ02 = j0(i12);
                int i13 = this.groupGapStart;
                while (iJ0 < iJ02) {
                    int iF = C1532b1.F(this.groups, iJ0);
                    if (!(iF >= 0)) {
                        C1560o.s("Unexpected anchor value, expected a positive anchor");
                    }
                    C1532b1.X(this.groups, iJ0, -((length - iF) + 1));
                    iJ0++;
                    if (iJ0 == i13) {
                        iJ0 += this.groupGapLen;
                    }
                }
            } else {
                int iJ03 = j0(i12);
                int iJ04 = j0(iMin);
                while (iJ03 < iJ04) {
                    int iF2 = C1532b1.F(this.groups, iJ03);
                    if (!(iF2 < 0)) {
                        C1560o.s("Unexpected anchor value, expected a negative anchor");
                    }
                    C1532b1.X(this.groups, iJ03, iF2 + length + 1);
                    iJ03++;
                    if (iJ03 == this.groupGapStart) {
                        iJ03 += this.groupGapLen;
                    }
                }
            }
            this.slotsGapOwner = iMin;
        }
        this.slotsGapStart = index;
    }

    private final int G0(int[] iArr, int i10) {
        return Q(iArr, i10);
    }

    private final int H(int[] iArr, int i10) {
        return Q(iArr, i10) + C1532b1.E(C1532b1.H(iArr, i10) >> 29);
    }

    private final int I0(int[] iArr, int i10) {
        return J0(C1532b1.T(iArr, j0(i10)));
    }

    private final boolean J(int group) {
        int iM0 = group + 1;
        int iM02 = group + m0(group);
        while (iM0 < iM02) {
            if (C1532b1.C(this.groups, j0(iM0))) {
                return true;
            }
            iM0 += m0(iM0);
        }
        return false;
    }

    private final int J0(int index) {
        return index > -2 ? index : f0() + index + 2;
    }

    private final void K() {
        int i10 = this.slotsGapStart;
        C3831l.u(this.slots, null, i10, this.slotsGapLen + i10);
    }

    private final int K0(int index, int gapStart) {
        return index < gapStart ? index : -((f0() - index) + 2);
    }

    private final Object L0(Object value) {
        Object objX0 = X0();
        W0(value);
        return objX0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean M(int group) {
        return group >= 0 && C1532b1.C(this.groups, j0(group));
    }

    private final void M0() {
        C1495D0 c1495d0 = this.pendingRecalculateMarks;
        if (c1495d0 != null) {
            while (c1495d0.b()) {
                t1(c1495d0.d(), c1495d0);
            }
        }
    }

    private final boolean N(int group) {
        return group >= 0 && C1532b1.D(this.groups, j0(group));
    }

    private final boolean N0(int gapStart, int size, HashMap<C1536d, C1521U> sourceInformationMap) {
        int i10 = size + gapStart;
        int iP = C1532b1.P(this.anchors, i10, Y() - this.groupGapLen);
        if (iP >= this.anchors.size()) {
            iP--;
        }
        int i11 = iP + 1;
        int i12 = 0;
        while (iP >= 0) {
            C1536d c1536d = this.anchors.get(iP);
            int iF = F(c1536d);
            if (iF < gapStart) {
                break;
            }
            if (iF < i10) {
                c1536d.c(Integer.MIN_VALUE);
                if (sourceInformationMap != null) {
                    sourceInformationMap.remove(c1536d);
                }
                if (i12 == 0) {
                    i12 = iP + 1;
                }
                i11 = iP;
            }
            iP--;
        }
        boolean z10 = i11 < i12;
        if (z10) {
            this.anchors.subList(i11, i12).clear();
        }
        return z10;
    }

    private final int O(int anchor, int gapLen, int capacity) {
        return anchor < 0 ? (capacity - gapLen) + anchor + 1 : anchor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int P(int index) {
        return Q(this.groups, j0(index));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean P0(int start, int len) {
        if (len > 0) {
            ArrayList<C1536d> arrayList = this.anchors;
            z0(start);
            zN0 = arrayList.isEmpty() ? false : N0(start, len, this.sourceInformationMap);
            this.groupGapStart = start;
            this.groupGapLen += len;
            int i10 = this.slotsGapOwner;
            if (i10 > start) {
                this.slotsGapOwner = Math.max(start, i10 - len);
            }
            int i11 = this.currentGroupEnd;
            if (i11 >= this.groupGapStart) {
                this.currentGroupEnd = i11 - len;
            }
            int i12 = this.parent;
            if (N(i12)) {
                s1(i12);
            }
        }
        return zN0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Q(int[] iArr, int i10) {
        return i10 >= Y() ? this.slots.length - this.slotsGapLen : O(C1532b1.F(iArr, i10), this.slotsGapLen, this.slots.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q0(int start, int len, int group) {
        if (len > 0) {
            int i10 = this.slotsGapLen;
            int i11 = start + len;
            B0(i11, group);
            this.slotsGapStart = start;
            this.slotsGapLen = i10 + len;
            C3831l.u(this.slots, null, start, i11);
            int i12 = this.currentSlotEnd;
            if (i12 >= start) {
                this.currentSlotEnd = i12 - len;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int R(int dataIndex) {
        return dataIndex < this.slotsGapStart ? dataIndex : dataIndex + this.slotsGapLen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int S(int index, int gapStart, int gapLen, int capacity) {
        return index > gapStart ? -(((capacity - gapLen) - index) + 1) : index;
    }

    private final int S0() {
        int iY = (Y() - this.groupGapLen) - this.endStack.i();
        this.currentGroupEnd = iY;
        return iY;
    }

    private final void T0() {
        this.endStack.j((Y() - this.groupGapLen) - this.currentGroupEnd);
    }

    private final void X(int parent, int endGroup, int firstChild) {
        int iK0 = K0(parent, this.groupGapStart);
        while (firstChild < endGroup) {
            C1532b1.b0(this.groups, j0(firstChild), iK0);
            int I10 = C1532b1.I(this.groups, j0(firstChild)) + firstChild;
            X(firstChild, I10, firstChild + 1);
            firstChild = I10;
        }
    }

    private final int Y() {
        return this.groups.length / 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int c1(int[] iArr, int i10) {
        return i10 >= Y() ? this.slots.length - this.slotsGapLen : O(C1532b1.V(iArr, i10), this.slotsGapLen, this.slots.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1521U h1(int group) {
        C1536d c1536dO1;
        HashMap<C1536d, C1521U> map = this.sourceInformationMap;
        if (map == null || (c1536dO1 = o1(group)) == null) {
            return null;
        }
        return map.get(c1536dO1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int j0(int index) {
        return index < this.groupGapStart ? index : index + this.groupGapLen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void l1(int key, Object objectKey, boolean isNode, Object aux) {
        int I10;
        C1521U c1521uH1;
        int i10 = this.parent;
        byte b10 = this.insertCount > 0;
        this.nodeCountStack.j(this.nodeCount);
        if (b10 == true) {
            int i11 = this.currentGroup;
            int iQ = Q(this.groups, j0(i11));
            q0(1);
            this.currentSlot = iQ;
            this.currentSlotEnd = iQ;
            int iJ0 = j0(i11);
            InterfaceC1554l.Companion aVar = InterfaceC1554l.INSTANCE;
            int i12 = objectKey != aVar.a() ? 1 : 0;
            int i13 = (isNode || aux == aVar.a()) ? 0 : 1;
            int iS = S(iQ, this.slotsGapStart, this.slotsGapLen, this.slots.length);
            if (iS >= 0 && this.slotsGapOwner < i11) {
                iS = -(((this.slots.length - this.slotsGapLen) - iS) + 1);
            }
            C1532b1.M(this.groups, iJ0, key, isNode, i12, i13, this.parent, iS);
            int i14 = (isNode ? 1 : 0) + i12 + i13;
            if (i14 > 0) {
                r0(i14, i11);
                Object[] objArr = this.slots;
                int i15 = this.currentSlot;
                if (isNode) {
                    objArr[i15] = aux;
                    i15++;
                }
                if (i12 != 0) {
                    objArr[i15] = objectKey;
                    i15++;
                }
                if (i13 != 0) {
                    objArr[i15] = aux;
                    i15++;
                }
                this.currentSlot = i15;
            }
            this.nodeCount = 0;
            I10 = i11 + 1;
            this.parent = i11;
            this.currentGroup = I10;
            if (i10 >= 0 && (c1521uH1 = h1(i10)) != null) {
                c1521uH1.i(this, i11);
            }
        } else {
            this.startStack.j(i10);
            T0();
            int i16 = this.currentGroup;
            int iJ02 = j0(i16);
            if (!C3862t.b(aux, InterfaceC1554l.INSTANCE.a())) {
                if (isNode) {
                    w1(aux);
                } else {
                    r1(aux);
                }
            }
            this.currentSlot = c1(this.groups, iJ02);
            this.currentSlotEnd = Q(this.groups, j0(this.currentGroup + 1));
            this.nodeCount = C1532b1.Q(this.groups, iJ02);
            this.parent = i16;
            this.currentGroup = i16 + 1;
            I10 = i16 + C1532b1.I(this.groups, iJ02);
        }
        this.currentGroupEnd = I10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0(int size) {
        if (size > 0) {
            int i10 = this.currentGroup;
            z0(i10);
            int i11 = this.groupGapStart;
            int i12 = this.groupGapLen;
            int[] iArr = this.groups;
            int length = iArr.length / 5;
            int i13 = length - i12;
            if (i12 < size) {
                int iMax = Math.max(Math.max(length * 2, i13 + size), 32);
                int[] iArr2 = new int[iMax * 5];
                int i14 = iMax - i13;
                C3831l.j(iArr, iArr2, 0, 0, i11 * 5);
                C3831l.j(iArr, iArr2, (i11 + i14) * 5, (i12 + i11) * 5, length * 5);
                this.groups = iArr2;
                i12 = i14;
            }
            int i15 = this.currentGroupEnd;
            if (i15 >= i11) {
                this.currentGroupEnd = i15 + size;
            }
            int i16 = i11 + size;
            this.groupGapStart = i16;
            this.groupGapLen = i12 - size;
            int iS = S(i13 > 0 ? P(i10 + size) : 0, this.slotsGapOwner >= i11 ? this.slotsGapStart : 0, this.slotsGapLen, this.slots.length);
            for (int i17 = i11; i17 < i16; i17++) {
                C1532b1.X(this.groups, i17, iS);
            }
            int i18 = this.slotsGapOwner;
            if (i18 >= i11) {
                this.slotsGapOwner = i18 + size;
            }
        }
    }

    private final void q1(int previousGapStart, int newGapStart) {
        C1536d c1536d;
        int iA;
        C1536d c1536d2;
        int iA2;
        int i10;
        int iY = Y() - this.groupGapLen;
        if (previousGapStart >= newGapStart) {
            for (int iP = C1532b1.P(this.anchors, newGapStart, iY); iP < this.anchors.size() && (iA = (c1536d = this.anchors.get(iP)).getLocation()) >= 0; iP++) {
                c1536d.c(-(iY - iA));
            }
            return;
        }
        for (int iP2 = C1532b1.P(this.anchors, previousGapStart, iY); iP2 < this.anchors.size() && (iA2 = (c1536d2 = this.anchors.get(iP2)).getLocation()) < 0 && (i10 = iA2 + iY) < newGapStart; iP2++) {
            c1536d2.c(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r0(int size, int group) {
        if (size > 0) {
            B0(this.currentSlot, group);
            int i10 = this.slotsGapStart;
            int i11 = this.slotsGapLen;
            if (i11 < size) {
                Object[] objArr = this.slots;
                int length = objArr.length;
                int i12 = length - i11;
                int iMax = Math.max(Math.max(length * 2, i12 + size), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i13 = 0; i13 < iMax; i13++) {
                    objArr2[i13] = null;
                }
                int i14 = iMax - i12;
                C3831l.l(objArr, objArr2, 0, 0, i10);
                C3831l.l(objArr, objArr2, i10 + i14, i11 + i10, length);
                this.slots = objArr2;
                i11 = i14;
            }
            int i15 = this.currentSlotEnd;
            if (i15 >= i10) {
                this.currentSlotEnd = i15 + size;
            }
            this.slotsGapStart = i10 + size;
            this.slotsGapLen = i11 - size;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s1(int group) {
        if (group >= 0) {
            C1495D0 c1495d0 = this.pendingRecalculateMarks;
            if (c1495d0 == null) {
                c1495d0 = new C1495D0(null, 1, 0 == true ? 1 : 0);
                this.pendingRecalculateMarks = c1495d0;
            }
            c1495d0.a(group);
        }
    }

    private final void t1(int group, C1495D0 set) {
        int iJ0 = j0(group);
        boolean zJ = J(group);
        if (C1532b1.D(this.groups, iJ0) != zJ) {
            C1532b1.W(this.groups, iJ0, zJ);
            int iH0 = H0(group);
            if (iH0 >= 0) {
                set.a(iH0);
            }
        }
    }

    private final void u1(int[] iArr, int i10, int i11) {
        C1532b1.X(iArr, i10, S(i11, this.slotsGapStart, this.slotsGapLen, this.slots.length));
    }

    public static /* synthetic */ void v0(SlotWriter slotWriter, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = slotWriter.parent;
        }
        slotWriter.u0(i10);
    }

    private final void w0(int originalLocation, int newLocation, int size) {
        C1536d c1536d;
        int iF;
        int i10 = size + originalLocation;
        int iF0 = f0();
        int iP = C1532b1.P(this.anchors, originalLocation, iF0);
        ArrayList arrayList = new ArrayList();
        if (iP >= 0) {
            while (iP < this.anchors.size() && (iF = F((c1536d = this.anchors.get(iP)))) >= originalLocation && iF < i10) {
                arrayList.add(c1536d);
                this.anchors.remove(iP);
            }
        }
        int i11 = newLocation - originalLocation;
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            C1536d c1536d2 = (C1536d) arrayList.get(i12);
            int iF2 = F(c1536d2) + i11;
            if (iF2 >= this.groupGapStart) {
                c1536d2.c(-(iF0 - iF2));
            } else {
                c1536d2.c(iF2);
            }
            this.anchors.add(C1532b1.P(this.anchors, iF2, iF0), c1536d2);
        }
    }

    private final void x1(int index, Object value) {
        int iJ0 = j0(index);
        int[] iArr = this.groups;
        if (!(iJ0 < iArr.length && C1532b1.N(iArr, iJ0))) {
            C1560o.s("Updating the node of a group at " + index + " that was not created with as a node group");
        }
        this.slots[R(G0(this.groups, iJ0))] = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z0(int index) {
        int i10 = this.groupGapLen;
        int i11 = this.groupGapStart;
        if (i11 != index) {
            if (!this.anchors.isEmpty()) {
                q1(i11, index);
            }
            if (i10 > 0) {
                int[] iArr = this.groups;
                int i12 = index * 5;
                int i13 = i10 * 5;
                int i14 = i11 * 5;
                if (index < i11) {
                    C3831l.j(iArr, iArr, i13 + i12, i12, i14);
                } else {
                    C3831l.j(iArr, iArr, i14, i14 + i13, i12 + i13);
                }
            }
            if (index < i11) {
                i11 = index + i10;
            }
            int iY = Y();
            C1560o.Q(i11 < iY);
            while (i11 < iY) {
                int iT = C1532b1.T(this.groups, i11);
                int iK0 = K0(J0(iT), index);
                if (iK0 != iT) {
                    C1532b1.b0(this.groups, i11, iK0);
                }
                i11++;
                if (i11 == index) {
                    i11 += i10;
                }
            }
        }
        this.groupGapStart = index;
    }

    public final List<C1536d> A0(int offset, Z0 table, int index) {
        C1560o.Q(this.insertCount <= 0 && m0(this.currentGroup + offset) == 1);
        int i10 = this.currentGroup;
        int i11 = this.currentSlot;
        int i12 = this.currentSlotEnd;
        D(offset);
        j1();
        I();
        SlotWriter slotWriterL = table.L();
        try {
            List<C1536d> listC = Companion.c(INSTANCE, slotWriterL, index, this, false, true, false, 32, null);
            slotWriterL.L(true);
            U();
            T();
            this.currentGroup = i10;
            this.currentSlot = i11;
            this.currentSlotEnd = i12;
            return listC;
        } catch (Throwable th) {
            slotWriterL.L(false);
            throw th;
        }
    }

    public final List<C1536d> C0(C1536d anchor, int offset, SlotWriter writer) {
        C1560o.Q(writer.insertCount > 0);
        C1560o.Q(this.insertCount == 0);
        C1560o.Q(anchor.b());
        int iF = F(anchor) + offset;
        int i10 = this.currentGroup;
        C1560o.Q(i10 <= iF && iF < this.currentGroupEnd);
        int iH0 = H0(iF);
        int iM0 = m0(iF);
        int iF0 = t0(iF) ? 1 : F0(iF);
        List<C1536d> listC = Companion.c(INSTANCE, this, iF, writer, false, false, false, 32, null);
        s1(iH0);
        boolean z10 = iF0 > 0;
        while (iH0 >= i10) {
            int iJ0 = j0(iH0);
            int[] iArr = this.groups;
            C1532b1.Y(iArr, iJ0, C1532b1.I(iArr, iJ0) - iM0);
            if (z10) {
                if (C1532b1.N(this.groups, iJ0)) {
                    z10 = false;
                } else {
                    int[] iArr2 = this.groups;
                    C1532b1.a0(iArr2, iJ0, C1532b1.Q(iArr2, iJ0) - iF0);
                }
            }
            iH0 = H0(iH0);
        }
        if (z10) {
            C1560o.Q(this.nodeCount >= iF0);
            this.nodeCount -= iF0;
        }
        return listC;
    }

    public final void D(int amount) {
        boolean z10 = false;
        if (!(amount >= 0)) {
            C1560o.s("Cannot seek backwards");
        }
        if (!(this.insertCount <= 0)) {
            C1489A0.b("Cannot call seek() while inserting");
        }
        if (amount == 0) {
            return;
        }
        int i10 = this.currentGroup + amount;
        if (i10 >= this.parent && i10 <= this.currentGroupEnd) {
            z10 = true;
        }
        if (!z10) {
            C1560o.s("Cannot seek outside the current group (" + this.parent + '-' + this.currentGroupEnd + ')');
        }
        this.currentGroup = i10;
        int iQ = Q(this.groups, j0(i10));
        this.currentSlot = iQ;
        this.currentSlotEnd = iQ;
    }

    public final Object D0(int index) {
        int iJ0 = j0(index);
        if (C1532b1.N(this.groups, iJ0)) {
            return this.slots[R(G0(this.groups, iJ0))];
        }
        return null;
    }

    public final C1536d E(int index) {
        ArrayList<C1536d> arrayList = this.anchors;
        int iU = C1532b1.U(arrayList, index, f0());
        if (iU >= 0) {
            return arrayList.get(iU);
        }
        if (index > this.groupGapStart) {
            index = -(f0() - index);
        }
        C1536d c1536d = new C1536d(index);
        arrayList.add(-(iU + 1), c1536d);
        return c1536d;
    }

    public final Object E0(C1536d anchor) {
        return D0(anchor.e(this));
    }

    public final int F(C1536d anchor) {
        int iA = anchor.getLocation();
        return iA < 0 ? iA + f0() : iA;
    }

    public final int F0(int index) {
        return C1532b1.Q(this.groups, j0(index));
    }

    public final void G(C1536d anchor, Object value) {
        if (!(this.insertCount == 0)) {
            C1560o.s("Can only append a slot if not current inserting");
        }
        int i10 = this.currentSlot;
        int i11 = this.currentSlotEnd;
        int iF = F(anchor);
        int iQ = Q(this.groups, j0(iF + 1));
        this.currentSlot = iQ;
        this.currentSlotEnd = iQ;
        r0(1, iF);
        if (i10 >= iQ) {
            i10++;
            i11++;
        }
        this.slots[iQ] = value;
        this.currentSlot = i10;
        this.currentSlotEnd = i11;
    }

    public final int H0(int index) {
        return I0(this.groups, index);
    }

    public final void I() {
        int i10 = this.insertCount;
        this.insertCount = i10 + 1;
        if (i10 == 0) {
            T0();
        }
    }

    public final void L(boolean normalClose) {
        this.closed = true;
        if (normalClose && this.startStack.d()) {
            z0(f0());
            B0(this.slots.length - this.slotsGapLen, this.groupGapStart);
            K();
            M0();
        }
        this.table.j(this, this.groups, this.groupGapStart, this.slots, this.slotsGapStart, this.anchors, this.sourceInformationMap, this.calledByMap);
    }

    public final boolean O0() {
        C1536d c1536dO1;
        if (!(this.insertCount == 0)) {
            C1560o.s("Cannot remove group while inserting");
        }
        int i10 = this.currentGroup;
        int i11 = this.currentSlot;
        int iQ = Q(this.groups, j0(i10));
        int iY0 = Y0();
        C1521U c1521uH1 = h1(this.parent);
        if (c1521uH1 != null && (c1536dO1 = o1(i10)) != null) {
            c1521uH1.g(c1536dO1);
        }
        C1495D0 c1495d0 = this.pendingRecalculateMarks;
        if (c1495d0 != null) {
            while (c1495d0.b() && c1495d0.c() >= i10) {
                c1495d0.d();
            }
        }
        boolean zP0 = P0(i10, this.currentGroup - i10);
        Q0(iQ, this.currentSlot - iQ, i10 - 1);
        this.currentGroup = i10;
        this.currentSlot = i11;
        this.nodeCount -= iY0;
        return zP0;
    }

    public final void R0() {
        if (!(this.insertCount == 0)) {
            C1560o.s("Cannot reset when inserting");
        }
        M0();
        this.currentGroup = 0;
        this.currentGroupEnd = Y() - this.groupGapLen;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
        this.nodeCount = 0;
    }

    public final int T() {
        C4386H<Object> c4386hC;
        boolean z10 = this.insertCount > 0;
        int i10 = this.currentGroup;
        int i11 = this.currentGroupEnd;
        int i12 = this.parent;
        int iJ0 = j0(i12);
        int i13 = this.nodeCount;
        int i14 = i10 - i12;
        boolean zN = C1532b1.N(this.groups, iJ0);
        if (z10) {
            C4380B<C4386H<Object>> c4380b = this.deferredSlotWrites;
            if (c4380b != null && (c4386hC = c4380b.c(i12)) != null) {
                Object[] objArr = c4386hC.content;
                int i15 = c4386hC._size;
                for (int i16 = 0; i16 < i15; i16++) {
                    L0(objArr[i16]);
                }
                c4380b.q(i12);
            }
            C1532b1.Y(this.groups, iJ0, i14);
            C1532b1.a0(this.groups, iJ0, i13);
            this.nodeCount = this.nodeCountStack.i() + (zN ? 1 : i13);
            int iI0 = I0(this.groups, i12);
            this.parent = iI0;
            int iF0 = iI0 < 0 ? f0() : j0(iI0 + 1);
            int iQ = iF0 >= 0 ? Q(this.groups, iF0) : 0;
            this.currentSlot = iQ;
            this.currentSlotEnd = iQ;
        } else {
            if (!(i10 == i11)) {
                C1560o.s("Expected to be at the end of a group");
            }
            int I10 = C1532b1.I(this.groups, iJ0);
            int iQ2 = C1532b1.Q(this.groups, iJ0);
            C1532b1.Y(this.groups, iJ0, i14);
            C1532b1.a0(this.groups, iJ0, i13);
            int i17 = this.startStack.i();
            S0();
            this.parent = i17;
            int iI02 = I0(this.groups, i12);
            int i18 = this.nodeCountStack.i();
            this.nodeCount = i18;
            if (iI02 == i17) {
                this.nodeCount = i18 + (zN ? 0 : i13 - iQ2);
            } else {
                int i19 = i14 - I10;
                int i20 = zN ? 0 : i13 - iQ2;
                if (i19 != 0 || i20 != 0) {
                    while (iI02 != 0 && iI02 != i17 && (i20 != 0 || i19 != 0)) {
                        int iJ02 = j0(iI02);
                        if (i19 != 0) {
                            C1532b1.Y(this.groups, iJ02, C1532b1.I(this.groups, iJ02) + i19);
                        }
                        if (i20 != 0) {
                            int[] iArr = this.groups;
                            C1532b1.a0(iArr, iJ02, C1532b1.Q(iArr, iJ02) + i20);
                        }
                        if (C1532b1.N(this.groups, iJ02)) {
                            i20 = 0;
                        }
                        iI02 = I0(this.groups, iI02);
                    }
                }
                this.nodeCount += i20;
            }
        }
        return i13;
    }

    public final void U() {
        if (!(this.insertCount > 0)) {
            C1489A0.b("Unbalanced begin/end insert");
        }
        int i10 = this.insertCount - 1;
        this.insertCount = i10;
        if (i10 == 0) {
            if (!(this.nodeCountStack.getTos() == this.startStack.getTos())) {
                C1560o.s("startGroup/endGroup mismatch while inserting");
            }
            S0();
        }
    }

    public final Object U0(int group, int index, Object value) {
        int iR = R(d1(group, index));
        Object[] objArr = this.slots;
        Object obj = objArr[iR];
        objArr[iR] = value;
        return obj;
    }

    public final void V(int index) {
        boolean z10 = false;
        if (!(this.insertCount <= 0)) {
            C1560o.s("Cannot call ensureStarted() while inserting");
        }
        int i10 = this.parent;
        if (i10 != index) {
            if (index >= i10 && index < this.currentGroupEnd) {
                z10 = true;
            }
            if (!z10) {
                C1560o.s("Started group at " + index + " must be a subgroup of the group at " + i10);
            }
            int i11 = this.currentGroup;
            int i12 = this.currentSlot;
            int i13 = this.currentSlotEnd;
            this.currentGroup = index;
            j1();
            this.currentGroup = i11;
            this.currentSlot = i12;
            this.currentSlotEnd = i13;
        }
    }

    public final Object V0(int index, Object value) {
        return U0(this.currentGroup, index, value);
    }

    public final void W(C1536d anchor) {
        V(anchor.e(this));
    }

    public final void W0(Object value) {
        if (!(this.currentSlot <= this.currentSlotEnd)) {
            C1560o.s("Writing to an invalid slot");
        }
        this.slots[R(this.currentSlot - 1)] = value;
    }

    public final Object X0() {
        if (this.insertCount > 0) {
            r0(1, this.parent);
        }
        Object[] objArr = this.slots;
        int i10 = this.currentSlot;
        this.currentSlot = i10 + 1;
        return objArr[R(i10)];
    }

    public final int Y0() {
        int iJ0 = j0(this.currentGroup);
        int I10 = this.currentGroup + C1532b1.I(this.groups, iJ0);
        this.currentGroup = I10;
        this.currentSlot = Q(this.groups, j0(I10));
        if (C1532b1.N(this.groups, iJ0)) {
            return 1;
        }
        return C1532b1.Q(this.groups, iJ0);
    }

    /* renamed from: Z, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    public final void Z0() {
        int i10 = this.currentGroupEnd;
        this.currentGroup = i10;
        this.currentSlot = Q(this.groups, j0(i10));
    }

    public final boolean a0() {
        return this.calledByMap != null;
    }

    public final Object a1(int groupIndex, int index) {
        int iC1 = c1(this.groups, j0(groupIndex));
        int iQ = Q(this.groups, j0(groupIndex + 1));
        int i10 = index + iC1;
        if (iC1 > i10 || i10 >= iQ) {
            return InterfaceC1554l.INSTANCE.a();
        }
        return this.slots[R(i10)];
    }

    public final boolean b0() {
        return this.sourceInformationMap != null;
    }

    public final Object b1(C1536d anchor, int index) {
        return a1(F(anchor), index);
    }

    /* renamed from: c0, reason: from getter */
    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    /* renamed from: d0, reason: from getter */
    public final int getCurrentGroupEnd() {
        return this.currentGroupEnd;
    }

    public final int d1(int group, int index) {
        int iC1 = c1(this.groups, j0(group));
        int i10 = iC1 + index;
        if (!(i10 >= iC1 && i10 < Q(this.groups, j0(group + 1)))) {
            C1560o.s("Write to an invalid slot index " + index + " for group " + group);
        }
        return i10;
    }

    /* renamed from: e0, reason: from getter */
    public final int getParent() {
        return this.parent;
    }

    public final int e1(int groupIndex) {
        return Q(this.groups, j0(groupIndex + m0(groupIndex)));
    }

    public final int f0() {
        return Y() - this.groupGapLen;
    }

    public final int f1(int groupIndex) {
        return Q(this.groups, j0(groupIndex + 1));
    }

    public final int g0() {
        return this.slots.length - this.slotsGapLen;
    }

    public final int g1(int groupIndex) {
        return c1(this.groups, j0(groupIndex));
    }

    /* renamed from: h0, reason: from getter */
    public final Z0 getTable() {
        return this.table;
    }

    public final Object i0(int index) {
        int iJ0 = j0(index);
        return C1532b1.J(this.groups, iJ0) ? this.slots[H(this.groups, iJ0)] : InterfaceC1554l.INSTANCE.a();
    }

    public final void i1(int key, Object objectKey, Object aux) {
        l1(key, objectKey, false, aux);
    }

    public final void j1() {
        if (!(this.insertCount == 0)) {
            C1560o.s("Key must be supplied when inserting");
        }
        InterfaceC1554l.Companion aVar = InterfaceC1554l.INSTANCE;
        l1(0, aVar.a(), false, aVar.a());
    }

    public final int k0(int index) {
        return C1532b1.O(this.groups, j0(index));
    }

    public final void k1(int key, Object dataKey) {
        l1(key, dataKey, false, InterfaceC1554l.INSTANCE.a());
    }

    public final Object l0(int index) {
        int iJ0 = j0(index);
        if (C1532b1.L(this.groups, iJ0)) {
            return this.slots[C1532b1.S(this.groups, iJ0)];
        }
        return null;
    }

    public final int m0(int index) {
        return C1532b1.I(this.groups, j0(index));
    }

    public final void m1(int key, Object objectKey) {
        l1(key, objectKey, true, InterfaceC1554l.INSTANCE.a());
    }

    public final boolean n0(int index) {
        return o0(index, this.currentGroup);
    }

    public final void n1(int count) {
        C1560o.Q(count > 0);
        int i10 = this.parent;
        int iC1 = c1(this.groups, j0(i10));
        int iQ = Q(this.groups, j0(i10 + 1)) - count;
        C1560o.Q(iQ >= iC1);
        Q0(iQ, count, i10);
        int i11 = this.currentSlot;
        if (i11 >= iC1) {
            this.currentSlot = i11 - count;
        }
    }

    public final boolean o0(int index, int group) {
        int iC;
        int iY;
        if (group == this.parent) {
            iY = this.currentGroupEnd;
        } else if (group <= this.startStack.h(0) && (iC = this.startStack.c(group)) >= 0) {
            iY = (Y() - this.groupGapLen) - this.endStack.f(iC);
        } else {
            int iM0 = m0(group);
            iY = iM0 + group;
        }
        return index > group && index < iY;
    }

    public final C1536d o1(int group) {
        if (group < 0 || group >= f0()) {
            return null;
        }
        return C1532b1.G(this.anchors, group, f0());
    }

    public final boolean p0(int index) {
        int i10 = this.parent;
        return (index > i10 && index < this.currentGroupEnd) || (i10 == 0 && index == 0);
    }

    public final Object p1(Object value) {
        if (this.insertCount <= 0 || this.currentSlot == this.slotsGapStart) {
            return L0(value);
        }
        C4380B<C4386H<Object>> c4380b = this.deferredSlotWrites;
        C3854k c3854k = null;
        int i10 = 1;
        int i11 = 0;
        if (c4380b == null) {
            c4380b = new C4380B<>(i11, i10, c3854k);
        }
        this.deferredSlotWrites = c4380b;
        int i12 = this.parent;
        C4386H<Object> c4386hC = c4380b.c(i12);
        if (c4386hC == null) {
            c4386hC = new C4386H<>(i11, i10, c3854k);
            c4380b.t(i12, c4386hC);
        }
        c4386hC.e(value);
        return InterfaceC1554l.INSTANCE.a();
    }

    public final void r1(Object value) {
        int iJ0 = j0(this.currentGroup);
        if (!C1532b1.J(this.groups, iJ0)) {
            C1560o.s("Updating the data of a group that was not created with a data slot");
        }
        this.slots[R(H(this.groups, iJ0))] = value;
    }

    public final boolean s0() {
        int i10 = this.currentGroup;
        return i10 < this.currentGroupEnd && C1532b1.N(this.groups, j0(i10));
    }

    public final boolean t0(int index) {
        return C1532b1.N(this.groups, j0(index));
    }

    public String toString() {
        return "SlotWriter(current = " + this.currentGroup + " end=" + this.currentGroupEnd + " size = " + f0() + " gap=" + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + ')';
    }

    public final void u0(int group) {
        int iJ0 = j0(group);
        if (C1532b1.K(this.groups, iJ0)) {
            return;
        }
        C1532b1.Z(this.groups, iJ0, true);
        if (C1532b1.D(this.groups, iJ0)) {
            return;
        }
        s1(H0(group));
    }

    public final void v1(C1536d anchor, Object value) {
        x1(anchor.e(this), value);
    }

    public final void w1(Object value) {
        x1(this.currentGroup, value);
    }

    public final List<C1536d> x0(Z0 table, int index, boolean removeSourceGroup) {
        C1560o.Q(this.insertCount > 0);
        if (index != 0 || this.currentGroup != 0 || this.table.getGroupsSize() != 0 || C1532b1.I(table.getGroups(), index) != table.getGroupsSize()) {
            SlotWriter slotWriterL = table.L();
            try {
                List<C1536d> listB = INSTANCE.b(slotWriterL, index, this, true, true, removeSourceGroup);
                slotWriterL.L(true);
                return listB;
            } catch (Throwable th) {
                slotWriterL.L(false);
                throw th;
            }
        }
        int[] iArr = this.groups;
        Object[] objArr = this.slots;
        ArrayList<C1536d> arrayList = this.anchors;
        HashMap<C1536d, C1521U> map = this.sourceInformationMap;
        C4380B<C4381C> c4380b = this.calledByMap;
        int[] groups = table.getGroups();
        int groupsSize = table.getGroupsSize();
        Object[] slots = table.getSlots();
        int slotsSize = table.getSlotsSize();
        HashMap<C1536d, C1521U> mapG = table.G();
        C4380B<C4381C> c4380bA = table.A();
        this.groups = groups;
        this.slots = slots;
        this.anchors = table.z();
        this.groupGapStart = groupsSize;
        this.groupGapLen = (groups.length / 5) - groupsSize;
        this.slotsGapStart = slotsSize;
        this.slotsGapLen = slots.length - slotsSize;
        this.slotsGapOwner = groupsSize;
        this.sourceInformationMap = mapG;
        this.calledByMap = c4380bA;
        table.O(iArr, 0, objArr, 0, arrayList, map, c4380b);
        return this.anchors;
    }

    public final void y0(int offset) {
        if (!(this.insertCount == 0)) {
            C1560o.s("Cannot move a group while inserting");
        }
        if (!(offset >= 0)) {
            C1560o.s("Parameter offset is out of bounds");
        }
        if (offset == 0) {
            return;
        }
        int i10 = this.currentGroup;
        int i11 = this.parent;
        int i12 = this.currentGroupEnd;
        int I10 = i10;
        for (int i13 = offset; i13 > 0; i13--) {
            I10 += C1532b1.I(this.groups, j0(I10));
            if (!(I10 <= i12)) {
                C1560o.s("Parameter offset is out of bounds");
            }
        }
        int I11 = C1532b1.I(this.groups, j0(I10));
        int iQ = Q(this.groups, j0(this.currentGroup));
        int iQ2 = Q(this.groups, j0(I10));
        int i14 = I10 + I11;
        int iQ3 = Q(this.groups, j0(i14));
        int i15 = iQ3 - iQ2;
        r0(i15, Math.max(this.currentGroup - 1, 0));
        q0(I11);
        int[] iArr = this.groups;
        int iJ0 = j0(i14) * 5;
        C3831l.j(iArr, iArr, j0(i10) * 5, iJ0, (I11 * 5) + iJ0);
        if (i15 > 0) {
            Object[] objArr = this.slots;
            C3831l.l(objArr, objArr, iQ, R(iQ2 + i15), R(iQ3 + i15));
        }
        int i16 = iQ2 + i15;
        int i17 = i16 - iQ;
        int i18 = this.slotsGapStart;
        int i19 = this.slotsGapLen;
        int length = this.slots.length;
        int i20 = this.slotsGapOwner;
        int i21 = i10 + I11;
        int i22 = i10;
        while (i22 < i21) {
            int iJ02 = j0(i22);
            int i23 = i18;
            int i24 = i17;
            u1(iArr, iJ02, S(Q(iArr, iJ02) - i17, i20 < iJ02 ? 0 : i23, i19, length));
            i22++;
            i18 = i23;
            i17 = i24;
        }
        w0(i14, i10, I11);
        if (P0(i14, I11)) {
            C1560o.s("Unexpectedly removed anchors");
        }
        X(i11, this.currentGroupEnd, i10);
        if (i15 > 0) {
            Q0(i16, i15, i14 - 1);
        }
    }

    public final void y1() {
        this.sourceInformationMap = this.table.G();
        this.calledByMap = this.table.A();
    }
}
