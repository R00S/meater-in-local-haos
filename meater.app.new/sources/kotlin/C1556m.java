package kotlin;

import Ba.l;
import Ba.p;
import W.IntRef;
import a0.C1882d;
import a0.InterfaceC1879a;
import androidx.compose.runtime.snapshots.j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.InterfaceC1583z0;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.collections.r;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.W;
import oa.C4153F;
import oa.C4170o;
import oa.v;
import s.C4388J;
import s.C4415z;
import ta.g;

/* compiled from: Composer.kt */
@Metadata(d1 = {"\u0000Ö\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0002\u0098\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0004\u009b\u0001å\u0001BI\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001f\u0010\u0014J\u000f\u0010 \u001a\u00020\u0012H\u0002¢\u0006\u0004\b \u0010\u0014J\u0019\u0010\"\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\"\u0010#J\u0011\u0010%\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020'2\u0006\u0010*\u001a\u00020\u0017H\u0002¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020'2\u0006\u0010-\u001a\u00020'2\u0006\u0010.\u001a\u00020'H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00122\u0006\u00101\u001a\u00020'H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0012H\u0002¢\u0006\u0004\b4\u0010\u0014J\u000f\u00105\u001a\u00020\u0012H\u0002¢\u0006\u0004\b5\u0010\u0014J\u000f\u00106\u001a\u00020\u0012H\u0002¢\u0006\u0004\b6\u0010\u0014J!\u0010:\u001a\u00020\u00122\u0006\u00108\u001a\u0002072\b\u00109\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b:\u0010;J6\u0010?\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010<\u001a\u0004\u0018\u00010\u001b2\u0006\u0010>\u001a\u00020=2\b\u00109\u001a\u0004\u0018\u00010\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b?\u0010@J!\u0010C\u001a\u00020\u00122\u0006\u00108\u001a\u0002072\b\u0010B\u001a\u0004\u0018\u00010AH\u0002¢\u0006\u0004\bC\u0010DJ\u001f\u0010G\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u00172\u0006\u0010F\u001a\u000207H\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020\u00122\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u0012H\u0002¢\u0006\u0004\bK\u0010\u0014J\u0017\u0010M\u001a\u00020\u00172\u0006\u0010L\u001a\u00020\u0017H\u0002¢\u0006\u0004\bM\u0010NJ\u001f\u0010P\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00172\u0006\u0010O\u001a\u00020\u0017H\u0002¢\u0006\u0004\bP\u0010QJ/\u0010U\u001a\u00020\u00172\u0006\u0010R\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u00172\u0006\u0010S\u001a\u00020\u00172\u0006\u0010T\u001a\u00020\u0017H\u0002¢\u0006\u0004\bU\u0010VJ\u0017\u0010W\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u0017H\u0002¢\u0006\u0004\bW\u0010NJ\u0017\u0010X\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u0017H\u0002¢\u0006\u0004\bX\u0010NJ\u001f\u0010Z\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00172\u0006\u0010Y\u001a\u00020\u0017H\u0002¢\u0006\u0004\bZ\u0010QJ\u000f\u0010[\u001a\u00020\u0012H\u0002¢\u0006\u0004\b[\u0010\u0014J'\u0010_\u001a\u00020\u00122\u0006\u0010\\\u001a\u00020\u00172\u0006\u0010]\u001a\u00020\u00172\u0006\u0010^\u001a\u00020\u0017H\u0002¢\u0006\u0004\b_\u0010`J\u001f\u0010b\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00172\u0006\u0010a\u001a\u00020\u0017H\u0002¢\u0006\u0004\bb\u0010QJ/\u0010e\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u00172\u0006\u0010c\u001a\u00020\u00172\u0006\u0010S\u001a\u00020\u00172\u0006\u0010d\u001a\u00020\u0017H\u0002¢\u0006\u0004\be\u0010VJ\u001b\u0010g\u001a\u00020\u0017*\u00020f2\u0006\u0010*\u001a\u00020\u0017H\u0002¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020\u0012H\u0002¢\u0006\u0004\bi\u0010\u0014J\u000f\u0010j\u001a\u00020\u0012H\u0002¢\u0006\u0004\bj\u0010\u0014J9\u0010p\u001a\u00020\u00122\u000e\u0010l\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0k2\u0006\u0010m\u001a\u00020'2\b\u0010n\u001a\u0004\u0018\u00010\u001b2\u0006\u0010o\u001a\u000207H\u0002¢\u0006\u0004\bp\u0010qJ+\u0010v\u001a\u00020\u00122\u001a\u0010u\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020t\u0012\u0006\u0012\u0004\u0018\u00010t0s0rH\u0002¢\u0006\u0004\bv\u0010wJf\u0010\u007f\u001a\u00028\u0000\"\u0004\b\u0000\u0010x2\n\b\u0002\u0010y\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010z\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u00172\u001c\b\u0002\u0010|\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020{\u0012\u0006\u0012\u0004\u0018\u00010\u001b0s0r2\f\u0010~\u001a\b\u0012\u0004\u0012\u00028\u00000}H\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001J8\u0010\u0083\u0001\u001a\u00020\u00122\u0014\u0010\u0082\u0001\u001a\u000f\u0012\u0004\u0012\u00020{\u0012\u0004\u0012\u00020\u001b0\u0081\u00012\u000e\u0010l\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010}H\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J \u0010\u0085\u0001\u001a\u0004\u0018\u00010\u001b*\u00020f2\u0006\u0010L\u001a\u00020\u0017H\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u0011\u0010\u0087\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u0087\u0001\u0010\u0014J\u0011\u0010\u0088\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u0088\u0001\u0010\u0014J\u001b\u0010\u008a\u0001\u001a\u00020\u00122\u0007\u0010\u0089\u0001\u001a\u00020$H\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u0011\u0010\u008c\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u008c\u0001\u0010\u0014J\u001a\u0010\u008e\u0001\u001a\u00020\u00122\u0007\u0010\u008d\u0001\u001a\u00020\u0017H\u0002¢\u0006\u0005\b\u008e\u0001\u0010\u001aJ\u0011\u0010\u008f\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u008f\u0001\u0010\u0014J\u0011\u0010\u0090\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u0090\u0001\u0010\u0014J\u0011\u0010\u0091\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u0091\u0001\u0010\u0014J\u0019\u0010\u0092\u0001\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0005\b\u0092\u0001\u0010\u001aJ\u0011\u0010\u0093\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\b\u0093\u0001\u0010\u0014J\u0019\u0010\u0094\u0001\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0005\b\u0094\u0001\u0010\u001aJ\u0011\u0010\u0095\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\b\u0095\u0001\u0010\u0014J\u0011\u0010\u0096\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\b\u0096\u0001\u0010\u0014J\u0011\u0010\u0097\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\b\u0097\u0001\u0010\u0014J#\u0010\u0098\u0001\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0005\b\u0098\u0001\u0010\u001eJ\u0011\u0010\u0099\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\b\u0099\u0001\u0010\u0014J\u0011\u0010\u009a\u0001\u001a\u00020\u0012H\u0000¢\u0006\u0005\b\u009a\u0001\u0010\u0014J\u0011\u0010\u009b\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u009b\u0001\u0010\u0014J\u0011\u0010\u009c\u0001\u001a\u00020\u0012H\u0000¢\u0006\u0005\b\u009c\u0001\u0010\u0014J\u0011\u0010\u009d\u0001\u001a\u00020\u0012H\u0000¢\u0006\u0005\b\u009d\u0001\u0010\u0014J\u0011\u0010\u009e\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u009e\u0001\u0010\u0014J\u0011\u0010\u009f\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u009f\u0001\u0010\u0014J(\u0010 \u0001\u001a\u00020\u0012\"\u0005\b\u0000\u0010 \u00012\r\u0010¡\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000}H\u0016¢\u0006\u0006\b \u0001\u0010¢\u0001J\u0011\u0010£\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b£\u0001\u0010\u0014J\u0011\u0010¤\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b¤\u0001\u0010\u0014J#\u0010¥\u0001\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0005\b¥\u0001\u0010\u001eJ\u0011\u0010¦\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b¦\u0001\u0010\u0014J\u000f\u0010§\u0001\u001a\u00020\u0012¢\u0006\u0005\b§\u0001\u0010\u0014J\u000f\u0010¨\u0001\u001a\u00020\u0012¢\u0006\u0005\b¨\u0001\u0010\u0014JC\u0010«\u0001\u001a\u00020\u0012\"\u0005\b\u0000\u0010©\u0001\"\u0005\b\u0001\u0010 \u00012\u0006\u0010!\u001a\u00028\u00002\u0019\u0010~\u001a\u0015\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120ª\u0001H\u0016¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u0014\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u001bH\u0001¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J\u0014\u0010¯\u0001\u001a\u0004\u0018\u00010\u001bH\u0001¢\u0006\u0006\b¯\u0001\u0010®\u0001J\u001a\u0010x\u001a\u0002072\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0005\bx\u0010°\u0001J\u001c\u0010±\u0001\u001a\u0002072\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0006\b±\u0001\u0010°\u0001J\u001a\u0010²\u0001\u001a\u0002072\u0006\u0010!\u001a\u000207H\u0017¢\u0006\u0006\b²\u0001\u0010³\u0001J\u001b\u0010µ\u0001\u001a\u0002072\u0007\u0010!\u001a\u00030´\u0001H\u0017¢\u0006\u0006\bµ\u0001\u0010¶\u0001J\u001b\u0010¸\u0001\u001a\u0002072\u0007\u0010!\u001a\u00030·\u0001H\u0017¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\u001a\u0010º\u0001\u001a\u0002072\u0006\u0010!\u001a\u00020\u0017H\u0017¢\u0006\u0006\bº\u0001\u0010»\u0001J\u001b\u0010¼\u0001\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0001¢\u0006\u0005\b¼\u0001\u0010#J\u001b\u0010½\u0001\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0001¢\u0006\u0005\b½\u0001\u0010#J!\u0010¿\u0001\u001a\u00020\u00122\r\u0010¾\u0001\u001a\b\u0012\u0004\u0012\u00020\u00120}H\u0016¢\u0006\u0006\b¿\u0001\u0010¢\u0001J\u001f\u0010Á\u0001\u001a\u00020\u00122\u000b\u0010!\u001a\u0007\u0012\u0002\b\u00030À\u0001H\u0017¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J\u0011\u0010Ã\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\bÃ\u0001\u0010\u0014J)\u0010Æ\u0001\u001a\u00020\u00122\u0015\u0010Å\u0001\u001a\u0010\u0012\u000b\b\u0001\u0012\u0007\u0012\u0002\b\u00030À\u00010Ä\u0001H\u0017¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001J\u0011\u0010È\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\bÈ\u0001\u0010\u0014J(\u0010Ê\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010 \u00012\r\u0010\u0018\u001a\t\u0012\u0004\u0012\u00028\u00000É\u0001H\u0017¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001J\u0012\u0010Ì\u0001\u001a\u00020\u0004H\u0016¢\u0006\u0006\bÌ\u0001\u0010Í\u0001J&\u0010Ð\u0001\u001a\u0002072\u0007\u0010Î\u0001\u001a\u00020{2\t\u0010Ï\u0001\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001J\u0011\u0010Ò\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\bÒ\u0001\u0010\u0014J\u0011\u0010Ó\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\bÓ\u0001\u0010\u0014J\u001a\u0010Õ\u0001\u001a\u00020\u00122\u0007\u0010Ô\u0001\u001a\u000207H\u0017¢\u0006\u0005\bÕ\u0001\u0010JJ\u001a\u0010Ö\u0001\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0006\bÖ\u0001\u0010×\u0001J\u0015\u0010Ù\u0001\u001a\u0005\u0018\u00010Ø\u0001H\u0017¢\u0006\u0006\bÙ\u0001\u0010Ú\u0001J-\u0010Û\u0001\u001a\u00020\u00122\u001a\u0010u\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020t\u0012\u0006\u0012\u0004\u0018\u00010t0s0rH\u0017¢\u0006\u0005\bÛ\u0001\u0010wJ6\u0010Ü\u0001\u001a\u00020\u00122\u0014\u0010\u0082\u0001\u001a\u000f\u0012\u0004\u0012\u00020{\u0012\u0004\u0012\u00020\u001b0\u0081\u00012\f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00120}H\u0000¢\u0006\u0006\bÜ\u0001\u0010\u0084\u0001J \u0010Ý\u0001\u001a\u00020\u00122\f\u0010~\u001a\b\u0012\u0004\u0012\u00020\u00120}H\u0000¢\u0006\u0006\bÝ\u0001\u0010¢\u0001J(\u0010Þ\u0001\u001a\u0002072\u0014\u0010\u0082\u0001\u001a\u000f\u0012\u0004\u0012\u00020{\u0012\u0004\u0012\u00020\u001b0\u0081\u0001H\u0000¢\u0006\u0006\bÞ\u0001\u0010ß\u0001J\u0014\u0010à\u0001\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0006\bà\u0001\u0010®\u0001J\u001b\u0010á\u0001\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0005\bá\u0001\u0010#J\u001c\u0010ã\u0001\u001a\u00020\u00122\b\u0010Î\u0001\u001a\u00030â\u0001H\u0016¢\u0006\u0006\bã\u0001\u0010ä\u0001R\"\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bå\u0001\u0010æ\u0001\u001a\u0006\bç\u0001\u0010è\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010é\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010ê\u0001R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010ë\u0001R\u0018\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bà\u0001\u0010ì\u0001R\u0018\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010ì\u0001R\u001e\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bº\u0001\u0010í\u0001\u001a\u0006\bî\u0001\u0010ï\u0001R \u0010ò\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010A0ð\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010ñ\u0001R\u001b\u0010õ\u0001\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bó\u0001\u0010ô\u0001R\u0019\u0010ö\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010\u0095\u0001R\u0019\u0010÷\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010\u0095\u0001R\u0018\u0010c\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010\u0095\u0001R\u0018\u0010û\u0001\u001a\u00030ø\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bù\u0001\u0010ú\u0001R\u001c\u0010þ\u0001\u001a\u0005\u0018\u00010ü\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010ý\u0001R\u001c\u0010\u0081\u0002\u001a\u0005\u0018\u00010ÿ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010\u0080\u0002R\u0019\u0010\u0083\u0002\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0082\u0002R\u0019\u0010\u0084\u0002\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÖ\u0001\u0010\u0082\u0002R\u0019\u0010\u0085\u0002\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0082\u0002R\u001e\u0010|\u001a\n\u0012\u0005\u0012\u00030\u0087\u00020\u0086\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u0088\u0002R\u0018\u0010\u008a\u0002\u001a\u00030ø\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0002\u0010ú\u0001R\u0019\u0010\u008c\u0002\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010\u008b\u0002R\"\u0010\u008f\u0002\u001a\u000b\u0012\u0004\u0012\u00020'\u0018\u00010\u008d\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bç\u0001\u0010\u008e\u0002R\u0019\u0010\u0090\u0002\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010\u0082\u0002R\u0018\u0010\u0091\u0002\u001a\u00030ø\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÙ\u0001\u0010ú\u0001R\u0019\u0010\u0092\u0002\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010\u0082\u0002R\u0019\u0010\u0093\u0002\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u0095\u0001R\u0019\u0010\u0094\u0002\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bã\u0001\u0010\u0095\u0001R\u0019\u0010\u0095\u0002\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0001\u0010\u0095\u0001R\u0019\u0010\u0097\u0002\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0002\u0010\u0082\u0002R\u0018\u0010\u009a\u0002\u001a\u00030\u0098\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010\u0099\u0002R\u001e\u0010\u009c\u0002\u001a\t\u0012\u0004\u0012\u00020{0ð\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0002\u0010ñ\u0001R*\u0010¡\u0002\u001a\u0002072\u0007\u0010\u009d\u0002\u001a\u0002078\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b\u009e\u0002\u0010\u0082\u0002\u001a\u0006\b\u009f\u0002\u0010 \u0002R*\u0010£\u0002\u001a\u0002072\u0007\u0010\u009d\u0002\u001a\u0002078\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b£\u0001\u0010\u0082\u0002\u001a\u0006\b¢\u0002\u0010 \u0002R)\u0010©\u0002\u001a\u00020f8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010¤\u0002\u001a\u0006\b¥\u0002\u0010¦\u0002\"\u0006\b§\u0002\u0010¨\u0002R)\u0010®\u0002\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bá\u0001\u0010ê\u0001\u001a\u0006\bª\u0002\u0010«\u0002\"\u0006\b¬\u0002\u0010\u00ad\u0002R\u001a\u0010²\u0002\u001a\u00030¯\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0002\u0010±\u0002R\u0019\u0010³\u0002\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010\u0082\u0002R\u001b\u0010´\u0002\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u008b\u0002R+\u0010¹\u0002\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÃ\u0001\u0010ì\u0001\u001a\u0006\bµ\u0002\u0010¶\u0002\"\u0006\b·\u0002\u0010¸\u0002R\u0018\u0010¼\u0002\u001a\u00030º\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010»\u0002R\u0019\u0010¾\u0002\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010½\u0002R\u001a\u0010Á\u0002\u001a\u00030¿\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010À\u0002R/\u0010F\u001a\u0002072\u0007\u0010\u009d\u0002\u001a\u0002078\u0016@RX\u0097\u000e¢\u0006\u0016\n\u0005\bx\u0010\u0082\u0002\u0012\u0005\bÂ\u0002\u0010\u0014\u001a\u0006\bù\u0001\u0010 \u0002R1\u0010Å\u0002\u001a\u00020\u00172\u0007\u0010\u009d\u0002\u001a\u00020\u00178\u0016@RX\u0097\u000e¢\u0006\u0017\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u0012\u0005\bÄ\u0002\u0010\u0014\u001a\u0006\b°\u0002\u0010Ã\u0002R\u001d\u0010È\u0002\u001a\u0004\u0018\u00010\u001b*\u00020f8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÆ\u0002\u0010Ç\u0002R\u0017\u0010Ê\u0002\u001a\u0002078@X\u0080\u0004¢\u0006\b\u001a\u0006\bÉ\u0002\u0010 \u0002R\u0018\u0010Í\u0002\u001a\u00030Ë\u00028WX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0096\u0002\u0010Ì\u0002R\u001e\u0010Ï\u0002\u001a\u0002078VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bÎ\u0002\u0010\u0014\u001a\u0006\b\u009e\u0002\u0010 \u0002R\u001e\u0010Ñ\u0002\u001a\u0002078VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bÐ\u0002\u0010\u0014\u001a\u0006\b\u0089\u0002\u0010 \u0002R\u0018\u0010Ô\u0002\u001a\u00030Ò\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bó\u0001\u0010Ó\u0002R\u0018\u0010×\u0002\u001a\u00030Õ\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009b\u0002\u0010Ö\u0002R\u0019\u0010Ú\u0002\u001a\u0004\u0018\u00010{8@X\u0080\u0004¢\u0006\b\u001a\u0006\bØ\u0002\u0010Ù\u0002R\u001a\u0010Ü\u0002\u001a\u0005\u0018\u00010â\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bå\u0001\u0010Û\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Ý\u0002"}, d2 = {"LO/m;", "LO/l;", "LO/f;", "applier", "LO/q;", "parentContext", "LO/Z0;", "slotTable", "", "LO/R0;", "abandonSet", "LP/a;", "changes", "lateChanges", "LO/E;", "composition", "<init>", "(LO/f;LO/q;LO/Z0;Ljava/util/Set;LP/a;LP/a;LO/E;)V", "Loa/F;", "o1", "()V", "v0", "U", "", "key", "k1", "(I)V", "", "dataKey", "l1", "(ILjava/lang/Object;)V", "t0", "h1", "value", "u1", "(Ljava/lang/Object;)V", "LO/d;", "b1", "()LO/d;", "LO/z0;", "m0", "()LO/z0;", "group", "n0", "(I)LO/z0;", "parentScope", "currentProviders", "t1", "(LO/z0;LO/z0;)LO/z0;", "providers", "Z0", "(LO/z0;)V", "w0", "l0", "A0", "", "isNode", "data", "m1", "(ZLjava/lang/Object;)V", "objectKey", "LO/T;", "kind", "j1", "(ILjava/lang/Object;ILjava/lang/Object;)V", "LO/y0;", "newPending", "x0", "(ZLO/y0;)V", "expectedNodeCount", "inserting", "y0", "(IZ)V", "s0", "(Z)V", "W0", "index", "K0", "(I)I", "newCount", "s1", "(II)V", "groupLocation", "recomposeGroup", "recomposeIndex", "Q0", "(IIII)I", "S0", "w1", "count", "r1", "i0", "oldGroup", "newGroup", "commonRoot", "a1", "(III)V", "nearestCommonRoot", "r0", "rGroupIndex", "recomposeKey", "k0", "LO/Y0;", "H0", "(LO/Y0;I)I", "i1", "f0", "LO/i0;", "content", "locals", "parameter", "force", "L0", "(LO/i0;LO/z0;Ljava/lang/Object;Z)V", "", "Loa/o;", "LO/k0;", "references", "I0", "(Ljava/util/List;)V", "R", "from", "to", "LO/J0;", "invalidations", "Lkotlin/Function0;", "block", "U0", "(LO/E;LO/E;Ljava/lang/Integer;Ljava/util/List;LBa/a;)Ljava/lang/Object;", "LQ/f;", "invalidationsRequested", "q0", "(LQ/f;LBa/p;)V", "P0", "(LO/Y0;I)Ljava/lang/Object;", "x1", "y1", "anchor", "Y0", "(LO/d;)V", "X0", "groupBeingRemoved", "d1", "c1", "z0", "h0", "e", "O", "S", "I", "q", "Q", "s", "M", "g0", "a", "p0", "o0", "A", "t", "T", "factory", "(LBa/a;)V", "H", "P", "x", "d", "n1", "u0", "V", "Lkotlin/Function2;", "k", "(Ljava/lang/Object;LBa/p;)V", "N0", "()Ljava/lang/Object;", "O0", "(Ljava/lang/Object;)Z", "l", "c", "(Z)Z", "", "g", "(F)Z", "", "i", "(J)Z", "h", "(I)Z", "v1", "q1", "effect", "v", "LO/H0;", "m", "(LO/H0;)V", "N", "", "values", "z", "([LO/H0;)V", "E", "LO/u;", "o", "(LO/u;)Ljava/lang/Object;", "L", "()LO/q;", "scope", "instance", "p1", "(LO/J0;Ljava/lang/Object;)Z", "g1", "C", "changed", "p", "r", "(I)LO/l;", "LO/W0;", "y", "()LO/W0;", "J0", "j0", "R0", "T0", "(LQ/f;)Z", "f", "J", "LO/I0;", "B", "(LO/I0;)V", "b", "LO/f;", "w", "()LO/f;", "LO/q;", "LO/Z0;", "Ljava/util/Set;", "LP/a;", "LO/E;", "C0", "()LO/E;", "LO/w1;", "LO/w1;", "pendingStack", "j", "LO/y0;", "pending", "nodeIndex", "groupNodeCount", "LO/V;", "n", "LO/V;", "parentStateStack", "", "[I", "nodeCountOverrides", "Ls/z;", "Ls/z;", "nodeCountVirtualOverrides", "Z", "forceRecomposeScopes", "forciblyRecompose", "nodeExpected", "", "LO/X;", "Ljava/util/List;", "u", "entersStack", "LO/z0;", "parentProvider", "LQ/a;", "LQ/a;", "providerUpdates", "providersInvalid", "providersInvalidStack", "reusing", "reusingGroup", "childrenComposing", "compositionToken", "D", "sourceMarkersEnabled", "O/m$c", "LO/m$c;", "derivedStateObserver", "F", "invalidateStack", "<set-?>", "G", "M0", "()Z", "isComposing", "isDisposed$runtime_release", "isDisposed", "LO/Y0;", "G0", "()LO/Y0;", "f1", "(LO/Y0;)V", "reader", "getInsertTable$runtime_release", "()LO/Z0;", "setInsertTable$runtime_release", "(LO/Z0;)V", "insertTable", "LO/c1;", "K", "LO/c1;", "writer", "writerHasAProvider", "providerCache", "E0", "()LP/a;", "setDeferredChanges$runtime_release", "(LP/a;)V", "deferredChanges", "LP/b;", "LP/b;", "changeListWriter", "LO/d;", "insertAnchor", "LP/c;", "LP/c;", "insertFixups", "getInserting$annotations", "()I", "getCompoundKeyHash$annotations", "compoundKeyHash", "F0", "(LO/Y0;)Ljava/lang/Object;", "node", "B0", "areChildrenComposing", "Lta/g;", "()Lta/g;", "applyCoroutineContext", "getDefaultsInvalid$annotations", "defaultsInvalid", "getSkipping$annotations", "skipping", "La0/a;", "()La0/a;", "compositionData", "LO/x;", "()LO/x;", "currentCompositionLocalMap", "D0", "()LO/J0;", "currentRecomposeScope", "()LO/I0;", "recomposeScope", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1556m implements InterfaceC1554l {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private int childrenComposing;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private int compositionToken;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private boolean sourceMarkersEnabled;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final c derivedStateObserver;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final w1<C1507J0> invalidateStack;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private boolean isComposing;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private boolean isDisposed;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private SlotReader reader;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private Z0 insertTable;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private SlotWriter writer;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private boolean writerHasAProvider;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1583z0 providerCache;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private P.a deferredChanges;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final P.b changeListWriter;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private C1536d insertAnchor;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private P.c insertFixups;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private boolean inserting;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private int compoundKeyHash;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1542f<?> applier;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC1564q parentContext;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Z0 slotTable;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Set<R0> abandonSet;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private P.a changes;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private P.a lateChanges;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1496E composition;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private C1581y0 pending;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int nodeIndex;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int groupNodeCount;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int rGroupIndex;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int[] nodeCountOverrides;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private C4415z nodeCountVirtualOverrides;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean forceRecomposeScopes;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean forciblyRecompose;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean nodeExpected;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private Q.a<InterfaceC1583z0> providerUpdates;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean providersInvalid;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private boolean reusing;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final w1<C1581y0> pendingStack = new w1<>();

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final C1522V parentStateStack = new C1522V();

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final List<C1524X> invalidations = new ArrayList();

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final C1522V entersStack = new C1522V();

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1583z0 parentProvider = W.f.a();

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final C1522V providersInvalidStack = new C1522V();

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private int reusingGroup = -1;

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0017H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u001b\u0010\u0016J\u000f\u0010\u001d\u001a\u00020\u001cH\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b \u0010!J\u001d\u0010%\u001a\u00020\u000b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0010¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000bH\u0010¢\u0006\u0004\b'\u0010\rJ\u000f\u0010(\u001a\u00020\u000bH\u0010¢\u0006\u0004\b(\u0010\rJ\u0017\u0010+\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)H\u0010¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)H\u0010¢\u0006\u0004\b-\u0010,J\u0019\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010*\u001a\u00020)H\u0010¢\u0006\u0004\b/\u00100J\u001f\u00102\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)2\u0006\u00101\u001a\u00020.H\u0010¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b4\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0019\u00105\u001a\u0004\b6\u00107R\u001a\u0010\u0005\u001a\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b-\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u0006\u001a\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b(\u00108\u001a\u0004\b;\u0010:R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R0\u0010D\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010&R\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020E0\"8\u0006¢\u0006\f\n\u0004\b;\u0010@\u001a\u0004\bF\u0010BR+\u0010L\u001a\u00020\u001c2\u0006\u0010H\u001a\u00020\u001c8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010I\u001a\u0004\bJ\u0010\u001e\"\u0004\bK\u0010!R\u0014\u0010M\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b<\u0010:R\u0014\u0010Q\u001a\u00020N8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006R"}, d2 = {"LO/m$b;", "LO/q;", "", "compoundHashKey", "", "collectingParameterInformation", "collectingSourceInformation", "LO/z;", "observerHolder", "<init>", "(LO/m;IZZLO/z;)V", "Loa/F;", "u", "()V", "LO/l;", "composer", "p", "(LO/l;)V", "s", "LO/E;", "composition", "t", "(LO/E;)V", "Lkotlin/Function0;", "content", "a", "(LO/E;LBa/p;)V", "l", "LO/z0;", "g", "()LO/z0;", "scope", "y", "(LO/z0;)V", "", "La0/a;", "table", "o", "(Ljava/util/Set;)V", "r", "c", "LO/k0;", "reference", "k", "(LO/k0;)V", "b", "LO/j0;", "n", "(LO/k0;)LO/j0;", "data", "m", "(LO/k0;LO/j0;)V", "q", "I", "h", "()I", "Z", "e", "()Z", "f", "d", "LO/z;", "j", "()LO/z;", "Ljava/util/Set;", "getInspectionTables", "()Ljava/util/Set;", "setInspectionTables", "inspectionTables", "LO/m;", "v", "composers", "<set-?>", "LO/p0;", "w", "x", "compositionLocalScope", "collectingCallByInformation", "Lta/g;", "i", "()Lta/g;", "effectCoroutineContext", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O.m$b */
    private final class b extends AbstractC1564q {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int compoundHashKey;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean collectingParameterInformation;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean collectingSourceInformation;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final C1582z observerHolder;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private Set<Set<InterfaceC1879a>> inspectionTables;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Set<C1556m> composers = new LinkedHashSet();

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC1563p0 compositionLocalScope = m1.g(W.f.a(), m1.l());

        public b(int i10, boolean z10, boolean z11, C1582z c1582z) {
            this.compoundHashKey = i10;
            this.collectingParameterInformation = z10;
            this.collectingSourceInformation = z11;
            this.observerHolder = c1582z;
        }

        private final InterfaceC1583z0 w() {
            return (InterfaceC1583z0) this.compositionLocalScope.getValue();
        }

        private final void x(InterfaceC1583z0 interfaceC1583z0) {
            this.compositionLocalScope.setValue(interfaceC1583z0);
        }

        @Override // kotlin.AbstractC1564q
        public void a(InterfaceC1496E composition, p<? super InterfaceC1554l, ? super Integer, C4153F> content) {
            C1556m.this.parentContext.a(composition, content);
        }

        @Override // kotlin.AbstractC1564q
        public void b(C1553k0 reference) {
            C1556m.this.parentContext.b(reference);
        }

        @Override // kotlin.AbstractC1564q
        public void c() {
            C1556m c1556m = C1556m.this;
            c1556m.childrenComposing--;
        }

        @Override // kotlin.AbstractC1564q
        public boolean d() {
            return C1556m.this.parentContext.d();
        }

        @Override // kotlin.AbstractC1564q
        /* renamed from: e, reason: from getter */
        public boolean getCollectingParameterInformation() {
            return this.collectingParameterInformation;
        }

        @Override // kotlin.AbstractC1564q
        /* renamed from: f, reason: from getter */
        public boolean getCollectingSourceInformation() {
            return this.collectingSourceInformation;
        }

        @Override // kotlin.AbstractC1564q
        public InterfaceC1583z0 g() {
            return w();
        }

        @Override // kotlin.AbstractC1564q
        /* renamed from: h, reason: from getter */
        public int getCompoundHashKey() {
            return this.compoundHashKey;
        }

        @Override // kotlin.AbstractC1564q
        /* renamed from: i */
        public g getEffectCoroutineContext() {
            return C1556m.this.parentContext.getEffectCoroutineContext();
        }

        @Override // kotlin.AbstractC1564q
        /* renamed from: j, reason: from getter */
        public C1582z getObserverHolder() {
            return this.observerHolder;
        }

        @Override // kotlin.AbstractC1564q
        public void k(C1553k0 reference) {
            C1556m.this.parentContext.k(reference);
        }

        @Override // kotlin.AbstractC1564q
        public void l(InterfaceC1496E composition) {
            C1556m.this.parentContext.l(C1556m.this.getComposition());
            C1556m.this.parentContext.l(composition);
        }

        @Override // kotlin.AbstractC1564q
        public void m(C1553k0 reference, C1551j0 data) {
            C1556m.this.parentContext.m(reference, data);
        }

        @Override // kotlin.AbstractC1564q
        public C1551j0 n(C1553k0 reference) {
            return C1556m.this.parentContext.n(reference);
        }

        @Override // kotlin.AbstractC1564q
        public void o(Set<InterfaceC1879a> table) {
            Set hashSet = this.inspectionTables;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.inspectionTables = hashSet;
            }
            hashSet.add(table);
        }

        @Override // kotlin.AbstractC1564q
        public void p(InterfaceC1554l composer) {
            C3862t.e(composer, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
            super.p((C1556m) composer);
            this.composers.add(composer);
        }

        @Override // kotlin.AbstractC1564q
        public void q(InterfaceC1496E composition) {
            C1556m.this.parentContext.q(composition);
        }

        @Override // kotlin.AbstractC1564q
        public void r() {
            C1556m.this.childrenComposing++;
        }

        @Override // kotlin.AbstractC1564q
        public void s(InterfaceC1554l composer) {
            Set<Set<InterfaceC1879a>> set = this.inspectionTables;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    Set set2 = (Set) it.next();
                    C3862t.e(composer, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                    set2.remove(((C1556m) composer).slotTable);
                }
            }
            W.a(this.composers).remove(composer);
        }

        @Override // kotlin.AbstractC1564q
        public void t(InterfaceC1496E composition) {
            C1556m.this.parentContext.t(composition);
        }

        public final void u() {
            if (this.composers.isEmpty()) {
                return;
            }
            Set<Set<InterfaceC1879a>> set = this.inspectionTables;
            if (set != null) {
                for (C1556m c1556m : this.composers) {
                    Iterator<Set<InterfaceC1879a>> it = set.iterator();
                    while (it.hasNext()) {
                        it.next().remove(c1556m.slotTable);
                    }
                }
            }
            this.composers.clear();
        }

        public final Set<C1556m> v() {
            return this.composers;
        }

        public final void y(InterfaceC1583z0 scope) {
            x(scope);
        }
    }

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"O/m$c", "LO/I;", "LO/H;", "derivedState", "Loa/F;", "a", "(LO/H;)V", "b", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O.m$c */
    public static final class c implements InterfaceC1504I {
        c() {
        }

        @Override // kotlin.InterfaceC1504I
        public void a(InterfaceC1502H<?> derivedState) {
            C1556m.this.childrenComposing++;
        }

        @Override // kotlin.InterfaceC1504I
        public void b(InterfaceC1502H<?> derivedState) {
            C1556m c1556m = C1556m.this;
            c1556m.childrenComposing--;
        }
    }

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O.m$d */
    static final class d extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ P.a f12940C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ SlotReader f12941D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ C1553k0 f12942E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(P.a aVar, SlotReader slotReader, C1553k0 c1553k0) {
            super(0);
            this.f12940C = aVar;
            this.f12941D = slotReader;
            this.f12942E = c1553k0;
        }

        public final void a() {
            P.b bVar = C1556m.this.changeListWriter;
            P.a aVar = this.f12940C;
            C1556m c1556m = C1556m.this;
            SlotReader slotReader = this.f12941D;
            C1553k0 c1553k0 = this.f12942E;
            P.a changeList = bVar.getChangeList();
            try {
                bVar.T(aVar);
                SlotReader reader = c1556m.getReader();
                int[] iArr = c1556m.nodeCountOverrides;
                Q.a aVar2 = c1556m.providerUpdates;
                c1556m.nodeCountOverrides = null;
                c1556m.providerUpdates = null;
                try {
                    c1556m.f1(slotReader);
                    P.b bVar2 = c1556m.changeListWriter;
                    boolean implicitRootStart = bVar2.getImplicitRootStart();
                    try {
                        bVar2.U(false);
                        c1556m.L0(c1553k0.c(), c1553k0.getLocals(), c1553k0.getParameter(), true);
                        bVar2.U(implicitRootStart);
                        C4153F c4153f = C4153F.f46609a;
                    } catch (Throwable th) {
                        bVar2.U(implicitRootStart);
                        throw th;
                    }
                } finally {
                    c1556m.f1(reader);
                    c1556m.nodeCountOverrides = iArr;
                    c1556m.providerUpdates = aVar2;
                }
            } finally {
                bVar.T(changeList);
            }
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O.m$e */
    static final class e extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C1553k0 f12944C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C1553k0 c1553k0) {
            super(0);
            this.f12944C = c1553k0;
        }

        public final void a() {
            C1556m.this.L0(this.f12944C.c(), this.f12944C.getLocals(), this.f12944C.getParameter(), true);
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O.m$f */
    static final class f extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ C1549i0<Object> f12945B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Object f12946C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C1549i0<Object> c1549i0, Object obj) {
            super(2);
            this.f12945B = c1549i0;
            this.f12946C = obj;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(316014703, i10, -1, "androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.<anonymous> (Composer.kt:3293)");
            }
            this.f12945B.a().g(this.f12946C, interfaceC1554l, 0);
            if (C1560o.J()) {
                C1560o.R();
            }
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    public C1556m(InterfaceC1542f<?> interfaceC1542f, AbstractC1564q abstractC1564q, Z0 z02, Set<R0> set, P.a aVar, P.a aVar2, InterfaceC1496E interfaceC1496E) {
        this.applier = interfaceC1542f;
        this.parentContext = abstractC1564q;
        this.slotTable = z02;
        this.abandonSet = set;
        this.changes = aVar;
        this.lateChanges = aVar2;
        this.composition = interfaceC1496E;
        this.sourceMarkersEnabled = abstractC1564q.getCollectingSourceInformation() || abstractC1564q.d();
        this.derivedStateObserver = new c();
        this.invalidateStack = new w1<>();
        SlotReader slotReaderK = z02.K();
        slotReaderK.d();
        this.reader = slotReaderK;
        Z0 z03 = new Z0();
        if (abstractC1564q.getCollectingSourceInformation()) {
            z03.x();
        }
        if (abstractC1564q.d()) {
            z03.w();
        }
        this.insertTable = z03;
        SlotWriter slotWriterL = z03.L();
        slotWriterL.L(true);
        this.writer = slotWriterL;
        this.changeListWriter = new P.b(this, this.changes);
        SlotReader slotReaderK2 = this.insertTable.K();
        try {
            C1536d c1536dA = slotReaderK2.a(0);
            slotReaderK2.d();
            this.insertAnchor = c1536dA;
            this.insertFixups = new P.c();
        } catch (Throwable th) {
            slotReaderK2.d();
            throw th;
        }
    }

    private final void A0() {
        Z0 z02 = new Z0();
        if (this.sourceMarkersEnabled) {
            z02.x();
        }
        if (this.parentContext.d()) {
            z02.w();
        }
        this.insertTable = z02;
        SlotWriter slotWriterL = z02.L();
        slotWriterL.L(true);
        this.writer = slotWriterL;
    }

    private final Object F0(SlotReader slotReader) {
        return slotReader.L(slotReader.getParent());
    }

    private final int H0(SlotReader slotReader, int i10) {
        Object objZ;
        if (!slotReader.G(i10)) {
            int iC = slotReader.C(i10);
            if (iC == 207 && (objZ = slotReader.z(i10)) != null && !C3862t.b(objZ, InterfaceC1554l.INSTANCE.a())) {
                iC = objZ.hashCode();
            }
            return iC;
        }
        Object objD = slotReader.D(i10);
        if (objD == null) {
            return 0;
        }
        if (objD instanceof Enum) {
            return ((Enum) objD).ordinal();
        }
        if (objD instanceof C1549i0) {
            return 126665345;
        }
        return objD.hashCode();
    }

    private final void I0(List<C4170o<C1553k0, C1553k0>> references) throws Throwable {
        P.b bVar;
        P.a aVar;
        P.b bVar2;
        P.a aVar2;
        Z0 slotTable;
        C1536d anchor;
        SlotReader slotReader;
        int[] iArr;
        Q.a aVar3;
        P.a aVar4;
        P.b bVar3;
        int i10;
        InterfaceC1496E composition;
        InterfaceC1496E composition2;
        Integer numValueOf;
        int i11;
        Z0 slotTable2;
        SlotReader slotReader2;
        P.a aVar5;
        int i12 = 1;
        P.b bVar4 = this.changeListWriter;
        P.a aVar6 = this.lateChanges;
        P.a changeList = bVar4.getChangeList();
        try {
            bVar4.T(aVar6);
            this.changeListWriter.R();
            int size = references.size();
            int i13 = 0;
            int i14 = 0;
            while (i14 < size) {
                try {
                    C4170o<C1553k0, C1553k0> c4170o = references.get(i14);
                    C1553k0 c1553k0A = c4170o.a();
                    C1553k0 c1553k0B = c4170o.b();
                    C1536d anchor2 = c1553k0A.getAnchor();
                    int iH = c1553k0A.getSlotTable().h(anchor2);
                    IntRef intRef = new IntRef(i13, i12, null);
                    this.changeListWriter.e(intRef, anchor2);
                    if (c1553k0B == null) {
                        if (C3862t.b(c1553k0A.getSlotTable(), this.insertTable)) {
                            l0();
                        }
                        SlotReader slotReaderK = c1553k0A.getSlotTable().K();
                        try {
                            slotReaderK.Q(iH);
                            this.changeListWriter.z(iH);
                            aVar5 = new P.a();
                            slotReader2 = slotReaderK;
                        } catch (Throwable th) {
                            th = th;
                            slotReader2 = slotReaderK;
                        }
                        try {
                            V0(this, null, null, null, null, new d(aVar5, slotReaderK, c1553k0A), 15, null);
                            this.changeListWriter.s(aVar5, intRef);
                            C4153F c4153f = C4153F.f46609a;
                            slotReader2.d();
                            bVar2 = bVar4;
                            aVar2 = changeList;
                            i10 = size;
                            i11 = i14;
                        } catch (Throwable th2) {
                            th = th2;
                            slotReader2.d();
                            throw th;
                        }
                    } else {
                        C1551j0 c1551j0N = this.parentContext.n(c1553k0B);
                        if (c1551j0N == null || (slotTable = c1551j0N.getSlotTable()) == null) {
                            slotTable = c1553k0B.getSlotTable();
                        }
                        if (c1551j0N == null || (slotTable2 = c1551j0N.getSlotTable()) == null || (anchor = slotTable2.c(0)) == null) {
                            anchor = c1553k0B.getAnchor();
                        }
                        List<? extends Object> listQ = C1560o.q(slotTable, anchor);
                        if (!listQ.isEmpty()) {
                            this.changeListWriter.b(listQ, intRef);
                            if (C3862t.b(c1553k0A.getSlotTable(), this.slotTable)) {
                                int iH2 = this.slotTable.h(anchor2);
                                r1(iH2, w1(iH2) + listQ.size());
                            }
                        }
                        this.changeListWriter.c(c1551j0N, this.parentContext, c1553k0B, c1553k0A);
                        SlotReader slotReaderK2 = slotTable.K();
                        try {
                            SlotReader reader = getReader();
                            int[] iArr2 = this.nodeCountOverrides;
                            Q.a aVar7 = this.providerUpdates;
                            this.nodeCountOverrides = null;
                            this.providerUpdates = null;
                            try {
                                f1(slotReaderK2);
                                int iH3 = slotTable.h(anchor);
                                slotReaderK2.Q(iH3);
                                this.changeListWriter.z(iH3);
                                P.a aVar8 = new P.a();
                                P.b bVar5 = this.changeListWriter;
                                P.a changeList2 = bVar5.getChangeList();
                                try {
                                    bVar5.T(aVar8);
                                    i10 = size;
                                    P.b bVar6 = this.changeListWriter;
                                    boolean implicitRootStart = bVar6.getImplicitRootStart();
                                    try {
                                        bVar6.U(false);
                                        composition = c1553k0B.getComposition();
                                        composition2 = c1553k0A.getComposition();
                                        numValueOf = Integer.valueOf(slotReaderK2.getCurrent());
                                        bVar2 = bVar4;
                                        aVar3 = aVar7;
                                        aVar2 = changeList;
                                        aVar4 = changeList2;
                                        i11 = i14;
                                        iArr = iArr2;
                                        slotReader = slotReaderK2;
                                        bVar3 = bVar5;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        iArr = iArr2;
                                        slotReader = slotReaderK2;
                                        aVar3 = aVar7;
                                        bVar3 = bVar5;
                                        aVar4 = changeList2;
                                    }
                                    try {
                                        U0(composition, composition2, numValueOf, c1553k0B.d(), new e(c1553k0A));
                                        try {
                                            bVar6.U(implicitRootStart);
                                            try {
                                                bVar3.T(aVar4);
                                                this.changeListWriter.s(aVar8, intRef);
                                                C4153F c4153f2 = C4153F.f46609a;
                                                try {
                                                    f1(reader);
                                                    this.nodeCountOverrides = iArr;
                                                    this.providerUpdates = aVar3;
                                                    try {
                                                        slotReader.d();
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        aVar = aVar2;
                                                        bVar = bVar2;
                                                        bVar.T(aVar);
                                                        throw th;
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    slotReader.d();
                                                    throw th;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                f1(reader);
                                                this.nodeCountOverrides = iArr;
                                                this.providerUpdates = aVar3;
                                                throw th;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            bVar3.T(aVar4);
                                            throw th;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        bVar6.U(implicitRootStart);
                                        throw th;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    iArr = iArr2;
                                    slotReader = slotReaderK2;
                                    aVar3 = aVar7;
                                    aVar4 = changeList2;
                                    bVar3 = bVar5;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                iArr = iArr2;
                                slotReader = slotReaderK2;
                                aVar3 = aVar7;
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            slotReader = slotReaderK2;
                        }
                    }
                    this.changeListWriter.W();
                    i12 = 1;
                    i14 = i11 + 1;
                    size = i10;
                    changeList = aVar2;
                    bVar4 = bVar2;
                    i13 = 0;
                } catch (Throwable th12) {
                    th = th12;
                    bVar2 = bVar4;
                    aVar2 = changeList;
                }
            }
            P.b bVar7 = bVar4;
            P.a aVar9 = changeList;
            this.changeListWriter.h();
            this.changeListWriter.z(0);
            bVar7.T(aVar9);
        } catch (Throwable th13) {
            th = th13;
            bVar = bVar4;
            aVar = changeList;
        }
    }

    private final int K0(int index) {
        return (-2) - index;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L0(C1549i0<Object> content, InterfaceC1583z0 locals, Object parameter, boolean force) {
        s(126665345, content);
        u1(parameter);
        int compoundKeyHash = getCompoundKeyHash();
        try {
            this.compoundKeyHash = 126665345;
            boolean z10 = false;
            if (getInserting()) {
                SlotWriter.v0(this.writer, 0, 1, null);
            }
            if (!getInserting() && !C3862t.b(this.reader.l(), locals)) {
                z10 = true;
            }
            if (z10) {
                Z0(locals);
            }
            j1(202, C1560o.A(), C1520T.INSTANCE.a(), locals);
            this.providerCache = null;
            if (!getInserting() || force) {
                boolean z11 = this.providersInvalid;
                this.providersInvalid = z10;
                C1533c.d(this, W.c.b(316014703, true, new f(content, parameter)));
                this.providersInvalid = z11;
            } else {
                this.writerHasAProvider = true;
                SlotWriter slotWriter = this.writer;
                this.parentContext.k(new C1553k0(content, parameter, getComposition(), this.insertTable, slotWriter.E(slotWriter.H0(slotWriter.getParent())), r.m(), m0()));
            }
            t0();
            this.providerCache = null;
            this.compoundKeyHash = compoundKeyHash;
            M();
        } catch (Throwable th) {
            t0();
            this.providerCache = null;
            this.compoundKeyHash = compoundKeyHash;
            M();
            throw th;
        }
    }

    private final Object P0(SlotReader slotReader, int i10) {
        return slotReader.L(i10);
    }

    private final int Q0(int groupLocation, int group, int recomposeGroup, int recomposeIndex) {
        int iP = this.reader.P(group);
        while (iP != recomposeGroup && !this.reader.J(iP)) {
            iP = this.reader.P(iP);
        }
        if (this.reader.J(iP)) {
            recomposeIndex = 0;
        }
        if (iP == group) {
            return recomposeIndex;
        }
        int iW1 = (w1(iP) - this.reader.N(group)) + recomposeIndex;
        loop1: while (recomposeIndex < iW1 && iP != groupLocation) {
            iP++;
            while (iP < groupLocation) {
                int iE = this.reader.E(iP) + iP;
                if (groupLocation >= iE) {
                    recomposeIndex += this.reader.J(iP) ? 1 : w1(iP);
                    iP = iE;
                }
            }
            break loop1;
        }
        return recomposeIndex;
    }

    private final int S0(int group) {
        int iP = this.reader.P(group) + 1;
        int i10 = 0;
        while (iP < group) {
            if (!this.reader.G(iP)) {
                i10++;
            }
            iP += this.reader.E(iP);
        }
        return i10;
    }

    private final void U() {
        h0();
        this.pendingStack.a();
        this.parentStateStack.a();
        this.entersStack.a();
        this.providersInvalidStack.a();
        this.providerUpdates = null;
        this.insertFixups.a();
        this.compoundKeyHash = 0;
        this.childrenComposing = 0;
        this.nodeExpected = false;
        this.inserting = false;
        this.reusing = false;
        this.isComposing = false;
        this.forciblyRecompose = false;
        this.reusingGroup = -1;
        if (!this.reader.getClosed()) {
            this.reader.d();
        }
        if (this.writer.getClosed()) {
            return;
        }
        A0();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0005, B:5:0x0010, B:7:0x0022, B:11:0x002c, B:10:0x0028, B:14:0x0033, B:16:0x0039, B:18:0x003f), top: B:23:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final <R> R U0(kotlin.InterfaceC1496E r7, kotlin.InterfaceC1496E r8, java.lang.Integer r9, java.util.List<? extends oa.C4170o<kotlin.C1507J0, ? extends java.lang.Object>> r10, Ba.a<? extends R> r11) {
        /*
            r6 = this;
            boolean r0 = r6.isComposing
            int r1 = r6.nodeIndex
            r2 = 1
            r6.isComposing = r2     // Catch: java.lang.Throwable -> L26
            r2 = 0
            r6.nodeIndex = r2     // Catch: java.lang.Throwable -> L26
            int r3 = r10.size()     // Catch: java.lang.Throwable -> L26
        Le:
            if (r2 >= r3) goto L2f
            java.lang.Object r4 = r10.get(r2)     // Catch: java.lang.Throwable -> L26
            oa.o r4 = (oa.C4170o) r4     // Catch: java.lang.Throwable -> L26
            java.lang.Object r5 = r4.a()     // Catch: java.lang.Throwable -> L26
            O.J0 r5 = (kotlin.C1507J0) r5     // Catch: java.lang.Throwable -> L26
            java.lang.Object r4 = r4.b()     // Catch: java.lang.Throwable -> L26
            if (r4 == 0) goto L28
            r6.p1(r5, r4)     // Catch: java.lang.Throwable -> L26
            goto L2c
        L26:
            r7 = move-exception
            goto L48
        L28:
            r4 = 0
            r6.p1(r5, r4)     // Catch: java.lang.Throwable -> L26
        L2c:
            int r2 = r2 + 1
            goto Le
        L2f:
            if (r7 == 0) goto L3f
            if (r9 == 0) goto L38
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L26
            goto L39
        L38:
            r9 = -1
        L39:
            java.lang.Object r7 = r7.y(r8, r9, r11)     // Catch: java.lang.Throwable -> L26
            if (r7 != 0) goto L43
        L3f:
            java.lang.Object r7 = r11.invoke()     // Catch: java.lang.Throwable -> L26
        L43:
            r6.isComposing = r0
            r6.nodeIndex = r1
            return r7
        L48:
            r6.isComposing = r0
            r6.nodeIndex = r1
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1556m.U0(O.E, O.E, java.lang.Integer, java.util.List, Ba.a):java.lang.Object");
    }

    static /* synthetic */ Object V0(C1556m c1556m, InterfaceC1496E interfaceC1496E, InterfaceC1496E interfaceC1496E2, Integer num, List list, Ba.a aVar, int i10, Object obj) {
        InterfaceC1496E interfaceC1496E3 = (i10 & 1) != 0 ? null : interfaceC1496E;
        InterfaceC1496E interfaceC1496E4 = (i10 & 2) != 0 ? null : interfaceC1496E2;
        Integer num2 = (i10 & 4) != 0 ? null : num;
        if ((i10 & 8) != 0) {
            list = r.m();
        }
        return c1556m.U0(interfaceC1496E3, interfaceC1496E4, num2, list, aVar);
    }

    private final void W0() {
        boolean z10 = this.isComposing;
        this.isComposing = true;
        int parent = this.reader.getParent();
        int iE = this.reader.E(parent) + parent;
        int i10 = this.nodeIndex;
        int compoundKeyHash = getCompoundKeyHash();
        int i11 = this.groupNodeCount;
        int i12 = this.rGroupIndex;
        C1524X c1524xZ = C1560o.z(this.invalidations, this.reader.getCurrent(), iE);
        boolean z11 = false;
        int i13 = parent;
        while (c1524xZ != null) {
            int location = c1524xZ.getLocation();
            C1560o.O(this.invalidations, location);
            if (c1524xZ.d()) {
                this.reader.Q(location);
                int current = this.reader.getCurrent();
                a1(i13, current, parent);
                this.nodeIndex = Q0(location, current, parent, i10);
                this.rGroupIndex = S0(current);
                int iP = this.reader.P(current);
                this.compoundKeyHash = k0(iP, S0(iP), parent, compoundKeyHash);
                this.providerCache = null;
                c1524xZ.getScope().g(this);
                this.providerCache = null;
                this.reader.R(parent);
                i13 = current;
                z11 = true;
            } else {
                this.invalidateStack.h(c1524xZ.getScope());
                c1524xZ.getScope().y();
                this.invalidateStack.g();
            }
            c1524xZ = C1560o.z(this.invalidations, this.reader.getCurrent(), iE);
        }
        if (z11) {
            a1(i13, parent, parent);
            this.reader.T();
            int iW1 = w1(parent);
            this.nodeIndex = i10 + iW1;
            this.groupNodeCount = i11 + iW1;
            this.rGroupIndex = i12;
        } else {
            i1();
        }
        this.compoundKeyHash = compoundKeyHash;
        this.isComposing = z10;
    }

    private final void X0() {
        d1(this.reader.getCurrent());
        this.changeListWriter.P();
    }

    private final void Y0(C1536d anchor) {
        if (this.insertFixups.e()) {
            this.changeListWriter.t(anchor, this.insertTable);
        } else {
            this.changeListWriter.u(anchor, this.insertTable, this.insertFixups);
            this.insertFixups = new P.c();
        }
    }

    private final void Z0(InterfaceC1583z0 providers) {
        Q.a<InterfaceC1583z0> aVar = this.providerUpdates;
        if (aVar == null) {
            aVar = new Q.a<>(0, 1, null);
            this.providerUpdates = aVar;
        }
        aVar.b(this.reader.getCurrent(), providers);
    }

    private final void a1(int oldGroup, int newGroup, int commonRoot) {
        SlotReader slotReader = this.reader;
        int iL = C1560o.L(slotReader, oldGroup, newGroup, commonRoot);
        while (oldGroup > 0 && oldGroup != iL) {
            if (slotReader.J(oldGroup)) {
                this.changeListWriter.A();
            }
            oldGroup = slotReader.P(oldGroup);
        }
        r0(newGroup, iL);
    }

    private final C1536d b1() {
        int i10;
        int i11;
        if (getInserting()) {
            if (!C1560o.I(this.writer)) {
                return null;
            }
            int currentGroup = this.writer.getCurrentGroup() - 1;
            int iH0 = this.writer.H0(currentGroup);
            while (true) {
                int i12 = iH0;
                i11 = currentGroup;
                currentGroup = i12;
                if (currentGroup == this.writer.getParent() || currentGroup < 0) {
                    break;
                }
                iH0 = this.writer.H0(currentGroup);
            }
            return this.writer.E(i11);
        }
        if (!C1560o.H(this.reader)) {
            return null;
        }
        int current = this.reader.getCurrent() - 1;
        int iP = this.reader.P(current);
        while (true) {
            int i13 = iP;
            i10 = current;
            current = i13;
            if (current == this.reader.getParent() || current < 0) {
                break;
            }
            iP = this.reader.P(current);
        }
        return this.reader.a(i10);
    }

    private final void c1() {
        if (this.slotTable.y()) {
            P.a aVar = new P.a();
            this.deferredChanges = aVar;
            SlotReader slotReaderK = this.slotTable.K();
            try {
                this.reader = slotReaderK;
                P.b bVar = this.changeListWriter;
                P.a changeList = bVar.getChangeList();
                try {
                    bVar.T(aVar);
                    d1(0);
                    this.changeListWriter.M();
                    bVar.T(changeList);
                    C4153F c4153f = C4153F.f46609a;
                } catch (Throwable th) {
                    bVar.T(changeList);
                    throw th;
                }
            } finally {
                slotReaderK.d();
            }
        }
    }

    private final void d1(int groupBeingRemoved) {
        e1(this, groupBeingRemoved, false, 0);
        this.changeListWriter.i();
    }

    private static final int e1(C1556m c1556m, int i10, boolean z10, int i11) {
        SlotReader slotReader = c1556m.reader;
        if (!slotReader.F(i10)) {
            if (!slotReader.e(i10)) {
                if (slotReader.J(i10)) {
                    return 1;
                }
                return slotReader.N(i10);
            }
            int iE = slotReader.E(i10) + i10;
            int iE1 = 0;
            for (int iE2 = i10 + 1; iE2 < iE; iE2 += slotReader.E(iE2)) {
                boolean zJ = slotReader.J(iE2);
                if (zJ) {
                    c1556m.changeListWriter.i();
                    c1556m.changeListWriter.w(slotReader.L(iE2));
                }
                iE1 += e1(c1556m, iE2, zJ || z10, zJ ? 0 : i11 + iE1);
                if (zJ) {
                    c1556m.changeListWriter.i();
                    c1556m.changeListWriter.A();
                }
            }
            if (slotReader.J(i10)) {
                return 1;
            }
            return iE1;
        }
        int iC = slotReader.C(i10);
        Object objD = slotReader.D(i10);
        if (iC != 126665345 || !(objD instanceof C1549i0)) {
            if (iC != 206 || !C3862t.b(objD, C1560o.F())) {
                if (slotReader.J(i10)) {
                    return 1;
                }
                return slotReader.N(i10);
            }
            Object objB = slotReader.B(i10, 0);
            a aVar = objB instanceof a ? (a) objB : null;
            if (aVar != null) {
                for (C1556m c1556m2 : aVar.getRef().v()) {
                    c1556m2.c1();
                    c1556m.parentContext.q(c1556m2.getComposition());
                }
            }
            return slotReader.N(i10);
        }
        C1549i0 c1549i0 = (C1549i0) objD;
        Object objB2 = slotReader.B(i10, 0);
        C1536d c1536dA = slotReader.a(i10);
        List listW = C1560o.w(c1556m.invalidations, i10, slotReader.E(i10) + i10);
        ArrayList arrayList = new ArrayList(listW.size());
        int size = listW.size();
        for (int i12 = 0; i12 < size; i12++) {
            C1524X c1524x = (C1524X) listW.get(i12);
            arrayList.add(v.a(c1524x.getScope(), c1524x.getInstances()));
        }
        C1553k0 c1553k0 = new C1553k0(c1549i0, objB2, c1556m.getComposition(), c1556m.slotTable, c1536dA, arrayList, c1556m.n0(i10));
        c1556m.parentContext.b(c1553k0);
        c1556m.changeListWriter.L();
        c1556m.changeListWriter.N(c1556m.getComposition(), c1556m.parentContext, c1553k0);
        if (!z10) {
            return slotReader.N(i10);
        }
        c1556m.changeListWriter.j(i11, i10);
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void f0() {
        /*
            r4 = this;
            boolean r0 = r4.getInserting()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl"
            if (r0 == 0) goto L24
            O.J0 r0 = new O.J0
            O.E r2 = r4.getComposition()
            kotlin.jvm.internal.C3862t.e(r2, r1)
            O.s r2 = (kotlin.C1568s) r2
            r0.<init>(r2)
            O.w1<O.J0> r1 = r4.invalidateStack
            r1.h(r0)
            r4.v1(r0)
            int r1 = r4.compositionToken
            r0.I(r1)
            goto L77
        L24:
            java.util.List<O.X> r0 = r4.invalidations
            O.Y0 r2 = r4.reader
            int r2 = r2.getParent()
            O.X r0 = kotlin.C1560o.m(r0, r2)
            O.Y0 r2 = r4.reader
            java.lang.Object r2 = r2.K()
            O.l$a r3 = kotlin.InterfaceC1554l.INSTANCE
            java.lang.Object r3 = r3.a()
            boolean r3 = kotlin.jvm.internal.C3862t.b(r2, r3)
            if (r3 == 0) goto L54
            O.J0 r2 = new O.J0
            O.E r3 = r4.getComposition()
            kotlin.jvm.internal.C3862t.e(r3, r1)
            O.s r3 = (kotlin.C1568s) r3
            r2.<init>(r3)
            r4.v1(r2)
            goto L5b
        L54:
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            kotlin.jvm.internal.C3862t.e(r2, r1)
            O.J0 r2 = (kotlin.C1507J0) r2
        L5b:
            if (r0 != 0) goto L69
            boolean r0 = r2.m()
            r1 = 0
            if (r0 == 0) goto L67
            r2.D(r1)
        L67:
            if (r0 == 0) goto L6a
        L69:
            r1 = 1
        L6a:
            r2.E(r1)
            O.w1<O.J0> r0 = r4.invalidateStack
            r0.h(r2)
            int r0 = r4.compositionToken
            r2.I(r0)
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1556m.f0():void");
    }

    private final void h0() {
        this.pending = null;
        this.nodeIndex = 0;
        this.groupNodeCount = 0;
        this.compoundKeyHash = 0;
        this.nodeExpected = false;
        this.changeListWriter.S();
        this.invalidateStack.a();
        i0();
    }

    private final void h1() {
        this.groupNodeCount += this.reader.S();
    }

    private final void i0() {
        this.nodeCountOverrides = null;
        this.nodeCountVirtualOverrides = null;
    }

    private final void i1() {
        this.groupNodeCount = this.reader.v();
        this.reader.T();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void j1(int r14, java.lang.Object r15, int r16, java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1556m.j1(int, java.lang.Object, int, java.lang.Object):void");
    }

    private final int k0(int group, int rGroupIndex, int recomposeGroup, int recomposeKey) {
        if (group == recomposeGroup) {
            return recomposeKey;
        }
        int iH0 = H0(this.reader, group);
        if (iH0 == 126665345) {
            return iH0;
        }
        int iP = this.reader.P(group);
        if (iP != recomposeGroup) {
            recomposeKey = k0(iP, S0(iP), recomposeGroup, recomposeKey);
        }
        if (this.reader.G(group)) {
            rGroupIndex = 0;
        }
        return Integer.rotateLeft(Integer.rotateLeft(recomposeKey, 3) ^ iH0, 3) ^ rGroupIndex;
    }

    private final void k1(int key) {
        j1(key, null, C1520T.INSTANCE.a(), null);
    }

    private final void l0() {
        C1560o.Q(this.writer.getClosed());
        A0();
    }

    private final void l1(int key, Object dataKey) {
        j1(key, dataKey, C1520T.INSTANCE.a(), null);
    }

    private final InterfaceC1583z0 m0() {
        InterfaceC1583z0 interfaceC1583z0 = this.providerCache;
        return interfaceC1583z0 != null ? interfaceC1583z0 : n0(this.reader.getParent());
    }

    private final void m1(boolean isNode, Object data) {
        if (isNode) {
            this.reader.V();
            return;
        }
        if (data != null && this.reader.l() != data) {
            this.changeListWriter.Z(data);
        }
        this.reader.U();
    }

    private final InterfaceC1583z0 n0(int group) {
        InterfaceC1583z0 interfaceC1583z0A;
        if (getInserting() && this.writerHasAProvider) {
            int parent = this.writer.getParent();
            while (parent > 0) {
                if (this.writer.k0(parent) == 202 && C3862t.b(this.writer.l0(parent), C1560o.A())) {
                    Object objI0 = this.writer.i0(parent);
                    C3862t.e(objI0, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    InterfaceC1583z0 interfaceC1583z0 = (InterfaceC1583z0) objI0;
                    this.providerCache = interfaceC1583z0;
                    return interfaceC1583z0;
                }
                parent = this.writer.H0(parent);
            }
        }
        if (this.reader.getGroupsSize() > 0) {
            while (group > 0) {
                if (this.reader.C(group) == 202 && C3862t.b(this.reader.D(group), C1560o.A())) {
                    Q.a<InterfaceC1583z0> aVar = this.providerUpdates;
                    if (aVar == null || (interfaceC1583z0A = aVar.a(group)) == null) {
                        Object objZ = this.reader.z(group);
                        C3862t.e(objZ, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        interfaceC1583z0A = (InterfaceC1583z0) objZ;
                    }
                    this.providerCache = interfaceC1583z0A;
                    return interfaceC1583z0A;
                }
                group = this.reader.P(group);
            }
        }
        InterfaceC1583z0 interfaceC1583z02 = this.parentProvider;
        this.providerCache = interfaceC1583z02;
        return interfaceC1583z02;
    }

    private final void o1() {
        this.rGroupIndex = 0;
        this.reader = this.slotTable.K();
        k1(100);
        this.parentContext.r();
        this.parentProvider = this.parentContext.g();
        this.providersInvalidStack.j(C1560o.p(this.providersInvalid));
        this.providersInvalid = R(this.parentProvider);
        this.providerCache = null;
        if (!this.forceRecomposeScopes) {
            this.forceRecomposeScopes = this.parentContext.getCollectingParameterInformation();
        }
        if (!this.sourceMarkersEnabled) {
            this.sourceMarkersEnabled = this.parentContext.getCollectingSourceInformation();
        }
        Set<InterfaceC1879a> set = (Set) C1580y.b(this.parentProvider, C1882d.a());
        if (set != null) {
            set.add(this.slotTable);
            this.parentContext.o(set);
        }
        k1(this.parentContext.getCompoundHashKey());
    }

    private final void q0(Q.f<C1507J0, Object> invalidationsRequested, p<? super InterfaceC1554l, ? super Integer, C4153F> content) {
        long[] jArr;
        int i10;
        long[] jArr2;
        int i11;
        if (this.isComposing) {
            C1560o.s("Reentrant composition is not supported");
        }
        Object objA = B1.f12598a.a("Compose:recompose");
        try {
            this.compositionToken = j.H().getId();
            this.providerUpdates = null;
            C4388J<Object, Object> c4388jD = invalidationsRequested.d();
            Object[] objArr = c4388jD.keys;
            Object[] objArr2 = c4388jD.values;
            long[] jArr3 = c4388jD.metadata;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i12 = 0;
                while (true) {
                    long j10 = jArr3[i12];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i13 = 8;
                        int i14 = 8 - ((~(i12 - length)) >>> 31);
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j10 & 255) < 128) {
                                int i16 = (i12 << 3) + i15;
                                Object obj = objArr[i16];
                                Object obj2 = objArr2[i16];
                                C3862t.e(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                                C1536d anchor = ((C1507J0) obj).getAnchor();
                                if (anchor != null) {
                                    int location = anchor.getLocation();
                                    List<C1524X> list = this.invalidations;
                                    C1507J0 c1507j0 = (C1507J0) obj;
                                    jArr2 = jArr3;
                                    if (obj2 == V0.f12756a) {
                                        obj2 = null;
                                    }
                                    list.add(new C1524X(c1507j0, location, obj2));
                                } else {
                                    jArr2 = jArr3;
                                }
                                i11 = 8;
                            } else {
                                jArr2 = jArr3;
                                i11 = i13;
                            }
                            j10 >>= i11;
                            i15++;
                            i13 = i11;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        i10 = 1;
                        if (i14 != i13) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i10 = 1;
                    }
                    if (i12 == length) {
                        break;
                    }
                    i12 += i10;
                    jArr3 = jArr;
                }
            }
            r.C(this.invalidations, C1560o.f12955g);
            this.nodeIndex = 0;
            this.isComposing = true;
            try {
                o1();
                Object objN0 = N0();
                if (objN0 != content && content != null) {
                    v1(content);
                }
                c cVar = this.derivedStateObserver;
                Q.b<InterfaceC1504I> bVarC = m1.c();
                try {
                    bVarC.c(cVar);
                    if (content != null) {
                        l1(200, C1560o.B());
                        C1533c.d(this, content);
                        t0();
                    } else if ((!this.forciblyRecompose && !this.providersInvalid) || objN0 == null || C3862t.b(objN0, InterfaceC1554l.INSTANCE.a())) {
                        g1();
                    } else {
                        l1(200, C1560o.B());
                        C1533c.d(this, (p) W.f(objN0, 2));
                        t0();
                    }
                    bVarC.E(bVarC.getSize() - 1);
                    v0();
                    this.isComposing = false;
                    this.invalidations.clear();
                    l0();
                    C4153F c4153f = C4153F.f46609a;
                    B1.f12598a.b(objA);
                } finally {
                    bVarC.E(bVarC.getSize() - 1);
                }
            } catch (Throwable th) {
                this.isComposing = false;
                this.invalidations.clear();
                U();
                l0();
                throw th;
            }
        } catch (Throwable th2) {
            B1.f12598a.b(objA);
            throw th2;
        }
    }

    private final void r0(int group, int nearestCommonRoot) {
        if (group <= 0 || group == nearestCommonRoot) {
            return;
        }
        r0(this.reader.P(group), nearestCommonRoot);
        if (this.reader.J(group)) {
            this.changeListWriter.w(P0(this.reader, group));
        }
    }

    private final void r1(int group, int count) {
        if (w1(group) != count) {
            if (group < 0) {
                C4415z c4415z = this.nodeCountVirtualOverrides;
                if (c4415z == null) {
                    c4415z = new C4415z(0, 1, null);
                    this.nodeCountVirtualOverrides = c4415z;
                }
                c4415z.q(group, count);
                return;
            }
            int[] iArr = this.nodeCountOverrides;
            if (iArr == null) {
                iArr = new int[this.reader.getGroupsSize()];
                C3831l.v(iArr, -1, 0, 0, 6, null);
                this.nodeCountOverrides = iArr;
            }
            iArr[group] = count;
        }
    }

    private final void s0(boolean isNode) {
        int iHashCode;
        Set set;
        List<C1528a0> list;
        int iHashCode2;
        int iG = this.parentStateStack.g() - 1;
        if (getInserting()) {
            int parent = this.writer.getParent();
            int iK0 = this.writer.k0(parent);
            Object objL0 = this.writer.l0(parent);
            Object objI0 = this.writer.i0(parent);
            if (objL0 != null) {
                iHashCode2 = Integer.hashCode(objL0 instanceof Enum ? ((Enum) objL0).ordinal() : objL0.hashCode()) ^ Integer.rotateRight(getCompoundKeyHash(), 3);
            } else if (objI0 == null || iK0 != 207 || C3862t.b(objI0, InterfaceC1554l.INSTANCE.a())) {
                iHashCode2 = Integer.rotateRight(iG ^ getCompoundKeyHash(), 3) ^ Integer.hashCode(iK0);
            } else {
                this.compoundKeyHash = Integer.rotateRight(Integer.rotateRight(iG ^ getCompoundKeyHash(), 3) ^ Integer.hashCode(objI0.hashCode()), 3);
            }
            this.compoundKeyHash = Integer.rotateRight(iHashCode2, 3);
        } else {
            int parent2 = this.reader.getParent();
            int iC = this.reader.C(parent2);
            Object objD = this.reader.D(parent2);
            Object objZ = this.reader.z(parent2);
            if (objD != null) {
                iHashCode = Integer.hashCode(objD instanceof Enum ? ((Enum) objD).ordinal() : objD.hashCode()) ^ Integer.rotateRight(getCompoundKeyHash(), 3);
            } else if (objZ == null || iC != 207 || C3862t.b(objZ, InterfaceC1554l.INSTANCE.a())) {
                iHashCode = Integer.rotateRight(iG ^ getCompoundKeyHash(), 3) ^ Integer.hashCode(iC);
            } else {
                this.compoundKeyHash = Integer.rotateRight(Integer.rotateRight(iG ^ getCompoundKeyHash(), 3) ^ Integer.hashCode(objZ.hashCode()), 3);
            }
            this.compoundKeyHash = Integer.rotateRight(iHashCode, 3);
        }
        int i10 = this.groupNodeCount;
        C1581y0 c1581y0 = this.pending;
        if (c1581y0 != null && c1581y0.b().size() > 0) {
            List<C1528a0> listB = c1581y0.b();
            List<C1528a0> listF = c1581y0.f();
            Set setE = Z.a.e(listF);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = listF.size();
            int size2 = listB.size();
            int i11 = 0;
            int i12 = 0;
            int iO = 0;
            while (i11 < size2) {
                C1528a0 c1528a0 = listB.get(i11);
                if (setE.contains(c1528a0)) {
                    set = setE;
                    if (!linkedHashSet.contains(c1528a0)) {
                        if (i12 < size) {
                            C1528a0 c1528a02 = listF.get(i12);
                            if (c1528a02 != c1528a0) {
                                int iG2 = c1581y0.g(c1528a02);
                                linkedHashSet.add(c1528a02);
                                if (iG2 != iO) {
                                    int iO2 = c1581y0.o(c1528a02);
                                    list = listF;
                                    this.changeListWriter.x(c1581y0.getStartIndex() + iG2, iO + c1581y0.getStartIndex(), iO2);
                                    c1581y0.j(iG2, iO, iO2);
                                } else {
                                    list = listF;
                                }
                            } else {
                                list = listF;
                                i11++;
                            }
                            i12++;
                            iO += c1581y0.o(c1528a02);
                            setE = set;
                            listF = list;
                        }
                    }
                    setE = set;
                } else {
                    this.changeListWriter.Q(c1581y0.g(c1528a0) + c1581y0.getStartIndex(), c1528a0.getNodes());
                    c1581y0.n(c1528a0.getLocation(), 0);
                    this.changeListWriter.y(c1528a0.getLocation());
                    this.reader.Q(c1528a0.getLocation());
                    X0();
                    this.reader.S();
                    set = setE;
                    C1560o.P(this.invalidations, c1528a0.getLocation(), c1528a0.getLocation() + this.reader.E(c1528a0.getLocation()));
                }
                i11++;
                setE = set;
            }
            this.changeListWriter.i();
            if (listB.size() > 0) {
                this.changeListWriter.y(this.reader.m());
                this.reader.T();
            }
        }
        int i13 = this.nodeIndex;
        while (!this.reader.H()) {
            int current = this.reader.getCurrent();
            X0();
            this.changeListWriter.Q(i13, this.reader.S());
            C1560o.P(this.invalidations, current, this.reader.getCurrent());
        }
        boolean inserting = getInserting();
        if (inserting) {
            if (isNode) {
                this.insertFixups.c();
                i10 = 1;
            }
            this.reader.f();
            int parent3 = this.writer.getParent();
            this.writer.T();
            if (!this.reader.t()) {
                int iK02 = K0(parent3);
                this.writer.U();
                this.writer.L(true);
                Y0(this.insertAnchor);
                this.inserting = false;
                if (!this.slotTable.isEmpty()) {
                    r1(iK02, 0);
                    s1(iK02, i10);
                }
            }
        } else {
            if (isNode) {
                this.changeListWriter.A();
            }
            int iW = this.reader.w();
            if (iW > 0) {
                this.changeListWriter.X(iW);
            }
            this.changeListWriter.g();
            int parent4 = this.reader.getParent();
            if (i10 != w1(parent4)) {
                s1(parent4, i10);
            }
            if (isNode) {
                i10 = 1;
            }
            this.reader.g();
            this.changeListWriter.i();
        }
        y0(i10, inserting);
    }

    private final void s1(int group, int newCount) {
        int iW1 = w1(group);
        if (iW1 != newCount) {
            int i10 = newCount - iW1;
            int iB = this.pendingStack.b() - 1;
            while (group != -1) {
                int iW12 = w1(group) + i10;
                r1(group, iW12);
                int i11 = iB;
                while (true) {
                    if (-1 < i11) {
                        C1581y0 c1581y0F = this.pendingStack.f(i11);
                        if (c1581y0F != null && c1581y0F.n(group, iW12)) {
                            iB = i11 - 1;
                            break;
                        }
                        i11--;
                    } else {
                        break;
                    }
                }
                if (group < 0) {
                    group = this.reader.getParent();
                } else if (this.reader.J(group)) {
                    return;
                } else {
                    group = this.reader.P(group);
                }
            }
        }
    }

    private final void t0() {
        s0(false);
    }

    private final InterfaceC1583z0 t1(InterfaceC1583z0 parentScope, InterfaceC1583z0 currentProviders) {
        InterfaceC1583z0.a aVarT = parentScope.t();
        aVarT.putAll(currentProviders);
        InterfaceC1583z0 interfaceC1583z0G = aVarT.g();
        l1(204, C1560o.E());
        u1(interfaceC1583z0G);
        u1(currentProviders);
        t0();
        return interfaceC1583z0G;
    }

    private final void u1(Object value) {
        N0();
        v1(value);
    }

    private final void v0() {
        t0();
        this.parentContext.c();
        t0();
        this.changeListWriter.k();
        z0();
        this.reader.d();
        this.forciblyRecompose = false;
        this.providersInvalid = C1560o.o(this.providersInvalidStack.i());
    }

    private final void w0() {
        if (this.writer.getClosed()) {
            SlotWriter slotWriterL = this.insertTable.L();
            this.writer = slotWriterL;
            slotWriterL.Z0();
            this.writerHasAProvider = false;
            this.providerCache = null;
        }
    }

    private final int w1(int group) {
        int i10;
        if (group >= 0) {
            int[] iArr = this.nodeCountOverrides;
            return (iArr == null || (i10 = iArr[group]) < 0) ? this.reader.N(group) : i10;
        }
        C4415z c4415z = this.nodeCountVirtualOverrides;
        if (c4415z == null || !c4415z.a(group)) {
            return 0;
        }
        return c4415z.c(group);
    }

    private final void x0(boolean isNode, C1581y0 newPending) {
        this.pendingStack.h(this.pending);
        this.pending = newPending;
        this.parentStateStack.j(this.groupNodeCount);
        this.parentStateStack.j(this.rGroupIndex);
        this.parentStateStack.j(this.nodeIndex);
        if (isNode) {
            this.nodeIndex = 0;
        }
        this.groupNodeCount = 0;
        this.rGroupIndex = 0;
    }

    private final void x1() {
        if (!this.nodeExpected) {
            C1560o.s("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.nodeExpected = false;
    }

    private final void y0(int expectedNodeCount, boolean inserting) {
        C1581y0 c1581y0G = this.pendingStack.g();
        if (c1581y0G != null && !inserting) {
            c1581y0G.l(c1581y0G.getGroupIndex() + 1);
        }
        this.pending = c1581y0G;
        this.nodeIndex = this.parentStateStack.i() + expectedNodeCount;
        this.rGroupIndex = this.parentStateStack.i();
        this.groupNodeCount = this.parentStateStack.i() + expectedNodeCount;
    }

    private final void y1() {
        if (this.nodeExpected) {
            C1560o.s("A call to createNode(), emitNode() or useNode() expected");
        }
    }

    private final void z0() {
        this.changeListWriter.n();
        if (!this.pendingStack.c()) {
            C1560o.s("Start/end imbalance");
        }
        h0();
    }

    @Override // kotlin.InterfaceC1554l
    public void A() {
        j1(125, null, C1520T.INSTANCE.b(), null);
        this.nodeExpected = true;
    }

    @Override // kotlin.InterfaceC1554l
    public void B(InterfaceC1505I0 scope) {
        C1507J0 c1507j0 = scope instanceof C1507J0 ? (C1507J0) scope : null;
        if (c1507j0 == null) {
            return;
        }
        c1507j0.H(true);
    }

    public final boolean B0() {
        return this.childrenComposing > 0;
    }

    @Override // kotlin.InterfaceC1554l
    public void C() {
        if (!(this.groupNodeCount == 0)) {
            C1560o.s("No nodes can be emitted before calling skipAndEndGroup");
        }
        C1507J0 c1507j0D0 = D0();
        if (c1507j0D0 != null) {
            c1507j0D0.z();
        }
        if (this.invalidations.isEmpty()) {
            i1();
        } else {
            W0();
        }
    }

    /* renamed from: C0, reason: from getter */
    public InterfaceC1496E getComposition() {
        return this.composition;
    }

    @Override // kotlin.InterfaceC1554l
    public g D() {
        return this.parentContext.getEffectCoroutineContext();
    }

    public final C1507J0 D0() {
        w1<C1507J0> w1Var = this.invalidateStack;
        if (this.childrenComposing == 0 && w1Var.d()) {
            return w1Var.e();
        }
        return null;
    }

    @Override // kotlin.InterfaceC1554l
    public void E() {
        t0();
        t0();
        this.providersInvalid = C1560o.o(this.providersInvalidStack.i());
        this.providerCache = null;
    }

    /* renamed from: E0, reason: from getter */
    public final P.a getDeferredChanges() {
        return this.deferredChanges;
    }

    @Override // kotlin.InterfaceC1554l
    public InterfaceC1578x F() {
        return m0();
    }

    @Override // kotlin.InterfaceC1554l
    public boolean G() {
        if (!u() || this.providersInvalid) {
            return true;
        }
        C1507J0 c1507j0D0 = D0();
        return c1507j0D0 != null && c1507j0D0.l();
    }

    /* renamed from: G0, reason: from getter */
    public final SlotReader getReader() {
        return this.reader;
    }

    @Override // kotlin.InterfaceC1554l
    public void H() {
        x1();
        if (getInserting()) {
            C1560o.s("useNode() called while inserting");
        }
        Object objF0 = F0(this.reader);
        this.changeListWriter.w(objF0);
        if (this.reusing && (objF0 instanceof InterfaceC1552k)) {
            this.changeListWriter.c0(objF0);
        }
    }

    @Override // kotlin.InterfaceC1554l
    public void I() {
        t0();
    }

    @Override // kotlin.InterfaceC1554l
    public void J(Object value) {
        q1(value);
    }

    public void J0(List<C4170o<C1553k0, C1553k0>> references) {
        try {
            I0(references);
            h0();
        } catch (Throwable th) {
            U();
            throw th;
        }
    }

    @Override // kotlin.InterfaceC1554l
    /* renamed from: K, reason: from getter */
    public int getCompoundKeyHash() {
        return this.compoundKeyHash;
    }

    @Override // kotlin.InterfaceC1554l
    public AbstractC1564q L() {
        l1(206, C1560o.F());
        if (getInserting()) {
            SlotWriter.v0(this.writer, 0, 1, null);
        }
        Object objN0 = N0();
        a aVar = objN0 instanceof a ? (a) objN0 : null;
        if (aVar == null) {
            int compoundKeyHash = getCompoundKeyHash();
            boolean z10 = this.forceRecomposeScopes;
            boolean z11 = this.sourceMarkersEnabled;
            InterfaceC1496E composition = getComposition();
            C1568s c1568s = composition instanceof C1568s ? (C1568s) composition : null;
            aVar = new a(new b(compoundKeyHash, z10, z11, c1568s != null ? c1568s.getObserverHolder() : null));
            v1(aVar);
        }
        aVar.getRef().y(m0());
        t0();
        return aVar.getRef();
    }

    @Override // kotlin.InterfaceC1554l
    public void M() {
        t0();
    }

    /* renamed from: M0, reason: from getter */
    public final boolean getIsComposing() {
        return this.isComposing;
    }

    @Override // kotlin.InterfaceC1554l
    public void N() {
        t0();
        t0();
        this.providersInvalid = C1560o.o(this.providersInvalidStack.i());
        this.providerCache = null;
    }

    public final Object N0() {
        if (getInserting()) {
            y1();
            return InterfaceC1554l.INSTANCE.a();
        }
        Object objK = this.reader.K();
        return (!this.reusing || (objK instanceof U0)) ? objK : InterfaceC1554l.INSTANCE.a();
    }

    @Override // kotlin.InterfaceC1554l
    public void O() {
        t0();
    }

    public final Object O0() {
        if (getInserting()) {
            y1();
            return InterfaceC1554l.INSTANCE.a();
        }
        Object objK = this.reader.K();
        return (!this.reusing || (objK instanceof U0)) ? objK instanceof S0 ? ((S0) objK).getWrapped() : objK : InterfaceC1554l.INSTANCE.a();
    }

    @Override // kotlin.InterfaceC1554l
    public void P() {
        s0(true);
    }

    @Override // kotlin.InterfaceC1554l
    public void Q() {
        t0();
        C1507J0 c1507j0D0 = D0();
        if (c1507j0D0 == null || !c1507j0D0.q()) {
            return;
        }
        c1507j0D0.B(true);
    }

    @Override // kotlin.InterfaceC1554l
    public boolean R(Object value) {
        if (C3862t.b(N0(), value)) {
            return false;
        }
        v1(value);
        return true;
    }

    public final void R0(Ba.a<C4153F> block) {
        if (this.isComposing) {
            C1560o.s("Preparing a composition while composing is not supported");
        }
        this.isComposing = true;
        try {
            block.invoke();
        } finally {
            this.isComposing = false;
        }
    }

    @Override // kotlin.InterfaceC1554l
    public void S(int key) {
        if (this.pending != null) {
            j1(key, null, C1520T.INSTANCE.a(), null);
            return;
        }
        y1();
        this.compoundKeyHash = this.rGroupIndex ^ Integer.rotateLeft(Integer.rotateLeft(getCompoundKeyHash(), 3) ^ key, 3);
        this.rGroupIndex++;
        SlotReader slotReader = this.reader;
        if (getInserting()) {
            slotReader.c();
            this.writer.k1(key, InterfaceC1554l.INSTANCE.a());
            x0(false, null);
            return;
        }
        if (slotReader.n() == key && !slotReader.s()) {
            slotReader.U();
            x0(false, null);
            return;
        }
        if (!slotReader.H()) {
            int i10 = this.nodeIndex;
            int current = slotReader.getCurrent();
            X0();
            this.changeListWriter.Q(i10, slotReader.S());
            C1560o.P(this.invalidations, current, slotReader.getCurrent());
        }
        slotReader.c();
        this.inserting = true;
        this.providerCache = null;
        w0();
        SlotWriter slotWriter = this.writer;
        slotWriter.I();
        int currentGroup = slotWriter.getCurrentGroup();
        slotWriter.k1(key, InterfaceC1554l.INSTANCE.a());
        this.insertAnchor = slotWriter.E(currentGroup);
        x0(false, null);
    }

    @Override // kotlin.InterfaceC1554l
    public <T> void T(Ba.a<? extends T> factory) {
        x1();
        if (!getInserting()) {
            C1560o.s("createNode() can only be called when inserting");
        }
        int iE = this.parentStateStack.e();
        SlotWriter slotWriter = this.writer;
        C1536d c1536dE = slotWriter.E(slotWriter.getParent());
        this.groupNodeCount++;
        this.insertFixups.b(factory, iE, c1536dE);
    }

    public final boolean T0(Q.f<C1507J0, Object> invalidationsRequested) {
        if (!this.changes.c()) {
            C1560o.s("Expected applyChanges() to have been called");
        }
        if (invalidationsRequested.e() <= 0 && this.invalidations.isEmpty() && !this.forciblyRecompose) {
            return false;
        }
        q0(invalidationsRequested, null);
        return this.changes.d();
    }

    @Override // kotlin.InterfaceC1554l
    public void a() {
        this.forceRecomposeScopes = true;
        this.sourceMarkersEnabled = true;
        this.slotTable.x();
        this.insertTable.x();
        this.writer.y1();
    }

    @Override // kotlin.InterfaceC1554l
    public InterfaceC1505I0 b() {
        return D0();
    }

    @Override // kotlin.InterfaceC1554l
    public boolean c(boolean value) {
        Object objN0 = N0();
        if ((objN0 instanceof Boolean) && value == ((Boolean) objN0).booleanValue()) {
            return false;
        }
        v1(Boolean.valueOf(value));
        return true;
    }

    @Override // kotlin.InterfaceC1554l
    public void d() {
        if (this.reusing && this.reader.getParent() == this.reusingGroup) {
            this.reusingGroup = -1;
            this.reusing = false;
        }
        s0(false);
    }

    @Override // kotlin.InterfaceC1554l
    public void e(int key) {
        j1(key, null, C1520T.INSTANCE.a(), null);
    }

    @Override // kotlin.InterfaceC1554l
    public Object f() {
        return O0();
    }

    public final void f1(SlotReader slotReader) {
        this.reader = slotReader;
    }

    @Override // kotlin.InterfaceC1554l
    public boolean g(float value) {
        Object objN0 = N0();
        if ((objN0 instanceof Float) && value == ((Number) objN0).floatValue()) {
            return false;
        }
        v1(Float.valueOf(value));
        return true;
    }

    public final void g0() {
        this.providerUpdates = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g1() {
        /*
            r9 = this;
            java.util.List<O.X> r0 = r9.invalidations
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            r9.h1()
            goto Le1
        Ld:
            O.Y0 r0 = r9.reader
            int r1 = r0.n()
            java.lang.Object r2 = r0.o()
            java.lang.Object r3 = r0.l()
            int r4 = r9.rGroupIndex
            r5 = 207(0xcf, float:2.9E-43)
            r6 = 3
            if (r2 != 0) goto L58
            if (r3 == 0) goto L47
            if (r1 != r5) goto L47
            O.l$a r7 = kotlin.InterfaceC1554l.INSTANCE
            java.lang.Object r7 = r7.a()
            boolean r7 = kotlin.jvm.internal.C3862t.b(r3, r7)
            if (r7 != 0) goto L47
            int r7 = r3.hashCode()
            int r8 = r9.getCompoundKeyHash()
            int r8 = java.lang.Integer.rotateLeft(r8, r6)
            r7 = r7 ^ r8
            int r7 = java.lang.Integer.rotateLeft(r7, r6)
            r7 = r7 ^ r4
            r9.compoundKeyHash = r7
            goto L76
        L47:
            int r7 = r9.getCompoundKeyHash()
            int r7 = java.lang.Integer.rotateLeft(r7, r6)
            r7 = r7 ^ r1
            int r7 = java.lang.Integer.rotateLeft(r7, r6)
            r7 = r7 ^ r4
        L55:
            r9.compoundKeyHash = r7
            goto L76
        L58:
            boolean r7 = r2 instanceof java.lang.Enum
            if (r7 == 0) goto L71
            r7 = r2
            java.lang.Enum r7 = (java.lang.Enum) r7
            int r7 = r7.ordinal()
        L63:
            int r8 = r9.getCompoundKeyHash()
            int r8 = java.lang.Integer.rotateLeft(r8, r6)
            r7 = r7 ^ r8
            int r7 = java.lang.Integer.rotateLeft(r7, r6)
            goto L55
        L71:
            int r7 = r2.hashCode()
            goto L63
        L76:
            boolean r7 = r0.I()
            r8 = 0
            r9.m1(r7, r8)
            r9.W0()
            r0.g()
            if (r2 != 0) goto Lc4
            if (r3 == 0) goto Laf
            if (r1 != r5) goto Laf
            O.l$a r0 = kotlin.InterfaceC1554l.INSTANCE
            java.lang.Object r0 = r0.a()
            boolean r0 = kotlin.jvm.internal.C3862t.b(r3, r0)
            if (r0 != 0) goto Laf
            int r0 = r3.hashCode()
            int r1 = r9.getCompoundKeyHash()
            r1 = r1 ^ r4
            int r1 = java.lang.Integer.rotateRight(r1, r6)
            int r0 = java.lang.Integer.hashCode(r0)
            r0 = r0 ^ r1
            int r0 = java.lang.Integer.rotateRight(r0, r6)
            r9.compoundKeyHash = r0
            goto Le1
        Laf:
            int r0 = r9.getCompoundKeyHash()
            r0 = r0 ^ r4
            int r0 = java.lang.Integer.rotateRight(r0, r6)
            int r1 = java.lang.Integer.hashCode(r1)
            r0 = r0 ^ r1
        Lbd:
            int r0 = java.lang.Integer.rotateRight(r0, r6)
            r9.compoundKeyHash = r0
            goto Le1
        Lc4:
            boolean r0 = r2 instanceof java.lang.Enum
            if (r0 == 0) goto Ldc
            java.lang.Enum r2 = (java.lang.Enum) r2
            int r0 = r2.ordinal()
        Lce:
            int r1 = r9.getCompoundKeyHash()
            int r1 = java.lang.Integer.rotateRight(r1, r6)
            int r0 = java.lang.Integer.hashCode(r0)
            r0 = r0 ^ r1
            goto Lbd
        Ldc:
            int r0 = r2.hashCode()
            goto Lce
        Le1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1556m.g1():void");
    }

    @Override // kotlin.InterfaceC1554l
    public boolean h(int value) {
        Object objN0 = N0();
        if ((objN0 instanceof Integer) && value == ((Number) objN0).intValue()) {
            return false;
        }
        v1(Integer.valueOf(value));
        return true;
    }

    @Override // kotlin.InterfaceC1554l
    public boolean i(long value) {
        Object objN0 = N0();
        if ((objN0 instanceof Long) && value == ((Number) objN0).longValue()) {
            return false;
        }
        v1(Long.valueOf(value));
        return true;
    }

    @Override // kotlin.InterfaceC1554l
    public InterfaceC1879a j() {
        return this.slotTable;
    }

    public final void j0(Q.f<C1507J0, Object> invalidationsRequested, p<? super InterfaceC1554l, ? super Integer, C4153F> content) {
        if (!this.changes.c()) {
            C1560o.s("Expected applyChanges() to have been called");
        }
        q0(invalidationsRequested, content);
    }

    @Override // kotlin.InterfaceC1554l
    public <V, T> void k(V value, p<? super T, ? super V, C4153F> block) {
        if (getInserting()) {
            this.insertFixups.f(value, block);
        } else {
            this.changeListWriter.a0(value, block);
        }
    }

    @Override // kotlin.InterfaceC1554l
    public boolean l(Object value) {
        if (N0() == value) {
            return false;
        }
        v1(value);
        return true;
    }

    @Override // kotlin.InterfaceC1554l
    public void m(C1503H0<?> value) {
        D1<?> d12;
        InterfaceC1583z0 interfaceC1583z0M0 = m0();
        l1(201, C1560o.D());
        Object objF = f();
        if (C3862t.b(objF, InterfaceC1554l.INSTANCE.a())) {
            d12 = null;
        } else {
            C3862t.e(objF, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            d12 = (D1) objF;
        }
        AbstractC1572u<?> abstractC1572uB = value.b();
        C3862t.e(abstractC1572uB, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        C3862t.e(value, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
        D1<?> d1B = abstractC1572uB.b(value, d12);
        boolean zB = C3862t.b(d1B, d12);
        if (!zB) {
            J(d1B);
        }
        boolean z10 = true;
        boolean z11 = false;
        if (getInserting()) {
            if (value.getCanOverride() || !C1580y.a(interfaceC1583z0M0, abstractC1572uB)) {
                interfaceC1583z0M0 = interfaceC1583z0M0.v(abstractC1572uB, d1B);
            }
            this.writerHasAProvider = true;
        } else {
            SlotReader slotReader = this.reader;
            Object objZ = slotReader.z(slotReader.getCurrent());
            C3862t.e(objZ, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            InterfaceC1583z0 interfaceC1583z0 = (InterfaceC1583z0) objZ;
            interfaceC1583z0M0 = (!(u() && zB) && (value.getCanOverride() || !C1580y.a(interfaceC1583z0M0, abstractC1572uB))) ? interfaceC1583z0M0.v(abstractC1572uB, d1B) : interfaceC1583z0;
            if (!this.reusing && interfaceC1583z0 == interfaceC1583z0M0) {
                z10 = false;
            }
            z11 = z10;
        }
        if (z11 && !getInserting()) {
            Z0(interfaceC1583z0M0);
        }
        this.providersInvalidStack.j(C1560o.p(this.providersInvalid));
        this.providersInvalid = z11;
        this.providerCache = interfaceC1583z0M0;
        j1(202, C1560o.A(), C1520T.INSTANCE.a(), interfaceC1583z0M0);
    }

    @Override // kotlin.InterfaceC1554l
    /* renamed from: n, reason: from getter */
    public boolean getInserting() {
        return this.inserting;
    }

    public final void n1() {
        this.reusingGroup = 100;
        this.reusing = true;
    }

    @Override // kotlin.InterfaceC1554l
    public <T> T o(AbstractC1572u<T> key) {
        return (T) C1580y.b(m0(), key);
    }

    public final void o0() {
        this.invalidateStack.a();
        this.invalidations.clear();
        this.changes.a();
        this.providerUpdates = null;
    }

    @Override // kotlin.InterfaceC1554l
    public void p(boolean changed) {
        if (!(this.groupNodeCount == 0)) {
            C1560o.s("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (getInserting()) {
            return;
        }
        if (!changed) {
            i1();
            return;
        }
        int current = this.reader.getCurrent();
        int end = this.reader.getEnd();
        this.changeListWriter.d();
        C1560o.P(this.invalidations, current, end);
        this.reader.T();
    }

    public final void p0() {
        B1 b12 = B1.f12598a;
        Object objA = b12.a("Compose:Composer.dispose");
        try {
            this.parentContext.s(this);
            o0();
            w().clear();
            this.isDisposed = true;
            C4153F c4153f = C4153F.f46609a;
            b12.b(objA);
        } catch (Throwable th) {
            B1.f12598a.b(objA);
            throw th;
        }
    }

    public final boolean p1(C1507J0 scope, Object instance) {
        C1536d anchor = scope.getAnchor();
        if (anchor == null) {
            return false;
        }
        int iD = anchor.d(this.reader.getTable());
        if (!this.isComposing || iD < this.reader.getCurrent()) {
            return false;
        }
        C1560o.G(this.invalidations, iD, scope, instance);
        return true;
    }

    @Override // kotlin.InterfaceC1554l
    public void q() {
        j1(-127, null, C1520T.INSTANCE.a(), null);
    }

    public final void q1(Object value) {
        if (value instanceof R0) {
            if (getInserting()) {
                this.changeListWriter.O((R0) value);
            }
            this.abandonSet.add(value);
            value = new S0((R0) value, b1());
        }
        v1(value);
    }

    @Override // kotlin.InterfaceC1554l
    public InterfaceC1554l r(int key) {
        S(key);
        f0();
        return this;
    }

    @Override // kotlin.InterfaceC1554l
    public void s(int key, Object dataKey) {
        j1(key, dataKey, C1520T.INSTANCE.a(), null);
    }

    @Override // kotlin.InterfaceC1554l
    public void t() {
        j1(125, null, C1520T.INSTANCE.c(), null);
        this.nodeExpected = true;
    }

    @Override // kotlin.InterfaceC1554l
    public boolean u() {
        C1507J0 c1507j0D0;
        return (getInserting() || this.reusing || this.providersInvalid || (c1507j0D0 = D0()) == null || c1507j0D0.n() || this.forciblyRecompose) ? false : true;
    }

    public final void u0() {
        if (!(!this.isComposing && this.reusingGroup == 100)) {
            C1489A0.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.reusingGroup = -1;
        this.reusing = false;
    }

    @Override // kotlin.InterfaceC1554l
    public void v(Ba.a<C4153F> effect) {
        this.changeListWriter.V(effect);
    }

    public final void v1(Object value) {
        if (getInserting()) {
            this.writer.p1(value);
            return;
        }
        if (!this.reader.getHadNext()) {
            P.b bVar = this.changeListWriter;
            SlotReader slotReader = this.reader;
            bVar.a(slotReader.a(slotReader.getParent()), value);
            return;
        }
        int iQ = this.reader.q() - 1;
        if (!this.changeListWriter.q()) {
            this.changeListWriter.b0(value, iQ);
            return;
        }
        P.b bVar2 = this.changeListWriter;
        SlotReader slotReader2 = this.reader;
        bVar2.Y(value, slotReader2.a(slotReader2.getParent()), iQ);
    }

    @Override // kotlin.InterfaceC1554l
    public InterfaceC1542f<?> w() {
        return this.applier;
    }

    @Override // kotlin.InterfaceC1554l
    public void x(int key, Object dataKey) {
        if (!getInserting() && this.reader.n() == key && !C3862t.b(this.reader.l(), dataKey) && this.reusingGroup < 0) {
            this.reusingGroup = this.reader.getCurrent();
            this.reusing = true;
        }
        j1(key, null, C1520T.INSTANCE.a(), dataKey);
    }

    @Override // kotlin.InterfaceC1554l
    public W0 y() {
        C1536d c1536dA;
        l<InterfaceC1562p, C4153F> lVarH;
        C1507J0 c1507j0 = null;
        C1507J0 c1507j0G = this.invalidateStack.d() ? this.invalidateStack.g() : null;
        if (c1507j0G != null) {
            c1507j0G.E(false);
        }
        if (c1507j0G != null && (lVarH = c1507j0G.h(this.compositionToken)) != null) {
            this.changeListWriter.f(lVarH, getComposition());
        }
        if (c1507j0G != null && !c1507j0G.p() && (c1507j0G.q() || this.forceRecomposeScopes)) {
            if (c1507j0G.getAnchor() == null) {
                if (getInserting()) {
                    SlotWriter slotWriter = this.writer;
                    c1536dA = slotWriter.E(slotWriter.getParent());
                } else {
                    SlotReader slotReader = this.reader;
                    c1536dA = slotReader.a(slotReader.getParent());
                }
                c1507j0G.A(c1536dA);
            }
            c1507j0G.C(false);
            c1507j0 = c1507j0G;
        }
        s0(false);
        return c1507j0;
    }

    @Override // kotlin.InterfaceC1554l
    public void z(C1503H0<?>[] values) {
        InterfaceC1583z0 interfaceC1583z0T1;
        InterfaceC1583z0 interfaceC1583z0M0 = m0();
        l1(201, C1560o.D());
        boolean z10 = true;
        boolean z11 = false;
        if (getInserting()) {
            interfaceC1583z0T1 = t1(interfaceC1583z0M0, C1580y.d(values, interfaceC1583z0M0, null, 4, null));
            this.writerHasAProvider = true;
        } else {
            Object objA = this.reader.A(0);
            C3862t.e(objA, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            InterfaceC1583z0 interfaceC1583z0 = (InterfaceC1583z0) objA;
            Object objA2 = this.reader.A(1);
            C3862t.e(objA2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            InterfaceC1583z0 interfaceC1583z02 = (InterfaceC1583z0) objA2;
            InterfaceC1583z0 interfaceC1583z0C = C1580y.c(values, interfaceC1583z0M0, interfaceC1583z02);
            if (u() && !this.reusing && C3862t.b(interfaceC1583z02, interfaceC1583z0C)) {
                h1();
                interfaceC1583z0T1 = interfaceC1583z0;
            } else {
                interfaceC1583z0T1 = t1(interfaceC1583z0M0, interfaceC1583z0C);
                if (!this.reusing && C3862t.b(interfaceC1583z0T1, interfaceC1583z0)) {
                    z10 = false;
                }
                z11 = z10;
            }
        }
        if (z11 && !getInserting()) {
            Z0(interfaceC1583z0T1);
        }
        this.providersInvalidStack.j(C1560o.p(this.providersInvalid));
        this.providersInvalid = z11;
        this.providerCache = interfaceC1583z0T1;
        j1(202, C1560o.A(), C1520T.INSTANCE.a(), interfaceC1583z0T1);
    }

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tR\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LO/m$a;", "LO/U0;", "LO/m$b;", "LO/m;", "ref", "<init>", "(LO/m$b;)V", "Loa/F;", "d", "()V", "b", "c", "B", "LO/m$b;", "a", "()LO/m$b;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O.m$a */
    private static final class a implements U0 {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final b ref;

        public a(b bVar) {
            this.ref = bVar;
        }

        /* renamed from: a, reason: from getter */
        public final b getRef() {
            return this.ref;
        }

        @Override // kotlin.R0
        public void b() {
            this.ref.u();
        }

        @Override // kotlin.R0
        public void c() {
            this.ref.u();
        }

        @Override // kotlin.R0
        public void d() {
        }
    }
}
